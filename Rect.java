// program to find the area of rectangle using function overloading and function overriding.

class findarea
{
void rectangle(double a, double b)
{
double area= a*b;
System.out.println("the area of rectngle "+a+ "," +b+ "using function overloading:" +area);
}
void rectangle(int p, int q)
{
int area= p*q;
System.out.println("The area of rectangle" +p+ "," +q+ "using function overriding:" +area);
}
}
class Rect
{
public static void main(String s[])
{
findarea obj= new findarea();
obj.rectangle(10.21,60.21);
obj.rectangle(10,20);
}
}
