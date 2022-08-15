package com.example.tiptime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.text.NumberFormat
import com.example.tiptime.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

   private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculateButton.setOnClickListener{ calculateTip() }
    }
  private  fun calculateTip(){
        val stringInTextField = binding.costOfService.text.toString()
        val cost = stringInTextField.toDouble()
       val selectedId = binding.tipOptions.checkedRadioButtonId
        val tipPercentage = when (selectedId) {
            R.id.twenty_percent -> 0.20
            R.id.eidgteen_percent -> 0.18
            else -> 0.15
        }
        var tip = tipPercentage * cost


    }
//    NumberFormat.getCurrencyInstance()
//    val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
//    binding.tipResult.text = getString(R.string.tip_amount, formattedTip)
}
