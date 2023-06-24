package stepDefinitions.proje;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import pojos.ElifExceptedPojo;


import java.util.ArrayList;

import static base_urls.ManagementonSchoolsBaseUrl.spec;

public class ApiLessonProgramStepDefElif {

    Response response;
    ElifExceptedPojo elifExceptedPojo;

    @Given("kullanici add lesson  program icin base url olusturur")
    public void kullanici_add_lesson_program_icin_base_url_olusturur() {

        //set the url https://managementonschools.com/app/lessonPrograms/save
        spec.pathParams("first", "lessonPrograms", "second", "save");


    }


    @Given("kullanici add lesson program icin expected data yi olusturur")
    public void kullanici_add_lesson_program_icin_expected_data_yi_olusturur() {
        //set the expected data

        Faker faker = new Faker();
        int number = faker.number().numberBetween(1, 10);
        ArrayList<Integer> lessonlist = new ArrayList();
        lessonlist.add(number);

      int educationId=  faker.number().numberBetween(1,20);
      ElifExceptedPojo expectedData=  elifExceptedPojo=new ElifExceptedPojo("FRIDAY",educationId,lessonlist,"11:00","12:00");

        System.out.println("expectedData = " + expectedData);


    }

    @Given("kullanici post request yaparak ders programi  olusturur")
    public void kullanici_post_request_yaparak_ders_programi_olusturur() {

        //get the request set the expected data


    }

    @Given("kullanici olusturdugu ders programini dogrular")
    public void kullanici_olusturdugu_ders_programini_dogrular() {

        //Do assertion


    }

}
