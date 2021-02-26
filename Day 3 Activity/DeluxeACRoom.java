package inheritance;

public class DeluxeACRoom extends HotelRoom{
	private int ratePerSqFeet;
	
	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}
	public DeluxeACRoom(String hotelName, int numberofSqFeet, boolean hasTV, boolean hasWifi,int ratePerSqFeet) {
		
		super(hotelName, numberofSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet=12;
		
	}
	
	public float getRatePerSqFeet() {
		
		if(hasWifi==true){
			
		return ratePerSqFeet=ratePerSqFeet+2;
		}
		else
		
		return ratePerSqFeet;
		
		
		
	}
	public int calculateTarrif(){

		System.out.println("Room Tariff Per Day is: "+ (ratePerSqFeet*numberofSqFeet));
		return ratePerSqFeet;
		
		
		
		
	}
}