package com.mambayamba.sandwichstore.CriteriaPattern;

import java.util.List;

/**
 * Created by макс on 27.06.2017.
 */

public class AndCriteria implements Filter {
    Filter firstCriteria, secondCriteria;

    public AndCriteria(Filter firstCriteria, Filter secondCriteria) {
        this.firstCriteria = firstCriteria;
        this.secondCriteria = secondCriteria;
    }

    @Override
    public List<Ingredient> meetCriteria(List<Ingredient> ingredients) {
        List<Ingredient> temp = firstCriteria.meetCriteria(ingredients);
        return secondCriteria.meetCriteria(temp);
    }
}
