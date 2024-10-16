import java.util.Scanner;
public class Tabels {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("Enter the Value of n:  ");
        int input=a.nextInt();

        System.out.println("\n");
        System.out.println("Tables for "+input+":-");
        System.out.println("\n");

        //Using For Loop
        for(int i=1;i<=10;i++)
        {
            System.out.println(input+"*"+i+"="+input*1);
        }
    }
    
}
