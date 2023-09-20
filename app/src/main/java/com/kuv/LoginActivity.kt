package com.kuv.app.android

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import com.kuv.MainActivity
import com.kuv.R


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        val button = findViewById<Button>(R.id.loginButton)
        val register = findViewById<RelativeLayout>(R.id.registerLayout)
        button.setOnClickListener({
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        })

        register.setOnClickListener({
            val i = Intent(this, SignUpActivity::class.java)
            startActivity(i)
        })

    }
}