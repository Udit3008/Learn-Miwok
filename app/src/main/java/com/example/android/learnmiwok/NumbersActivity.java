package com.example.android.learnmiwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> Numbers = new ArrayList<Word>();

        Numbers.add(new Word(R.drawable.number_one,"one", "lutti"));
        Numbers.add(new Word(R.drawable.number_two,"two", "otiiko"));
        Numbers.add(new Word(R.drawable.number_three,"three", "tolookosu"));
        Numbers.add(new Word(R.drawable.number_four,"four", "oyyisa"));
        Numbers.add(new Word(R.drawable.number_five,"five", "massokka"));
        Numbers.add(new Word(R.drawable.number_six,"six", "temmokka"));
        Numbers.add(new Word(R.drawable.number_seven,"seven", "kenekaku"));
        Numbers.add(new Word(R.drawable.number_eight,"eight", "kawinta"));
        Numbers.add(new Word(R.drawable.number_nine,"nine", "wo'e"));
        Numbers.add(new Word(R.drawable.number_ten,"ten", "na'aacha"));

        /*LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);
        TextView numView = new TextView(this);
        numView.setText(Numbers.get(0));
        rootView.addView(numView);
        ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item,Numbers);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);*/

        WordAdapter adapter = new WordAdapter(this, Numbers, R.color.category_numbers);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);


    }
}
