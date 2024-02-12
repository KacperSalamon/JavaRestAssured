package com.RestAssured;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.Cookie;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Cookies {
    @Test
    public void cookiesMethod() {
        Cookie objCookies = new Cookie.Builder("someCookie", "someValue").setSecured(true).setComment("someComment").build();
        given().baseUri("https://jsonplaceholder.typicode.com/").cookie(objCookies).log().all().//cookie("username", "randomPost").log().all(). - to jest jedna z metod możliwości przekazania ciasteczek inną jest opcja zbudowania obiektu jak wyżej
                when().get("posts").
                        then().assertThat().statusCode(200).statusLine(containsString("OK")).
                        time(lessThan(2000L));//sprawdzenie czasu odp.
                        //.cookie("someCookie", "someValue"); - tak możemy sprawdzić czy jest zwracany jakiś
    }
}
