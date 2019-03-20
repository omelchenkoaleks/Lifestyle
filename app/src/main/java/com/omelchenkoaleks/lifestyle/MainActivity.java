package com.omelchenkoaleks.lifestyle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner mChooseLifeStyle;
    TextView mWatchGoals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mChooseLifeStyle = findViewById(R.id.spinner_id);
        mWatchGoals = findViewById(R.id.text_view_id);
    }

    public void onChooseWayOfLifeClick(View view) {
        String watchGoals = String.valueOf(mChooseLifeStyle.getSelectedItem());
        mWatchGoals.setText(watchGoals);
    }
}
