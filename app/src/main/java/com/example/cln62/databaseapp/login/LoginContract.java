package com.example.cln62.databaseapp.login;

public interface LoginContract {
    public interface View{
        void showToast();
    };
    public interface Presenter{
        void loginClicked();
    };
}
