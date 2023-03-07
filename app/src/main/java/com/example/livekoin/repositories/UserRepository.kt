package com.example.livekoin.repositories

import com.example.livekoin.models.User

interface UserRepository {

    suspend fun getAllUsers() : List<User>

}