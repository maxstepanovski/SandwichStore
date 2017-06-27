package com.mambayamba.sandwichstore.FacadePattern;

/**
 * Created by макс on 26.06.2017.
 */

public class Facade {
    private Product fruit, drink, crisps;

    public Facade() {
        this.fruit = new Fruit();
        this.drink = new Drink();
        this.crisps = new Crisps();
    }

    public int dispenseFruit(){
        return this.fruit.dispense();
    }

    public int dispenseDrink(){
        return this.drink.dispense();
    }

    public int dispenseCrisps(){
        return this.crisps.dispense();
    }
}
