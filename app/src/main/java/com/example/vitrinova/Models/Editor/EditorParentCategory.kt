package com.example.vitrinova.Models.Editor

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class EditorParentCategory {
    //	@field:SerializedName("parentId")
//	val parentId: Any? = null,
    @SerializedName("name")
    @Expose
    val name: String? = null
    //	@field:SerializedName("parentCategory")
//	val parentCategory: Any? = null,
    @SerializedName("id")
    @Expose
    val id: Int? = null
    @SerializedName("order")
    @Expose
    val order: Int? = null
}