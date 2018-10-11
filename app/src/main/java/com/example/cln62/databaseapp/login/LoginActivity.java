package com.example.cln62.databaseapp.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.cln62.databaseapp.R;

public class LoginActivity extends AppCompatActivity implements LoginContract.View{
    LoginContract.Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        presenter = new LoginPresenter(this);
    }

    public void clickListen(View view) {
        switch (view.getId()){
            case R.id.buttonLogin:
                presenter.loginClicked();
                break;
            case R.id.buttonCancel:
                break;

        }
    }

    @Override
    public void showToast() {
        Toast.makeText(this,"LoginClicked",Toast.LENGTH_LONG).show();
    }
}
