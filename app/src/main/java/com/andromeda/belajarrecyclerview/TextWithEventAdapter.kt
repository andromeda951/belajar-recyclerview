package com.andromeda.belajarrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class TextWithEventAdapter(private val listName: List<String>, private val context: Context) :
    RecyclerView.Adapter<TextWithEventAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name = view.findViewById<TextView>(R.id.text_name)
        val container = view.findViewById<ConstraintLayout>(R.id.container)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.adapter_main, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val name = listName[position]
        holder.name.text = name
        holder.container.setOnClickListener {
            Toast.makeText(context, name, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return listName.size
    }
}