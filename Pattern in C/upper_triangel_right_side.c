#include <stdio.h>
int main()
{
    int n;
    printf("Enter NUmber of row:");
    scanf("%d", &n);
    for (int row = 0; row < n; row++)
    {
        for (int space = 0; space < n - row; space++)
    {
        printf("*");
    }
        printf("\n");
    }
}