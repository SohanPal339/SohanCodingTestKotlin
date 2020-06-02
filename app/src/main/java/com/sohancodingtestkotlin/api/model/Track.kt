package com.sohancodingtestkotlin.api.model

import java.io.Serializable


class Track(
        val name: String,
        val duration: Int = 0,
        val mbid: String?,
        val url: String?,
        val artist: Artist
): Serializable