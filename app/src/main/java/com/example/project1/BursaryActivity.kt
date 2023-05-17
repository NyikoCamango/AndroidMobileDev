package com.example.project1

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.TextView

class BursaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bursary)

        val mTextView = findViewById<TextView>(R.id.textView5)
        mTextView.movementMethod = LinkMovementMethod.getInstance()
        mTextView.setLinkTextColor(Color.BLUE)

        val myTextView = findViewById<TextView>(R.id.textView10)
        myTextView.movementMethod = LinkMovementMethod.getInstance()
        myTextView.setLinkTextColor(Color.BLUE)

        val KyTextView = findViewById<TextView>(R.id.textView20)
        KyTextView.movementMethod = LinkMovementMethod.getInstance()
        KyTextView.setLinkTextColor(Color.BLUE)

        val tyTextView = findViewById<TextView>(R.id.textView21)
        tyTextView.movementMethod = LinkMovementMethod.getInstance()
        tyTextView.setLinkTextColor(Color.BLUE)

        val zyTextView = findViewById<TextView>(R.id.textView000)
        zyTextView.movementMethod = LinkMovementMethod.getInstance()
        zyTextView.setLinkTextColor(Color.BLUE)

        val WyTextView = findViewById<TextView>(R.id.textView000)
        WyTextView.movementMethod = LinkMovementMethod.getInstance()
        WyTextView.setLinkTextColor(Color.BLUE)

        val TYt=findViewById<TextView>(R.id.textView0000)
        TYt.movementMethod = LinkMovementMethod.getInstance()
        TYt.setLinkTextColor(Color.BLUE)



        val etButtonback: Button = findViewById(R.id.btn_back)

        etButtonback.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            intent.putExtra( "Username","")
            startActivity(intent)


        }




    }


}
