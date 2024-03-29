package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static utilities.AuthenticationViceDean.generateTokenViceDean;

public class ManagementonSchoolsBaseUrl {
    public static RequestSpecification spec;

    public static void setUp(){
        spec= new RequestSpecBuilder().setContentType(ContentType.JSON).addHeader("Authorization",generateTokenViceDean())
                .setBaseUri("managementonschools.com/app/").build();


    }

}
