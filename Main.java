// write a program to handle the user define exceptions.
class MyException extends Exception
{
}
public class Main
{
	public static void main(String args[])
	{
try
{
throw new MyException();
}
catch(MyException ex)
{
System.out.println("caught");
System.out.println(ex.getMessage());
}
}
}
