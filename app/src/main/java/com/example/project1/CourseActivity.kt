package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CourseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course2)

        val etBback: Button = findViewById(R.id.btncourses)

        etBback.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            intent.putExtra( "Username","")
            startActivity(intent)


        }

    }
}