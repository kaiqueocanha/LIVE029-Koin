package com.example.livekoin.di

import com.example.livekoin.di.modules.apiModule
import com.example.livekoin.di.modules.repositoriesModule
import com.example.livekoin.di.modules.viewModelsModule

val appModules = listOf(
    apiModule,
    repositoriesModule,
    viewModelsModule
)