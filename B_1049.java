package AlgorithmStudy;
import java.util.Scanner;
import java.util.Arrays;
public class B_1049 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);

		int N= sc.nextInt();
		int M=sc.nextInt();
		int Min= Integer.MAX_VALUE;
		
		int[] unit= new int[M];
		int[] pack= new int[M];
		
		for(int i=0; i<M; i++)
		{
			pack[i]=sc.nextInt();
			unit[i]=sc.nextInt();	
		}
		Arrays.sort(unit);
		Arrays.sort(pack);
		Min= Math.min(((N/6)+1)*pack[0], N*unit[0]);
		Min= Math.min(Min, ((N/6))*pack[0] + (N%6)*unit[0]);
		System.out.println(Min);
		
		//��Ÿ���� ��� N�� ������� ���� �ּڰ��� ����϶�.
		
		
		
	}
	
	
}