class SingleThread extends Thread
{  
public void run()
{
for (int i=1; i<=10; i++)
{
System.out.println("Firstthread is running..." +i);
}
}
} 
class DoubleThread extends Thread
{  
public void run()
{
for (int i=1; i<=10; i++)
{
System.out.println("Secondthread is running..." +i);
}
} 
}
public class MultiThread
{
public static void main(String args[])
{  
SingleThread t1=new SingleThread();   
DoubleThread t2=new DoubleThread();
t1.start(); 
t2.start();
}  
}  
