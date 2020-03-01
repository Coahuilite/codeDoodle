#include <stdio.h>
int main()
{
	char ch;
	ch=getchar();
	if(ch>='a'&&ch<='z'){
		ch-=32;
	}
	else if(ch>='A'&&ch<='Z'){
		ch+=32;
	}
	putchar(ch);
	return 0;
}

