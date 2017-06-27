package com.mambayamba.sandwichstore.CriteriaPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by макс on 27.06.2017.
 */

public class LocalFilter implements Filter {
    @Override
    public List<Ingredient> meetCriteria(List<Ingredient> ingredients) {
        List<Ingredient> localIngredients = new ArrayList<>();
        for(Ingredient i: ingredients){
            if(i.getLocale().equals("Locally produced")){
                localIngredients.add(i);
            }
        }
        return localIngredients;
    }
}
