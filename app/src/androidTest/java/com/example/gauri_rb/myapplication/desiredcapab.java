package com.example.gauri_rb.myapplication;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by gauri_rb on 11/8/15.
 */
public class desiredcapab {

    /* This is the key piece of our test, since it allows us to
   * connect to the device we will be running the app onto.*/
    private AppiumDriver driver;

    private String invalidEmail = "abcdefg";
    private String randomPassword = "123456789";

    /* This is the setup that will be run before the test. */
    @Before
    public void setUp() throws Exception {

        /* Here we specify the capabilities required by the Appium server.
         * We have already manually specified most of these through the
         * Appium server interface (apk path etc.). */
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Android44");

        /* We initialize the Appium driver that will connect us to the Android device with
         * the capabilities we have just set. The URL we are providing is telling Appium we
         * are going to run the test locally. */
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

    }

    /* We disable the driver after the test has been executed. */
    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    /* This is... almost a test! */
    @Test
    public void logInWithInvalidEmail(){

        /* We reference the UI element we are interested in using its id (we got this through the
         * Appium Inspector) and we perform a single click on it. */
        //WebElement emailLoginButton = driver.findElement(By.id("de.komoot.android:id/button_mail_login"));
        //emailLoginButton.click();

    }

}
