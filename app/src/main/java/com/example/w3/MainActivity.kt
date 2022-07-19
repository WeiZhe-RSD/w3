package com.example.w3

import android.os.Build.ID
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.example.w3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        super.onCreate(savedInstanceState)

        var student:Student = Student("ali", "RSD")


        binding.btnSetData.setOnClickListener(){

            binding.myStudent = student
//            binding.textView.text = "Ali"
//            binding.textView5.text = "RSD"
        }

        binding.button2.setOnClickListener(){
            student.programme = "RIS"
            binding.invalidateAll() //refresh
        }


    }





}