@file:Suppress("DEPRECATION")

package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.calculator.databinding.ActivityMainBinding
import kotlin.reflect.typeOf

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.btnSum.setOnClickListener {
            var numberOne : Double? = binding.etNumberOne.text.toString().toDoubleOrNull()
            var numberTwo : Double? = binding.etNumberTwo.text.toString().toDoubleOrNull()
            if(numberOne is Double && numberTwo is Double){
                sum(numberOne,numberTwo)
            }
            else
            {
                showCustomToast()
            }
        }
        binding.btnSubtraction.setOnClickListener {
            var numberOne : Double? = binding.etNumberOne.text.toString().toDoubleOrNull()
            var numberTwo : Double? = binding.etNumberTwo.text.toString().toDoubleOrNull()
            if(numberOne is Double && numberTwo is Double){
                subtraction(numberOne,numberTwo)
            }
            else
            {
                showCustomToast()
            }
        }
        binding.btnMultiplication.setOnClickListener {
            var numberOne : Double? = binding.etNumberOne.text.toString().toDoubleOrNull()
            var numberTwo : Double? = binding.etNumberTwo.text.toString().toDoubleOrNull()
            if(numberOne is Double && numberTwo is Double){
                multiplication(numberOne,numberTwo)
            }
            else
            {
                showCustomToast()
            }
        }
        binding.btnDivision.setOnClickListener {
            var numberOne : Double? = binding.etNumberOne.text.toString().toDoubleOrNull()
            var numberTwo : Double? = binding.etNumberTwo.text.toString().toDoubleOrNull()
            if(numberOne is Double && numberTwo is Double){
                division(numberOne,numberTwo)
            }
            else
            {
                showCustomToast()
            }
        }
    }

    //using Clear button with onClick function by adding onClick at XML
    fun clear(view: View){
        binding.tvResult.text = ""
    }

    //the function to show custom toast as its name indicates
    fun showCustomToast() {
        val toastView = layoutInflater.inflate(R.layout.custom_toast, null)
        val toast = Toast(this@MainActivity)
        toast.duration = Toast.LENGTH_LONG
        toast.view = toastView
        toast.show()
    }

    //using other buttons with traditional onclick function structure in xml
    fun sum(num1 :Double, num2 :Double){
        var result = num1 + num2
        binding.tvResult.text = result.toString()
    }
    fun subtraction(num1 :Double, num2 :Double){
        var result = num1 - num2
        binding.tvResult.text = result.toString()
    }
    fun multiplication(num1 :Double, num2 :Double){
        var result = num1 * num2
        binding.tvResult.text = result.toString()
    }
    fun division(num1 :Double, num2 :Double){
        var result = num1 / num2
        binding.tvResult.text = result.toString()
    }
}