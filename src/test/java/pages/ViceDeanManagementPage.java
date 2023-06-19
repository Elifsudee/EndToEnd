package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViceDeanManagementPage extends CommonPage {

    //ViceDeanManagement "Add Vice Dean" Locates //

    @FindBy(xpath = "(//button[@type='button'])[1]")
    public WebElement anaMenu; //Anamenu ilk giris-- Ysf

    @FindBy(xpath = "//*[text()='Vice Dean Management']")
    public WebElement viceDeanManagement; // Vice Dean Management menü --Ysf

    @FindBy(xpath = "//input[@id='name']")
    public WebElement viceDean_Name; //Vice Dean Management isim --Ysf

    @FindBy(xpath = "//input[@id='surname']")
    public WebElement viceDean_Surname; //Vice Dean Management soyisim --Ysf

    @FindBy(xpath = "//input[@id='birthPlace']")
    public WebElement viceDean_BirthPlace; //Vice Dean Management doğumyeri --Ysf

    @FindBy(xpath = "//input[@name='gender'])[1]")
    public WebElement viceDean_Gender_Female; //Vice Dean Management cinsiyet/kadın --Ysf

    @FindBy(xpath = "(//input[@name='gender'])[2]")
    public WebElement viceDean_Gender_Male; //Vice Dean Management cinsiyet/erkek --Ysf

    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    public WebElement viceDean_Birthday;

    @FindBy(id="phoneNumber")
    public WebElement viceDean_PhoneNumber;





}
