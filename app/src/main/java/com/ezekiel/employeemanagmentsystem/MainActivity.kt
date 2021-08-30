package com.ezekiel.employeemanagmentsystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_profile)

        val list : MutableList<String> = ArrayList()
        for(i in 1..500)
            list.add("item $i")

        val adapter: ArrayAdapter<String> = ArrayAdapter ( this, R.layout.support_simple_spinner_dropdown_item, list)
        adapter
    }
}