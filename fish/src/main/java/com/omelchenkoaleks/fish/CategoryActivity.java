package com.omelchenkoaleks.fish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

        AdapterView.OnItemClickListener onItemClickListener =
                new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view,
                                    int position,
                                    long id) {
                Intent intent = new Intent(
                        CategoryActivity.this, FishActivity.class);
                // cast (int) нужен обязательно или выскочит exception
                intent.putExtra(FishActivity.EXTRA_FISH, (int) id);
                startActivity(intent);
            }
        };

        listFish.setOnItemClickListener(onItemClickListener);
    }
}
