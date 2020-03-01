#include <stdio.h>
#include <stdlib.h>

double bubble_sort(double arr[],int len);

int main(void){
	
	double x[3],y[3]; //原始坐标
	double ex[3],ey[3];//末影之眼坐标
	double k[3],b[3];//斜率k与偏置b
	double cx[3],cy[3];//交点坐标
	double L,H;//水平宽L与铅锤高H
	int i;//循环用变量
	
	printf("请记录选取位置的坐标与丢出珍珠后的落点的坐标\n");
	printf("保持鼠标准星与珍珠所在纵轴对齐\n\n");
	printf("<现在可以输入了>\n\n");
	
	
	for(i = 0;i < 3;i++){
		
		printf("输入第%d个原始坐标的横坐标x:",i+1);
		scanf("%lf",&x[i]);
		printf("输入第%d个原始坐标的纵坐标y:",i+1);
		scanf("%lf",&y[i]);
		printf("输入第%d个末影之眼坐标的横坐标x:",i+1);
		scanf("%lf",&ex[i]);
		printf("输入第%d个末影之眼坐标的纵坐标y:",i+1);
		scanf("%lf",&ey[i]);
		k[i] = (y[i]-ey[i])/(x[i]-ex[i]);//算斜率k
		b[i] = y[i]-k[i]*x[i];//通过上面算出来的k求偏置b,并把这玩意塞进数组里
		
		printf("\n");
		//printf("调试信息:当前为第%d轮数据计算,原始坐标为(%lf.3,%lf.3),末影坐标为(%lf.3,%lf.3),斜率k为%lf.3,偏置b为%lf.3\n",i+1,x[i],y[i],ex[i],ey[i],k[i],b[i]);
		
	}
	
	for(i=0;i<2;i++){//算前1/2线与2/3线交点
		cx[i]=(b[i+1]-b[i])/(k[i]-k[i+1]);
		cy[i]=cx[i]*k[i]+b[i];
	}
	cx[2]=(b[2]-b[0])/(k[0]-k[2]);//算1/3线交点
	cy[2]=cx[2]*k[2]+b[2];
	
	bubble_sort(cx,(int)sizeof(cx)/sizeof(*cx));
	bubble_sort(cy,(int)sizeof(cy)/sizeof(*cy));
	
	L=(cx[2]+cx[0])*0.5;
	H=(cy[2]+cy[0])*0.5;
	
	printf("最终要塞坐标:(%lf,%lf)\n",L,H);
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