package com.shajt3ch.dogdiary.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shajt3ch.dogdiary.R;
import com.shajt3ch.dogdiary.model.DogBreed;
import com.shajt3ch.dogdiary.util.Util;

import java.util.ArrayList;
import java.util.List;

public class DogListAdapter extends RecyclerView.Adapter<DogListAdapter.DogViewHolder> {

    private ArrayList<DogBreed> dogList;

    public DogListAdapter(ArrayList<DogBreed> dogList) {
        this.dogList = dogList;
    }


    public void updateDogList(List<DogBreed> newDogList) {
        dogList.clear();
        dogList.addAll(newDogList);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public DogViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dog, parent, false);

        return new DogViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DogViewHolder holder, int position) {

        ImageView image = holder.itemView.findViewById(R.id.imageView);
        TextView name = holder.itemView.findViewById(R.id.name);
        TextView lifespan = holder.itemView.findViewById(R.id.lifespan);

        name.setText(dogList.get(position).dogBreed);
        lifespan.setText(dogList.get(position).lifeSpan);

        Util.loadImage(image, dogList.get(position).imageUrl, Util.getProgressDrawable(image.getContext()));

    }

    @Override
    public int getItemCount() {
        return dogList.size();
    }

    class DogViewHolder extends RecyclerView.ViewHolder {
        public View itemView;

        public DogViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemView = itemView;
        }
    }


}
