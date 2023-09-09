package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /* var usuariologeado = "Juan Valladares"

        var textoHola = findViewById<TextView>(R.id.txthola)

    textoHola.text = usuariologeado*/

        val plaintextUsername = findViewById<EditText>(R.id.editTextText)
        val btnSaludar = findViewById<Button>(R.id.button)

        btnSaludar.setOnClickListener{
          val myToas =  Toast.makeText(this, "Hola Bienvenido ${plaintextUsername.text}", Toast.LENGTH_LONG)

            myToas.show()
        }
    }
}