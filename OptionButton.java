import java.applet.*;
import java.awt.*;
/*<applet  code="OptionButton" width=300 height=300></applet>*/
public class OptionButton extends Applet 
{
	public void init() 
	{
		CheckboxGroup Rb = new CheckboxGroup();
		Checkbox java = new Checkbox("Java", Rb, true);
		Checkbox cpp = new Checkbox("C++", Rb, true);
		Checkbox phython = new Checkbox("Phython", Rb, true);
		add(java);
		add(cpp);
		add(phython);
	}
	public static void main(String arg[])
	{
		new OptionButton();
	}
}
