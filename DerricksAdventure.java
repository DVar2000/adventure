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
				screen = 3;
			} else if (screen == 2) {
				Hawaii(g);
				screen = 4;
			}
			
			
			if (screen == 3) { 
				NorthKorea(g) ;
			} else if (screen == 5) {
				LiberateThePeople(g);
				screen = 9;
			} else if (screen == 7) {
				TakeatourofNorthKorea(g);
				screen = 11;
			}
			if (screen == 11) {
				TakeatourofNorthKorea(g);
				screen = 37;
			if (screen == 4) {
					Hawaii (g);
				}else if (screen == 6) {
					Hitthebeaches (g);
					screen = 10 ;
				}else if (screen == 8)
					Enditallviavolcano (g);
				screen = 12;
				
			if (screen == 9){
			
			}else if (screen == 13)
				Thetruthenlightensthem (g);
			System.out.println(screen);
			}else if (screen == 15) {
				
			}
		}
			
		//screen 0
			public void startingScreen(Graphics g) {
			g.setColor(Color.CYAN);
			g.drawString("Where would you like to go?", 10, 30);
			g.drawString("North Korea", 10, 100);
			g.drawString("Hawaii" , 10, 200);
			}
		//screen 1
			public void NorthKorea (Graphics g) {
			g.setColor(Color.CYAN);
			g.drawString("You are in North Korea... You can now either take a tour Or Liberate the people ", 10, 30);
			g.drawString("Liberate the People", 10, 100);
			g.drawString("Take a tour of North Korea" , 10, 200);
	
	}
			//screen 2
			public void Hawaii (Graphics g) {
				g.setColor(Color.CYAN);
			g.setColor(Color.CYAN);
		    g.drawString("You are in Hawaii, and the first thing you would like to do is...", 10, 30);
		    g.drawString("Hit the beaches", 10, 100);
		    g.drawString("End it all via death by volcano", 10, 200);
		
	}
			public void Hitthebeaches (Graphics g) {
				
			}
			public void Enditallviavolcano (Graphics g) {
				g.drawString("You traveled on foot to the largest active volcano in Hawaii, and as you look down into the scorching magma....", 10, 20);
			}
			
			public void LiberateThePeople (Graphics g) {
				g.setColor(Color.CYAN);
				g.drawString ("You find that all of the families do not trust you, although you are trying to help..", 10, 30);
			g.drawString("You try to convince them that you are here to help", 10, 100); 
			g.drawString("you give up and try to assasinate Kam John Um", 10, 200);		
	}
			
			public void TakeatourofNorthKorea (Graphics g) {
				g.setColor(Color.CYAN);
				g.drawString("You visit the many 'attractions' made for tourists ", 10, 20);
	}
			
			public void Youtrytoconvinvethemyouareheretohelp (Graphics g ) {
				g.setColor(Color.CYAN);
				g.drawString("You tell them everything and...", 10, 30);
			g.drawString(" the truth enlightens them", 10, 100);
			g.drawString("They do not belive you and calls the authorities",10,y);,
	}	
			public void Thetruthenlightensthem (Graphics g) {
				
			}
			
		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println(e.getX() + " " + e.getY());
			if (screen == 0){
				
				if (e.getX() > 10 && e.getX() < 100 && e.getY() > 10 && e.getY() < 100) {
	
					screen = 1;
	
				}
	
				if (e.getX() > 10 && e.getX() < 100 && e.getY() > 101 && e.getY() < 200) {
	
					screen = 2;
	
				}
	
				repaint();
	
			}
			if (screen == 3 ) {
				if (e.getX() > 10 && e.getX() < 100 && e.getY() > 10 && e.getY() < 100){
						
					screen = 5;
				}
				if (e.getX() > 10 && e.getX() < 100 && e.getY() > 101 && e.getY() < 200) {
							
					screen = 7;
				
					}
					repaint();
			}
			if (screen == 9) {
				
				if (e.getX() > 10 && e.getX() < 114 && e.getY() > 90 && e.getY() < 100 ) { 
					screen = 13;
				}
				if (e.getX() > 10 && e.getX() < 100 && e.getY() > 101 && e.getY() < 200) {
					
			screen = 15;
				}
			
						repaint();
				}
			if (screen == 4){
				
				if (e.getX() > 10 && e.getX() < 100 && e.getY() > 10 && e.getY() < 100){
	
					screen = 6;
	
				}
	
				if (e.getX() > 10 && e.getX() < 100 && e.getY() > 101 && e.getY() < 200) {
	
					screen = 12;
	
				}
				
	
				repaint();
			}
				if (screen == 10){
					
					if (e.getX() > 10 && e.getX() < 100 && e.getY() > 10 && e.getY() < 100){
		
						screen = 201;
		
					}
		
					if (e.getX() > 10 && e.getX() < 100 && e.getY() > 101 && e.getY() < 200) {
		
						screen = 202;
		
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
