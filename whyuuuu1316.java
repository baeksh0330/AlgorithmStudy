package AlgorithmStudy;

import java.util.Scanner;

public class whyuuuu1316 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int ans=T;
		
        for(int i=0; i<T; i++)
		{
			String newStr= new String();
            newStr=sc.next();
			boolean[] checker = new boolean[26];
			
			for(int a=1; a<newStr.length(); a++)
			{
				if(newStr.charAt(a-1)!=newStr.charAt(a))
				{
					if(checker[newStr.charAt(a)-97]==true) //���� ���ڰ� ������ �������� �ִٸ�
						{
							ans--;
							break;
						}
					checker[newStr.charAt(a-1)-97]=true; //�ΰ��� ���� ���
				}
			}
		}
			System.out.println(ans);
		}
		
}
