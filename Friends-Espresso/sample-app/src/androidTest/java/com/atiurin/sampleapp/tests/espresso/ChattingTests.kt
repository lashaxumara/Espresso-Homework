package com.atiurin.sampleapp.tests.espresso

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.Data.FriendsData
import com.atiurin.sampleapp.MyPages.FriendPage
import com.atiurin.sampleapp.MySteps.FriendStep
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.helper.isViewDisplayed
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ChattingTests {

    @get:Rule
    val activityTestRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun textWithMyFriendEmmet() {
        with(FriendStep) {
            swipeUntilEmmet()
            Assert.assertTrue(FriendPage.pickedFriendValidation(FriendsData.friendNameEmmet).isViewDisplayed())
            sendTextToEmmet()
            Assert.assertTrue(FriendPage.sentMessage(FriendsData.textForEmmet).isViewDisplayed())
        }
    }

    @Test
    fun textWithFriend17() {
        with(FriendStep) {
            swipeUntilFriend17()
            Assert.assertTrue(FriendPage.pickedFriendValidation(FriendsData.friendName17).isViewDisplayed())
            sendTextToFriend17()
            Assert.assertTrue(FriendPage.sentMessage(FriendsData.textForFriend17).isViewDisplayed())
        }
    }
}
