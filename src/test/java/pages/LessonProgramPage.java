package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LessonProgramPage {
    public LessonProgramPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[@role='button'])[18]")
    public WebElement lessonManagement;

    @FindBy(css = "button[id='controlled-tab-example-tab-lessonProgram']")
    public WebElement lessonProgram;

    @FindBy(css = "input[id='react-select-2-input']")
    public WebElement chooseLesson;

    @FindBy(css = "select[id='educationTermId']")
    public WebElement chooseEducationTerm;

    @FindBy(css = "select[id='day']")
    public WebElement chooseDay;

    @FindBy(css = "input[id='startTime']")
    public WebElement startTime;

    @FindBy(css = "input[id='stopTime']")
    public WebElement stopTime;

    @FindBy(xpath = "(//*[@class='fw-semibold btn btn-primary btn-lg'])[3]")
    public WebElement sumbitLesson;


    @FindBy(css = "div[role='alert']")
    public WebElement alert;

    @FindBy(xpath = "//*[text()='Created Lesson Program']")
    public WebElement alert1;

    @FindBy(xpath = "(//*[@class='table table-striped table-bordered table-hover'])[3]")
    public WebElement table;


    @FindBy(xpath = "(//tbody)[3]//tr")
    public WebElement tableList;

    @FindBy(xpath = "(//thead)[3]")
    public WebElement programListThead;

    @FindBy(xpath = "(//li[@class='page-item'])[11]")
    public WebElement sayfaAtlama;

    @FindBy(xpath = "(//tbody)[4]//tr[13]")
    public WebElement choseLessonVerify;

    @FindBy(xpath = "(//*[@class='form-check-input'])[40]")
    public WebElement chooseLessonBox;
@FindBy(css = "label[class='fw-semibold mt-2 form-label']")
public WebElement chooseTeacherText;
    @FindBy(css = "select[id='teacherId']")
    public WebElement teacherAssigment;

    @FindBy(xpath = "(//*[@class='fw-semibold btn btn-primary btn-lg'])[4]")
    public WebElement teacherSubmit;

    @FindBy(css = "div[role='alert']")
    public WebElement teacherAlert;


    }
