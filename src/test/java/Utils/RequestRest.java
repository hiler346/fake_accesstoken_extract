package Utils;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.io.File;

import static io.restassured.RestAssured.given;

public class RequestRest {

  public static RequestSpecification Login(Object object) {
    RequestSpecification request = given()
        .header("Accept-Language", "ru")
        .contentType(ContentType.JSON)
        .log().body()
        .filter(new AllureRestAssured())
        .log().uri()
        .body(object);

    return request;
  }

}