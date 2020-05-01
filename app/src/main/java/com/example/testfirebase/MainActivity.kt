package com.example.testfirebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{

    private lateinit var edt_username : EditText
    private  lateinit var edt_email : EditText
    private lateinit var edt_password : EditText

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edt_username = findViewById(R.id.editText_username)
        edt_email = findViewById(R.id.editText_email)
        edt_password = findViewById(R.id.editText_password)

        button_register.setOnClickListener{
            Log.d("MainActivity", "user "+edt_username.text.toString())
            Log.d("MainActivity", "email: "+edt_email.text.toString())

        }
        textView_already_have_an_account.setOnClickListener {
            Log.d("MainActivity", "ok!")
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
