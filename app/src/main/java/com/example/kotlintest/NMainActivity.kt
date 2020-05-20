package com.example.kotlintest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class NMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_n_main)

        val name : String = intent.getStringExtra("WWW");
       // Toast.makeText(this@NMainActivity,name,Toast.LENGTH_SHORT).show()
        val xedap : PhuongTien = intent.getSerializableExtra("data") as PhuongTien
        Toast.makeText(this@NMainActivity,xedap.toString(),Toast.LENGTH_SHORT).show()
    }
}
