import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//<applet code=MridulaOval height=400 width=400></applet> 
public class MridulaOval extends Applet implements ActionListener {

int count=0,x1,x2,y1,y2;
TextField t1,t2,t3,t4;
Button b1,b2,b3;
public void init()
{
t1=new TextField(3);
t2=new TextField(3);
t3=new TextField(3);
t4=new TextField(3);
add(t1);
add(t2);
add(t3);
add(t4);
b1=new Button("Line");
b2=new Button("Oval");
b3=new Button("Rectangle");
add(b1);
add(b2);
add(b3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
x1=Integer.parseInt(t1.getText());
y1=Integer.parseInt(t2.getText());
x2=Integer.parseInt(t3.getText());
y2=Integer.parseInt(t4.getText());
if(e.getSource()==b1)
{
count=1;

}
if(e.getSource()==b2)
{
count=2;
}
if(e.getSource()==b3)
{
count=3;
}
}
public void paint(Graphics g)
{
if(count==1)
{
g.drawLine(x1,y1,x2,y2);
}
if(count==2)
{
g.drawOval(x1,y1,x2,y2);
}
if(count==3)
{
g.drawRect(x1,y1,x2,y2);
}
}
}
