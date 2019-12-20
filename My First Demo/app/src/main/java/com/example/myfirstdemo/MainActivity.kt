package com.example.myfirstdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

// Class declarations and extending AppCompatActivity
class MainActivity : AppCompatActivity() {

    // Overriding class methods, No need of @ annotation.
    override fun onCreate(savedInstanceState: Bundle?) //savedInstanceState can be null or Bundle type.
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //local variable declaration (can be either val or var)
        val helloKotlin = "Hello Kotlin...!"
        displayHelloKotlin(helloKotlin)

    }

    // Private function declaration
    private fun displayHelloKotlin(helloKotlin: String) {

        // We can directly call the id of the textView
        tvHelloKotlin.text = helloKotlin
    }
}