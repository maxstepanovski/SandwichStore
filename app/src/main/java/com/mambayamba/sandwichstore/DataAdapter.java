package com.mambayamba.sandwichstore;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by макс on 26.06.2017.
 */

public class DataAdapter extends RecyclerView.Adapter<DataHolder> {
    private Filling [] fillings;

    public DataAdapter(Filling[] fillings) {
        this.fillings = fillings;
    }

    @Override
    public DataHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.holder_layout, parent, false);
        return new DataHolder(view);
    }

    @Override
    public void onBindViewHolder(DataHolder holder, int position) {
        Filling filling = fillings[position];
        holder.imageView.setImageResource(filling.getImage());
        holder.textView.setText(filling.getName());
    }

    @Override
    public int getItemCount() {
        return fillings.length;
    }
}
