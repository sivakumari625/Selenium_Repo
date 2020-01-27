package StepDefinitions;


import org.openqa.selenium.WebDriver;

import PageObjects.LogInPage;
//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import resources.base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
//import cucumber.api.junit.Cucumber;
//import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
public class stepDefinitions extends base{
public WebDriver driver;
    @Given("^Initialize the browser with Firefox$")
    public void initialize_the_browser_with_firefox() throws Throwable {
      driver=initializedriver();
    }

    @When("^User enters (.+) and (.+) and logs in$")
    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
      LogInPage l=new LogInPage(driver);
      l.username().sendKeys("mngr241660");
  	l.password().sendKeys("hesypam");
  	l.clickonLogin().click();
    }

    @Then("^Verify that user is succesfully logged in $")
    public void verify_that_user_is_succesfully_logged_in() throws Throwable {
    	 System.out.println("User is logged in");
    }

    @And("^Navigate to \"([^\"]*)\" Site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
    	driver.get("http://demo.guru99.com/V4/");
    }

    @And("^close browser$")
    public void close_browser() throws Throwable {
        driver.close();
    }

}