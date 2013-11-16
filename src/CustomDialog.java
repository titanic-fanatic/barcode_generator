// Fri Oct 25 18:07:43 EST 2004
//
// Written by Sean R. Owens, sean at guild dot net, released to the
// public domain.  Share and enjoy.  Since some people argue that it is
// impossible to release software to the public domain, you are also free
// to use this code under any version of the GPL, LPGL, or BSD licenses,
// or contact me for use of another license.
// http://darksleep.com/player

// A very simple custom dialog that takes a string as a parameter,
// displays it in a JLabel, along with two Jbuttons, one labeled Yes,
// and one labeled No, and waits for the user to click one of them.

import javax.swing.JDialog; 
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import java.awt.event.ActionEvent;

public class CustomDialog extends JDialog implements ActionListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = -4133374083823163779L;
	private JPanel myPanel = null;
    private JButton yesButton = null;
    private JButton noButton = null;
    private boolean answer = false;
    public boolean getAnswer() { return answer; }

    public CustomDialog(JFrame frame, boolean modal, String myMessage) {
        super(frame, modal);
        myPanel = new JPanel();
        getContentPane().add(myPanel);
        myPanel.add(new JLabel(myMessage));
        yesButton = new JButton("Yes");
        yesButton.addActionListener(this);
        myPanel.add(yesButton); 
        noButton = new JButton("No");
        noButton.addActionListener(this);
        myPanel.add(noButton);  
        pack();
        setLocationRelativeTo(frame);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(yesButton == e.getSource()) {
            System.err.println("User chose yes.");
            answer = true;
            setVisible(false);
        }
        else if(noButton == e.getSource()) {
            System.err.println("User chose no.");
            answer = false;
            setVisible(false);
        }
    }
    
	public static void main(String[] args) {
			
			//new JSplashScreen(6000, new ImageIcon(new CheckDigitCalculator().getClass().getClassLoader().getResource("images/Splash.png"))).initSplash();
			
			SwingUtilities.invokeLater(new Runnable() {
				/* (non-Javadoc)
				 * @see java.lang.Runnable#run()
				 */
				public void run() {			        
				    //CustomDialog inst = (CustomDialogue) CustomDialog(new JFrame(), false, "Test Message!");
					//inst.setLocationRelativeTo(null);
					//inst.setVisible(true);
					//System.out.println("CheckDigitCalculator Executed");
				}
			});
		}
    
}

