package com.omelchenkoaleks.intent;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    TextView mReceiveText;
    SharedPreferences mSharedPreferences;
    public static final String SAVE_TEXT = "save text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mReceiveText = findViewById(R.id.text_tv);
        Intent intent = getIntent();
        String receiveText = intent.getStringExtra(MainActivity.EXTRA_SAVE_TEXT);


        if (receiveText != null) {
            mReceiveText.setText(receiveText);
        } else {
            loadText();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        saveText();
    }

    private void saveText() {
        mSharedPreferences = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(SAVE_TEXT, mReceiveText.getText().toString().trim());
        editor.apply();

        Toast.makeText(this, "Text saved", Toast.LENGTH_SHORT).show();
    }

    private void loadText() {
        mSharedPreferences = getPreferences(MODE_PRIVATE);
        String savedText = mSharedPreferences.getString(SAVE_TEXT, null);
        mReceiveText.setText(savedText);

        Toast.makeText(this, "Loaded text", Toast.LENGTH_SHORT).show();
    }
}
