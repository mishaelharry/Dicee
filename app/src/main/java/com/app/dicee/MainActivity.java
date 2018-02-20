package com.app.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView leftDice =  findViewById(R.id.image_leftDice);
        final ImageView rightDice = findViewById(R.id.image_rightDice);

        Button myButton = findViewById(R.id.rollButton);

        final int[] diceArray =  new int[]{
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomNumberGenerator = new Random();

                int number1 = randomNumberGenerator.nextInt(6);

                leftDice.setImageResource(diceArray[number1]);

                int number2 = randomNumberGenerator.nextInt(6);

                rightDice.setImageResource(diceArray[number2]);

                if (number1 == number2){
                    Toast.makeText(MainActivity.this, "Congratulation, You won", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
