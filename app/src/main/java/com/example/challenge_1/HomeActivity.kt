package com.example.challenge_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    private lateinit var nama : EditText
    private lateinit var umur : EditText
    private lateinit var email : EditText
    private lateinit var telp : EditText
    private lateinit var alamat : EditText
    private lateinit var simpan : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        nama = findViewById(R.id.nama)
        umur = findViewById(R.id.umur)
        email = findViewById(R.id.email)
        telp = findViewById(R.id.telp)
        alamat = findViewById(R.id.alamat)
        simpan = findViewById(R.id.simpan)



        simpan.setOnClickListener {
            val intent = Intent(this, BiodataActivity::class.java)
            intent.putExtra("data1",nama.text.toString())
            intent.putExtra("data3",umur.text.toString())
            intent.putExtra("data4",email.text.toString())
            intent.putExtra("data5",telp.text.toString())
            intent.putExtra("data6",alamat.text.toString())
            startActivity(intent)
        }
    }
}
