package com.example.vitrinova.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.viewpager.widget.PagerAdapter
import com.bumptech.glide.Glide
import com.example.vitrinova.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_frag_discover.*


class ViewPager_Adp(context: Context, imageUrls: Array<String>, title: Array<String>, des: Array<String>) :
    PagerAdapter() {


    private val context: Context
    private val imageUrls: Array<String>
    private val title: Array<String>
    private val des: Array<String>


    init {
        this.context = context
        this.imageUrls = imageUrls
        this.title = title
        this.des = des

    }

    override fun getCount(): Int {
        return imageUrls.size
    }


    override fun isViewFromObject(@NonNull view: View, @NonNull `object`: Any): Boolean {
        return view === `object`
    }


    override fun instantiateItem(view: ViewGroup, position: Int): Any {

        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val layoutt = inflater.inflate(R.layout.featured, view, false)!!

       val im = layoutt.findViewById(R.id.ftrd_ImageView) as ImageView
       val txt = layoutt.findViewById(R.id.ftrd_txtTitle) as TextView
        val txt1 = layoutt.findViewById(R.id.ftrd_txtDes) as TextView
        txt.setText(title[position])
        txt1.setText(des[position])



//        val imageView = ImageView(context)
//
//        val txtTitle=TextView(context)
//        val txtDes=TextView(context)

//        txtTitle.setText(title[position])
//        txtDes.setText(des[position])
//

        Glide
            .with(context)
            .load(imageUrls[position])
            .centerCrop()
            .into(im)
        view.addView(layoutt, 0)
        return layoutt

    }

    override fun destroyItem(@NonNull container: ViewGroup, position: Int, @NonNull `object`: Any) {
        container.removeView(`object` as View)
    }
}