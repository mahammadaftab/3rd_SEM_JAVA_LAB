/*
10. Develop a JAVA program to create a package named mypack and import and implement it in a
suitable class.*/

// First create this file my name MyPackageClass
package mypack;
public class MyPackageClass
{
public void displayMessage()
{
System.out.println("Hello from MyPackageClass in mypack package!...");
}
// New utility method
public static int addNumbers(int a, int b)
{
return a+b;
}
}
/*
To run this program use this command
javac -d . MyPackageClass.java
it creates a folder my name mypack in that it will have the file MyPackageClass.class
*/

