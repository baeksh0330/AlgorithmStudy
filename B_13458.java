import java.util.Scanner;

public class B_13458 {

	public static void main(String[] args) {

		
		int N,B,C; //������ ��, �� �������� ������ �� �ִ� �η�, �� �������� ������ �� �ִ� �η�
		Scanner sc= new Scanner(System.in);
		N=sc.nextInt();
		
		long personCnt=N; //�⺻ �� ������=���ǽ� �� ��ŭ(�ΰ������� �־ �ǰ� ��� ��)
		//�� ���谨������ �� ������ �� ������ ���� (int�� ���ڶ�)
		int[] A= new int[N];
		
		for(int i=0; i<N; i++)
			A[i]=sc.nextInt();
		B=sc.nextInt();
		C=sc.nextInt();
	
		for(int i=0; i<N; i++)
		{
			A[i]-=B;
			
			if(A[i]>0)
			personCnt+= A[i]/C;
			
			if(A[i]%C!=0 && A[i]>0) //A[i]�� ������� �Ѵٴ°� �߿������ФФФФ� 
				personCnt+=1;
		}
		
System.out.println(personCnt);
	}

}
