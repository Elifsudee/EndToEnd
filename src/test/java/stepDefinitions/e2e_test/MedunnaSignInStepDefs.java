package stepDefinitions.e2e_test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.MedunnaHomePage;
import pages.MedunnaLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class MedunnaSignInStepDefs {

    MedunnaHomePage medunnaHomePage=new MedunnaHomePage();

    MedunnaLoginPage medunnaLoginPage=new MedunnaLoginPage();
    @Given("go to {string}")
    public void goTo(String url) {

        Driver.getDriver().get(url);
        
    }

    @When("click on user icon")
    public void clickOnUserIcon() {
        medunnaHomePage.userIcon.click();
    }

    @And("click on sign in option")
    public void clickOnSignInOption() {
        medunnaHomePage.signInOption.click();
    }

    @And("enter username")
    public void enterUsername() {
        medunnaLoginPage.usernameInput.sendKeys(ConfigReader.getProperty("medunna_username"));
    }

    @And("enter password")
    public void enterPassword() {
        medunnaLoginPage.passwordInput.sendKeys(ConfigReader.getProperty("medunna_password"));
    }

    @And("click on sign in submit button")
    public void clickOnSignInSubmitButton() {
        medunnaLoginPage.signInSubmitButton.click();

    }
}
