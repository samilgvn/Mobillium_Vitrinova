package com.example.vitrinova

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentTransaction

class ChangeFragment(context:Context) {

        private val context:Context
        init{
            this.context = context
        }

//    fun ChangeFragment(context: Context?) {
//        this.context = context
//    }


    fun change(fragment: Fragment?) {
        (context as FragmentActivity?)!!.supportFragmentManager.beginTransaction()

            .replace(R.id.fragmentContainer, fragment!!, "fragment")
            .addToBackStack(null)
            .setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            .commit()
    }
}