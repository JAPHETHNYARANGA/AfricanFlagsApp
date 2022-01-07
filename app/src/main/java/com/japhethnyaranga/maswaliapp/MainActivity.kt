package com.japhethnyaranga.maswaliapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN

        btn_start.setOnClickListener {

            val name = editName.text.toString()
            if(name.isEmpty()){
                jina.isErrorEnabled=true
                jina.error="Please Enter Name"

            }else{
                jina.isErrorEnabled=false
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, name)
                startActivity(intent)
                finish()

            }
        }

    }
}