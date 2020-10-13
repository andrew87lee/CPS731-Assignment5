package com.example.assignment5;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.content.Context;
import android.content.Intent;

import java.util.ArrayList;

public class recipeAdapter extends RecyclerView.Adapter<recipeAdapter.recipeViewHolder> {
    private final ArrayList<String> recipes;
    private final ArrayList<String> descs;
    private final ArrayList<String> fullRecipes;
    private LayoutInflater mInflater;
    private Context mContext;

    public recipeAdapter(Context context, ArrayList<String> recipes, ArrayList<String> descs, ArrayList<String> fullRecipes) {
        mInflater = LayoutInflater.from(context);
        this.recipes = recipes;
        this.descs = descs;
        this.fullRecipes = fullRecipes;
        mContext = context;
    }
    @Override
    public recipeAdapter.recipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.recipe_item, parent, false);
        return new recipeViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull recipeAdapter.recipeViewHolder holder, int position) {
        String recipeName = recipes.get(position);
        String description = descs.get(position);
        holder.nameView.setText(recipeName);
        holder.descView.setText(description);
    }

    @Override
    public int getItemCount() {
        return recipes.size();
    }

    private void getLayoutPosition() {
    }

    public class recipeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final TextView nameView;
        public final TextView descView;
        final recipeAdapter mAdapter;

        public recipeViewHolder(View itemView, recipeAdapter adapter) {
            super(itemView);
            nameView = itemView.findViewById(R.id.name);
            descView = itemView.findViewById(R.id.description);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int mPosition = getLayoutPosition();
            String element = recipes.get(mPosition);
            Intent intent = new Intent(mContext, recipePage.class);
            intent.putExtra("fullRecipe", fullRecipes.get(mPosition));
            mContext.startActivity(intent);
        }
    }
}