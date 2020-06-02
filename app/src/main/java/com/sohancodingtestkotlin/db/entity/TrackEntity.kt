package com.sohancodingtestkotlin.db.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.arch.persistence.room.TypeConverters

import com.sohancodingtestkotlin.db.converter.ArtistConverters

import java.io.Serializable



@Entity(tableName = "track")
class TrackEntity(
        @PrimaryKey
        val name: String,
        val duration: Int = 0,
        val mbid: String?,
        val url: String?,
        @TypeConverters(ArtistConverters::class)
        val artist: ArtistEntity
): Serializable