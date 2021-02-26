import java.util.*;
class InningsMain
{
public static void main(String[] args)
{
Innings i=new Innings();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the team name:");
String team=sc.next();
System.out.println("Enter Session:");
String sess=sc.next();
System.out.println("Enter run:");
int run=sc.nextInt();
i.settname(team);
i.setingname(sess);
i.setruns(run);
i.displayInningsDetails();
}
}