package com.example.assignment5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> recipes = new ArrayList<>();
    private ArrayList<String> descs = new ArrayList<>();
    private ArrayList<String> fullRecipes = new ArrayList<>();

    private RecyclerView recyclerView;
    private recipeAdapter adapter;


    private void initRecipes(){
        recipes.add("Kale/Lemon Sandwiches");
        descs.add("Placeholder description Kale/Lemon Sandwiches description Kale/Lemon Sandwiches description Kale/Lemon Sandwiches description");
        fullRecipes.add("Placeholder recipe Kale/Lemon Sandwiches recipe Kale/Lemon Sandwiches recipe Kale/Lemon Sandwiches recipe Kale/Lemon Sandwiches recipe");

        recipes.add("Mango-Lime Bean Salad");
        descs.add("Placeholder description Mango-Lime Bean Salad description Mango-Lime Bean Salad description Mango-Lime Bean Salad description ");
        fullRecipes.add("Placeholder recipe Mango-Lime Bean Salad recipe Mango-Lime Bean Salad recipe Mango-Lime Bean Salad recipe Mango-Lime Bean Salad recipe");

        recipes.add("Sweet Potato and Lentil Soup with Shiitake \nMushrooms");
        descs.add("Placeholder description Sweet Potato and Lentil Soup with Shiitake Mushrooms description Sweet Potato and Lentil Soup with Shiitake Mushrooms description ");
        fullRecipes.add("Placeholder recipe Sweet Potato and Lentil Soup with Shiitake Mushrooms recipe Sweet Potato and Lentil Soup with Shiitake Mushrooms recipe Sweet Potato and Lentil Soup with Shiitake Mushrooms recipe Sweet Potato and Lentil Soup with Shiitake Mushrooms recipe");

        recipes.add("Lime Mousse");
        descs.add("Placeholder description Lime Mousse description Lime Mousse description Lime Mousse description ");
        fullRecipes.add("Placeholder recipe Lime Mousse recipe Lime Mousse recipe Lime Mousse recipe Lime Mousse recipe");

        recipes.add("Broiled Tilapia Parmesan");
        descs.add("Placeholder description Broiled Tilapia Parmesan description Broiled Tilapia Parmesan description Broiled Tilapia Parmesan description ");
        fullRecipes.add("Placeholder recipe Broiled Tilapia Parmesan recipe Broiled Tilapia Parmesan recipe Broiled Tilapia Parmesan recipe Broiled Tilapia Parmesan recipe");

        recipes.add("Last Recipe");
        descs.add("Placeholder description Placeholder description Placeholder description Placeholder description Placeholder description Placeholder description");
        fullRecipes.add("Placeholder recipe Placeholder recipe Placeholder recipe Placeholder recipe Placeholder recipe");

        recipes.add("Last Recipe2");
        descs.add("Placeholder description Placeholder description Placeholder description Placeholder description Placeholder description Placeholder description");
        fullRecipes.add("Placeholder recipe Placeholder recipe Placeholder recipe Placeholder recipe Placeholder recipe");

        recipes.add("Last Recipe");
        descs.add("Placeholder description Placeholder description Placeholder description Placeholder description Placeholder description Placeholder description");
        fullRecipes.add("Placeholder recipe Placeholder recipe Placeholder recipe Placeholder recipe Placeholder recipe");

        recipes.add("Last Recipe");
        descs.add("Placeholder description Placeholder description Placeholder description Placeholder description Placeholder description Placeholder description");
        fullRecipes.add("Placeholder recipe Placeholder recipe Placeholder recipe Placeholder recipe Placeholder recipe");

        recipes.add("Last Recipe");
        descs.add("Placeholder description Placeholder description Placeholder description Placeholder description Placeholder description Placeholder description");
        fullRecipes.add("Placeholder recipe Placeholder recipe Placeholder recipe Placeholder recipe Placeholder recipe");


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRecipes();

        recyclerView = findViewById(R.id.recyclerview);
        adapter = new recipeAdapter(this, recipes, descs, fullRecipes);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}