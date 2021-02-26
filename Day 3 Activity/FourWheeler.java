public class FourWheeler extends Vehicle {
	private String audioSystem;
	private int numberofDoors;
	public FourWheeler(String make, String fuelType, String vehicleNumber, int fuelCapacity, int cc, String audioSystem,
			int numberofDoors) {
		super(make, fuelType, vehicleNumber, fuelCapacity, cc);
		this.audioSystem = audioSystem;
		this.numberofDoors = numberofDoors;
	}
	public String getAudioSystem() {
		return audioSystem;
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	public int getNumberofDoors() {
		return numberofDoors;
	}
	public void setNumberofDoors(int numberofDoors) {
		this.numberofDoors = numberofDoors;
	}
	public void displayInfo() {
		System.out.println("AudioSyystem:"+audioSystem);
		System.out.println("Number of Doors:"+numberofDoors);
		
	}

}