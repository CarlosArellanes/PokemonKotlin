package com.ajrobseyer.pokemonkotlin.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ajrobseyer.pokemonkotlin.R


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


}