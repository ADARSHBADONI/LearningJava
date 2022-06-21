package UNIT_04;


	import javax.swing.*;
	import java.awt.*;

	class Smiley extends Canvas{
	public void paint(Graphics g)
	{
	g.setColor(Color.BLUE);
	g.fillArc(100, 50, 200, 200, 0, 360);
	g.setColor(Color.BLACK);
	g.fillArc(130, 100, 40, 30, 0, 360);
	g.fillArc(220, 100, 40, 30, 0, 360);
	g.setColor(Color.PINK);
	g.fillArc(150, 150, 100, 70, 0, -180);
	}
	public static void main(String[] args)
	{
	Smiley d = new Smiley() ;
	JFrame f = new JFrame() ;
	f.setSize(600,700);
	f.setVisible(true);
	f.add(d) ;
	}
	
}
