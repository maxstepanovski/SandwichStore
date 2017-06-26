package com.mambayamba.sandwichstore;

import android.util.Log;

/**
 * Created by Tom on 26.06.2017.
 */

public class Open implements SandwichInterface {
    @Override
    public void makeSandwich(String filling1, String filling2) {
        Log.d("happy", "Open sandwich: "+filling1+"; "+filling2);
    }
}
