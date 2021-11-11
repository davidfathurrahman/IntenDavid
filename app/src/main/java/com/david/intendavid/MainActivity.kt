package com.david.intendavid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener{
    private lateinit var btnMoveActivity: Button
    private lateinit var btnMoveWithData: Button
    private lateinit var btnDialNumber: Button
    private lateinit var btnResultFromActivity: Button
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMoveActivity = findViewById(R.id.btn_move_activitiy)
        btnMoveActivity.setOnClickListener(this)

        btnMoveWithData = findViewById(R.id.btn_move_whith_data)
        btnMoveWithData.setOnClickListener(this)

        btnDialNumber = findViewById(R.id.btn_dial_number)
        btnDialNumber.setOnClickListener(this)

        btnResultFromActivity = findViewById(R.id.btn_result_from_activity)
        btnResultFromActivity.setOnClickListener(this)
        tvResult = findViewById(R.id.tv_result)
        warnaReceived()

            }

    private fun warnaReceived() {
        val bundle = intent.extras
        val warna = bundle?.getString("warna")
        tvResult.text = warna
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
                    bundle.putString("Nama", "David Fathurrahman")
                    bundle.putString("Alamat", "Yogyakarta")
                    intent.putExtras(bundle)
                    startActivity(intent)
                }
                R.id.btn_dial_number -> run {
                    var dialnumber = "085816943202"
                    val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + dialnumber))
                    startActivity(intent)
                }
                R.id.btn_result_from_activity -> run {
                    val intent = Intent (this, MoveFromResultActivity::class.java)
                    startActivity(intent)
                }

                }
            }
        }
    }