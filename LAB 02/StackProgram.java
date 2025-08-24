/*
2. Develop a Stack class to hold a maximum of 10 integers with suitable methods. Develop a JAVA
main() method to illustrate Stack operations.*/


import java.util.Scanner;
class Stack
{
static final int MAX_SIZE=3;
int[] stackArray;
int top;
Stack()
{
stackArray=new int[MAX_SIZE];
top=-1;
}
void push(int value)
{
if(top<MAX_SIZE-1)
{
stackArray[++top]=value;
System.out.println("Pushed : " + value);
}
else
{
System.out.println("Stack Overflow! Cannot Push " + value +".");
}
}
int pop()
{
if(top>=0)
{
int poppedValue=stackArray[top--];
System.out.println("Popped : " + poppedValue);
return poppedValue;
}
else
{
System.out.println("Stack Underflow! Cannot pop from an Empty Stack.");
return -1;
}
}
void display()
{
if(top>=0)
{
System.out.println("Stack Contents:");
for(int i=0;i<=top;i++)
{
System.out.println(stackArray[i] + " ");
}
System.out.println();
}
else
{
System.out.println("Stack is Empty!..");
}
}
boolean isEmpty()
{
return top==-1;
}
boolean isFull()
{
return top==MAX_SIZE-1;
}
}
public class StackProgram
{
public static void main(String[] args)
{
Stack stk=new Stack();
Scanner s=new Scanner(System.in);
int choice;
do
{
System.out.println("\nStack Menu:");
System.out.println("1. Push");
System.out.println("2. Pop");
System.out.println("3. Display Stack Contents");
System.out.println("4. Check if the stack is empty");
System.out.println("5. Check if the stack is full");
System.out.println("0. Exit");
System.out.println("Enter your choice:");
choice=s.nextInt();
switch(choice)
{
case 1:
System.out.println("Enter the value to push:");
int valueToPush=s.nextInt();
stk.push(valueToPush);
break;
case 2:
stk.pop();
break;
case 3:
stk.display();
break;
case 4:
System.out.println("Is the Stack Empty?" + stk.isEmpty());
break;
case 5:
System.out.println("Is the Stack Full?" + stk.isFull());
break;
case 0:
System.out.println("Exiting the Program. Good Bye!");
break;
default:
System.out.println("Invalid Choice. Please Try Again!..");
}
}while(choice!=0);
}
}
