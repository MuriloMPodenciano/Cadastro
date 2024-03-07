package com.example.cadastro

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
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
            val check = if(emailCb.isChecked) "Sim" else "Não"
            salvarBt.setOnClickListener {
                val formulario = Formulario(
                    nomecompletoEt.text.toString(),
                    telefoneEt.text.toString(),
                    emailEt.text.toString(),
                    check,
                    sexo,
                    cidadeEt.text.toString(),
                    ufSp.selectedItem.toString()
                    ).toString().also {
                        Toast.makeText(this@MainActivity, it, Toast.LENGTH_SHORT).show()
                }
            }
            limparBt.setOnClickListener {
                nomecompletoEt.text.clear()
                telefoneEt.text.clear()
                emailEt.text.clear()
                emailCb.setChecked(false)
                masculinoRb.isChecked = true
                cidadeEt.text.clear()
                ufSp.setSelection(0)
            }
        }
    }
}