package com.mambayamba.sandwichstore.BridgePattern;

/**
 * Created by Tom on 26.06.2017.
 */

public abstract class AbstractSandwich {
    protected SandwichInterface sandwichInterface;

    protected AbstractSandwich(SandwichInterface sandwichInterface){
        this.sandwichInterface = sandwichInterface;
    }

    public abstract void make();
}
