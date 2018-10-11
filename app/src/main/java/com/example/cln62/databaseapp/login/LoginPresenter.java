package com.example.cln62.databaseapp.login;

public class LoginPresenter implements LoginContract.Presenter {
    LoginContract.View view;
    public LoginPresenter(LoginActivity loginActivity) {
        view = loginActivity;//wring is done here


    }

    @Override
    public void loginClicked() {
        view.showToast();
    }
}
