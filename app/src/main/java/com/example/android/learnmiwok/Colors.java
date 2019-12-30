package com.example.android.learnmiwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> Colors = new ArrayList<Word>();

        Colors.add(new Word(R.drawable.color_red,"red", "weṭeṭṭi"));
        Colors.add(new Word(R.drawable.color_green,"green", "chokokki"));
        Colors.add(new Word(R.drawable.color_brown,"brown", "ṭakaakki"));
        Colors.add(new Word(R.drawable.color_gray,"gray", "ṭopoppi"));
        Colors.add(new Word(R.drawable.color_black,"black", "kululli"));
        Colors.add(new Word(R.drawable.color_white,"white", "kelelli"));
        Colors.add(new Word(R.drawable.color_dusty_yellow,"dusty yellow", "ṭopiisә"));
        Colors.add(new Word(R.drawable.color_mustard_yellow,"mustard yellow", "chiwiiṭә"));

        /*LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);
        TextView numView = new TextView(this);
        numView.setText(Colors.get(0));
        rootView.addView(numView);
        ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item,Colors);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);*/

        WordAdapter adapter = new WordAdapter(this, Colors, R.color.category_colors);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);


    }
}
