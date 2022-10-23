package Utils.BaseUri;

import Utils.Api;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class BaseUriProd {
  @BeforeAll
  public static void BaseUtils() {
    RestAssured.baseURI = (Api.baseUriProd);
  }
}
