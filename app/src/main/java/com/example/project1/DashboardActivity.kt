package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DashboardActivity : AppCompatActivity() {
    lateinit var BtnLogout: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        lateinit var welcomeText: String
        lateinit var tvWelcome: TextView

        welcomeText ="Welcome "+ getIntent().getStringExtra("Username").toString() + "!";
        tvWelcome = this.findViewById(R.id.tvWelcome);
        tvWelcome.setText(welcomeText);


         BtnLogout=findViewById(R.id.btn_logout)
        BtnLogout.setOnClickListener {
            val intent = Intent(this, LoginActvity::class.java)
            startActivity(intent)
        }






    }
}