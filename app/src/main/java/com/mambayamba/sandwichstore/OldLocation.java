package com.mambayamba.sandwichstore;

/**
 * Created by макс on 26.06.2017.
 */

public interface OldLocation {
    public String getBuilding();
    public int getFloor();
    public String getOffice();
    public int getDesk();

    public void setBuilding(String building);
    public void setFloor(int floor);
    public void setOffice(String office);
    public void setDesk(int desk);

}
