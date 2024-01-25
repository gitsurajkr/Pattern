#include <stdio.h>
int main()
{
    int n;
    printf("Enter NUmber of row:");
    scanf("%d", &n);
    for(int row = 0; row<n;row++){
        for(int space = 0; space<row;space++){
            printf(" ");
        }
        for(int column = 0; column<(2 * (n - row) - 1);column++){
            printf("*");
        }
        printf("\n");
    }
}