package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TodoActivity : AppCompatActivity() {
    lateinit var BtnDashboard: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo)

            BtnDashboard=findViewById(R.id.todoButton)
            BtnDashboard.setOnClickListener {
                val intent = Intent(this, DashboardActivity::class.java)
                intent.putExtra( "Username","")
                startActivity(intent)
            }
    }
}