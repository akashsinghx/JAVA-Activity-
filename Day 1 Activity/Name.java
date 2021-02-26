import java.io.*
import java.util.*;
public class Name
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String stringF,stringS,name="";
		stringF=sc.next();
		stringS=sc.next();
	String firstLetter = stringF.substring(0, 1);
	String lastletter = stringF.substring(stringF.length()-1);
	
    String remainingLetters = stringF.substring(1,stringF.length()-1);
    firstLetter = firstLetter.toUpperCase();
    lastletter = lastletter.toLowerCase();
    name = firstLetter + remainingLetters+lastletter;
    stringS=stringS.toUpperCase();
    System.out.println("Name: " + name+" "+stringS);

	}
}