package edu.tcu.tanmaykejriwal.people_counter_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val count_view = findViewById<TextView>(R.id.count_txt)
        val increase_btn = findViewById<Button>(R.id.increase_btn)
        val reset_btn = findViewById<Button>(R.id.reset_btn)
        var counter = 0
        count_view.setText(""+counter)

        increase_btn.setOnClickListener{
            //possible to pass a function in method , lambda expression
            count_view.text=(++counter).toString()
        }
        reset_btn.setOnClickListener{
            Toast.makeText(this, "Count before reset was "+ counter, Toast.LENGTH_SHORT).apply {
                //If you want some margin from top to toast you can set yOffSet value
                setGravity(Gravity.TOP, 0, 50)
                show()
            }
            counter=0
            count_view.text=(counter).toString()
        }

    }
}