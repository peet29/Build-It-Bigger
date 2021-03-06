package com.example.showjoke;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public final String JOKE_KEY = "joke";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent intent = getIntent();

        TextView textView = (TextView)findViewById(R.id.text_joke);
        textView.setText(intent.getStringExtra(JOKE_KEY));
    }
}
