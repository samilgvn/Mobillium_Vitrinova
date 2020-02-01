package com.example.vitrinova.Models.Collections

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class CollectionCover {

    @SerializedName("featuredThumbnail")
    @Expose
    val thumbnail: CollectionThumbnail? = null

    @SerializedName("width")
    @Expose
    val width: Int? = null

    @SerializedName("featuredMedium")
    @Expose
    val medium: CollectionMedium? = null

    @SerializedName("url")
    @Expose
    val url: String? = null

    @SerializedName("height")
    @Expose
    val height: Int? = null
}