package com.opapruebas.pruebas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.opapruebas.pruebas.databinding.ActivityPantallaSaludoBinding

class PantallaSaludo : AppCompatActivity() {
    private lateinit var binding: ActivityPantallaSaludoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPantallaSaludoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getNombre()
        binding.tareas.setOnClickListener { iratarea() }
        binding.buttonSalir.setOnClickListener { onBackPressed() }
    }
    public fun getNombre(){
        val bundle = intent.extras
        val nombre = bundle?.get("nombre")
        if (nombre.toString().contains("Brandon")){
            binding.textViewSaludo.text = "Vale que Todo bien"
        }else{
            binding.textViewSaludo.text = "Saludos $nombre"
        }

    }
    fun iratarea() {
        intent = Intent(this, listaTareas::class.java)
        startActivity(intent)

    }


}