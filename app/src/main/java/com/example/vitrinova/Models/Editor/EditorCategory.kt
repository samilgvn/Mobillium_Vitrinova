package com.example.vitrinova.Models.Editor

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class EditorCategory {

    @SerializedName("parentId")
    @Expose
    val parentId: Int? = null
    @SerializedName("name")
    @Expose
    val name: String? = null
    @SerializedName("parentCategory")
    @Expose
    val parentCategory: EditorParentCategory? = null
    @SerializedName("id")
    @Expose
    val id: Int? = null
    @SerializedName("order")
    @Expose
    val order: Int? = null
}