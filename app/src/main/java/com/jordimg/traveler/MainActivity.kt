package com.jordimg.traveler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botoncomida = findViewById<Button>(R.id.botoncomida)
        botoncomida.setOnClickListener {
            Toast.makeText(this,"Probando botón de imagen",Toast.LENGTH_SHORT).show()
        }
    }
}