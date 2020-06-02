package com.sohancodingtestkotlin.api.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable


class Album (
    val name: String,
    val mbid: String?,
    val url: String,
    val artist: Artist,
    @SerializedName("image") val images: List<Image>,
    val listeners: String?
    ): Serializable