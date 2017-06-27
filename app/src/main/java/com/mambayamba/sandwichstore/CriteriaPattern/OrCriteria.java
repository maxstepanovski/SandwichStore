package com.mambayamba.sandwichstore.CriteriaPattern;

import java.util.List;

/**
 * Created by макс on 27.06.2017.
 */

public class OrCriteria implements Filter {
    Filter firstCriteria, secondCriteria;

    public OrCriteria(Filter firstCriteria, Filter secondCriteria) {
        this.firstCriteria = firstCriteria;
        this.secondCriteria = secondCriteria;
    }

    @Override
    public List<Ingredient> meetCriteria(List<Ingredient> ingredients) {
        List<Ingredient> firstList = firstCriteria.meetCriteria(ingredients);
        List<Ingredient> secondList = secondCriteria.meetCriteria(ingredients);
        for(Ingredient i: firstList){
            if(!secondList.contains(i)){
                secondList.add(i);
            }
        }
        return secondList;
    }
}
