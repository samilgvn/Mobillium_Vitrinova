package com.example.vitrinova.Models.Categories

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Categories {

    @SerializedName("logo")
    @Expose
    val logo: CategoriesLogo? = null
    @SerializedName("id")
    @Expose
    val id: Int? = null
    @SerializedName("name")
    @Expose
    val name: String? = null
    @SerializedName("cover")
    @Expose
    val cover:CategoriesCover?=null
}