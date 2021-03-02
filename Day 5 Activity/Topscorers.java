import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Topscorers  {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList al=new ArrayList();
        LinkedList ll=new LinkedList();
        System.out.println("Enter the top 5 scorers of IPL Season 13");
        for(int i=0;i<5;i++)
        {
        	al.add(sc.next());
        }
        System.out.println("Enter the top 5 scorers of IPL Season 12");
        for(int i=0;i<5;i++)
        {
        	ll.add(sc.next());
        }
        ll.retainAll(al);
    	System.out.println("Consistent run scorers");
        for(int i=0;i<ll.size();i++)
        {
        	System.out.println(ll.get(i));
        }
	}

}