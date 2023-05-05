import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyEventDemo extends JPanel implements KeyListener {
	
	// Declare class vairables 
	private int x = 120, y = 100;
	private ImageIcon imgRobot; 
	private final int WIDTH = 300, HEIGHT = 300;; 
	
	public static void main (String[] args) {
		
		new KeyEventDemo();
	}
	
	public KeyEventDemo() {
		// Intiialize ImageIcon Object 
		imgRobot = new ImageIcon("iRobot.png");
		
		// set the properties of the JPanel 
		setLayout(null);
		addKeyListener(this);
		setFocusable(true);
		requestFocus();
		
		// Declare and initialize JFrame 
		JFrame frame = new JFrame();
		frame.setTitle("KeyEvent Demo");
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(this);
		frame.setVisible(true);
	}
	
	public void keyPressed(KeyEvent e) {
		// User clicks the left arrow key 
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			x-=10;
		}
		
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			x += 10;
		}
		
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			y -= 10;
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			y += 10;
		}
		repaint();
	}
	
	public void keyReleased (KeyEvent e) {}
	public void keyTyped (KeyEvent e) {}
	
	public void paint (Graphics g) {
		
		// Clear the drawing canvas 
		super.paint(g);
		
		// Declare and initialize a Graphics2D object 
		Graphics2D g2 = (Graphics2D) g;
		
		// Draw the image on the panel 
		g2.drawImage(imgRobot.getImage(),x,y,this);
	}
	
}