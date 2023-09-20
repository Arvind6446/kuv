package com.kuv.app.android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import com.kuv.MainActivity

import com.kuv.R


class OtpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.otp_activity)



        val button = findViewById<Button>(R.id.btContinue)
        button.setOnClickListener({
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        })

    }
}