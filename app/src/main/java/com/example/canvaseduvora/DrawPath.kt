package com.example.canvaseduvora

import Stroke
import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import androidx.core.graphics.drawable.toDrawable
import java.util.jar.Attributes

class DrawPath @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null, defStyleAttr: Int =0
): View(context, attrs, defStyleAttr)



{
    var lastpath = Path()
    var lastColor: Int =0
    var currentColor:Int = 0
    private var paint: Paint? = null;
    private var path: Path? = null
    init{
        paint = Paint()
        path = Path()
        paint!!.color = Color.BLUE
        paint!!.strokeWidth = 10f;
        paint!!.style= Paint.Style.STROKE
        paint!!.isAntiAlias = true
    }

    override fun onDraw(canvas: Canvas?){

        canvas!!.save()
        canvas!!.drawPath(path!!, paint!!)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        val xPos: Float = event!!.x
        val yPos: Float = event!!.y
        when(event!!.action){
            MotionEvent.ACTION_DOWN->{
               path!!.moveTo(xPos,yPos)

            }
            MotionEvent.ACTION_MOVE->{
                path!!.lineTo(xPos,yPos)
                lastpath = path!!
                lastColor = paint!!.color
            }
            MotionEvent.ACTION_UP->{

            }
            else ->{

            }
        }
       invalidate()

        return true
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)


    }
    fun setStrokeColor(color:Int){
        paint!!.color = color
        currentColor = color
    }
}