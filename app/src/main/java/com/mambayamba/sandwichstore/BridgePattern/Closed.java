package com.mambayamba.sandwichstore.BridgePattern;

import android.util.Log;

/**
 * Created by Tom on 26.06.2017.
 */

public class Closed implements SandwichInterface {
    @Override
    public void makeSandwich(String filling1, String filling2) {
        Log.d("happy", "Closed sandwich: "+filling1+"; "+filling2);
    }
}
