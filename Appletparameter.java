// program for passing parameters in an Applet.
import java.awt.*;
import java.applet.*;
//<applet code= Appletparameter height= 500 width = 500><parameter name= "string" Value= "Applet"></Applet>
public class Appletparameter extends Applet{
String str;
public void init()
{
str= getParameter("string");
if(str==null)
str="java";
str="Hello"+str;
}
public void paint(Graphics g)
{
g.drawString(str,100,100);
}
}
