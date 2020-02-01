package com.example.vitrinova.Adapters


import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.bumptech.glide.Glide
import com.example.vitrinova.Models.Featured.Featured
import com.example.vitrinova.R
import com.squareup.picasso.Picasso


class adapterbilgi(context: Context,
    list: List<Featured>
) :  PagerAdapter() {
    internal var list:List<Featured>
    internal var context:Context

    init{
        this.context = context
        this.list = list

    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun getCount(): Int {
        return list.size
    }


    override fun instantiateItem(container: ViewGroup, position: Int): Any {


        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater.inflate(R.layout.featured, container, false)!!

        val titles =     view.findViewById(R.id.ftrd_txtTitle) as TextView
        val des=view.findViewById(R.id.ftrd_txtDes) as TextView
        val img=view.findViewById(R.id.ftrd_ImageView) as ImageView


        Log.d("test34", list.get(position).title)
        titles.setText( list.get(position).title)
        des.setText(list.get(position).subTitle)


        Picasso.get()
            .load(list.get(position).cover.url)
            .noPlaceholder()
            .fit()
            .into(img)



//        Glide
//            .with(context)
//            .load(list.get(position).cover.url)
//            .centerCrop()
//            .into(img)

        container.addView(view, 0)




        return view
    }

    override fun destroyItem(@NonNull container: ViewGroup, position: Int, @NonNull `object`: Any) {
        container.removeView(`object` as View)
    }
}