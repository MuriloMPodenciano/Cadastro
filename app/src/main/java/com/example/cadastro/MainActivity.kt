package com.example.cadastro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.cadastro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var amb: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(amb.root)

        amb.mainTb.apply {
            title = getString(R.string.app_name)
            setSupportActionBar(this)
        }

        with(amb) {
            val sexo = if (masculinoRb.isChecked) "Masculino" else "Feminino"
            salvarBt.setOnClickListener {
                val nome = nomecompletoEt.text.toString()
                val telefone = telefoneEt.text.toString()
                val email = emailEt.text.toString()
                val sexo = sexo
                val cidade = cidadeEt.text.toString()
                val uf = ufSp.selectedItem.toString()
            }
        }
    }
}