#include<stdio.h>
int main()
{
    int age;
    printf("Enter Your Age: ");
    scanf("%d",&age);

    if(age==0)
    {
        printf("You are Just Born....!!");
    }
    else if(age<18&&age>0)
    {
        printf("Your age is %d,You are not Eligibele to vote..... ",age);
    }

    else if(age>=18)
    {
        printf("Your age is %d,You are Eligibele to vote..... ",age);

    }
    else
    {
        printf("Enter a Valid Age....");
    }

    return 0;
}
