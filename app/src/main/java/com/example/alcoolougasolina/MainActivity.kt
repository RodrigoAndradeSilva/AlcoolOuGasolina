package com.example.alcoolougasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val valorAlcoolCampo = findViewById<EditText>(R.id.edit_text_alcool_valor)
        val valorGasolinaCampo = findViewById<EditText>(R.id.edit_text_gasolina_valor)
        val botao = findViewById<Button>(R.id.button_calcular)

        botao.setOnClickListener {
            val valorAlcool = valorAlcoolCampo.text.toString().toDouble()
            val valorGasolina = valorGasolinaCampo.text.toString().toDouble()

            val textMelhorEscolha = findViewById<TextView>(R.id.text_view_melhor_escolha)

            if ((valorGasolina * 0.7) < valorAlcool) {
                // avisar que abastecer com gasolina é melhor
                textMelhorEscolha.text = getString(R.string.a_melhor_escolha_e_abastecer_gasolina)
            } else {
                // avisar que abastecer com alcool é melhor
                textMelhorEscolha.text = getString(R.string.a_melhor_escolha_e_abastecer_alcool)
            }
        }
    }
}