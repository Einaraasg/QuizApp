package com.quizapp

import com.quizapp.R
import com.quizapp.Question

object Constants {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END
    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "What animal is this",
            R.drawable.bjorn,
            "Bear", "Wold",
            "Cat", "Lion", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "What animal is this",
            R.drawable.and,
            "Bear", "Human",
            "Duck", "Dog", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "What animal is this",
            R.drawable.cat,
            "Crab", "Tiger",
            "Rabbit", "Cat", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "What animal is this",
            R.drawable.dog,
            "Cat", "Dog",
            "Pidgeon", "Bear", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "What animal is this",
            R.drawable.elefant,
            "Crocodile", "Bear",
            "Elephant", "Cow", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "What animal is this",
            R.drawable.elg,
            "Moose", "Caribou",
            "Reindeer", "Bambi", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "What animal is this",
            R.drawable.rype,
            "Duck", "Pidgeon",
            "Grouse", "Eagle", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "What animal is this",
            R.drawable.struts,
            "Tiger", "Penguin",
            "Flamingo", "Ostrich", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "What animal is this",
            R.drawable.tiger,
            "Lion", "Tiger",
            "Wolf", "Bear", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "Wolf",
            R.drawable.ulv,
            "Wolf", "Dog",
            "Rabbit", "Cat", 1
        )

        questionsList.add(que10)

        return questionsList
    }
}