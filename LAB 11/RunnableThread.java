/*
11. Write a program to illustrate creation of threads using running class. ( Start method start each of the
newly created thread. Inside the run method there is sleep() for suspend the thread for 500 milliseconds).*/

class MyRunnable implements Runnable
{
private volatile boolean running=true;
 // Override
public void run()
{
while(running)
{
try
{
// Suppress deprecation warning for Thread.sleep()
Thread.sleep(500);
System.out.println("Thread ID: " + Thread.currentThread().getId() + "is running.");
}
catch(InterruptedException e)
{
System.out.println("Thread Interrupted.");
}
}
}
public void stopThread()
{
running=false;
}
}
public class RunnableThread
{
public static void main(String[] args)
{
// Create five instances of MyRunnable
MyRunnable myRun1= new MyRunnable();
MyRunnable myRun2= new MyRunnable();
MyRunnable myRun3= new MyRunnable();
MyRunnable myRun4= new MyRunnable();
MyRunnable myRun5= new MyRunnable();
// Create five threads and associate them with MyRunnable instances
Thread thread1=new Thread(myRun1);
Thread thread2=new Thread(myRun2);
Thread thread3=new Thread(myRun3);
Thread thread4=new Thread(myRun4);
Thread thread5=new Thread(myRun5);
// Start the threads
thread1.start();
thread2.start();
thread3.start();
thread4.start();
thread5.start();
// Sleep for a while to allow the threads to run
try
{
Thread.sleep(500);
}
catch(InterruptedException e)
{
e.printStackTrace();
}
// Stop the threads gracefully
myRun1.stopThread();
myRun2.stopThread();
myRun3.stopThread();
myRun4.stopThread();
myRun5.stopThread();
}
}
