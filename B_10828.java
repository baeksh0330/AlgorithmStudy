<<<<<<< HEAD


public class B_10828 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

=======
package AlgorithmStudy;
import java.util.Scanner;

public class B_10828 {

	//stack= first in, last out
	public static int[] arr= new int[10000];
	public static int first=-1;
	public static int last=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int order_num, i=0;
		String order;
		
		
		order_num=sc.nextInt(); //명령의 숫자
		
		while(order_num>=0)
		{
			order=sc.next(); //명령 입력받고
			order2(order);
			order_num--;
		}
		
		
	}

	public static int pop()
	{
		first--;
	
		if(first<-1)
			first=-1;
		
		return arr[first+1];
	}
	
	public static int empty()
	{
		if(first<last) //비었음
			return 1;
		else //스택안에 값이 있음
			return 0;
	}
	
	public static int size() {
		return first;
	}
	
	public static int top() {
		
		if(empty()==1)
		return -1;
		
		else
		return arr[first]; 
		
	}
	
	public static void push(int n)
	{
		first++;
		arr[first]=n;
	}
	
	public static void order2(String order)
	{
		if(order.contains("push"))
		{
			order=order.substring(order.length()-1);
			int insNum=Integer.parseInt(order);
			System.out.println(insNum);
			push(insNum);
		}
		
		else if(order.contains("pop"))
			System.out.println(pop());
		
		else if(order.contains("top"))
			System.out.println(top());
		
		else if(order.contains("size"))
			System.out.println(size());
		
		else if(order.contains("empty"))
			System.out.println(empty());
	
		else //이럴일은 없음
			return;			
	}
	
>>>>>>> 9071909db84928c3805107545d700f512d65058a
}
