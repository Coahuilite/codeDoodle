#include<stdio.h>
int main(){
	int t,d,i;
	t=100;
	d=300;
	i=1;
	for(t;t<=d;t++){
		if(t%1==0&&t%t==0){
			printf("%d",t);
			printf(" ");
			i++;
			if(i==6){
				printf("\n");
				i=1;
			}
		}
	}
	return 0;
}
