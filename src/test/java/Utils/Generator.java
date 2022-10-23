package Utils;

import ModelsProfile.UserLogin;

public class Generator {
  public static UserLogin ParamsUserLogin(String phone, String password)
  {
    UserLogin userLogin = new UserLogin();
    userLogin.setPhone(phone);
    userLogin.setPassword(password);

    return userLogin;
  }


}
