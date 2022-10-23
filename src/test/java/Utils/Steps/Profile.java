package Utils.Steps;

import ModelsProfile.UserLogin;
import Utils.Generator;
import Utils.HelpModels.ProfileHelpModel;
import Utils.TypeRequest;
import io.restassured.response.Response;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class  Profile {
  protected static ProfileHelpModel profile = new ProfileHelpModel();

  public static String Login1(String phone) {
    UserLogin userLogin = Generator.ParamsUserLogin(phone, "Пароль");

    Response response = TypeRequest.POST_BODY_LOGIN("Указать ссылку на авторизацию", userLogin, 200);

    profile.accessToken = response.path("accessToken");
    profile.refreshToken = response.path("refreshToken");

    return profile.accessToken;
  }

  public static List<String> getPhones(String path) throws IOException {
    Path filePath = Paths.get(String.format(path));
    Charset charset = StandardCharsets.UTF_8;

    return Files.readAllLines(filePath, charset);
  }

  public static void writeTokens() throws IOException, InterruptedException {
    //Указать путь сохранение в файл AccessToken
    FileWriter myWriter = new FileWriter("Указать полный путь сохранения AccessToken в формате .txt");
    //Указать где будет брать номера телефонов для авторизации
    List<String> x = getPhones("Указать полный путь откуда будет брать номера в формате .txt");

    for (int i = 0; i < x.size(); i++) {

      String token = Login1(x.get(i));
      myWriter.write(token + "\n~\n");
      System.out.println(x.get(i));
    }

//    for (String phone : x) {
//      String token = Login1(phone);
//      myWriter.write(token + "\n");
//      Thread.sleep(3000);
//      System.out.println(phone);
//    }

    myWriter.close();
    System.out.println("Successfully wrote to the file.");
  }

}
