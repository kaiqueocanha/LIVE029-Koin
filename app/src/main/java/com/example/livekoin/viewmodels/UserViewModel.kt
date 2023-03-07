package com.example.livekoin.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.livekoin.repositories.UserRepository
import kotlinx.coroutines.launch

class UserViewModel(
    private val userRepository: UserRepository,
) : ViewModel() {

    fun getAllUsers() = viewModelScope.launch {

        val users = userRepository.getAllUsers()

        for(user in users){
            Log.i("Kaique", user.login)
        }

        /**
         * Ataualiza a view, trata erro, LiveData
         */

    }

}