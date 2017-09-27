package derrickvaradventure;
//Derrick Var period 4
	
	import java.awt.Color;
	import java.awt.Graphics;
	import java.awt.event.MouseEvent;
	import java.awt.event.MouseListener;

	import javax.swing.JComponent;
	import javax.swing.JFrame;

	public class DerricksAdventure extends JComponent implements MouseListener {

		public static String nameOfApp = "Your Adventure!";
		
		int screen = 0;
		public DerricksAdventure() {
			addMouseListener(this);
		}
		
		public void paint(Graphics g) {
			if (screen == 0) {
				startingScreen(g);
			} else if (screen == 1) {
				NorthKorea(g);
			} else if (screen == 2) {
				Hawaii(g);
			
			}
			if (screen == 1) {
				startingScreen(g);
			} else if (screen == 3) {
				LiberatethePeople(g);
			} else if (screen == 4) {
				TakeatourofNorthKorea(g);
				
		}
		}
		
	
				public void LiberatethePeople(Graphics g) {
			// TODO Auto-generated method stub
			
		}

				public void TakeatourofNorthKorea(Graphics g) {
			// TODO Auto-generated method stub
			
		}

				public void startingScreen(Graphics g) {
			
			g.setColor(Color.CYAN);
			g.drawString("Where would you like to go?", 10, 30);
			g.drawString("North Korea", 10, 100);
			g.drawString("Hawaii" , 200, 100);
			}
		
	public void NorthKorea (Graphics g) {
		g.setColor(Color.CYAN);
		g.drawString("You are in North Korea, Best Korea... You can now either take a tour Or Liberate the people ", 10, 30);
		g.drawString("Liberate the People", 10, 100);
		g.drawString("Take a tour of North Korea" , 200, 100);
	
	}
	public void LiberateThePeople (Graphics g) {
		g.drawString ("You find that all of the families do not trust you, although you are trying to help..", 10, 30);
		g.drawString("You try to convince them that you're here to help", 10, 100); 
		g.drawString("You ask if it's because you're are of a different skin color", 200, 100);		
	}
	
	
	public void Hawaii (Graphics g) {
		g.setColor(Color.CYAN);
		g.drawString("You are in Hawaii", 10, 30);
		
	}
		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println(e.getX() + " " + e.getY());
			if (screen == 0) {
			if (e.getX() > 10 && e.getX() < 100 && e.getY() > 90 && e.getY() < 110) {
				screen = 1;
			}
			if (e.getX() > 200 && e.getX() < 3000 && e.getY() > 90 && e.getY() < 110) {
				screen = 2;
			}
			repaint();
			}
		
		}
		

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		public static void main(String[] args) {
			JFrame frame = new JFrame(nameOfApp);
			frame.getDefaultCloseOperation();
			frame.add(new DerricksAdventure());
			frame.setSize(500, 500);
			frame.setVisible(true);
			frame.getContentPane().setBackground(Color.BLACK);
		}

	}


