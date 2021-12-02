package com.example.meuapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.controls.actions.FloatAction
import com.example.meuapp.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)
        setTitle("Pet Shop")
        val botao = findViewById<FloatingActionButton>(R.id.AdcPet)
        botao.setOnClickListener {
            val intent = intent(this, CadastroActivity::class.java)
            startActivity(intent)

        }
    }
}