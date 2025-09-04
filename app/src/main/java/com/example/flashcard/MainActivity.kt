package com.example.flashcard

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.VIEW_MODEL_STORE_OWNER_KEY

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val flashcardQuestion = findViewById<TextView>(R.id.flashcard_question)
        val flashcardAnswer = findViewById<TextView>(R.id.flashcard_answer)

        flashcardQuestion.setOnClickListener {

            flashcardQuestion.visibility = View.INVISIBLE
            flashcardAnswer.visibility = View.VISIBLE
        }

        val flashcardQuestionToggle = findViewById<TextView>(R.id.flashcard_question)
        val flashcardAnswerToggle = findViewById<TextView>(R.id.flashcard_answer)

        flashcardAnswerToggle.setOnClickListener {

            flashcardQuestionToggle.visibility = View.VISIBLE
            flashcardAnswerToggle.visibility = View.INVISIBLE
        }

        val flashcardAnswer1 = findViewById<TextView>(R.id.flashcard_answer1)
        val flashcardanswer2 = findViewById<TextView>(R.id.flashcard_answer2)
        val flashcardanswer3 = findViewById<TextView>(R.id.flashcard_answer3)
        val flashcard_app=findViewById<RelativeLayout>(R.id.flashcard_app)
        val show_icon=findViewById<ImageView>(R.id.show_icon)
        val hide_icon=findViewById<ImageView>(R.id.hide_icon)


        flashcardAnswer1.setOnClickListener {

            findViewById<View>(R.id.flashcard_answer1).setBackgroundColor(getResources().getColor(R.color.lime, null))
            findViewById<View>(R.id.flashcard_answer2).setBackgroundColor(getResources().getColor(R.color.red, null))
            findViewById<View>(R.id.flashcard_answer3).setBackgroundColor(getResources().getColor(R.color.red, null))

        }

        flashcardanswer2.setOnClickListener {

            findViewById<View>(R.id.flashcard_answer1).setBackgroundColor(getResources().getColor(R.color.lime, null))
            findViewById<View>(R.id.flashcard_answer2).setBackgroundColor(getResources().getColor(R.color.red, null))
            findViewById<View>(R.id.flashcard_answer3).setBackgroundColor(getResources().getColor(R.color.yellow, null))

        }

        flashcardanswer3.setOnClickListener {

            findViewById<View>(R.id.flashcard_answer1).setBackgroundColor(getResources().getColor(R.color.lime, null))
            findViewById<View>(R.id.flashcard_answer2).setBackgroundColor(getResources().getColor(R.color.yellow, null))
            findViewById<View>(R.id.flashcard_answer3).setBackgroundColor(getResources().getColor(R.color.red, null))

        }

        flashcard_app.setOnClickListener {

            findViewById<View>(R.id.flashcard_answer1).setBackgroundColor(getResources().getColor(R.color.yellow, null))
            findViewById<View>(R.id.flashcard_answer2).setBackgroundColor(getResources().getColor(R.color.yellow, null))
            findViewById<View>(R.id.flashcard_answer3).setBackgroundColor(getResources().getColor(R.color.yellow, null))

        }

        show_icon.setOnClickListener {
            flashcardAnswer1.visibility= View.VISIBLE
            flashcardanswer2.visibility= View.VISIBLE
            flashcardanswer3.visibility= View.VISIBLE
            hide_icon.visibility= View.VISIBLE
            show_icon.visibility=View.INVISIBLE

        }

        hide_icon.setOnClickListener {
            flashcardAnswer1.visibility= View.INVISIBLE
            flashcardanswer2.visibility= View.INVISIBLE
            flashcardanswer3.visibility= View.INVISIBLE
            hide_icon.visibility= View.INVISIBLE
            show_icon.visibility=View.VISIBLE

        }


    }



}