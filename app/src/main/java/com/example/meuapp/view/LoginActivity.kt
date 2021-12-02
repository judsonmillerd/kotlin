package com.example.meuapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.meuapp.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val butao = findViewById<Button>(R.id.BtnEntrar)

        botao.setOnClickListener {
            val intent = intent(this, ListaActivity::class.java)
            startActivity(intent)
        }

    }
}