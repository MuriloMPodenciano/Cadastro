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

        with(amb){
            salvarBt.setOnClickListener {
                "Nome Completo: ${nomecompletoEt.text}".also {
                    Toast.makeText(
                        this@MainActivity,
                        it,
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }
}