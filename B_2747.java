import java.util.*; //DP����!
public class B_2747 {

	static int[] num1 = new int[100];
	
	public static void main(String[] args) throws Exception {
	Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(dp(n+1));
		sc.close();
	}

	private static int dp(int n)throws Exception //dp,................
	{
		if(n==1) return 0;
		if (n==2) return 1;
		if(num1[n]!=0)return num1[n]; //�̰� ���ִ� ���� : �� �ΰ��� if���� ��ġ�� �ʰ� ���� ��������
		return num1[n]=dp(n-1)+dp(n-2); //�Ƥ�!!!!!!!!!!!!!!!!!!!!!!!!!!!��¥
	}
	
}

