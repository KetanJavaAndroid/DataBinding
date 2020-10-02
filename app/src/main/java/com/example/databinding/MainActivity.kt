package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("Hi")
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.employee=assignValue()
     //  binding.firstname.setText("Ketan")
assignValue()
    }
    fun assignValue():Employee
    {
        return Employee(Email="Ketantorave@gmail.com",FirstName="ketan",LastName = "Torawe")
    }
}