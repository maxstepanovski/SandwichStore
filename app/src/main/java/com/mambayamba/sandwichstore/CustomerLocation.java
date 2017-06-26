package com.mambayamba.sandwichstore;

/**
 * Created by макс on 26.06.2017.
 */

public class CustomerLocation implements OldLocation {
    private String building;
    private int floor;
    private String office;
    private int desk;


    @Override
    public String getBuilding() {
        return building;
    }

    @Override
    public int getFloor() {
        return floor;
    }

    @Override
    public String getOffice() {
        return office;
    }

    @Override
    public int getDesk() {
        return desk;
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
    public void setOffice(String office) {
        this.office = office;
    }

    @Override
    public void setDesk(int desk) {
        this.desk = desk;
    }

    @Override
    public String toString() {
        return "Location: Building "+building+"; floor "+floor+"; office "+office+"; desk "+desk;
    }
}
