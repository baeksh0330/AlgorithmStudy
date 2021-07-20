package AlgorithmStudy;
import java.util.Scanner;
public class b_1010 {

	public static int[][] dp= new int[30][30]; //dynamic programming할때는 그 식? 분석이 선행되어야 하는듯.
	
	public static void main(String[] args) {
	
		int t,key=0;
		Scanner sc= new Scanner(System.in);
		t=sc.nextInt();
		int N,M;
		
		for(int i=0; i<t; i++)
		{
			key=0;
			N=sc.nextInt();
			M=sc.nextInt();
			
			int res=nCr(M,N);
			System.out.println(res);
			
		}
	}
	
	public static int nCr(int M, int N) {

		if(dp[M][N]>0)
			return dp[M][N];
		
		if(M==N || N==0)
			return dp[M][N]=1;
		
		return dp[M][N]=nCr(M-1,N-1)+ nCr(M-1,N);
		
		
	}
	
}
