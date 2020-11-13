package FX_W20PKG;

public class Bridge extends Structure{

    private double length;
    private double height; //describes the peek height of the bridge above ground level


    public Bridge(int yearOfCreation, double cost, double length, double height) {
        super(yearOfCreation, cost);
        this.length = length;
        this.height = height;
    }

    @Override
    public String toString() {
        return "This bridge has been created in " + getYearOfCreation() + ", it cost " + getCost() + " it has " +
                "a length of " + length + " it has a height of " + height;
    }

    public Bridge(Bridge B) {
        super(B);
        this.length = B.length;
        this.height = B.height;
    }

    @Override
    protected Object clone() {
        return new Bridge(this);
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }
}
