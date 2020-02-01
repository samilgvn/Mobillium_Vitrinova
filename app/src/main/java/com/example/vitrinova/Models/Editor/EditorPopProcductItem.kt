package com.example.vitrinova.Models.Editor

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class EditorPopProcductItem {

    @SerializedName("comment_count")
    @Expose
    val commentCount: Int? = null

    @SerializedName("is_editor_choice")
    @Expose
    val isEditorChoice: Boolean? = null

    @SerializedName("title")
    @Expose
    val title: String? = null
    @SerializedName("category_id")
    @Expose
    val categoryId: Int? = null
    @SerializedName("price")
    @Expose
    val price: Int? = null
    @SerializedName("definition")
    @Expose
    val definition: String? = null
    @SerializedName("id")
    @Expose
    val id: Int? = null
    @SerializedName("stock")
    @Expose
    val stock: Int? = null
    @SerializedName("slug")
    @Expose
    val slug: String? = null
    @SerializedName("is_liked")
    @Expose
    val isLiked: Boolean? = null
    @SerializedName("images")
    @Expose
    val images: List<EditorImagesItem?>? = null
    @SerializedName("is_active")
    @Expose
    val isActive: Boolean? = null
    @SerializedName("like_count")
    @Expose
    val likeCount: Int? = null
    @SerializedName("is_new")
    @Expose
    val isNew: Boolean? = null
    @SerializedName("is_owner")
    @Expose
    val isOwner: Boolean? = null
    @SerializedName("cargo_time")
    @Expose
    val cargoTime: Int? = null
    @SerializedName("share_url")
    @Expose
    val shareUrl: String? = null
    @SerializedName("difference")
    @Expose
    val difference: String? = null
    @SerializedName("is_approved")
    @Expose
    val isApproved: Boolean? = null
    @SerializedName("commission_rate")
    @Expose
    val commissionRate: Int? = null
    @SerializedName("category")
    @Expose
    val category: EditorCategory? = null
    @SerializedName("is_cargo_free")
    @Expose
    val isCargoFree: Boolean? = null
    @SerializedName("view_count")
    @Expose
    val viewCount: Int? = null
}