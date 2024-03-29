package me.about.khan.zian.hasan.colormyview

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> = listOf(
            box_one, box_two, box_three
            , box_four, box_five, content, red_button
            , green_button, yellow_button
        )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }


    }

    private fun makeColored(view: View) {
        when (view.id) {
            R.id.box_one -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two -> view.setBackgroundColor(Color.GRAY)

            R.id.box_three -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five -> view.setBackgroundResource(android.R.color.holo_green_light)

            R.id.red_button -> box_three.setBackgroundResource(R.color.my_red)
            R.id.green_button -> box_four.setBackgroundResource(R.color.my_green)
            R.id.yellow_button -> box_five.setBackgroundResource(R.color.my_yellow)


            else -> view.setBackgroundColor(Color.LTGRAY)


        }


    }
}
