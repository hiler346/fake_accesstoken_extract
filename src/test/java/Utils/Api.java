package Utils;

public class Api {
  //Выберите среду и запустите тесты в консоли
  //gradle clean tests (запуск всех тестов)
  //gradle clean dev_env @Tag("DEV")
  //gradle clean test_env @Tag("TEST")
  //gradle clean prod_env @Tag("PROD")

  //Dev
  public static String baseUriDev = System.getProperty("stand", "");

  //Test
  public static String baseUriTest = System.getProperty("stand", "Вставить ссылочку :)");

  //Prod
  public static String baseUriProd = System.getProperty("stand", "");
}