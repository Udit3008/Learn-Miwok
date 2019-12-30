package com.example.android.learnmiwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Word> PhrasesActivity = new ArrayList<Word>();

        PhrasesActivity.add(new Word("Where are you going?", "minto wuksus"));
        PhrasesActivity.add(new Word("What is your name?", "tinnә oyaase'nә"));
        PhrasesActivity.add(new Word("My name is...", "oyaaset..."));
        PhrasesActivity.add(new Word("How are you feeling?", "michәksәs?"));
        PhrasesActivity.add(new Word("I’m feeling good.", "kuchi achit"));
        PhrasesActivity.add(new Word("Are you coming?", "әәnәs'aa?"));
        PhrasesActivity.add(new Word("Yes, I’m coming.", "hәә’ әәnәm"));
        PhrasesActivity.add(new Word("I’m coming.", "әәnәm"));
        PhrasesActivity.add(new Word("Let’s go.", "yoowutis"));
        PhrasesActivity.add(new Word("Come here.", "әnni'nem"));

        /*LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);
        TextView numView = new TextView(this);
        numView.setText(PhrasesActivity.get(0));
        rootView.addView(numView);
        ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item,PhrasesActivity);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);*/

        WordAdapter adapter = new WordAdapter(this, PhrasesActivity, R.color.category_phrases);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);


    }
}
