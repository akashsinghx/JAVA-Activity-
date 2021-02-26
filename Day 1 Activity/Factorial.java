import java.util.*;
import java.io.*;

class Factorial
{
static int fact(int x)
{
  if(x==1)
{
  return 1;
}
else
{
 return x*fact(x-1);
}
}
public static void main(String args[])
{
 Scanner sc = new Scanner(System.in);
 int num = sc.nextInt();
 int temp = num;
int array[] = new int[10];
int i=0;
 while(temp!=0)
{
  int rem = temp%10;
  array[i]=fact(rem);
i++;
  temp=temp/10;

}
for(int j=array.length-1;j>=0;j--)
{
  if(array[j]!=0)
{
System.out.println(array[j]);
}
}
}
}
