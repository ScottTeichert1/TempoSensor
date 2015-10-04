package com.example.colin_000.temposensor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        Toast.makeText(getApplicationContext(), "Here is out login, guys.", Toast.LENGTH_LONG).show();

    }
}
