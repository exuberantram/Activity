package activity5;

public class VehicleChassis implements Chassis {

  public String chassisName;

  public VehicleChassis() {
    this.chassisName = chassis;
  }

  public VehicleChassis(String chassisName) {
    this.chassisName = chassisName;
  }

    public Chassis getChassisType() {
      return this;
    }

  public void setChassisType(String vehicleChassis) {
    chassisName = vehicleChassis;
  }

  public String toString() {
    return "Chassis Name : " + chassisName;
  }
}
