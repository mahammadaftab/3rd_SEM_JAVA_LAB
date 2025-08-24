/* 
3. A class called Employee, which models an employee with an ID, name and salary is designed as shown
in the following class diagram. The method raiseSalary (percent) increases the salary by the given
percentage. Develop the Employee class and suitable main method for demonstration.
import java.util.Scanner;*/


class Employee
{
 String empID;
 String empName;
double empSalary;
 Employee(){}
Employee(String empID, String empName, double empSalary)
{
 this.empName = empID;
this.empName = empName;
 this.empSalary = empSalary;
}

void raiseSalary(double percent)
{
if(percent>0)
{
double raiseAmount=empSalary+empSalary*(percent/100);
System.out.println(empName + " salary raised by " + percent + " Percent");
System.out.println("Old Salary is " + empSalary + " and Now New Salary is " + raiseAmount);
}
else
System.out.println("No Increase in Salary " + empName + " Salary is " + empSalary);
}

void printEmployeeDetails()
{
 System.out.println("Emp ID: " + empID);
 System.out.println("Emp Name: " + empName);
 System.out.println("Salary: " + empSalary);
 }
}
public class EmpDemo
{
public static void main(String[] args)
{

Scanner s=new Scanner(System.in);
System.out.println("Enter Employe ID ,Name and Salary:");
String empID=s.nextLine();
String empName=s.nextLine();
double empSalary=s.nextDouble();
Employee emp = new Employee(empID,empName,empSalary);
System.out.println("\nEmployee Details:");
 emp.printEmployeeDetails();

 System.out.println("Enter the percentage of salary you want to raise for Employee");
double p=s.nextDouble();
emp.raiseSalary(p);

 }
 }