package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Exception


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var manhinh = findViewById<TextView>(R.id.manhinh)

        val zero = findViewById<Button>(R.id.btn0)
        val one = findViewById<Button>(R.id.btn1)
        val two = findViewById<Button>(R.id.btn2)
        val three = findViewById<Button>(R.id.btn3)
        val four = findViewById<Button>(R.id.btn4)
        val five = findViewById<Button>(R.id.btn5)
        val six = findViewById<Button>(R.id.btn6)
        val seven = findViewById<Button>(R.id.btn7)
        val eight = findViewById<Button>(R.id.btn8)
        val nine = findViewById<Button>(R.id.btn9)

        val cong = findViewById<Button>(R.id.cong)
        val tru = findViewById<Button>(R.id.tru)
        val nhan = findViewById<Button>(R.id.nhan)
        val chia = findViewById<Button>(R.id.chia)

        val ON = findViewById<Button>(R.id.ON)
        val CE = findViewById<Button>(R.id.CE)
        val bang = findViewById<Button>(R.id.bang)
        val phay = findViewById<Button>(R.id.phay)

        zero.setOnClickListener {
            val a = manhinh.text.toString() + "0"
            manhinh.setText(a)
        }
        one.setOnClickListener {
            val a = manhinh.text.toString() + "1"
            manhinh.setText(a)
        }
        two.setOnClickListener {
            val a = manhinh.text.toString() + "2"
            manhinh.setText(a)
        }
        three.setOnClickListener {
            val a = manhinh.text.toString() + "3"
            manhinh.setText(a)
        }
        four.setOnClickListener {
            val a = manhinh.text.toString() + "4"
            manhinh.setText(a)
        }
        five.setOnClickListener {
            val a = manhinh.text.toString() + "5"
            manhinh.setText(a)
        }
        six.setOnClickListener {
            val a = manhinh.text.toString() + "6"
            manhinh.setText(a)
        }
        seven.setOnClickListener {
            val a = manhinh.text.toString() + "7"
            manhinh.setText(a)
        }
        eight.setOnClickListener {
            val a = manhinh.text.toString() + "8"
            manhinh.setText(a)
        }
        nine.setOnClickListener {
            val a = manhinh.text.toString() + "9"
            manhinh.setText(a)
        }

        cong.setOnClickListener {
            val a = manhinh.text.toString() + "+"
            manhinh.setText(a)
        }
        tru.setOnClickListener {
            val a = manhinh.text.toString() + "-"
            manhinh.setText(a)
        }
        nhan.setOnClickListener {
            val a = manhinh.text.toString() + "*"
            manhinh.setText(a)
        }
        chia.setOnClickListener {
            val a = manhinh.text.toString() + "/"
            manhinh.setText(a)
        }
        phay.setOnClickListener {
            val a = manhinh.text.toString() + "."
            manhinh.setText(a)
        }


        ON.setOnClickListener {
            manhinh.setText("")
        }
        CE.setOnClickListener {
            var str:String = manhinh.text.toString()
            if(!str.equals(""))
            {
                str = str.substring(0, str.length-1)
                manhinh.text = str
            }
        }

        bang.setOnClickListener {
            try {
                val input = ExpressionBuilder(manhinh.text.toString()).build()
                val output = input.evaluate()
                val longOutput = output.toLong()

                if(output == longOutput.toDouble())
                {
                    manhinh.setText(longOutput.toString())
                }else
                {
                    manhinh.setText(output.toString())
                }


            }catch (e:Exception)
            {
                Toast.makeText(this@MainActivity, e.message, Toast.LENGTH_LONG).show()
            }
        }



    }
}