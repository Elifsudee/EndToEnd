package stepDefinitions.api_test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static base_urls.MedunnaBaseUrl.spec;

public class RoomCreationStepDefs{

    @Given("send post request creating room")
    public void send_post_request_creating_room() {
        //set the url https://medunna.com/api/rooms

        spec.pathParams("first","api","second","rooms");

        //set the expected data





    }

    @Then("get the response and validate")
    public void get_the_response_and_validate() {


    }



}




