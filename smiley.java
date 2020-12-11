//program to draw smiley face in applet.
import java.applet.*;
import java.awt.*;
//<applet code= smiley height=300 width=300> </applet>
public class smiley extends Applet
{	
public void paint(Graphics g)
{
g.fillOval(80,70,150,150);
g.setColor(Color.yellow);
g.fillOval(120,120,15,15);
g.fillOval(170,120,15,15);
g.drawArc(130,180,50,20,180,180);
}
}
