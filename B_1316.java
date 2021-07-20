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
			
			else //연속문자가 없을때
				continue;	
		}
		
		System.out.println(cnt);
		
	}
	
	public static int findCont(String str) {
		
		int all_freq_0or1=0;
		int isContinuous=0; 
		
		cntFrequency(str);//frequency 넣기
		
		for(int i=0; i<26; i++)
		{
			if(frequency[i]==1 || frequency[i]==0)//만약에 모든 frequency가 0또는 1일때
				continue;
			else
				all_freq_0or1=1;
		}
		
		if(all_freq_0or1==0)
		{
			initializeFrequency();//끝나고 frequency 초기화
			return 1;
		}
	
		else //모든 freq이 0또는 1이 아닐때 //만약에 frequency가 겹칠때 얘네 인덱스를 확인
		{
			int ind=0, ind_inside=0;
			//연속 아닐때 0
			
			for(int i=0; i<26; i++) //알파벳마다 내부 몇개 겹치는지 확인할것
			{
				if(frequency[i]>1)
					ind=i;
				
				for(int i2=0; i2<100; i++)
				{	
					if(inside_frq[ind][i2]>0)
					{
						ind_inside=i2;
						
						if(ind_inside!=99 && inside_frq[ind][ind_inside]==1 && inside_frq[ind][ind_inside]-inside_frq[ind][ind_inside+1]==0) //1일때 하나차이나면 1-1이니까 0
							continue;
						else //문장 마지막 1 0 어카지
						{ 
							isContinuous=0;
							break;
						}
					}		
				}
	
			}	
		}
		
		initializeFrequency();//끝나고 frequency 초기화
		return isContinuous;
	}
	
	public static void cntFrequency(String str) {
		
		for(int i=0; i<str.length(); i++)
		{
			frequency[str.charAt(i)-97]++;
		/*	
			if(frequency[str.charAt(i)]>1)
				inside_frq[str.charAt(i)][i]++; //[몇번째 알파벳][문장의 몇번째에 존재하는지]
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
