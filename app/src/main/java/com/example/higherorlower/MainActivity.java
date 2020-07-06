package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void generateRandomNumber() {

        Random randNumber = new Random();

        randomNumber = randNumber.nextInt(20) + 1;
    }

    public void guess(View view) {

        EditText guessNumber = (EditText) findViewById(R.id.guessText);

        int guessValue = Integer.parseInt(guessNumber.getText().toString());

        String message;

        if (guessValue > randomNumber) {
            message = "Lower!";
        } else if (guessValue < randomNumber) {
            message = "Higher!";
        } else {
            message = "You got it!";

            generateRandomNumber();
        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

        Log.i("Entered value", guessNumber.getText().toString());

        Log.i("Random number: ", Integer.toString(randomNumber));




}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateRandomNumber();

    }
}