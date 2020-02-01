package com.example.vitrinova.Models.Products

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Products {


    @SerializedName("comment_count")
    @Expose
    val commentCount: Int? = null

    @field:SerializedName("is_editor_choice")
    @Expose
    val isEditorChoice: Boolean? = null

    @field:SerializedName("shop")
    @Expose
    val shop: Shop? = null

    @field:SerializedName("title")
    @Expose
    lateinit var title:String

    @field:SerializedName("category_id")
    @Expose
    val categoryId: Int? = null

    @field:SerializedName("price")
    @Expose
    var price: Int? = null

    @field:SerializedName("definition")
    @Expose
    val definition: String? = null

    @field:SerializedName("id")
    @Expose
    var id: Int? = null

    @field:SerializedName("stock")
    @Expose
    val stock: Int? = null

    @field:SerializedName("slug")
    @Expose
    val slug: String? = null

    @field:SerializedName("is_liked")
    @Expose
    val isLiked: Boolean? = null

    @field:SerializedName("images")
    @Expose
    var images: List<ImagesItems?>? = null


    @field:SerializedName("like_count")
    @Expose
    val likeCount: Int? = null

    @field:SerializedName("is_new")
    @Expose
    val isNew: Boolean? = null

    @field:SerializedName("is_owner")
    @Expose
    val isOwner: Boolean? = null

    @field:SerializedName("old_price")
    @Expose
    var oldPrice: Int? = null

    @field:SerializedName("cargo_time")
    @Expose
    val cargoTime: Int? = null

    @field:SerializedName("share_url")
    @Expose
    val shareUrl: String? = null

    @field:SerializedName("difference")
    val difference: String? = null

    @field:SerializedName("is_approved")
    @Expose
    val isApproved: Boolean? = null
    @field:SerializedName("commission_rate")
    @Expose
    val commissionRate: Int? = null


    @field:SerializedName("is_cargo_free")
    @Expose
    val isCargoFree: Boolean? = null
}