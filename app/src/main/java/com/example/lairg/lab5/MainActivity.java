package com.example.lairg.lab5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void firstTry(View view){
        startActivity(new Intent(this, firstTry.class));
    }
    public void secondTry(View view){
        startActivity(new Intent(this, SecondTry.class));
    }
    public void secondProgram(View view){
        startActivity(new Intent(this, SecondProgram.class));
    }
    public void thirdProgram(View view){
        startActivity(new Intent(this, ThirdProgram.class));
    }
    public void fourthProgram(View view){startActivity(new Intent(this, FourthProgram.class)); }
    public void individual(View view){startActivity(new Intent(this, Individual.class)); }


}
