//Implement a C Program and Printing a Tabele 
#include<stdio.h>
int main()
{
    int n;
    printf("Enter the value of n: ");   //Taking input from user
    scanf("%d",&n);
    printf("Tabels of %d:-",n);
    for(int i=1;i<=10;i++)
    {
        int j=i*n;
        printf("\n%d*%d=%d",n,i,j); //printing tabels according to user input.
    }
    return 0;
}