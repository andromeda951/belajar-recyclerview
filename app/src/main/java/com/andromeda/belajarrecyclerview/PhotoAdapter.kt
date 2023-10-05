package com.andromeda.belajarrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PhotoAdapter(private val listPhoto: List<PhotoModel>, private val listener: OnAdapterListener) :
    RecyclerView.Adapter<PhotoAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView = view.findViewById<ImageView>(R.id.image_view)
        val textView = view.findViewById<TextView>(R.id.text_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.adapter_photo, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setImageResource(listPhoto[position].image)
        holder.textView.text = listPhoto[position].name
        holder.itemView.setOnClickListener {
            listener.onClick(listPhoto[position])
        }
    }

    override fun getItemCount(): Int {
        return listPhoto.size
    }

    interface OnAdapterListener {
        fun onClick(photo: PhotoModel)
    }
}