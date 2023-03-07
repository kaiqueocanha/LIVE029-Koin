package com.example.livekoin.di.modules

import com.example.livekoin.api.UserAPI
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val apiModule = module {
    single {provideUserApi()}
}

fun provideUserApi() : UserAPI{
    return Retrofit.Builder()
        .baseUrl("https://api.github.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build().create(UserAPI::class.java)
}
