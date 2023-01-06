package com.opapruebas.pruebas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.opapruebas.pruebas.adapter.listaTareasAdapter
import com.opapruebas.pruebas.databinding.ActivityListaTareasBinding

class listaTareas : AppCompatActivity() {


    private lateinit var binding: ActivityListaTareasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListaTareasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        iniReciclerview()
    }
    private fun iniReciclerview(){
        val reclerview = findViewById<RecyclerView>(R.id.reciclerListadetareas)
        reclerview.layoutManager = LinearLayoutManager(this)
        reclerview.adapter = listaTareasAdapter(TareasProvider.listaTareas)
    }

}