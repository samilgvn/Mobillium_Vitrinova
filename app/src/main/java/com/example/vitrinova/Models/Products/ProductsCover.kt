package com.example.vitrinova.Models.Products

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




class ProductsCover {

    @SerializedName("width")
    @Expose
    private val width: Int? = null
    @SerializedName("height")
    @Expose
    private val height: Int? = null
    @SerializedName("url")
    @Expose
    private val url: String? = null
    @SerializedName("medium")
    @Expose
    private val medium: ProductImagesMedium? = null
    @SerializedName("thumbnail")
    @Expose
    private val thumbnail: ProductImagesThumbnail? = null
}