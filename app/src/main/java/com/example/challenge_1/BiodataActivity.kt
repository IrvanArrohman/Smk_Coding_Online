package com.example.challenge_1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
    private lateinit var dial : Button
    internal var call : String?=""

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
        dial = findViewById(R.id.dial)

        namaTxt.setText(intent.getStringExtra("data1"))

        umurTxt.setText(intent.getStringExtra("data3"))
        emailTxt.setText(intent.getStringExtra("data4"))
        telpTxt.setText(intent.getStringExtra("data5"))
        alamatTxt.setText(intent.getStringExtra("data6"))
        jkTxt.setText(intent.getStringExtra("data2"))



        edit.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("data1",namaTxt.text.toString())
            intent.putExtra("data3",umurTxt.text.toString())
            intent.putExtra("data4",emailTxt.text.toString())
            intent.putExtra("data5",telpTxt.text.toString())
            intent.putExtra("data6",alamatTxt.text.toString())
            intent.putExtra("data2",jkTxt.text.toString())
            startActivity(intent)
        }
        about.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
        dial.setOnClickListener(View.OnClickListener {
            call = telpTxt.text.toString().trim()
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+Uri.encode(call)))
            startActivity(intent)
        })
    }
}
