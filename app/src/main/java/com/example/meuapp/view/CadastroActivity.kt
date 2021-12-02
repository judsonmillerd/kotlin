package com.example.meuapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuapp.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
        setTitle("Adicionar Novo PET")

        val intent = getIntent()
        intent.getCharSequenceExtra("id")



        val botao = findViewById<FloatingActionButton>(R.id.button2)
        botao.setOnClickListener {
            val intent = intent(this, CadastroActivity::class.java)
            startActivity(intent)
            finish()

        }
}