package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun stringsExercise(view: View){
        val exercise = StringExc()
        val sort = exercise.smt()
        val firstResult = exercise.getFirstSort()
        val secondResult = exercise.getSecSort()
        textViewFirst.text = firstResult.sortedWith(compareBy { it.length }).toString()
        textViewSecond.text = secondResult.sortedWith(compareBy { it.length }).toString()
    }
}