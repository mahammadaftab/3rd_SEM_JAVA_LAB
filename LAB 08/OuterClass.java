/*
8. Develop a JAVA program to create an outer class with a function display. Create another class inside
the outer class named inner with a function called display and call the two functions in the main class.*/

class Outer
{
void display()
{
System.out.println("Outer Class Display Method");
}
class Inner
{
void display()
{
System.out.println("Inner Class Display Method");
}
}
}
public class OuterClass
{
public static void main(String[] args)
{
// Create an instance of the Outer class
Outer ob=new Outer();
// Call the display method of the Outer class
ob.display();
// Create an instance of the Inner class
// Outerclass.InnerClass innerobject= outerobject.new Innerclass();
Outer.Inner obin=ob.new Inner();
// Call the display method of the Outer class
obin.display();
}
}