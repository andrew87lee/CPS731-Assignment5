package com.example.assignment5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class recipePage extends AppCompatActivity {
    public TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_page);
        text = findViewById(R.id.fullRecipe);
        Intent intent = getIntent();
        String display = intent.getExtras().getString("fullRecipe");
        text.setText(display);
    }
}