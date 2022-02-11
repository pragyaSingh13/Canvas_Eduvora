package com.example.canvaseduvora

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.widget.*
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    lateinit var canvas:DrawPath
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn5:ToggleButton = findViewById(R.id.btn5)
        canvas = findViewById(R.id.canvas)

        btn5.setOnClickListener(View.OnClickListener { view ->
            val layoutInflater:LayoutInflater = applicationContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val view1:View = layoutInflater.inflate(R.layout.color_menu, null)
            val popupWindow = PopupWindow(view1,520, LinearLayout.LayoutParams.WRAP_CONTENT, true)
            var redBtn:Button = view1.findViewById(R.id.redbtn)
                redBtn.setOnClickListener{
                    canvas.setStrokeColor(Color.RED)
                }
            var greenBtn: Button = view1.findViewById(R.id.greenbtn)
                greenBtn.setOnClickListener{
                    canvas.setStrokeColor(Color.GREEN)
                }
            var blueBtn: Button = view1.findViewById(R.id.bluebtn)
                blueBtn.setOnClickListener{
                    canvas.setStrokeColor(ContextCompat.getColor(this, R.color.purple_700))
                }
            var blackBtn: Button = view1.findViewById(R.id.blackbtn)
                blueBtn.setOnClickListener {
                    canvas.setStrokeColor(Color.BLACK)
                }


            popupWindow.showAsDropDown(btn5)
        })
    }


    fun checkBtnClick(view: View){
        val btn1:ToggleButton = findViewById(R.id.btn1)
        val btn2:ToggleButton = findViewById(R.id.bt2)
        val btn3:ToggleButton = findViewById(R.id.bt3)
        val btn4:ToggleButton = findViewById(R.id.btn4)
        val btn5:ToggleButton = findViewById(R.id.btn5)

        when (view.id) {
            btn1.id -> {
                btn2.isChecked = false;
                btn3.isChecked = false;
                btn4.isChecked = false;
                btn5.isChecked = false;
            }
            btn2.id -> {
                btn1.isChecked = false;
                btn3.isChecked = false;
                btn4.isChecked = false;
                btn5.isChecked = false;
            }
            btn3.id -> {
                btn2.isChecked = false;
                btn1.isChecked = false;
                btn4.isChecked = false;
                btn5.isChecked = false;
            }
            btn4.id -> {
                btn2.isChecked = false;
                btn3.isChecked = false;
                btn1.isChecked = false;
                btn5.isChecked = false;
            }
            btn5.id -> {
                btn2.isChecked = false;
                btn3.isChecked = false;
                btn4.isChecked = false;
                btn1.isChecked = false;
            }
        }
    }


}