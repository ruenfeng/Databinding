package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val myName: MyName = MyName("")
    private val myContactNum: MyContactNum = MyContactNum("")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.buttonSetName.setOnClickListener{
            addNickName(it)
        }
        binding.buttonSetContactNum.setOnClickListener{
            addContactNum(it)
        }
        binding.myName = myName
        binding.myContactNum = myContactNum

    }

    private fun addContactNum(it: View?) {
        binding.apply{
            myContactNum?.contactNum = editTextContactNum.text.toString()
            this.invalidateAll()
        }
    }

    private fun addNickName(it: View?) {
        binding.apply{
            myName?.name = editTextName.text.toString()
            this.invalidateAll()
        }
    }
}
