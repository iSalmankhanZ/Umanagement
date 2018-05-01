package com.pubproject.management;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.pubproject.management.Controller.Home;
import com.pubproject.management.Controller.SignIn;
import com.pubproject.management.Controller.SignUp;

public class MainActivity extends AppCompatActivity {

    Button btnsignin,btnsignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsignin = (Button)findViewById(R.id.btnSignIn);
        btnsignup = (Button)findViewById(R.id.btnSignUp);

        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SignUp.class);
                startActivity(intent);
                finish();
            }
        });

        btnsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SignIn.class);
                startActivity(intent);
                finish();
            }
        });
    }
}