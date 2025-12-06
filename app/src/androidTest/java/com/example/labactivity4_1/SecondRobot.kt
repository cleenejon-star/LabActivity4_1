package com.example.labactivity4_1

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.hasChildCount
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.action.ViewActions.click
import androidx.recyclerview.widget.RecyclerView

class SecondRobot {
    fun assertItemCount(count: Int) {
        onView(withId(R.id.recyclerView)).check(matches(hasChildCount(count)))
    }

    fun clickItem(position: Int) {
        onView(withId(R.id.recyclerView))
            .perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(position, click()))
    }
}