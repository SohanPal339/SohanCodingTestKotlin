package com.sohancodingtestkotlin.api.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable


class AlbumDetail(
        val name: String,
        val mbid: String,
        val url: String,
        val artist: String,
        val releaseDate: String,
        @SerializedName("image") val images: List<Image>,
        val tracks: Tracklist
):Serializable
