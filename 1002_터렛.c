//sw expert academy 1206
#include<stdio.h>
#include<math.h>
int main(void)
{
	int t;
	int x1, y1, r1, x2, y2, r2;
	
	double d;

	scanf_s("%d",&t);
	for (int i = 0; i < t; i++) //�׽�Ʈ ���̽�
	{
		int cnt=0;
		
		scanf_s("%d %d %d %d %d %d",&x1,&y1,&r1,&x2,&y2,&r2);
		d = sqrt(pow(abs(x1 - x2), 2) + pow(abs(y1 - y2),2)); //���� �� ������ �Ÿ�

		if (  r1 + r2> d && d >abs(r2 - r1)) //�� ������ ������ ���
			cnt = 2;

		else if (d == r1 + r2 || (d == abs(r1 - r2) && d != 0)) //�� ������ ������ ���
			cnt = 1;

		else if (d < abs(r2 - r1) || d > (r1 + r2)) //�� �ϳ��� �ٸ� �� ���� / �� ���� �ָ� ������ ���
			cnt = 0;

		else if (d == 0 && r1 == r2) //���� ��ġ->������ ���� ������ ����
			cnt = -1;

		printf("%d\n",cnt);
	}



}