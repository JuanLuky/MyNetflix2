package com.juanluky.mynetflix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PlayerFilmesActivity : AppCompatActivity() {

    lateinit var buttonClose: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_filmes)

        buttonClose = findViewById( R.id.Button_close)
        buttonClose.setOnClickListener {
            finish()
        }
    }
}