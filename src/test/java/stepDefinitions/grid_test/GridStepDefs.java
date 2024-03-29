package stepDefinitions.grid_test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GridStepDefs {

    WebDriver driver;
    @Given("user goes to app with chrome")
    public void user_goes_to_app_with_chrome() throws MalformedURLException {

        //Remote driver objesi olustur-->new URL, new ChromeOptions
       driver= new RemoteWebDriver(new URL("http://192.168.1.69:4444"),new ChromeOptions());

       //gerisi selenium
        driver.get("https://www.bluerentalcars.com/");

    }
    @When("verify the title is {string}")
    public void verify_the_title_is(String title) {

        assertEquals(title, driver.getTitle());
    }
    @Then("close the driver")
    public void close_the_driver() throws InterruptedException {

        Thread.sleep(3);
        driver.close();
    }


    @Given("user goes to app with firefox")
    public void userGoesToAppWithFirefox() throws MalformedURLException {
        driver= new RemoteWebDriver(new URL("http://192.168.1.69:4444"),new FirefoxOptions());
        driver.get("https://www.bluerentalcars.com/");
    }

    @Given("user goes to app with edge")
    public void userGoesToAppWithEdge() throws MalformedURLException {

        driver = new RemoteWebDriver(new URL("http://192.168.1.126:4444"), new EdgeOptions());
        driver.get("https://www.bluerentalcars.com/");
    }
}
