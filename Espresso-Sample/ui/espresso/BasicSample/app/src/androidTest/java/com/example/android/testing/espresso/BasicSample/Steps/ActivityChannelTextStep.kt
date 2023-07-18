package com.example.android.testing.espresso.BasicSample.Steps

import com.example.android.testing.espresso.BasicSample.Pages.EspressoAppPageMatchers
import com.example.android.testing.espresso.BasicSample.getText
import com.example.android.testing.espresso.BasicSample.tap
import com.example.android.testing.espresso.BasicSample.typeText

object ActivityChannelTextStep {
    fun secondPageCheck(text: String) {
        with(EspressoAppPageMatchers) {
            textFiled.typeText(text)
            activityChangeButton.tap()
        }
    }

    fun secondPageActText(): String {
        with(EspressoAppPageMatchers) {
            val actText2 = secondPageText.getText(5)
            return actText2
        }
    }
}