package com.example.dong.expandablerecyclerview.model;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

/**
 * Created by DONG on 28-Dec-17.
 */

public class Genre extends ExpandableGroup<Artist> {

    public Genre(String title, List<Artist> items) {
        super(title, items);

    }

}