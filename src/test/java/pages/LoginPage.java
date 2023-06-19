package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends CommonPage{

    //Ana Sayfa ilk LOGİN bölümü// YSF

    @FindBy(xpath = "//*[@id=\"root\"]/div/header/div[1]/div/div/div[2]/a[2]")
    public WebElement anaSayfaLogin; //Anasayfa ilk giriş login

    @FindBy(xpath = "//input[@id='username']")
    public WebElement login_username; // Anasayfa login/ kullanıcı adı

    @FindBy(xpath = "//input[@id='password']")
    public WebElement login_password; // Anasayfa login/ kullanıcı adı

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement login_submit; // Anasayfa login/ login

    @FindBy(xpath = "//*[text()='Menu']")
    public WebElement Menu;

}
