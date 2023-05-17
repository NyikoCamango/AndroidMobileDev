package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class EditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)

        val etButtonedit: Button = findViewById(R.id.btnedit)

        etButtonedit.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            Toast.makeText(this@EditActivity, "Successfully updated your details", Toast.LENGTH_LONG).show()

            intent.putExtra( "Username","")
            startActivity(intent)

        }
    }
}