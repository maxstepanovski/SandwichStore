package com.mambayamba.sandwichstore.CriteriaPattern;

/**
 * Created by макс on 27.06.2017.
 */

public class Ingredient {
    String name, locale;
    boolean vegetarian;

    public Ingredient(String name, String locale, boolean vegetarian) {
        this.name = name;
        this.locale = locale;
        this.vegetarian = vegetarian;
    }

    public String getName() {
        return name;
    }

    public String getLocale() {
        return locale;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }
}
