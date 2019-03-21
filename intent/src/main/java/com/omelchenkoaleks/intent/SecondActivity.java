package com.omelchenkoaleks.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {
    TextView mReceiveText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mReceiveText = findViewById(R.id.text_tv);

        Intent intent = getIntent();
        String receiveText = intent.getStringExtra(MainActivity.EXTRA_SAVE_TEXT);
        mReceiveText.setText(receiveText);
    }
}
