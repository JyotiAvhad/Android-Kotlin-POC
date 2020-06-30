package com.example.seekbardemo

import android.os.Bundle
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val initValue = textView.translationY

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {

                //set text equal to current progress of seek bar
                textView.text = progress.toString()

                //animate text view
                //create immutable variable
                val distance =
                    (initValue + progress * resources.getDimension(R.dimen.text_animated_steps) * -1)      //here -1is because negative Y is upwards

                //call animate on text view
                textView.animate().translationY(distance)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }

        })

        //lambda
        button.setOnClickListener { v ->        //v parameter is of type View

            seekBar.progress=0
            textView.animate().setDuration(500).rotationBy(360f)    //rotation by 360f is one full circle
                .translationY(initValue)


        }
    }
}
