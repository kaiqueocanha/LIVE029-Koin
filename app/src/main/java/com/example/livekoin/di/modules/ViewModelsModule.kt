package com.example.livekoin.di.modules

import com.example.livekoin.repositories.UserRepository
import com.example.livekoin.viewmodels.UserViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelsModule = module {
    viewModel { provideUserViewModel(get()) }
}

fun provideUserViewModel(userRepository: UserRepository): UserViewModel {
    return UserViewModel(
        userRepository = userRepository
    )
}
