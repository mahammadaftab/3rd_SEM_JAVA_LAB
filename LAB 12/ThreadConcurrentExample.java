/*
12. Develop a program to create a class MyThread in this class a constructor , call the base class
constructor, using super and start the thread. The run method of the class starts after this. It can be
observed that both main thread and created child thread are executed concurrently.*/

class MyThread extends Thread
{
// Constructor calling base class constructor using super
public MyThread(String name)
{
super(name);
start(); // Start the thread in the constructor
}
// The run method that will be executed when the thread starts
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println(Thread.currentThread().getName() + "Count : " + i);
try
{
Thread.sleep(500);
}
catch(InterruptedException e)
{
System.out.println(Thread.currentThread().getName() + " Thread Interrupted.");
}
}
}
}
public class ThreadConcurrentExample
{
public static void main(String[] args)
{
// Create an instance of MyThread
MyThread myThread= new MyThread("Child Thread");
// Main thread
for(int i=1;i<=5;i++)
{
System.out.println(Thread.currentThread().getName() + " Thread Count: "+ i);
try
{
Thread.sleep(500);
}
catch(InterruptedException e)
{
System.out.println(Thread.currentThread().getName() + " Thread Interupted.");
}
}
}
}