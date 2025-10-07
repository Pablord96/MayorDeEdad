package com.example.mayoredad

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.example.mayoredad.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val numero : EditText = findViewById<EditText>(R.id.editTextText)
        val boton : Button = findViewById<Button>(R.id.button)
        val texto : TextView = findViewById<TextView>(R.id.textView2)

        boton.setOnClickListener {
            val numeroResultado = numero.text.toString().toInt()
            if(numeroResultado<18){
                texto.text="Eres Menor de Edad"
            }else if (numeroResultado>18){
                texto.text="Eres Mayor de Edad"
            }else{
                texto.text="Tienes justo 18 años"
            }
        }

    }
}