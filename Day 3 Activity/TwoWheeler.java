public class TwoWheeler extends Vehicle {
	private boolean Kick_Start;
	
	public TwoWheeler(String make, String fuelType, String vehicleNumber, int fuelCapacity, int cc,
			boolean kick_Start) {
		super(make, fuelType, vehicleNumber, fuelCapacity, cc);
		Kick_Start = kick_Start;
	}
	

	public boolean isKick_Start() {
		return Kick_Start;
	}

	public void setKick_Start(boolean kick_Start) {
		Kick_Start = kick_Start;
	}
public void displayInfo() {
	System.out.println("Kick_Start: "+Kick_Start);
}
	

}