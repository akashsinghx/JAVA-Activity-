import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main1 {

	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int count=0;
		System.out.println("Enter Player1  Detail: ");
		String s1= sc.next();
		System.out.println("Enter Player2 Detail: ");
		String s2 = sc.next();
		String a[] = s1.split(",");
		String b[] = s2.split(",");
		try
		{
		SimpleDateFormat formatter1=new SimpleDateFormat("dd-MM-yyyy");
		Date date1=(Date) formatter1.parse(a[1]);
		SimpleDateFormat formatter2=new SimpleDateFormat("dd-MM-yyyy");
		Date date2=(Date) formatter2.parse(b[1]);
		
		Player p1  = new Player(a[0],date1,a[2],Integer.parseInt(a[3]),Integer.parseInt(a[4]),Integer.parseInt(a[5]),a[6],Double.parseDouble(a[7]));
		Player p2 = new Player(b[0],date2,b[2],Integer.parseInt(b[3]),Integer.parseInt(b[4]),Integer.parseInt(b[5]),b[6],Double.parseDouble(b[7]));
		
		
		
		System.out.println("Player Details: ");
		System.out.println("Name: "+p1.getName());
		System.out.println("Date-of-Birth: "+p1.getDateofbirth());
		System.out.println("Skill: "+p1.getSkill());
		System.out.println("Number of Matches: "+p1.getNumberofmatches());
		System.out.println("Runs: "+p1.getRuns());
		System.out.println("Wickets: "+p1.getWickets());
		System.out.println("Nationality: "+p1.getNationality());
		System.out.println("Power rating: "+p1.getPowerRating());
		System.out.println();
		System.out.println("Player2 Details: ");
		System.out.println("Name: "+p2.getName());
		System.out.println("Date-of-Birth: "+p2.getDateofbirth());
		System.out.println("Skill: "+p2.getSkill());
		System.out.println("Number of Matches: "+p2.getNumberofmatches());
		System.out.println("Runs: "+p2.getRuns());
		System.out.println("Wickets: "+p2.getWickets());
		System.out.println("Nationality: "+p2.getNationality());
		System.out.println("Power rating: "+p2.getPowerRating());
		for(int i=0;i<a.length;i++)
		{
			if(a[i].equals(b[i]))
			{
				continue;
			}
			else
			{
				count++;
			}
			
		}
		if(count==0)
		{
			System.out.println(" Both Player1 & Player2 are Same");
		}
		else
		{
			System.out.println("Players are not same");
		}
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
		sc.close();
		

	
	}
	
}