package com.mambayamba.sandwichstore;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by макс on 26.06.2017.
 */

public class DataHolder extends RecyclerView.ViewHolder{
    ImageView imageView;
    TextView textView;

    public DataHolder(View itemView) {
        super(itemView);
        imageView = (ImageView) itemView.findViewById(R.id.item_image);
        textView = (TextView) itemView.findViewById(R.id.item_name);
    }
}
