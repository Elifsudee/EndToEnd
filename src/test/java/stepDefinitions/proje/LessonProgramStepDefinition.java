package stepDefinitions.proje;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.LessonProgramPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class LessonProgramStepDefinition {

    LessonProgramPage lessonProgramPage=new LessonProgramPage();
    LoginPage login=new LoginPage();

    Select select;
    Actions actions;



    @And("kullanici vice dean hesabi login icin User Name alanina kullanici adi girer")
    public void kullaniciViceDeanHesabiLoginIcinUserNameAlaninaKullaniciAdiGirer() {
        login.login_username.sendKeys(ConfigReader.getProperty("viceDean_username"));

    }

    @And("kullanici vice dean hesabi icin Password alanina password girer")
    public void kullaniciViceDeanHesabiIcinPasswordAlaninaPasswordGirer() {
        login.login_password.sendKeys(ConfigReader.getProperty("password"));
    }

    @And("kullanici menu secenegine tiklar")
    public void kullaniciMenuSecenegineTiklar() {

        login.Menu.click();
    }

    @And("kullanici Lesson Management secenegine tiklar")
    public void kullaniciLessonManagementSecenegineTiklar() throws InterruptedException {
      Thread.sleep(3);
         lessonProgramPage.lessonManagement.click();
    }

    @And("kullanici Lesson Program secenegine tiklar")
    public void kullaniciLessonProgramSecenegineTiklar() {
        lessonProgramPage.lessonProgram.click();

    }


    @When("kullanici Choose Lessons listesinde ders secer")
    public void kullanici_choose_lessons_listesinde_ders_secer() throws InterruptedException {
        lessonProgramPage.chooseLesson.click();
        Thread.sleep(3);
        lessonProgramPage.chooseLesson.sendKeys("Java", Keys.ENTER);

    }

    @When("kullanici Choose Education Term bolumunden donem secer")
    public void kullanici_choose_education_term_bolumunden_donem_secer() {
        select=new Select(lessonProgramPage.chooseEducationTerm);
        select.selectByValue("3");

    }

    @When("kullanici Choose Day listesinden gun secer")
    public void kullanici_choose_day_listesinden_gun_secer() {
        select=new Select(lessonProgramPage.chooseDay);
        select.selectByValue("FRIDAY");

    }

    @When("kullanici Start Time secebilmelidir")
    public void kullanici_start_time_secebilmelidir() throws InterruptedException {
        lessonProgramPage.stopTime.click();
        Thread.sleep(2);
       lessonProgramPage.startTime.sendKeys("1000A");


    }

    @When("kullanici Stop Time secebilmelidir")
    public void kullanici_stop_time_secebilmelidir() throws InterruptedException {

        lessonProgramPage.stopTime.click();
        Thread.sleep(2);
        lessonProgramPage.stopTime.sendKeys("1100A");
    }

    @When("Lesson Program bolumundeki submit butonuna tiklar")
    public void lesson_program_bolumundeki_submit_butonuna_tiklar() throws InterruptedException {

     ReusableMethods.bekle(3);
        lessonProgramPage.sumbitLesson.click();
        ReusableMethods.bekle(1);
        ReusableMethods.tumSayfaResmi("Created Lesson ");


    }

    @When("kullanici Created Lesson Program yazisini gorur")
    public void kullanici_created_lesson_program_yazisini_gorur() {


        ReusableMethods.visibleWait(lessonProgramPage.alert,15);
        Assert.assertTrue(lessonProgramPage.alert.isDisplayed());
    }


    @And("kullanici Lesson Program List`te Lesson,Day,Start Time ve Stop Time gorur")
    public void kullaniciLessonProgramListTeLessonDayStartTimeVeStopTimeGorur() {
        actions=new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        Assert.assertTrue(lessonProgramPage.programListThead.isDisplayed());
       ReusableMethods.bekle(3);
        actions.clickAndHold(lessonProgramPage.sayfaAtlama);
        ReusableMethods.click(lessonProgramPage.sayfaAtlama);
        ReusableMethods.bekle(2);
        ReusableMethods.click(lessonProgramPage.sayfaAtlama);
        ReusableMethods.bekle(2);
        ReusableMethods.click(lessonProgramPage.sayfaAtlama);
        ReusableMethods.bekle(2);

        List<WebElement> tableList= Driver.getDriver().findElements(By.xpath("(//tbody)[3]//tr"));
        System.out.println("tableList.size() = " + tableList.size());

        for (WebElement element : tableList) {
            String cellText = element.getText();
            System.out.println(cellText);
        }


    }

    @And("kullanici Lesson Program List`ten guncelleme yapar")
    public void kullaniciLessonProgramListTenGuncellemeYapar() {


    }

    @And("kullanici Lesson Program List`ten silme yapar")
    public void kullaniciLessonProgramListTenSilmeYapar() {


    }

    @And("kullanici ders programini Choose Lesson bolumunde gorur")
    public void kullaniciDersPrograminiChooseLessonBolumundeGorur() {

        ReusableMethods.bekle(3);
        actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
        Assert.assertTrue(lessonProgramPage.choseLessonVerify.isDisplayed());

    }

    @And("kullanici Choose Lesson bolumunden ders secer")
    public void kullaniciChooseLessonBolumundenDersSecer() {

        ReusableMethods.click(lessonProgramPage.chooseLessonBox);
    }

    @And("kullanici Choose Teacher bolumunden ogretmen secer")
    public void kullaniciChooseTeacherBolumundenOgretmenSecer() {
        actions=new Actions(Driver.getDriver());
        ReusableMethods.bekle(2);
//        actions.scrollToElement(lessonProgramPage.teacherAssigment).perform();
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,
                Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(5);

        select=new Select(lessonProgramPage.teacherAssigment);
        select.selectByIndex(1);

    }

    @And("kullanici Lesson Program Assignment `taki submit secenegine tiklar")
    public void kullaniciLessonProgramAssignmentTakiSubmitSecenegineTiklar() {

        ReusableMethods.bekle(2);
      //ReusableMethods.click(lessonProgramPage.teacherSubmit);


    }

    @And("kullanici teacher assignment ettigini dogrular")
    public void kullaniciTeacherAssignmentEttiginiDogrular() {

        ReusableMethods.visibleWait(lessonProgramPage.teacherAlert,15);
        Assert.assertTrue(lessonProgramPage.teacherAlert.isDisplayed());
    }

    @Given("kullanici cikan bolumdeki bilgileri doldurur {string},{string},{string},{string},{string}")
    public void kullaniciCikanBolumdekiBilgileriDoldurur(String chooseLesson, String EducationTerm, String day, String startTime, String stopTime) throws InterruptedException {
        lessonProgramPage.chooseLesson.click();
        Thread.sleep(3);
        lessonProgramPage.chooseLesson.sendKeys("Java", Keys.ENTER);
        select=new Select(lessonProgramPage.chooseEducationTerm);
        select.selectByValue("3");
        select=new Select(lessonProgramPage.chooseDay);
        select.selectByValue("FRIDAY");
        lessonProgramPage.stopTime.click();
        Thread.sleep(2);
        lessonProgramPage.startTime.sendKeys("1000A");
        lessonProgramPage.stopTime.click();
        Thread.sleep(2);
        lessonProgramPage.stopTime.sendKeys("1100A");



    }

    @And("kullanici uyari yazini gorur")
    public void kullaniciUyariYaziniGorur() {
        ReusableMethods.visibleWait(lessonProgramPage.alert,15);
        Assert.assertTrue(lessonProgramPage.alert.isDisplayed());

    }
}
