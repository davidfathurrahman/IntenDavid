package com.david.intendavid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MoveActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnLeave: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move)

        btnLeave = findViewById(R.id.leave)
        btnLeave.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v!= null) {
            when(v.id){
                R.id.leave -> run {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}