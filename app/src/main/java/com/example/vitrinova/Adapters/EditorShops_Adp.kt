package com.example.vitrinova.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.example.vitrinova.Models.Editor.Editor
import com.example.vitrinova.Models.Shops.Shops
import com.example.vitrinova.Models.mesajmodel1
import com.example.vitrinova.R
import com.squareup.picasso.Picasso

class EditorShops_Adp (context: Context, mesajModelList:List<Shops>): RecyclerView.Adapter<EditorShops_Adp.tanimla>() {


    internal var context: Context
    internal var mesajModelList:List<Shops>


    init{
        this.context = context
        this.mesajModelList = mesajModelList
    }

    override fun getItemCount(): Int {
        return mesajModelList.size
    }


    @NonNull
    override fun onCreateViewHolder(@NonNull parent: ViewGroup, viewType:Int): tanimla {
        val view = LayoutInflater.from(context).inflate(R.layout.editor_shops, parent, false)
        return tanimla(view)
    }

    override fun onBindViewHolder(holder: tanimla, position: Int) {



       // holder.img.setImageResource(mesajModelList.get(position).resimid)
//        var ss = SpannableString(mesajModelList.get(position).isim)
//        ss.setSpan(StrikethroughSpan(), 0, mesajModelList.get(position).isim.length, 0)


        Picasso.get()
            .load(mesajModelList.get(position).logo?.url)
            .into(holder.img)

        Picasso.get()
            .load(mesajModelList.get(position).productList?.get(0)?.images?.get(0)?.url)
            .fit()
            .into(holder.img1)
        Picasso.get()

            .load(mesajModelList.get(position).productList?.get(1)?.images?.get(0)?.url)
            .fit()
            .into(holder.img2)
        Picasso.get()
            .load(mesajModelList.get(position).productList?.get(2)?.images?.get(0)?.url)
            .fit()
            .into(holder.img3)



        var str:String

        str=mesajModelList.get(position).definition.toString()

        holder.ad.setText(mesajModelList.get(position).name)
        holder.des.setText(str.substring(0,35)+"...")
        holder.itemView.setOnClickListener { Toast.makeText(context, mesajModelList.get(position).name, Toast.LENGTH_LONG).show() }
    }
    inner class tanimla(@NonNull itemView: View): RecyclerView.ViewHolder(itemView) {
        internal var img: ImageView
        internal var ad: TextView
        internal var des:TextView
        internal var img1:ImageView
        internal var img2:ImageView
        internal var img3:ImageView

      //internal var ll:LinearLayout
        init{
            img = itemView.findViewById(R.id.edtrshps_ProfileImageView)

          img1=itemView.findViewById(R.id.edtrshps_LImageView)
          img2=itemView.findViewById(R.id.edtrshps_MImageView)
          img3=itemView.findViewById(R.id.edtrshps_RImageView)
            ad = itemView.findViewById(R.id.edtrshps_txtTitle)
          des=itemView.findViewById(R.id.edtrshps_txtDes)
           // ll=itemView.findViewById(R.id.ll)
        }
    }



}