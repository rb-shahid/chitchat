package com.bytesahft.chattest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editTextPhoneNumber;
    private EditText editTextPassword;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextPhoneNumber = (EditText) findViewById(R.id.et_phone_number);
        editTextPassword = (EditText) findViewById(R.id.et_password);
        loginButton = (Button) findViewById(R.id.btn_login);
        loginButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String phoneNumber = editTextPhoneNumber.getText().toString();
        String password = editTextPassword.getText().toString();

        startActivity(new Intent(LoginActivity.this, MainActivity.class));
    }
}
