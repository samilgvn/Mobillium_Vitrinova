package com.example.vitrinova.Models.Collections

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class CollectionMedium {

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