package com.example.moandroidapps.usingimagewithinapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.long_dummy_text);
        String strValue = tv.getText().toString();

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < 10; i++) {
            stringBuilder.append(strValue + "\n\n");
        }

        tv.setText(stringBuilder);
    }
}
