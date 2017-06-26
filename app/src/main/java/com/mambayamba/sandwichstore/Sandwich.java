package com.mambayamba.sandwichstore;

/**
 * Created by Tom on 26.06.2017.
 */

public class Sandwich extends AbstractSandwich {
    private String filling1, filling2;

    public Sandwich(SandwichInterface sandwichInterface, String filling1, String filling2) {
        super(sandwichInterface);
        this.filling1 = filling1;
        this.filling2 = filling2;
    }

    @Override
    public void make() {
        sandwichInterface.makeSandwich(filling1, filling2);
    }
}
