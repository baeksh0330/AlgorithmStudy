//sw expert academy 1206
#include<stdio.h>
#include<math.h>
int main(void)
{
	int t;
	int x1, y1, r1, x2, y2, r2;
	
	double d;

	scanf_s("%d",&t);
	for (int i = 0; i < t; i++) //테스트 케이스
	{
		int cnt=0;
		
		scanf_s("%d %d %d %d %d %d",&x1,&y1,&r1,&x2,&y2,&r2);
		d = sqrt(pow(abs(x1 - x2), 2) + pow(abs(y1 - y2),2)); //점과 점 사이의 거리

		if (  r1 + r2> d && d >abs(r2 - r1)) //두 점에서 만나는 경우
			cnt = 2;

		else if (d == r1 + r2 || (d == abs(r1 - r2) && d != 0)) //한 점에서 만나는 경우
			cnt = 1;

		else if (d < abs(r2 - r1) || d > (r1 + r2)) //원 하나가 다른 원 포함 / 두 원이 멀리 떨어진 경우
			cnt = 0;

		else if (d == 0 && r1 == r2) //원이 일치->무수히 많은 점에서 만남
			cnt = -1;

		printf("%d\n",cnt);
	}



}