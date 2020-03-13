package mx.edu.ittepic.ladm_u2_practica2_franciscomendez

import android.graphics.Canvas
import android.graphics.Paint
import android.view.MotionEvent

class FiguraGeometrica () {
    var x = 0f
    var y = 0f
    var radio = 0f
    var ancho = 0f
    var alto = 0f
    var incX = 5
    var incY = 5
    var incYL = 2
    var incXL = 2
    var incXR = 10
    var incYR = 10
    var incXRR = 15
    var incYRR = 15

    constructor(x:Int, y:Int, radio:Int) : this(){
        this.x = x.toFloat()
        this.y = y.toFloat()
        this.radio = radio.toFloat()
    }

    fun pintar(c: Canvas, p: Paint) {
        c.drawCircle(x, y, radio, p)
    }

    fun rebote(ancho:Int, alto:Int){
        x+= incX
        if(x<=-100 || x>=ancho){
            incX *= -1
        }
        y+= incY
        if(y<=-100 || y>=alto){
            incY *= -1
        }

    }
    fun reboteR(ancho:Int,alto:Int){
        x+= incXR
        if(x<=-100 || x>=ancho){
            incXR *= -1
        }
        y+= incYR
        if(y<=-100 || y>=alto){
            incYR *= -1
        }
    }
    fun reboteL(ancho:Int,alto:Int){
        x+= incXL
        if(x<=-100 || x>=ancho){
            incXL *= -1
        }
        y+= incYL
        if(y<=-100 || y>=alto){
            incYL *= -1
        }
    }
    fun reboteRR(ancho:Int,alto:Int){
        x+= incXRR
        if(x<=-100 || x>=ancho){
            incXRR *= -1
        }
        y+= incYRR
        if(y<=-100 || y>=alto){
            incYRR *= -1
        }
    }


}