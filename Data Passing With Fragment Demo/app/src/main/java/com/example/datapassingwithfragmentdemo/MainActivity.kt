package com.example.datapassingwithfragmentdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

//send data of fragment 1 to main activity then main activity to fragment 2
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        transaction.add(R.id.frame_one, firstFragment)
        transaction.add(R.id.frame_two, secondFragment)
        transaction.commit()
    }

    fun showData(name: String?, pwd: String?) {

        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()

        //we send data to fragment 2
        val secondFragment = SecondFragment()

        //for sending data
        val bundle2 = Bundle()
        bundle2.putString("name", name)
        bundle2.putString("pwd", pwd)

        secondFragment.arguments = bundle2
        transaction.add(R.id.frame_two, secondFragment)
        transaction.commit()
    }
}
