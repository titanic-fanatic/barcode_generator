import info.clearthought.layout.TableLayout;

import javax.swing.JDialog; 

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;


import java.awt.event.ActionEvent;


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
public class ConverterDialog extends JDialog {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 162558929205196209L;
	private JPanel converterDialog = null;
    private JButton yesButton = null;
    private JButton noButton = null;
    private boolean answer = false;
	private TableLayout converterDialogPanelLayout;
	private int UPCTypeSwitch;
	private JRadioButton upcaRadioButton;
	private JRadioButton upceRadioButton;
	private JLabel convertField1Label;
	private JLabel convertField2Label;
	private JTextField convertField1TextField;
	private JTextField convertField2TextField;
	private JPopupMenu jPopupMenu;
	
	public static final int UPCA = 2;
	public static final int UPCE = 5;
	public static final int EAN8 = 1;
	public static final int EAN13 = 3;
	public static final int QRCODE = 4;
	public static final int CODE39 = 6;
	
    public boolean getAnswer() { return answer; }

    public ConverterDialog(final JFrame frame, boolean modal, int type) {
    	
        super(frame, modal);
        
        this.UPCTypeSwitch = type;
        
        this.setPreferredSize(new Dimension(450, 255));
        this.setTitle("UPC-A/E Converter");
        
        converterDialog = new JPanel();
        getContentPane().add(converterDialog);
        
        double converterDialogPanelSize[][] = {{7.0, 85.0, 7.0, 20.0, 7.0, 45.0, 7.0, 20.0, 7.0, 45.0, TableLayout.FILL, 7.0, TableLayout.FILL, 7.0}, // COLUMNS
        		                               {7.0, 30.0, 15.0, 30.0, 15.0, 30.0, 7.0, 30.0, 15.0, 30.0, 7.0}}; //ROWS
        converterDialogPanelLayout = new TableLayout(converterDialogPanelSize);
        converterDialog.setLayout(converterDialogPanelLayout);
        
        JLabel converterTitleLabel = new JLabel("UPC-A/E Converter");
        converterTitleLabel.setFont(new Font("Calibri",1,24));
        converterDialog.add(converterTitleLabel, "1, 1, 9, 1, L, F");
        
        JLabel convertFromLabel = new JLabel("Convert from:");
        convertFromLabel.setFont(new Font("Calibri", 1, 14));
        converterDialog.add(convertFromLabel, "1, 3, L, C");
        
        String labelString;
		if (UPCTypeSwitch == UPCA){
        	
        	labelString = "UPC-A: ";
        	
        }
        else{
        	
        	labelString = "UPC-E: ";
        	
        }
        
        convertField1Label = new JLabel(labelString);
        convertField1Label.setFont(new Font("Calibri", 1, 14));
        converterDialog.add(convertField1Label, "1, 5, 4, 5, R, C");
        
        if (UPCTypeSwitch == UPCA){
        	
        	labelString = "Equivalent UPC-A: ";
        	
        }
        else{
        	
        	labelString = "Equivalent UPC-E: ";
        	
        }
        
        convertField2Label = new JLabel(labelString);
        convertField2Label.setFont(new Font("Calibri", 1, 14));
        converterDialog.add(convertField2Label, "1, 7, 4, 7, R, C");
        
        JLabel upcaLabel = new JLabel("UPC-A");upcaLabel.setFont(new Font("Calibri", 0, 14));
        converterDialog.add(upcaLabel, "5, 3, L, C");
        
        JLabel upceLabel = new JLabel("UPC-E");
        upceLabel.setFont(new Font("Calibri", 0, 14));
        converterDialog.add(upceLabel, "9, 3, L, C");
        
        ButtonGroup buttonGroup = new ButtonGroup();
        
        upcaRadioButton = new JRadioButton();
        upcaRadioButton.addActionListener(radioButtonActionPerformed());
        buttonGroup.add(upcaRadioButton);
        
        upceRadioButton = new JRadioButton();
        upceRadioButton.addActionListener(radioButtonActionPerformed());
        buttonGroup.add(upceRadioButton);
        
        if (UPCTypeSwitch == UPCE){
        	
        	upceRadioButton.setSelected(true);
        	convertField1Label.setText("UPC-E: ");
        	convertField2Label.setText("Equivalent UPC-A: ");
        	
        }
        else{
        	
        	upcaRadioButton.setSelected(true);
        	convertField1Label.setText("UPC-A: ");
        	convertField2Label.setText("Equivalent UPC-E: ");
        	
        }
        converterDialog.add(upcaRadioButton, "3, 3, C, C");
        converterDialog.add(upceRadioButton, "7, 3, C, C");
        
        JTextFieldLimit convertField1TextFieldDocument = new JTextFieldLimit(12);
    	convertField1TextField = new JTextField();
        convertField1TextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
        convertField1TextField.setFont(new Font("Calibri", 0, 14));
        convertField1TextField.setDocument(convertField1TextFieldDocument);
    	convertField1TextField.setText("");
    	convertField1TextField.addMouseListener(new rightClickContextListener(convertField1TextField));
    	convertField1TextField.addKeyListener(fieldKeyListener());
    	converterDialog.add(convertField1TextField, "5, 5, 12, 5, F, C");
        
        JTextFieldLimit convertField2TextFieldDocument = new JTextFieldLimit(8);
    	convertField2TextField = new JTextField();
        convertField2TextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
        convertField2TextField.setFont(new Font("Calibri", 0, 14));
        convertField2TextField.setDocument(convertField2TextFieldDocument);
    	convertField2TextField.setText("");
    	convertField2TextField.addMouseListener(new rightClickContextListener(convertField2TextField));
    	convertField2TextField.addKeyListener(fieldKeyListener());
        converterDialog.add(convertField2TextField, "5, 7, 12, 7, F, C");
        
        JButton convertButton = new JButton();
        convertButton.setFont(new Font("Calibri", 1, 14));
        convertButton.setText("Convert");
        convertButton.addActionListener(convertButtonActionPerformed());
        converterDialog.add(convertButton, "10, 9, F, C");
        
        final JDialog jDialog = this;
        
        JButton doneButton = new JButton();
        doneButton.setFont(new Font("Calibri", 1, 14));
        doneButton.setText("Done");
        doneButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				jDialog.dispose();
				
			}});
        converterDialog.add(doneButton, "12, 9, F, C");
        
        pack();
        setLocationRelativeTo(frame);
        setVisible(true);
        
    }

    private ActionListener radioButtonActionPerformed() {
    	
    	return new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if (upcaRadioButton.isSelected()){
					
					convertField1Label.setText("UPC-A: ");
					convertField2Label.setText("Equivalent UPC-E: ");
					convertField1TextField.setDocument(new JTextFieldLimit(12));
					convertField1TextField.setText("");
					convertField2TextField.setDocument(new JTextFieldLimit(8));
					convertField2TextField.setText("");
					
				}
				else{
					
					convertField1Label.setText("UPC-E: ");
					convertField2Label.setText("Equivalent UPC-A: ");
					convertField1TextField.setDocument(new JTextFieldLimit(8));
					convertField1TextField.setText("");
					convertField2TextField.setDocument(new JTextFieldLimit(12));
					convertField2TextField.setText("");
					
				}
				
			}
			
    	};
    	
	}
    
    private KeyListener fieldKeyListener() {
    	
    	return new KeyListener(){

			@Override
			public void keyPressed(KeyEvent evt) {
				
				int key = evt.getKeyCode();
				
				if (key == KeyEvent.VK_ENTER){
					
					if (upcaRadioButton.isSelected()){
						
						convertUPCA();
						
					}
					else{
						
						convertUPCE();
						
					}
					
				}
				
			}
	
			@Override
			public void keyReleased(KeyEvent evt) {
				
				
				
			}
	
			@Override
			public void keyTyped(KeyEvent evt) {
				
				
				
			}
			
    	};
    	
    }

    private ActionListener convertButtonActionPerformed() {
    	
    	return new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if (upcaRadioButton.isSelected()){
					
					convertUPCA();
					
				}
				else{
					
					convertUPCE();
					
				}
				
			}
			
    	};
    	
	}
    
    private void convertUPCA(){
    	
    	String upcaString = convertField1TextField.getText();
    	String upceString = "";
		int upcaStringLength = upcaString.length();
    	
    	if (upcaStringLength >= 11 && upcaStringLength < 13){
    		
    		switch (upcaStringLength){
    			
    		case 11:
    			
    			String checkDigit = calculateUPCACheckDigit(upcaString);
    			upcaString = upcaString + checkDigit;
    			
    			convertField1TextField.setDocument(new JTextFieldLimit(12));
				convertField1TextField.setText(upcaString);
    			convertUPCA();
    			
    			break;
    			
    		case 12:
    			
    			String nSystem = upcaString.substring(0,1);
    			String mCode = upcaString.substring(1,6);
    			String pCode = upcaString.substring(6,11);
    			String cDigit = upcaString.substring(11,12);
    			
    			System.out.println("nSystem: " + nSystem + "\nmCode: " + (!mCode.substring(2,5).equals("0")) + "\npCode: " + pCode + "\ncDigit: " + cDigit);
    			
    			if ((mCode.substring(2,5).equals("000") || mCode.substring(2,5).equals("100") || mCode.substring(2,5).equals("200")) && 
    				Integer.parseInt(pCode) >= 0 && Integer.parseInt(pCode) <= 999 && (nSystem.equals("0") || nSystem.equals("1"))){
    				
    				upceString = nSystem + mCode.substring(0,2) + pCode.substring(2,5) + mCode.substring(2,3) + cDigit;
    				
    				convertField2TextField.setDocument(new JTextFieldLimit(8));
					convertField2TextField.setText(upceString);
    				
    			}
    			else if (mCode.substring(3,5).equals("00") && Integer.parseInt(pCode) >= 0 && Integer.parseInt(pCode) <= 99 && (nSystem.equals("0") || nSystem.equals("1"))){
    				
    				upceString = nSystem + mCode.substring(0,3) + pCode.substring(3,5) + "3" + cDigit;
    				
    				convertField2TextField.setDocument(new JTextFieldLimit(8));
					convertField2TextField.setText(upceString);
    				
    			}
    			else if (mCode.substring(4,5).equals("0") && Integer.parseInt(pCode) >= 0 && Integer.parseInt(pCode) <= 9 && (nSystem.equals("0") || nSystem.equals("1"))){
    				
    				upceString = nSystem + mCode.substring(0,4) + pCode.substring(4,5) + "4" + cDigit;
    				
    				convertField2TextField.setDocument(new JTextFieldLimit(8));
					convertField2TextField.setText(upceString);
    				
    			}
    			else if (!mCode.substring(4,5).equals("0") && Integer.parseInt(pCode) >= 5 && Integer.parseInt(pCode) <= 9 && (nSystem.equals("0") || nSystem.equals("1"))){
    				
    				upceString = nSystem + mCode.substring(0,5) + pCode.substring(4,5) + cDigit;
    				
    				convertField2TextField.setDocument(new JTextFieldLimit(8));
					convertField2TextField.setText(upceString);
    				
    			}
    			else{
    				
    				JOptionPane.showMessageDialog(this, "The UPC-A you entered does not have a UPC-E equivalent.\nPlease try again!", "UPC Error", JOptionPane.ERROR_MESSAGE);
    				
    			}
    			
    			break;
    			
    		}
    		
    	}
    	else{
    		
    		JOptionPane.showMessageDialog(this, "The UPC-A you have entered is the wrong length\nPlease enter 11 or 12 digits for a UPC-A\n\nEntered: " + upcaStringLength, "UPC-A Length Error", JOptionPane.ERROR_MESSAGE);
    		
    	}
    	
    }
    
    private void convertUPCE(){
    	
    	String upceString = convertField1TextField.getText();
    	int upceStringLength = upceString.length();
    	String upcaString = "";
    	
    	if (upceStringLength >= 6 && upceStringLength < 9){
    		
    		switch (upceStringLength){
    		
    		case 6:
    			
    			String cDigit;
    			
    			if (upceString.substring(5, 6).equals("0") || upceString.substring(5, 6).equals("1") || upceString.substring(5, 6).equals("2")){
    				
    				upcaString = "0" + upceString.substring(0, 2) + upceString.substring(5, 6) + "0000" + upceString.substring(2, 5);
    				
    			}
    			else if (upceString.substring(5, 6).equals("3")){
    				
    				upcaString = "0" + upceString.substring(0, 3) + "00000" + upceString.substring(3, 5);
    				
    			}
    			else if (upceString.substring(5, 6).equals("4")){
    				
    				upcaString = "0" + upceString.substring(0, 4) + "00000" + upceString.substring(4, 5);
    				
    			}
    			else if (upceString.substring(5, 6).equals("5") || upceString.substring(5, 6).equals("6") || upceString.substring(5, 6).equals("7") || upceString.substring(5, 6).equals("8") || upceString.substring(5, 6).equals("9")){
    				
    				upcaString = "0" + upceString.substring(0, 5) + "0000" + upceString.substring(5, 6);
    				
    			}
    			
    			cDigit = calculateUPCACheckDigit(upcaString);
				
				upcaString = upcaString + cDigit;
				upceString = "0" + upceString + cDigit;
				
				convertField1TextField.setDocument(new JTextFieldLimit(8));
				convertField1TextField.setText(upceString);
				convertField2TextField.setDocument(new JTextFieldLimit(12));
				convertField2TextField.setText(upcaString);
    			
    			break;
    		
    		case 7:
    			
    			upceString = upceString.substring(1,7);
    			
    			convertField1TextField.setDocument(new JTextFieldLimit(8));
				convertField1TextField.setText(upceString);
    			convertUPCE();
    			
    			break;
    			
    		case 8:
    			
    			upceString = upceString.substring(1,7);
    			
    			convertField1TextField.setDocument(new JTextFieldLimit(8));
				convertField1TextField.setText(upceString);
    			convertUPCE();
    			
    			break;
    			
    		}
    		
    	}
    	else{
    		
    		JOptionPane.showMessageDialog(this, "The UPC-E you have entered is the wrong length\nPlease enter 6, 7 or 8 digits for a UPC-E\n\nEntered: " + upceStringLength, "UPC-E Length Error", JOptionPane.ERROR_MESSAGE);
    		
    	}
    	
    }
    
    private String calculateUPCACheckDigit(String upcaString){
    	
    	String checkDigit = "";
    	String[] upcaArray = upcaString.split("");
    	int evenSUM = 0;
    	int oddSUM = 0;
    	int grandSUM = 0;
    	int nearestTen = 0;
    	
    	for (int i = 1; i < upcaArray.length; i++){
    		
    		int currentDigit = Integer.parseInt(upcaArray[i]);
    		
    		if (i % 2 == 0){
    			
    			evenSUM = evenSUM + currentDigit;
    			
    		}
    		else{
    			
    			oddSUM = oddSUM + (3 * currentDigit);
    			
    		}
    		
    		grandSUM = evenSUM + oddSUM;
    		
    		if (grandSUM % 10 != 0){
    			
    			int tempNumber = (int) ((grandSUM/10) + 1);
    			nearestTen = tempNumber * 10;
    			checkDigit = "" + (nearestTen - grandSUM);
    			
    		}
    		else{
    			
    			checkDigit = "" + 0;
    			
    		}
    		
    	}
    	
    	return checkDigit;
    	
    }
    
    private String calculateUPCECheckDigit(String upceString){
    	
    	String checkDigit = "";
    	String nSystem = upceString.substring(0, 1);
    	String upce = upceString.substring(1,7);
    	
    	if (upce.substring(5, 6).equals("0") || upce.substring(5, 6).equals("1") || upce.substring(5, 6).equals("2")){
    		
    		
    		
    	}
    	
    	return checkDigit;
    	
    }
    
    class rightClickContextListener extends MouseAdapter {
    	
    	private JTextField textField;

		rightClickContextListener(JTextField field){
    		
    		this.textField = field;
    		
    	}
    	
	    public void mousePressed(MouseEvent e) {
	    	
	        showPopup(e);
	        
	    }

	    public void mouseReleased(MouseEvent e) {
	    	
	        showPopup(e);
	        
	    }

	    private void showPopup(MouseEvent e) {
	    	
	        if (e.isPopupTrigger()) {
	        	
	        	jPopupMenu = getRightClickContext(this.textField);
	            jPopupMenu.show(e.getComponent(), e.getX(), e.getY());
	            
	        }
	        
	    }
	    
	}
    
    private JPopupMenu getRightClickContext(final JTextField jTextFieldRef) {
    	
    	jPopupMenu = new JPopupMenu();
    	
    	JMenuItem selectAllMenuItem = new JMenuItem();
    	selectAllMenuItem.setFont(new Font("Calibri", 1, 14));
    	selectAllMenuItem.setText("Select All");
    	selectAllMenuItem.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				jTextFieldRef.selectAll();
				
			}});
    	jPopupMenu.add(selectAllMenuItem);
    	
    	JMenuItem copyMenuItem = new JMenuItem();
    	copyMenuItem.setFont(new Font("Calibri", 1, 14));
    	copyMenuItem.setText("Copy");
    	copyMenuItem.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				jTextFieldRef.copy();
				
			}});
    	jPopupMenu.add(copyMenuItem);
    	
    	JMenuItem pasteMenuItem = new JMenuItem();
    	pasteMenuItem.setFont(new Font("Calibri", 1, 14));
    	pasteMenuItem.setText("Paste");
    	pasteMenuItem.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				jTextFieldRef.paste();
				
			}});
    	jPopupMenu.add(pasteMenuItem);
    	
    	return jPopupMenu;
    	
    }
    
    public class JTextFieldLimit extends PlainDocument {
		/**
		 * 
		 */
		private static final long serialVersionUID = -1269624350315857907L;
		private int limit;
	    // optional uppercase conversion
	    private boolean toUppercase = false;
	   
	    JTextFieldLimit(int limit) {
	    	super();
	    	this.limit = limit;
	    }
	    
	   JTextFieldLimit(int limit, boolean upper) {
		   super();
		   this.limit = limit;
		   toUppercase = upper;
	   }
	  
	   public void insertString(int offset, String  str, AttributeSet attr) throws BadLocationException {
		   if (str == null) return;
		   
		   char[] charArray = str.toCharArray();
		   str = "";
		   
		   for (int i = 0; i < charArray.length; i++){
			   
			   if (Character.isDigit(charArray[i])){
				   
				   str += charArray[i];
				   
			   }
			   
		   }

		   if ((getLength() + str.length()) <= limit) {
			   if (toUppercase) str = str.toUpperCase();
			   super.insertString(offset, str, attr);
		   }
	   }
	}
    
}