package com.abdelmun3m.jokediaplay;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
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
        TextView q = (TextView) findViewById(R.id.question);
        if(joke.contains("joke:") ){
                joke = joke.split("\\:")[1];
                question = joke.split("\\,")[0];
                answer = joke.split("\\,")[1];
            }else{
                question = "Error";
                answer = "Error";
            }
        q.setText(question);
    }

    public void show(View v){
        TextView a = (TextView) findViewById(R.id.answer);
        a.setText(answer);
    }

}
