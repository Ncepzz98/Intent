package com.example.tugasintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_hasilakumulasi.*


class Hasilakumulasi : AppCompatActivity() {

    private lateinit var nimna:TextView
    private lateinit var namana:TextView
    private lateinit var nilaina:TextView
    private lateinit var keterangan:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasilakumulasi)

        val bundle:Bundle? = intent.extras
        val nimu = bundle?.get("nim_ae")
        val namamu = bundle?.get("nama_ae")
        val nilaimu = bundle?.get("nilai_ae")

        nimna = findViewById(R.id.Nime)
        namana = findViewById(R.id.Namae)
        nilaina = findViewById(R.id.Nilaie)
        keterangan = findViewById(R.id.Keterangane)

        var skor = nilaimu.toString()
        var skore = skor.toInt()

        nimna.setText("" + nimu)
        namana.setText("" + namamu)
        nilaina.setText("" + nilaimu)

        if (skore>=80){
            keterangan.setText("A")
        }
        else if (skore >= 60){
            keterangan.setText("B")
        }
        else if (skore >= 40){
            keterangan.setText("C")
        }
        else if (skore >= 20){
            keterangan.setText("D")
        }
        else{
            keterangan.setText("E")
        }


        button.setOnClickListener(){
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
