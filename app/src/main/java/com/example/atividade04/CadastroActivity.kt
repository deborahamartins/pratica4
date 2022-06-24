package com.example.atividade04

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_cadastro)
        setSupportActionBar(findViewById(R.id.tbrCadastro))
        setTitle("Adicionar Novo item")

        val botaoSalvar = findViewById<Button>(R.id.btnSalvar)
        botaoSalvar.setOnClickListener {
            finish()
        }

        val botaoCancelar = findViewById<Button>(R.id.btnCancelar)
        botaoCancelar.setOnClickListener {
            finish()
        }
    }
}