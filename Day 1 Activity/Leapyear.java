import java.util.Scanner;
public class Leapyear
{
    int checkLeapYear(int n)
    {
        int res;
        res=n%4;
        if(res==0)
        return 1;
        else if(res>0)
        return 0;
        else
        return -1;
    }
	public static void main(String[] args) {
	   Leapyear m=new Leapyear();
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter an year");
	    int no=sc.nextInt();
	    int res1=m.checkLeapYear(no);
	    if(res1==1)
	    System.out.println("yes");
	    else if(res1==0)
		System.out.println("no");
		else
		System.out.println("Invalid Input");
	}
}
