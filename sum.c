#include<stdio.h>
int main(){
	float a,b,s,t;
	int i;
	a=2.0;
	b=1.0;
	s=0.0;
	for(i=1;i<=20;i++){
		s=s+a/b;
		t=a+b;
		b=a;
		a=t;
	}
	printf("Sum is %f\n",s);
	return 0;
}