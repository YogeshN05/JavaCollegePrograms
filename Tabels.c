//Implement a C Program and Printing a Tabels 
#include<stdio.h>
int main()
{
    int n;
    printf("Enter the value of n: ");
    scanf("%d",&n);
    printf("Tabels of %d:-",n);
    for(int i=1;i<=10;i++)
    {
        int j=i*n;
        printf("\n%d*%d=%d",n,i,j);
    }
    return 0;
}