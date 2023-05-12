package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.IOException

class LoginActvity : AppCompatActivity() {

    lateinit var etUsername: EditText
    lateinit var etPassword: EditText
    lateinit var etLogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_actvity)

        etUsername = findViewById(R.id.etRUserName) //find the id of the username by checking the id within the xml file
        etPassword = findViewById(R.id.etRPassword)//find the id of the password by checking the id within the xml file

        etLogin = findViewById(R.id.btnLogin) ////find the id of the button by checking the id within the xml file


        //functionality of the button
        etLogin.setOnClickListener {
            loginin(etUsername,etPassword)

        }

        this.findViewById<TextView>(R.id.tvRegisterLink).setOnClickListener{
            startActivity(Intent(this, RegisterActivity::class.java))
        }

    }

    private fun loginin(etUsername:EditText,etPassword:EditText) {
        val userName  = etUsername.getText().toString().trim()
        val password = etPassword.getText().toString().trim()

        val call: Call<ResponseBody> = RetrofitClient.getInstance().api.checkUser(User(userName, password))

        if (userName.isEmpty()) {
            etUsername.setError("Username is required")
            etUsername.requestFocus()
            return
        } else if (password.isEmpty()) {
            etPassword.setError("Password is required")
            etPassword.requestFocus()
            return
        }

        call.enqueue(object : Callback<ResponseBody?> {
            override fun onResponse(call: Call<ResponseBody?>?, response: Response<ResponseBody?>) {
                var s = ""
                try {
                    s = response.body()!!.string()
                } catch (e: IOException) {
                    e.printStackTrace()
                }
                if ( s==userName) {
                    val intent = Intent(this@LoginActvity,DashboardActivity::class.java)
                    intent.putExtra("Username",s)
                   // Toast.makeText(this@LoginActvity, "Successfully login", Toast.LENGTH_LONG).show()
                    startActivity(intent)
                } else {
                    Toast.makeText(this@LoginActvity, "User does not exists!", Toast.LENGTH_LONG)
                        .show()
                }
            }

            override fun onFailure(call: Call<ResponseBody?>, t: Throwable) {
                Toast.makeText(this@LoginActvity, t.message, Toast.LENGTH_LONG).show()
            }


        })
    }


}
