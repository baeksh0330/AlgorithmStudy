import java.util.Scanner;

public class B_13458 {

	public static void main(String[] args) {

		
		int N,B,C; //시험장 수, 총 감독관이 감시할 수 있는 인력, 부 감독관이 감시할 수 있는 인력
		Scanner sc= new Scanner(System.in);
		N=sc.nextInt();
		
		long personCnt=N; //기본 총 감독관=강의실 수 만큼(부감독관은 있어도 되고 없어도 됨)
		//총 시험감독관의 수 범위를 잘 생각해 볼것 (int면 모자람)
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
			
			if(A[i]%C!=0 && A[i]>0) //A[i]가 양수여야 한다는게 중요했음ㅠㅠㅠㅠㅠ 
				personCnt+=1;
		}
		
System.out.println(personCnt);
	}

}
