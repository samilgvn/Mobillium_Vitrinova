package com.example.vitrinova.Models.Shops

import com.example.vitrinova.Models.Products.Products
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Shops {

    @SerializedName("id")
    @Expose
     val id:Int?=null
    @SerializedName("name")
    @Expose
    val name:String?=null
    @SerializedName("slug")
    @Expose
    val slug:String?=null
    @SerializedName("definition")
    @Expose
    val definition:String?=null
    @SerializedName("name_updateable")
    @Expose
  val nameUpdateable:Boolean?=null
    @SerializedName("vacation_mode")
    @Expose
    val vacationMode:Int?=null
    @SerializedName("created_at")
    @Expose
     val createdAt:String?=null
    @SerializedName("shop_payment_id")
    @Expose
    val shopPaymentId:Int?=null
    @SerializedName("product_count")
    @Expose
   val productCount:Int?=null
    @SerializedName("shop_rate")
    @Expose
     val shopRate:Int?=null
    @SerializedName("comment_count")
    @Expose
    val commentCount:Int?=null
    @SerializedName("follower_count")
    @Expose
     val followerCount:Int?=null
    @SerializedName("is_editor_choice")
    @Expose
    val isEditorChoice:Boolean?=null
    @SerializedName("is_following")
    @Expose
     val isFollowing:Boolean?=null
    @SerializedName("cover")
    @Expose
  val cover:ShopsCover?=null
    @SerializedName("share_url")
    @Expose
    val shareUrl:String?=null
    @SerializedName("logo")
    @Expose
     val logo:ShopsCover?=null
    @SerializedName("popular_products")
    @Expose
    val productList: List<Products>? = null
}