/*
Java Swing, 2nd Edition
By Marc Loy, Robert Eckstein, Dave Wood, James Elliott, Brian Cole
ISBN: 0-596-00408-7
Publisher: O'Reilly 
*/
// SplashScreen.java
//A simple application to show a title screen in the center of the screen
//for the amount of time given in the constructor. This class includes
//a sample main() method to test the splash screen, but it's meant for use
//with other applications.
//

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class JSplashScreen extends javax.swing.JWindow {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int duration;
	private ImageIcon splashImage;

  public JSplashScreen(int d, ImageIcon si) {
    duration = d;
    splashImage = si;
  }

  // A simple little method to show a title screen in the center
  // of the screen for the amount of time given in the constructor
  public void initSplash() {
	  
    JPanel content = (JPanel) getContentPane();
    setBackground(new java.awt.Color(244, 244, 244, 0));
    content.setBackground(new java.awt.Color(244, 244, 244, 0));
    
    // Set the window's bounds, centering the window
    int width = 660;
    int height = 500;
    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (screen.width - width) / 2;
    int y = (screen.height - height) / 2;
    setBounds(x, y, width, height);

    // Build the splash screen
    JLabel label = new JLabel(splashImage);
    //JLabel copyrt = new JLabel("Copyright 2002, O'Reilly & Associates",
    //    JLabel.CENTER);
    //copyrt.setFont(new Font("Sans-Serif", Font.BOLD, 12));
    content.add(label, BorderLayout.CENTER);
    //content.add(copyrt, BorderLayout.SOUTH);
    //Color grey = new Color(96, 98, 100, 255);
    //Color black = new Color(0, 0, 0, 255);
    //content.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, black, grey, black, grey));
	
	// Display it
    setVisible(true);
    System.out.println("JSplashScreen Executed");

    // Wait a little while, maybe while loading resources
    try {
    	Thread.sleep(duration);
    } catch (Exception e) {
    }

    setVisible(false);

  }

  public void showSplashAndExit() {
    initSplash();
    System.exit(0);
  }

  public void main(String[] args) {
	  
	  // TODO Auto-generated method stub
	  // Throw a nice little title page up on the screen first
	  JSplashScreen splash = new JSplashScreen(6000, new ImageIcon(getClass().getClassLoader().getResource("images/Splash.png")));
	  // Normally, we'd call splash.showSplash() and get on with the program.
	  // But, since this is only a test...
	  splash.initSplash();
  }
}