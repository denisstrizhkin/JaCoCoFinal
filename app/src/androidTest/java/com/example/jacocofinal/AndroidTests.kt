package com.example.jacocofinal

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.util.Random

@LargeTest
@RunWith(AndroidJUnit4::class)
class AndroidTests() {
    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun checkFirstTextField() {
        val expectedHint = "Логин"
        onView(withId(R.id.first_edit_text)).check(matches(withHint(expectedHint)))
    }

    @Test
    fun checkSecondTextField() {
        val expectedHint = "Пароль"
        onView(withId(R.id.second_edit_text)).check(matches(withHint(expectedHint)))
    }

    fun fuckJaCoCo() {
        val bar = (Random()).nextInt()

        println("this is")
        if (bar < 1)
        {
            println(" not ")
        }
        println("a positive integer")
    }
}