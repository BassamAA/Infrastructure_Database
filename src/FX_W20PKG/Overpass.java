package FX_W20PKG;

import FX_W20PKG.Bridge;

public class Overpass extends Bridge {

    private double maxLoad; // indicates maximum weight accomodated by the overpass


    public Overpass(int yearOfCreation, double cost, double length, double height, double maxLoad) {
        super(yearOfCreation, cost, length, height);
        this.maxLoad = maxLoad;
    }

    @Override
    public String toString() {
        return "This bridge has been created in " + getYearOfCreation() + ", it cost " + getCost() + " it has " +
        "a length of " + getLength() + " it has a height of " + getHeight() + " . The max load is " + maxLoad;
    }

    public Overpass(Overpass O) {
        super(O);
        this.maxLoad = O.maxLoad;
    }

    @Override
    protected Object clone() {
        return new Overpass(this);
    }
}
