package activity5;

public class Main {

  public static void main(String[] args) {

    //VehicleChassis test objects
    VehicleChassis myChassis = new VehicleChassis();
    VehicleChassis yourChassis = new VehicleChassis("cn");

    //VehicleFrame test objects
    VehicleFrame myFrame = new VehicleFrame();
    VehicleFrame yourFrame = new VehicleFrame("Ladder Frame");

    //VehicleChassis print statements
    System.out.println(myChassis.toString());
    System.out.println(yourChassis.toString());

    //VehicleFrame print statements
    System.out.println(myFrame.toString());
    System.out.println(yourFrame.toString());

  }
}
