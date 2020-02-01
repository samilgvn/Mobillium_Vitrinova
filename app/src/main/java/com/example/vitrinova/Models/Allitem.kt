package com.example.vitrinova.Models

import com.example.vitrinova.Models.Categories.Categories
import com.example.vitrinova.Models.Collections.Collection
import com.example.vitrinova.Models.Editor.Editor
import com.example.vitrinova.Models.Featured.Featured
import com.example.vitrinova.Models.Products.Products
import com.example.vitrinova.Models.Products.Shop
import com.example.vitrinova.Models.Shops.Shops
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Allitem {

    @SerializedName("type")
    val type: String? = null
    @SerializedName("title")
    val title: String? = null
    @SerializedName("featured")
    @Expose
    var featured: List<Featured>? = null
    @SerializedName("products")
    @Expose
    var products: List<Products>? = null
    @SerializedName("categories")
    @Expose
    var categori: List<Categories>? = null
    @SerializedName("collections")
    @Expose
    var collection: List<Collection>? = null
    @SerializedName("shops")
    @Expose
    var editor: List<Shops>? = null
}