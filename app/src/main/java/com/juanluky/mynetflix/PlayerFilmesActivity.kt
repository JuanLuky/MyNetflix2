package com.juanluky.mynetflix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.juanluky.mynetflix.databinding.ActivityPlayerFilmesBinding

class PlayerFilmesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPlayerFilmesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlayerFilmesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dados = intent.extras
        var namesFilme = dados?.getString("player")
        var imgFilme = dados?.getInt("imagem")

        binding.nomeFilme.text = (namesFilme)
        binding.capaFIlme.setImageResource(imgFilme!!)

        binding.ButtonClose.setOnClickListener {
            finish()
        }
    }
}