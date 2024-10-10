package com.example.investigacion

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private const val BASE_URL = "https://66fb02128583ac93b40aa0f6.mockapi.io/api/"

    val api: RecursoApi by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RecursoApi::class.java)
    }
}
