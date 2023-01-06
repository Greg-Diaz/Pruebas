package com.opapruebas.pruebas.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.opapruebas.pruebas.R
import com.opapruebas.pruebas.Tareas

class listaTareasAdapter(private val tareaslist:List<Tareas>) : RecyclerView.Adapter<listatareasViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): listatareasViewHolder {
    val layoutInflater = LayoutInflater.from(parent.context)
        return listatareasViewHolder(layoutInflater.inflate(R.layout.itrem_tareas, parent, false))
    }

    override fun onBindViewHolder(holder: listatareasViewHolder, position: Int) {
    val item = tareaslist[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return tareaslist.size
    }

}