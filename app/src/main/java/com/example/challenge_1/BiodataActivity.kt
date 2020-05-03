package com.example.challenge_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class BiodataActivity : AppCompatActivity() {
    private lateinit var namaTxt : TextView
    private lateinit var jkTxt : TextView
    private lateinit var umurTxt : TextView
    private lateinit var emailTxt : TextView
    private lateinit var telpTxt : TextView
    private lateinit var alamatTxt : TextView
    private lateinit var edit : Button
    private lateinit var about : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)

        namaTxt = findViewById(R.id.namaTxt)
        jkTxt = findViewById(R.id.jkTxt)
        umurTxt = findViewById(R.id.umurTxt)
        emailTxt = findViewById(R.id.emailTxt)
        telpTxt = findViewById(R.id.telpTxt)
        alamatTxt = findViewById(R.id.alamatTxt)
        edit = findViewById(R.id.edit)
        about = findViewById(R.id.about)

        namaTxt.setText(intent.getStringExtra("data1"))
        umurTxt.setText(intent.getStringExtra("data3"))
        emailTxt.setText(intent.getStringExtra("data4"))
        telpTxt.setText(intent.getStringExtra("data5"))
        alamatTxt.setText(intent.getStringExtra("data6"))

        edit.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        about.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
    }
}
