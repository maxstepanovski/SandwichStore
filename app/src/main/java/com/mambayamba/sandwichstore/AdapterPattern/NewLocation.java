package com.mambayamba.sandwichstore.AdapterPattern;

/**
 * Created by макс on 26.06.2017.
 */

public interface NewLocation {
    public String getBuilding();
    public int getFloor();
    public int getDesk();

    public void setBuilding(String building);
    public void setFloor(int floor);
    public void setDesk(int desk);
}
