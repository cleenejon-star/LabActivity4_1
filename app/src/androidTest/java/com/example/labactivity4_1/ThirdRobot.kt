package com.example.labactivity4_1

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.espresso.assertion.ViewAssertions.matches

class ThirdRobot {
    fun assertText(text: String) {
        onView(withId(R.id.tvResult)).check(matches(withText(text)))
    }
}