package stepDefinitions.proje;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.LoginPage;
import pages.ViceDeanManagementPage;
import utilities.ConfigReader;
import utilities.Driver;


public class ViceDeanStepDefinitions {
    ViceDeanManagementPage viceDean = new ViceDeanManagementPage();
    LoginPage login = new LoginPage();

    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String url) {
        Driver.getDriver().get(url);

    }

    @When("kullanici anasayfa login bolumune tiklar")
    public void kullanici_ansayfa_login_bolumune_tiklar() {
        login.anaSayfaLogin.click();

    }

    @When("kullanici login icin User Name alanina kullanici adi girer")
    public void kullanici_login_icin_user_name_alanina_kullanici_adi_girer() {
        login.login_username.sendKeys(ConfigReader.getProperty("viceDean_username"));

    }

    @When("kullanici login icin Password alanina password girer")
    public void kullanici_login_icin_password_alanina_password_girer() {
        login.login_password.sendKeys(ConfigReader.getProperty("password"));

    }

    @Then("kullanici login butonuna tiklar")
    public void kullanici_Login_Butonuna_Tiklar() {
        login.login_submit.click();

    }

    @When("kullanici Menu butonuna tiklar")
    public void kullanici_butonuna_tiklar() throws InterruptedException {
      Thread.sleep(3);
        viceDean.anaMenu.click();

    }














}


