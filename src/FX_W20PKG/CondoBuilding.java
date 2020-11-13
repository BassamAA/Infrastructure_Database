package FX_W20PKG;

public class CondoBuilding extends ResidentialBuilding {

    private int numOfUnits; //describes the number of condo units the building has


    public CondoBuilding(int yearOfCreation, double cost, double landSpace, String material, int maxNumberOfHabitants, int numOfUnits) {
        super(yearOfCreation, cost, landSpace, material, maxNumberOfHabitants);
        this.numOfUnits = numOfUnits;
    }

    @Override
    public String toString() {
        return "This condo building has been created in" + getYearOfCreation() + " . It cost " + getCost() +
                " it's landspace is  " + getLandSpace() + " The material is " + getMaterial() + "  the max number of habitants is " +
                getMaxNumberOfHabitants() + ". The number of units is " + numOfUnits + ".";
    }

    public CondoBuilding(CondoBuilding CB) {
        super(CB);
        this.numOfUnits = CB.numOfUnits;
    }

    @Override
    protected Object clone() {
        return new CondoBuilding(this);
    }
}
