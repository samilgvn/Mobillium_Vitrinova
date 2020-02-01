package com.example.vitrinova.Models.Categories

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class CategoriesCover {

    @SerializedName("thumbnail")
    @Expose
    val thumbnail: CategoriesThumbnail? = null
    @SerializedName("width")
    @Expose
    val width: Int? = null
    @SerializedName("medium")
    @Expose
    val medium: CategoriesCover? = null
    @SerializedName("url")
    @Expose
    val url: String? = null
    @SerializedName("height")
    @Expose
    val height: Int? = null
}