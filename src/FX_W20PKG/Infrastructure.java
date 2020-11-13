
package FX_W20PKG;

import CargoAirport.CargoAirport;
import CommercialAirport.CommercialAirport;

import java.io.*;
import java.util.ArrayList;

public class Infrastructure {

    public static int findTallestHighRise(Structure[] arr){

        int x = 0;
        HighRise HH = new HighRise(2000,100,100,"X",0);
        HighRise HHH;
        for(int i = 0; i < arr.length; i++){

            if (arr[i].getClass() ==  HH.getClass()){

                HHH = (HighRise) arr[i];
                if (HHH.getHeight() > HH.getHeight()){
                    HH = HHH;
                    x = i;
                }
            }
        }
        return x;

    }

    public static void showBuildingInfo(Structure[] arr){

        for (int i = 0; i < arr.length; i++){
            Building B = new Building(2000, 0 , 0 ,"");
            if (arr[i] instanceof Building){
                System.out.println(arr[i]);
            }
        }



    }

    public static void displayAllObjects(Structure[] arr, int n){

        if(n< arr.length){

            System.out.println(arr[arr.length-1-n].toString());
            n++;
            displayAllObjects(arr, n);

        }

    }

    public static void displayAllObjects(Structure[] arr){
        int n = 0;
        displayAllObjects(arr, n);
    }

    public static Structure[] copyStructures(Structure[] strArr){

        if (strArr == null){
            return null;}

        Structure[] strArrCopy = new Structure[strArr.length];

        for(int i = 0; i< strArr.length; i++) {

            strArrCopy[i] = (Structure) strArr[i].clone();
        }
        return strArrCopy;

        }


    public static void main(String[] args)
    {

        CondoBuilding CB1 = new CondoBuilding(2001, 504130, 1050.5,"Glass", 400, 250);
        CondoBuilding CB2 = new CondoBuilding(1999, 84320,6600, "Rock",40, 30);
        CondoBuilding CB3 = new CondoBuilding(2000, 13500,63500,"Cement",25, 5);
        CondoBuilding CB4 = new CondoBuilding(1950, 15400,14600,"Steel",80, 25);
        CondoBuilding CB5 = new CondoBuilding(2023, 13400,41600,"Wood",100, 40);
        CondoBuilding CB6 = new CondoBuilding(2020, 824500,631500,"Rock",20, 10);

        House H1 = new House(2019, 8000,44325, "Wood", 20, 5, 10);
        House H2 = new House(2004, 7000,432143, "Wood", 2040, 5, 150);
        House H3 = new House(2004, 32000,9443, "Wood", 2100, 5, 450);
        House H4 = new House(2015, 30010,5443, "Wood", 2030, 5, 5);
        House H5 = new House(2018, 30050,47443, "Wood", 2200, 5, 50);
        House H6 = new House(2000, 3040,443, "Wood", 100, 5, 59);

        Overpass O1 = new Overpass(2005,40214,57, 20, 500);
        Overpass O2 = new Overpass(2143,4063,75,30 ,600);
        Overpass O3 = new Overpass(2015,90040,95,15, 200);
        Overpass O4 = new Overpass(2025,14540,155, 55, 100);
        Overpass O5 = new Overpass(1995,53640,25, 64, 3532);
        Overpass O6 = new Overpass(2008,46340,35, 43, 99);

        CargoAirport Cargo1 = new CargoAirport(2004, 150000,46, "H3B5", 6005.8);
        CargoAirport Cargo2 = new CargoAirport(2004, 150000,46, "G3B5", 6005.8);
        CargoAirport Cargo3 = new CargoAirport(2004, 150000,46, "MBFB5", 6005.8);
        CargoAirport Cargo4 = new CargoAirport(2004, 150000,46, "3R8Y", 6005.8);
        CargoAirport Cargo5 = new CargoAirport(2004, 150000,46, "BVE8Y", 6005.8);
        CargoAirport Cargo6 = new CargoAirport(2004, 150000,46, "UBWCE", 6005.8);

        CommercialAirport Commercial1 = new CommercialAirport(2006, 100.5, 12, "CYW7", 5);
        CommercialAirport Commercial2 = new CommercialAirport(2006, 100.5, 12, "UIEC2G", 5);
        CommercialAirport Commercial3 = new CommercialAirport(2006, 100.5, 12, "CWY7", 5);
        CommercialAirport Commercial4 = new CommercialAirport(2006, 100.5, 12, "Y7WC", 5);
        CommercialAirport Commercial5 = new CommercialAirport(2006, 100.5, 12, "87WYE", 5);
        CommercialAirport Commercial6 = new CommercialAirport(2006, 100.5, 12, "YF9WE", 5);

        Bridge B1 = new Bridge(2150, 20, 5245, 235);
        Bridge B2 = new Bridge(2000, 20, 4134, 4134);
        Bridge B3 = new Bridge(2005, 20, 132, 65);
        Bridge B4 = new Bridge(2003, 20, 413, 764);
        Bridge B5 = new Bridge(1999, 20, 523, 64);
        Bridge B6 = new Bridge(1998, 20, 642, 523);

        HighRise HR1 = new HighRise(1991, 241, 2143, "Steel", 1250);
        HighRise HR2 = new HighRise(1901, 241, 2143, "Steel", 101340);
        HighRise HR3 = new HighRise(2031, 241, 2143, "Steel", 1001);
        HighRise HR4 = new HighRise(2101, 241, 2143, "Steel", 3500);
        HighRise HR5 = new HighRise(2001, 241, 2143, "Steel", 3500);
        HighRise HR6 = new HighRise(2001, 241, 2143, "Steel", 700);

        Structure[] StrArr = {Cargo1, B1,CB1, H1,HR1, O1,Cargo2,B2, Commercial1,B3, CB2, HR2, B4, O2,Cargo3,
                Commercial2, Cargo4,HR3,B5,  O4, H2, CB3,Commercial3, B6, HR4, H3, CB4, O5, Commercial4,
                O6,HR5,H4, CB5,Commercial4,CB6,H5, Commercial6, O3,Cargo5,H6, Commercial5, B6,Cargo6,HR6,};

        int y = findTallestHighRise(StrArr);

        System.out.println("WELCOME TO BASSAM ALASSAAD'S COMP249 FINAL \n");



        System.out.println("Starting Task 3.C\n\n" +
                "Tallest HighRise was found at index: " + y + " Here is the info of that object\n" +
                "HighRise object Info: " + StrArr[y].toString() +
                "\n\nEnd of Task 3.C");

        System.out.println();

        System.out.println("Starting task 3.D");

        System.out.println();


        showBuildingInfo(StrArr);
        System.out.println();


        System.out.println("Ending task 3.D : ");

        System.out.println();

        System.out.println("Starting task 3.E : ");

        System.out.println();

        displayAllObjects(StrArr);

        System.out.println();

        System.out.println("Ending task 3.E : ");

        System.out.println();

        System.out.println("Starting task 3.F : ");

        System.out.println();

        Structure[] copyARR = copyStructures(StrArr);

        displayAllObjects(copyARR);





        System.out.println();


        System.out.println("Ending task 3.F : ");

        System.out.println();






        // TASK 4

        System.out.println("Starting task 4");
        System.out.println();

        ArrayList<Structure> strArrLst = new ArrayList<Structure>(30);

        for (int q = 0; q < StrArr.length; q++){
            strArrLst.add(StrArr[q]);
        }

        System.out.println(strArrLst.get(5));

        strArrLst.remove(5);
        strArrLst.remove(19);
        strArrLst.remove(15);
        strArrLst.remove(20);
        strArrLst.remove(26);

        Boolean containsCargo1 = strArrLst.contains(Cargo1);
        System.out.println(strArrLst.get(5));
        Boolean containsOverpass1 = strArrLst.contains(O1);

        for (int m = 0; m < StrArr.length; m++){

            System.out.println(strArrLst.contains(StrArr[m]));
        }

        System.out.println(containsCargo1 + " " + containsCargo1);

        System.out.println();
        System.out.println("Ending task 4");

        // TASK 5

        System.out.println();

        System.out.println("Starting task 5");
        System.out.println();

        PrintWriter pw = null;

        try {
            pw = new PrintWriter(new FileOutputStream("AirportCodes.txt"));
            findExistingAirportCodes(pw, StrArr);

        }

        catch(FileNotFoundException e){

        }

        pw.close();

        BufferedReader br = null;

        try {

            br = new BufferedReader(new FileReader("AirportCodes.txt"));
            displayAirportCodes(br);
            br.close();


        }
        catch (FileNotFoundException e){

            System.out.println(e.getMessage());


        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("Ending task 5");

        System.out.println();
        System.out.println("Starting task 6\n");





        StructureList SL1 = new StructureList();
        StructureList SL2 = new StructureList();
        StructureList SL3 = new StructureList();

        SL1.addToStart(HR3);

        SL2.addToStart(H1);

        SL2.addToEnd(B3);

        SL2.showListContents();

        SL2.addToEnd(Commercial2);

        SL2.addToStart(Cargo1);

        SL2.showListContents();

        SL3.addToEnd(Cargo5);
        SL2.append(SL3);

        SL2.showListContents();

        Object SL4 = SL2.clone();

        System.out.println("Testing clone method : \n");

        ((StructureList) SL4).showListContents();


        System.out.println("\nEnding task 6");




    }


    public static void findExistingAirportCodes(PrintWriter p, Structure[] s){

        String code;

        try {
            for (int i = 0; i < s.length; i++) {
                if (s[i] instanceof Airport) {
                    Airport AP = (Airport) s[i];
                    code = AP.getCode();
                    p.append(code + "\n");
                }
            }


        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }


    }


    public static void displayAirportCodes(BufferedReader b) {

        String line;
        try{
            while((line = b.readLine()) != null){

                System.out.println(line);
            }

        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }


    }






}
