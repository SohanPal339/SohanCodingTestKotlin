package com.sohancodingtestkotlin.api.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable


class Artist(
        val name: String,
        val mbid: String,
        val url: String,
        @SerializedName("image") val images: List<Image>,
        val streamable: String
    ): Serializable