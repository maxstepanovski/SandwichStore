package com.mambayamba.sandwichstore.CriteriaPattern;

import java.util.List;

/**
 * Created by макс on 27.06.2017.
 */

public interface Filter {
    public List<Ingredient> meetCriteria(List<Ingredient> ingredients);
}
