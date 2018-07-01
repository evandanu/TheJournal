package com.example.admin.thejournal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends MainActivity {
    SQLiteOpenHelper openHelper;
    SQLiteDatabase db;
    Button SignUp;
    EditText username, phone, email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        openHelper = new DatabaseHelper(this);
        SignUp = (Button) findViewById(R.id.button3);
        username = (EditText) findViewById(R.id.editText7);
        phone = (EditText) findViewById(R.id.editText8);
        email = (EditText) findViewById(R.id.editText9);
        password = (EditText) findViewById(R.id.editText10);

        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db = openHelper.getWritableDatabase();
                String username = ((EditText) findViewById(R.id.editText7)).getText().toString();
                String phone = ((EditText) findViewById(R.id.editText8)).getText().toString();
                String email = ((EditText) findViewById(R.id.editText9)).getText().toString();
                String password = ((EditText) findViewById(R.id.editText10)).getText().toString();
                insertdata(username, phone, email, password);

                Toast.makeText(getApplicationContext(), "register success",Toast.LENGTH_LONG).show();

            }
        });
    }

    public void insertdata(String username, String phone, String email, String password){

        ContentValues contentValues = new ContentValues();
        contentValues.put(DatabaseHelper.COL_2, username);
        contentValues.put(DatabaseHelper.COL_3, phone);
        contentValues.put(DatabaseHelper.COL_4, email);
        contentValues.put(DatabaseHelper.COL_5, password);

        long id = db.insert(DatabaseHelper.TABLE_NAME, null, contentValues);


    }
}
