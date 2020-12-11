import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//<Applet code=MridulaLine height=400 width=400></Applet>

public class MridulaLine extends Applet implements MouseListener,MouseMotionListener

{
int x,y,a,b,c,d;
public void init(){
addMouseListener(this);
addMouseMotionListener(this);
}
public void mouseDragged(MouseEvent e)
{
x=e.getX();
y=e.getY();

showStatus("Mouse Dragged at position "+x+" "+y); repaint();

}
public void mouseMoved(MouseEvent e){}
public void mouseClicked(MouseEvent e){}
public void mousePressed(MouseEvent e)
{
a=e.getX();
b=e.getY();
}
public void mouseReleased(MouseEvent e){}
public void mouseExited(MouseEvent e){}
public void mouseEntered(MouseEvent e){}
public void paint(Graphics g)
{
g.drawLine(a,b,x,y);
}
}	

