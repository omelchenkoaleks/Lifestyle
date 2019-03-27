package com.omelchenkoaleks.fish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        ArrayAdapter<Fish> listCategoryAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, Fish.fishArray);

        ListView listFish = findViewById(R.id.category_list_lv);
        listFish.setAdapter(listCategoryAdapter);
    }
}
