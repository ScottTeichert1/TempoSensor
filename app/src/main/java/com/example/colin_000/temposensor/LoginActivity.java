package com.example.colin_000.temposensor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText mUserName;
    private EditText mPasswordField;
    private Button mLoginButton;

    private String mUsername = "LOGIN";
    private String mPassword = "password";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mLoginButton = (Button) findViewById(R.id.loginButton);
        mUserName = (EditText) findViewById(R.id.userName);
        mPasswordField = (EditText) findViewById(R.id.userPassword);

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mUserName.getText().toString().equals(mUsername) && mPasswordField.getText().toString().equals(mPassword)) {
                    
                } else {
                    Toast.makeText(LoginActivity.this, "Sorry, that username password combination is incorrect.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}
