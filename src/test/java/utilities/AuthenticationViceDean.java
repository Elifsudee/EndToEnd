package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class AuthenticationViceDean {
    public static String generateTokenViceDean() {

        String body = "{ \"password\": \"12345678\", \"username\": \"vice_dean_team06\"}";
        Response response = given().
                contentType(ContentType.JSON).
                body(body).
                post("https://managementonschools.com/app/auth/login");

        return response.jsonPath().getString("token");
    }
}
