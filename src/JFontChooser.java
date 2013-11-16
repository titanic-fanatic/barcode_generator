/*
 * JFontChooser.java
 *
 * Created on December 2, 2002, 9:54 AM
 */

/**
 *
 * @author  TDuffy
 *
 */

import java.awt.*;

import javax.swing.SwingConstants;
public class JFontChooser extends javax.swing.JDialog {
    /**
	 * 
	 */
	private static final long serialVersionUID = -5495687496138708816L;
	/** A return status code - returned if Cancel button has been pressed */
    public static final int RET_CANCEL = 0;
    /** A return status code - returned if OK button has been pressed */
    public static final int RET_OK = 1;
    //the font
    private Font font;
    
    //Constructors
    /** Creates new form JFontChooser */
    public JFontChooser(java.awt.Frame parent, Font font) {
        super(parent);
        this.font = font;
        initComponents();
        lblPreview.setFont(font);
    }
    
    public JFontChooser(java.awt.Frame parent) {
        super(parent);
        this.font = new Font("Dialog",Font.PLAIN,12);
        initComponents();
        lblPreview.setFont(font);
    }
    
    public JFontChooser(Font font) {
        super((javax.swing.JFrame)null);
        this.font = font;
        initComponents();
        lblPreview.setFont(font);
    }
    
    public JFontChooser() {
        super((javax.swing.JFrame)null);
        this.font = new Font("Dialog",Font.PLAIN,12);
        initComponents();
        lblPreview.setFont(font);
    }
    
    /** @return the font chosen by the user */
    public Font getFont(){
        return font;
    }
    
    /** @return the return status of this dialog - one of RET_OK or RET_CANCEL */
    public int getReturnStatus() {
        return returnStatus;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        java.awt.GridBagConstraints gridBagConstraints;

        mainPanel = new javax.swing.JPanel();
        fontPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstFont = new javax.swing.JList(GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames());
        jScrollPane2 = new javax.swing.JScrollPane();
        lstStyle = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstSize = new javax.swing.JList();
        previewPanel = new javax.swing.JPanel();
        lblPreview = new javax.swing.JLabel();
        buttonPanel = new javax.swing.JPanel();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setTitle("Select Font");
        setModal(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        mainPanel.setLayout(new java.awt.GridLayout(2, 1));

        fontPanel.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Font");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        gridBagConstraints.weightx = 2.0;
        fontPanel.add(jLabel1, gridBagConstraints);

        jLabel2.setText("Style");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        fontPanel.add(jLabel2, gridBagConstraints);

        jLabel3.setText("Size");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        gridBagConstraints.weightx = 0.2;
        fontPanel.add(jLabel3, gridBagConstraints);

        lstFont.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstFont.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstFontValueChanged(evt);
            }
        });

        jScrollPane1.setViewportView(lstFont);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        gridBagConstraints.weightx = 2.0;
        fontPanel.add(jScrollPane1, gridBagConstraints);

        lstStyle.setModel(new javax.swing.AbstractListModel() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 3870700542075208012L;
			String[] strings = { "Plain" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstStyle.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstStyle.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstStyleValueChanged(evt);
            }
        });

        jScrollPane2.setViewportView(lstStyle);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        fontPanel.add(jScrollPane2, gridBagConstraints);

        lstSize.setModel(new javax.swing.AbstractListModel() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 7091979595116629065L;
			String[] strings = { "8", "10", "11", "12", "14", "16", "20", "24", "28", "36", "48", "72", "96" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstSize.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstSize.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstSizeValueChanged(evt);
            }
        });

        jScrollPane3.setViewportView(lstSize);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        gridBagConstraints.weightx = 0.2;
        fontPanel.add(jScrollPane3, gridBagConstraints);

        mainPanel.add(fontPanel);
        
        String[] fList = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        
        int initialIndex = 0;
		for (int i = 0; i < fList.length; i++){

			if (fList[i].toString().equalsIgnoreCase(font.getFamily().toString())){
        		
        		initialIndex = i;
        		break;
        		
        	}
        	
        }
		
		//System.out.println("Continue: " + initialIndex + " | fList.length: " + lstFont.setSelectedValue(anObject, shouldScroll));
        
        lstFont.setSelectedIndex(initialIndex);
        lstFont.ensureIndexIsVisible(initialIndex);
        
        if (font.getStyle() == Font.PLAIN){
        	
        	initialIndex = 0;
        	
        }
        else if (font.getStyle() == Font.BOLD){
        	
        	initialIndex = 1;
        	
        }
        else if (font.getStyle() == Font.ITALIC){
        	
        	initialIndex = 2;
        	
        }
        else if (font.getStyle() == Font.BOLD + Font.ITALIC){
        	
        	initialIndex = 3;
        	
        }
        
        lstStyle.setSelectedIndex(initialIndex);
        lstStyle.ensureIndexIsVisible(initialIndex);
        
        if (font.getSize() == 8){
        	
        	initialIndex = 0;
        	
        }
        else if (font.getSize() == 10){
        	
        	initialIndex = 1;
        	
        }
        else if (font.getSize() == 11){
        	
        	initialIndex = 2;
        	
        }
        else if (font.getSize() == 12){
        	
        	initialIndex = 3;
        	
        }
        else if (font.getSize() == 14){
        	
        	initialIndex = 4;
        	
        }
        else if (font.getSize() == 16){
        	
        	initialIndex = 5;
        	
        }
        else if (font.getSize() == 20){
        	
        	initialIndex = 6;
        	
        }
        else if (font.getSize() == 24){
        	
        	initialIndex = 7;
        	
        }
        else if (font.getSize() == 28){
        	
        	initialIndex = 8;
        	
        }
        else if (font.getSize() == 36){
        	
        	initialIndex = 9;
        	
        }
        else if (font.getSize() == 48){
        	
        	initialIndex = 10;
        	
        }
        else if (font.getSize() == 72){
        	
        	initialIndex = 11;
        	
        }
        else if (font.getSize() == 96){
        	
        	initialIndex = 12;
        	
        }
        
        lstSize.setSelectedIndex(initialIndex);
        lstSize.ensureIndexIsVisible(initialIndex);

        previewPanel.setLayout(new java.awt.BorderLayout());
        previewPanel.setBackground(new Color(255, 255, 255));

        previewPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "Font Preview", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 11)), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        lblPreview.setFont(new java.awt.Font("Dialog", 0, 12));
        lblPreview.setText("0123456789");
        lblPreview.setHorizontalAlignment(SwingConstants.CENTER);
        previewPanel.add(lblPreview, java.awt.BorderLayout.CENTER);

        mainPanel.add(previewPanel);

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        buttonPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        buttonPanel.add(okButton);

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        buttonPanel.add(cancelButton);

        getContentPane().add(buttonPanel, java.awt.BorderLayout.SOUTH);

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setSize(new java.awt.Dimension(443, 429));
        setLocation((screenSize.width-443)/2,(screenSize.height-429)/2);
    }//GEN-END:initComponents

    private void lstStyleValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstStyleValueChanged
        int style = -1;
        String selStyle = (String)lstStyle.getSelectedValue();
        if(selStyle=="Plain")
            style = Font.PLAIN;
        if(selStyle=="Bold")
            style = Font.BOLD;
        if(selStyle=="Italic")
            style = Font.ITALIC;
        if(selStyle=="Bold Italic")
            style = Font.BOLD + Font.ITALIC;
        
        font = new Font(font.getFamily(),style,font.getSize());
        lblPreview.setFont(font);
    }//GEN-LAST:event_lstStyleValueChanged

    private void lstSizeValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstSizeValueChanged
        int size = Integer.parseInt((String)lstSize.getSelectedValue());
        font = new Font(font.getFamily(),font.getStyle(),size);
        lblPreview.setFont(font);
    }//GEN-LAST:event_lstSizeValueChanged

    private void lstFontValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstFontValueChanged
        font = new Font((String)lstFont.getSelectedValue(),font.getStyle(),font.getSize());
        lblPreview.setFont(font);
    }//GEN-LAST:event_lstFontValueChanged
    
    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        doClose(RET_OK);
    }//GEN-LAST:event_okButtonActionPerformed
    
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        doClose(RET_CANCEL);
    }//GEN-LAST:event_cancelButtonActionPerformed
    
    /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        doClose(RET_CANCEL);
    }//GEN-LAST:event_closeDialog
    
    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
    }
    
    /**
     * @param args the command line arguments
     *  main used for testing purposes only
     */
    public static void main(String args[]) {
        new JFontChooser().setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fontPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList lstSize;
    private javax.swing.JButton okButton;
    private javax.swing.JList lstFont;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList lstStyle;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JPanel previewPanel;
    private javax.swing.JLabel lblPreview;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
    
    private int returnStatus = RET_CANCEL;
}
