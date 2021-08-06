
import java.util.*;
public class b_10989 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int []arr= new int[T];
		for(int i=0; i<T; i++)
		{
			int n=sc.nextInt();
			arr[i]=n;
		}
		Arrays.sort(arr);
		
		for(int i=0; i<T; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
