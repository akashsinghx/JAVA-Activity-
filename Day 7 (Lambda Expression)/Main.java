public class Main {

 

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		//Case 2

		//Demoable dm=(a,b) ->System.out.println("Addition :"+(a+b));

		//dm.sum(10, 20);

		//dm.sum(100,200);

		//dm.sum("thi","thi"); Error

		//Case 3 equal to Comparator - compare(Obj 1,obj 2).

		Demoable dm=(a,b)-> a+b;

		int a=dm.add(10, 20);

		int b=dm.add(500, 500);

		System.out.println("Addition: "+a);

		System.out.println("Addition: "+b);


		

	}

 

}