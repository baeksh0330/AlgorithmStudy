import java.util.Scanner;

public class Main { 

	public static void main(String[] args) {
		
		int N,cnt=0;
		String num;
		Scanner sc= new Scanner(System.in);		
		
		N=sc.nextInt();
		num=sc.next();
		
		for(int i=0; i<N; i++)
		{
			int n1=num.charAt(i);
			cnt+=(n1-48);
		}
System.out.println(cnt);
	}
}
