package com.example.vitrinova.Models.Products

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ImagesItems {

    @SerializedName("thumbnail")
    @Expose
    val productsThumbnail: ProductImagesThumbnail?=null

    @SerializedName("width")
    @Expose
    val width: Int?=null

    @SerializedName("medium")
    @Expose
    val productsMedium: ProductImagesMedium?=null

    @SerializedName("url")
    @Expose
    val url: String?=null

    @SerializedName("height")
    @Expose
    val height: Int?=null
}