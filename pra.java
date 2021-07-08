import java.util.Scanner;
public class pra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		String s1,s2;
		s1=sc.next();
		s2=sc.next();
		int flag=0;
		
		while(flag!=1)
		{	
			int length1=s1.length(), length2=s2.length();
			int i=0;
		
			if(length1==length2)
			{
				for(i=0; i<length1; i++)
				{
					if(s1.charAt(i)!=s2.charAt(i))
					{
						System.out.println("String not match");
						break;
					}	
				}
			
				if(i==length1)
				{	
					flag=1;
					System.out.println("String matches");
					System.exit(0);
				}				
			}
			
			else
				System.out.println("String not match");
			
				s1=sc.next();
				s2=sc.next();
		}	
	}
}
