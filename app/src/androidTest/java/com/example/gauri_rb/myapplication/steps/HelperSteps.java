package com.example.gauri_rb.myapplication.steps;

import android.support.test.espresso.EspressoException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

/**
 * Created by gauri_rb on 11/10/15.
 */
public class HelperSteps {

    private static Scenario scenario;

    @Before
    public static void before(final Scenario scenario) {
        HelperSteps.scenario = scenario;
    }

    public static Scenario getScenario() {
        return HelperSteps.scenario;
    }

    @After
    public static void after() {
        if ((HelperSteps.scenario != null) && (HelperSteps.scenario.isFailed())) {
            System.out.println("failed");
        }
    }

    @Given("^I take a screenshot$")
    public void i_take_a_screenshot() {
        System.out.println("failed");
    }

    /**
     * Take a screenshot of the current activity and embed it in the HTML report
     *
     * @param tag Name of the screenshot to include in the file name
     */

}
