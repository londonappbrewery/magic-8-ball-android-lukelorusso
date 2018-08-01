package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView ballDisplay;
    private int[] ballArray = {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ballDisplay = findViewById(R.id.image_eightball);
        Button myButton = findViewById(R.id.button_ask);
        randomBall();
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randomBall();
            }
        });
    }

    private void randomBall() {
        Random randomNumberGenerator = new Random();
        ballDisplay.setImageResource(
                // .nextInt(...) returns a pseudo-random, uniformly distributed {@code int} value
                // between 0 (inclusive) and the specified value (exclusive)
                ballArray[randomNumberGenerator.nextInt(ballArray.length)]
        );
    }
}
