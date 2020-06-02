package com.sohancodingtestkotlin.api

import com.google.gson.JsonElement
import com.sohancodingtestkotlin.api.model.Artist


import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query



interface ApiService {

    @GET("/2.0/?method=artist.search&api_key=90a1766cdf09639c797436a59fdf5685&format=json")
    fun searchArtist(@Query("artist") artist: String): Call<JsonElement>

    @GET("/2.0/?method=artist.getinfo&api_key=90a1766cdf09639c797436a59fdf5685&format=json")
    fun requestArtistInfo(@Query("mbid") id: String, @Query("lang") language: String): Call<Artist>

    @GET("/2.0/?method=artist.gettopalbums&api_key=90a1766cdf09639c797436a59fdf5685&format=json")
    fun requestAlbums(@Query("mbid") id: String, @Query("artist") artist: String): Call<JsonElement>

    @GET("/2.0/?method=album.getInfo&api_key=90a1766cdf09639c797436a59fdf5685&format=json")
    fun requestAlbum(@Query("mbid") id: String): Call<JsonElement>
}