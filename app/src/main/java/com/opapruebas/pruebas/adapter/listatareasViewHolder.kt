package com.opapruebas.pruebas.adapter

import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.opapruebas.pruebas.R
import com.opapruebas.pruebas.Tareas

class listatareasViewHolder(val view:View):ViewHolder(view) {
    val tareacheck = view.findViewById<CheckBox>(R.id.tareas)
    val tareanombre = view.findViewById<TextView>(R.id.nombretarea)
    fun render (tareasmodel:Tareas){
        tareacheck.isChecked = tareasmodel.estado.equals("1")
        tareanombre.text = tareasmodel.nombreTarea
    }
}