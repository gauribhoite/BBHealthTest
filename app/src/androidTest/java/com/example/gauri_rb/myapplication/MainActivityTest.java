package com.example.gauri_rb.myapplication;

import android.support.test.espresso.assertion.ViewAssertions;

import org.junit.Test;

import cucumber.api.java.en.Given;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by gauri_rb on 11/7/15.
 */
public class MainActivityTest {

    @Test
    public void shouldbeAbleToLaunchMainScreen() {
        onView(withText("We")).check(ViewAssertions.matches(isDisplayed()));
    }
    @Given("^I am on Homescreen")
    public void I_am_on_Homescreen(){
        System.out.println("Given");
    }

}
