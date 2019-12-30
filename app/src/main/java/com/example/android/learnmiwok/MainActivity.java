package com.example.android.learnmiwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*public void openNumberActivity(View view){
        Intent Num = new Intent(this, NumbersActivity.class);
        startActivity(Num);
    }

    public void openRelationActivity(View view){
        Intent Rel = new Intent(this, Relations.class);
        startActivity(Rel);
    }

    public void openColorsActivity(View view){
        Intent Col = new Intent(this, Colors.class);
        startActivity(Col);
    }

    public void openPhrasesActivity(View view){
        Intent Phr = new Intent(this, PhrasesActivity.class);
        startActivity(Phr);
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView numbers = (TextView) findViewById(R.id.number);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Num = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(Num);
            }
        });

        TextView colors = (TextView) findViewById(R.id.color);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Col = new Intent(MainActivity.this, Colors.class);
                startActivity(Col);
            }
        });

        TextView relations = (TextView) findViewById(R.id.relation);
        relations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Rel = new Intent(MainActivity.this, Relations.class);
                startActivity(Rel);
            }
        });

        TextView phrases = (TextView) findViewById(R.id.phrase);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Phr = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(Phr);
            }
        });
    }
}
