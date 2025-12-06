package com.example.labactivity4_1

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest // [cite: 13]
class AppFlowTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testAppFlow() {
        // Robot 1 interaction
        val mainRobot = MainRobot()
        mainRobot.enterNumber("5") // User types 5
        mainRobot.clickGo()

        // Robot 2 interaction
        // Note: Real test needs IdlingResource to wait for async load (Step 39), assumed handled in app code later.
        val secondRobot = SecondRobot()
        secondRobot.assertItemCount(5) // Verify 5 items loaded
        secondRobot.clickItem(2) // Click 3rd item (Index 2)

        // Robot 3 interaction
        val thirdRobot = ThirdRobot()
        thirdRobot.assertText("You clicked Item 2") // Verify result
    }
}