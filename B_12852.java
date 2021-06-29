import java.util.Scanner;
public class B_12852 { //1로 만들기

	public static void main(String[] args) {
	
		int cnt=0, n;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		int[] arr= new int [100];
		int i=0;
		
		for(;;)
		{	
			if(n==1)
				break;
			
			arr[i]=n;
			
			if(n%3==1)
			{	
				n--;
		
			}
			
			else if(n%3==0)
			{		
				n/=3;
			}
			
			else if(n%3==1)
			{	
				n--; 
			}
			
			
			else if(n%2==0)
			{
				n/=2; 
			}	
			
			i++;
			cnt++;
		}
		arr[i]+=1;
		System.out.println(cnt);
	
		int a=0;
		while(arr[a]!='\0')
		{
			System.out.print(arr[a]+" ");
			a++;
		}
		
	}

}
