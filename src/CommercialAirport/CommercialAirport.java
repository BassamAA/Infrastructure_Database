package CommercialAirport;

import FX_W20PKG.Airport;

public class CommercialAirport extends Airport {

    private int numOfGates; //describes the number of gates in the airport


    public CommercialAirport(int yearOfCreation, double cost, int numOfRunways, String code, int numOfGates) {
        super(yearOfCreation, cost, numOfRunways, code);
        this.numOfGates = numOfGates;
    }

    @Override
    public String toString() {
        return "This commercial airport has been created in " + getYearOfCreation() + " . It cost " + getCost() +
                " it has " + getNumOfRunways() + " runways. The code is " + getCode() + " and the number of gates is " +
                numOfGates + ".";
    }

    public CommercialAirport(CommercialAirport CA) {
        super(CA);
        this.numOfGates = CA.numOfGates;
    }

    @Override
    protected Object clone() {
        return new CommercialAirport(this);
    }
}
