package com.mambayamba.sandwichstore;

/**
 * Created by макс on 26.06.2017.
 */

public class Filling {
    private int image;
    private int name;

    public Filling(int image, int name) {
        this.image = image;
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public int getName() {
        return name;
    }
}
