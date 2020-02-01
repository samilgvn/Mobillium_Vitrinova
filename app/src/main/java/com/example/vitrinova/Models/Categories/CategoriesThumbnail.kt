package com.example.vitrinova.Models.Categories

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class CategoriesThumbnail {

    @SerializedName("width")
    @Expose
    val width: Int? = null
    @SerializedName("url")
    @Expose
    val url: String? = null
    @SerializedName("height")
    @Expose
    val height: Int? = null
}