package FX_W20PKG;

import java.util.Objects;

public class Airport extends Structure {

    private int numOfRunways;
    private String code; //gives the international airport code

    public Airport(int yearOfCreation, double cost, int numOfRunways, String code) {
        super(yearOfCreation, cost);
        this.numOfRunways = numOfRunways;
        this.code = code;
    }


    public String getCode() {
        return code;
    }

    public Airport(Airport A) {
        super(A);
        this.numOfRunways = A.numOfRunways;
        this.code = A.code;
    }

    @Override
    protected Object clone() {

        return new Airport(this);

    }

    public int getNumOfRunways() {
        return numOfRunways;
    }
}
