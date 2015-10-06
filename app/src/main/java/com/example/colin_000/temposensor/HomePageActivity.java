package com.example.colin_000.temposensor;

import android.content.Intent;
import android.media.audiofx.Equalizer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomePageActivity extends AppCompatActivity {

    private Button mStartListeningButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        Toast.makeText(getApplicationContext(), "Here is our login, guys.", Toast.LENGTH_LONG).show();
        mStartListeningButton = (Button) findViewById(R.id.startListeningButton);

        mStartListeningButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startEqualizer();
            }
        });
    }

    public void startEqualizer() {
        Intent listeningIntently = new Intent(this, Equalizer.class);
        startActivity(listeningIntently);
    }
}
