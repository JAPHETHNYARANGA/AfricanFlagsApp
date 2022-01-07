package com.japhethnyaranga.maswaliapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        Picasso.get()
            .load("https://i.pinimg.com/236x/d4/c0/ae/d4c0ae02cbe5c5d3a4751f6f10540a65.jpg")
            .placeholder(R.drawable.trophy1)
            .into(trophy);

        val username = intent.getStringExtra(Constants.USER_NAME)
        tv_name.text=username


        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val correctAnswer = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)

        tv_score.text = "Your score is $correctAnswer out of a possible $totalQuestions"


        btn_finish.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

    }
}