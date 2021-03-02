import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList ll=new LinkedList();
		for(int i=0;i<5;i++)
		{
			ll.add(sc.next());
		}
		System.out.println("Enter swap positions:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Collections.swap(ll, a, b);
		
		for(int i=0;i<5;i++)
		{
			System.out.println(ll.get(i));
		}
	}

}