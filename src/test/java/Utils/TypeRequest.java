package Utils;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class TypeRequest {

  public static Response POST_BODY_LOGIN(String path, Object object, int statusCode) {
    Response response = given()
        .spec(RequestRest.Login(object))
        .when()
        .post(path)
        .then()
        .log().body()
        .spec(ResponseRest.Status(statusCode))
        .extract()
        .response();

    return response;
  }


}