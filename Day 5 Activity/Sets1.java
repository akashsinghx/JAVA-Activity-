import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Sets1 {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		HashSet<String> s=new HashSet<String>();
		System.out.println("Enter size");
		int si=Integer.parseInt(br.readLine());
		System.out.println("Enter elements:");
		for(int i=0;i<si;i++)
		{
			s.add(br.readLine());
		}
		System.out.println(s.size());

		
	}

}