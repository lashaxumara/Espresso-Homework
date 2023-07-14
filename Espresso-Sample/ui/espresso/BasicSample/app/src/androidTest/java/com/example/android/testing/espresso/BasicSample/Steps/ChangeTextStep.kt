package com.example.android.testing.espresso.BasicSample.Steps

import com.example.android.testing.espresso.BasicSample.Pages.EspressoAppPageMatchers
import com.example.android.testing.espresso.BasicSample.getText
import com.example.android.testing.espresso.BasicSample.tap
import com.example.android.testing.espresso.BasicSample.typeText

object ChangeTextStep {

    fun fieldFillStep(text: String) {
        with(EspressoAppPageMatchers) {
            textFiled.typeText(text)
            changeTextButton.tap(5)

        }
    }

    fun fieldActualText(): String {
        with(EspressoAppPageMatchers) {
            val actText = textToBeChanged.getText(5)
            return actText
        }
    }


}