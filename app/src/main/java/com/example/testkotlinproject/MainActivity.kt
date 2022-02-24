package com.example.testkotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.example.testkotlinproject.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.main_activity__button)
        button.setOnClickListener { Toast.makeText(this, "Hello!", Toast.LENGTH_LONG).show() }
        val person = Person("Ivan","Ivanov")
        Log.e("111",person.toString())
        val newCopy = person.copy()
        Log.e("111",newCopy.toString())
        val personList = ArrayList<Person>()
        personList.add(Person("Petr","Petrov"))
        personList.add(person)
        personList.add(Person("Igor","Igorev"))
        for(persons in personList){
            Log.e("@@@",persons.toString())
        }

        for(i in 30 downTo 1 step 3) {
            Log.e("@@@","Hello Kotlin!")
        }

    }


}