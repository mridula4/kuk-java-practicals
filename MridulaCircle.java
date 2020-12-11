import java.applet.*;
import java.awt.*;
import java.lang.Math.*;

//<applet code=MridulaCircle height=300 width=300></Applet> 
public class MridulaCircle extends Applet {

int a,b;
double value=0.00,ang;
public void paint(Graphics g)
{
g.drawOval(50,100,100,100);
g.setColor(Color.BLUE);
g.fillOval(50,100,100,100);
g.setColor(Color.RED);
ang=Math.toRadians(value);

g.drawLine((int)(100-50*Math.cos(ang)),(int)(150-50*Math.sin(ang)),
(int)(100+50*Math.cos(ang)),(int)(150+50*Math.sin(ang)));
g.setColor(Color.GREEN);

g.drawLine((int)(100-50*Math.cos(ang+90)),(int)(150-50*Math.sin(ang+90)),

(int)(100+50*Math.cos(ang+90)),(int)(150+50*Math.sin(ang+90)));
value=value+5;
try
{
Thread.sleep(50);
}
catch(InterruptedException e)
{
}
repaint();
}
}
