package com.atiurin.sampleapp.MyPages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers

object FriendPage {
    val checkFriendAppEnable: Matcher<View> by lazy { Matchers.allOf(ViewMatchers.withText("Friends")) }
    fun pickFriendToChat(name: String): Matcher<View> =
        Matchers.allOf(ViewMatchers.withId(R.id.tv_name), ViewMatchers.withText(name))

    fun pickedFriendValidation(name: String): Matcher<View> =
        Matchers.allOf(ViewMatchers.withId(R.id.toolbar_title), ViewMatchers.withText(name))

    val messageInput: Matcher<View> by lazy { ViewMatchers.withId(R.id.message_input_text) }
    val sendButton: Matcher<View> by lazy { ViewMatchers.withId(R.id.send_button) }
    fun sentMessage(myMessage: String): Matcher<View> =
        Matchers.allOf(ViewMatchers.withId(R.id.message_text), ViewMatchers.withText(myMessage))

    val toolbar: Matcher<View> by lazy { ViewMatchers.withId(R.id.toolbar) }
    val UIEls: Matcher<View> by lazy { ViewMatchers.withId(R.id.ui_elements) }

    val checkMenu: Matcher<View> by lazy { ViewMatchers.withId(R.id.button1) }
    val checkButton: Matcher<View> by lazy { ViewMatchers.withId(R.id.checkbox_clickable) }
    val checkButton2: Matcher<View> by lazy { ViewMatchers.withId(R.id.checkbox_enable) }
}
