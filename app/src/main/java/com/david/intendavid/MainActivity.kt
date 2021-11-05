package com.david.intendavid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener{
    private lateinit var btnMoveActivity: Button
    private lateinit var btnMoveWithData: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMoveActivity = findViewById(R.id.btn_move_activitiy)
        btnMoveActivity.setOnClickListener(this)

        btnMoveWithData = findViewById(R.id.btn_move_whith_data)
        btnMoveWithData.setOnClickListener(this)
            }

    override fun onClick(v:View?){
        if (v !=null) {
            when(v.id){
                R.id.btn_move_activitiy -> run {
                    val intent = Intent(this, MoveActivity::class.java)
                    startActivity(intent)
                }
                R.id.btn_move_whith_data -> run {
                    val intent = Intent(this, MoveWhiteDataActivity::class.java)
                    val bundle = Bundle()
                    bundle.putString("Nama", "David")
                    bundle.putString("Alamat", "jogja")
                    intent.putExtras(bundle)
                    startActivity(intent)
                }

                }
            }
        }
    }