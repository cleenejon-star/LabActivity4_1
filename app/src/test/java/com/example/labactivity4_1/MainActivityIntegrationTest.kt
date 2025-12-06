package com.example.labactivity4_1

import android.content.Intent
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent
import androidx.test.espresso.intent.matcher.IntentMatchers.hasExtra
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.filters.MediumTest
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
@MediumTest
class MainActivityIntegrationTest {

    @Before fun setup() { Intents.init() }
    @After fun teardown() { Intents.release() }

    @Test
    fun testNavigationToSecondActivity() {
        val scenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.etNumber)).perform(typeText("10"))
        onView(withId(R.id.btnGo)).perform(click())

        // Assert intent passed
        intended(hasComponent(SecondActivity::class.java.name))
        intended(hasExtra("COUNT", 10))

        scenario.close()
    }
}