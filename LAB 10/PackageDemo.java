/*
10. Develop a JAVA program to create a package named mypack and import and implement it in a
suitable class.*/

// Second you create this file PackageDemo
// Main program outside the mypack folder
import mypack.MyPackageClass;
public class PackageDemo
{
public static void main(String[] args)
{
// creating an instance of MyPackageClass from the mypack package
MyPackageClass myPackageObject=new MyPackageClass();
// Calling the displayMessage method from MyPacakgeClass
myPackageObject.displayMessage();
// Using the utility method addNumbers from MyPackageClass
int result=MyPackageClass.addNumbers(5,3);
System.out.println("Result of addingnumbers:" + result);
}
}
/*
To run this program use this command
javac PackageDemo.java
java PackageDemo
*/