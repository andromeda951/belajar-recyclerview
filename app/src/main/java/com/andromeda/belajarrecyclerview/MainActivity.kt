package com.andromeda.belajarrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        textAdapter()
        numberAdapter()

    }

    private fun textAdapter() {
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

        Log.e("MainActivity", "size: ${names.size}")
        names.forEach {
            Log.e("MainActivity", it)
        }

        val textAdaper = TextAdapter(names)
        findViewById<RecyclerView>(R.id.recycler_view).adapter = textAdaper
    }

    private fun numberAdapter() {
        val numbers = listOf<Int>(
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            8,
            9,
        )

        val numberAdaper = NumberAdapter(numbers)
        findViewById<RecyclerView>(R.id.recycler_view).adapter = numberAdaper
    }
}