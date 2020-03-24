package app.sano.picchi.a1_kt_dentaku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    var number1 : Int = 0
    var number2 : Int = 0
    var number3 : Int = 0
    var ope : Int = 0




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun one(v:View){
        number1 = number1*10 + 1
        textView.text= number1.toString()
    }

    fun two(v:View){
        number1 = number1*10 + 2
        textView.text = number1.toString()

    }

    fun plus(v:View){
        number2 = number1
        number1 = 0
        ope = 1
    }

    fun minus(v:View){
        number2 = number1
        number1 = 0
        ope = 2
    }


    fun equal(v:View){
        when(ope){
            1 -> number3 = number1+ number2
            2 -> number3 = number2 - number1
        }
        textView.text = number3.toString()
    }



}
