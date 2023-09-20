package com.kuv

import android.content.Intent
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import androidx.core.widget.NestedScrollView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.kuv.MainActivity

import com.kuv.R


class RecordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.driving_record_layout)

        var fb = findViewById<FloatingActionButton>(R.id.edit_person_fab)


        fb.setOnClickListener(
            View.OnClickListener {
                val i = Intent(this, RecordFormLayout::class.java)
                startActivity(i)
            }
        )



    }
}