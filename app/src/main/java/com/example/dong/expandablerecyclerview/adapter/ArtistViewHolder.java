package com.example.dong.expandablerecyclerview.adapter;

import android.view.View;
import android.widget.TextView;

import com.example.dong.expandablerecyclerview.R;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

/**
 * Created by DONG on 28-Dec-17.
 */

public class ArtistViewHolder extends ChildViewHolder {

    private TextView childTextView;

    public ArtistViewHolder(View itemView) {
        super(itemView);
        childTextView = (TextView) itemView.findViewById(R.id.tvChild);
    }

    public void setArtistName(String name) {
        childTextView.setText(name);
    }
}