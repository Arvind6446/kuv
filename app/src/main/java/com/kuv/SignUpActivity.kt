package com.kuv.app.android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import com.kuv.MainActivity

import com.kuv.R


class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup_activity)

        val button = findViewById<Button>(R.id.signup)
        button.setOnClickListener({
            val i = Intent(this, OtpActivity::class.java)
            startActivity(i)
        })

    }
}