package FX_W20PKG;

public class Building extends Structure {

    private double landSpace; //describes the ammount of space in the building
    private String material; // describes the main material used for building

    public Building(int yearOfCreation, double cost, double landSpace, String material) {
        super(yearOfCreation, cost);
        this.landSpace = landSpace;
        this.material = material;
    }

    public Building(Building B) {
        super(B);
        this.landSpace = B.landSpace;
        this.material = B.material;
    }

    public double getLandSpace() {
        return landSpace;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Building{" +
                "landSpace=" + landSpace +
                ", material='" + material + '\'' +
                "} " + super.toString();
    }

    @Override
    protected Object clone() {
        return new Building(this);
    }


}
