package com.example.vitrinova.Models.Featured

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class FeaturedThumbnail {
    @SerializedName("width")
    @Expose
    var width:Int = 0
    @SerializedName("height")
    @Expose
    var height:Int = 0
    @SerializedName("url")
    @Expose
    lateinit var url:String

}