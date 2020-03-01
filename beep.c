#include <wiringPi.h>
int main(void)
{
	wiringPiSetup();
	pinMode (22, OUTPUT);
	for(;;)
	{
		digitalWrite(22, HIGH); delay (500);
		digitalWrite(22, LOW); delay (500);
	}
	return 0;
}
