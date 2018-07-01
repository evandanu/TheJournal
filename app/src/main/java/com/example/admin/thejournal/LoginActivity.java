package com.example.admin.thejournal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends MainActivity {

    EditText email, password;
    Button signin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        email = (EditText) findViewById(R.id.editText);
        password = (EditText) findViewById(R.id.editText2);
        signin = (Button) findViewById(R.id.google_sign_in_button);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,
                        UpdateActivity.class);
                startActivity(intent);
            }
        });

    }
}
