package com.omelchenkoaleks.lifestyle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Spinner mChooseLifeStyle;
    TextView mWatchGoals;
    List<String> mExpertAdvice;

    LifeStyleExpert mExpert = new LifeStyleExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mChooseLifeStyle = findViewById(R.id.spinner_id);
        mWatchGoals = findViewById(R.id.text_view_id);

        mExpertAdvice = new ArrayList<>();
    }

    public void onChooseWayOfLifeClick(View view) {
        String watchGoals = String.valueOf(mChooseLifeStyle.getSelectedItem());
        mExpertAdvice = mExpert.getExpertAdvice(watchGoals);
        StringBuilder stringBuilder = new StringBuilder();
        for (String level : mExpertAdvice) {
            stringBuilder.append(level).append('\n');
        }
        mWatchGoals.setText(stringBuilder);
    }
}
