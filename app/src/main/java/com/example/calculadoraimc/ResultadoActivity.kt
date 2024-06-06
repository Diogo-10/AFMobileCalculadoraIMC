package com.example.calculadoraimc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculadoraimc.databinding.ActivityResultadoBinding


class ResultadoActivity : DebugActivity() {

    private val binding by lazy {
        ActivityResultadoBinding.inflate(layoutInflater)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.calcularButton.setOnClickListener{
            val peso = binding.pesoEdit.text.toString().toDouble()
            val altura = binding.alturaEdit.text.toString().toDouble()
            if (peso != null && altura != null){
                calcularIMC(altura, peso)
            } else {
                binding.resultadoIMC.text = "Erro insira valores válidos."
            }


        }



    }

    private fun calcularIMC(altura: Double, peso: Double){
        val usuario = Usuario(peso, altura)
        val imc = usuario.calcularIMC()
        val descricao = usuario.descricaoIMC()
        binding.resultadoIMC.text = "IMC: %.2f - %s".format(imc, descricao)
    }

}

class Usuario(val peso:Double, val altura:Double){

    fun calcularIMC(): Double = peso / (altura * altura)

    fun descricaoIMC(): String {
        val imc = calcularIMC()

        return when{
            imc < 18.5 -> "Abaixo do peso"
            imc < 24.9 -> "Peso normal"
            imc < 29.9 -> "Sobrepeso"
            imc < 34.9 -> "Obesidade Grau I"
            imc < 39.9 -> "Obesidade grau II"
            else -> "Obesidade grau II"
        }
    }

}