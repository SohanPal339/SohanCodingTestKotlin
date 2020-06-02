package com.sohancodingtestkotlin.api.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable


class Image(
        @SerializedName("#text") val url: String,
        val size: String
): Serializable