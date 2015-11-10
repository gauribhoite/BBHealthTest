package com.example.gauri_rb.myapplication.steps;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.List;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import cucumber.api.java.en.Given;
import io.appium.java_client.android.AndroidElement;

/**
 * Created by gauri_rb on 11/10/15.
 */
public class StepDefinitons {
	private AppiumDriver<WebElement> driver;
	@Given("^I am on login screen of babylon app")
	public void i_am_on_login_screen_of_babylon_app(){
		 @Before
        public void setUp() throws Exception {
            DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("appPackage", "com.babylon");
	        capabilities.setCapability("appActivity", "com.babylon.activity.RegistrationActivity");
	        this.driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        }

        @After
    	public void tearDown() throws Exception {
        	this.driver.quit();
    	}

	}

	@Test
	@Given("^As a new user I click on Sign up button on loginscreen")
	public void as_a_new_user_i_click_on_sign_up_button_on_loginscreen(){

    	WebElement el = this.driver.findElement(By.name("Sign Up"));
    	el.click();
    	WebElement e2 = driver.getElementById("action_bar_title");
    	Assert.assertEquals("Create Your Account", el.getAttribute("text"));
	    
	}

	@Test
	@Then("^I am successfully registered as a new user")
	@When("^I enter details like '(^(.+)@(.+)$)' and '(^.*$)' on the Sign up screen")
	public void i_enter_details_like_and_on_the_sign_up_screen(String email, String password){

    	WebElement e1 = this.driver.findElement(By.name("emailEdt"));
        e1.sendKeys(email);
    	WebElement e2 = driver.findElement(By.name("passwordEdt"));
        e2.sendKeys(password);

    	//TO-DO address all the other elements on the screen similarly
    	WebElement e3 = this.driver.findElement(By.name("nameEdt"));
        e3.sendKeys("Gauri");
    	WebElement e4 = this.driver.findElement(By.name("lastNameEdt"));
        e4.sendKeys("Bhoite");
    	WebElement e5 = this.driver.findElement(By.name("dateofBirthEdt"));
        e5.sendKeys("09/09/1988");
    	WebElement e6 = this.driver.findElement(By.name("dateofBirthEdt"));
        e6.sendKeys("09/09/1988");

    	MobileElement country = (MobileElement)this.driver.findElementByClassName("android.view.TextView");
        WebElement entry = country.findElement(By.name("name_text_view"));
        entry.get(index);
        entry.click();


        WebElement checkbox = this.driver.findElement(By.name("create_account_terms_and_conditions_check_box"));
        checkbox.click();
        Assert.assertEquals(false,checkbox.getAttribute("checkable"));

        WebElement createAccountBtn = this.driver.findElement(By.name("createAccountBtn"));
        if (checkbox.get(0).getAttribute("checked") != null) {
        	createAccountBtn.click();
       }

       //check if we are on Babylon home screen
       WebElement e7 = this.driver.findElement(By.name("activity_home_page_settings"));
       Assert.assertEquals("activity_home_page_settings", e7);

	}

	@Given("^I am on SignIn screen using email") 
	public void i_am_on_signin_screen_using_email(){
		
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appPackage", "com.babylon");
        capabilities.setCapability("appActivity", "com.babylon.activity.SignInActivity");
        this.driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        WebElement e1 = this.driver.findElement(By.name("activity_registration_login_email"));
        e1.click();
        //go the Sign In screen
        WebElement e2 = this.driver.findElement(By.name("action_bar_title"));
    	Assert.assertEquals("Sign in", e2.getAttribute("text"));
    }

    @When("^I enter '(^(.+)@(.+)$)' and '(^.*$)' details")
    public void i_enter_and_details(String email, String password){
    	WebElement e1 = this.driver.findElement(By.name("emailEdt"));
        e1.sendKeys(email);
    	WebElement e2 = this.driver.findElement(By.name("passwordEdt"));
        e2.sendKeys(password);

    	WebElement signInBtn = this.driver.findElement(By.name("signInBtn"));
    	signInBtn.click();

    	//TODO test forgot password functionality
    }

    @Then("^I am om babylon homescreen")
    public void i_am_on_babylon_screen(){
    	WebElement e1 = this.driver.findElement(By.name("activity_home_page_settings"));
       	Assert.assertEquals("activity_home_page_settings", e1);
    }

    @Given("^I am om babylon homescreen")
    public void i_am_on_babylon_screen(){
    	DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appPackage", "com.babylon");
        capabilities.setCapability("appActivity", "com.babylonpartners.babylon.HomePageBackboneActivity");
        this.driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        WebElement e1 = driver.findElement(By.name("activity_registration_login_email"));
		e1.click();

        WebElement e2 = this.driver.findElement(By.name("emailEdt"))
        e2.sendKeys("gauri.rb27@gmail.com");
    	WebElement e3 = this.driver.findElement(By.name("passwordEdt"));
        e3.sendKeys("password");

    	WebElement signInBtn = this.driver.findElement(By.name("signInBtn"));
    	signInBtn.click();

    	WebElement e4 = this.driver.findElement(By.name("activity_home_page_settings"));
       	Assert.assertEquals("activity_home_page_settings", e4);
    }

    @When("^I click on setting menu")
    public void i_click_on_settings_menu(){
    	WebElement e1 = this.driver.findElement(By.name("activity_home_page_settings"));
       	Assert.assertEquals("activity_home_page_settings", e1);
    }

    @Then("^display total number of text field within it")
    public void display_total_number_of_text_field_within_it(){
    	List<AndroidElement> textFieldsList = (List)this.driver.findElement(By.name("llyitem"));
    	System.out.println(textFieldsList.size());
    }
}
