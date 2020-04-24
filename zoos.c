// Sample code to perform I/O:
#include <stdio.h>
#include <string.h>
 main(){
	char zoo[20];
	scanf("%s",&zoo);
	int size=strlen(zoo),count,x=0,y=0;
	for(count=0;count<=size-1;count++){
	if(zoo[count]=='z')
	x+=1;
	else
	y+=1;
}
	if(2*x==y)
	printf("Yes");
	else
	printf("No");
}
 
 
