package com.manuel.continuatres.data.retrofit

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {

    private val retrofit: Retrofit =
        Retrofit.Builder().baseUrl("https://theaudiodb.com/api/v1/json/2/").addConverterFactory(GsonConverterFactory.create()).build()
    val noteService: NoteService = retrofit.create(NoteService::class.java)

}
// https://run.mocky.io/v3/580f7860-95d2-4a87-aa2c-361a8da46317
