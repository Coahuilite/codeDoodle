#include <stdio.h>
#include <stdlib.h>

double bubble_sort(double arr[],int len);

int main(void){
	
	double x[3],y[3]; //ԭʼ����
	double ex[3],ey[3];//ĩӰ֮������
	double k[3],b[3];//б��k��ƫ��b
	double cx[3],cy[3];//��������
	double L,H;//ˮƽ��L��Ǧ����H
	int i;//ѭ���ñ���
	
	printf("���¼ѡȡλ�õ������붪����������������\n");
	printf("�������׼�������������������\n\n");
	printf("<���ڿ���������>\n\n");
	
	
	for(i = 0;i < 3;i++){
		
		printf("�����%d��ԭʼ����ĺ�����x:",i+1);
		scanf("%lf",&x[i]);
		printf("�����%d��ԭʼ�����������y:",i+1);
		scanf("%lf",&y[i]);
		printf("�����%d��ĩӰ֮������ĺ�����x:",i+1);
		scanf("%lf",&ex[i]);
		printf("�����%d��ĩӰ֮�������������y:",i+1);
		scanf("%lf",&ey[i]);
		k[i] = (y[i]-ey[i])/(x[i]-ex[i]);//��б��k
		b[i] = y[i]-k[i]*x[i];//ͨ�������������k��ƫ��b,��������������������
		
		printf("\n");
		//printf("������Ϣ:��ǰΪ��%d�����ݼ���,ԭʼ����Ϊ(%lf.3,%lf.3),ĩӰ����Ϊ(%lf.3,%lf.3),б��kΪ%lf.3,ƫ��bΪ%lf.3\n",i+1,x[i],y[i],ex[i],ey[i],k[i],b[i]);
		
	}
	
	for(i=0;i<2;i++){//��ǰ1/2����2/3�߽���
		cx[i]=(b[i+1]-b[i])/(k[i]-k[i+1]);
		cy[i]=cx[i]*k[i]+b[i];
	}
	cx[2]=(b[2]-b[0])/(k[0]-k[2]);//��1/3�߽���
	cy[2]=cx[2]*k[2]+b[2];
	
	bubble_sort(cx,(int)sizeof(cx)/sizeof(*cx));
	bubble_sort(cy,(int)sizeof(cy)/sizeof(*cy));
	
	L=(cx[2]+cx[0])*0.5;
	H=(cy[2]+cy[0])*0.5;
	
	printf("����Ҫ������:(%lf,%lf)\n",L,H);
	system("PAUSE");
	
	return 0;
}

double bubble_sort(double arr[],int len){

	int i,j,t;
	for(i=0;i<len-1;i++){
		for(j=0;j<len-1-i;j++){
			if(arr[j]>arr[j+1]){
				t=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=t;
			}
		}
	}
	
}