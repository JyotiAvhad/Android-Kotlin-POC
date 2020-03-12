package com.example.alertdialogdemo

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_clickMe.setOnClickListener {

            //alert dialog box
            val builder = AlertDialog.Builder(this@MainActivity)

            builder.setTitle("Hello...!")
                .setMessage("Do you want to close this application...?")
                .setCancelable(false)
                .setPositiveButton("Yes") { dialog, which ->

                    //to close the app
                    finish()
                    Toast.makeText(this@MainActivity, "Bye :-(", Toast.LENGTH_SHORT).show()

                }
                .setNegativeButton("No"){ dialog, which ->

                    Toast.makeText(this@MainActivity, "Cool :-)", Toast.LENGTH_SHORT).show()

                }


            //create dialog box
            val alertDialog = builder.create()
            alertDialog.show()

        }
    }
}
