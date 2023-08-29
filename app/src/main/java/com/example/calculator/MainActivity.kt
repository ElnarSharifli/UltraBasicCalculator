package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
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
                Toast.makeText(this@MainActivity, "Invalid input type", Toast.LENGTH_LONG).show()
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
                Toast.makeText(this@MainActivity, "Invalid input type", Toast.LENGTH_LONG).show()
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
                Toast.makeText(this@MainActivity, "Invalid input type", Toast.LENGTH_LONG).show()
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
                Toast.makeText(this@MainActivity, "Invalid input type", Toast.LENGTH_LONG).show()
            }
        }
    }

    //using Clear button with onClick function by adding onClick at XML
    fun clear(view: View){
        binding.tvResult.text = ""
    }

    //using other buttons with traditional function
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