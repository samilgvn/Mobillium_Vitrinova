package com.example.vitrinova




import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.speech.RecognitionService
import android.speech.RecognizerIntent
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.vitrinova.Adapters.adapterbilgi
import com.example.vitrinova.Fragments.fragDiscover
import com.example.vitrinova.Fragments.fragNotification
import com.example.vitrinova.Fragments.fragProducts
import com.example.vitrinova.Models.Allitem
import com.example.vitrinova.Models.Collections.Collection
import com.example.vitrinova.Models.Featured.Featured
import com.example.vitrinova.RestAPI.ManagerAll
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.fragment_frag_discover.*
import kotlinx.android.synthetic.main.fragment_frag_discover.view.*
import kotlinx.android.synthetic.main.fragment_frag_discover.view.recyclerview3
import kotlinx.android.synthetic.main.new_products.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*
import android.view.Menu as Menu1


class MainActivity : AppCompatActivity() {
    lateinit var adp3:Collections_Adp
   // var list:List<Featured> = ArrayList()
    lateinit var recyclerView3: RecyclerView
    var list4:List<Collection> = java.util.ArrayList()
    lateinit var layoutManager4: RecyclerView.LayoutManager
    val fragDiscover= com.example.vitrinova.Fragments.fragDiscover()

    private val REQUEST_CODE_SPEECH_INPUT=100
    private lateinit var navController: NavController


    lateinit var mBotNavView: BottomNavigationView
    val changeFragmentt = ChangeFragment(this@MainActivity)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mBotNavView = bottom_nav


        btn_mic.setOnClickListener {

            speak()

        }


        val changeFragment = ChangeFragment(this@MainActivity)

        if (savedInstanceState == null) {
            changeFragment.change(fragProducts())
        }

        mBotNavView.setOnNavigationItemSelectedListener (mOnNavLis)

    }




    private fun speak(){

        val mIntent= Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH)
        mIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM)

        mIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE,Locale.getDefault())
        mIntent.putExtra(RecognizerIntent.EXTRA_PROMPT,"Sesli Arama")

        try {

            startActivityForResult(mIntent,REQUEST_CODE_SPEECH_INPUT)

        }catch (e:Exception){

        Toast.makeText(this,e.message,Toast.LENGTH_SHORT).show()


        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {



        when(requestCode){

        REQUEST_CODE_SPEECH_INPUT ->{

         if(resultCode==Activity.RESULT_OK && requestCode==REQUEST_CODE_SPEECH_INPUT){

             Log.d("adasd","result calıstı")

             val result = data?.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS)

             //txtt.text=result[0]

             Log.d("adasd1"," "+result)

             etxtsearch.setText(result?.get(0))
             super.onActivityResult(requestCode, resultCode, data)
         }


        }
        }
    }


    override fun onCreateOptionsMenu(menu: Menu1?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    private val mOnNavLis=BottomNavigationView.OnNavigationItemSelectedListener {menuItem ->

        when(menuItem.itemId){

            R.id.mdiscover->{

                changeFragmentt.change(fragDiscover())
               // fragDiscover.istek()
                return@OnNavigationItemSelectedListener true
            }
            R.id.msearch->{
                changeFragmentt.change(fragNotification())
                return@OnNavigationItemSelectedListener true
            }
            R.id.mproduct->{
                changeFragmentt.change(fragProducts())
                return@OnNavigationItemSelectedListener true
            }

            else -> false
        }

    }



}
