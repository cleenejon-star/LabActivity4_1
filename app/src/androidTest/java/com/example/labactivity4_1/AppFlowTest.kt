package com.example.labactivity4_1

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class AppFlowTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testAppFlow() {
        // Robot 1 interaction
        val mainRobot = MainRobot()
        mainRobot.enterNumber("5")
        mainRobot.clickGo()

        // Robot 2 interaction
        val secondRobot = SecondRobot()
        secondRobot.assertItemCount(5)
        secondRobot.clickItem(2)

        // Robot 3 interaction
        val thirdRobot = ThirdRobot()
        thirdRobot.assertText("You clicked Item 2")
    }
}