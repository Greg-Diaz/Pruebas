package com.opapruebas.pruebas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.opapruebas.pruebas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonEnviar.setOnClickListener{checkValue()}

    }
     fun checkValue(){

        if (binding.textEditNombre.text.toString().isEmpty()){
            Toast.makeText(this, "Por favor escriba su nombre", Toast.LENGTH_SHORT).show()
        }else{
            intent = Intent(this, PantallaSaludo::class.java)
            intent.putExtra("nombre",binding.textEditNombre.text.toString() )
            startActivity(intent)
        }
    }
}