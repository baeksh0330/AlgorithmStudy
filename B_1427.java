import java.util.*;
public class B_1427 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		String newStr;
		newStr=sc.next();

		int[] strSave= new int[newStr.length()];
		for(int i=0; i<newStr.length(); i++)
		{
			strSave[i]=newStr.charAt(i);
		}
		
		Arrays.sort(strSave);
		
		for(int i=newStr.length()-1; i>=0; i--)
		{
			System.out.print(strSave[i]-48);
		}
		
	}

}
