package com.example.myfirstdemo

import android.os.Bundle
import android.text.TextUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

// Class declarations and extending AppCompatActivity
class MainActivity : AppCompatActivity() {

    // Overriding class methods, No need of @ annotation.
    override fun onCreate(savedInstanceState: Bundle?) //savedInstanceState can be null or Bundle type.
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //local variable declaration (can be either val or var)
        val helloKotlin = "Kotlin"
        displayHelloKotlin(helloKotlin)

        tv_kotlin_text.text =
            "Kotlin is a cross-platform, statically typed, general-purpose programming language with type inference. " +
                    "Kotlin is designed to inter-operate fully with Java, and the JVM version of its standard library depends on the Java Class Library, " +
                    "but type inference allows its syntax to be more concise."

        //to set text in a single line
        tv_kotlin_text.setSingleLine()

        //to set text scrollable or flowable automatically in a single line
        tv_kotlin_text.ellipsize = TextUtils.TruncateAt.MARQUEE
        //-1 so scrolling will happen infinite times. If we give 1, then scrolling will happen only once.
        tv_kotlin_text.marqueeRepeatLimit = -1
        tv_kotlin_text.isSelected = true


    }

    // Private function declaration
    private fun displayHelloKotlin(helloKotlin: String) {

        // We can directly call the id of the textView
        tv_HelloKotlin.text = helloKotlin
    }

}