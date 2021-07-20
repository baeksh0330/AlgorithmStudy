package AlgorithmStudy;

import java.util.Scanner;
public class B_1346 {

	public static void main(String[] args) {
	
		int N,cnt=0, key=-1;
		String mainStr="666";
		
		Scanner sc= new Scanner(System.in);
		N=sc.nextInt();
	
		for(int i=1; i<=Integer.MAX_VALUE; i++)
		{
			String newStr=null;
			newStr+=i;
		
			if(newStr.contains(mainStr))
				cnt++;
			
			if(cnt==N)
			{	
				key=i;
				break;
			}
		}
		System.out.println(key);

	}

}
