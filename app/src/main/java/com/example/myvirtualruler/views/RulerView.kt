package com.example.myvirtualruler.views

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Paint.ANTI_ALIAS_FLAG
import android.util.AttributeSet
import android.view.View

class RulerView(context: Context, attrs: AttributeSet ) : View(context, attrs) {

    private val linePaint: Paint = Paint(ANTI_ALIAS_FLAG).apply {
        strokeWidth = 3f
        color = Color.GRAY
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.apply {
            drawLine(50f, 100f, 600f, 600f, linePaint)
        }
    }
}