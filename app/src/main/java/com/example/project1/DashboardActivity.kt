package com.example.project1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {
    lateinit var  sessionManager: SessionManager
    lateinit var BtnLogout: Button
    lateinit var Btnedit:Button
    lateinit var  todoB:Button
    lateinit var toDoButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)


        lateinit var welcomeText: String
        lateinit var tvWelcome: TextView

        welcomeText ="Welcome "+ getIntent().getStringExtra("Username").toString() + "!";
        tvWelcome = this.findViewById(R.id.tvWelcome);
        tvWelcome.setText(welcomeText);
        toDoButton=findViewById(R.id.todoB)
        toDoButton.setOnClickListener{
            val intent = Intent(this,DashboardActivity::class.java)
            startActivity(intent)
        }


        BtnLogout=findViewById(R.id.btn_logout)
        BtnLogout.setOnClickListener {
            val intent = Intent(this, LoginActvity::class.java)
            Toast.makeText(this@DashboardActivity, "You just logged out", Toast.LENGTH_LONG).show()
            startActivity(intent)
        }

        val imageView: ImageView = findViewById(R.id.image_vi)

        imageView.setOnClickListener {
            val intent = Intent(this, HelpActivity::class.java)
            startActivity(intent)

        }

        todoB=findViewById(R.id.todoB)
        todoB.setOnClickListener {
            val intent = Intent(this, TodoActivity::class.java)
            startActivity(intent)
        }


        val imageV: ImageView = findViewById(R.id.image_view23)
        imageV.setOnClickListener {
            val intent = Intent(this, BursaryActivity::class.java)
            startActivity(intent)

        }


        val  institution:ImageView=findViewById(R.id.image_view1)
        institution.setOnClickListener {
            val intent = Intent(this, Institution::class.java)
            startActivity(intent)
        }


        Btnedit=findViewById(R.id.editProfileB)
        Btnedit.setOnClickListener {
            val intent = Intent(this, EditActivity::class.java)
            startActivity(intent)
        }




        val im: ImageView = findViewById(R.id.image_view20)
        im.setOnClickListener {
            val intent = Intent(this, CourseActivity::class.java)
            startActivity(intent)

        }







    }
}