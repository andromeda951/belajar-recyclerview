package com.andromeda.belajarrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val names = listOf<String>(
            "Andromeda",
            "Joko",
            "Budi",
            "Andi",
            "Adit",
            "Tono",
            "Ani",
            "Toni",
        )

        val mainAdaper = MainAdapter(names)
        findViewById<RecyclerView>(R.id.recycler_view).adapter = mainAdaper
    }
}