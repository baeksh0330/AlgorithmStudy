import java.util.Scanner;

public class B_10757 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		String A, B;
		A=sc.next();
		B=sc.next();
		
		int a1=A.length()-1;
		int b1=B.length()-1;
		//System.out.println(a1 + " "+b1);
		int max=b1;
		if(a1>=b1)
			max=a1; 
		
		String C="";
		int flag=0;
	
		for(int i=max; i>=0; i--)
		{	
			char ac,bc;
			if(a1>=0)
				ac= A.charAt(a1);
			else
				ac='0';
		
			if(b1>=0)
		    	bc= B.charAt(b1);
			else
				bc='0';
		
		int mid=Character.getNumericValue(ac)+Character.getNumericValue(bc);
			//System.out.println(mid);
		if(flag!=0)
		   	mid+=1;	
		
		if(mid>=10)
			flag++;
		else
			flag=0;
		
		mid%=10;
		C+=mid;
		
			a1--;
			b1--;
		}
		if(flag>0)
			C+=1;
for(int i=C.length()-1; i>=0; i--)
	System.out.print(C.charAt(i));
	}

}
