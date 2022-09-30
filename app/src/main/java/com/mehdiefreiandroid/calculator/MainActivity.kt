package com.mehdiefreiandroid.calculator

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val myPrenom:EditText = findViewById(R.id.prenom)
        val myPseudo = findViewById<EditText>(R.id.pseudo)
        val myEmail = findViewById<EditText>(R.id.email)


        val actionBar: ActionBar? = supportActionBar
        actionBar?.setTitle("Jouer")

        val myEnvoyerBtn: Button = findViewById(R.id.envoyerBtn)

        myEnvoyerBtn.setOnClickListener {
            val prenom: String = myPrenom.getText().toString()
            val pseudo: String = myPseudo.getText().toString()
            val email: String = myEmail.getText().toString()
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            intent.putExtra("PRENOM", prenom)
            intent.putExtra("PSEUDO", pseudo)
            intent.putExtra("EMAIL", email)
            startActivity(intent)
        }

    }

}