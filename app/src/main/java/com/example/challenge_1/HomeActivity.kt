package com.example.challenge_1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_biodata.*
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    private lateinit var nama : EditText
    private lateinit var umur : EditText
    private lateinit var email : EditText
    private lateinit var telp : EditText
    private lateinit var alamat : EditText
    private lateinit var simpan : Button
    internal lateinit var spinner : Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        nama = findViewById(R.id.nama)
        umur = findViewById(R.id.umur)
        email = findViewById(R.id.email)
        telp = findViewById(R.id.telp)
        alamat = findViewById(R.id.alamat)
        simpan = findViewById(R.id.simpan)
        spinner = findViewById(R.id.jk)

        val jk_item = arrayOf("Laki-laki", "Perempuan")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, jk_item)
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        spinner.adapter = adapter


        nama.setText(intent.getStringExtra("data1"))
        umur.setText(intent.getStringExtra("data3"))
        email.setText(intent.getStringExtra("data4"))
        telp.setText(intent.getStringExtra("data5"))
        alamat.setText(intent.getStringExtra("data6"))



        simpan.setOnClickListener {
            val intent = Intent(this, BiodataActivity::class.java)
            intent.putExtra("data1",nama.text.toString())
            intent.putExtra("data3",umur.text.toString())
            intent.putExtra("data4",email.text.toString())
            intent.putExtra("data5",telp.text.toString())
            intent.putExtra("data6",alamat.text.toString())
            intent.putExtra("data2",spinner.selectedItem.toString())
            startActivity(intent)
        }

    }


}
