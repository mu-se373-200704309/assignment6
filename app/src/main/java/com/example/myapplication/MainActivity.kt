package com.example.myapp

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapp.databinding.ActivityMainBinding
import java.util.prefs.AbstractPreferences

class MainActivity : AppCompatActivity() {
    lateinit var preferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {



        binding.btnLogin.setOnClickListener{

            intent = Intent(applicationContext, MainRegister::class.java)
            startActivity(intent)

        }
        binding.btnRegister.setOnClickListener{
            intent = Intent(applicationContext, MainRegister::class.java)
            startActivity(intent)

        }

    }}
