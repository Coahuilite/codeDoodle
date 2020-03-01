#include<stdio.h>
int main(){
	int i,a,b,c,o;
	i=100;
	o=0;
	for(a=0;a<=i/5;a++){
		for(b=0;b<=i/2;b++){
			for(c=0;c<=i/1;c++){
				if((a+b+c)==50&&(5*a+2*b+c)==100){
					if(a!=0&&b!=0&&c!=0){
						o++;
						printf("option %d is %d 5 cent coin,%d 2 cent coin,%d 1 cent coin\n",o,a,b,c);
					}
				}
			}
		}
	}
	return 0;
}

/*
   a+b+c==50
   5*a+2*b+1*c==100
   */
