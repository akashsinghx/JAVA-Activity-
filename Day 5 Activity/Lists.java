import java.util.Scanner;
import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 ArrayList  arr = new ArrayList();
		 System.out.println("Enter the Player Details:");
		 System.out.println("Enter Player name");
		 arr.add(sc.next());
		 System.out.println("Enter age");
		 arr.add(sc.nextInt());
		 System.out.println("Enter Country");
		 arr.add(sc.next());
		 System.out.println("Player Details:");
		 for(int i=0;i<arr.size();i++)
		 {
			 System.out.println(arr.get(i));
		 }
   
		 System.out.println("Enter Skill");
		 String s=sc.next();
		 System.out.println("Enter the position to add the skill");
		 int n=sc.nextInt();
	     
		 arr.set(n,s);
		 System.out.println("Player Details:");
		 for(int i=0;i<arr.size();i++)
		 {
			 System.out.println(arr.get(i));
		 }
		 System.out.println("Enter the position of the detail to be removed:");
		 int t=sc.nextInt();
		 arr.remove(t);
		 System.out.println("Player Details:");
		 for(int i=0;i<arr.size();i++)
		 {
			 System.out.println(arr.get(i));
		 } 
   	 
	     
	
	
	}