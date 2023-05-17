package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class HelpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)



        val etButtonHelp: Button = findViewById(R.id.btnHelp)

        etButtonHelp.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            Toast.makeText(this@HelpActivity, "Successfully submitted details", Toast.LENGTH_LONG).show()

            intent.putExtra( "Username","")
            startActivity(intent)


        }
    }




}