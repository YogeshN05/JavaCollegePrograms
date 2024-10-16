//Segrigating Students Based on Percentage Scored

import java.util.Scanner;

public class Student_Details
{
    public static void main(String[]args)
    {
        int score;
        String name;
        Scanner a=new Scanner(System.in);
        System.out.print("Name of the Student: ");
        name=a.nextLine();
        System.out.print("Student Percentage: ");
        score=a.nextInt();
        if(score>=80&&score<=100)
        {
            System.out.println("A Division");
        }
        else if(score>=60 && score<80)
        {
            System.out.println("B Division");
        } else if (score>=40&&score<60)
        {
            System.out.println("C Division");
        }
        else if(score<40)
        {
            System.out.println("F Division");
        }
        else
        {
            System.out.println("Invalid ");
        }
    }
}
