package com.example.vitrinova.Models.Collections

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Collection {

    @SerializedName("cover")
    @Expose
    val cover: CollectionCover? = null

    @SerializedName("share_url")
    @Expose
    val shareUrl: String? = null

    @SerializedName("start")
    @Expose
    val start: String? = null

    @SerializedName("logo")
    @Expose
    val logo: CollectionLogo? = null

    @SerializedName("definition")
    @Expose
    val definition: String? = null


    @SerializedName("id")
    @Expose
    val id: Int? = null

    @SerializedName("title")
    @Expose
    val title: String? = null
}