package com.example.vitrinova.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.example.vitrinova.Models.Shops.Shops
import com.example.vitrinova.Models.mesajmodel1
import com.example.vitrinova.R
import com.squareup.picasso.Picasso

class NewShops_Adp (context: Context, mesajModelList:List<Shops>): RecyclerView.Adapter<NewShops_Adp.tanimla>() {


    internal var context: Context
    internal var mesajModelList: List<Shops>


    init {
        this.context = context
        this.mesajModelList = mesajModelList
    }

    override fun getItemCount(): Int {
        return mesajModelList.size
    }


    @NonNull
    override fun onCreateViewHolder(@NonNull parent: ViewGroup, viewType: Int): tanimla {
        val view = LayoutInflater.from(context).inflate(R.layout.new_shops, parent, false)
        return tanimla(view)
    }

    override fun onBindViewHolder(holder: tanimla, position: Int) {


       // holder.img.setImageResource(mesajModelList.get(position).name)
//        var ss = SpannableString(mesajModelList.get(position).isim)
//        ss.setSpan(StrikethroughSpan(), 0, mesajModelList.get(position).isim.length, 0)


        var str:String

        str=mesajModelList.get(position).definition.toString()


        holder.ad.setText(mesajModelList.get(position).name)
        holder.des.setText(str.substring(0,25)+"...")
       holder.adet.setText(mesajModelList.get(position).productCount.toString())


        if(mesajModelList.get(position).logo?.url==null){


            var str:String

            str=mesajModelList.get(position).name.toString()

            holder.txtlogo.setText(str.substring(0,1))


            holder.ppimg.visibility=View.INVISIBLE



        }else{

            holder.txtlogo.visibility=View.INVISIBLE
            Picasso.get()
                .load(mesajModelList.get(position).logo?.url)
                .fit()
                .into(holder.ppimg)


        }


        Picasso.get()
            .load(mesajModelList.get(position).cover?.medium?.url)
            .fit()
            .into(holder.img)

//        holder.itemView.setOnClickListener {
//            Toast.makeText(
//                context,
//                mesajModelList.get(position).isim,
//                Toast.LENGTH_LONG
//            ).show()
//        }
    }

    inner class tanimla(@NonNull itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal var ppimg: ImageView
        internal var des: TextView
        internal var ad: TextView
        internal var adet:TextView
        internal var img:ImageView
        internal var txtlogo:TextView
        //internal var ll:LinearLayout
        init {
            txtlogo=itemView.findViewById(R.id.txtlogo)
            img=itemView.findViewById(R.id.newshopimg)
            des=itemView.findViewById(R.id.newshopdestxt)
            adet=itemView.findViewById(R.id.newshopproducthow)
            ppimg = itemView.findViewById(R.id.newshoppimg)
            ad = itemView.findViewById(R.id.newshoptxt)
            // ll=itemView.findViewById(R.id.ll)
        }
    }


}
