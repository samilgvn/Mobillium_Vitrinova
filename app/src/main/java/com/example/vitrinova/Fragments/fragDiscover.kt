package com.example.vitrinova.Fragments


import android.os.Bundle
import android.os.Handler
import android.view.ContextThemeWrapper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.vitrinova.Adapters.*
import com.example.vitrinova.Animation.test
import com.example.vitrinova.Collections_Adp
import com.example.vitrinova.Models.mesajmodel
import com.example.vitrinova.Models.mesajmodel1
import com.example.vitrinova.R
import com.example.vitrinova.RestAPI.ManagerAll
import kotlinx.android.synthetic.main.fragment_frag_discover.*
import kotlinx.android.synthetic.main.fragment_frag_discover.view.*
import me.relex.circleindicator.CircleIndicator
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import android.content.Context
import android.graphics.Color
import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.util.Log
import android.view.animation.AnimationUtils
import android.widget.ImageView
import com.example.vitrinova.Models.Allitem
import com.example.vitrinova.Models.Categories.Categories
import com.example.vitrinova.Models.Collections.Collection
import com.example.vitrinova.Models.Editor.Editor
import com.example.vitrinova.Models.Featured.Featured
import com.example.vitrinova.Models.Products.Products
import com.example.vitrinova.Models.Shops.Shops
import com.squareup.picasso.Picasso
import java.time.LocalDate


class fragDiscover : Fragment() {

    private val imageURL = arrayOf("https://cdn.pixabay.com/photo/2017/08/30/01/05/milky-way-2695569_960_720.jpg",
        "https://images.pexels.com/photos/1020315/pexels-photo-1020315.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
        "https://cdn.pixabay.com/photo/2016/06/17/06/04/background-1462755_960_720.jpg")
    private  val Title= arrayOf("Resim 1","Resim 2","Resim 3")
    private  val Des= arrayOf("Background 1","Background 2","Background 3")

    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var layoutManager1: RecyclerView.LayoutManager
    lateinit var layoutManager2: RecyclerView.LayoutManager
    lateinit var layoutManager3: RecyclerView.LayoutManager
    lateinit var layoutManager4: RecyclerView.LayoutManager
    lateinit var rView_NewProduct:RecyclerView
    lateinit var rView_Categories:RecyclerView
    lateinit var rView_Collections:RecyclerView
    lateinit var rView_EditorShop:RecyclerView
    lateinit var rView_NewShops:RecyclerView
    lateinit var mesajModelList:List<mesajmodel>
    lateinit var mesajModelList1:List<mesajmodel1>
    lateinit var adp11:adapterbilgi
    lateinit var adp_NewProduct: NewProducts_Adp
    lateinit var adp_Categories:Catagories_Adp
    lateinit var adp_Collections:Collections_Adp
    lateinit var adp_EditorShops:EditorShops_Adp
    lateinit var adp_Newshops:NewShops_Adp
    lateinit var adp6:adapterbilgi


    lateinit var snapHelper4: SnapHelper
    var editorPos: Int = 0

    var allitem: Allitem? = null
    var list:List<Featured> = java.util.ArrayList()
    var list_products:List<Products> = java.util.ArrayList()
    var list_category:List<Categories> = java.util.ArrayList()
    var list_collection:List<Collection> = java.util.ArrayList()
    var list_editor:List<Shops>? = java.util.ArrayList()
    var list_Shops:List<Shops> = java.util.ArrayList()
    lateinit var swipeLayout:SwipeRefreshLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_frag_discover, container, false)

        var imageview = view.findViewById(R.id.imgEditorBack) as ImageView

        create(view)
        click(view)
        //listedoldur()
       // imageSlider(view)



        val matrix = ColorMatrix()
        matrix.setSaturation(0F)
        var filter = ColorMatrixColorFilter(matrix)
        imageview.setColorFilter(filter)






        var ll=view.findViewById(R.id.linear) as LinearLayout
         swipeLayout = view.findViewById(R.id.swipelayout) as SwipeRefreshLayout

        rView_EditorShop.addOnScrollListener(object: RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)

                if (newState == RecyclerView.SCROLL_STATE_IDLE){
                    val view1=snapHelper4?.findSnapView(layoutManager3)
                    editorPos = layoutManager3.getPosition(view1!!)
                }

                Picasso.get()
                    .load(list_editor!!.get(editorPos!!).cover?.url)
                    .noPlaceholder()
                    .into(imgEditorBack)
            }
        })
        swipeLayout.setOnRefreshListener(object: SwipeRefreshLayout.OnRefreshListener {
            override fun onRefresh() {
                ll.visibility=View.INVISIBLE
                istek()
                Handler().postDelayed(Runnable { swipelayout.setRefreshing(false)
                    ll.visibility=View.VISIBLE
                }, 2000)
              //  refreshRecyclerView()
            }
        })

        swipeLayout.setColorScheme(android.R.color.holo_blue_bright,
            android.R.color.holo_green_light,
            android.R.color.holo_orange_light,
            android.R.color.holo_red_light)


        snapHelper4 = LinearSnapHelper()
        snapHelper4.attachToRecyclerView(rView_EditorShop)
        val snapHelper5: SnapHelper = LinearSnapHelper()
        snapHelper5.attachToRecyclerView(rView_NewShops)


        istek()
        return view
    }

    fun istek() {

        val bilgiList = ManagerAll.instance.getirBilgileri()

        bilgiList.enqueue(object : Callback<List<Allitem>> {
            override fun onResponse(call: Call<List<Allitem>>, response: Response<List<Allitem>>) {
                if (response.isSuccessful) {

                    //animation_view.visibility=(View.INVISIBLE)



                    if(getActivity() != null && isAdded()){

                        animation_view.visibility=(View.INVISIBLE)
                        relativelayoutt.visibility=(View.VISIBLE)
                        rl.setBackgroundColor(Color.WHITE)

                        list_products = response.body().get(1).products!!
                        list_category = response.body().get(2).categori!!
                        list_collection = response.body().get(3).collection!!
                        list_editor = response.body().get(4).editor
                        list_Shops=  response.body().get(5).editor!!

                        adp_EditorShops = EditorShops_Adp(requireActivity(), list_editor!!)
                        adp_NewProduct = NewProducts_Adp(requireActivity(), list_products)
                        adp_Categories = Catagories_Adp(requireActivity(), list_category)
                        adp_Collections = Collections_Adp(requireActivity(), list_collection)
                        adp_Newshops = NewShops_Adp(requireActivity(), list_Shops)

                        rView_EditorShop.setAdapter(adp_EditorShops)
                        rView_NewShops.setAdapter(adp_Newshops)
                        rView_NewProduct.setAdapter(adp_NewProduct)
                        rView_Categories.setAdapter(adp_Categories)
                        rView_Collections.setAdapter(adp_Collections)

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


                        adp11 = adapterbilgi(activity!!.baseContext,response.body().get(0).featured!!)
//                   Log.d("test123",allitem!!.featured!!.get(0).title)
                        val test= test()
                        view!!.viewpager.setPageTransformer(true,test)
                        view!!.viewpager.setAdapter(adp11)
                        val indicator = view?.findViewById(R.id.indicator) as CircleIndicator
                        indicator.setViewPager(viewpager)
                        adp11.registerDataSetObserver(indicator.getDataSetObserver())


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                        Picasso.get()
                            .load(list_editor!!.get(editorPos).cover?.url)
                            .into(imgEditorBack)

                    }

                }

            }
            override fun onFailure(call: Call<List<Allitem>>, t: Throwable) {}
        })

    }


    fun create(view:View){

        rView_NewProduct=view.recyclerview
        rView_Categories=view.recyclerview1
        rView_Collections=view.recyclerview2
        rView_EditorShop=view.recyclerview3
        rView_NewShops=view.recyclerview4

        layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        layoutManager1 = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        layoutManager2 = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        layoutManager3 = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        layoutManager4 = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)






        ///////////////////////////////////////////////////////////////////////////////////////////////////////

//        var animation = AnimationUtils.loadLayoutAnimation(requireContext(), R.anim.layout_animation_from_bottom)
//
//
//
//        rView_NewProduct.setLayoutAnimation(animation)

        ///////////////////////////////////////////////////////////////////////////////////////////////////////




        view.recyclerview.setLayoutManager(layoutManager)
        view.recyclerview1.setLayoutManager(layoutManager1)
        view.recyclerview2.setLayoutManager(layoutManager2)
        view.recyclerview3.setLayoutManager(layoutManager3)
        view.recyclerview4.setLayoutManager(layoutManager4)
    }

    fun click(view: View){
        view.constrait.setOnClickListener {Toast.makeText(requireContext(),"test",Toast.LENGTH_SHORT).show()}
        view.constrait1.setOnClickListener {Toast.makeText(requireContext(),"test",Toast.LENGTH_SHORT).show()}
        view.constrait2.setOnClickListener { Toast.makeText(requireContext(),"test",Toast.LENGTH_SHORT).show()}
    }

}
