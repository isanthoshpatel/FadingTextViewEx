package com.example.fadingtextviewex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tomer.fadingtextview.FadingTextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        bt1.setOnClickListener {
            fadingtv.setTexts(arrayOf("Hello!","How","are","you","there"))
            fadingtv.setTimeout(200, TimeUnit.MILLISECONDS)
            fadingtv.forceRefresh()
        }
    }
}
