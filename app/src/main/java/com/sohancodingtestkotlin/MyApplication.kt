package com.sohancodingtestkotlin

import android.app.Application
import android.content.Context
import com.sohancodingtestkotlin.db.AppDatabase
import com.sohancodingtestkotlin.db.DataRepository


class MyApplication: Application() {

    companion object {
        var appContext: Context? = null
    }

    override fun onCreate() {
        super.onCreate()
        appContext = this
    }

    fun getDatabase(): AppDatabase? {
        return AppDatabase.getInstance(appContext!!)
    }

    fun getRepository(): DataRepository? {
        return DataRepository(getDatabase())
    }
}
