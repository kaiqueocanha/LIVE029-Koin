package com.example.livekoin.repositories

import com.example.livekoin.api.UserAPI
import com.example.livekoin.models.User

class UserRepositoryImpl(
    private val userAPI: UserAPI
) : UserRepository {

    override suspend fun getAllUsers(): List<User> = userAPI.getAllUsers()

}