package com.mambayamba.sandwichstore.FacadePattern;

import com.mambayamba.sandwichstore.R;

/**
 * Created by макс on 26.06.2017.
 */

public class Crisps implements Product {
    @Override
    public int dispense() {
        return R.drawable.crisps;
    }
}
