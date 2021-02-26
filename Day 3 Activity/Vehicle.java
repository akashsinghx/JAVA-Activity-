public class Vehicle {
	
private String Make;
private String FuelType;
private String VehicleNumber;
public Vehicle(String make, String fuelType, String vehicleNumber, int fuelCapacity, int cc) {
	super();
	Make = make;
	FuelType = fuelType;
	VehicleNumber = vehicleNumber;
	FuelCapacity = fuelCapacity;
	this.cc = cc;
}
private int FuelCapacity;
private int cc;
public String getMake() {
	return Make;
}
public void setMake(String make) {
	Make = make;
}
public String getFuelType() {
	return FuelType;
}
public void setFuelType(String fuelType) {
	FuelType = fuelType;
}
public String getVehicleNumber() {
	return VehicleNumber;
}
public void setVehicleNumber(String vehicleNumber) {
	VehicleNumber = vehicleNumber;
}
public int getFuelCapacity() {
	return FuelCapacity;
}
public void setFuelCapacity(int fuelCapacity) {
	FuelCapacity = fuelCapacity;
}
public int getCc() {
	return cc;
}
public void setCc(int cc) {
	this.cc = cc;
}

public void displayBasicInfo() {
	System.out.println("**"+Make+"**");
	System.out.println("VehicleNumber:"+VehicleNumber);
	
	System.out.println(FuelType);
	System.out.println(FuelCapacity);
	System.out.println(cc);
}
public void displayInfo() {
}
}
