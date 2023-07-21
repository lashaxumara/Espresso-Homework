package com.atiurin.sampleapp.MySteps

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.swipeDown
import androidx.test.espresso.matcher.ViewMatchers.withContentDescription
import com.atiurin.sampleapp.Data.FriendsData
import com.atiurin.sampleapp.MyPages.FriendPage
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.helper.scrollSlowlyDown
import com.atiurin.sampleapp.helper.swipeToBottom
import com.atiurin.sampleapp.helper.swiper
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

    // ..........................................new homework steps for Emmet
    fun swipeUntilEmmet() {
        var i = 1
        while (!FriendPage.pickFriendToChat(FriendsData.friendNameEmmet)
                .isViewDisplayed() && i <= 5
        ) {
            swipeToBottom1()
            i++
        }
        FriendPage.pickFriendToChat(FriendsData.friendNameEmmet).click()
    }

    fun sendTextToEmmet() {
        FriendPage.messageInput.typeText(FriendsData.textForEmmet)
        FriendPage.sendButton.click()
    }

    private fun swipeToBottom1() {
        with(FriendsData) {
            swiper(start, end, deley)
        }
    }

    fun swipeUntilFriend17() {
        var b = 1
        while (!FriendPage.pickFriendToChat(FriendsData.friendName17).isViewDisplayed() && b <= 5) {
            swipeToBottom2()
            b++
        }
        FriendPage.pickFriendToChat(FriendsData.friendName17).click()
    }

    fun sendTextToFriend17() {
        FriendPage.messageInput.typeText(FriendsData.textForFriend17)
        FriendPage.sendButton.click()
    }
    private fun swipeToBottom2() {
        with(FriendsData) {
            swiper(start2, end2, deley2)
        }
    }
}
