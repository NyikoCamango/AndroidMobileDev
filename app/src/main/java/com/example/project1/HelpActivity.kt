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

        lateinit var welcomeText: String
        lateinit var tvWelcome: TextView

        welcomeText ="Welcome "+ getIntent().getStringExtra("Username").toString() + "!";
        tvWelcome = this.findViewById(R.id.tvWelcome);
        tvWelcome.setText(welcomeText);


        val etButtonHelp: Button = findViewById(R.id.btnHelp)

        etButtonHelp.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            Toast.makeText(this@HelpActivity, "Successfully submitted details", Toast.LENGTH_LONG).show()

            intent.putExtra( "Username","")
            startActivity(intent)


        }
    }




}