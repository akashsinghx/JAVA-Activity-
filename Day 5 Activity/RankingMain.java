import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class RankingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Ranking> al=new ArrayList<Ranking>();
		System.out.println("Please provide the number of players");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the name of the player"+(i+1));
			String Str=sc.next();
			System.out.println("Enter the score of the player"+(i+1));
			int x=sc.nextInt();
			al.add(new Ranking(Str,x));
		}
		Collections.sort(al);
		for(Ranking r:al){  
			System.out.println(r.getName()+" "+r.getScore());  
			}  
		

	}

}