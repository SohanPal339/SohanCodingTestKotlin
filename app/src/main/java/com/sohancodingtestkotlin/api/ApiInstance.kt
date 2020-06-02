package com.sohancodingtestkotlin.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory



class ApiInstance {

    companion object {
        private var retrofit: Retrofit? = null
        private val BASE_URL = "https://ws.audioscrobbler.com/"

        /**
         * Create an instance of Retrofit object
         */
        fun getRetrofitInstance(): Retrofit? {
            if (retrofit == null) {
                retrofit = retrofit2.Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
            }
            return retrofit
        }
    }
}