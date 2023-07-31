package com.example.lucknumberapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login1 extends AppCompatActivity {

    EditText lemail,lpassword,lUsername ;
    Button lbtn ;

    TextView sign;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);

        lemail =findViewById(R.id.lemail);
        lpassword = findViewById(R.id.lpassword);
        lUsername = findViewById(R.id.lUsername);
        lbtn =findViewById(R.id.lbtn);
        sign = findViewById(R.id.sign);

        lbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user_email = lemail.getText().toString();
                String user_password = lpassword.getText().toString();
                String user_name = lUsername.getText().toString();

                //creating intent/creating connection with luckynumber Activity
                Intent i = new Intent(getApplicationContext(),luckynumber.class);

                //transfering data
                i.putExtra("email",user_email);
                i.putExtra("password",user_password);
                i.putExtra("username",user_name);

                //startactivity
                startActivity(i);


            }
        });

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //explicit intent
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}