package com.example.vitrinova.Models.Products

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ProductImagesMedium {

    @SerializedName("url")
    @Expose
    val url: String?=null

    @SerializedName("height")
    @Expose
    val height: Int?=null

    @SerializedName("width")
    @Expose
    val width: Int?=null
}