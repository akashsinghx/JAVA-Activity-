import java.util.Scanner;
public class VehicleMain {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Four Wheeler");
		System.out.println("2.Two Wheeler");
		System.out.println("Enter Vehicle Type");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("VehicleMake");
			String make=sc.next();
			System.out.println("VehicleNumber");
			String VehicleNumber=sc.next();
			System.out.println("Fuel Type");
			System.out.println("1.Petrol");
			System.out.println("2.Diesel");
			String option=sc.next();
			System.out.println("Fuel Capacity");
			int FuelCapacity=sc.nextInt();
			System.out.println("Engine cc");
			int cc=sc.nextInt();
			System.out.println("audio System");
			String audioSystem=sc.next();
			System.out.println("numberofDoors");
			int numberofDoors=sc.nextInt();
			FourWheeler obj=new FourWheeler(make,option,VehicleNumber,FuelCapacity,cc,audioSystem,numberofDoors);
			obj.displayBasicInfo();
			obj.displayInfo();
		}
		else {
			System.out.println("VehicleMake");
			String make=sc.next();
			System.out.println("VehicleNumber");
			String VehicleNumber=sc.next();
			System.out.println("Fuel Type");
			System.out.println("1.Petrol");
			System.out.println("2.Diesel");
			String option=sc.next();
			System.out.println("Fuel Capacity");
			int FuelCapacity=sc.nextInt();
			System.out.println("Engine cc");
			int cc=sc.nextInt();
			System.out.println("Kick Start available: ");
			boolean Kick=sc.nextBoolean();
			TwoWheeler obj=new TwoWheeler(make,option,VehicleNumber,FuelCapacity,cc, Kick);
			obj.displayBasicInfo();
			obj.displayInfo();
		}
		sc.close();
	}

}