package com.kuv



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.kuv.MainActivity

import com.kuv.R


class AddCarLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.my_vehicle_layout)

        var addForm = findViewById<FloatingActionButton>(R.id.add_person_fab)

        addForm.setOnClickListener(View.OnClickListener {
            val i = Intent(this, AddCarForm::class.java)
            startActivity(i)
        })



    }
}