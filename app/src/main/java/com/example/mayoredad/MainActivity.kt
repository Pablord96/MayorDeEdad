package com.example.mayoredad

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numero: EditText = findViewById(R.id.editTextText)
        val boton: Button = findViewById(R.id.button)
        val texto: TextView = findViewById(R.id.textView2)
        val botonSumar: Button = findViewById(R.id.buttonSumar)
        val botonRestar: Button = findViewById(R.id.buttonRestar)

        fun actualizarMensaje(edad: Int) {
            when {
                edad < 18 -> texto.text = "Eres Menor de Edad"
                edad > 18 -> texto.text = "Eres Mayor de Edad"
                else -> texto.text = "Tienes justo 18 años"
            }
        }

        boton.setOnClickListener {
            val edad = numero.text.toString().toIntOrNull()
            if (edad != null) {
                actualizarMensaje(edad)
            } else {
                texto.text = "Introduce un número válido"
            }
        }

        botonSumar.setOnClickListener {
            val edad = numero.text.toString().toIntOrNull() ?: 0
            val nuevaEdad = edad + 1
            numero.setText(nuevaEdad.toString())
            actualizarMensaje(nuevaEdad)
        }

        botonRestar.setOnClickListener {
            val edad = numero.text.toString().toIntOrNull() ?: 0
            val nuevaEdad = if (edad > 0) edad - 1 else 0
            numero.setText(nuevaEdad.toString())
            actualizarMensaje(nuevaEdad)
        }
    }
}
