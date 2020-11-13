package CargoAirport;

import FX_W20PKG.Airport;

public class CargoAirport extends Airport {

    private double landedWeight; //describes the weight of landed goods on the airport


    public CargoAirport(int yearOfCreation, double cost, int numOfRunways, String code, double landedWeight) {
        super(yearOfCreation, cost, numOfRunways, code);
        this.landedWeight = landedWeight;
    }

    @Override
    public String toString() {
        return "This cargo airport has been created in " + getYearOfCreation() + " . It cost " + getCost() +
                " it has " + getNumOfRunways() + " runways. The code is " + getCode() + " and the landed weight is " +
                landedWeight + ".";
    }

    public CargoAirport(CargoAirport c){

        super(c);
        this.landedWeight = c.landedWeight;
    }

    @Override
    protected Object clone() {
        return new CargoAirport(this);
    }
}
