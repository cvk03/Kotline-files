package com.example.firstactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class secondactivity : AppCompatActivity() {
     lateinit var textviewwelcome :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondactivity)

        textviewwelcome=findViewById(R.id.textviewwelcome)
         /*var obtainedname=" "
        var obtaineddept=" "*/
          var obtainedname = intent.getStringExtra("refername").toString()
        var obtaineddept= intent.getStringExtra("referdept").toString()
        textviewwelcome.text="welcome " +"\nname :"+ obtainedname +"\ndepartment :"+obtaineddept

    }
}