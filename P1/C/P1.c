#include <stdio.h>

int main(int argc, char** argv) {
    int sum = 0;
    int i;
    for (i = 3; i < 1000; i += 3)
        if((i % 15))
            sum += i;
    for (i = 5; i < 1000; i += 5)
	    sum += i;
    printf("%d\n", sum);
    return 0;
}