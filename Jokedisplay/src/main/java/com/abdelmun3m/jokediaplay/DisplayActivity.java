package com.abdelmun3m.jokediaplay;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    String question ,answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        String joke = getIntent().getStringExtra("joke");
         question = joke.split("\\,")[0];
         answer = joke.split("\\,")[1];
        TextView q = (TextView) findViewById(R.id.question);
        q.setText(question);
    }

    public void show(View v){
        TextView a = (TextView) findViewById(R.id.answer);
        a.setText(answer);
    }

}
