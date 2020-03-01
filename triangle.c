#include<stdio.h>
int main(){
	int i,s,t,a,b;
	t=6;
	for(i=1;i<=6;i++){
		s=t-i;
		for(a=1;a<=s;a++){
			printf(" ");
		}
		for(b=1;b<=i;b++){
			printf("*");
		}
		printf("\n");
	}
	return 0;
}