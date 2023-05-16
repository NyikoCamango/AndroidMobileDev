package com.example.project1

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView
import android.widget.Button

class InsitutionsActivity2 : AppCompatActivity() {
    private lateinit var BtnLogout: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insitutions2)
        setupHyperlink()
    }
    fun setupHyperlink() {
        val linkTextView = findViewById<TextView>(R.id.uj)
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
        linkTextView.setLinkTextColor(Color.BLUE)

        val unizulu = findViewById<TextView>(R.id.unizulu)
        unizulu.setMovementMethod(LinkMovementMethod.getInstance());
        unizulu.setLinkTextColor(Color.BLUE)

        val wits = findViewById<TextView>(R.id.wits)
        wits.setMovementMethod(LinkMovementMethod.getInstance());
        wits.setLinkTextColor(Color.BLUE)

        val tut = findViewById<TextView>(R.id.tut)
        tut.setMovementMethod(LinkMovementMethod.getInstance());
        tut.setLinkTextColor(Color.BLUE)

        val sbu = findViewById<TextView>(R.id.sbu)
        sbu.setMovementMethod(LinkMovementMethod.getInstance());
        sbu.setLinkTextColor(Color.BLUE)

        val ul = findViewById<TextView>(R.id.ul)
        ul.setMovementMethod(LinkMovementMethod.getInstance());
        ul.setLinkTextColor(Color.BLUE)

        val uwc = findViewById<TextView>(R.id.uwc)
        uwc.setMovementMethod(LinkMovementMethod.getInstance());
        uwc.setLinkTextColor(Color.BLUE)

        val nwu = findViewById<TextView>(R.id.nwu)
        nwu.setMovementMethod(LinkMovementMethod.getInstance());
        nwu.setLinkTextColor(Color.BLUE)

        val unisa= findViewById<TextView>(R.id.unisa)
        unisa.setMovementMethod(LinkMovementMethod.getInstance());
        unisa.setLinkTextColor(Color.BLUE)

        val uct = findViewById<TextView>(R.id.uct)
        uct.setMovementMethod(LinkMovementMethod.getInstance());
        uct.setLinkTextColor(Color.BLUE)

        val ru = findViewById<TextView>(R.id.ru)
        ru.setMovementMethod(LinkMovementMethod.getInstance());
        ru.setLinkTextColor(Color.BLUE)

        val up = findViewById<TextView>(R.id.up)
        up.setMovementMethod(LinkMovementMethod.getInstance());
        up.setLinkTextColor(Color.BLUE)

        val ufs = findViewById<TextView>(R.id.ufs)
        ufs.setMovementMethod(LinkMovementMethod.getInstance());
        ufs.setLinkTextColor(Color.BLUE)

        val nmmu = findViewById<TextView>(R.id.nmmu)
        nmmu.setMovementMethod(LinkMovementMethod.getInstance());
        nmmu.setLinkTextColor(Color.BLUE)

        val cput = findViewById<TextView>(R.id.cput)
        cput.setMovementMethod(LinkMovementMethod.getInstance());
        cput.setLinkTextColor(Color.BLUE)

        val ukzn = findViewById<TextView>(R.id.ukzn)
        ukzn.setMovementMethod(LinkMovementMethod.getInstance());
        ukzn.setLinkTextColor(Color.BLUE)

        BtnLogout=findViewById(R.id.btn_logout)
        BtnLogout.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }

    }
}