import java.util.Scanner;
public class ArithmeticOperation
{
    int performArithmeticOperation(int x,int y,int z)
    {
        int res1;
        switch(z)
        {
            case 1:
                   res1=(x+y);
                   break;
            case 2:res1=(x-y);
                   break;
            case 3:res1=(x*y);
                   break;
            case 4:res1=(x/y);
                   break;
            default:return -1;
        }
        return res1;
        
    }
public static void main(String[] args) {
	    ArithmeticOperation m=new ArithmeticOperation();
	    Scanner in=new Scanner(System.in);
	    System.out.println("Enter a:");
	     int a = in.nextInt();
	     System.out.println("Enter b:");
         int b = in.nextInt();
         System.out.println("Enter c:");
         int c = in.nextInt();
         if(a>0 && a<=32767 && b>0 && b<=32767 && c>=1 && c<=4)
         {
          int res=m.performArithmeticOperation(a,b,c);
          System.out.println(res);
         }
         else
          System.out.println("Invalid Input");
	}
}
