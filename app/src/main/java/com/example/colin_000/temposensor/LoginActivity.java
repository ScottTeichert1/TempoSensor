package com.example.colin_000.temposensor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    String[] usernameLogin = {
            "Colin",
            "Scott",
            "James",
            "Nick",
            "Daniel"
    };

    String[] userPassword = {
            "Frerichs",
            "Teichert",
            "Hughes",
            "Zuniga",
            "Sanchez"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button login = (Button) findViewById(R.id.loginButton);
        final TextView userName = (TextView) findViewById(R.id.userName);
        final TextView password = (TextView) findViewById(R.id.userPassword);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(LoginActivity.this, AnotherActivity.class);
                LoginActivity.this.startActivity(myIntent);
            }
        };
        login.setOnClickListener(listener);
    }
}
