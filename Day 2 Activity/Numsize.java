import java.util.Scanner;
public class Numsize
{
    int findElementCount(int a,int [] arr,int c)
    { 
        int count=0;
       for(int i=0;i<a;i++)
       {
           if(arr[i]==c)
           {
               count++;
           }
       }
       return count;
    }
	public static void main(String[] args) {
	  Numsize m=new Numsize();
	    int[] array=new int[20];
	    Scanner sc=new Scanner(System.in);
        System.out.println("size");
        int n=sc.nextInt();
        if(n<0)
        {
        System.out.println("Invalid Input");
        System.exit(0);
        }
        else{
        System.out.println("elements into array");
        for(int i=0;i<n;i++){
        array[i]=sc.nextInt();
        if(array[i]>0)
        {
            
        }
        else{
            System.out.println("Invalid Input");
             System.exit(0);
            }
        }
    
        System.out.println("searhing element");
        int se=sc.nextInt();
        
        int res=m.findElementCount(n,array,se);
        System.out.println("Number count:"+res);
        
	}
	}
}
