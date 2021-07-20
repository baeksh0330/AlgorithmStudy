package AlgorithmStudy;
import java.util.*;
public class B_1316 {

	public static int[] frequency= new int[26];
	public static int[][] inside_frq=new int[26][100];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int T,cnt=0;
		T=sc.nextInt();
		
		for(int i=0; i<T; i++)
		{
			String newStr= new String();
			newStr=sc.next();
			
			if(findCont(newStr)==1)
				cnt++;
			
			else //���ӹ��ڰ� ������
				continue;	
		}
		
		System.out.println(cnt);
		
	}
	
	public static int findCont(String str) {
		
		int all_freq_0or1=0;
		int isContinuous=0; 
		
		cntFrequency(str);//frequency �ֱ�
		
		for(int i=0; i<26; i++)
		{
			if(frequency[i]==1 || frequency[i]==0)//���࿡ ��� frequency�� 0�Ǵ� 1�϶�
				continue;
			else
				all_freq_0or1=1;
		}
		
		if(all_freq_0or1==0)
		{
			initializeFrequency();//������ frequency �ʱ�ȭ
			return 1;
		}
	
		else //��� freq�� 0�Ǵ� 1�� �ƴҶ� //���࿡ frequency�� ��ĥ�� ��� �ε����� Ȯ��
		{
			int ind=0, ind_inside=0;
			//���� �ƴҶ� 0
			
			for(int i=0; i<26; i++) //���ĺ����� ���� � ��ġ���� Ȯ���Ұ�
			{
				if(frequency[i]>1)
					ind=i;
				
				for(int i2=0; i2<100; i++)
				{	
					if(inside_frq[ind][i2]>0)
					{
						ind_inside=i2;
						
						if(ind_inside!=99 && inside_frq[ind][ind_inside]==1 && inside_frq[ind][ind_inside]-inside_frq[ind][ind_inside+1]==0) //1�϶� �ϳ����̳��� 1-1�̴ϱ� 0
							continue;
						else //���� ������ 1 0 ��ī��
						{ 
							isContinuous=0;
							break;
						}
					}		
				}
	
			}	
		}
		
		initializeFrequency();//������ frequency �ʱ�ȭ
		return isContinuous;
	}
	
	public static void cntFrequency(String str) {
		
		for(int i=0; i<str.length(); i++)
		{
			frequency[str.charAt(i)-97]++;
		/*	
			if(frequency[str.charAt(i)]>1)
				inside_frq[str.charAt(i)][i]++; //[���° ���ĺ�][������ ���°�� �����ϴ���]
			else
				continue;
		*/
		}
	}
	
	public static void initializeFrequency() {

		for(int i=0; i<26; i++)
		{
			frequency[i]=0;
			
			for(int i2=0; i2<100; i2++)
			{
				inside_frq[i][i2]=0;
			}
		}

	
	}
}
