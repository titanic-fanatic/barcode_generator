import info.clearthought.layout.TableLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JSpinner.DateEditor;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.SpinnerDateModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.text.DefaultFormatter;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeSelectionModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

import com.toedter.calendar.JDateChooser;


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
public class DataAssistant extends javax.swing.JFrame implements TreeSelectionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4622125903108014501L;
	private JSplitPane jSplitPane1;
	private JTextField meCardCityTextField;
	private JLabel meCardWebsiteLabel;
	private JLabel meCardCityLabel;
	private JScrollPane treeScrollPane1;
	private JScrollPane contentScrollPane;
	private JLabel fbProfileIDPanelLabel;
	private JPanel rawTextPanel;
	private JTree tree;
	private JPanel mobileWebsitePanel;
	private JPanel mobileCallPanel;
	private JPanel mobileSMSPanel;
	private JPanel meCardPanel;
	private JLabel meCardBirthdayLabel;
	private JPanel vCardPanel;
	private JPanel vCalendarPanel;
	private JLabel meCardProvinceLabel;
	private JLabel meCardPostalLabel;
	private JLabel meCardCountryLabel;
	private JLabel meCardPhoneLabel;
	private JLabel meCardVideoPhoneLabel;
	private JLabel meCardEmailLabel;
	private JTextField meCardProvinceTextField;
	private JTextField meCardPostalTextField;
	private JTextField meCardCountryTextField;
	private JTextField meCardPhoneTextField;
	private JTextField meCardVideoPhoneTextField;
	private JTextField meCardEmailTextField;
	private JTextField meCardWebsiteTextField;
	private JSplitPane mainSplitPane;
	private JTextField fbProfileIDTextField;
	private JTextField androidWIFIPasswordTextField;
	private JLabel androidWIFIPasswordLabel;
	private JComboBox<String> androidWIFIAuthenticationComboBox;
	private JLabel androidWIFIAuthenticationLabel;
	private JTextArea previewTextArea;
	private JPanel previewPanel;
	private JButton applyButton;
	private JButton cancelButton;
	private JScrollPane previewScrollPane;
	private JPanel androidMarketPublisherPanel;
	private JPanel androidMarketPackagePanel;
	private JPanel androidWIFIPanel;
	private JPanel fbProfileNamePanel;
	private JLabel fbPanelTitle;
	private JPanel fbProfileIDPanel;
	private JLabel fbProfileNamePanelLabel;
	private JLabel fbProfileNameNote;
	private JPanel fbLikePanel;
	private JLabel fbLikePanelTitle;
	private JLabel fbLikePanelLabel;
	private JLabel fbLikeNote;
	private JTextField fbLikeURLTextField;
	private JLabel fbProfileNamePanelTitle;
	private JTextArea rawTextTextArea;
	private JLabel rawTextPanelTitle;
	private JLabel rawTextTextFieldLabel;
	private JLabel mobileWebsitePanelTitle;
	private JTextField mobileWebsiteURLTextField;
	private JLabel mobileWebsiteNote;
	private JLabel mobileWebsiteURLLabel;
	private JLabel mobileCallPanelTitle;
	private JLabel rawtextPanelLabel;
	private JLabel mobileWebsitePanelLabel;
	private JLabel mobileCallPanelLabel;
	private JLabel mobileCallNote;
	private JTextField mobileCallTextField;
	private JLabel mobileCallLabel;
	private JLabel mobileSMSPanelTitle;
	private JTextField mobileSMSTextField1;
	private JLabel mobileSMSPanelLabel;
	private JLabel mobileSMSLabel1;
	private JLabel mobileSMSLabel2;
	private JTextArea mobileSMSTextArea;
	private JLabel meCardPanelTitle;
	private JTextField meCardFirstNameTextField;
	private JLabel meCardPanelLabel;
	private JLabel meCardFirstNameLabel;
	private JLabel meCardLastNameLabel;
	private JTextField meCardLastNameTextField;
	private JLabel meCardAddressLabel;
	private JTextField meCardAddressTextField;
	private JDateChooser meCardDateChooser;
	private JLabel vCardPanelTitle;
	private JTextField vCardFirstNameTextField;
	private JLabel vCardPanelLabel;
	private JLabel vCardFirstNameLabel;
	private JLabel vCardLastNameLabel;
	private JLabel vCardAddressLabel;
	private JLabel vCardCityLabel;
	private JLabel vCardProvinceLabel;
	private JLabel vCardPostalLabel;
	private JLabel vCardPhoneLabel;
	private JLabel vCardCountryLabel;
	private JLabel vCardMobilePhoneLabel;
	private JLabel vCardEmailLabel;
	private JLabel vCardWebsiteLabel;
	private JLabel vCardBirthdayLabel;
	private JTextField vCardAddressTextField;
	private JTextField vCardLastNameTextField;
	private JLabel vCardJobTitleLabel;
	private JLabel vCardOrganizationLabel;
	private JLabel vCardFaxLabel;
	private JTextField vCardOrganizationTextField;
	private JTextField vCardJobTitleTextField;
	private JDateChooser vCardDateChooser;
	private JTextField vCardCityTextField;
	private JTextField vCardProvinceTextField;
	private JTextField vCardPostalTextField;
	private JTextField vCardCountryTextField;
	private JTextField vCardPhoneTextField;
	private JTextField vCardMobilePhoneTextField;
	private JTextField vCardFaxTextField;
	private JTextField vCardEmailTextField;
	private JTextField vCardWebsiteTextField;
	private JLabel vCalendarPanelTitle;
	private JTextField vCalendarSummaryTextField;
	private JLabel vCalendarPanelLabel;
	private JLabel vCalendarSummaryLabel;
	private JLabel vCalendarDescriptionLabel;
	private JLabel vCalendarLocationLabel;
	private JLabel vCalendarEventStartLabel;
	private JDateChooser vCalendarEventStartDateChooser;
	private SpinnerDateModel vCalendarEventStartSpinnerDateModel;
	private JSpinner vCalendarEventStartSpinner;
	private DateEditor vCalendarEventStartEditor;
	private JLabel vCalendarEventFinishLabel;
	private JTextField vCalendarDescriptionTextField;
	private JTextField vCalendarLocationTextField;
	private JDateChooser vCalendarEventFinishDateChooser;
	private SpinnerDateModel vCalendarEventFinishSpinnerDateModel;
	private JSpinner vCalendarEventFinishSpinner;
	private DateEditor vCalendarEventFinishEditor;
	private TableLayout androidMarketPublisherPanelLayout;
	private JLabel androidMarketPublisherPanelTitle;
	private JLabel androidMarketPublisherPanelLabel;
	private JTextField androidMarketPublisherTextField;
	private JLabel androidMarketPublisherLabel;
	private TableLayout androidMarkietPackagePanelLayout;
	private JLabel androidMarketPackagePanelTitle;
	private JLabel androidMarketPackagePanelLabel;
	private JLabel androidMarketPackageLabel;
	private JTextField androidMarketPackageTextField;
	private TableLayout androidWIFIPanelLayout;
	private JLabel androidWIFIPanelTitle;
	private JLabel androidWIFIPanelLabel;
	private JTextField androidWIFISSIDTextField;
	private JLabel androidWIFISSIDLabel;
	private DefaultComboBoxModel<String> androidWIFIAuthenticationComboBoxModel;
	private JLabel fbProfileIDNote;
	private JTextField fbProfileNameTextField;
	private TableLayout fbProfileIdPanelLayout;
	private TableLayout fbProfileNamePanelLayout;
	private TableLayout fbLikePanelLayout;
	private String selectedJPanel;
	private static JFrame mFrame;
	private TableLayout twitterProfilePanelLayout;
	private JPanel twitterProfilePanel;
	private JLabel twitterProfilePanelTitle;
	private JTextField twitterProfileTextField;
	private JLabel twitterProfilePanelLabel;
	private JPanel selectedJPanelObject;
	private String mailtomsgString;
	private String matmsgString;
	private String smtpmsgString;
	private String wifimsgString;
	private String wifisecuritymsgString;
	private String sendsmsmsgString;
	private String vcardmsgString;
	private String vcalendarmsgString;
	private String sDate;
	private String sDateTime;
	private String tDate;
	private String sTime;
	private String eDate;
	private String eDateTime;
	private JEditorPane previewEditorPane;
	private JPanel infoTextPanel;
	private JLabel infoTextPanelTitle;
	private JLabel infoTextPanelLabel;
	private JLabel infoTextTextLabel;
	private boolean requestNodeChangePermission = false;
	private String rawtextmsgString;
	private String mobilewebsiteurlmsgString;
	private String mobilecallmsgString;
	private String publishernamemsgString;
	private String packagenamemsgString;
	private String fbprofileidmsgString;
	private String fbprofilenamemsgString;
	private String fblikemsgString;
	private String twitterprofilemsgString;
	private String twittertweetmsgString;
	private String linkedinuserprofilemsgString;
	private String linkedincompanyprofilemsgString;
	private String linkedinsharemsgString;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		new DataAssistant(mFrame).setVisible(true);
		//System.out.println("Run by DataAssistant");
	}
	
	public DataAssistant(JFrame mainFrame) {
		super();
		mFrame = mainFrame;
		initGUI();
	}
	
	public void setSelectedJPanel(String jPanelName){
		
		selectedJPanel = jPanelName;
		
	}
	
	public String getSelectedJPanel(){
		
		return selectedJPanel;
		
	}
	
	public void setSelectedJPanelObject(JPanel jPanelObject){
		
		selectedJPanelObject = jPanelObject;
		
	}
	
	public JPanel getSelectedJPanelObject(){
		
		return selectedJPanelObject;
		
	}
	
	private FocusListener fieldFocusListener(FocusEvent evt) {
		
		return new java.awt.event.FocusAdapter() {
			
            public void focusGained(FocusEvent evt) {
            	
            	Component focusedComponent = evt.getComponent();
            	String componentName = focusedComponent.toString();
                JPanel panel = getSelectedJPanelObject();
            	String pattern1 = "com.toedter.calendar.JTextFieldDateEditor";
            	String pattern2 = "javax.swing.JFormattedTextField";
            	String pattern3 = "javax.swing.JTextArea";
            	Rectangle rectangle;
            	
				if (componentName.startsWith(pattern1)){
            		
            		rectangle = focusedComponent.getParent().getBounds(null);
            		rectangle.y = rectangle.y - 30;
            		rectangle.height = rectangle.height + 40;
            		panel.scrollRectToVisible(rectangle);
            		
            	}
				else if (componentName.startsWith(pattern2)){
            		
            		rectangle = focusedComponent.getParent().getParent().getBounds(null);
            		rectangle.y = rectangle.y - 30;
            		rectangle.height = rectangle.height + 40;
            		panel.scrollRectToVisible(rectangle);
            		
            	}
				else if (componentName.startsWith(pattern3)){
            		
            		rectangle = focusedComponent.getParent().getParent().getParent().getBounds(null);
            		rectangle.y = rectangle.y - 30;
            		rectangle.height = rectangle.height + 40;
            		panel.scrollRectToVisible(rectangle);
            		
            	}
            	else{
            		
            		rectangle = focusedComponent.getBounds(null);
            		rectangle.y = rectangle.y - 30;
            		rectangle.height = rectangle.height + 40;
            		panel.scrollRectToVisible(rectangle);
            		
            	}
				
                repaint();
                
            }
            
            public void focusLost(FocusEvent evt){
            	
            	updatePreview();
            	
            }
            
        };
        
    }
	
	private void initGUI() {
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				try{
					mFrame.setEnabled(true);
					CheckDigitCalculator mf = (CheckDigitCalculator) mFrame;
					mf.setFrameIsActive(false);
					dispose();
				}
				catch(NullPointerException e){
					dispose();
				}
			}
		});
		try {
			setSize(800, 600);
			setTitle("Barcode Generator 1.1 - Data Assistant");
			setResizable(false);
			
			List<? extends Image> icons;
			List<Image> iconsList = new ArrayList<Image>();
			iconsList.add(new ImageIcon(getClass().getClassLoader().getResource("images/barcode16x16.png")).getImage());
			iconsList.add(new ImageIcon(getClass().getClassLoader().getResource("images/barcode24x24.png")).getImage());
			iconsList.add(new ImageIcon(getClass().getClassLoader().getResource("images/barcode32x32.png")).getImage());
			iconsList.add(new ImageIcon(getClass().getClassLoader().getResource("images/barcode48x48.png")).getImage());
			iconsList.add(new ImageIcon(getClass().getClassLoader().getResource("images/barcode64x64.png")).getImage());
			icons = iconsList;
			setIconImages(icons);
			
			treeScrollPane1 = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			treeScrollPane1.setPreferredSize(new java.awt.Dimension(232, 560));
			contentScrollPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			contentScrollPane.setPreferredSize(new java.awt.Dimension(540, 560));
			//new MouseWheelController(contentScrollPane, 40);
			contentScrollPane.getVerticalScrollBar().setUnitIncrement(10);
			
			DefaultMutableTreeNode treeRoot = new DefaultMutableTreeNode("Data Types");
			TreePath treeRootPath = new TreePath(treeRoot);
			DefaultMutableTreeNode treeCategory = null;
		    DefaultMutableTreeNode treeSub = null;
		    
		    treeCategory = new DefaultMutableTreeNode("Raw Data");
		    treeRoot.add(treeCategory);
		    treeSub = new DefaultMutableTreeNode("Text");
		    treeCategory.add(treeSub);

		    treeCategory = new DefaultMutableTreeNode("Mobile Tagging");
		    treeRoot.add(treeCategory);
		    treeSub = new DefaultMutableTreeNode("Browse to a website");
		    treeCategory.add(treeSub);
		    treeSub = new DefaultMutableTreeNode("Make a phone call");
		    treeCategory.add(treeSub);
		    treeSub = new DefaultMutableTreeNode("Send an e-mail (MATMSG)");
		    treeCategory.add(treeSub);
		    treeSub = new DefaultMutableTreeNode("Send an e-mail (MAILTO)");
		    treeCategory.add(treeSub);
		    treeSub = new DefaultMutableTreeNode("Send an e-mail (SMTP)");
		    treeCategory.add(treeSub);
		    treeSub = new DefaultMutableTreeNode("Send an SMS");
		    treeCategory.add(treeSub);

		    treeCategory = new DefaultMutableTreeNode("Business Cards");
		    treeRoot.add(treeCategory);
		    treeSub = new DefaultMutableTreeNode("MeCard Business Card");
		    treeCategory.add(treeSub);
		    treeSub = new DefaultMutableTreeNode("vCard Business Card");
		    treeCategory.add(treeSub);

		    treeCategory = new DefaultMutableTreeNode("Events");
		    treeRoot.add(treeCategory);
		    treeSub = new DefaultMutableTreeNode("vCalendar Event");
		    treeCategory.add(treeSub);

		    treeCategory = new DefaultMutableTreeNode("Android");
		    treeRoot.add(treeCategory);
		    treeSub = new DefaultMutableTreeNode("Android Market Publisher");
		    treeCategory.add(treeSub);
		    treeSub = new DefaultMutableTreeNode("Android Market Package");
		    treeCategory.add(treeSub);
		    treeSub = new DefaultMutableTreeNode("WiFi Access Point");
		    treeCategory.add(treeSub);

		    treeCategory = new DefaultMutableTreeNode("Facebook");
		    treeRoot.add(treeCategory);
		    treeSub = new DefaultMutableTreeNode("Facebook Profile ID");
		    treeCategory.add(treeSub);
		    treeSub = new DefaultMutableTreeNode("Facebook Profile Name");
		    treeCategory.add(treeSub);
		    treeSub = new DefaultMutableTreeNode("Facebook Like");
		    treeCategory.add(treeSub);

		    treeCategory = new DefaultMutableTreeNode("Twitter");
		    treeRoot.add(treeCategory);
		    treeSub = new DefaultMutableTreeNode("Twitter Profile");
		    treeCategory.add(treeSub);
		    treeSub = new DefaultMutableTreeNode("Twitter Tweet");
		    treeCategory.add(treeSub);

		    treeCategory = new DefaultMutableTreeNode("LinkedIn");
		    treeRoot.add(treeCategory);
		    treeSub = new DefaultMutableTreeNode("LinkedIn User Profile");
		    treeCategory.add(treeSub);
		    treeSub = new DefaultMutableTreeNode("LinkedIn Company Profile");
		    treeCategory.add(treeSub);
		    treeSub = new DefaultMutableTreeNode("LinkedIn Share");
		    treeCategory.add(treeSub);
		    
		    tree = new JTree(treeRoot);
		    tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);

		    //Listen for when the selection changes.
		    tree.addTreeSelectionListener(this);
		    
			treeScrollPane1.setViewportView(tree);
			tree.setFont(new java.awt.Font("Calibri",0,14));
			//tree.setPreferredSize(new java.awt.Dimension(122, 258));
			
			jSplitPane1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, treeScrollPane1, contentScrollPane);
			jSplitPane1.setDividerLocation(232);
			
			previewPanel = new JPanel();
			double previewPanelLayoutSize[][] = {{20.0, TableLayout.FILL, 100.0, 10.0, 100.0, 20.0}, // COLUMNS
					                             {20.0, TableLayout.FILL, 7.0, 30.0, 20.0}}; // ROWS
			TableLayout previewPanelLayout = new TableLayout(previewPanelLayoutSize);
			previewPanel.setLayout(previewPanelLayout);
			
			//final DataAssistant dataAssistantFrame = this;
			
			applyButton = new JButton();
			applyButton.setText("Apply");
			applyButton.setFont(new java.awt.Font("Calibri",1,18));
			applyButton.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent evt) {
					
					applyChanges();
					mFrame.setEnabled(true);
					((CheckDigitCalculator) mFrame).setFrameIsActive(false);
					dispose();
					
				}
				
			});
			
			cancelButton = new JButton();
			cancelButton.setText("Cancel");
			cancelButton.setFont(new java.awt.Font("Calibri",1,18));
			cancelButton.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent evt) {
					try{
						
						mFrame.setEnabled(true);
						((CheckDigitCalculator) mFrame).setFrameIsActive(false);
						dispose();
						
					}
					catch(NullPointerException e){
						
						dispose();
						
					}
				}
				
			});
			
			previewPanel.add(applyButton, "2, 3");
			previewPanel.add(cancelButton, "4, 3");
			
			//String editorPaneText = "<span style='font-family: Calibri; font-size: 14pt;'>Welcome to the <strong>Data Assistant</strong>... Please use the left pane to choose the type of data you wish to encode.</span>";
			
			previewEditorPane = new JEditorPane();
			previewEditorPane.setContentType("text/html");
			
			//previewEditorPane.setText(editorPaneText);

			
			previewEditorPane.setEditable(false);
			previewEditorPane.setBackground(new Color(255, 255, 255, 255));
			previewEditorPane.setFont(new Font("Calibri", 0, 14));
			
			previewTextArea = new JTextArea();
			previewTextArea.setEditable(false);
			previewTextArea.setBackground(new Color(255, 255, 255, 255));
			
			previewScrollPane = new JScrollPane(previewEditorPane);
		    previewScrollPane.setOpaque(true);
		    previewScrollPane.setBackground(new Color(255, 255, 255, 255));
		    previewScrollPane.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(new LineBorder(new Color(143, 143, 143), 1, false), "Raw Text - Preview", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14)), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));
		    previewPanel.add(previewScrollPane, "1, 1, 4, 1");

			mainSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, jSplitPane1, previewPanel);
			mainSplitPane.setDividerLocation(375);
			mainSplitPane.setEnabled(false);
			getContentPane().add(mainSplitPane, BorderLayout.CENTER);
			
			tree.setSelectionPath(treeRootPath);
			tree.scrollPathToVisible(treeRootPath);
			tree.setSelectionModel(new VetoableTreeSelectionModel());
				
		} catch (Exception e) {
			
		    //add your error handling code here
			e.printStackTrace();
			
		}
		
	}
	
	private class VetoableTreeSelectionModel extends DefaultTreeSelectionModel {
	    /**
		 * 
		 */
		private static final long serialVersionUID = -1877091232483239797L;

		public void setSelectionPath(TreePath path){
			
			System.out.println(requestNodeChangePermission);
			
			if (requestNodeChangePermission){
			
				int reply = JOptionPane.showConfirmDialog(null,
		    		    "By changing data types, you will loose all existing data!\n" +
				        "Do you wish to continue and loose all existing data?",
		    		    "WARNING",
		    		    JOptionPane.WARNING_MESSAGE,
		    		    JOptionPane.YES_NO_OPTION);
				
		        if (reply == JOptionPane.YES_OPTION) {
		            super.setSelectionPath(path);
		        }
		        
			}
			else{
				
				super.setSelectionPath(path);
				
			}
			
	    }
		
	}

	/** Required by TreeSelectionListener interface. */
    public void valueChanged(TreeSelectionEvent e) {
    	
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();

        if (node == null) return;

        Object nodeData = node.getUserObject();
        
        if (node.isLeaf()) {
        	
            JPanel selectedJPanel = getJPanel(nodeData.toString().toLowerCase());
            setSelectedJPanel(nodeData.toString().toLowerCase());
            contentScrollPane.setViewportView(selectedJPanel);
            updatePreview();
            //requestNodeChangePermission = true;
            
        } else {
            
        	setSelectedJPanel(nodeData.toString().toLowerCase());
        	updatePreview();
        	requestNodeChangePermission = false;
        	
        }
        
    }
    
    private void updatePreview(){
    	
    	String jPanelName = getSelectedJPanel();
    	requestNodeChangePermission = false;
    		
    	//System.out.println("jPanelName: " + jPanelName);
    	
    	if (jPanelName.equals("data types") || jPanelName.equals("raw data") || jPanelName.equals("mobile tagging") || jPanelName.equals("business cards") || jPanelName.equals("events") || jPanelName.equals("android") || jPanelName.equals("facebook") || jPanelName.equals("twitter") || jPanelName.equals("linkedin")){
    	
	    	previewEditorPane.setContentType("plain/text");
			previewEditorPane.setText("");
			previewEditorPane.setCaretPosition(0);
			
			JPanel panel = new JPanel();
			
			double[][] infoTextPanelSize = {{20.0, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, 7.0, TableLayout.FILL, 20.0}, // COLUMNS
					                        {20.0, 20.0, 7.0, 60.0}}; // ROWS
			TableLayout infoTextPanelLayout = new TableLayout(infoTextPanelSize);
			infoTextPanelLayout.setHGap(5);
	    	infoTextPanelLayout.setVGap(5);
	    	
	    	infoTextPanel = new JPanel();
	    	infoTextPanel.setLayout(infoTextPanelLayout);
	    	infoTextPanel.setPreferredSize(new java.awt.Dimension(500, infoTextPanel.getPreferredSize().height));
	    	
			infoTextPanelTitle = new JLabel();
			infoTextPanelTitle.setText("Welcome to the Data Assistant");
			infoTextPanelTitle.setFont(new java.awt.Font("Calibri",1,18));
			infoTextPanel.add(infoTextPanelTitle, "1, 1, 4, 1");
	    	
			infoTextPanelLabel = new JLabel();
			infoTextPanelLabel.setText("<html>1) Choose a data type from the pane to your left,<br>2) Fill out the form fields for that data type<br>3) Click \"Apply\".</html>");
			infoTextPanelLabel.setFont(new java.awt.Font("Calibri",0,14));
			infoTextPanel.add(infoTextPanelLabel, "1, 3, 5, 3");
	
			infoTextTextLabel = new JLabel();
			infoTextTextLabel.setText("Text:");
			infoTextTextLabel.setFont(new java.awt.Font("Calibri",1,14));
			infoTextPanel.add(infoTextTextLabel, "1, 7");
			
			previewTextArea.setText("");
	
	    	panel = infoTextPanel;
	    	
	    	setSelectedJPanelObject(panel);
	    	contentScrollPane.setViewportView(panel);
    	
    	}
    	else if (jPanelName.equals("text")){
    		
    		if (rawTextTextArea.getText().length() > 0){
    		
    			rawtextmsgString = rawTextTextArea.getText();
	    		previewEditorPane.setContentType("plain/text");
	    		requestNodeChangePermission = true;
	    		
    		}
    		else{
    			
    			rawtextmsgString = "<span style='font-family: Calibri; font-size: 14pt;'>";
    			rawtextmsgString += "<strong>Raw Text</strong><br><br>";
    			rawtextmsgString += "This format will encode raw data into a QRCode.<br>";
    			rawtextmsgString += "This format can be decoded by any mobile device equipped with a camera and barcode scanning app.";
    			
    			previewEditorPane.setContentType("text/html");
    			
    		}
    		
    		previewEditorPane.setText(rawtextmsgString);
    		
    	}
    	else if (jPanelName.equals("browse to a website")){
    		
    		if (mobileWebsiteURLTextField.getText().length() > 0){
    		
	    		mobilewebsiteurlmsgString = mobileWebsiteURLTextField.getText();
	    		previewEditorPane.setContentType("plain/text");
	    		requestNodeChangePermission = true;
	    		
    		}
    		else{
    			
    			mobilewebsiteurlmsgString = "<span style='font-family: Calibri; font-size: 14pt;'>";
    			mobilewebsiteurlmsgString += "<strong>Raw Text</strong><br><br>";
    			mobilewebsiteurlmsgString += "This format will encode a URL into a QRCode<br>";
    			mobilewebsiteurlmsgString += "This format can be decoded by any mobile device equipped with a camera and barcode scanning app.";
    			
    			previewEditorPane.setContentType("text/html");
    			
    		}
    		
    		previewEditorPane.setText(mobilewebsiteurlmsgString);
    		
    	}
    	else if (jPanelName.equals("make a phone call")){
    		
    		if (mobileCallTextField.getText().length() > 0){
    		
	    		mobilecallmsgString = mobileCallTextField.getText();
	    		previewEditorPane.setContentType("plain/text");
	    		requestNodeChangePermission = true;
	    		
    		}
    		else{
    			
    			mobilecallmsgString = "<span style='font-family: Calibri; font-size: 14pt;'>";
    			mobilecallmsgString += "<strong>Make a Phone Call</strong><br><br>";
    			mobilecallmsgString += "This format will encode a phone number into a QRCode.<br>";
    			mobilecallmsgString += "This format can be decoded by any mobile device equipped with a camera and barcode scanning app.";
    			
	    		previewEditorPane.setContentType("text/html");
    			
    		}
    		
    		previewEditorPane.setText(mobilecallmsgString);
    		
    	}
    	else if (jPanelName.equals("send an e-mail (matmsg)")){
    		
    		if (mobileEmailMATMSGTextField1.getText().length() > 0){
    		
    			matmsgString = "MATMSG:TO:" + mobileEmailMATMSGTextField1.getText() + ";SUB:" + mobileEmailMATMSGTextField2.getText() + ";BODY:" + mobileEmailMATMSGTextArea.getText() + ";;";
    			previewEditorPane.setContentType("plain/text");
    			requestNodeChangePermission = true;
        		
    		}
    		else{
    		
    			matmsgString = "<span style='font-family: Calibri; font-size: 14pt;'>";
    			matmsgString += "<strong>Send an E-Mail (MATMSG)</strong><br><br>";
    			matmsgString += "This format will encode an e-mail message into a QRCode.<br>";
    			matmsgString += "This format can be decoded by any mobile device equipped with a camera and barcode scanning app .";
    			previewEditorPane.setContentType("text/html");
    			
    		}
    		
    		if (mobileEmailMATMSGTextField2.getText().length() > 0 || mobileEmailMATMSGTextArea.getText().length() > 0){
    			
    			requestNodeChangePermission = true;
    			
    		}
    		
    		previewEditorPane.setText(matmsgString);
    		
    	}
    	else if (jPanelName.equals("send an e-mail (mailto)")){
    		
    		if (mobileEmailMAILTOTextField1.getText().length() > 0){
    		
    			try {
					mailtomsgString = "mailto:" + mobileEmailMAILTOTextField1.getText() + "?subject=" + URLEncoder.encode(mobileEmailMAILTOTextField2.getText(), "UTF-8").replace("+", "%20") + ";BODY:" + URLEncoder.encode(mobileEmailMAILTOTextArea.getText(), "UTF-8").replace("+", "%20") + ";;";
				} catch (UnsupportedEncodingException e) {
					
					e.printStackTrace();
					
				}
    			
    			previewEditorPane.setContentType("plain/text");
        		requestNodeChangePermission = true;
    		
    		}
    		else{
    		
    			mailtomsgString = "<span style='font-family: Calibri; font-size: 14pt;'>";
    			mailtomsgString += "<strong>Send an E-mail (MAILTO)</strong><br><br>";
    			mailtomsgString += "This format will encode an e-mail message into a QRCode.<br>";
    			mailtomsgString += "This format can be decoded by any mobile device equipped with a camera and barcode scanning app.";
    			previewEditorPane.setContentType("text/html");
    			
    		}
    		
    		if (mobileEmailMAILTOTextField2.getText().length() > 0 || mobileEmailMAILTOTextArea.getText().length() > 0){
    			
    			requestNodeChangePermission = true;
    			
    		}
    		
    		previewEditorPane.setText(mailtomsgString);
    		
    	}
    	else if (jPanelName.equals("send an e-mail (smtp)")){
    		
    		if (mobileEmailSMTPTextField1.getText().length() > 0){
    		
    			smtpmsgString = "SMTP:" + mobileEmailSMTPTextField1.getText() + ":" + mobileEmailSMTPTextField2.getText() + ":" + mobileEmailSMTPTextArea.getText() + ";;";
    			previewEditorPane.setContentType("plain/text");
        		requestNodeChangePermission = true;
    			
    		}
    		else{
    			
    			smtpmsgString = "<span style='font-family: Calibri; font-size: 14pt;'>";
    			smtpmsgString += "<strong>Send an E-mail (SMTP)</strong><br><br>";
    			smtpmsgString += "This format will encode an e-mail message into a QRCode.<br>";
    			smtpmsgString += "This format can be decoded by any mobile device equipped with a camera and barcode scanning app.";
    			previewEditorPane.setContentType("text/html");
    			
    		}
    		
    		if (mobileEmailSMTPTextField2.getText().length() > 0 || mobileEmailSMTPTextArea.getText().length() > 0){
    			
    			requestNodeChangePermission = true;
    			
    		}
    		
    		previewEditorPane.setText(smtpmsgString);
    		
    	}
    	else if (jPanelName.equals("send an sms")){
    		
    		if (mobileSMSTextField1.getText().length() > 0){
    		
    			sendsmsmsgString = "smsto:" + mobileSMSTextField1.getText() + ":" + mobileSMSTextArea.getText();
        		requestNodeChangePermission = true;
    			
    		}
    		else{
    		
    			sendsmsmsgString = "<span style='font-family: Calibri; font-size: 14pt;'>";
    			sendsmsmsgString += "<strong>Send an SMS</strong><br><br>";
    			sendsmsmsgString += "This format will encode an sms message into a QRCode.<br>";
    			sendsmsmsgString += "This format can be decoded by any mobile device equipped with a camera and barcode scanning app.";
    			previewEditorPane.setContentType("text/html");
    			
    		}
    		
    		if (mobileSMSTextArea.getText().length() > 0){
    			
    			requestNodeChangePermission = true;
    			
    		}
    		
    		previewEditorPane.setText(sendsmsmsgString);
    		
    	}
    	else if (jPanelName.equals("mecard business card")){
    		
    		String bDay;
    		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
			if (meCardDateChooser.getDate() != null){
    			
    			bDay = new String( dateFormat.format( meCardDateChooser.getDate() ) );
    			
    		}
    		else{
    			
    			bDay = "";
    			
    		}
			
			boolean dataIsAvailable = false;
    		
    		String meCardString = "MECARD:;";
    		
    		if (meCardFirstNameTextField.getText().length() > 0 || meCardLastNameTextField.getText().length() > 0){
    			
    			meCardString += "N:" + meCardLastNameTextField.getText() + "," + meCardFirstNameTextField.getText() + ";";
    			dataIsAvailable = true;
    		}
    		
    		if (meCardAddressTextField.getText().length() > 0 || meCardCityTextField.getText().length() > 0 || meCardProvinceTextField.getText().length() > 0 || meCardPostalTextField.getText().length() > 0 || meCardCountryTextField.getText().length() > 0){
    			
    			meCardString += "ADR:,," + meCardAddressTextField.getText() + "," + meCardCityTextField.getText() + "," + meCardProvinceTextField.getText() + "," + meCardPostalTextField.getText() + "," + meCardCountryTextField.getText() + ";";
    			dataIsAvailable = true;
    			
    		}
    		
    		if (meCardPhoneTextField.getText().length() > 0){
    			
    			meCardString += "TEL:" + meCardPhoneTextField.getText() + ";";
    			dataIsAvailable = true;
    			
    		}
    		
    		if (meCardVideoPhoneTextField.getText().length() > 0){
    			
    			meCardString += "TEL-AV:" + meCardVideoPhoneTextField.getText() + ";";
    			dataIsAvailable = true;
    			
    		}
    		
    		if (meCardEmailTextField.getText().length() > 0){
    			
    			meCardString += "EMAIL:" + meCardEmailTextField.getText() + ";";
    			dataIsAvailable = true;
    			
    		}
    		
    		if (meCardWebsiteTextField.getText().length() > 0){
    			
    			meCardString += "URL:" + meCardWebsiteTextField.getText() + ";";
    			dataIsAvailable = true;
    			
    		}
    		
    		if (bDay.length() > 0 && meCardDateChooser.isEnabled()){
    			
    			meCardString += "BDAY:" + bDay + ";";
    			
    			if ( !new String( dateFormat.format( meCardDateChooser.getDate() ) ).equals( new String( dateFormat.format( new Date() ) ) ) ){
    			
    				dataIsAvailable = true;
    				
    			}
    			
    		}
    		
    		meCardString += ";";
    		
    		if (dataIsAvailable){
    			
    			previewEditorPane.setText(meCardString);
        		previewEditorPane.setContentType("plain/text");
        		requestNodeChangePermission = true;
    			
    		}
    		else{
    			
    			meCardString = "<span style='font-family: Calibri;'>";
    			meCardString += "<strong>meCard Format</strong><br><br>";
    			meCardString += "The meCard format is an alternative method of encoding contact data or electronic business cards into a QRCode.<br>";
    			meCardString += "meCard QRCodes can be decoded by most mobile devices equipped with a camera and barcode scanning app.";
    			meCardString += "</span>";
    			previewEditorPane.setContentType("text/html");
    			
    		}
    		
    		previewEditorPane.setText(meCardString);
    		
    	}
    	else if (jPanelName.equals("vcard business card")){
    		
    		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
    		String bDay;
			if (vCardDateChooser.getDate() != null){
    			
    			bDay = new String( dateFormat.format( vCardDateChooser.getDate() ) );
    			
    		}
    		else{
    			
    			bDay = "";
    			
    		}
			
			boolean dataIsAvailable = false;
			
    		vcardmsgString = "BEGIN:VCARD\n";
    		vcardmsgString += "VERSION:2.1\n";
    		
    		if (vCardFirstNameTextField.getText().length() > 0 || vCardLastNameTextField.getText().length() > 0){
    		
    			vcardmsgString += "N:" + vCardLastNameTextField.getText() + ";" + vCardFirstNameTextField.getText() + ";;;\n";
    			vcardmsgString += "FN:" + vCardFirstNameTextField.getText() + " " + vCardLastNameTextField.getText() + "\n";
    			dataIsAvailable = true;
    			
    		}
    		
    		if (vCardOrganizationTextField.getText().length() > 0){
    		
    			vcardmsgString += "ORG:" + vCardOrganizationTextField.getText() + "\n";
    			dataIsAvailable = true;
    			
    		}
    		
    		if (vCardJobTitleTextField.getText().length() > 0){
    		
    			vcardmsgString += "TITLE:" + vCardJobTitleTextField.getText() + "\n";
    			dataIsAvailable = true;
    			
    		}
    		
    		if (vCardAddressTextField.getText().length() > 0 || vCardCityTextField.getText().length() > 0 || vCardProvinceTextField.getText().length() > 0 || vCardPostalTextField.getText().length() > 0 || vCardCountryTextField.getText().length() > 0){
    		
    			vcardmsgString += "ADR:;;" + vCardAddressTextField.getText() + ";" + vCardCityTextField.getText() + ";" + vCardProvinceTextField.getText() + ";" + vCardPostalTextField.getText() + ";" + vCardCountryTextField.getText() + "\n";
    			dataIsAvailable = true;
    		
    		}
    		
    		if (vCardPhoneTextField.getText().length() > 0){
    		
    			vcardmsgString += "TEL:" + vCardPhoneTextField.getText() + "\n";
    			dataIsAvailable = true;
    			
    		}
    		
    		if (vCardMobilePhoneTextField.getText().length() > 0){
    		
    			vcardmsgString += "TEL;CELL:" + vCardMobilePhoneTextField.getText() + "\n";
    			dataIsAvailable = true;
    			
    		}
    		
    		if (vCardFaxTextField.getText().length() > 0){
    		
    			vcardmsgString += "TEL;FAX:" + vCardFaxTextField.getText() + "\n";
    			dataIsAvailable = true;
    			
    		}
    		
    		if (vCardEmailTextField.getText().length() > 0){
    		
    			vcardmsgString += "EMAIL;INTERNET:" + vCardEmailTextField.getText() + "\n";
    			dataIsAvailable = true;
    			
    		}
    		
    		if (vCardWebsiteTextField.getText().length() > 0){
    		
    			vcardmsgString += "URL:" + vCardWebsiteTextField.getText() + "\n";
    			dataIsAvailable = true;
    			
    		}
    		
    		if (bDay.length() > 0 && vCardDateChooser.isEnabled()){
    			
    			vcardmsgString += "BDAY:" + bDay + "\n";
    			
    			if ( !new String( dateFormat.format( vCardDateChooser.getDate() ) ).equals( new String( dateFormat.format( new Date() ) ) ) ){
    			
    				dataIsAvailable = true;
    				
    			}
    			
    		}
    		
    		vcardmsgString += "END:VCARD";
    		
    		if (dataIsAvailable == false){
    			
    			vcardmsgString = "<span style='font-family: Calibri;'>";
    			vcardmsgString += "<strong>vCard Format</strong><br><br>";
    			vcardmsgString += "The vCard format is the preferred method of encoding contact data or electronic business cards into a QRCode.<br>";
    			vcardmsgString += "vCard QRCodes can be decoded by most mobile devices equipped with a camera and barcode scanning app.";
    			vcardmsgString += "</span>";
    			previewEditorPane.setContentType("text/html");
        		
    		}
    		else{
    			
    			previewEditorPane.setContentType("plain/text");
    			requestNodeChangePermission = true;
        		    			
    		}
    		
    		previewEditorPane.setText(vcardmsgString);
    		previewEditorPane.setCaretPosition(0);
    		
    	}
    	else if (jPanelName.equals("vcalendar event")){
    		
    		boolean dataIsAvailable = false;
			
			DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
			DateFormat timeFormat = new SimpleDateFormat("HHmmss");
    		
    		if (vCalendarEventStartDateChooser.isEnabled() && vCalendarEventStartSpinner.isEnabled()){
    			
    			try{
    			
    				sDate = new String( dateFormat.format( vCalendarEventStartDateChooser.getDate() ) );
    				tDate = new String( timeFormat.format(vCalendarEventStartSpinner.getValue()) );
    				
    			}
    			catch (NullPointerException e){
    				
    				
    				
    			}
				
    			Calendar calendar = GregorianCalendar.getInstance(); // creates a new calendar instance
    			try {
					calendar.setTime(timeFormat.parse(tDate));
				} catch (ParseException e) {
					
					e.printStackTrace();
				}   // assigns calendar to given date
    			
    			String hour;
				String minute;
				String second;
				
				if (calendar.get(Calendar.HOUR_OF_DAY) == 0){
    				
    				hour = "00"; // gets hour in 24h format
    				
    			}
    			else{
    				
    				hour = "" + calendar.get(Calendar.HOUR_OF_DAY);
    				
    			}
				
				if (hour.length() == 1){
					
					hour = "0" + hour;
					
				}
				
				if (calendar.get(Calendar.MINUTE) == 0){
    				
    				minute = "00"; // gets hour in 24h format
    				
    			}
    			else{
    				
    				minute = "" + calendar.get(Calendar.MINUTE);
    				
    			}
				
				if (("" + calendar.get(Calendar.MINUTE)).length() == 1){
					
					minute = "0" + calendar.get(Calendar.MINUTE);
					
				}
				
				if (calendar.get(Calendar.SECOND) == 0){
    				
    				second = "00"; // gets hour in 24h format
    				
    			}
    			else{
    				
    				second = "" + calendar.get(Calendar.SECOND);
    				
    			}
				
				if (("" + calendar.get(Calendar.SECOND)).length() == 1){
					
					second = "0" + calendar.get(Calendar.SECOND);
					
				}
    			
    			sTime = hour + minute + second;
    			sDateTime = sDate + "T" + sTime;
    			
    		}
    		else{
    			
    			sDateTime = "";
    			
    		}
			
    		String eTime;
			if (vCalendarEventFinishDateChooser.isEnabled() && vCalendarEventFinishSpinner.isEnabled()){
    			
    			try{
    				
    				eDate = new String( dateFormat.format( vCalendarEventFinishDateChooser.getDate() ) );
    				tDate = new String( timeFormat.format(vCalendarEventFinishSpinner.getValue()) );
    				
    			}
    			catch (NullPointerException e){
    				
    				
    				
    			}
				
    			Calendar calendar = GregorianCalendar.getInstance(); // creates a new calendar instance
    			try {
					calendar.setTime(timeFormat.parse(tDate));
				} catch (ParseException e) {
					
					e.printStackTrace();
				}   // assigns calendar to given date
    			
    			String hh = "" + calendar.get(Calendar.HOUR_OF_DAY);
    			String mm = "" + calendar.get(Calendar.MINUTE);
    			String ss = "" + calendar.get(Calendar.SECOND);
    			
    			if (hh.length() == 1){
    				
    				hh = "0" + hh;
    				
    			}
    			
    			if (mm.length() == 1){
    				
    				mm = "0" + mm;
    				
    			}
    			
    			if (ss.length() == 1){
    				
    				ss = "0" + ss;
    				
    			}
    			
    			eTime = hh + mm + ss;
    			eDateTime = eDate + "T" + eTime;
    			
    		}
    		else{
    			
    			eDateTime = "";
    			
    		}
    		
    		vcalendarmsgString = "BEGIN:VEVENT\n";
    		
    		if (vCalendarSummaryTextField.getText().length() > 0){
			
    			vcalendarmsgString += "SUMMARY:" + vCalendarSummaryTextField.getText() + "\n";
    			dataIsAvailable = true;
    			
    		}
    		
    		if (vCalendarDescriptionTextField.getText().length() > 0){
			
    			vcalendarmsgString += "DESCRIPTION:" + vCalendarDescriptionTextField.getText() + "\n";
    			dataIsAvailable = true;
    			
    		}
    		
    		if (vCalendarLocationTextField.getText().length() > 0){
			
    			vcalendarmsgString += "LOCATION:" + vCalendarLocationTextField.getText() + "\n";
    			dataIsAvailable = true;
    			
    		}
    		
    		if (sDateTime.length() == 15 && dataIsAvailable){
			
    			vcalendarmsgString += "DTSTART:" + sDateTime + "\n";
    			
    		}
    		
    		if (eDateTime.length() == 15 && dataIsAvailable){
			
    			vcalendarmsgString += "DTEND:" + eDateTime + "\n";
    			
    		}
    		
			vcalendarmsgString += "END:VEVENT";
			
			if (dataIsAvailable){
				
				previewEditorPane.setContentType("plain/text");
				requestNodeChangePermission = true;
				
			}
			else{
				
				previewEditorPane.setContentType("text/html");
				vcalendarmsgString = "<span style='font-family: Calibri; font-size: 14pt;'>";
				vcalendarmsgString += "<strong>vCalendar Event</strong><br><br>";
				vcalendarmsgString += "The vCalendar format is used to encode calendar events into a QRCode.<br>";
				vcalendarmsgString += "This format can be read by mobile devices equipped with a camera and barcode scanning app (must support the vCalendar format).";
				
			}
			
			previewEditorPane.setText(vcalendarmsgString);
			previewEditorPane.setCaretPosition(0);
    		
    	}
    	else if (jPanelName.equals("android market publisher")){
    		
    		if (androidMarketPublisherTextField.getText().length() > 0){
    			
    			try {
					publishernamemsgString = "market://search?q=pub%3A" + URLEncoder.encode(androidMarketPublisherTextField.getText(), "UTF-8").replace("+", "%20");
				} catch (UnsupportedEncodingException e) {
					
					e.printStackTrace();
				}
    			
    			previewEditorPane.setContentType("plain/text");
				requestNodeChangePermission = true;
    			
    		}
    		else{
				
				previewEditorPane.setContentType("text/html");
				publishernamemsgString = "<span style='font-family: Calibri; font-size: 14pt;'>";
				publishernamemsgString += "<strong>Android Publisher Name</strong><br><br>";
				publishernamemsgString += "This format will encode your Android Publisher Name into a QRCode.<br>";
				publishernamemsgString += "This format can be read by Android devices equipped with a camera and barcode scanning app.";
				
			}
			
			previewEditorPane.setText(publishernamemsgString);
			previewEditorPane.setCaretPosition(0);
    		
    	}
    	else if (jPanelName.equals("android market package")){
    		
    		if (androidMarketPackageTextField.getText().length() > 0){
    			
    			try {
					packagenamemsgString = "market://search?q=pname%3A" + URLEncoder.encode(androidMarketPackageTextField.getText(), "UTF-8").replace("+", "%20");
				} catch (UnsupportedEncodingException e) {
					
					e.printStackTrace();
				}
    			
    			previewEditorPane.setContentType("plain/text");
				requestNodeChangePermission = true;
    			
    		}
    		else{
				
				previewEditorPane.setContentType("text/html");
				packagenamemsgString = "<span style='font-family: Calibri; font-size: 14pt;'>";
				packagenamemsgString += "<strong>Android Package Name</strong><br><br>";
				packagenamemsgString += "This format will encode your Android Package Name into a QRCode.<br>";
				packagenamemsgString += "This format can be read by Android devices equipped with a camera and barcode scanning app.";
				
			}
			
			previewEditorPane.setText(packagenamemsgString);
			previewEditorPane.setCaretPosition(0);
    		
    	}
    	else if (jPanelName.equals("wifi access point")){
    		
    		if (androidWIFIAuthenticationComboBox.getSelectedIndex() == 0){
    			wifisecuritymsgString = "WPA";
    		}
    		else if (androidWIFIAuthenticationComboBox.getSelectedIndex() == 1){
    			wifisecuritymsgString = "WEP";
    		}
    		else if (androidWIFIAuthenticationComboBox.getSelectedIndex() == 2){
    			wifisecuritymsgString = "nopass";
    		}
    		
    		if (androidWIFISSIDTextField.getText().length() > 0 || androidWIFIPasswordTextField.getText().length() > 0){
    		
    			wifimsgString = "WIFI:S:" + androidWIFISSIDTextField.getText() + ";T:" + wifisecuritymsgString + ";P:" + androidWIFIPasswordTextField.getText() + ";;";
    			previewEditorPane.setContentType("plain/text");
        		requestNodeChangePermission = true;
    			
    		}
    		else{
    			
    			wifimsgString = "<span style='font-family: Calibri; font-size: 14pt;'>";
    			wifimsgString += "<strong>WIFI Access Point</strong><br><br>";
    			wifimsgString += "This format will encode your WIFI Access Point credentials into a QRCode.<br>";
    			wifimsgString += "This format can be read by Android mobile devices equipped with a camera and barcode scanning app.";
    			previewEditorPane.setContentType("text/html");
    			
    		}
    		
    		previewEditorPane.setText(wifimsgString);
    		
    	}
    	else if (jPanelName.equals("facebook profile id")){
    		
    		boolean valueIsInteger;
			try{
    			
    			Integer.parseInt( fbProfileIDTextField.getText() );
    			valueIsInteger = true;
    			
    		}
    		catch (NumberFormatException e){
    			
    			valueIsInteger = false;
    			
    		}
    		
    		if (fbProfileIDTextField.getText().length() > 0 && valueIsInteger){
    			
    			fbprofileidmsgString = "http://fb.com/profile.php?id=" + fbProfileIDTextField.getText();
    			
    			previewEditorPane.setContentType("plain/text");
				requestNodeChangePermission = true;
    			
    		}
    		else{
				
				previewEditorPane.setContentType("text/html");
				fbprofileidmsgString = "<span style='font-family: Calibri; font-size: 14pt;'>";
				fbprofileidmsgString += "<strong>Facebook Profile ID</strong><br><br>";
				fbprofileidmsgString += "This format will encode your Facebook Profile ID into a QRCode.<br>";
				fbprofileidmsgString += "This format can be read by mobile devices equipped with a camera and barcode scanning app.";
				
			}
			
			previewEditorPane.setText(fbprofileidmsgString);
			previewEditorPane.setCaretPosition(0);
    		
    	}
    	else if (jPanelName.equals("facebook profile name")){
    		
    		if (fbProfileNameTextField.getText().length() > 0){
    			
    			try {
    				
					fbprofilenamemsgString = "http://fb.com/" + URLEncoder.encode(fbProfileNameTextField.getText(), "UTF-8").replace("+", "%20");
				
    			} catch (UnsupportedEncodingException e) {
					
					e.printStackTrace();
					
				}
    			
    			previewEditorPane.setContentType("plain/text");
				requestNodeChangePermission = true;
    			
    		}
    		else{
				
				previewEditorPane.setContentType("text/html");
				fbprofilenamemsgString = "<span style='font-family: Calibri; font-size: 14pt;'>";
				fbprofilenamemsgString += "<strong>Facebook Profile Name</strong><br><br>";
				fbprofilenamemsgString += "This format will encode your Facebook Profile Name into a QRCode.<br>";
				fbprofilenamemsgString += "This format can be read by mobile devices equipped with a camera and barcode scanning app.";
				
			}
			
			previewEditorPane.setText(fbprofilenamemsgString);
			previewEditorPane.setCaretPosition(0);
    		
    	}
    	else if (jPanelName.equals("facebook like")){
    		
    		if (fbLikeURLTextField.getText().length() > 0){
    			
    			try {
    				
					fblikemsgString = "http://fb.com/plugins/like.php?href=" + URLEncoder.encode(fbLikeURLTextField.getText(), "UTF-8").replace("+", "%20");
				
    			} catch (UnsupportedEncodingException e) {
					
					e.printStackTrace();
					
				}
    			
    			previewEditorPane.setContentType("plain/text");
				requestNodeChangePermission = true;
    			
    		}
    		else{
				
				previewEditorPane.setContentType("text/html");
				fblikemsgString = "<span style='font-family: Calibri; font-size: 14pt;'>";
				fblikemsgString += "<strong>Facebook Like</strong><br><br>";
				fblikemsgString += "This format will encode a URL of your choice into a Facebook Like QRCode.<br>";
				fblikemsgString += "This format can be read by mobile devices equipped with a camera and barcode scanning app.";
				
			}
			
			previewEditorPane.setText(fblikemsgString);
			previewEditorPane.setCaretPosition(0);
    		
    	}
    	else if (jPanelName.equals("twitter profile")){
    		
    		if (twitterProfileTextField.getText().length() > 0){
    			
    			try {
    				
					twitterprofilemsgString = "http://twitter.com/" + URLEncoder.encode(twitterProfileTextField.getText(), "UTF-8").replace("+", "%20");
				
    			} catch (UnsupportedEncodingException e) {
					
					e.printStackTrace();
					
				}
    			
    			previewEditorPane.setContentType("plain/text");
				requestNodeChangePermission = true;
    			
    		}
    		else{
				
				previewEditorPane.setContentType("text/html");
				twitterprofilemsgString = "<span style='font-family: Calibri; font-size: 14pt;'>";
				twitterprofilemsgString += "<strong>Twitter Profile</strong><br><br>";
				twitterprofilemsgString += "This format will encode your Twitter Profile into a QRCode.<br>";
				twitterprofilemsgString += "This format can be read by mobile devices equipped with a camera and barcode scanning app.";
				
			}
			
			previewEditorPane.setText(twitterprofilemsgString);
			previewEditorPane.setCaretPosition(0);
    		
    	}
    	else if (jPanelName.equals("twitter tweet")){
    		
    		if (twitterTweetTextField.getText().length() > 0 && twitterTweetTextField.getText().length() <= 140){
    			
    			try {
    				
					twittertweetmsgString = "http://twitter.com/home?status=" + URLEncoder.encode(twitterTweetTextField.getText(), "UTF-8").replace("+", "%20");
				
    			} catch (UnsupportedEncodingException e) {
					
					e.printStackTrace();
					
				}
    			
    			previewEditorPane.setContentType("plain/text");
				requestNodeChangePermission = true;
    			
    		}
    		else{
				
				previewEditorPane.setContentType("text/html");
				twittertweetmsgString = "<span style='font-family: Calibri; font-size: 14pt;'>";
				twittertweetmsgString += "<strong>Twitter Tweet</strong><br><br>";
				twittertweetmsgString += "This format will encode a Twitter Tweet into a QRCode.<br>";
				twittertweetmsgString += "This format can be read by mobile devices equipped with a camera and barcode scanning app.";
				
			}
			
			previewEditorPane.setText(twittertweetmsgString);
			previewEditorPane.setCaretPosition(0);
    		
    	}
    	else if (jPanelName.equals("linkedin user profile")){
    		
    		if (linkedInUserProfileTextField.getText().length() > 0){
    			
    			try {
    				
					linkedinuserprofilemsgString = "http://linkedin.com/in/" + URLEncoder.encode(linkedInUserProfileTextField.getText(), "UTF-8").replace("+", "%20");
				
    			} catch (UnsupportedEncodingException e) {
					
					e.printStackTrace();
					
				}
    			
    			previewEditorPane.setContentType("plain/text");
				requestNodeChangePermission = true;
    			
    		}
    		else{
				
				previewEditorPane.setContentType("text/html");
				linkedinuserprofilemsgString = "<span style='font-family: Calibri; font-size: 14pt;'>";
				linkedinuserprofilemsgString += "<strong>LinkedIn User Profile</strong><br><br>";
				linkedinuserprofilemsgString += "This format will encode your LinkedIn User Profile into a QRCode.<br>";
				linkedinuserprofilemsgString += "This format can be read by mobile devices equipped with a camera and barcode scanning app.";
				
			}
			
			previewEditorPane.setText(linkedinuserprofilemsgString);
			previewEditorPane.setCaretPosition(0);
    		
    	}
    	else if (jPanelName.equals("linkedin company profile")){
    		
    		if (linkedInCompanyProfileTextField.getText().length() > 0){
    			
    			try {
    				
					linkedincompanyprofilemsgString = "http://linkedin.com/company/" + URLEncoder.encode(linkedInCompanyProfileTextField.getText(), "UTF-8").replace("+", "%20");
				
    			} catch (UnsupportedEncodingException e) {
					
					e.printStackTrace();
					
				}
    			
    			previewEditorPane.setContentType("plain/text");
				requestNodeChangePermission = true;
    			
    		}
    		else{
				
				previewEditorPane.setContentType("text/html");
				linkedincompanyprofilemsgString = "<span style='font-family: Calibri; font-size: 14pt;'>";
				linkedincompanyprofilemsgString += "<strong>LinkedIn Company Profile</strong><br><br>";
				linkedincompanyprofilemsgString += "This format will encode your LinkedIn Company Profile into a QRCode.<br>";
				linkedincompanyprofilemsgString += "This format can be read by mobile devices equipped with a camera and barcode scanning app.";
				
			}
			
			previewEditorPane.setText(linkedincompanyprofilemsgString);
			previewEditorPane.setCaretPosition(0);
    		
    	}
    	else if (jPanelName.equals("linkedin share")){
    		
    		if (linkedInShareTextField.getText().length() > 0){
    			
    			try {
    				
					linkedinsharemsgString = "http://linkedin.com/shareArticle?mini=true&url=" + URLEncoder.encode(linkedInShareTextField.getText(), "UTF-8").replace("+", "%20");
				
    			} catch (UnsupportedEncodingException e) {
					
					e.printStackTrace();
					
				}
    			
    			previewEditorPane.setContentType("plain/text");
				requestNodeChangePermission = true;
    			
    		}
    		else{
				
				previewEditorPane.setContentType("text/html");
				linkedinsharemsgString = "<span style='font-family: Calibri; font-size: 14pt;'>";
				linkedinsharemsgString += "<strong>LinkedIn Share</strong><br><br>";
				linkedinsharemsgString += "This format will encode a URL of your choice into a LinkedIn Share QRCode.<br>";
				linkedinsharemsgString += "This format can be read by mobile devices equipped with a camera and barcode scanning app.";
				
			}
			
			previewEditorPane.setText(linkedinsharemsgString);
			previewEditorPane.setCaretPosition(0);
    		
    	}
    	
    }
    
    private void applyChanges(){
    	
    	updatePreview();
    	((CheckDigitCalculator) mFrame).applyDataAssistantText(previewEditorPane.getText());
    	
    }
    
    private KeyListener fieldKeyListener = new KeyListener() {
		public void keyPressed(KeyEvent e) {
			
		}
			
		public void keyReleased(KeyEvent e) {
			updatePreview();
		}
			
		public void keyTyped(KeyEvent e) {
			
		}
	};
    
    private ActionListener fieldActionListener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			updatePreview();
			
		}
		
	};
	
	class rightClickContextMenu extends JPopupMenu {
	    /**
		 * 
		 */
		private static final long serialVersionUID = -1810028084737028486L;
		JMenuItem selectAllItem;
		JMenuItem copyItem;
		JMenuItem pasteItem;
	    public rightClickContextMenu(final Object sourceComponent){
	    	
	        selectAllItem = new JMenuItem("Select All");
	        selectAllItem.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					
					if(sourceComponent.toString().startsWith("javax.swing.JTextArea")){
						
						JTextArea jTextAreaRef = (JTextArea) sourceComponent;
						jTextAreaRef.requestFocus();
						jTextAreaRef.setSelectionStart(0);
						jTextAreaRef.setSelectionEnd(jTextAreaRef.getText().length());
						
					}
					else if(sourceComponent.toString().startsWith("javax.swing.JTextField")){
						
						JTextField jTextFieldRef = (JTextField) sourceComponent;
						jTextFieldRef.requestFocus();
						jTextFieldRef.setSelectionStart(0);
						jTextFieldRef.setSelectionEnd(jTextFieldRef.getText().length());
						
					}
					
				}});
	        
	        copyItem = new JMenuItem("Copy Selection");
	        copyItem.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					
					if(sourceComponent.toString().startsWith("javax.swing.JTextArea")){
						
						JTextArea jTextAreaRef = (JTextArea) sourceComponent;
						jTextAreaRef.copy();
						
					}
					else if(sourceComponent.toString().startsWith("javax.swing.JTextField")){
						
						JTextField jTextFieldRef = (JTextField) sourceComponent;
						jTextFieldRef.copy();
						
					}
					
				}});
	        
	        pasteItem = new JMenuItem("Paste");
	        pasteItem.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {

					if(sourceComponent.toString().startsWith("javax.swing.JTextArea")){
						
						JTextArea jTextAreaRef = (JTextArea) sourceComponent;
						jTextAreaRef.paste();
						
					}
					else if(sourceComponent.toString().startsWith("javax.swing.JTextField")){
						
						JTextField jTextFieldRef = (JTextField) sourceComponent;
						jTextFieldRef.paste();
						
					}
					
				}});
	        
	        add(selectAllItem);
	        add(copyItem);
	        add(pasteItem);
	        
	    }
	    
	}
	
	class rightClickListener extends MouseAdapter {
	    public void mousePressed(MouseEvent e){
	        if (e.isPopupTrigger())
	            doPop(e);
	    }

	    public void mouseReleased(MouseEvent e){
	        if (e.isPopupTrigger())
	            doPop(e);
	    }

	    private void doPop(MouseEvent e){
	    	rightClickContextMenu menu = new rightClickContextMenu(e.getSource());
	    	menu.setPreferredSize(new Dimension(100, 90));
	        menu.show(e.getComponent(), e.getX(), e.getY());
	    }
	}

	// Then on your component(s)
	//component.addMouseListener(new PopClickListener());
	
	private JScrollPane rawTextTextAreaScrollPane;
	private TableLayout twitterTweetPanelLayout;
	private JPanel twitterTweetPanel;
	private JLabel twitterTweetPanelTitle;
	private JLabel twitterTweetPanelLabel;
	private JTextField twitterTweetTextField;
	private TableLayout linkedInUserProfilePanelLayout;
	private JPanel linkedInUserProfilePanel;
	private JLabel linkedInUserProfilePanelTitle;
	private JLabel linkedInUserProfilePanelLabel;
	private JTextField linkedInUserProfileTextField;
	private TableLayout linkedInCompanyProfilePanelLayout;
	private JPanel linkedInCompanyProfilePanel;
	private JLabel linkedInCompanyProfilePanelTitle;
	private JLabel linkedInCompanyProfilePanelLabel;
	private JTextField linkedInCompanyProfileTextField;
	private TableLayout linkedInSharePanelLayout;
	private JPanel linkedInSharePanel;
	private JLabel linkedInSharePanelTitle;
	private JLabel linkedInSharePanelLabel;
	private JTextField linkedInShareTextField;
	private JPanel mobileEmailMAILTOPanel;
	private JLabel mobileEmailMAILTOPanelTitle;
	private JLabel mobileEmailMAILTOPanelLabel;
	private JLabel mobileEmailMAILTOLabel1;
	private JTextField mobileEmailMAILTOTextField1;
	private JLabel mobileEmailMAILTOLabel2;
	private JTextField mobileEmailMAILTOTextField2;
	private JLabel mobileEmailMAILTOLabel3;
	private JTextArea mobileEmailMAILTOTextArea;
	private JPanel mobileEmailMATMSGPanel;
	private JLabel mobileEmailMATMSGPanelTitle;
	private JLabel mobileEmailMATMSGPanelLabel;
	private JLabel mobileEmailMATMSGLabel1;
	private JTextField mobileEmailMATMSGTextField1;
	private JLabel mobileEmailMATMSGLabel2;
	private JTextField mobileEmailMATMSGTextField2;
	private JLabel mobileEmailMATMSGLabel3;
	private JTextArea mobileEmailMATMSGTextArea;
	private JPanel mobileEmailSMTPPanel;
	private JLabel mobileEmailSMTPPanelTitle;
	private JLabel mobileEmailSMTPPanelLabel;
	private JLabel mobileEmailSMTPLabel1;
	private JTextField mobileEmailSMTPTextField1;
	private JLabel mobileEmailSMTPLabel2;
	private JTextField mobileEmailSMTPTextField2;
	private JLabel mobileEmailSMTPLabel3;
	private JTextArea mobileEmailSMTPTextArea;
	private JLabel vCalendarEventAllDayLabel;
	private JCheckBox vCalendarEventAllDayCheckBox;
	private JFormattedTextField vCalendarEventStartjftf;
	private JFormattedTextField vCalendarEventFinishjftf;
	private JLabel meCardAddBirthdayLabel;
	private JCheckBox meCardAddBirthdayCheckBox;
	private JCheckBox vCardAddBirthdayCheckBox;
	private JLabel vCardAddBirthdayLabel;
	private JScrollPane mobileEmailMAILTOScrollPane;
	private JPanel mobileEmailMAILTOScrollPanePanel;
	private JScrollPane mobileEmailMATMSGScrollPane;
	private JPanel mobileEmailMATMSGScrollPanePanel;
	private JScrollPane mobileEmailSMTPScrollPane;
	private JPanel mobileEmailSMTPScrollPanePanel;
    
    public JPanel getJPanel(String panelName){
    	
    	JPanel panel = new JPanel();
    	
    	//System.out.println(panelName);
    	
    	if (panelName.equals("text")){
    		
    		double[][] rawTextPanelSize = {{20.0, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, 7.0, TableLayout.FILL, 20.0}, // COLUMNS
    				                       {20.0, 20.0, 7.0, 15.0, 7.0, 15.0, 235.0}}; // ROWS
    		TableLayout rawTextPanelLayout = new TableLayout(rawTextPanelSize);
    		rawTextPanelLayout.setHGap(5);
        	rawTextPanelLayout.setVGap(5);
        	
        	rawTextPanel = new JPanel();
        	rawTextPanel.setLayout(rawTextPanelLayout);
        	rawTextPanel.setPreferredSize(new java.awt.Dimension(500, rawTextPanel.getPreferredSize().height));
        	
    		rawTextPanelTitle = new JLabel();
    		rawTextPanelTitle.setFont(new java.awt.Font("Calibri",1,18));
    		rawTextPanelTitle.setText("Raw Data -> Text");
    		rawTextPanel.add(rawTextPanelTitle, "1, 1, 4, 1");
        	
    		rawtextPanelLabel = new JLabel();
    		rawtextPanelLabel.setFont(new java.awt.Font("Calibri",0,14));
    		rawtextPanelLabel.setText("Enter the text you want to encode below.");
    		rawTextPanel.add(rawtextPanelLabel, "1, 3, 5, 3");
    	
    		rawTextTextFieldLabel = new JLabel();
    		rawTextTextFieldLabel.setFont(new java.awt.Font("Calibri",1,14));
    		rawTextTextFieldLabel.setText("Text:");
    		rawTextPanel.add(rawTextTextFieldLabel, "1, 5");
    	
    		rawTextTextArea = new JTextArea();
    		rawTextTextArea.setFont(new java.awt.Font("Calibri",0,14));
    		rawTextTextArea.addMouseListener(new rightClickListener());
    		rawTextTextArea.addKeyListener(fieldKeyListener);
    		
    		rawTextTextAreaScrollPane = new JScrollPane(rawTextTextArea);
    		rawTextTextAreaScrollPane.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		rawTextPanel.add(rawTextTextAreaScrollPane, "1, 6, 5, 6");
    		
    		previewTextArea.setText("");

        	panel = rawTextPanel;
    		
    	}
    	
    	if (panelName.equals("browse to a website")){
    		
    		double[][] mobileWebsitePanelSize = {{20.0, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, 7.0, TableLayout.FILL, 20.0}, // COLUMNS
    				                             {20.0, 20.0, 7.0, 15.0, 10.0, 7.0, 15.0, 30.0, 80.0, TableLayout.FILL, 30.0, 20.0}}; // ROWS
    		TableLayout mobileWebsitePanelLayout = new TableLayout(mobileWebsitePanelSize);
        	mobileWebsitePanelLayout.setHGap(5);
        	mobileWebsitePanelLayout.setVGap(5);
        	
    		mobileWebsitePanel = new JPanel();
        	mobileWebsitePanel.setLayout(mobileWebsitePanelLayout);
        	mobileWebsitePanel.setPreferredSize(new java.awt.Dimension(500, mobileWebsitePanel.getPreferredSize().height));
        	
    		mobileWebsitePanelTitle = new JLabel();
    		mobileWebsitePanelTitle.setFont(new java.awt.Font("Calibri",1,18));
    		mobileWebsitePanelTitle.setText("Mobile Tagging -> Browse to a website");
    		mobileWebsitePanel.add(mobileWebsitePanelTitle, "1, 1, 5, 1");
    	
    		mobileWebsitePanelLabel = new JLabel();
			mobileWebsitePanelLabel.setFont(new java.awt.Font("Calibri",0,14));
			mobileWebsitePanelLabel.setText("Enter the URL you would like users to be taken to when they scan your QRCode.");
			mobileWebsitePanel.add(mobileWebsitePanelLabel, "1, 3, 5, 3");
		
			mobileWebsiteNote = new JLabel();
			mobileWebsiteNote.setFont(new java.awt.Font("Calibri",1,12));
			mobileWebsiteNote.setText("Note: It it recommended to use only capital letters if your web address permits it!");
			mobileWebsitePanel.add(mobileWebsiteNote, "1, 4, 5, 4");
		
			mobileWebsiteURLLabel = new JLabel();
			mobileWebsiteURLLabel.setFont(new java.awt.Font("Calibri",1,14));
			mobileWebsiteURLLabel.setText("URL:");
			mobileWebsitePanel.add(mobileWebsiteURLLabel, "1, 6, 5, 6");
		
			mobileWebsiteURLTextField = new JTextField();
			mobileWebsiteURLTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
			mobileWebsiteURLTextField.setFont(new java.awt.Font("Calibri",0,14));
			mobileWebsiteURLTextField.addMouseListener(new rightClickListener());
    		mobileWebsiteURLTextField.addKeyListener(fieldKeyListener);
			mobileWebsitePanel.add(mobileWebsiteURLTextField, "1, 7, 5, 7");
    		
			panel = mobileWebsitePanel;
    		
    	}
    	
    	if (panelName.equals("make a phone call")){
    		
    		double[][] mobileCallPanelSize = {{20.0, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, 7.0, TableLayout.FILL, 20.0}, // COLUMNS
    				                          {20.0, 20.0, 7.0, 15.0, 10.0, 7.0, 15.0, 30.0, 80.0, TableLayout.FILL, 30.0, 20.0}}; // ROWS
    		TableLayout mobileCallPanelLayout = new TableLayout(mobileCallPanelSize);
        	mobileCallPanelLayout.setHGap(5);
        	mobileCallPanelLayout.setVGap(5);
        	
    		mobileCallPanel = new JPanel();
        	mobileCallPanel.setLayout(mobileCallPanelLayout);
        	mobileCallPanel.setPreferredSize(new java.awt.Dimension(500, mobileCallPanel.getPreferredSize().height));
        	
    		mobileCallPanelTitle = new JLabel();
    		mobileCallPanelTitle.setFont(new java.awt.Font("Calibri",1,18));
    		mobileCallPanelTitle.setText("Mobile Tagging -> Make a phone Call");
    		mobileCallPanel.add(mobileCallPanelTitle, "1, 1, 4, 1");

    		mobileCallPanelLabel = new JLabel();
    		mobileCallPanelLabel.setFont(new java.awt.Font("Calibri",0,14));
    		mobileCallPanelLabel.setText("Enter the phone # you want to encode below.");
    		mobileCallPanel.add(mobileCallPanelLabel, "1, 3, 5, 3");

    		mobileCallNote = new JLabel();
    		mobileCallNote.setFont(new java.awt.Font("Calibri",1,12));
    		mobileCallNote.setText("Note: Phone numbers should be entered without puctuation!");
    		mobileCallPanel.add(mobileCallNote, "1, 4, 5, 4");

    		mobileCallLabel = new JLabel();
    		mobileCallLabel.setFont(new java.awt.Font("Calibri",1,14));
    		mobileCallLabel.setText("Phone #:");
    		mobileCallPanel.add(mobileCallLabel, "1, 6, 5, 6");
    		
    		mobileCallTextField = new JTextField();
    		mobileCallTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		mobileCallTextField.setFont(new java.awt.Font("Calibri",0,14));
    		mobileCallTextField.addMouseListener(new rightClickListener());
    		mobileCallTextField.addKeyListener(fieldKeyListener);
    		mobileCallPanel.add(mobileCallTextField, "1, 7, 5, 7");
        	
        	panel = mobileCallPanel;
    		
    	}
    	
    	if (panelName.equals("send an e-mail (matmsg)")){
    		
    		double[][] mobileEmailMATMSGPanelSize = {{20.0, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, 7.0, TableLayout.FILL, 20.0}, // COLUMNS
    				                                 {20.0, 20.0, 7.0, 15.0, 7.0, 15.0, 30.0, 7.0, 15.0, 30.0, 7.0, 15.0, 80.0, 80.0, 7.0}}; // ROWS
    		TableLayout mobileEmailMATMSGPanelLayout = new TableLayout(mobileEmailMATMSGPanelSize);
        	mobileEmailMATMSGPanelLayout.setHGap(5);
        	mobileEmailMATMSGPanelLayout.setVGap(5);
        	
    		mobileEmailMATMSGPanel = new JPanel();
        	mobileEmailMATMSGPanel.setLayout(mobileEmailMATMSGPanelLayout);
        	mobileEmailMATMSGPanel.setPreferredSize(new java.awt.Dimension(500, mobileEmailMATMSGPanel.getPreferredSize().height));
        	
    		mobileEmailMATMSGPanelTitle = new JLabel();
    		mobileEmailMATMSGPanelTitle.setFont(new java.awt.Font("Calibri",1,18));
    		mobileEmailMATMSGPanelTitle.setText("Mobile Tagging -> Send an e-mail (MATMSG)");
    		mobileEmailMATMSGPanel.add(mobileEmailMATMSGPanelTitle, "1, 1, 4, 1");

    		mobileEmailMATMSGPanelLabel = new JLabel();
    		mobileEmailMATMSGPanelLabel.setFont(new java.awt.Font("Calibri",0,14));
    		mobileEmailMATMSGPanelLabel.setText("Enter the e-mail address, subject and body of the message you want to encode below.");
    		mobileEmailMATMSGPanel.add(mobileEmailMATMSGPanelLabel, "1, 3, 5, 3");

    		mobileEmailMATMSGLabel1 = new JLabel();
    		mobileEmailMATMSGLabel1.setFont(new java.awt.Font("Calibri",1,14));
    		mobileEmailMATMSGLabel1.setText("E-mail address:");
    		mobileEmailMATMSGPanel.add(mobileEmailMATMSGLabel1, "1, 5, 5, 5");

    		mobileEmailMATMSGTextField1 = new JTextField();
			mobileEmailMATMSGTextField1.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
			mobileEmailMATMSGTextField1.setFont(new java.awt.Font("Calibri",0,14));
			mobileEmailMATMSGTextField1.addMouseListener(new rightClickListener());
    		mobileEmailMATMSGTextField1.addKeyListener(fieldKeyListener);
    		mobileEmailMATMSGPanel.add(mobileEmailMATMSGTextField1, "1, 6, 5, 6");

    		mobileEmailMATMSGLabel2 = new JLabel();
    		mobileEmailMATMSGLabel2.setFont(new java.awt.Font("Calibri",1,14));
    		mobileEmailMATMSGLabel2.setText("Subject: (Optional)");
    		mobileEmailMATMSGPanel.add(mobileEmailMATMSGLabel2, "1, 8");

    		mobileEmailMATMSGTextField2 = new JTextField();
    		mobileEmailMATMSGTextField2.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		mobileEmailMATMSGTextField2.setFont(new java.awt.Font("Calibri",0,14));
    		mobileEmailMATMSGTextField2.addMouseListener(new rightClickListener());
    		mobileEmailMATMSGTextField2.addKeyListener(fieldKeyListener);
    		mobileEmailMATMSGPanel.add(mobileEmailMATMSGTextField2, "1, 9, 5, 9");

    		mobileEmailMATMSGLabel3 = new JLabel();
    		mobileEmailMATMSGLabel3.setFont(new java.awt.Font("Calibri",1,14));
    		mobileEmailMATMSGLabel3.setText("Message: (Optional)");
    		mobileEmailMATMSGPanel.add(mobileEmailMATMSGLabel3, "1, 11, 2, 11");

    		mobileEmailMATMSGTextArea = new JTextArea();
    		mobileEmailMATMSGTextArea.setFont(new java.awt.Font("Calibri",0,14));
    		mobileEmailMATMSGTextArea.addMouseListener(new rightClickListener());
    		mobileEmailMATMSGTextArea.addKeyListener(fieldKeyListener);
    		mobileEmailMATMSGTextArea.addFocusListener(fieldFocusListener(null));
    		
    		mobileEmailMATMSGScrollPane = new JScrollPane(mobileEmailMATMSGTextArea);
    		mobileEmailMATMSGScrollPane.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		
    		mobileEmailMATMSGScrollPanePanel = new JPanel(new BorderLayout());
    		mobileEmailMATMSGScrollPanePanel.add(mobileEmailMATMSGScrollPane, BorderLayout.CENTER);
    		mobileEmailMATMSGPanel.add(mobileEmailMATMSGScrollPanePanel, "1, 12, 5, 13");

        	panel = mobileEmailMATMSGPanel;
    		
    	}
    	
    	if (panelName.equals("send an e-mail (mailto)")){
    		
    		double[][] mobileEmailMAILTOPanelSize = {{20.0, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, 7.0, TableLayout.FILL, 20.0}, // COLUMNS
    				                                 {20.0, 20.0, 7.0, 15.0, 7.0, 15.0, 30.0, 7.0, 15.0, 30.0, 7.0, 15.0, 80.0, 80.0, 7.0}}; // ROWS
    		TableLayout mobileEmailMAILTOPanelLayout = new TableLayout(mobileEmailMAILTOPanelSize);
        	mobileEmailMAILTOPanelLayout.setHGap(5);
        	mobileEmailMAILTOPanelLayout.setVGap(5);
        	
    		mobileEmailMAILTOPanel = new JPanel();
        	mobileEmailMAILTOPanel.setLayout(mobileEmailMAILTOPanelLayout);
        	mobileEmailMAILTOPanel.setPreferredSize(new java.awt.Dimension(500, mobileEmailMAILTOPanel.getPreferredSize().height));
        	
    		mobileEmailMAILTOPanelTitle = new JLabel();
    		mobileEmailMAILTOPanelTitle.setFont(new java.awt.Font("Calibri",1,18));
    		mobileEmailMAILTOPanelTitle.setText("Mobile Tagging -> Send an e-mail (MAILTO)");
    		mobileEmailMAILTOPanel.add(mobileEmailMAILTOPanelTitle, "1, 1, 4, 1");

    		mobileEmailMAILTOPanelLabel = new JLabel();
    		mobileEmailMAILTOPanelLabel.setFont(new java.awt.Font("Calibri",0,14));
    		mobileEmailMAILTOPanelLabel.setText("Enter the e-mail address, subject and body of the message you want to encode below.");
    		mobileEmailMAILTOPanel.add(mobileEmailMAILTOPanelLabel, "1, 3, 5, 3");

    		mobileEmailMAILTOLabel1 = new JLabel();
    		mobileEmailMAILTOLabel1.setFont(new java.awt.Font("Calibri",1,14));
    		mobileEmailMAILTOLabel1.setText("E-mail address:");
    		mobileEmailMAILTOPanel.add(mobileEmailMAILTOLabel1, "1, 5, 5, 5");

    		mobileEmailMAILTOTextField1 = new JTextField();
			mobileEmailMAILTOTextField1.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
			mobileEmailMAILTOTextField1.setFont(new java.awt.Font("Calibri",0,14));
			mobileEmailMAILTOTextField1.addMouseListener(new rightClickListener());
    		mobileEmailMAILTOTextField1.addKeyListener(fieldKeyListener);
    		mobileEmailMAILTOPanel.add(mobileEmailMAILTOTextField1, "1, 6, 5, 6");

    		mobileEmailMAILTOLabel2 = new JLabel();
    		mobileEmailMAILTOLabel2.setFont(new java.awt.Font("Calibri",1,14));
    		mobileEmailMAILTOLabel2.setText("Subject: (Optional)");
    		mobileEmailMAILTOPanel.add(mobileEmailMAILTOLabel2, "1, 8");

    		mobileEmailMAILTOTextField2 = new JTextField();
    		mobileEmailMAILTOTextField2.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
			mobileEmailMAILTOTextField2.setFont(new java.awt.Font("Calibri",0,14));
    		mobileEmailMAILTOTextField2.addMouseListener(new rightClickListener());
    		mobileEmailMAILTOTextField2.addKeyListener(fieldKeyListener);
    		mobileEmailMAILTOPanel.add(mobileEmailMAILTOTextField2, "1, 9, 5, 9");

    		mobileEmailMAILTOLabel3 = new JLabel();
    		mobileEmailMAILTOLabel3.setFont(new java.awt.Font("Calibri",1,14));
    		mobileEmailMAILTOLabel3.setText("Message: (Optional)");
    		mobileEmailMAILTOPanel.add(mobileEmailMAILTOLabel3, "1, 11, 2, 11");

    		mobileEmailMAILTOTextArea = new JTextArea();
    		mobileEmailMAILTOTextArea.setFont(new java.awt.Font("Calibri",0,14));
    		mobileEmailMAILTOTextArea.addMouseListener(new rightClickListener());
    		mobileEmailMAILTOTextArea.addKeyListener(fieldKeyListener);
    		mobileEmailMAILTOTextArea.addFocusListener(fieldFocusListener(null));
    		
    		mobileEmailMAILTOScrollPane = new JScrollPane(mobileEmailMAILTOTextArea);
    		mobileEmailMAILTOScrollPane.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		
    		mobileEmailMAILTOScrollPanePanel = new JPanel(new BorderLayout());
    		mobileEmailMAILTOScrollPanePanel.add(mobileEmailMAILTOScrollPane, BorderLayout.CENTER);
    		mobileEmailMAILTOPanel.add(mobileEmailMAILTOScrollPanePanel, "1, 12, 5, 13");

        	panel = mobileEmailMAILTOPanel;
    		
    	}
    	
    	if (panelName.equals("send an e-mail (smtp)")){
    		
    		double[][] mobileEmailSMTPPanelSize = {{20.0, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, 7.0, TableLayout.FILL, 20.0}, // COLUMNS
    				                               {20.0, 20.0, 7.0, 15.0, 7.0, 15.0, 30.0, 7.0, 15.0, 30.0, 7.0, 15.0, 80.0, 80.0, 7.0}}; // ROWS
    		TableLayout mobileEmailSMTPPanelLayout = new TableLayout(mobileEmailSMTPPanelSize);
        	mobileEmailSMTPPanelLayout.setHGap(5);
        	mobileEmailSMTPPanelLayout.setVGap(5);
        	
    		mobileEmailSMTPPanel = new JPanel();
        	mobileEmailSMTPPanel.setLayout(mobileEmailSMTPPanelLayout);
        	mobileEmailSMTPPanel.setPreferredSize(new java.awt.Dimension(500, mobileEmailSMTPPanel.getPreferredSize().height));
        	
    		mobileEmailSMTPPanelTitle = new JLabel();
    		mobileEmailSMTPPanelTitle.setFont(new java.awt.Font("Calibri",1,18));
    		mobileEmailSMTPPanelTitle.setText("Mobile Tagging -> Send an e-mail (SMTP)");
    		mobileEmailSMTPPanel.add(mobileEmailSMTPPanelTitle, "1, 1, 4, 1");

    		mobileEmailSMTPPanelLabel = new JLabel();
    		mobileEmailSMTPPanelLabel.setFont(new java.awt.Font("Calibri",0,14));
    		mobileEmailSMTPPanelLabel.setText("Enter the e-mail address, subject and body of the message you want to encode below.");
    		mobileEmailSMTPPanel.add(mobileEmailSMTPPanelLabel, "1, 3, 5, 3");

    		mobileEmailSMTPLabel1 = new JLabel();
    		mobileEmailSMTPLabel1.setFont(new java.awt.Font("Calibri",1,14));
    		mobileEmailSMTPLabel1.setText("E-mail address:");
    		mobileEmailSMTPPanel.add(mobileEmailSMTPLabel1, "1, 5, 5, 5");

    		mobileEmailSMTPTextField1 = new JTextField();
			mobileEmailSMTPTextField1.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
			mobileEmailSMTPTextField1.setFont(new java.awt.Font("Calibri",0,14));
			mobileEmailSMTPTextField1.addMouseListener(new rightClickListener());
    		mobileEmailSMTPTextField1.addKeyListener(fieldKeyListener);
    		mobileEmailSMTPPanel.add(mobileEmailSMTPTextField1, "1, 6, 5, 6");

    		mobileEmailSMTPLabel2 = new JLabel();
    		mobileEmailSMTPLabel2.setFont(new java.awt.Font("Calibri",1,14));
    		mobileEmailSMTPLabel2.setText("Subject: (Optional)");
    		mobileEmailSMTPPanel.add(mobileEmailSMTPLabel2, "1, 8");

    		mobileEmailSMTPTextField2 = new JTextField();
    		mobileEmailSMTPTextField2.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
			mobileEmailSMTPTextField2.setFont(new java.awt.Font("Calibri",0,14));
    		mobileEmailSMTPTextField2.addMouseListener(new rightClickListener());
    		mobileEmailSMTPTextField2.addKeyListener(fieldKeyListener);
    		mobileEmailSMTPPanel.add(mobileEmailSMTPTextField2, "1, 9, 5, 9");

    		mobileEmailSMTPLabel3 = new JLabel();
    		mobileEmailSMTPLabel3.setFont(new java.awt.Font("Calibri",1,14));
    		mobileEmailSMTPLabel3.setText("Message: (Optional)");
    		mobileEmailSMTPPanel.add(mobileEmailSMTPLabel3, "1, 11, 2, 11");

    		mobileEmailSMTPTextArea = new JTextArea();
			mobileEmailSMTPTextArea.setFont(new java.awt.Font("Calibri",0,14));
    		mobileEmailSMTPTextArea.addMouseListener(new rightClickListener());
    		mobileEmailSMTPTextArea.addKeyListener(fieldKeyListener);
    		mobileEmailSMTPTextArea.addFocusListener(fieldFocusListener(null));
    		
    		mobileEmailSMTPScrollPane = new JScrollPane(mobileEmailSMTPTextArea);
    		mobileEmailSMTPScrollPane.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		
    		mobileEmailSMTPScrollPanePanel = new JPanel(new BorderLayout());
    		mobileEmailSMTPScrollPanePanel.add(mobileEmailSMTPScrollPane, BorderLayout.CENTER);
    		mobileEmailSMTPPanel.add(mobileEmailSMTPScrollPanePanel, "1, 12, 5, 13");

        	panel = mobileEmailSMTPPanel;
    		
    	}
    	
    	if (panelName.equals("send an sms")){
    		
    		double[][] smsPanelSize = {{20.0, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, 7.0, TableLayout.FILL, 20.0}, // COLUMNS
    				                   {20.0, 20.0, 7.0, 15.0, 7.0, 15.0, 30.0, 7.0, 15.0, 80.0, 80.0, 15.0}};
    		TableLayout smsPanelLayout = new TableLayout(smsPanelSize);
    		smsPanelLayout.setHGap(5);
        	smsPanelLayout.setVGap(5);
        	
        	mobileSMSPanel = new JPanel();
        	mobileSMSPanel.setLayout(smsPanelLayout);
        	mobileSMSPanel.setPreferredSize(new java.awt.Dimension(500, mobileSMSPanel.getPreferredSize().height));

    		mobileSMSPanelTitle = new JLabel();
    		mobileSMSPanelTitle.setFont(new java.awt.Font("Calibri",1,18));
    		mobileSMSPanelTitle.setText("Mobile Tagging -> Send an SMS");
    		mobileSMSPanel.add(mobileSMSPanelTitle, "1, 1, 4, 1");

    		mobileSMSPanelLabel = new JLabel();
    		mobileSMSPanelLabel.setFont(new java.awt.Font("Calibri",0,14));
    		mobileSMSPanelLabel.setText("Enter the SMS # and body of the message you want to encode below.");
    		mobileSMSPanel.add(mobileSMSPanelLabel, "1, 3, 5, 3");

			mobileSMSLabel1 = new JLabel();
    		mobileSMSLabel1.setFont(new java.awt.Font("Calibri",1,14));
    		mobileSMSLabel1.setText("SMS #:");
    		mobileSMSPanel.add(mobileSMSLabel1, "1, 5, 5, 5");

    		mobileSMSTextField1 = new JTextField();
			mobileSMSTextField1.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
			mobileSMSTextField1.setFont(new java.awt.Font("Calibri",0,14));
			mobileSMSTextField1.addMouseListener(new rightClickListener());
    		mobileSMSTextField1.addKeyListener(fieldKeyListener);
    		mobileSMSPanel.add(mobileSMSTextField1, "1, 6, 5, 6");

    		mobileSMSLabel2 = new JLabel();
    		mobileSMSLabel2.setFont(new java.awt.Font("Calibri",1,14));
    		mobileSMSLabel2.setText("Message: (Optional)");
    		mobileSMSPanel.add(mobileSMSLabel2, "1, 8, 2, 8");

    		mobileSMSTextArea = new JTextArea();
    		mobileSMSTextArea.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
			mobileSMSTextArea.setFont(new java.awt.Font("Calibri",0,14));
    		mobileSMSTextArea.addMouseListener(new rightClickListener());
    		mobileSMSTextArea.addKeyListener(fieldKeyListener);
    		mobileSMSPanel.add(mobileSMSTextArea, "1, 9, 5, 10");
        	
        	panel = mobileSMSPanel;
    		
    	}
    	
    	if (panelName.equals("mecard business card")){
    		
    		double[][] mecardPanelSize = {{20.0, TableLayout.FILL, 7.0, TableLayout.FILL, 5.0, TableLayout.FILL, 7.0, TableLayout.FILL, 20.0}, // COLUMNS
    				                      {20.0, 20.0, 7.0, 15.0, 7.0, 15.0, 30.0, 7.0, 15.0, 30.0, 7.0, 15.0, 30.0, 7.0, 15.0, 30.0, 7.0, 15.0, 30.0, 7.0, 15.0, 30.0, 7.0, 15.0, 30.0, 7.0, 15.0, 30.0, 7.0, 15.0, 30.0, 7.0}}; // ROWS
    		TableLayout mecardPanelLayout = new TableLayout(mecardPanelSize);
        	mecardPanelLayout.setHGap(5);
        	mecardPanelLayout.setVGap(5);
        	
        	meCardPanel = new JPanel();
        	meCardPanel.setLayout(mecardPanelLayout);
        	meCardPanel.setPreferredSize(new java.awt.Dimension(500, meCardPanel.getPreferredSize().height));

    		meCardPanelTitle = new JLabel();
    		meCardPanelTitle.setFont(new java.awt.Font("Calibri",1,18));
    		meCardPanelTitle.setText("Business Cards -> MeCard Business Card");
    		meCardPanel.add(meCardPanelTitle, "1, 1, 7, 1");

    		meCardPanelLabel = new JLabel();
    		meCardPanelLabel.setFont(new java.awt.Font("Calibri",0,14));
    		meCardPanelLabel.setText("Fill out the fields below to encode your contact information into a QRCode.");
    		meCardPanel.add(meCardPanelLabel, "1, 3, 7, 3");

    		meCardFirstNameLabel = new JLabel();
    		meCardFirstNameLabel.setFont(new java.awt.Font("Calibri",1,14));
    		meCardFirstNameLabel.setText("First Name:");
    		meCardPanel.add(meCardFirstNameLabel, "1, 5");

    		meCardFirstNameTextField = new JTextField();
    		meCardFirstNameTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		meCardFirstNameTextField.setFont(new java.awt.Font("Calibri",0,14));
    		meCardFirstNameTextField.addMouseListener(new rightClickListener());
    		meCardFirstNameTextField.addKeyListener(fieldKeyListener);
    		meCardFirstNameTextField.addFocusListener(fieldFocusListener(null));
    		meCardPanel.add(meCardFirstNameTextField, "1, 6, 3, 6");

    		meCardLastNameLabel = new JLabel();
    		meCardLastNameLabel.setFont(new java.awt.Font("Calibri",1,14));
    		meCardLastNameLabel.setText("Last Name:");
    		meCardPanel.add(meCardLastNameLabel, "5, 5");

    		meCardLastNameTextField = new JTextField();
    		meCardLastNameTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		meCardLastNameTextField.setFont(new java.awt.Font("Calibri",0,14));
    		meCardLastNameTextField.addMouseListener(new rightClickListener());
    		meCardLastNameTextField.addKeyListener(fieldKeyListener);
    		meCardLastNameTextField.addFocusListener(fieldFocusListener(null));
    		meCardPanel.add(meCardLastNameTextField, "5, 6, 7, 6");

    		meCardAddressLabel = new JLabel();
    		meCardAddressLabel.setFont(new java.awt.Font("Calibri",1,14));
    		meCardAddressLabel.setText("Address:");
    		meCardPanel.add(meCardAddressLabel, "1, 8, 2, 8");

    		meCardAddressTextField = new JTextField();
    		meCardAddressTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		meCardAddressTextField.setFont(new java.awt.Font("Calibri",0,14));
    		meCardAddressTextField.addMouseListener(new rightClickListener());
    		meCardAddressTextField.addKeyListener(fieldKeyListener);
    		meCardAddressTextField.addFocusListener(fieldFocusListener(null));
    		meCardPanel.add(meCardAddressTextField, "1, 9, 7, 9");

    		meCardCityLabel = new JLabel();
    		meCardCityLabel.setFont(new java.awt.Font("Calibri",1,14));
    		meCardCityLabel.setText("City:");
    		meCardPanel.add(meCardCityLabel, "1, 11");

    		meCardCityTextField = new JTextField();
    		meCardCityTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		meCardCityTextField.setFont(new java.awt.Font("Calibri",0,14));
    		meCardCityTextField.addMouseListener(new rightClickListener());
    		meCardCityTextField.addKeyListener(fieldKeyListener);
    		meCardCityTextField.addFocusListener(fieldFocusListener(null));
    		meCardPanel.add(meCardCityTextField, "1, 12, 3, 12");

    		meCardProvinceLabel = new JLabel();
    		meCardPanel.add(meCardProvinceLabel, "5, 11");
    		meCardProvinceLabel.setText("Province/State:");
    		meCardProvinceLabel.setFont(new java.awt.Font("Calibri",1,14));

    		meCardProvinceTextField = new JTextField();
    		meCardPanel.add(meCardProvinceTextField, "5, 12, 7, 12");
    		meCardProvinceTextField.setFont(new java.awt.Font("Calibri",0,14));
    		meCardProvinceTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		meCardProvinceTextField.addMouseListener(new rightClickListener());
    		meCardProvinceTextField.addKeyListener(fieldKeyListener);
    		meCardProvinceTextField.addFocusListener(fieldFocusListener(null));

    		meCardPostalLabel = new JLabel();
    		meCardPanel.add(meCardPostalLabel, "1, 14");
    		meCardPostalLabel.setText("Postal/Zip Code:");
    		meCardPostalLabel.setFont(new java.awt.Font("Calibri",1,14));

    		meCardPostalTextField = new JTextField();
    		meCardPanel.add(meCardPostalTextField, "1, 15, 3, 15");
    		meCardPostalTextField.setFont(new java.awt.Font("Calibri",0,14));
    		meCardPostalTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		meCardPostalTextField.addMouseListener(new rightClickListener());
    		meCardPostalTextField.addKeyListener(fieldKeyListener);
    		meCardPostalTextField.addFocusListener(fieldFocusListener(null));

    		meCardCountryLabel = new JLabel();
    		meCardPanel.add(meCardCountryLabel, "5, 14");
    		meCardCountryLabel.setText("Country:");
    		meCardCountryLabel.setFont(new java.awt.Font("Calibri",1,14));

    		meCardCountryTextField = new JTextField();
    		meCardPanel.add(meCardCountryTextField, "5, 15, 7, 15");
    		meCardCountryTextField.setFont(new java.awt.Font("Calibri",0,14));
    		meCardCountryTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		meCardCountryTextField.addMouseListener(new rightClickListener());
    		meCardCountryTextField.addKeyListener(fieldKeyListener);
    		meCardCountryTextField.addFocusListener(fieldFocusListener(null));

    		meCardPhoneLabel = new JLabel();
    		meCardPanel.add(meCardPhoneLabel, "1, 17");
    		meCardPhoneLabel.setText("Phone #:");
    		meCardPhoneLabel.setFont(new java.awt.Font("Calibri",1,14));

    		meCardPhoneTextField = new JTextField();
    		meCardPanel.add(meCardPhoneTextField, "1, 18, 3, 18");
    		meCardPhoneTextField.setFont(new java.awt.Font("Calibri",0,14));
    		meCardPhoneTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		meCardPhoneTextField.addMouseListener(new rightClickListener());
    		meCardPhoneTextField.addKeyListener(fieldKeyListener);
    		meCardPhoneTextField.addFocusListener(fieldFocusListener(null));

    		meCardVideoPhoneLabel = new JLabel();
    		meCardPanel.add(meCardVideoPhoneLabel, "5, 17");
    		meCardVideoPhoneLabel.setText("Video Phone #:");
    		meCardVideoPhoneLabel.setFont(new java.awt.Font("Calibri",1,14));

    		meCardVideoPhoneTextField = new JTextField();
    		meCardPanel.add(meCardVideoPhoneTextField, "5, 18, 7, 18");
    		meCardVideoPhoneTextField.setFont(new java.awt.Font("Calibri",0,14));
    		meCardVideoPhoneTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		meCardVideoPhoneTextField.addMouseListener(new rightClickListener());
    		meCardVideoPhoneTextField.addKeyListener(fieldKeyListener);
    		meCardVideoPhoneTextField.addFocusListener(fieldFocusListener(null));

    		meCardEmailLabel = new JLabel();
    		meCardPanel.add(meCardEmailLabel, "1, 20");
    		meCardEmailLabel.setText("E-mail:");
    		meCardEmailLabel.setFont(new java.awt.Font("Calibri",1,14));

    		meCardEmailTextField = new JTextField();
    		meCardPanel.add(meCardEmailTextField, "1, 21, 7, 21");
    		meCardEmailTextField.setFont(new java.awt.Font("Calibri",0,14));
    		meCardEmailTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		meCardEmailTextField.addMouseListener(new rightClickListener());
    		meCardEmailTextField.addKeyListener(fieldKeyListener);
    		meCardEmailTextField.addFocusListener(fieldFocusListener(null));

    		meCardWebsiteLabel = new JLabel();
    		meCardPanel.add(meCardWebsiteLabel, "1, 23");
    		meCardWebsiteLabel.setText("Website:");
    		meCardWebsiteLabel.setFont(new java.awt.Font("Calibri",1,14));

    		meCardWebsiteTextField = new JTextField();
    		meCardPanel.add(meCardWebsiteTextField, "1, 24, 7, 24");
    		meCardWebsiteTextField.setFont(new java.awt.Font("Calibri",0,14));
    		meCardWebsiteTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		meCardWebsiteTextField.addMouseListener(new rightClickListener());
    		meCardWebsiteTextField.addKeyListener(fieldKeyListener);
    		meCardWebsiteTextField.addFocusListener(fieldFocusListener(null));

    		meCardAddBirthdayLabel = new JLabel();
    		meCardPanel.add(meCardAddBirthdayLabel, "1, 26");
    		meCardAddBirthdayLabel.setText("Add Birthday:");
    		meCardAddBirthdayLabel.setFont(new java.awt.Font("Calibri",1,14));

    		meCardAddBirthdayCheckBox = new JCheckBox();
    		meCardPanel.add(meCardAddBirthdayCheckBox, "1, 27, 1, 27, L, C");
    		meCardAddBirthdayCheckBox.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		meCardAddBirthdayCheckBox.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					
					if (meCardAddBirthdayCheckBox.isSelected()){
						
						meCardBirthdayLabel.setEnabled(true);
						meCardDateChooser.setEnabled(true);
						updatePreview();
						
					}
					else{
						
						meCardBirthdayLabel.setEnabled(false);
						meCardDateChooser.setEnabled(false);
						updatePreview();
						
					}
					
				}});

    		meCardBirthdayLabel = new JLabel();
    		meCardBirthdayLabel.setEnabled(false);
    		meCardPanel.add(meCardBirthdayLabel, "1, 29");
    		meCardBirthdayLabel.setText("Birthday:");

    		meCardDateChooser = new JDateChooser("MM/dd/yyyy", "##/##/####", '_');
    		meCardDateChooser.setEnabled(false);
    		meCardDateChooser.setDate(new Date());
    		meCardDateChooser.setFont(new Font("Calibri", 0, 14));
    		meCardDateChooser.getCalendarButton().setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		meCardDateChooser.getDateEditor().getUiComponent().setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		meCardPanel.add(meCardDateChooser, "1, 30, 3, 30");
    		meCardDateChooser.getDateEditor().getUiComponent().addKeyListener(fieldKeyListener);
    		meCardDateChooser.getDateEditor().getUiComponent().addFocusListener(fieldFocusListener(null));
    		meCardDateChooser.addPropertyChangeListener(new PropertyChangeListener() {

                @Override
                public void propertyChange(PropertyChangeEvent evt) {
                    if (evt.getPropertyName().equals("date")) {
                        updatePreview();
                        meCardDateChooser.getDateEditor().getUiComponent().requestFocusInWindow();
                    }
                }
            });
    		
    		panel = meCardPanel;
    		
    	}
    	
    	if (panelName.equals("vcard business card")){
    		
    		double[][] vCardPanelSize = {{20.0, TableLayout.FILL, 7.0, TableLayout.FILL, 5.0, TableLayout.FILL, 7.0, TableLayout.FILL, 20.0}, // COLUMNS
    				                     {20.0, 20.0, 7.0, 15.0, 7.0, 15.0, 30.0, 7.0, 15.0, 30.0, 7.0, 15.0, 30.0, 7.0, 15.0, 30.0, 7.0, 15.0, 30.0, 7.0, 15.0, 30.0, 7.0, 15.0, 30.0, 14.0, 15.0, 30.0, 7.0, 15.0, 30.0, 7.0, 15.0, 30.0, 7.0, 15.0, 30.0, 7.0}}; // ROWS
    		TableLayout vCardPanelLayout = new TableLayout(vCardPanelSize);
        	vCardPanelLayout.setHGap(5);
        	vCardPanelLayout.setVGap(5);
        	vCardPanel = new JPanel();
        	vCardPanel.setLayout(vCardPanelLayout);
        	vCardPanel.setPreferredSize(new java.awt.Dimension(500, vCardPanel.getPreferredSize().height));

    		vCardPanelTitle = new JLabel();
    		vCardPanel.add(vCardPanelTitle, "1, 1, 7, 1");
    		vCardPanelTitle.setText("Business Cards -> vCard Business Card");
    		vCardPanelTitle.setFont(new java.awt.Font("Calibri",1,18));

    		vCardPanelLabel = new JLabel();
    		vCardPanel.add(vCardPanelLabel, "1, 3, 7, 3");
    		vCardPanelLabel.setText("Fill out the fields below to encode your contact information into a QRCode.");
    		vCardPanelLabel.setFont(new java.awt.Font("Calibri",0,14));

    		vCardFirstNameLabel = new JLabel();
    		vCardPanel.add(vCardFirstNameLabel, "1, 5");
    		vCardFirstNameLabel.setText("First Name:");
    		vCardFirstNameLabel.setFont(new java.awt.Font("Calibri",1,14));

    		vCardFirstNameTextField = new JTextField();
    		vCardPanel.add(vCardFirstNameTextField, "1, 6, 3, 6");
    		vCardFirstNameTextField.setFont(new java.awt.Font("Calibri",0,14));
    		vCardFirstNameTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		vCardFirstNameTextField.addMouseListener(new rightClickListener());
    		vCardFirstNameTextField.addKeyListener(fieldKeyListener);
    		vCardFirstNameTextField.addFocusListener(fieldFocusListener(null));

    		vCardLastNameLabel = new JLabel();
    		vCardPanel.add(vCardLastNameLabel, "5, 5");
    		vCardLastNameLabel.setText("Last Name:");
    		vCardLastNameLabel.setFont(new java.awt.Font("Calibri",1,14));

    		vCardLastNameTextField = new JTextField();
    		vCardPanel.add(vCardLastNameTextField, "5, 6, 7, 6");
    		vCardLastNameTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		vCardLastNameTextField.addMouseListener(new rightClickListener());
    		vCardLastNameTextField.setFont(new java.awt.Font("Calibri",0,14));
    		vCardLastNameTextField.addKeyListener(fieldKeyListener);
    		vCardLastNameTextField.addFocusListener(fieldFocusListener(null));

    		vCardOrganizationLabel = new JLabel();
    		vCardPanel.add(vCardOrganizationLabel, "1, 8");
    		vCardOrganizationLabel.setText("Organization:");
    		vCardOrganizationLabel.setFont(new java.awt.Font("Calibri",1,14));

    		vCardOrganizationTextField = new JTextField();
    		vCardPanel.add(vCardOrganizationTextField, "1, 9, 3, 9");
    		vCardOrganizationTextField.setFont(new java.awt.Font("Calibri",0,14));
    		vCardOrganizationTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		vCardOrganizationTextField.addMouseListener(new rightClickListener());
    		vCardOrganizationTextField.addKeyListener(fieldKeyListener);
    		vCardOrganizationTextField.addFocusListener(fieldFocusListener(null));

    		vCardJobTitleLabel = new JLabel();
    		vCardPanel.add(vCardJobTitleLabel, "5, 8");
    		vCardJobTitleLabel.setText("Job Title");
    		vCardJobTitleLabel.setFont(new java.awt.Font("Calibri",1,14));

    		vCardJobTitleTextField = new JTextField();
    		vCardPanel.add(vCardJobTitleTextField, "5, 9, 7, 9");
    		vCardJobTitleTextField.setFont(new java.awt.Font("Calibri",0,14));
    		vCardJobTitleTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		vCardJobTitleTextField.addMouseListener(new rightClickListener());
    		vCardJobTitleTextField.addKeyListener(fieldKeyListener);
    		vCardJobTitleTextField.addFocusListener(fieldFocusListener(null));

    		vCardAddressLabel = new JLabel();
    		vCardPanel.add(vCardAddressLabel, "1, 11, 2, 11");
    		vCardAddressLabel.setText("Address:");
    		vCardAddressLabel.setFont(new java.awt.Font("Calibri",1,14));

    		vCardAddressTextField = new JTextField();
    		vCardPanel.add(vCardAddressTextField, "1, 12, 7, 12");
    		vCardAddressTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		vCardAddressTextField.addMouseListener(new rightClickListener());
    		vCardAddressTextField.setFont(new java.awt.Font("Calibri",0,14));
    		vCardAddressTextField.addKeyListener(fieldKeyListener);
    		vCardAddressTextField.addFocusListener(fieldFocusListener(null));

    		vCardCityLabel = new JLabel();
    		vCardPanel.add(vCardCityLabel, "1, 14");
    		vCardCityLabel.setText("City:");
    		vCardCityLabel.setFont(new java.awt.Font("Calibri",1,14));

    		vCardCityTextField = new JTextField();
    		vCardPanel.add(vCardCityTextField, "1, 15, 3, 15");
    		vCardCityTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		vCardCityTextField.addMouseListener(new rightClickListener());
    		vCardCityTextField.setFont(new java.awt.Font("Calibri",0,14));
    		vCardCityTextField.addKeyListener(fieldKeyListener);
    		vCardCityTextField.addFocusListener(fieldFocusListener(null));

    		vCardProvinceLabel = new JLabel();
    		vCardPanel.add(vCardProvinceLabel, "5, 14");
    		vCardProvinceLabel.setText("Province/State:");
    		vCardProvinceLabel.setFont(new java.awt.Font("Calibri",1,14));

    		vCardProvinceTextField = new JTextField();
    		vCardPanel.add(vCardProvinceTextField, "5, 15, 7, 15");
    		vCardProvinceTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		vCardProvinceTextField.addMouseListener(new rightClickListener());
    		vCardProvinceTextField.setFont(new java.awt.Font("Calibri",0,14));
    		vCardProvinceTextField.addKeyListener(fieldKeyListener);
    		vCardProvinceTextField.addFocusListener(fieldFocusListener(null));

    		vCardPostalLabel = new JLabel();
    		vCardPanel.add(vCardPostalLabel, "1, 17");
    		vCardPostalLabel.setText("Postal/Zip Code:");
    		vCardPostalLabel.setFont(new java.awt.Font("Calibri",1,14));

    		vCardPostalTextField = new JTextField();
    		vCardPanel.add(vCardPostalTextField, "1, 18, 3, 18");
    		vCardPostalTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		vCardPostalTextField.addMouseListener(new rightClickListener());
    		vCardPostalTextField.setFont(new java.awt.Font("Calibri",0,14));
    		vCardPostalTextField.addKeyListener(fieldKeyListener);
    		vCardPostalTextField.addFocusListener(fieldFocusListener(null));

    		vCardCountryLabel = new JLabel();
    		vCardPanel.add(vCardCountryLabel, "5, 17");
    		vCardCountryLabel.setText("Country:");
    		vCardCountryLabel.setFont(new java.awt.Font("Calibri",1,14));

    		vCardCountryTextField = new JTextField();
    		vCardPanel.add(vCardCountryTextField, "5, 18, 7, 18");
    		vCardCountryTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		vCardCountryTextField.addMouseListener(new rightClickListener());
    		vCardCountryTextField.setFont(new java.awt.Font("Calibri",0,14));
    		vCardCountryTextField.addKeyListener(fieldKeyListener);
    		vCardCountryTextField.addFocusListener(fieldFocusListener(null));

    		vCardPhoneLabel = new JLabel();
    		vCardPanel.add(vCardPhoneLabel, "1, 20");
    		vCardPhoneLabel.setText("Phone #:");
    		vCardPhoneLabel.setFont(new java.awt.Font("Calibri",1,14));

    		vCardPhoneTextField = new JTextField();
    		vCardPanel.add(vCardPhoneTextField, "1, 21, 3, 21");
    		vCardPhoneTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		vCardPhoneTextField.addMouseListener(new rightClickListener());
    		vCardPhoneTextField.setFont(new java.awt.Font("Calibri",0,14));
    		vCardPhoneTextField.addKeyListener(fieldKeyListener);
    		vCardPhoneTextField.addFocusListener(fieldFocusListener(null));

    		vCardMobilePhoneLabel = new JLabel();
    		vCardPanel.add(vCardMobilePhoneLabel, "5, 20");
    		vCardMobilePhoneLabel.setText("Mobile Phone #:");
    		vCardMobilePhoneLabel.setFont(new java.awt.Font("Calibri",1,14));

    		vCardMobilePhoneTextField = new JTextField();
    		vCardPanel.add(vCardMobilePhoneTextField, "5, 21, 7, 21");
    		vCardMobilePhoneTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		vCardMobilePhoneTextField.addMouseListener(new rightClickListener());
    		vCardMobilePhoneTextField.setFont(new java.awt.Font("Calibri",0,14));
    		vCardMobilePhoneTextField.addKeyListener(fieldKeyListener);
    		vCardMobilePhoneTextField.addFocusListener(fieldFocusListener(null));

    		vCardFaxLabel = new JLabel();
    		vCardPanel.add(vCardFaxLabel, "1, 23");
    		vCardFaxLabel.setText("Fax #:");
    		vCardFaxLabel.setFont(new java.awt.Font("Calibri",1,14));

    		vCardFaxTextField = new JTextField();
    		vCardPanel.add(vCardFaxTextField, "1, 24, 3, 24");
    		vCardFaxTextField.setFont(new java.awt.Font("Calibri",0,14));
    		vCardFaxTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		vCardFaxTextField.addMouseListener(new rightClickListener());
    		vCardFaxTextField.addKeyListener(fieldKeyListener);
    		vCardFaxTextField.addFocusListener(fieldFocusListener(null));

    		vCardEmailLabel = new JLabel();
    		vCardPanel.add(vCardEmailLabel, "1, 26");
    		vCardEmailLabel.setText("E-mail:");
    		vCardEmailLabel.setFont(new java.awt.Font("Calibri",1,14));

    		vCardEmailTextField = new JTextField();
    		vCardPanel.add(vCardEmailTextField, "1, 27, 7, 27");
    		vCardEmailTextField.setFont(new java.awt.Font("Calibri",0,14));
    		vCardEmailTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		vCardEmailTextField.addMouseListener(new rightClickListener());
    		vCardEmailTextField.addKeyListener(fieldKeyListener);
    		vCardEmailTextField.addFocusListener(fieldFocusListener(null));

    		vCardWebsiteLabel = new JLabel();
    		vCardPanel.add(vCardWebsiteLabel, "1, 29");
    		vCardWebsiteLabel.setText("Website:");
    		vCardWebsiteLabel.setFont(new java.awt.Font("Calibri",1,14));

    		vCardWebsiteTextField = new JTextField();
    		vCardPanel.add(vCardWebsiteTextField, "1, 30, 7, 30");
    		vCardWebsiteTextField.setFont(new java.awt.Font("Calibri",0,14));
    		vCardWebsiteTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		vCardWebsiteTextField.addMouseListener(new rightClickListener());
    		vCardWebsiteTextField.addKeyListener(fieldKeyListener);
    		vCardWebsiteTextField.addFocusListener(fieldFocusListener(null));

    		vCardAddBirthdayLabel = new JLabel();
    		vCardPanel.add(vCardAddBirthdayLabel, "1, 32");
    		vCardAddBirthdayLabel.setText("Add Birthday:");
    		vCardAddBirthdayLabel.setFont(new java.awt.Font("Calibri",1,14));

    		vCardAddBirthdayCheckBox = new JCheckBox();
    		vCardPanel.add(vCardAddBirthdayCheckBox, "1, 33, 1, 33, L, C");
    		vCardAddBirthdayCheckBox.setFont(new java.awt.Font("Calibri",0,14));
    		vCardAddBirthdayCheckBox.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		vCardAddBirthdayCheckBox.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					
					if (vCardAddBirthdayCheckBox.isSelected()){
						
						vCardBirthdayLabel.setEnabled(true);
						vCardDateChooser.setEnabled(true);
						updatePreview();
						
					}
					else{
						
						vCardBirthdayLabel.setEnabled(false);
						vCardDateChooser.setEnabled(false);
						updatePreview();
						
					}
					
				}});

    		vCardBirthdayLabel = new JLabel();
    		vCardBirthdayLabel.setEnabled(false);
    		vCardPanel.add(vCardBirthdayLabel, "1, 35");
    		vCardBirthdayLabel.setText("Birthday:");

    		vCardDateChooser = new JDateChooser("MM/dd/yyyy", "##/##/####", '_');
    		vCardDateChooser.setEnabled(false);
    		vCardDateChooser.setDate(new Date());
    		vCardDateChooser.getCalendarButton().setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		vCardDateChooser.getDateEditor().getUiComponent().setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		vCardPanel.add(vCardDateChooser, "1, 36, 3, 36");
    		vCardDateChooser.getDateEditor().getUiComponent().addKeyListener(fieldKeyListener);
    		vCardDateChooser.getDateEditor().getUiComponent().addFocusListener(fieldFocusListener(null));
    		vCardDateChooser.addPropertyChangeListener(new PropertyChangeListener() {

                @Override
                public void propertyChange(PropertyChangeEvent evt) {
                	if (evt.getPropertyName().equals("date")) {
                        updatePreview();
                        vCardDateChooser.getDateEditor().getUiComponent().requestFocusInWindow();
                    }
                }
            });
        	
        	panel = vCardPanel;
        	
    	}
        	
    	if (panelName.equals("vcalendar event")){
    		
    		TableLayout vCalendarPanelLayout = new TableLayout(new double[][] {{20.0, TableLayout.FILL, 7.0, TableLayout.FILL, 5.0, TableLayout.FILL, 7.0, TableLayout.FILL, 20.0}, {20.0, 20.0, 7.0, 15.0, 7.0, 15.0, 30.0, 7.0, 15.0, 30.0, 7.0, 15.0, 30.0, 7.0, 15.0, 30.0, 7.0, 15.0, 30.0, 7.0, 15.0, 30.0, 7.0}});
        	vCalendarPanelLayout.setHGap(5);
        	vCalendarPanelLayout.setVGap(5);
        	vCalendarPanel = new JPanel();
        	vCalendarPanel.setLayout(vCalendarPanelLayout);
        	vCalendarPanel.setPreferredSize(new java.awt.Dimension(500, vCalendarPanel.getPreferredSize().height));

    		vCalendarPanelTitle = new JLabel();
    		vCalendarPanel.add(vCalendarPanelTitle, "1, 1, 7, 1");
    		vCalendarPanelTitle.setFont(new java.awt.Font("Calibri",1,18));
    		vCalendarPanelTitle.setText("Events -> Calendar Event");

    		vCalendarPanelLabel = new JLabel();
    		vCalendarPanel.add(vCalendarPanelLabel, "1, 3, 7, 3");
    		vCalendarPanelLabel.setFont(new java.awt.Font("Calibri",0,14));
    		vCalendarPanelLabel.setText("Fill out the fields below to encode your contact information into a QRCode.");

    		vCalendarSummaryLabel = new JLabel();
    		vCalendarPanel.add(vCalendarSummaryLabel, "1, 5");
    		vCalendarSummaryLabel.setFont(new java.awt.Font("Calibri",1,14));
    		vCalendarSummaryLabel.setText("Summary:");

    		vCalendarSummaryTextField = new JTextField();
    		vCalendarPanel.add(vCalendarSummaryTextField, "1, 6, 7, 6");
    		vCalendarSummaryTextField.setFont(new java.awt.Font("Calibri",0,14));
    		vCalendarSummaryTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		vCalendarSummaryTextField.addMouseListener(new rightClickListener());
    		vCalendarSummaryTextField.addKeyListener(fieldKeyListener);
    		vCalendarSummaryTextField.addFocusListener(fieldFocusListener(null));

    		vCalendarDescriptionLabel = new JLabel();
    		vCalendarPanel.add(vCalendarDescriptionLabel, "1, 8, 2, 8");
    		vCalendarDescriptionLabel.setFont(new java.awt.Font("Calibri",1,14));
    		vCalendarDescriptionLabel.setText("Description:");

    		vCalendarDescriptionTextField = new JTextField();
    		vCalendarPanel.add(vCalendarDescriptionTextField, "1, 9, 7, 9");
    		vCalendarDescriptionTextField.setFont(new java.awt.Font("Calibri",0,14));
    		vCalendarDescriptionTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		vCalendarDescriptionTextField.addMouseListener(new rightClickListener());
    		vCalendarDescriptionTextField.addKeyListener(fieldKeyListener);
    		vCalendarDescriptionTextField.addFocusListener(fieldFocusListener(null));

    		vCalendarLocationLabel = new JLabel();
    		vCalendarPanel.add(vCalendarLocationLabel, "1, 11");
    		vCalendarLocationLabel.setFont(new java.awt.Font("Calibri",1,14));
    		vCalendarLocationLabel.setText("Location:");

    		vCalendarLocationTextField = new JTextField();
    		vCalendarPanel.add(vCalendarLocationTextField, "1, 12, 3, 12");
    		vCalendarLocationTextField.setFont(new java.awt.Font("Calibri",1,14));
    		vCalendarLocationTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		vCalendarLocationTextField.addMouseListener(new rightClickListener());
    		vCalendarLocationTextField.addKeyListener(fieldKeyListener);
    		vCalendarLocationTextField.addFocusListener(fieldFocusListener(null));
    		
    		vCalendarEventAllDayLabel = new JLabel();
    		vCalendarPanel.add(vCalendarEventAllDayLabel, "1, 14");
    		vCalendarEventAllDayLabel.setFont(new java.awt.Font("Calibri",1,14));
    		vCalendarEventAllDayLabel.setText("All Day Event:");
    		
    		vCalendarEventAllDayCheckBox = new JCheckBox();
    		vCalendarPanel.add(vCalendarEventAllDayCheckBox, "1, 15");
    		vCalendarEventAllDayCheckBox.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		vCalendarEventAllDayCheckBox.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					
					if (vCalendarEventAllDayCheckBox.isSelected()){
						
						vCalendarEventFinishLabel.setEnabled(false);
						vCalendarEventFinishDateChooser.setEnabled(false);
						vCalendarEventFinishSpinner.setEnabled(false);
						vCalendarEventFinishjftf.setBackground(new Color(248, 248, 248, 255));
						updatePreview();
						
					}
					else{
						
						vCalendarEventFinishLabel.setEnabled(true);
						vCalendarEventFinishDateChooser.setEnabled(true);
						vCalendarEventFinishSpinner.setEnabled(true);
						vCalendarEventFinishjftf.setBackground(new Color(255, 255, 255, 255));
						updatePreview();
						
					}
					
				}});

    		vCalendarEventStartLabel = new JLabel();
    		vCalendarPanel.add(vCalendarEventStartLabel, "1, 17");
    		vCalendarEventStartLabel.setFont(new java.awt.Font("Calibri",1,14));
    		vCalendarEventStartLabel.setText("Event Start:");

    		vCalendarEventStartDateChooser = new JDateChooser("MM/dd/yyyy", "##/##/####", '_');
    		vCalendarEventStartDateChooser.setDate(new Date());
    		vCalendarEventStartDateChooser.getCalendarButton().setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		vCalendarEventStartDateChooser.getDateEditor().getUiComponent().setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		vCalendarPanel.add(vCalendarEventStartDateChooser, "1, 18, 3, 18");
    		vCalendarEventStartDateChooser.getDateEditor().getUiComponent().addKeyListener(fieldKeyListener);
    		vCalendarEventStartDateChooser.getDateEditor().getUiComponent().addFocusListener(fieldFocusListener(null));
    		vCalendarEventStartDateChooser.addPropertyChangeListener(new PropertyChangeListener() {

                @Override
                public void propertyChange(PropertyChangeEvent evt) {
                    if (evt.getPropertyName().equals("date")) {
                        updatePreview();
                        vCalendarEventStartDateChooser.getDateEditor().getUiComponent().requestFocusInWindow();
                    }
                }
                
            });

    		vCalendarEventStartSpinnerDateModel = new SpinnerDateModel();
    		vCalendarEventStartSpinner = new JSpinner(vCalendarEventStartSpinnerDateModel);
    		vCalendarEventStartEditor = new JSpinner.DateEditor(vCalendarEventStartSpinner, "HH:mm:ss");
    		vCalendarEventStartSpinner.setEditor(vCalendarEventStartEditor);
    		vCalendarEventStartSpinner.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		vCalendarPanel.add(vCalendarEventStartSpinner, "5, 18, 6, 18");
    		vCalendarEventStartjftf = vCalendarEventStartEditor.getTextField();
    		DefaultFormatter vCalendarEventStartformatter = (DefaultFormatter) vCalendarEventStartjftf.getFormatter();
            vCalendarEventStartformatter.setCommitsOnValidEdit(true);
            vCalendarEventStartSpinner.addChangeListener(new ChangeListener() {

				@Override
				public void stateChanged(ChangeEvent e) {
					updatePreview();
					vCalendarEventStartjftf.requestFocus();
					
				}
            });
    		vCalendarEventStartjftf.addKeyListener(fieldKeyListener);
    		vCalendarEventStartjftf.addFocusListener(fieldFocusListener(null));

    		vCalendarEventFinishLabel = new JLabel();
    		vCalendarPanel.add(vCalendarEventFinishLabel, "1, 20");
    		vCalendarEventFinishLabel.setText("Event Finish:");
    		vCalendarEventFinishLabel.setFont(new java.awt.Font("Calibri",1,14));

    		vCalendarEventFinishDateChooser = new JDateChooser("MM/dd/yyyy", "##/##/####", '_');
    		vCalendarEventFinishDateChooser.setDate(new Date());
    		vCalendarEventFinishDateChooser.getCalendarButton().setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		vCalendarEventFinishDateChooser.getDateEditor().getUiComponent().setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		vCalendarPanel.add(vCalendarEventFinishDateChooser, "1, 21, 3, 21");
    		vCalendarEventFinishDateChooser.getDateEditor().getUiComponent().setName("vCalendarEventFinishDateChooser");
    		vCalendarEventFinishDateChooser.addPropertyChangeListener(new PropertyChangeListener() {

                @Override
                public void propertyChange(PropertyChangeEvent evt) {
                    if (evt.getPropertyName().equals("date")) {
                        updatePreview();
                        vCalendarEventFinishDateChooser.getDateEditor().getUiComponent().requestFocusInWindow();
                    }
                }
            });
    		vCalendarEventFinishDateChooser.getDateEditor().getUiComponent().addKeyListener(fieldKeyListener);
    		vCalendarEventFinishDateChooser.getDateEditor().getUiComponent().addFocusListener(fieldFocusListener(null));

    		vCalendarEventFinishSpinnerDateModel = new SpinnerDateModel();
    		vCalendarEventFinishSpinner = new JSpinner(vCalendarEventFinishSpinnerDateModel);
    		vCalendarEventFinishEditor = new JSpinner.DateEditor(vCalendarEventFinishSpinner, "HH:mm:ss");
    		vCalendarEventFinishSpinner.setEditor(vCalendarEventFinishEditor);
    		vCalendarEventFinishSpinner.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		vCalendarPanel.add(vCalendarEventFinishSpinner, "5, 21, 6, 21");
    		vCalendarEventFinishjftf = vCalendarEventFinishEditor.getTextField();
    		DefaultFormatter vCalendarEventFinishformatter = (DefaultFormatter) vCalendarEventFinishjftf.getFormatter();
            vCalendarEventFinishformatter.setCommitsOnValidEdit(true);
            vCalendarEventFinishSpinner.addChangeListener(new ChangeListener() {

				@Override
				public void stateChanged(ChangeEvent e) {
					e.getSource();
					updatePreview();
					vCalendarEventFinishjftf.requestFocus();
					
				}
            });
            vCalendarEventFinishjftf.addKeyListener(fieldKeyListener);
            vCalendarEventFinishjftf.addFocusListener(fieldFocusListener(null));
    		
    		panel = vCalendarPanel;
    		
    	}
    	
    	if (panelName.equals("android market publisher")){
    		
    		androidMarketPublisherPanelLayout = new TableLayout(new double[][] {{20.0, TableLayout.FILL, 7.0, TableLayout.FILL, 5.0, TableLayout.FILL, 7.0, TableLayout.FILL, 20.0}, {20.0, 20.0, 7.0, 15.0, 7.0, 15.0, 30.0, 7.0, TableLayout.FILL}});
        	androidMarketPublisherPanelLayout.setHGap(5);
        	androidMarketPublisherPanelLayout.setVGap(5);
        	androidMarketPublisherPanel = new JPanel();
        	androidMarketPublisherPanel.setLayout(androidMarketPublisherPanelLayout);
        	androidMarketPublisherPanel.setPreferredSize(new java.awt.Dimension(500, androidMarketPublisherPanel.getPreferredSize().height));

    		androidMarketPublisherPanelTitle = new JLabel();
    		androidMarketPublisherPanel.add(androidMarketPublisherPanelTitle, "1, 1, 7, 1");
    		androidMarketPublisherPanelTitle.setFont(new java.awt.Font("Calibri",1,18));
    		androidMarketPublisherPanelTitle.setText("Android -> Android Market Publisher");

    		androidMarketPublisherPanelLabel = new JLabel();
    		androidMarketPublisherPanel.add(androidMarketPublisherPanelLabel, "1, 3, 7, 3");
    		androidMarketPublisherPanelLabel.setFont(new java.awt.Font("Calibri",0,14));
    		androidMarketPublisherPanelLabel.setText("Fill out the fields below to encode your contact information into a QRCode.");

    		androidMarketPublisherLabel = new JLabel();
    		androidMarketPublisherPanel.add(androidMarketPublisherLabel, "1, 5, 3, 5");
    		androidMarketPublisherLabel.setFont(new java.awt.Font("Calibri",1,14));
    		androidMarketPublisherLabel.setText("Android Publisher Name:");

    		androidMarketPublisherTextField = new JTextField();
    		androidMarketPublisherPanel.add(androidMarketPublisherTextField, "1, 6, 7, 6");
    		androidMarketPublisherTextField.setFont(new java.awt.Font("Calibri",0,14));
    		androidMarketPublisherTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		androidMarketPublisherTextField.addMouseListener(new rightClickListener());
    		androidMarketPublisherTextField.addKeyListener(fieldKeyListener);
    		androidMarketPublisherTextField.addFocusListener(fieldFocusListener(null));
    		
    		panel = androidMarketPublisherPanel;
    		
    	}
        	
    	if (panelName.equals("android market package")){
    		
    		androidMarkietPackagePanelLayout = new TableLayout(new double[][] {{20.0, TableLayout.FILL, 7.0, TableLayout.FILL, 5.0, TableLayout.FILL, 7.0, TableLayout.FILL, 20.0}, {20.0, 20.0, 7.0, 15.0, 7.0, 15.0, 30.0, 7.0, TableLayout.FILL}});
        	androidMarkietPackagePanelLayout.setHGap(5);
        	androidMarkietPackagePanelLayout.setVGap(5);
        	androidMarketPackagePanel = new JPanel();
        	androidMarketPackagePanel.setLayout(androidMarkietPackagePanelLayout);
        	androidMarketPackagePanel.setPreferredSize(new java.awt.Dimension(500, androidMarketPackagePanel.getPreferredSize().height));

    		androidMarketPackagePanelTitle = new JLabel();
    		androidMarketPackagePanel.add(androidMarketPackagePanelTitle, "1, 1, 7, 1");
    		androidMarketPackagePanelTitle.setFont(new java.awt.Font("Calibri",1,18));
    		androidMarketPackagePanelTitle.setText("Android -> Android Market Package");

    		androidMarketPackagePanelLabel = new JLabel();
    		androidMarketPackagePanel.add(androidMarketPackagePanelLabel, "1, 3, 7, 3");
    		androidMarketPackagePanelLabel.setFont(new java.awt.Font("Calibri",0,14));
    		androidMarketPackagePanelLabel.setText("Enter the android package name below.");

    		androidMarketPackageLabel = new JLabel();
    		androidMarketPackagePanel.add(androidMarketPackageLabel, "1, 5, 3, 5");
    		androidMarketPackageLabel.setFont(new java.awt.Font("Calibri",1,14));
    		androidMarketPackageLabel.setText("Android Package Name:");

    		androidMarketPackageTextField = new JTextField();
    		androidMarketPackagePanel.add(androidMarketPackageTextField, "1, 6, 7, 6");
    		androidMarketPackageTextField.setFont(new java.awt.Font("Calibri",0,14));
    		androidMarketPackageTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		androidMarketPackageTextField.addMouseListener(new rightClickListener());
    		androidMarketPackageTextField.addKeyListener(fieldKeyListener);
    		androidMarketPackageTextField.addFocusListener(fieldFocusListener(null));
    		
    		panel = androidMarketPackagePanel;
    		
    	}
    	
    	if (panelName.equals("wifi access point")){
    		
    		androidWIFIPanelLayout = new TableLayout(new double[][] {{20.0, TableLayout.FILL, 7.0, TableLayout.FILL, 5.0, TableLayout.FILL, 7.0, TableLayout.FILL, 20.0}, {20.0, 20.0, 7.0, 15.0, 7.0, 15.0, 30.0, 7.0, 15.0, 30.0, 7.0, 15.0, 30.0, TableLayout.FILL}});
        	androidWIFIPanelLayout.setHGap(5);
        	androidWIFIPanelLayout.setVGap(5);
        	androidWIFIPanel = new JPanel();
        	androidWIFIPanel.setLayout(androidWIFIPanelLayout);
        	androidWIFIPanel.setPreferredSize(new java.awt.Dimension(500, androidWIFIPanel.getPreferredSize().height));

    		androidWIFIPanelTitle = new JLabel();
    		androidWIFIPanel.add(androidWIFIPanelTitle, "1, 1, 7, 1");
    		androidWIFIPanelTitle.setFont(new java.awt.Font("Calibri",1,18));
    		androidWIFIPanelTitle.setText("Android -> WiFi Access Point");

    		androidWIFIPanelLabel = new JLabel();
    		androidWIFIPanel.add(androidWIFIPanelLabel, "1, 3, 7, 3");
    		androidWIFIPanelLabel.setFont(new java.awt.Font("Calibri",0,14));
    		androidWIFIPanelLabel.setText("Enter your WiFi Access Point credentials below.");

    		androidWIFISSIDLabel = new JLabel();
    		androidWIFIPanel.add(androidWIFISSIDLabel, "1, 5, 3, 5");
    		androidWIFISSIDLabel.setFont(new java.awt.Font("Calibri",1,14));
    		androidWIFISSIDLabel.setText("SSID:");

    		androidWIFISSIDTextField = new JTextField();
    		androidWIFIPanel.add(androidWIFISSIDTextField, "1, 6, 7, 6");
    		androidWIFISSIDTextField.setFont(new java.awt.Font("Calibri",0,14));
    		androidWIFISSIDTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		androidWIFISSIDTextField.addMouseListener(new rightClickListener());
    		androidWIFISSIDTextField.addKeyListener(fieldKeyListener);

    		androidWIFIAuthenticationLabel = new JLabel();
    		androidWIFIPanel.add(androidWIFIAuthenticationLabel, "1, 8");
    		androidWIFIAuthenticationLabel.setFont(new java.awt.Font("Calibri",1,14));
    		androidWIFIAuthenticationLabel.setText("Authentication:");

    		androidWIFIAuthenticationComboBoxModel = new DefaultComboBoxModel<String>( new String[] { "WPA/WPA2", "WEP", "None" } );
    		androidWIFIAuthenticationComboBox = new JComboBox<String>();
    		androidWIFIPanel.add(androidWIFIAuthenticationComboBox, "1, 9");
    		androidWIFIAuthenticationComboBox.setModel(androidWIFIAuthenticationComboBoxModel);
    		androidWIFIAuthenticationComboBox.setFont(new java.awt.Font("Calibri",0,14));
    		androidWIFIAuthenticationComboBox.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		//androidWIFIAuthenticationComboBox.setBackground(new Color(255, 255, 255, 255));
    		androidWIFIAuthenticationComboBox.addActionListener(fieldActionListener);

    		androidWIFIPasswordLabel = new JLabel();
    		androidWIFIPanel.add(androidWIFIPasswordLabel, "1, 11");
    		androidWIFIPasswordLabel.setFont(new java.awt.Font("Calibri",1,14));
    		androidWIFIPasswordLabel.setText("Password:");

    		androidWIFIPasswordTextField = new JTextField();
    		androidWIFIPanel.add(androidWIFIPasswordTextField, "1, 12, 7, 12");
    		androidWIFIPasswordTextField.setFont(new java.awt.Font("Calibri",0,14));
    		androidWIFIPasswordTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		androidWIFIPasswordTextField.addMouseListener(new rightClickListener());
    		androidWIFIPasswordTextField.addKeyListener(fieldKeyListener);
    		
    		panel = androidWIFIPanel;
    		
    	}
    	
    	if (panelName.equals("facebook profile id")){
    		
    		fbProfileIdPanelLayout = new TableLayout(new double[][] {{20.0, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, 20.0}, {20.0, 20.0, 7.0, 15.0, 10.0, 7.0, 30.0, 20.0}});
        	fbProfileIdPanelLayout.setHGap(5);
        	fbProfileIdPanelLayout.setVGap(5);
        	fbProfileIDPanel = new JPanel();
        	fbProfileIDPanel.setLayout(fbProfileIdPanelLayout);
        	fbProfileIDPanel.setPreferredSize(new java.awt.Dimension(500, fbProfileIDPanel.getPreferredSize().height));

    		fbPanelTitle = new JLabel();
    		fbProfileIDPanel.add(fbPanelTitle, "1, 1, 3, 1");
    		fbPanelTitle.setText("Facebook -> Profile ID");
    		fbPanelTitle.setFont(new java.awt.Font("Calibri",1,18));

    		fbProfileIDPanelLabel = new JLabel();
    		fbProfileIDPanel.add(fbProfileIDPanelLabel, "1, 3, 4, 3");
    		fbProfileIDPanelLabel.setText("Enter your Facebook profile ID below.");
    		fbProfileIDPanelLabel.setFont(new java.awt.Font("Calibri",0,14));

    		fbProfileIDNote = new JLabel();
    		fbProfileIDPanel.add(fbProfileIDNote, "1, 4, 4, 4");
    		fbProfileIDNote.setFont(new java.awt.Font("Calibri",1,12));
    		fbProfileIDNote.setText("Note: Maximum length is complicated. Please refer to the documentation for detailed information!");

    		fbProfileIDTextField = new JTextField();
    		fbProfileIDPanel.add(fbProfileIDTextField, "1, 6, 4, 6");
    		fbProfileIDTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		fbProfileIDTextField.addMouseListener(new rightClickListener());
    		fbProfileIDTextField.addKeyListener(fieldKeyListener);
    		
    		panel = fbProfileIDPanel;
    		
    	}
    	
    	if (panelName.equals("facebook profile name")){
    		
    		fbProfileNamePanelLayout = new TableLayout(new double[][] {{20.0, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, 20.0}, {20.0, 20.0, 7.0, 15.0, 10.0, 7.0, 30.0, 20.0}});
        	fbProfileNamePanelLayout.setHGap(5);
        	fbProfileNamePanelLayout.setVGap(5);
        	fbProfileNamePanel = new JPanel();
        	fbProfileNamePanel.setLayout(fbProfileNamePanelLayout);
        	fbProfileNamePanel.setPreferredSize(new java.awt.Dimension(500, fbProfileNamePanel.getPreferredSize().height));
        	
    		fbProfileNamePanelTitle = new JLabel();
    		fbProfileNamePanel.add(fbProfileNamePanelTitle, "1, 1, 3, 1");
    		fbProfileNamePanelTitle.setFont(new java.awt.Font("Calibri",1,18));
    		fbProfileNamePanelTitle.setText("Facebook -> Profile Name");

    		fbProfileNamePanelLabel = new JLabel();
    		fbProfileNamePanel.add(fbProfileNamePanelLabel, "1, 3, 4, 3");
    		fbProfileNamePanelLabel.setFont(new java.awt.Font("Calibri",0,14));
    		fbProfileNamePanelLabel.setText("Enter your Facebook profile name below.");

    		fbProfileNameNote = new JLabel();
    		fbProfileNamePanel.add(fbProfileNameNote, "1, 4, 4, 4");
    		fbProfileNameNote.setFont(new java.awt.Font("Calibri",1,12));
    		fbProfileNameNote.setText("Note: Maximum length is complicated. Please refer to the documentation for detailed information!");

    		fbProfileNameTextField = new JTextField();
    		fbProfileNamePanel.add(fbProfileNameTextField, "1, 6, 4, 6");
    		fbProfileNameTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		fbProfileNameTextField.addMouseListener(new rightClickListener());
    		fbProfileNameTextField.addKeyListener(fieldKeyListener);
    		
    		panel = fbProfileNamePanel;
    		
    	}
    	
    	if (panelName.equals("facebook like")){
    		
    		fbLikePanelLayout = new TableLayout(new double[][] {{20.0, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, 20.0}, {20.0, 20.0, 7.0, 15.0, 10.0, 7.0, 30.0, 20.0}});
        	fbLikePanelLayout.setHGap(5);
        	fbLikePanelLayout.setVGap(5);
        	fbLikePanel = new JPanel();
        	fbLikePanel.setLayout(fbLikePanelLayout);
        	fbLikePanel.setPreferredSize(new java.awt.Dimension(500, fbLikePanel.getPreferredSize().height));

    		fbLikePanelTitle = new JLabel();
    		fbLikePanel.add(fbLikePanelTitle, "1, 1, 3, 1");
    		fbLikePanelTitle.setText("Facebook -> Like");
    		fbLikePanelTitle.setFont(new java.awt.Font("Calibri",1,18));

    		fbLikePanelLabel = new JLabel();
    		fbLikePanel.add(fbLikePanelLabel, "1, 3, 4, 3");
    		fbLikePanelLabel.setText("Enter a URL below to 'Like'.");
    		fbLikePanelLabel.setFont(new java.awt.Font("Calibri",0,14));

    		fbLikeNote = new JLabel();
    		fbLikePanel.add(fbLikeNote, "1, 4, 4, 4");
    		fbLikeNote.setText("Note: Maximum length is complicated. Please refer to the documentation for detailed information!");
    		fbLikeNote.setFont(new java.awt.Font("Calibri",1,12));

    		fbLikeURLTextField = new JTextField();
    		fbLikePanel.add(fbLikeURLTextField, "1, 6, 4, 6");
    		fbLikeURLTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		fbLikeURLTextField.addMouseListener(new rightClickListener());
    		fbLikeURLTextField.addKeyListener(fieldKeyListener);
    		
    		panel = fbLikePanel;
    		
    	}
    	
    	if (panelName.equals("twitter profile")){
    		
    		twitterProfilePanelLayout = new TableLayout(new double[][] {{20.0, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, 20.0}, {20.0, 20.0, 7.0, 15.0, 10.0, 7.0, 30.0, 20.0}});
    		twitterProfilePanelLayout.setHGap(5);
    		twitterProfilePanelLayout.setVGap(5);
        	twitterProfilePanel = new JPanel();
        	twitterProfilePanel.setLayout(twitterProfilePanelLayout);
        	twitterProfilePanel.setPreferredSize(new java.awt.Dimension(500, twitterProfilePanel.getPreferredSize().height));

    		twitterProfilePanelTitle = new JLabel();
    		twitterProfilePanel.add(twitterProfilePanelTitle, "1, 1, 3, 1");
    		twitterProfilePanelTitle.setText("Twitter -> Profile");
    		twitterProfilePanelTitle.setFont(new java.awt.Font("Calibri",1,18));

    		twitterProfilePanelLabel = new JLabel();
    		twitterProfilePanel.add(twitterProfilePanelLabel, "1, 3, 4, 3");
    		twitterProfilePanelLabel.setText("Enter a Twitter profile name below.");
    		twitterProfilePanelLabel.setFont(new java.awt.Font("Calibri",0,14));

    		twitterProfileTextField = new JTextField();
    		twitterProfilePanel.add(twitterProfileTextField, "1, 6, 4, 6");
    		twitterProfileTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		twitterProfileTextField.addMouseListener(new rightClickListener());
    		twitterProfileTextField.addKeyListener(fieldKeyListener);
    		
    		panel = twitterProfilePanel;
    		
    	}
    	
    	if (panelName.equals("twitter tweet")){
    		
    		twitterTweetPanelLayout = new TableLayout(new double[][] {{20.0, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, 20.0}, {20.0, 20.0, 7.0, 15.0, 10.0, 7.0, 30.0, 20.0}});
    		twitterTweetPanelLayout.setHGap(5);
    		twitterTweetPanelLayout.setVGap(5);
        	twitterTweetPanel = new JPanel();
        	twitterTweetPanel.setLayout(twitterTweetPanelLayout);
        	twitterTweetPanel.setPreferredSize(new java.awt.Dimension(500, twitterTweetPanel.getPreferredSize().height));

    		twitterTweetPanelTitle = new JLabel();
    		twitterTweetPanel.add(twitterTweetPanelTitle, "1, 1, 3, 1");
    		twitterTweetPanelTitle.setText("Twitter -> Tweet");
    		twitterTweetPanelTitle.setFont(new java.awt.Font("Calibri",1,18));

    		twitterTweetPanelLabel = new JLabel();
    		twitterTweetPanel.add(twitterTweetPanelLabel, "1, 3, 4, 3");
    		twitterTweetPanelLabel.setText("Enter your tweet below:");
    		twitterTweetPanelLabel.setFont(new java.awt.Font("Calibri",0,14));

    		twitterTweetTextField = new JTextField();
    		twitterTweetPanel.add(twitterTweetTextField, "1, 6, 4, 6");
    		twitterTweetTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		twitterTweetTextField.addMouseListener(new rightClickListener());
    		twitterTweetTextField.addKeyListener(fieldKeyListener);
    		
    		panel = twitterTweetPanel;
    		
    	}
    	
    	if (panelName.equals("linkedin user profile")){
    		
    		linkedInUserProfilePanelLayout = new TableLayout(new double[][] {{20.0, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, 20.0}, {20.0, 20.0, 7.0, 15.0, 10.0, 7.0, 30.0, 20.0}});
    		linkedInUserProfilePanelLayout.setHGap(5);
    		linkedInUserProfilePanelLayout.setVGap(5);
        	linkedInUserProfilePanel = new JPanel();
        	linkedInUserProfilePanel.setLayout(linkedInUserProfilePanelLayout);
        	linkedInUserProfilePanel.setPreferredSize(new java.awt.Dimension(500, linkedInUserProfilePanel.getPreferredSize().height));

    		linkedInUserProfilePanelTitle = new JLabel();
    		linkedInUserProfilePanel.add(linkedInUserProfilePanelTitle, "1, 1, 3, 1");
    		linkedInUserProfilePanelTitle.setText("LinkedIn -> User Profile");
    		linkedInUserProfilePanelTitle.setFont(new java.awt.Font("Calibri",1,18));

    		linkedInUserProfilePanelLabel = new JLabel();
    		linkedInUserProfilePanel.add(linkedInUserProfilePanelLabel, "1, 3, 4, 3");
    		linkedInUserProfilePanelLabel.setText("Enter a LinkedIn User Profile Name below:");
    		linkedInUserProfilePanelLabel.setFont(new java.awt.Font("Calibri",0,14));

    		linkedInUserProfileTextField = new JTextField();
    		linkedInUserProfilePanel.add(linkedInUserProfileTextField, "1, 6, 4, 6");
    		linkedInUserProfileTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		linkedInUserProfileTextField.addMouseListener(new rightClickListener());
    		linkedInUserProfileTextField.addKeyListener(fieldKeyListener);
    		
    		panel = linkedInUserProfilePanel;
    		
    	}
    	
    	if (panelName.equals("linkedin company profile")){
    		
    		linkedInCompanyProfilePanelLayout = new TableLayout(new double[][] {{20.0, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, 20.0}, {20.0, 20.0, 7.0, 15.0, 10.0, 7.0, 30.0, 20.0}});
    		linkedInCompanyProfilePanelLayout.setHGap(5);
    		linkedInCompanyProfilePanelLayout.setVGap(5);
        	linkedInCompanyProfilePanel = new JPanel();
        	linkedInCompanyProfilePanel.setLayout(linkedInCompanyProfilePanelLayout);
        	linkedInCompanyProfilePanel.setPreferredSize(new java.awt.Dimension(500, linkedInCompanyProfilePanel.getPreferredSize().height));

    		linkedInCompanyProfilePanelTitle = new JLabel();
    		linkedInCompanyProfilePanel.add(linkedInCompanyProfilePanelTitle, "1, 1, 3, 1");
    		linkedInCompanyProfilePanelTitle.setText("LinkedIn -> Company Profile");
    		linkedInCompanyProfilePanelTitle.setFont(new java.awt.Font("Calibri",1,18));

    		linkedInCompanyProfilePanelLabel = new JLabel();
    		linkedInCompanyProfilePanel.add(linkedInCompanyProfilePanelLabel, "1, 3, 4, 3");
    		linkedInCompanyProfilePanelLabel.setText("Enter a LinkedIn Company Profile Name below:");
    		linkedInCompanyProfilePanelLabel.setFont(new java.awt.Font("Calibri",0,14));

    		linkedInCompanyProfileTextField = new JTextField();
    		linkedInCompanyProfilePanel.add(linkedInCompanyProfileTextField, "1, 6, 4, 6");
    		linkedInCompanyProfileTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		linkedInCompanyProfileTextField.addMouseListener(new rightClickListener());
    		linkedInCompanyProfileTextField.addKeyListener(fieldKeyListener);
    		
    		panel = linkedInCompanyProfilePanel;
    		
    	}
    	
    	if (panelName.equals("linkedin share")){
    		
    		linkedInSharePanelLayout = new TableLayout(new double[][] {{20.0, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, 20.0}, {20.0, 20.0, 7.0, 15.0, 10.0, 7.0, 30.0, 20.0}});
    		linkedInSharePanelLayout.setHGap(5);
    		linkedInSharePanelLayout.setVGap(5);
        	linkedInSharePanel = new JPanel();
        	linkedInSharePanel.setLayout(linkedInSharePanelLayout);
        	linkedInSharePanel.setPreferredSize(new java.awt.Dimension(500, linkedInSharePanel.getPreferredSize().height));

    		linkedInSharePanelTitle = new JLabel();
    		linkedInSharePanel.add(linkedInSharePanelTitle, "1, 1, 3, 1");
    		linkedInSharePanelTitle.setText("LinkedIn -> Share URL");
    		linkedInSharePanelTitle.setFont(new java.awt.Font("Calibri",1,18));

    		linkedInSharePanelLabel = new JLabel();
    		linkedInSharePanel.add(linkedInSharePanelLabel, "1, 3, 4, 3");
    		linkedInSharePanelLabel.setText("Enter a URL to share below:");
    		linkedInSharePanelLabel.setFont(new java.awt.Font("Calibri",0,14));

    		linkedInShareTextField = new JTextField();
    		linkedInSharePanel.add(linkedInShareTextField, "1, 6, 4, 6");
    		linkedInShareTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
    		linkedInShareTextField.addMouseListener(new rightClickListener());
    		linkedInShareTextField.addKeyListener(fieldKeyListener);
    		
    		panel = linkedInSharePanel;
    		
    	}
    	
    	setSelectedJPanelObject(panel);
		
    	return panel;
		
    }

}
