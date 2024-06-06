package com.example.calculadoraimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.calculadoraimc.databinding.ActivityMainBinding
import com.example.calculadoraimc.databinding.ActivityMainBinding.*

class MainActivity : DebugActivity() {

    private val binding by lazy {
        inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)




        binding.entraButton.setOnClickListener {
            Toast.makeText(this,"Login feito com sucesso!", Toast.LENGTH_LONG).show()

            val intent = Intent(this, ResultadoActivity::class.java)
            startActivity(intent)
        }

    }
}