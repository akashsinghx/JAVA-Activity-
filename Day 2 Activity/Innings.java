class Innings
{
private String tname,ingname;
private int runs;
public void settname(String tname)
{
this.tname=tname;
}
public String gettname()
{
return tname;
}
public void setingname(String ingname)
{
this.ingname=ingname;
}
public String getingname()
{
return ingname;
}
public void setruns(int runs)
{
this.runs=runs;
}
public int getruns()
{
return runs;
}
void displayInningsDetails()
{
System.out.println("Name: "+gettname());
System.out.println("Scored: "+getruns());
if(getingname().equals("First")||getingname().equals("first"))

	System.out.println("Other Team Needs " + (runs+1) +" to win");
else
	System.out.println("Match Ended");
}
} 

