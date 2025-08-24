/*
6. Develop a JAVA program to create an abstract class Shape with abstract methods calculateArea() and
calculatePerimeter(). Create subclasses Circle and Triangle that extend the Shape class and implement the
respective methods to calculate the area and perimeter of each shape.*/

abstract class Shape
{
abstract double calculateArea();
abstract double calculatePerimeter();
}
class Circle extends Shape
{
private double radius;
public Circle(double radius)
{
this.radius=radius;
}
// override
double calculateArea()
{
return Math.PI*radius*radius;
}
double calculatePerimeter()
{
return 2*Math.PI*radius;
}
}
class Triangle extends Shape
{
private double side1;
private double side2;
private double side3;
public Triangle(double side1,double side2,double side3)
{
this.side1=side1;
this.side2=side2;
this.side3=side3;
}
// override
double calculateArea()
{
double s=(side1+side2+side3)/2;
return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
}
//override
double calculatePerimeter()
{
return side1+side2+side3;
}
}
public class ShapeDemo11
{
public static void main(String[] args)
{
// Creating Circle and Triangle Objects
Circle c=new Circle(5.0);
Triangle t=new Triangle(3.0,4.0,5.0);
// Calculating and displaying area and perimeter
System.out.println("Circle Area : " + c.calculateArea());
System.out.println("Circle Perimeter : " + c.calculatePerimeter());
System.out.println("--------------------------------------------");
System.out.println("Triangle Area : " + t.calculateArea());
System.out.println("Triangle Perimeter : " + t.calculatePerimeter());
}
}