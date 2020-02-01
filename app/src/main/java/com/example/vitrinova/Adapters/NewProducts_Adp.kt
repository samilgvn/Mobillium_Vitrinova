package com.example.vitrinova.Adapters

import android.annotation.SuppressLint
import android.content.Context
import android.text.SpannableString
import android.text.style.StrikethroughSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.vitrinova.Models.Products.Products
import com.example.vitrinova.R
import com.squareup.picasso.Picasso
import java.security.AccessController.getContext

class NewProducts_Adp(context: Context, mesajModelList:List<Products>):RecyclerView.Adapter<NewProducts_Adp.tanimla>() {


    internal var context:Context
    internal var mesajModelList:List<Products>

    init{
        this.context = context
        this.mesajModelList = mesajModelList
    }

    override fun getItemCount(): Int {
        return mesajModelList.size
    }


    @NonNull
    override fun onCreateViewHolder(@NonNull parent: ViewGroup, viewType:Int): tanimla {
        val view = LayoutInflater.from(context).inflate(R.layout.new_products, parent, false)
        return tanimla(view)
    }
    @SuppressLint("ResourceType")
    override fun onBindViewHolder(@NonNull holder: tanimla, position:Int) {


       var ss = SpannableString(mesajModelList.get(position).oldPrice.toString()+"TL")
      ss.setSpan(StrikethroughSpan(), 0, mesajModelList.get(position).oldPrice.toString().length+2, 0)


           holder.eskiucret.setText(ss)



//        holder.img.setImageResource(mesajModelList.get(position))
//       var ss1 = SpannableString(mesajModelList.get(position).isim)
//       ss.setSpan(StrikethroughSpan(), 0, mesajModelList.get(position).isim.length, 0)

        /*String imageUrl = "https://images.unsplash.com/photo-1535370976884-f4376736ab06?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1482&q=80";
        Glide.with(getApplicationContext())
                .load(imageUrl)
                .placeholder(R.drawable.ic_launcher_background)
                .into(img_example_image);*/


        Picasso.get()
            .load(mesajModelList.get(position).images?.get(0)?.productsThumbnail?.url)
            .fit()

            .into(holder.img)


        var str:String

        str=mesajModelList.get(position).title


        if(mesajModelList.get(position).title.length>20){
            holder.ad.setText(str.substring(0,20)+"...")

        }else{

            holder.ad.setText(mesajModelList.get(position).title)
        }


        holder.ucret.setText(mesajModelList.get(position).price.toString()+"TL")
        holder.subtitle.setText(mesajModelList.get(position).shop?.name)

        //holder.itemView.setOnClickListener { Toast.makeText(context, mesajModelList.get(position).isim, Toast.LENGTH_LONG).show()
        //}
    }
    inner class tanimla(@NonNull itemView:View): RecyclerView.ViewHolder(itemView) {
       // internal var img: ImageView
        internal var img:ImageView
        internal var ad: TextView
        internal var eskiucret:TextView
        internal var subtitle:TextView
        internal var ucret:TextView



        init{

            img=itemView.findViewById(R.id.nwprdct_ImageView)
            subtitle=itemView.findViewById(R.id.nwprdct_txtDes)
            ucret=itemView.findViewById(R.id.nwprdct_Price)
            eskiucret=itemView.findViewById(R.id.nwprdct_OldPrice)
           // img = itemView.findViewById(R.id.nwprdct_ImageView)
            ad = itemView.findViewById(R.id.nwprdct_txtTitle)


        }
    }
}