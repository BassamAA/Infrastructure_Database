package FX_W20PKG;

import FX_W20PKG.Building;

public class ResidentialBuilding extends Building {

    private int maxNumberOfHabitants; // describes the maximum number of expected habitants

    public ResidentialBuilding(int yearOfCreation, double cost, double landSpace, String material, int maxNumberOfHabitants) {
        super(yearOfCreation, cost, landSpace, material);
        this.maxNumberOfHabitants = maxNumberOfHabitants;
    }

    @Override
    public String toString() {
        return "Residential Building " +
                "maxNumberOfHabitants=" + maxNumberOfHabitants +
                "} " + super.toString();
    }

    public ResidentialBuilding(ResidentialBuilding RB) {
        super(RB);
        this.maxNumberOfHabitants = RB.maxNumberOfHabitants;
    }

    @Override
    protected Object clone() {
        return new ResidentialBuilding(this);
    }

    public int getMaxNumberOfHabitants() {
        return maxNumberOfHabitants;
    }
}

