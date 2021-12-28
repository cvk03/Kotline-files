package com.example.firstactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*


class MainActivity : AppCompatActivity(),View.OnClickListener {

    lateinit var edittextname:EditText
    lateinit var edittextrollno:EditText
    lateinit var btnenter:Button
    lateinit var genderradiogroup:RadioGroup
    lateinit var descripspp:Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edittextname =findViewById(R.id.edittextname)
        edittextrollno=findViewById(R.id.edittextrollno)
        btnenter=findViewById(R.id.btnenter)
        genderradiogroup=findViewById(R.id.genderradiogroup)
        descripspp=findViewById(R.id.descripspp)
        var dept=" "
        var deptlist= arrayListOf("computer science","information technology","others")
        descripspp.adapter=ArrayAdapter(this,android.R.layout.simple_spinner_item,deptlist)

        descripspp.onItemSelectedListener=
            object: AdapterView.OnItemSelectedListener{
                override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long)
                {
                   dept=deptlist[position]
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }
            }

        btnenter.setOnClickListener(){
            var name=edittextname.text.toString()
            Toast.makeText(this,name,Toast.LENGTH_SHORT).show()

            val intent=Intent(applicationContext,secondactivity::class.java).apply{
            putExtra("refername",name)

                putExtra("referdept",dept)

            }
            startActivity(intent)
            }

        }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }


}


