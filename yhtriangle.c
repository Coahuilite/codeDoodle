#include <stdio.h>
int main(){
	printf("Enter the line of triangle:");
	int l,x,y;
	scanf("%d",&l);
	getchar();
	int yh[l][l];
	for(x=0;x<l;x++){
		for(y=0;y<=x;y++){
			if(x==y||y==0){
				yh[x][y]=1;
			}else{
				yh[x][y]=yh[x-1][y-1]+yh[x-1][y];
			}
			printf("%d ",yh[x][y]);
		}
		printf("\n");
	}
	return 0;
}
