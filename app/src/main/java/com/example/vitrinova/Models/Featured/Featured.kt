package com.example.vitrinova.Models.Featured

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Featured {

    @SerializedName("id")
    @Expose
    var id:Int = 0
    @SerializedName("type")
    @Expose
    lateinit var type:String
    @SerializedName("cover")
    @Expose
    lateinit var cover:FeaturedCover
    @SerializedName("title")
    @Expose
    lateinit var title:String
   @SerializedName("sub_title")
    @Expose
   lateinit var subTitle:String
}