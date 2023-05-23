package com.juanluky.mynetflix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var buttonOpen: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonOpen = findViewById( R.id.Button_player)
        buttonOpen.setOnClickListener {
            val intent = Intent(this, PlayerFilmesActivity::class.java)
            startActivity(intent)
        }
    }
}