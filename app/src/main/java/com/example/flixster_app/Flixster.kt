package com.example.flixster_app

import com.google.gson.annotations.SerializedName

class Flixster {
    @JvmField
    @SerializedName("title")
    var title: String? = null

    @JvmField
    @SerializedName("overview")
    var description: String? = null

    @JvmField
    @SerializedName("poster_path")
    var posterPath: String? = null

    fun getPosterUrl(): String {
        return "https://image.tmdb.org/t/p/w500/$posterPath"
    }
}
