// program to find the sum of 10 numbers, entered as   command line arguments.
// Command line Arguments means that you have to provide input during execution of program.
class sum
{
public static void main(String arg[])
{
int n,sum=0;
for(String a:arg)
{	
n=Integer.parseInt(a);
sum+=n;
}
System.out.println("Sum is :  "+sum);
}
}
