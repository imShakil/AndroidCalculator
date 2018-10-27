package com.android.imshakil.androidcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class AboutMe extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        textView = findViewById(R.id.txtv);
        Linkify.addLinks(textView, Linkify.ALL);
    }
}
