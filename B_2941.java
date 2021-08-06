import java.util.Scanner;

public class B_2941 {

	public static String[] alphaString= new String[8];
	public static int cnt=0;
	
	public static void main(String[] args) {
	
	alphaString[0]="c=";
	alphaString[1]="c-";
	alphaString[2]="dz";
	alphaString[3]="d-";
	alphaString[4]="lj";
	alphaString[5]="nj";
	alphaString[6]="s=";
	alphaString[7]="z=";
	
		String str;
		Scanner sc= new Scanner(System.in);
		str=sc.next();
		int ans= CntAlpha(str);
		System.out.println(ans);
	}

	public static int CntAlpha(String str) //지금 다 맞는데 dz=,z=이런거 겹치는거고쳐줄것
	{
		int x=1;
		for(int i=x; i<str.length(); i++)
		{
			for(int a=0; a<8; a++)
			{
				if(str.charAt(i-1)==alphaString[a].charAt(0))
					{
					if(str.charAt(i)==alphaString[a].charAt(1))
						{
							cnt++;
							x+=i;
							System.out.println("x="+x);
						}
						
				else
					break;
					}
			}
			
		}
		return cnt;
	}
	
}
