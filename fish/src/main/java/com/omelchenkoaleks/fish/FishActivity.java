package com.omelchenkoaleks.fish;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FishActivity extends AppCompatActivity {
    public static final String EXTRA_FISH = "fish";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fish);

        // получаем рыбу из данных Intent
        int fishId = (int) getIntent().getExtras().get(EXTRA_FISH);
        Fish fish = Fish.fishArray[fishId];

        // заполняем название
        TextView nameFish = findViewById(R.id.name_tv);
        nameFish.setText(fish.getName());

        // заполняем описание
        TextView descriptionFish = findViewById(R.id.description_tv);
        descriptionFish.setText(fish.getDescription());

        // заполняем изображение
        ImageView photoFish = findViewById(R.id.photo_iv);
        photoFish.setImageResource(fish.getImageResourceId());
    }
}
