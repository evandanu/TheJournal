package com.example.admin.thejournal;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity {

    Button log_in, sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        log_in = (Button) findViewById(R.id.button);
        sign_up = (Button) findViewById(R.id.button2);

        log_in.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        LoginActivity.class);
                startActivity(intent);
            }
        });

        sign_up.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        SignUpActivity.class);
                startActivity(intent);
            }
        });

    }
}
