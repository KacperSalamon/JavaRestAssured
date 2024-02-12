package com.RestAssured.DELETE;

import io.restassured.builder.RequestSpecBuilder;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Delete {
    io.restassured.specification.RequestSpecification requestSpecification;
    @BeforeClass
    public void beforeClassMethod() {
        RequestSpecBuilder objBuilder = new RequestSpecBuilder();
        objBuilder.setBaseUri("https://jsonplaceholder.typicode.com/");
        objBuilder.addHeader("x-api-key", "value1");
        //objBuilder.log(logDetail.ALL);

        requestSpecification = objBuilder.build(); // !!!
    }
    @Test
    public void deleteMethod(){
        String payload = "{\n" +
                "        \"userId\": 1,\n" +
                "        \"id\": 1,\n" +
                "        \"title\": \"test\",\n" +
                "        \"body\": \"quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto\"\n" +
                "}";
        given().spec(requestSpecification).
                when().delete("posts/2").
                then().log().all().assertThat().statusCode(200).body(is(not(empty())));

    }
}
