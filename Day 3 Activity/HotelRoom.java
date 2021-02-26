ackage inheritance;

public class HotelRoom {
	
	protected String hotelName;
	protected int numberofSqFeet;
	protected boolean hasTV;
	protected boolean hasWifi;
	
	
	
	
	
	public String getHotelName() {
		return hotelName;
	}




	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}




	public int getNumberofSqFeet() {
		return numberofSqFeet;
	}




	public void setNumberofSqFeet(int numberofSqFeet) {
		this.numberofSqFeet = numberofSqFeet;
	}




	public boolean isHasTV() {
		return hasTV;
	}




	public void setHasTV(boolean hasTV) {
		this.hasTV = hasTV;
	}




	public boolean isHasWifi() {
		return hasWifi;
	}




	public void setHasWifi(boolean hasWifi) {
		this.hasWifi = hasWifi;
	}




	




	public HotelRoom(String hotelName, int numberofSqFeet, boolean hasTV, boolean hasWifi) {
		super();
		this.hotelName = hotelName;
		this.numberofSqFeet = numberofSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
		
	}




	public int calculateTarrif(){
		return 0;
		
		
		
	}
	public float getRatePerSqFeet() {
		return 0;
	}
	
	
	
	
	

}