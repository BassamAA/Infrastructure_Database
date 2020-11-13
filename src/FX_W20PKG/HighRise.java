package FX_W20PKG;

import FX_W20PKG.Building;

public class HighRise extends Building {

    private double height; //describes the height of the FX_W20PKG.HighRise

    public HighRise(int yearOfCreation, double cost, double landSpace, String material, double height) {
        super(yearOfCreation, cost, landSpace, material);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "This highrise was created in " + getYearOfCreation() + " .The cost is "+ getCost() +
                ". The land space is " + getLandSpace() +". The material is "+ getMaterial() + ". The height is "
                + getHeight();
    }

    public HighRise(HighRise HR) {
        super(HR);
        this.height = HR.height;
    }

    @Override
    protected Object clone() {
        return new HighRise(this);
    }
}
