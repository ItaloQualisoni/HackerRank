#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>


void printFlipped(int number){
    printf("%u\n", ~number);
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int t;
    int number;
    scanf("%d",&t);
    while(t--){
	scanf("%d",&number);
    	printFlipped(number);
    }
    return 0;
}
