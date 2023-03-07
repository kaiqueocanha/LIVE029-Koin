package com.example.livekoin.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.livekoin.databinding.ActivityMainBinding
import com.example.livekoin.viewmodels.UserViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val userViewModel : UserViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button.setOnClickListener {

            userViewModel.getAllUsers()

        }

    }
}