package FX_W20PKG;

public class House extends ResidentialBuilding {

    private double numberOfRooms; //describes the number of rooms in the house
    private int numOfFloors; //describes number of floors in the house



    public House(int yearOfCreation, double cost, double landSpace, String material, int maxNumberOfHabitants, double numberOfRooms, int numOfFloors) {
        super(yearOfCreation, cost, landSpace, material, maxNumberOfHabitants);
        this.numberOfRooms = numberOfRooms;
        this.numOfFloors = numOfFloors;
    }

    @Override
    public String toString() {
        return "This house was created in " + getYearOfCreation() + " .The cost is "+ getCost() +
                ". The land space is " + getLandSpace() +". The material is "+ getMaterial() + ". The number of floors is "
                + numOfFloors + " and the number of rooms is " + numberOfRooms + ".";
    }

    public House(House H) {
        super(H);
        this.numberOfRooms = H.numberOfRooms;
        this.numOfFloors = H.numOfFloors;
    }

    @Override
    protected Object clone() {
        return new House(this);
    }
}
