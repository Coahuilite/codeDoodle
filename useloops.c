#include <stdio.h>
int main(){
	int l1,l2,l3;

	//while loop
	l1 = 5;
	while (l1 > 0){
		l1--;
		printf("this is while loop and l1 is :%d\n",l1);
	}

	//do while loop
	l2 = 5;
	do {
		--l2;
		printf("this is do while loop and l2 is :%d\n",l2);
	}while (l2 > 0);

	//for loop
	for (int i = 5;i > 0;i-- ){
		printf("this is for loop and l3 is :%d\n",l3);
		l3--;
	}
	
	return 0;
}
