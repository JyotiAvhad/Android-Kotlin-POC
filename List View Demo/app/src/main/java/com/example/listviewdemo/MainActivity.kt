package com.example.listviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //getting the list of items from the strings.xml file using getStringArray()
        val language: Array<String> = resources.getStringArray(R.array.technology_list)

        //ArrayAdapter class initialized with the application context, sets the resource type of list and array items as an argument
        val arrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, language)

        //sets the adapter to the ListView
        listView.adapter = arrayAdapter
        listView.onItemClickListener =
            AdapterView.OnItemClickListener { adapterView, view, position, id ->

                val selectedItem = adapterView.getItemAtPosition(position) as String
                val itemIdAtPos = adapterView.getItemIdAtPosition(position)

                Toast.makeText(
                    applicationContext,
                    "Hieee.... hi :-) You click item $selectedItem & its position is $itemIdAtPos",
                    Toast.LENGTH_SHORT
                ).show()

            }
    }
}
