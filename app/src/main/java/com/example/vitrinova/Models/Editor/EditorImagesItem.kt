package com.example.vitrinova.Models.Editor

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class EditorImagesItem {

    @SerializedName("thumbnail")
    @Expose
    val thumbnail: EditorThumbnail? = null
    @SerializedName("width")
    @Expose
    val width: Int? = null
    @SerializedName("medium")
    @Expose
    val medium: EditorMedium? = null
    @SerializedName("url")
    @Expose
    val url: String? = null
    @SerializedName("height")
    @Expose
    val height: Int? = null
}