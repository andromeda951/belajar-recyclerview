package com.andromeda.belajarrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        textAdapter()
//        numberAdapter()
//        imageAdapter()
//        textWithEventAdapter()
//        textWithEventAdapter2()
        photoAdapter()


    }

    private fun photoAdapter() {
        val photo = listOf<PhotoModel>(
            PhotoModel(1, "Photo 1", R.drawable.photo_1),
            PhotoModel(2, "Photo 2", R.drawable.photo_2),
            PhotoModel(3, "Photo 3", R.drawable.photo_3),
            PhotoModel(4, "Photo 4", R.drawable.photo_4),
            PhotoModel(5, "Photo 5", R.drawable.photo_5),
            PhotoModel(6, "Photo 6", R.drawable.photo_6),
        )

        val photoAdapter = PhotoAdapter(photo)
        findViewById<RecyclerView>(R.id.recycler_view).apply {
            adapter = photoAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }

    }

    private fun textWithEventAdapter2() {
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

        val textAdaper = TextWithEventAdapter2(names, object: TextWithEventAdapter2.OnAdapterListener{
            override fun onClick(name: String) {
                Toast.makeText(this@MainActivity, name, Toast.LENGTH_SHORT).show()
            }

        })
        findViewById<RecyclerView>(R.id.recycler_view).adapter = textAdaper
        findViewById<RecyclerView>(R.id.recycler_view).layoutManager = LinearLayoutManager(this)
    }


    private fun textWithEventAdapter() {
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

        val textAdaper = TextWithEventAdapter(names, this)
        findViewById<RecyclerView>(R.id.recycler_view).adapter = textAdaper
        findViewById<RecyclerView>(R.id.recycler_view).layoutManager = LinearLayoutManager(this)
    }

    private fun imageAdapter() {
        val images = listOf<Int>(
            R.drawable.photo_1,
            R.drawable.photo_2,
            R.drawable.photo_3,
            R.drawable.photo_4,
            R.drawable.photo_5,
            R.drawable.photo_6,
        )

        val imageAdapter = ImageAdapter(images)
        findViewById<RecyclerView>(R.id.recycler_view).adapter = imageAdapter
//        findViewById<RecyclerView>(R.id.recycler_view).layoutManager = LinearLayoutManager(this)

//        Try this and comment in activity_main.xml
//        findViewById<RecyclerView>(R.id.recycler_view).layoutManager = GridLayoutManager(this, 2)

//        Assign recycler_view to an object
//        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
//        recyclerView.adapter = imageAdapter
//        recyclerView.layoutManager = LinearLayoutManager(this)

//        Using apply
//        findViewById<RecyclerView>(R.id.recycler_view).apply {
//            adapter = imageAdapter
//            layoutManager = LinearLayoutManager(this@MainActivity)
//        }

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