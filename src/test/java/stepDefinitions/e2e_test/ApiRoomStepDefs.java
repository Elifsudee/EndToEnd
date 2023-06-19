package stepDefinitions.e2e_test;

import base_urls.MedunnaBaseUrl;
import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import pojos.RoomPojo;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static stepDefinitions.e2e_test.MedunnaRoomStepDefs.roomId;
import static stepDefinitions.e2e_test.MedunnaRoomStepDefs.roomNumberFaker;

public class ApiRoomStepDefs extends MedunnaBaseUrl {

Response response;
    RoomPojo expectedData;
    @Given("send get request")
    public void send_get_request() {
      //set the url
       spec.pathParams("first","api","second","rooms").queryParams("sort","createdDate,desc");
        //set

        //send
     response= given(spec).get("{first}/{second}");
       response.prettyPrint();


    }
    @Then("validate body")
    public void validate_body() {
        Object roomType=response.jsonPath().getList("findAll{it.roomNumber=="+roomNumberFaker+"}.roomType").get(0);
        Object status=response.jsonPath().getList("findAll{it.roomNumber=="+roomNumberFaker+"}.status").get(0);
        Object price=response.jsonPath().getList("findAll{it.roomNumber=="+roomNumberFaker+"}.price").get(0);
        Object description=response.jsonPath().getList("findAll{it.roomNumber=="+roomNumberFaker+"}.description").get(0);
        Object roomNumber = response.jsonPath().getList("findAll{it.roomNumber=="+roomNumberFaker+"}.roomNumber").get(0);

        assertEquals("SUITE",roomType);
        assertEquals(true,status);
        assertEquals("123.0",price+"");
        assertEquals("Created For End To End Test", description);

        assertEquals(roomNumberFaker, roomNumber);

    }

    @Given("send get request by id")
    public void sendGetRequestById() {

        //Set the url--> https://medunna.com/api/rooms/:id
        spec.pathParams("first","api","second","rooms","third",roomId);

        //Set the expected data
      expectedData = new RoomPojo(roomNumberFaker,"SUITE", true,123.00,"Created For End To End Test");

        //Send the request and get the response
        response = given(spec).get("{first}/{second}/{third}");
        response.prettyPrint();
        
    }

    @Then("validate body response body")
    public void validateBodyResponseBody() throws JsonProcessingException {

        //Do assertion
      RoomPojo actualData=  new ObjectMapper().readValue(response.asString(), RoomPojo.class);
      assertEquals(200,response.statusCode());

        assertEquals(expectedData.getRoomNumber(), actualData.getRoomNumber());
        assertEquals(expectedData.getPrice(), actualData.getPrice());
        assertEquals(expectedData.getStatus(), actualData.getStatus());
        assertEquals(expectedData.getDescription(), actualData.getDescription());
        assertEquals(expectedData.getRoomType(), actualData.getRoomType());

    }
}
