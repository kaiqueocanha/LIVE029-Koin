package com.example.livekoin.di.modules

import com.example.livekoin.api.UserAPI
import com.example.livekoin.repositories.UserRepository
import com.example.livekoin.repositories.UserRepositoryImpl
import org.koin.dsl.module

val repositoriesModule = module {
    single<UserRepository> { provideUserRepository(get()) }
}

fun provideUserRepository(userApi: UserAPI): UserRepositoryImpl {
    return UserRepositoryImpl(
        userAPI = userApi
    )
}
