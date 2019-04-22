package com.example.expt1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        String savedExtra = getIntent().getStringExtra("Text");
        TextView myText = findViewById(R.id.textID);
        myText.setText(savedExtra);
    }
}
