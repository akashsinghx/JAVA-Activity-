import java.util.Scanner;
public class FindCricketer
{
    void findCricketerId(int size,int array[],int score)
    { 
       for(int i=0;i<size;i++)
       {
           if(i%2!=0)
           {
               if(array[i]>score)
               {
                   System.out.println(array[i-1]);
               }
               
           }
       }
    }
	public static void main(String[] args)
	{
	    FindCricketer m=new FindCricketer();
	    int[] arr=new int[20];
	    Scanner sc=new Scanner(System.in);
        System.out.println("size");
        int n=sc.nextInt();
        if(n<0)
        {
        System.out.println("Invalid array size");
        System.exit(0);
        }
        else
        {
        System.out.println("elements into array");
        for(int i=0;i<n;i++)
        {
        arr[i]=sc.nextInt();
        if(arr[i]>0)
        {
            
        }
        else
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        }
    
        System.out.println("Enter score");
        int se=sc.nextInt();
        if(se<0){
            System.out.println("Invalid Score");
            System.exit(0);
        }
        else
        m.findCricketerId(n,arr,se);
	}
}
}
