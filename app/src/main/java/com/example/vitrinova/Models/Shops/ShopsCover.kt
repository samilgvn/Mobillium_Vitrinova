package com.example.vitrinova.Models.Shops

import com.example.vitrinova.Models.Editor.EditorThumbnail
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ShopsCover {

    @SerializedName("width")
    @Expose
    val width: Int? = null
    @SerializedName("height")
    @Expose
    val height: Int? = null
    @SerializedName("url")
    @Expose
    val url:String?=null
    @SerializedName("medium")
    @Expose
    val medium: ShopsMedium?=null
    @SerializedName("thumbnail")
    @Expose
    val thumbnail: ShopsThumbnail?=null

}