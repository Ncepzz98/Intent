package com.example.tugasintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nimna: EditText = findViewById(R.id.nim)
        var namana: EditText = findViewById(R.id.nama)
        var nilaina: EditText = findViewById(R.id.nilai)


        btn_proses.setOnClickListener(){
            val intent = Intent(this, Hasilakumulasi::class.java)
            intent.putExtra("nim_ae", nimna.getText())
            intent.putExtra("nama_ae", namana.getText())
            intent.putExtra("nilai_ae", nilaina.getText())
            startActivity(intent)
        }
    }
}
