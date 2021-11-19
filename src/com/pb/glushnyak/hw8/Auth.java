package com.pb.glushnyak.hw8;

public class Auth {
  public String  login;
  public String password;

  public void signUp (String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException{
     boolean approvedLogin = false;
    boolean approvedPassword = false;
    if (login.length() >= 5 && login.length() <= 20 && login.matches("^[a-zA-Z0-9]+$") ) {
      approvedLogin = true;
  } else {
      throw new WrongLoginException("Логин не соответствует требованиям: длина от 5 до 20 символов,состоит из латинских символов или цифр");
    }
    if (password.length() > 5 && password.matches("^[a-zA-Z0-9_]+$")) {
      approvedPassword = true;
    } else {
      throw new  WrongPasswordException ("Пароль не соответсвует требованиям: длина менее 5 символов или состоит из латинских символов или цифр и тире");
    }
    if (password.equals(confirmPassword) && approvedPassword && approvedLogin) {
      this.login = login;
      this.password = password;
    } else {
     throw new  WrongPasswordException ("Пароль и подтверждение пароля не совпадает, повторите ввод");
    }
  }

    public void signIn (String login, String password) throws WrongLoginException{
    if (login.equals(this.login) && password.equals(this.password)) {
      System.out.println("Вход на сайт успешно совершен");
    } else {
      throw new WrongLoginException ("Ошибка при введении логина или пароля");
    }

  }

}
