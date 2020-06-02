package com.sohancodingtestkotlin.db


import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import android.content.Context

import com.sohancodingtestkotlin.db.converter.ArtistConverters
import com.sohancodingtestkotlin.db.converter.TracksConverters
import com.sohancodingtestkotlin.db.dao.AlbumDao
import com.sohancodingtestkotlin.db.entity.AlbumEntity
import com.sohancodingtestkotlin.db.entity.ArtistEntity
import com.sohancodingtestkotlin.db.entity.TrackEntity


@Database(entities = [(AlbumEntity::class), (TrackEntity::class), (ArtistEntity::class)], version = 1,exportSchema = false)
@TypeConverters(ArtistConverters::class, TracksConverters::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun albumDao(): AlbumDao

    companion object {
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase? {
            if (INSTANCE == null) {
                synchronized(AppDatabase::class) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                        AppDatabase::class.java, "myDb.db")
                        .build()
                }
            }
            return INSTANCE
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }

}
