package com.example.lucknumberapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class luckynumber extends AppCompatActivity {

    TextView textview3;
    Button btn2,btn3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luckynumber);
        textview3 = findViewById(R.id.textView3);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);


        Intent i = getIntent();
        String email = i.getStringExtra("email");
        String password = i.getStringExtra("password");
        String Cpassword = i.getStringExtra("Cpassword");
        String username = i.getStringExtra("username");

        //setting the random number

        int random1 = random();

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview3.setText(""+random1);
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareData(username, random1 );
            }
        });



    }

    public int random(){
        Random r = new Random();
        int rn = r.nextInt(1000);

        return rn ;
    }

    public void shareData(String u, int r){
        //implicit intent
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_SUBJECT ,u+"'s lucky number");
        i.putExtra(Intent.EXTRA_TEXT , "the Lucky number of "+u+" is "+r);

        startActivity(Intent.createChooser(i,"Choose the application"));
    }
}