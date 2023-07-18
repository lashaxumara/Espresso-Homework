package com.example.android.testing.espresso.BasicSample.Test

import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.example.android.testing.espresso.BasicSample.Data.Data
import com.example.android.testing.espresso.BasicSample.MainActivity
import com.example.android.testing.espresso.BasicSample.Steps.ActivityChannelTextStep
import com.example.android.testing.espresso.BasicSample.Steps.ChangeTextStep
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ChangeTextTests {
    @get:Rule
    var activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun firstTaskTest() {
        with(ChangeTextStep) {
            fieldFillStep(Data.fNamelName)
            Assert.assertEquals(Data.fNamelName, fieldActualText())
        }
    }

    @Test
    fun secondTastTest() {
        with(ActivityChannelTextStep) {
            secondPageCheck(Data.favCandy)
            Assert.assertEquals(Data.favCandy, secondPageActText())
        }
    }
}