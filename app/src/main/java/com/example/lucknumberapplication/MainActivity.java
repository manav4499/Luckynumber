package com.example.lucknumberapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText email,password,Cpassword,Username ;
    Button btn ;
    TextView login ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email =findViewById(R.id.email);
        password = findViewById(R.id.password);
        Cpassword = findViewById(R.id.Cpassword);
        Username = findViewById(R.id.Username);
        btn =findViewById(R.id.btn);
        login = findViewById(R.id.login);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user_email = email.getText().toString();
                String user_password = password.getText().toString();
                String user_Cpassword = Cpassword.getText().toString();
                String user_name = Username.getText().toString();

                //creating intent/creating connection with luckynumber Activity
                Intent i = new Intent(getApplicationContext(),luckynumber.class);

                //transfering data
                i.putExtra("email",user_email);
                i.putExtra("password",user_password);
                i.putExtra("Cpassword",user_Cpassword);
                i.putExtra("username",user_name);

                //startactivity
                startActivity(i);


            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //explicit intent
                Intent i = new Intent(getApplicationContext(), login1.class);
                startActivity(i);
            }
        });




    }
}