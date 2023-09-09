package com.example.helloworld

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /* var usuariologeado = "Juan Valladares"

        var textoHola = findViewById<TextView>(R.id.txthola)

    textoHola.text = usuariologeado*/

        /*val plaintextUsername = findViewById<EditText>(R.id.editTextText)
        val btnSaludar = findViewById<Button>(R.id.button)

        btnSaludar.setOnClickListener{
          val myToas =  Toast.makeText(this, "Hola Bienvenido ${plaintextUsername.text}", Toast.LENGTH_LONG)

            myToas.show()*/
        val plaintextSuma1 = findViewById<EditText>(R.id.Suma1)
        val plaintextSuma2 = findViewById<EditText>(R.id.Suma2)
        val btnCalcular = findViewById<Button>(R.id.btncalcular)

        btnCalcular.setOnClickListener{
            val resul = plaintextSuma1.text.toString().toInt() + plaintextSuma2.text.toString().toUInt()

            resul.show()
        }


        }
    }
