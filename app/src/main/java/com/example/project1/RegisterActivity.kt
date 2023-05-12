package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button
import android.widget.EditText;
import android.widget.TextView
import android.widget.Toast;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

class RegisterActivity : AppCompatActivity() {

    //initializing the variables
    lateinit var etUsername: EditText
    lateinit var etPassword: EditText
    lateinit var etButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        //used to navigate between classes
//        val intent = Intent(this, RegisterActivity::class.java)
//        startActivity(intent)

        etUsername =
            findViewById(R.id.etRUserName) //find the id of the username by checking the id within the xml file
        etPassword =
            findViewById(R.id.etRPassword)//find the id of the password by checking the id within the xml file

        etButton =
            findViewById(R.id.btnRegister) ////find the id of the button by checking the id within the xml file


        //functionality of the button
        etButton.setOnClickListener {

            //notification on button
            //Toast.makeText(this, "Successfully registered", Toast.LENGTH_SHORT).show()
            registerUser()

        }


        this.findViewById<TextView>(R.id.tvLoginLink).setOnClickListener{
            startActivity(Intent(this, LoginActvity::class.java))
        }


    }

    private fun registerUser() {
        val userName: String = etUsername.getText().toString().trim()
        val password: String = etPassword.getText().toString().trim()
        if (userName.isEmpty()) {
            etUsername.setError("Username is required")
            etUsername.requestFocus()
            return         }
        else if (password.isEmpty()) {
            etPassword.setError("Password is required")
            etPassword.requestFocus()
            return
        }
        val call: Call<ResponseBody> = RetrofitClient.getInstance().api.createUser(User(userName, password))
        call.enqueue(object : Callback<ResponseBody?> {
            override fun onResponse(call: Call<ResponseBody?>?, response: Response<ResponseBody?>) {
                var s = ""
                try {
                    s = response.body()!!.string()
                } catch (e: IOException)
                {
                    e.printStackTrace()
                }
                if(s =="SUCCESS")
                {
                    Toast.makeText(
                        this@RegisterActivity,
                        "Successfully registered. Please login",
                        Toast.LENGTH_LONG
                    ).show()

                    startActivity(Intent(this@RegisterActivity, LoginActvity::class.java))
                } else {
                    Toast.makeText(this@RegisterActivity, "User already exists!", Toast.LENGTH_LONG)
                        .show()
                }
            }

            override fun onFailure(call: Call<ResponseBody?>, t: Throwable) {
                Toast.makeText(this@RegisterActivity, t.message, Toast.LENGTH_LONG).show()
            }

        })
    }
}

