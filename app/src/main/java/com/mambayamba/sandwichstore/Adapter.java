package com.mambayamba.sandwichstore;

/**
 * Created by макс on 26.06.2017.
 */

public class Adapter implements NewLocation {
    private OldLocation oldLocation;
    private String building;
    private int floor;
    private int desk;

    public Adapter(OldLocation oldLocation) {
        this.oldLocation = oldLocation;
        setBuilding(oldLocation.getBuilding());
        setFloor(oldLocation.getFloor());
        setDesk(oldLocation.getDesk());
    }

    @Override
    public String getBuilding() {
        return this.building;
    }

    @Override
    public int getFloor() {
        return this.floor;
    }

    @Override
    public int getDesk() {
        return this.desk;
    }

    @Override
    public void setBuilding(String building) {
        this.building = building;
    }

    @Override
    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public void setDesk(int desk) {
        this.desk = desk;
    }

    @Override
    public String toString() {
        return "Location: Building "+building+"; floor "+floor+"; desk "+desk;
    }
}
