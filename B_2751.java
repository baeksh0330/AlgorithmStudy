import java.util.Scanner;
import java.util.Arrays;
public class B_2751 {

	public static void main(String[] args) { //�ð��ʰ����� ��κ� �������ķ� Ǯ��� �ϴµ�.
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr= new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int a : arr)
		{
			System.out.println(a);
		}
	}

}
