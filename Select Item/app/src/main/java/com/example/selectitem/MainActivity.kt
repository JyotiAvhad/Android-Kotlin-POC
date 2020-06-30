package com.example.selectitem

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val colorList = arrayListOf("Red", "Yellow", "Blue", "Green", "White", "Black")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        tv_selectItem.text="Black"  //set text


        //on btn click select a random color in a given list array
        et_selectItem.setOnClickListener {

            val random = Random()
            val randomColor = random.nextInt(colorList.count())

            tv_selectItem.text = colorList[randomColor]
        }

//        //use of intent to open new activity in kotlin
//        iv_add_color.setOnClickListener {
//
//            val intent=Intent(this,AddColorsActivity::class.java)
//            startActivity(intent)
//        }


        btn_add_color.setOnClickListener {

            val newColor=et_add_color.text.toString()
            colorList.add(newColor)
            et_add_color.text.clear()
            println(colorList)
        }

    }
}
