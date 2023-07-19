package com.atiurin.sampleapp.MySteps

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withContentDescription
import com.atiurin.sampleapp.Data.FriendsData
import com.atiurin.sampleapp.MyPages.FriendPage
import com.atiurin.sampleapp.helper.tap
import com.atiurin.sampleapp.helper.typeText
import com.atiurin.ultron.extensions.click
import com.atiurin.ultron.extensions.isDisplayed

object FriendStep {
    fun pickFriend() {
        with(FriendPage) {
            pickFriendToChat(FriendsData.friendName).click()
        }
    }

    fun sendMessage(text: String) {
        with(FriendPage) {
            messageInput.typeText(text)
            sendButton.tap()
        }
    }

    fun dashBoardMenu() {
        with(FriendPage) {
            toolbar.isDisplayed()
            onView(withContentDescription("Open navigation drawer")).perform(click())
            UIEls.click()
        }
    }
}
