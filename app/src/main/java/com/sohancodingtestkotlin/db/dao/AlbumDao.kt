package com.sohancodingtestkotlin.db.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy.REPLACE
import android.arch.persistence.room.Query

import com.sohancodingtestkotlin.db.entity.AlbumEntity


@Dao
interface AlbumDao {

    @Insert(onConflict = REPLACE)
    fun insertAlbum(albumEntity: AlbumEntity): Long

    @Delete
    fun deleteAlbum(albumEntity: AlbumEntity): Int

    @Query("select * from album")
    fun getAlbums(): LiveData<List<AlbumEntity>>


}