import java.awt.Color;

import java.awt.Graphics;

import java.awt.event.MouseEvent;

import java.awt.event.MouseListener;

import java.util.*;

 

import javax.swing.JComponent;

import javax.swing.JFrame;

 

public class MyAdventure extends JComponent implements MouseListener {

 

                public static String nameOfApp = "Your Adventure!";

               

               

                int screen = 0;

               

                public MyAdventure() {

                                addMouseListener(this);

                }

               

       

        

  

   

               

               

                public void paint(Graphics g) {

                                if (screen == 0){

                                                startingScreen(g);

                                } else if (screen == 1) {

                                                ChuckECheese(g);

                                                screen = 3;

                                } else if (screen == 2) {

                                                TimberCreek(g);

                                                screen = 4;

                                }

                                if (screen == 3){

                                                ChuckECheese(g);

                                }else if (screen == 5) {

                                                Skeeball(g);

                                                screen = 9;

                                                System.out.println(screen);

                                }else if (screen == 7){

                                                Restroom1(g);

                                                screen = 11;

                                                System.out.println(screen);

                                }

                                if (screen == 9){

                                                Skeeball(g);

                                }else if (screen == 13) {

                                                Refuse(g);

                                                System.out.println(screen);

                                }else if (screen == 15){

                                                Accept(g);

                                                screen = 17;

                                                System.out.println(screen);

                                }

                                if (screen == 17){

                                                Accept(g);

                                }else if (screen == 19) {

                                                Play(g);

                                }else if (screen == 23){

                                                Chuck(g);

                                                screen = 25;

                                }

                                if (screen == 25){

                                                Chuck(g);

                                }else if (screen == 27) {

                                                Hospital(g);

                                }else if (screen == 101){

                                                Run(g);

                                }else if (screen == 106) {

                                                Avoided(g);

                                }

                                if(screen == 11) {

                                                Restroom1(g);

                                }else if (screen == 31){

                                                Stall(g);

                                }else if (screen == 33){

                                                Mirror(g);

                                                screen = 35;

                                }

                                if(screen == 35) {

                                                Mirror(g);

                                }else if (screen == 37){

                                                WhiteHouse(g);

                                                screen = 41;

                                }else if (screen == 39){

                                                TrumpTower(g);

                                                screen = 43;

                                }

                                if(screen == 41) {

                                                WhiteHouse(g);

                                }else if (screen == 45){

                                                Putin(g);

                                                screen = 49;

                                }else if (screen == 47){

                                                FoxNews(g);

                                }

                                if(screen == 49) {

                                                Putin(g);

                                }else if (screen == 51){

                                                Russia(g);

                                }

                                if(screen == 43) {

                                                TrumpTower(g);

                                }else if (screen == 63){

                                                Retire(g);

                                                screen = 53;

                                }else if (screen == 37){

                                                WhiteHouse(g);

                                                screen = 41;

                                }

                                if(screen == 53) {

                                                Retire(g);

                                }else if (screen == 55){

                                                Resign(g);

                                                screen = 59;

                                }else if (screen == 57){

                                                Politics(g);

                                                screen = 61;

                                }

                                if(screen == 4) {

                                                TimberCreek(g);

                                }else if (screen == 6){

                                                Dencker(g);

                                                screen = 10;

                                }else if (screen == 8){

                                                Courtyard(g);

                                                screen = 12;

                                }

                                if(screen == 10) {

                                                Dencker(g);

                                }else if (screen == 201){

                                                Assignment(g);

                                }else if (screen == 202){

                                                Home(g);

                                }

                                if(screen == 12) {

                                                Courtyard(g);

                                }else if (screen == 18){

                                                Shelter(g);

                                }else if (screen == 20){

                                                Back(g);

                                }

                               

                               

                               

                }

               

                public void startingScreen(Graphics g){

                                g.setColor(Color.blue);

                                g.drawString("Where would you like to go?", 10, 10);

                               

                                g.drawString("Chuck E Cheese?", 10, 100);

                               

                                g.drawString("Timber Creek?", 10, 200);

                }

               

                public void ChuckECheese(Graphics g){

                                g.setColor(Color.blue);

                               

                                g.drawString("Welcome to Chuck E Cheese! What would you like to do?", 10, 10);

                               

        g.drawString("Play Skeeball.", 15, 100);

                               

                                g.drawString("Go to the Restroom.", 15, 200);

                               

                }

               

                public void TimberCreek(Graphics g){

                                g.setColor(Color.blue);

                               

                                g.drawString("Welcome to TCHS! What would you like to do?", 10, 10);

                               

                                g.drawString("Go into Dencker's room.", 10, 100);

                               

                                g.drawString("Go to the courtyard.", 10, 200);

                               

                }

                public void Dencker(Graphics g){

                                g.setColor(Color.blue);

                               

                                g.drawString("You are alone in the room and you are bored. What do you do?", 10, 10);

                               

                                g.drawString("Work on your assignment.", 10, 100);

                               

                                g.drawString("Go home.", 10, 200);

                               

                }

                public void Home(Graphics g){

                                g.setColor(Color.blue);

                               

                                g.drawString("Dencker sees you leave, but you bribe him with oatmeal cookies. He doesn't say a word and you can go home and relax.", 10, 10);

                               

                }

                public void Assignment(Graphics g){

                                g.setColor(Color.blue);

                               

                                g.drawString("Dencker sees you doing your work as told and decides to give you an A for the year.",10,10);

                               

                }

                public void Courtyard(Graphics g){

                                g.setColor(Color.blue);

                               

                                g.drawString("You forgot there was no school because of the Hurricane today. The hurricane has now arrived. What will you do?", 10, 10);

                               

                                g.drawString("Take shelter from the storm.", 10, 100);

                               

                                g.drawString("Run back home.", 10, 200);

                }

                public void Shelter(Graphics g){

                                g.setColor(Color.blue);

                               

                                g.drawString("While you looked for shelter a sharknado had appeared from the hurricane. It has consumed you and now you are dead.", 10, 10);

                }

                public void Back(Graphics g){

                                g.setColor(Color.blue);

                               

                                g.drawString("You have made it back home. You decide to take advantage of the extra time by working on your Adventure assignment for Comp Sci A", 10, 10);

                                g.drawString("since you havent done anything all week", 10, 25);

                }

                public void Skeeball(Graphics g){

                                g.setColor(Color.blue);

                               

                                g.drawString("You are minding your own buisness playing skeeball and suddenly a mysterious man in an overcoat challenges you to a match! What would you like to do?", 10, 10);

                               

                                g.drawString("Politely refuse.", 10, 100);

                               

                                g.drawString("Accept the challenge.", 10, 200);

                }

               

                public void Restroom1(Graphics g){

                                g.setColor(Color.blue);

                               

                                g.drawString("You are in the restroom! What would you like to do?", 10, 10);

                               

                                g.drawString("Investiagte the noise in the stall.", 10, 100);

                               

                                g.drawString("Look in the mirror.", 10, 200);

                }

               

                public void Stall(Graphics g){

                                g.setColor(Color.blue);

                               

                                g.drawString("The toilet explodes and the shrapnel kills you.", 10, 10);

 

                }

               

                public void Mirror(Graphics g){

                                g.setColor(Color.blue);

                               

                                g.drawString("You remember you are Donald Trump after looking at yourself. What will you do next?", 10, 10);

                               

                                g.drawString("Go to the White House.", 10, 100);

                               

                                g.drawString("Go to Trump Tower.", 10, 200);

                }

                public void TrumpTower(Graphics g){

                                g.setColor(Color.blue);

                               

                                g.drawString("You realize that your previous life was so much better. What will you do?", 10, 10);

                               

                                g.drawString("Resign as president.", 10, 100);

                               

                                g.drawString("Go to the White House.", 10, 200);

                }

                public void Resign(Graphics g){

                                g.setColor(Color.blue);

                               

                                g.drawString("You resign causing mass confusion on all sides. What's your next move?", 10, 10);

                               

                                g.drawString("Retire and live happily.", 10, 100);

                               

                                g.drawString("Continue as a political figure for right-winged politics.", 10, 200);

                }

                public void Retire(Graphics g){

                                g.setColor(Color.blue);

                               

                                g.drawString("You live out your days happily ever after.", 10, 10);

                }

                public void Politics(Graphics g){

                                g.setColor(Color.blue);

                               

                                g.drawString("You are a political outcast after abandoning your base. No one listens to you. You return to your prior life fully.", 10, 10);

                }

               

                public void WhiteHouse(Graphics g){

                                g.setColor(Color.blue);

                               

                                g.drawString("You are back home at the White House. What will you do now?", 10, 10);

                               

                                g.drawString("Call your buddy Putin.", 10, 100);

                               

                                g.drawString("Watch Fox News.", 10, 200);

                }

               

                public void Putin(Graphics g){

                                g.setColor(Color.blue);

                               

                                g.drawString("Putin has asked you to come to Russia to celebrate how bigly your friendship is.", 10, 10);

                               

                                g.drawString("Go to Putin.", 10, 100);

                               

                }

                public void Russia(Graphics g){

                                g.setColor(Color.blue);

                               

                                g.drawString("You are at Putin's home. He comes in and goes in for a hug.", 10, 10);

                                g.drawString("Suddenly a school of flying baracuda come in and kill you both.", 10, 25);

                               

                }

                public void FoxNews(Graphics g){

                                g.setColor(Color.blue);

                               

                                g.drawString("On your way to the living room you trip and fall over the railings, killing you and your presidency.", 10, 10);

                               

                }

                public void Refuse (Graphics g){

                                g.setColor(Color.blue);

                               

                                g.drawString("The strange man was none other than Kim Jong Un. He decides to nuke the world, killing you, due to his inability to cope with rejection.", 10, 10);

                               

                }

                public void Accept(Graphics g){

                                g.setColor(Color.blue);

                               

                                g.drawString("The strange man was none other than Kim Jong Un. You both agree to play a game. Winner escapes with their life. What move will you make?", 10, 10);

                               

                                g.drawString("Play the game?", 10, 100);

                               

                                g.drawString("Chuck skeeballs at Kim Jong Un", 10, 200);

                               

                }

                public void Play(Graphics g){

                                g.setColor(Color.blue);

                               

                                g.drawString("Kim Jong Un is secretly the World Champion Skeeball player. You are defeated and he kills you with his ego.", 10, 10);

                               

                }

                public void Chuck(Graphics g){

                                g.setColor(Color.blue);

                               

                                g.drawString("You have caught Kim Jong Un by suprise. He lays on the floor unconcious. What will you do?", 10, 10);

                               

                                g.drawString("Take him to the hospital.", 10, 100);

                               

                                g.drawString("Run for your life!", 10, 200);

                               

                }

                public void Hospital(Graphics g){

                                g.setColor(Color.blue);

                               

                                g.drawString("Kim Jong Un graciously thanks you for saving his life. You two become BFFs and rule NK together.", 10, 10);

                               

                }

                public void Run(Graphics g){

                                g.setColor(Color.blue);

                               

                                g.drawString("Kim Jong Un regains consiousness while you run. He shots you dead.", 10, 10);

                                g.drawString("A single tear drops from his eye while doing so. He believed you to be best friend material.", 10, 25);

                               

                }

                public void Avoided(Graphics g){

                                g.setColor(Color.red);

                               

                                g.drawString("Kim Jong Un attempts to shoot you dead, but it misses you.", 10, 10);

                                g.drawString("You are able to go back home and live out your life, but have repressed memories about that tramatic experience", 10, 25);

                                g.drawString("that make you go insane.", 10, 40);

                }

                public void backfire(Graphics g){

                                g.setColor(Color.red);

                               

                                g.drawString("Dencker see you leaving and you feel rather frazzeled by the experience.", 10, 10);

                                g.drawString("Dencker goes super saiyan and eradicates you from existence.", 10, 25);

                                g.drawString("You feel great pain while the altercation occurs.", 10, 40);

                }

                @Override

                public void mouseClicked(MouseEvent e) {

                                // TODO Auto-generated method stub

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

                                if (screen == 3){

                                if (e.getX() > 10 && e.getX() < 100 && e.getY() > 10 && e.getY() < 100){

                                                screen = 5;

                                }

                                if (e.getX() > 10 && e.getX() < 100 && e.getY() > 101 && e.getY() < 200) {

                                                screen = 7;

                                }

                                repaint();

                                }

                                if (screen == 9){

                                if (e.getX() > 10 && e.getX() < 100 && e.getY() > 10 && e.getY() < 100){

                                                screen = 13;

                                }              

                                if (e.getX() > 10 && e.getX() < 100 && e.getY() > 101 && e.getY() < 200) {

                                                screen = 15;

                                }

                                repaint();

                                }

                                if (screen == 17){

                                if (e.getX() > 10 && e.getX() < 100 && e.getY() > 10 && e.getY() < 100){

                                                screen = 19;

                                }

                                if (e.getX() > 10 && e.getX() < 100 && e.getY() > 101 && e.getY() < 200) {

                                                screen = 23;

                                }

                                repaint();

                                }

                                if (screen == 25){

                                if (e.getX() > 10 && e.getX() < 100 && e.getY() > 10 && e.getY() < 100){

                                                screen = 27;

                                                System.out.println(screen);

                                }

                                if (e.getX() > 10 && e.getX() < 100 && e.getY() > 101 && e.getY() < 200)  {

                                                screen = 101;

                                               

                                                System.out.println(screen);

                                }

                                if (e.getX() > 10 && e.getX() < 100 && e.getY() > 101 && e.getY() < 200 && screen == 106){

                                                screen = 106;

                                System.out.println(screen);

                                }              

                                repaint();

                                }

                                if (screen == 11){

                                if (e.getX() > 10 && e.getX() < 100 && e.getY() > 10 && e.getY() < 100){

                                                screen = 31;

                                }

                                if (e.getX() > 10 && e.getX() < 100 && e.getY() > 101 && e.getY() < 200) {

                                                screen = 33;

                                }

                                repaint();

                                }

                                if (screen == 35){

                                if (e.getX() > 10 && e.getX() < 100 && e.getY() > 10 && e.getY() < 100){

                                                screen = 37;

                                }

                                if (e.getX() > 10 && e.getX() < 100 && e.getY() > 101 && e.getY() < 200) {

                                                screen = 39;

                                }

                                repaint();

                                }

                                if (screen == 41){

                                if (e.getX() > 10 && e.getX() < 100 && e.getY() > 10 && e.getY() < 100){

                                                screen = 45;

                                }

                                if (e.getX() > 10 && e.getX() < 100 && e.getY() > 101 && e.getY() < 200) {

                                                screen = 47;

                                }

                                repaint();

                                }

                                if (screen == 49){

                                if (e.getX() > 10 && e.getX() < 100 && e.getY() > 10 && e.getY() < 100){

                                                screen = 51;

                                }

                                repaint();

                                }

                                if (screen == 53){

                                if (e.getX() > 10 && e.getX() < 100 && e.getY() > 10 && e.getY() < 100){

                                                screen = 55;

                                }

                                if (e.getX() > 10 && e.getX() < 100 && e.getY() > 101 && e.getY() < 200) {

                                                screen = 57;

                                }

                                repaint();

                                }

                                if (screen == 4){

                                if (e.getX() > 10 && e.getX() < 100 && e.getY() > 10 && e.getY() < 100){

                                                screen = 6;

                                }

                                if (e.getX() > 10 && e.getX() < 100 && e.getY() > 101 && e.getY() < 200) {

                                                screen = 8;

                                }

                                repaint();

                                }

                                if (screen == 43){

                                if (e.getX() > 10 && e.getX() < 100 && e.getY() > 10 && e.getY() < 100){

                                                screen = 63;

                                }

                                if (e.getX() > 10 && e.getX() < 100 && e.getY() > 101 && e.getY() < 200) {

                                                screen = 37;

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

                                if (screen == 12){

                                if (e.getX() > 10 && e.getX() < 100 && e.getY() > 10 && e.getY() < 100){

                                                screen = 18;

                                }

                                if (e.getX() > 10 && e.getX() < 100 && e.getY() > 101 && e.getY() < 200) {

                                                screen = 20;

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

                                frame.add(new MyAdventure());

                                frame.setSize(1200, 500);

                                frame.setVisible(true);

                                frame.getContentPane().setBackground(Color.white);

                }

 

}