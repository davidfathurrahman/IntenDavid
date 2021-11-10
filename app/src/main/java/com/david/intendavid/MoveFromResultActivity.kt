package com.david.intendavid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup

class MoveFromResultActivity : AppCompatActivity() {
    var rgColor: RadioGroup? = null
    lateinit var  radioButton: RadioButton
    private lateinit var btnChoose: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_from_result2)

        rgColor = findViewById(R.id.rg_color)
        btnChoose = findViewById(R.id.btn_choose)
        btnChoose.setOnClickListener{
            val selectOption: Int = rgColor!!.checkedRadioButtonId
            radioButton = findViewById(selectOption)

            val intent = Intent(this, MainActivity::class.java)
            val bundle = Bundle()
            bundle.putString("warna", radioButton.text as String)
            intent.putExtras(bundle)
            startActivity(intent)

        }



    }
}