#include<stdio.h>
# define PI 3.142

int main()
{
    int r;
    //const double PI=3.142;
    printf("\n\nEnter the Radius Of Circle: ");
    scanf("%d",&r);
    
    printf("\nRadius of Circle:%d",r);

    double area=PI*r*r;
    printf("\n\nArea of Circle is %lf",area);

    double cir=2*PI*r;
    printf("\n\nCircumference Of Circle is %lf\n\n",cir);

}
