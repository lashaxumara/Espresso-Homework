package com.atiurin.sampleapp.MyTests

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
class FriendsTest {

    @get:Rule
    val activityTestRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun textWithMyFriend() {
        with(FriendStep) {
            Assert.assertTrue(FriendPage.checkFriendAppEnable.isViewDisplayed())
            pickFriend()
            Assert.assertTrue(
                FriendPage.pickedFriendValidation(FriendsData.friendName).isViewDisplayed()
            )
            sendMessage(FriendsData.textToSend)
            Assert.assertTrue(FriendPage.sentMessage(FriendsData.textToSend).isViewDisplayed())
        }
    }

    @Test
    fun CheckDashBoardMenuTest() {
        with(FriendStep) {
            Assert.assertTrue(FriendPage.checkFriendAppEnable.isViewDisplayed())
            dashBoardMenu()
            Assert.assertTrue(FriendPage.checkMenu.isViewDisplayed())
            Assert.assertTrue(FriendPage.checkButton.isViewDisplayed())
            Assert.assertTrue(FriendPage.checkButton2.isViewDisplayed())
        }
    }
}
