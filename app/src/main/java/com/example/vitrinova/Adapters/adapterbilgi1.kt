package com.example.vitrinova.Adapters


import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.vitrinova.Models.Allitem
import com.example.vitrinova.Models.Featured.Featured
import com.example.vitrinova.Models.Products.Products
import com.example.vitrinova.R


class adapterbilgi1(
    list: List<Products>
) :  PagerAdapter() {
    internal var list:List<Products>
    init{
        this.list = list
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun getCount(): Int {
        return list.size
    }



    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        val view:View = LayoutInflater.from(container.context).inflate(R.layout.new_products, container, false)

        val titles =     view.findViewById<TextView>(R.id.ftrd_txtTitle)

        Log.d("test", list.get(position).title)
        titles.text = list.get(position).title


        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
      val viewPager:ViewPager=container as ViewPager
      val view:View=`object` as View
      viewPager.removeView(view)
    }
}