package com.example.labactivity4_1

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.assertion.ViewAssertions.matches

class MainRobot {
    fun enterNumber(number: String) {
        onView(withId(R.id.etNumber)).perform(typeText(number))
    }

    fun clickGo() {
        onView(withId(R.id.btnGo)).perform(click())
    }

    fun checkIsDisplayed() {
        onView(withId(R.id.etNumber)).check(matches(isDisplayed()))
    }
}