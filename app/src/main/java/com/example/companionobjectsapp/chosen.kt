package com.example.companionobjectsapp

import androidx.constraintlayout.widget.ConstraintLayout

class chosen {

    companion object {

        fun changeBackground(layout: ConstraintLayout, day: Int) {
            when (day) {
                constant.day -> layout.setBackgroundResource(R.drawable.day)
                constant.night -> layout.setBackgroundResource(R.drawable.night)
            }
        }
    }
}