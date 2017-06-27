package com.mambayamba.sandwichstore.CriteriaPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by макс on 27.06.2017.
 */

public class VegetarianFilter implements Filter {
    @Override
    public List<Ingredient> meetCriteria(List<Ingredient> ingredients) {
        List<Ingredient> vegetarianIngredients = new ArrayList<>();
        for(Ingredient i: ingredients){
            if(i.isVegetarian()){
                vegetarianIngredients.add(i);
            }
        }
        return vegetarianIngredients;
    }
}
