package com.sohancodingtestkotlin.db

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MediatorLiveData

import com.sohancodingtestkotlin.db.entity.AlbumEntity


class DataRepository(database: AppDatabase?) {

    private var sInstance: DataRepository? = null

    private var mDatabase: AppDatabase? = database
    private var mObservableAlbums: MediatorLiveData<List<AlbumEntity>>? = MediatorLiveData()

    init {
        mObservableAlbums?.addSource(mDatabase?.albumDao()?.getAlbums()!!) {
            mObservableAlbums?.postValue(it)
        }
    }

    fun getInstance(database: AppDatabase): DataRepository? {
        if (sInstance == null) {
            synchronized(DataRepository::class.java) {
                if (sInstance == null) {
                    sInstance = DataRepository(database)
                }
            }
        }
        return sInstance
    }


    fun getAlbums(): LiveData<List<AlbumEntity>>? {
        return mDatabase?.albumDao()?.getAlbums()
    }

    fun deleteAlbum(albumEntity: AlbumEntity): Int? {
         return mDatabase?.albumDao()?.deleteAlbum(albumEntity)
    }

    fun addAlbum(albumEntity: AlbumEntity): Long? {
        return mDatabase?.albumDao()?.insertAlbum(albumEntity)
    }
}