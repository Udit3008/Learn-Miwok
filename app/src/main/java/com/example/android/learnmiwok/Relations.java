package com.example.android.learnmiwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Relations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relations);

        ArrayList<Word> Relations = new ArrayList<Word>();

        Relations.add(new Word(R.drawable.family_father,"father", "әpә"));
        Relations.add(new Word(R.drawable.family_mother,"mother", "әṭa"));
        Relations.add(new Word(R.drawable.family_son,"son", "angsi"));
        Relations.add(new Word(R.drawable.family_daughter,"daughter", "tune"));
        Relations.add(new Word(R.drawable.family_older_brother,"older brother", "taachi"));
        Relations.add(new Word(R.drawable.family_younger_brother,"younger brother", "chalitti"));
        Relations.add(new Word(R.drawable.family_older_sister,"older sister", "teṭe"));
        Relations.add(new Word(R.drawable.family_younger_sister,"younger sister", "kolliti"));
        Relations.add(new Word(R.drawable.family_grandmother,"grandmother", "ama"));
        Relations.add(new Word(R.drawable.family_grandfather,"grandfather", "paapa"));

        /*LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);
        TextView numView = new TextView(this);
        numView.setText(Relations.get(0));
        rootView.addView(numView);
        ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item,Relations);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);*/

        WordAdapter adapter = new WordAdapter(this, Relations, R.color.category_relations);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);
//gn

    }
}
