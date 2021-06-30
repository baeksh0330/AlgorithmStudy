package AlgorithmStudy;
import java.util.Scanner;
public class B_1934 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int i=0; i<T; i++) 
		{
			int n1, n2;
			n1=sc.nextInt();
			n2=sc.nextInt();
			int max= n2;
			int not_max=n1;	
				if(n1>n2)
				{	
					max=n1;
					not_max=n2;
				}
			
			int g= gcd(max,not_max);
			int l= (max*not_max)/g;
			System.out.println(l);
		}

	}

	public static int gcd(int n1, int n2)
	{
		if(n2==0)
			return n1;
		return gcd(n2, (n1%n2));
	}
}
