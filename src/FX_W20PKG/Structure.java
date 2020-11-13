package FX_W20PKG;

public class Structure {

    private int yearOfCreation;
    private double cost;

    public Structure(int yearOfCreation, double cost) {
        this.yearOfCreation = yearOfCreation;
        this.cost = cost;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "This structure " +
                "has been created in " + yearOfCreation +
                " and costs " + cost +
                " .";
    }

    public Structure(Structure S) {
        this.yearOfCreation = S.yearOfCreation;
        this.cost = S.cost;
    }

    @Override
    protected Object clone()  {
        return new Structure(this);
    }
}
