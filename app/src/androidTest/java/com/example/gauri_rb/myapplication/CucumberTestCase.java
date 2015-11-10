package com.example.gauri_rb.myapplication;

import cucumber.api.CucumberOptions;

/**
 * Created by gauri_rb on 11/10/15.
 */
@CucumberOptions(features = "features", // Test scenarios
        glue = {"com.example.gauri_rb.myapplication.steps"}, // Steps definitions
        format = {"pretty", // Cucumber report formats and location to store them in phone
                "html:/mnt/sdcard/cucumber-reports/cucumber-html-report",
                "json:/mnt/sdcard/cucumber-reports/cucumber.json",
                "junit:/mnt/sdcard/cucumber-reports/cucumber.xml"
        },
        tags={"~@manual", "@login-scenarios"}
)
public class CucumberTestCase {
}
