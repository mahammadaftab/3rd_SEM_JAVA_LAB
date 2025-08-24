/*
5. Develop a JAVA program to create a class named Shape. Create three subclasses namely: circle,
triangle and square, each class has two members functions named draw() and erase(). Demonstrate
polymorphism concepts by developing suitable methods, defining member data and main program.*/

class Shape
{
protected String name;
public Shape(String name)
{
this.name=name;
}
public void draw()
{
System.out.println("Drawing a " + name);
}
public void erase()
{
System.out.println("Erasing a " + name);
}
}
class Circle extends Shape
{
private double radius;
public Circle(String name,double radius)
{
super(name);
this.radius=radius;
}
// override
public void draw()
{
System.out.println("Drawing a Cirlce with radius " + radius);
}
// override
public void erase()
{
System.out.println("Erasing a Cirlce with radius " + radius);
}
}
class Triangle extends Shape
{
private double base;
private double height;
public Triangle(String name,double base, double height)
{
super(name);
this.base=base;
this.height=height;
}
// override
public void draw()
{
System.out.println("Drawing a Traingle with base " + base + " and height " + height);
}
// override
public void erase()
{
System.out.println("Erasing a Triangle with base " + base + " and height " + height);
}
}
class Square extends Shape
{
private double side;
public Square(String name,double side)
{
super(name);
this.side=side;
}
// override
public void draw()
{
System.out.println("Drawing a Square with side " + side);
}
// override
public void erase()
{
System.out.println("Erasing a Square with side " + side);
}
}
public class ShapeDemo
{
public static void main(String[] args)
{
Shape[] shapes=new Shape[3];
shapes[0]=new Circle("Circle",5.0);
shapes[1]=new Triangle("Triangle",4.0,6.0);
shapes[2]=new Square("Square",3.0);
for(Shape s:shapes)
{
s.draw();
s.erase();
System.out.println(" ");
}
}
}
