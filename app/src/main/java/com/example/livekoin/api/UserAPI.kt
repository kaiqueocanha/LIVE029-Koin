package com.example.livekoin.api

import com.example.livekoin.models.User
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface UserAPI {

    @GET("/users")
    suspend fun getAllUsers() : List<User>

}