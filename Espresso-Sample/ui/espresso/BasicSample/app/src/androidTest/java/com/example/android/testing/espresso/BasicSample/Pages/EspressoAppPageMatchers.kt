package com.example.android.testing.espresso.BasicSample.Pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.android.testing.espresso.BasicSample.R


object EspressoAppPageMatchers {
    val textFiled: org.hamcrest.Matcher<View> by lazy { withId(R.id.editTextUserInput) }
    val changeTextButton: org.hamcrest.Matcher<View> by lazy { withId(R.id.changeTextBt) }
    val textToBeChanged: org.hamcrest.Matcher<View> by lazy { withId(R.id.textToBeChanged) }
    val activityChangeButton: org.hamcrest.Matcher<View> by lazy { withId(R.id.activityChangeTextBtn) }
    val secondPageText: org.hamcrest.Matcher<View> by lazy { withId(R.id.show_text_view) }
}