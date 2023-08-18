package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnSum.setOnClickListener {
            var numberOne = binding.etNumberOne.text.toString().toDouble()
            var numberTwo = binding.etNumberTwo.text.toString().toDouble()
            sum(numberOne,numberTwo)
        }
        binding.btnSubtraction.setOnClickListener {
            var numberOne = binding.etNumberOne.text.toString().toDouble()
            var numberTwo = binding.etNumberTwo.text.toString().toDouble()
            subtraction(numberOne,numberTwo)
        }
        binding.btnMultiplication.setOnClickListener {
            var numberOne = binding.etNumberOne.text.toString().toDouble()
            var numberTwo = binding.etNumberTwo.text.toString().toDouble()
            multiplication(numberOne,numberTwo)
        }
        binding.btnDivision.setOnClickListener {
            var numberOne = binding.etNumberOne.text.toString().toDouble()
            var numberTwo = binding.etNumberTwo.text.toString().toDouble()
            division(numberOne,numberTwo)
        }
    }

    fun clear(view: View){
        binding.tvResult.text = ""
    }

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