package com.naimweb3.playrn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText userET;
    Button submitBtn;

    int appNumber,userNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userET = findViewById(R.id.userET);
        submitBtn = findViewById(R.id.submitBtn);

        Random rand = new Random();

// Obtain a number between [0 - 10].
        appNumber = rand.nextInt(10)+1;

// Add 1 to the result to get a number from the required range
// (i.e., [1 - 10]).



        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userStr = userET.getText().toString().trim();
                //string to int
                userNumber = Integer.parseInt(userStr);

                if (userNumber < appNumber) {
                    Toast.makeText(MainActivity.this, "Enter a haigest number", Toast.LENGTH_LONG).show();
                }
                else if(userNumber == appNumber)
                {
                    Toast.makeText(MainActivity.this, "Enter a lower number", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "congrates your number is correct", Toast.LENGTH_LONG).show();
                }

                //edit text clear
                userET.setText(" ");
                Random rand = new Random();
                // Obtain a number between [0 - 10].
                appNumber = rand.nextInt(10)+1;

            }
        });

    }
}