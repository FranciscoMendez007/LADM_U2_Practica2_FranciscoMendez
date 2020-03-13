package mx.edu.ittepic.ladm_u2_practica2_franciscomendez

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class Lienzo(p:MainActivity) : View(p) {

    var circulo = FiguraGeometrica(350, 150, 10)
    var circulo1 = FiguraGeometrica(190, 150, 200)
    var circulo2 = FiguraGeometrica(120, 1200, 50)
    var circulo3 = FiguraGeometrica(550, 1100, 100)
    var circulo4 = FiguraGeometrica(1000, 100, 30)
    var circulo5 = FiguraGeometrica(60, 900, 150)
    var circulo6 = FiguraGeometrica(70, 750, 75)
    var circulo7 = FiguraGeometrica(10, 1400, 200)
    var circulo8 = FiguraGeometrica(50, 200, 100)
    var circulo9 = FiguraGeometrica(400, 10, 60)

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()

        canvas.drawColor(Color.BLACK)

        //Dibujando un círculo rojo con contorno blanco
        paint.style = Paint.Style.FILL
        paint.color = Color.GREEN
        circulo.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo.pintar(canvas, paint)

        //Dibujando Primer ciculo
        paint.style = Paint.Style.FILL
        paint.color = Color.GREEN
        circulo1.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo1.pintar(canvas, paint)

        //Dibujando Segundo ciculo
        paint.style = Paint.Style.FILL
        paint.color = Color.GREEN
        circulo2.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo2.pintar(canvas, paint)

        //Dibujando Tercer ciculo
        paint.style = Paint.Style.FILL
        paint.color = Color.GREEN
        circulo3.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo3.pintar(canvas, paint)

        //Dibujando Cuarto ciculo
        paint.style = Paint.Style.FILL
        paint.color = Color.GREEN
        circulo4.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo4.pintar(canvas, paint)

        //Dibujando Quinto ciculo
        paint.style = Paint.Style.FILL
        paint.color = Color.GREEN
        circulo5.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo5.pintar(canvas, paint)

        //Dibujando Sexto ciculo
        paint.style = Paint.Style.FILL
        paint.color = Color.GREEN
        circulo6.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo6.pintar(canvas, paint)

        //Dibujando Septimo ciculo
        paint.style = Paint.Style.FILL
        paint.color = Color.GREEN
        circulo7.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo7.pintar(canvas, paint)

        //Dibujando Octavo ciculo
        paint.style = Paint.Style.FILL
        paint.color = Color.GREEN
        circulo8.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo8.pintar(canvas, paint)

        //Dibujando Noveno ciculo
        paint.style = Paint.Style.FILL
        paint.color = Color.GREEN
        circulo9.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo9.pintar(canvas, paint)

    }

    fun animarCirculo() {
        circulo.reboteRR(width, height)
        circulo1.reboteL(width, height)
        circulo2.rebote(width, height)
        circulo3.rebote(width, height)
        circulo4.reboteR(width, height)
        circulo5.reboteL(width, height)
        circulo6.reboteR(width, height)
        circulo7.reboteL(width, height)
        circulo8.rebote(width, height)
        circulo9.reboteR(width, height)

        invalidate()
    }

}