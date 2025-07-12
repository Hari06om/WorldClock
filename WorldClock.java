import java.awt.*;
import java.awt.event.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import javax.swing.*;

class WorldClock
{
     private static String s1= "", s2="", s3="";
     private static LocalDate d;
     private static LocalTime t;
     private static ZoneId id;
     private static JLabel country;
     private static Timer timer;
     
     static public void main(String[] kr)
     {
	JFrame f = new JFrame("World Clock");
	f.setSize(1000, 700);
	f.setLocationRelativeTo(null);
	f.setResizable(false);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.getContentPane().setBackground(new Color(25, 25, 35)); // Dark blue background
	
	JLabel map = new JLabel(new ImageIcon("World1.jpg"));
	f.add(map);

	JPanel p = new JPanel();
	p.setBackground(new Color(15, 15, 25)); // Darker panel background
	country = new JLabel();
	country.setFont(new Font("Arial", Font.BOLD, 28));
	country.setForeground(new Color(255, 215, 0)); // Golden text color
	country.setHorizontalAlignment(SwingConstants.CENTER);
	p.add(country);

	f.add(p, BorderLayout.NORTH);

	// Initialize with system default
	id = ZoneId.systemDefault();
	updateTime();

	// Timer to update time every second
	timer = new Timer(1000, new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			updateTime();
		}
	});
	timer.start();

	class MyListener implements MouseMotionListener
	{
		public void mouseDragged(MouseEvent m) {}

		public void mouseMoved(MouseEvent m)
		{
			System.out.println(m.getX() + "\t" + m.getY());
			int x1 = m.getX();
			int y1 = m.getY();

			//United States
			if(x1 > 80 && x1 < 250 && y1 > 250 && y1 < 350)
			{
				id = ZoneId.of("America/New_York");
			}
			//Canada
			else if(x1 > 100 && x1 < 270 && y1 > 180 && y1 < 310)
			{
				id = ZoneId.of("America/Toronto");
			}
			//Brazil
			else if(x1 > 280 && x1 < 380 && y1 > 420 && y1 < 520)
			{
				id = ZoneId.of("America/Sao_Paulo");
			}
			//United Kingdom
			else if(x1 > 470 && x1 < 500 && y1 > 200 && y1 < 240)
			{
				id = ZoneId.of("Europe/London");
			}
			//Germany
			else if(x1 > 500 && x1 < 530 && y1 > 220 && y1 < 260)
			{
				id = ZoneId.of("Europe/Berlin");
			}
			//France
			else if(x1 > 480 && x1 < 510 && y1 > 240 && y1 < 270)
			{
				id = ZoneId.of("Europe/Paris");
			}
			//Russia
			else if(x1 > 550 && x1 < 750 && y1 > 150 && y1 < 280)
			{
				id = ZoneId.of("Europe/Moscow");
			}
			//China
			else if(x1 > 750 && x1 < 850 && y1 > 280 && y1 < 380)
			{
				id = ZoneId.of("Asia/Shanghai");
			}
			//India
			else if(x1 > 680 && x1 < 750 && y1 > 320 && y1 < 420)
			{
				id = ZoneId.of("Asia/Kolkata");
			}
			//Japan
			else if(x1 > 870 && x1 < 900 && y1 > 300 && y1 < 350)
			{
				id = ZoneId.of("Asia/Tokyo");
			}
			//Australia
			else if(x1 > 800 && x1 < 900 && y1 > 520 && y1 < 580)
			{
				id = ZoneId.of("Australia/Sydney");
			}
			//South Africa
			else if(x1 > 520 && x1 < 580 && y1 > 480 && y1 < 520)
			{
				id = ZoneId.of("Africa/Johannesburg");
			}
			//Egypt
			else if(x1 > 520 && x1 < 550 && y1 > 340 && y1 < 380)
			{
				id = ZoneId.of("Africa/Cairo");
			}
			//Saudi Arabia
			else if(x1 > 580 && x1 < 630 && y1 > 340 && y1 < 400)
			{
				id = ZoneId.of("Asia/Riyadh");
			}
			//Indonesia
			else if(x1 > 780 && x1 < 850 && y1 > 460 && y1 < 500)
			{
				id = ZoneId.of("Asia/Jakarta");
			}
			else
			{
				id = ZoneId.systemDefault();
			}
		}
	}

	f.addMouseMotionListener(new MyListener());
	f.setVisible(true);
     }

     private static void updateTime() {
	d = LocalDate.now(id);
	t = LocalTime.now(id);
	
	// Format time nicely
	DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
	
	String formattedTime = t.format(timeFormatter);
	String formattedDate = d.format(dateFormatter);
	
	// Get area name based on current zone
	String areaName = getAreaName(id);
	
	country.setText(String.format("%s  |  %s  |  %s", areaName, formattedTime, formattedDate));
     }

     private static String getAreaName(ZoneId zoneId) {
	String zoneString = zoneId.toString();
	
	if (zoneString.contains("America/New_York")) {
		return "🇺🇸 UNITED STATES";
	} else if (zoneString.contains("America/Toronto")) {
		return "🇨🇦 CANADA";
	} else if (zoneString.contains("America/Sao_Paulo")) {
		return "🇧🇷 BRAZIL";
	} else if (zoneString.contains("Europe/London")) {
		return "🇬🇧 UNITED KINGDOM";
	} else if (zoneString.contains("Europe/Berlin")) {
		return "🇩🇪 GERMANY";
	} else if (zoneString.contains("Europe/Paris")) {
		return "🇫🇷 FRANCE";
	} else if (zoneString.contains("Europe/Moscow")) {
		return "🇷🇺 RUSSIA";
	} else if (zoneString.contains("Asia/Shanghai")) {
		return "🇨🇳 CHINA";
	} else if (zoneString.contains("Asia/Kolkata")) {
		return "🇮🇳 INDIA";
	} else if (zoneString.contains("Asia/Tokyo")) {
		return "🇯🇵 JAPAN";
	} else if (zoneString.contains("Australia/Sydney")) {
		return "🇦🇺 AUSTRALIA";
	} else if (zoneString.contains("Africa/Johannesburg")) {
		return "🇿🇦 SOUTH AFRICA";
	} else if (zoneString.contains("Africa/Cairo")) {
		return "🇪🇬 EGYPT";
	} else if (zoneString.contains("Asia/Riyadh")) {
		return "🇸🇦 SAUDI ARABIA";
	} else if (zoneString.contains("Asia/Jakarta")) {
		return "🇮🇩 INDONESIA";
	} else {
		return "🏠 LOCAL TIME";
	}
     }
}