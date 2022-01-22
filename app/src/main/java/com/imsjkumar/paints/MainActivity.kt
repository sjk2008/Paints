package com.imsjkumar.paints

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.imsjkumar.paints.PaintView.Companion.colorList
import com.imsjkumar.paints.PaintView.Companion.currentBrush
import com.imsjkumar.paints.PaintView.Companion.pathList

class MainActivity : AppCompatActivity() {

    companion object {
        var path = Path()
        val paintBrush = Paint()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val red_btn = findViewById<ImageButton>(R.id.redBTN)
        val blue_btn = findViewById<ImageButton>(R.id.blueBTN)
        val saffron_btn = findViewById<ImageButton>(R.id.saffronBTN)
        val erase_btn = findViewById<ImageButton>(R.id.eraserBTN)
        val black_btn = findViewById<ImageButton>(R.id.blackBTN)


        red_btn.setOnClickListener {
            paintBrush.color = Color.RED
            currentColor(paintBrush.color)
            Toast.makeText(this,"RED Clicked",Toast.LENGTH_SHORT).show()
        }
        blue_btn.setOnClickListener {
            paintBrush.color = Color.BLUE
            currentColor(paintBrush.color)
        }
        saffron_btn.setOnClickListener {
            paintBrush.color = Color.CYAN
            currentColor(paintBrush.color)
        }
        erase_btn.setOnClickListener {
            pathList.clear()
            colorList.clear()
            path.reset()
        }
        black_btn.setOnClickListener {
            paintBrush.color = Color.BLACK
            currentColor(paintBrush.color)
        }
    }

    private fun currentColor(color: Int){
        currentBrush = color
        path = Path()
    }


}