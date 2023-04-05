package com.example.simple_calculator_obiero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var txt_answer_dispay:TextView
    private lateinit var edtFirst:EditText
    private lateinit var edtSecond:EditText
    private lateinit var button_add:Button
    private lateinit var button_multiply:Button
    private lateinit var button_divide:Button
    private lateinit var button_subtract:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt_answer_dispay = findViewById(R.id.txt_Answer)
        edtFirst = findViewById(R.id.edt_FirstNumber)
        edtSecond = findViewById(R.id.edt_SecondNumber)
        button_add = findViewById(R.id.btnAdd)
        button_multiply = findViewById(R.id.btnMultiply)
        button_divide = findViewById(R.id.btnDivision)
        button_subtract = findViewById(R.id.btnSubtract)

        button_add.setOnClickListener {

            var first_num = edtFirst.text.toString().trim()
            var second_num = edtSecond.text.toString().trim()

            //Validation of edit text
            if (first_num.isEmpty() || second_num.isEmpty()) {

                Toast.makeText(this, "Please Enter a Valid Number", Toast.LENGTH_SHORT).show()
            }
            else {

                var result = first_num.toDouble() + second_num.toDouble()
                txt_answer_dispay.text = result.toString()
            }
        }

        button_multiply.setOnClickListener {

            var first_num = edtFirst.text.toString().trim()
            var second_num = edtSecond.text.toString().trim()

            //Validation of edit text
            if (first_num.isEmpty() || second_num.isEmpty()) {

                Toast.makeText(this, "Please Enter a Valid Number", Toast.LENGTH_SHORT).show()
            }
            else {

                var result = first_num.toDouble() * second_num.toDouble()
                txt_answer_dispay.text = result.toString()
            }
        }


        button_divide.setOnClickListener {

            var first_num = edtFirst.text.toString().trim()
            var second_num = edtSecond.text.toString().trim()

            //Validation of edit text
            if (first_num.isEmpty() || second_num.isEmpty()) {

                Toast.makeText(this, "Please Enter a Valid Number", Toast.LENGTH_SHORT).show()
            }
            else {

                var result = first_num.toDouble() / second_num.toDouble()
                txt_answer_dispay.text = result.toString()
            }
        }


        button_subtract.setOnClickListener {

            var first_num = edtFirst.text.toString().trim()
            var second_num = edtSecond.text.toString().trim()

            //Validation of edit text
            if (first_num.isEmpty() || second_num.isEmpty()) {

                Toast.makeText(this, "Please Enter a Valid Number", Toast.LENGTH_SHORT).show()
            }
            else {

                var result = first_num.toDouble() - second_num.toDouble()
                txt_answer_dispay.text = result.toString()
            }
        }

    }



}