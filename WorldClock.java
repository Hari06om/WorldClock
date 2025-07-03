import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.time.*;

class WorldClock
{
     private static String s1= "", s2="", s3="";
     private static LocalDate d;
     private static LocalTime t;
     private static ZoneId id;
     static public void main(String[] kr)
     {
	JFrame f = new JFrame("World Clock");
	f.setSize(1000, 700);
	f.setLocationRelativeTo(null);
	f.setResizable(false);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JLabel map = new JLabel(new ImageIcon("World1.jpg"));
	f.add(map);


	JPanel p = new JPanel();
	JLabel country = new JLabel();
	country.setFont(new Font("Serif" , 1, 32));
	p.add(country);

	f.add(p, BorderLayout.NORTH);

	class MyListener implements MouseMotionListener
	{
		public void mouseDragged(MouseEvent m) {}

		public void mouseMoved(MouseEvent m)
		{
			System.out.println(m.getX() + "\t" + m.getY());
			int x1 =m.getX();
			int y1 = m.getY();

		//Australia
			if(x1 > 800 && x1 <900 && y1 > 520 && y1 <580)
			{
				id = ZoneId.of("Australia/Sydney");
			}
		//Canada
			else if(x1>100 && x1 < 270 && y1 > 180 && y1 < 310)
			{
				id = ZoneId.of("America/Chicago");
			}

			else
			{
				id = ZoneId.systemDefault();
			}
			 	d = LocalDate.now(id);
			 	t = LocalTime.now(id);
			country.setText(id + "                  "+ t + "           " + d);
		}
	}
		

	f.addMouseMotionListener(new MyListener() );

	f.setVisible(true);
}
}