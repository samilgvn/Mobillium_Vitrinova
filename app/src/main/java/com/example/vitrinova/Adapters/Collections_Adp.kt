package com.example.vitrinova

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.example.vitrinova.Models.Collections.Collection
import com.example.vitrinova.Models.mesajmodel1
import com.squareup.picasso.Picasso

class Collections_Adp (context: Context, mesajModelList:List<Collection>): RecyclerView.Adapter<Collections_Adp.tanimla>() {


        internal var context: Context
        internal var mesajModelList:List<Collection>


        init{
            this.context = context
            this.mesajModelList = mesajModelList
        }

        override fun getItemCount(): Int {
            return mesajModelList.size
        }


        @NonNull
        override fun onCreateViewHolder(@NonNull parent: ViewGroup, viewType:Int): tanimla {
            val view = LayoutInflater.from(context).inflate(R.layout.collections, parent, false)
            return tanimla(view)
        }

        override fun onBindViewHolder(holder: tanimla, position: Int) {



          //  holder.img.setImageResource(mesajModelList.get(position).resimid)
//        var ss = SpannableString(mesajModelList.get(position).isim)
//        ss.setSpan(StrikethroughSpan(), 0, mesajModelList.get(position).isim.length, 0)
            Picasso.get()
                .load(mesajModelList.get(position).cover?.url)
                .fit()
                .into(holder.img)


            holder.ad.setText(mesajModelList.get(position).title)
            holder.des.setText(mesajModelList.get(position).definition)
            holder.itemView.setOnClickListener { Toast.makeText(context, mesajModelList.get(position).title, Toast.LENGTH_LONG).show() }
        }
        inner class tanimla(@NonNull itemView: View): RecyclerView.ViewHolder(itemView) {
            internal var img: ImageView
            internal var ad: TextView
            internal var des:TextView
            init{
                des=itemView.findViewById(R.id.cllctns_txtDes)
                img = itemView.findViewById(R.id.cllctns_ImageView)
                ad = itemView.findViewById(R.id.cllctns_txtTitle)
            }
        }


    }