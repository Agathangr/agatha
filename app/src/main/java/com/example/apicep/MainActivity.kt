package com.example.apicep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apicep.api.RetrofitHelper
import com.example.apicep.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val retrofit by lazy {
        RetrofitHelper.retrofit
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}