import java.io.*
import java.util.*;
public class Lastname
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String p1,p2;
		p1=sc.nextLine();
		p2=sc.nextLine();
		String arr[]=p1.split(" ");
		String arr1[]=p2.split(" ");
		if(arr[arr.length-1].equals(arr1[arr1.length-1]))
		{
		    System.out.println("Yes");
		}
		else{
		    System.out.println("No");
		}
		
	}
}