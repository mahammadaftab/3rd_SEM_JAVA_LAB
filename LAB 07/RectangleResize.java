/*
7. Develop a JAVA program to create an interface Resizable with methods resizeWidth(int width) and
resizeHeight(int height) that allow an object to be resized. Create a class Rectangle that implements the
Resizable interface and implements the resize methods.*/

import java.util.Scanner;
interface Resizable
{
 void resizeWidth(int width);
 void resizeHeight(int height);
}
class Rectangle implements Resizable
{
 private int width;
 private int height;
 public Rectangle(int width, int height)
{
 this.width = width;
 this.height = height;
 }
 public void resizeWidth(int width)
 {
 this.width = width;
 }
 public void resizeHeight(int height)
 {
 this.height = height;
 }
 public void printSize()
 {
 System.out.println("Width: " + width + ", Height: " + height);
 }
}
public class RectangleResize
{
 public static void main(String[] args)
 {
 Rectangle rectangle = new Rectangle(100, 150);
 rectangle.printSize();
 int rw,rh;
Scanner s = new Scanner(System.in);
 System.out.println("Enter the value of Rectangle Width for the Rectangle:");
 rw = s.nextInt();
 System.out.println("Enter the value of Rectangle Height for the Rectangle:");
 rh = s.nextInt();

rectangle.resizeWidth(rh);
 rectangle.resizeHeight(rw);
 rectangle.printSize();
 }
}