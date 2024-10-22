import java.util.Scanner;
abstract class Shapes{
     abstract double area(int radius);
     abstract double area(int length,int breadth,int height);
     abstract double perimeter(int length,int breadth,int height);
     abstract double perimeter(int radius);
     
}
class Circle extends Shapes{
    double area(int radius)
    {
        final double PI=3.142;
        double area=PI*radius*radius;
        System.out.println("Area of the Circle: "+area);
        return area;
    }
    double area(int length,int breadth,int height)
    {
        int a=0;
        return a;
    }
    
    double perimeter(int radius)
    {
        final double PI=3.142;
        double perimeter=2*PI*radius;
        System.out.println("Perimeter of a circle: "+perimeter);
        return perimeter;
    }
    double perimeter(int length,int breadth,int height)
    {
        int a=0;
        return a;
    }
}

class Triangle extends Shapes{ 
    double area(int length,int breadth,int height)
    {
        double area=(double)(length*breadth*height);
        System.out.println("Area of the Triangle: "+area);
        return area;
    }
    double area(int radius)
    {
        int a=0;
        return a;
    }

    double perimeter(int length,int breadth,int height)
    {
        int perimeter=length+breadth+height;
        System.out.println("Perimeter of the Triangle: "+perimeter);
        return perimeter;
    }
    double perimeter(int radius)
    {
        int a=0;
        return a;
    }
}



 class Prog6 {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    Circle c=new Circle();
    Triangle t=new Triangle();

    System.out.print("Enter the radius: ");
    int radius=s.nextInt();
    System.out.println("Radius of a circle: "+radius);
    c.area(radius);
    c.perimeter(radius);

    System.out.print("Enter Length: ");
    int length=s.nextInt();
    System.out.print("Enter Breadth: ");
    int breadth=s.nextInt();
    System.out.print("Enter Height: ");
    int height=s.nextInt();
    System.out.println();
    System.out.println("Length of a Triangle: "+length);
    System.out.println("Breadth of a Triangle: "+breadth);
    System.out.println("Heigth a Triangle: "+height);
    t.area(length, breadth, height);
    t.perimeter(length, breadth, height);
    }
    
}
