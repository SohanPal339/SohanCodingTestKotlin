package com.sohancodingtestkotlin.db.converter


import android.arch.persistence.room.TypeConverter

import com.google.gson.Gson
import com.sohancodingtestkotlin.db.entity.ArtistEntity



class ArtistConverters {

    var gson = Gson()

    @TypeConverter
    fun stringToTracks(data: String?): ArtistEntity {
        return gson.fromJson(data, ArtistEntity::class.java)
    }

    @TypeConverter
    fun TracksToString(someObjects: ArtistEntity): String {
        return gson.toJson(someObjects)
    }
}