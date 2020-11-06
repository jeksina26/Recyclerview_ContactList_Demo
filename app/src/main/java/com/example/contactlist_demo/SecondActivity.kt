package com.example.contactlist_demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.fragment_contact_details.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar()?.setDisplayShowHomeEnabled(true);

        var number = intent.getStringExtra("number")
        tvn1.text = number
        tvn2.text = number
        tvn3.text = number
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}