package com.omelchenkoaleks.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_SAVE_TEXT = "message";
    EditText mSendText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSendText = findViewById(R.id.edit_text_tv);
    }

    public void onSaveTextToSecondActivityClick(View view) {
        String sendText = mSendText.getText().toString().trim();
        if (sendText.length() > 0) {
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra(EXTRA_SAVE_TEXT, sendText);
            startActivity(intent);
        } else {
            Toast.makeText(this, "enter text", Toast.LENGTH_SHORT).show();
        }
    }

    public void onToSecondActivityClick(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
