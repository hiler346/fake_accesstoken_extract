package TEST;

import Utils.BaseUri.BaseUriTest;
import Utils.Steps.Profile;
import org.junit.jupiter.api.*;

import static io.qameta.allure.Allure.step;


  @TestMethodOrder(MethodOrderer.OrderAnnotation.class)

  @Tag("Tokens")
  @DisplayName("Вытащить AccessToken")
  public class ProfileExtractAccesToken extends BaseUriTest {

    @Test
    @Order(1)
    @DisplayName("Извлечь AccessToken в файл")
    void Login() {
      step("Извлечь AccessToken в файл", () -> {
        Profile.writeTokens();
      });
    }

    }





