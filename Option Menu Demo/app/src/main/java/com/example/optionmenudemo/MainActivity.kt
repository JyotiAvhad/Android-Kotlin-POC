package com.example.optionmenudemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.option_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item!!.itemId){
            R.id.firstMenu -> Toast.makeText(this,"You Select First Menu",Toast.LENGTH_SHORT).show()
            R.id.secondMenu -> Toast.makeText(this,"You Select Second Menu",Toast.LENGTH_SHORT).show()
            R.id.thirdMenu -> Toast.makeText(this,"You Select Third Menu",Toast.LENGTH_SHORT).show()
            R.id.fourthMenu -> Toast.makeText(this,"You Select Fourth Menu",Toast.LENGTH_SHORT).show()
            R.id.fifthMenu -> Toast.makeText(this,"You Select Fifth Menu",Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}
