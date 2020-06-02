package com.sohancodingtestkotlin.db.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

import java.io.Serializable

@Entity(tableName = "artist")
class ArtistEntity(
        @PrimaryKey
        val name: String,
        val mbid: String,
        val url: String,
        val image: String,
        val streamable: String? = null
): Serializable