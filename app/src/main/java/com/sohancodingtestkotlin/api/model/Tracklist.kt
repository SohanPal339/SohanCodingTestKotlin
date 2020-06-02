package com.sohancodingtestkotlin.api.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable


class Tracklist(
        @SerializedName("track") val tracks: List<Track>
): Serializable