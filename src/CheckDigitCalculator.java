import info.clearthought.layout.TableLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javax.imageio.ImageIO;

import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileFilter;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import javax.swing.text.Style;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.krysalis.barcode4j.ChecksumMode;
import org.krysalis.barcode4j.HumanReadablePlacement;
import org.krysalis.barcode4j.impl.code39.Code39Bean;
import org.krysalis.barcode4j.impl.code93.Code93Bean;
import org.krysalis.barcode4j.impl.upcean.EAN13Bean;
import org.krysalis.barcode4j.impl.upcean.EAN8Bean;
import org.krysalis.barcode4j.impl.upcean.UPCABean;
import org.krysalis.barcode4j.impl.upcean.UPCEBean;
import org.krysalis.barcode4j.output.BarcodeCanvasSetupException;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;
import org.krysalis.barcode4j.output.eps.EPSCanvasProvider;
import org.krysalis.barcode4j.output.svg.SVGCanvasProvider;
import org.krysalis.barcode4j.tools.UnitConv;
import org.w3c.dom.DocumentFragment;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import com.nwwebdesign.UPCEncoder.EAN;
import com.nwwebdesign.UPCEncoder.UPC;

//import JTattoo.*;

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
public class CheckDigitCalculator extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1968884479708177318L;
	private JMenuBar applicationMenu;
	private JLabel symbologyTitleLabel;
	private JLabel upcLabelLabel;
	private JSeparator menuSeparator;
	private JMenuItem fileMenuItem1;
	private JMenu helpMenu;
	private JMenuItem helpMenuItem;
	private JMenuItem ean8MenuItem;
	private JMenuItem upcAMenuItem;
	private JMenuItem ean13MenuItem;
	private JMenu symbologyMenu;
	private JMenuItem newFileMenuItem;
	private JMenu fileMenu;
	private JTextField checkdigitTextField;
	private JButton updateButton;
	private JTextField upcTextField;
	private JPanel windowPanel;
	private CheckDigitCalculator mFrame;
	private JTextField addonTextField;
	private JLabel addonLabel;
	public static GUIProperties guiProps = new GUIProperties();
	
	public int UPCTypeSwitch = 2;
	public int UPCLengthConstraint = 11;
	public Style main;
	static InputStream fontUPCStream;
	static InputStream fontEANStream;
	static Font dynamicFontUPC = null;
	static Font dynamicFontEAN = null;
	static Font dynamicFontUPC40Pt = null;
	static Font dynamicFontEAN78Pt = null;
	private static File f;
	private static FileChannel channel;
	private static FileLock lock;
	
	private int guestResolution = Toolkit.getDefaultToolkit().getScreenResolution();
	private JLabel fontColorLabel;
	private JLabel fontSizeValueLabel;
	private JLabel fontFaceValueLabel;
	private JLabel fontSizeLabel;
	private JLabel fontFaceLabel;
	private JLabel hrtLabel;
	private JLabel barHeightLabel;
	private JLabel barColorLabel;
	private JLabel backgroundColorLabel;
	private JLabel trasparnetBackgroundLabel;
	private JLabel moduleWidthLabel;
	private JLabel dpiLabel;
	private JLabel formatLabel;
	private JLabel measurementsLabel;
	private JLabel jLabel12;
	private JLabel jLabel10;
	private JLabel previewLabel;
	private JLabel formatLabelQR;
	private JLabel sizeLabelQR;
	private JPopupMenu popupMenu;
	private JMenuItem popupMenuItem1;
	protected Color backgroundColor;
	private JTextField fontColorTextField;
	private JComboBox<String> hrtComboBox;
	private JTextField barHeightTextField;
	private JButton changeFontButton;
	private JTextField barColorTextField;
	private JTextField backgroundColorTextfield;
	private JCheckBox isTransparentBackground;
	private JTextField moduleWidthTextField;
	private JTextField dpiTextField;
	private JComboBox<String> fileTypeComboBox;
	private JTabbedPane optionsTabbedPane;
	private JButton exportButton;
	protected Color barcodeColor;
	private boolean verifyAddon;
	private JFileChooser chooser;
	private String browseLocation = System.getProperty("user.home");
	private JScrollPane previewScrollPane;
	private JMenu copyMenu;
	private JMenuItem copyMenuItem1;
	private JMenuItem copyMenuItem2;
	private JMenuItem copyMenuItem3;
	private JMenuItem copyMenuItem4;
	private JMenuItem copyMenuItem5;
	private JMenuItem QRCodeMenuItem;
	private JButton dataAssistantButton = new JButton();
	private boolean frameIsActive;
	private JComponent qrConfigurationPanel;
	private JComponent configurationPanel;
	private JComboBox<String> selectFormatQR;
	private JTextField sizeTextFieldQR;
	private JComponent fontPanel;
	private Container contentPane;
	private JMenuItem upcEMenuItem;
	private JMenuItem code39MenuItem;
	private JMenuItem symbology1DMenu;
	private JMenu symbology2DMenu;
	private JComponent colorPanel;
	private JTextArea qrCodeTextArea;
	private JScrollPane qrCodeTextAreaScrollPane;
	private JLabel errorLevelLabelQR;
	private JComboBox<String> errorLevelSelectQR;
	private ErrorCorrectionLevel errorCorrectionLevel;
	private int qrSize;
	
	final private int UPCA = 2;
	final private int UPCE = 5;
	final private int EAN8 = 1;
	final private int EAN13 = 3;
	final private int QRCODE = 4;
	final private int CODE39 = 6;
	private JMenu toolsMenu;
	private JMenuItem converterMenuItem;
	
	public GUIProperties getGuiProps() {
		
        return guiProps;
        
    }
	
	public static void unlockFile() {
		
        // release and delete file lock
        try {
        	
            if(lock != null) {
            	
                lock.release();
                channel.close();
                f.delete();
                
            }
            
        } catch(IOException e) {
        	
            e.printStackTrace();
            
        }
        
    }

    static class ShutdownHook extends Thread {

        public void run() {
        	
            unlockFile();
            
        }
        
    }

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		
		//Set Look & Feel
		try {
			
			com.jtattoo.plaf.acryl.AcrylLookAndFeel.setTheme("Default");
            UIManager.setLookAndFeel(guiProps.getLookAndFeel());
            
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		try {
			
            f = new File("ActiveInstance.lock");
            
            // Check if the lock exist
            if (f.exists()) {
            	
                // if exist try to delete it
                f.delete();
                
            }
            
            // Try to get the lock
            channel = new RandomAccessFile(f, "rw").getChannel();
            lock = channel.tryLock();
            
            if (lock == null){
            	
                // File is lock by other application
            	JOptionPane.showMessageDialog(new JFrame(), "An instance of Barcode Generator is already running!", "Error", JOptionPane.ERROR_MESSAGE);
                channel.close();
                System.exit(0);

            }
            
            // Add shutdown hook to release lock when application shutdown
            ShutdownHook shutdownHook = new ShutdownHook();
            Runtime.getRuntime().addShutdownHook(shutdownHook);

        }
        catch(IOException e)
        {
            throw new RuntimeException("Could not start process.", e);
        }
    		
    	//new JSplashScreen(5000, new ImageIcon(new CheckDigitCalculator().getClass().getClassLoader().getResource("images/Splash.png"))).initSplash();
		
		SwingUtilities.invokeLater(new Runnable() {
			/* (non-Javadoc)
			 * @see java.lang.Runnable#run()
			 */
			public void run() {
		        
			    CheckDigitCalculator inst = (CheckDigitCalculator) checkDigitCalculator();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
				System.out.println("CheckDigitCalculator Executed");
				
			}
			
		});
		
	}
	
	public void applyDataAssistantText(String rawData){
		
		qrCodeTextArea.setText(rawData);
		
	}
	
	private static Object checkDigitCalculator() {
		
		return new CheckDigitCalculator();
		
	}

	public CheckDigitCalculator() {
		
		super();
		initGUI();
		
	}
	
	public void setFrameIsActive(boolean frameStatus){
		
		frameIsActive = frameStatus;
		
	}
	
	public int getUPCTypeSwitch(){
		
		return UPCTypeSwitch;
		
	}
	
	private void initGUI() {
		
		mFrame = this;
		contentPane = getContentPane();
		
		List<? extends Image> icons;
		List<Image> iconsList = new ArrayList<Image>();
		iconsList.add(new ImageIcon(getClass().getClassLoader().getResource("images/barcode16x16.png")).getImage());
		iconsList.add(new ImageIcon(getClass().getClassLoader().getResource("images/barcode24x24.png")).getImage());
		iconsList.add(new ImageIcon(getClass().getClassLoader().getResource("images/barcode32x32.png")).getImage());
		iconsList.add(new ImageIcon(getClass().getClassLoader().getResource("images/barcode48x48.png")).getImage());
		iconsList.add(new ImageIcon(getClass().getClassLoader().getResource("images/barcode64x64.png")).getImage());
		icons = iconsList;
		setIconImages(icons);
		
		//DataAssistant dataAssistant = new DataAssistant();
		//dataAssistant.setVisible(true);

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(800, 450);
		setResizable(false);
		setTitle("Barcode Generator 1.1");
		
		double windowPanelSize[][] = {{7.0, 150.0, TableLayout.FILL, 46.25, 46.25, 7.0, 46.25, 46.25, 7.0, 40.0, 7.0, 78.0, 79.0, 79.0, 79.0, 7.0}, // COLUMNS
				                      {5.0, 30.0, 13.5, 30.0, 13.5, 30.0, 25.0, 30.0, 13.5, 30.0, 13.5, 30.0, 13.5, 30.0, TableLayout.FILL, 7.0, 50.0, 5.0}}; // ROWS
		TableLayout windowPanelLayout = new TableLayout(windowPanelSize);
		windowPanelLayout.setHGap(5);
		
		windowPanel = new JPanel();
		windowPanel.setLayout(windowPanelLayout);
		windowPanel.setPreferredSize(new java.awt.Dimension(479, 246));
		contentPane.add(windowPanel, BorderLayout.CENTER);
	
		symbologyTitleLabel = new JLabel();
		symbologyTitleLabel.setText("Symbology: UPC-A");
		symbologyTitleLabel.setFont(new java.awt.Font("Calibri",1,24));
		windowPanel.add(symbologyTitleLabel, "1, 1, 4, 1");
	
		upcLabelLabel = new JLabel();
		upcLabelLabel.setText("UPC (11 Digits):");
		upcLabelLabel.setFont(new java.awt.Font("Calibri",1,18));
		windowPanel.add(upcLabelLabel, "1, 3, r, f");
	
		updateButton = new JButton();
		updateButton.setText("Update Preview");
		updateButton.setFont(new java.awt.Font("Calibri",1,20));
		updateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				CalculateCheckDigit();
			}
		});
		windowPanel.add(updateButton, "13, 16, 14, 16");
	
		upcTextField = new JTextField(11);
		upcTextField.setSize(287, 28);
		upcTextField.setFont(new java.awt.Font("Calibri",0,18));
		upcTextField.setName("UPCNum");
		upcTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
		MouseListener upcPopupListener = new upcPopupListener();
		upcTextField.addMouseListener(upcPopupListener);
		upcTextField.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent evt) {
				validateUPC(evt);
			}
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				if (key == KeyEvent.VK_ENTER) {
					CalculateCheckDigit();
				}
			}
		}
		);
		windowPanel.add(upcTextField, "2, 3, 7, 3");
		
		windowPanel.add(getOptionsTabbedPane(), "11, 2, 14, 14");
	
		checkdigitTextField = new JTextField();
		checkdigitTextField.setBackground(new Color(255, 255, 255));
		checkdigitTextField.setPreferredSize(new java.awt.Dimension(287,28));
		checkdigitTextField.setSize(287, 28);
		checkdigitTextField.setFont(new java.awt.Font("Calibri",0,18));
		checkdigitTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
		checkdigitTextField.setHorizontalAlignment(SwingConstants.CENTER);
		checkdigitTextField.setEditable(false);
		checkdigitTextField.setText("5");
		windowPanel.add(checkdigitTextField, "9, 3");
	
		int resolution = guestResolution;
		int pxModuleWidth = (int) Math.ceil(resolution/96);
		String fontFace = "Helvetica";
		double barHeight = px2mm(56);
		double moduleWidth = moduleWidth(pxModuleWidth, resolution);
		double quietzoneWidth = quietzoneWidth(moduleWidth);
		double fontSize = px2mm(12);
		
//		Code93Bean bean = new Code93Bean();
//		bean.setBarHeight(barHeight);
//		bean.setModuleWidth(moduleWidth);
//		bean.setWideFactor((moduleWidth > 0.508f) ? 3.0f : 2.0f);
//		bean.setIntercharGapWidth(0);
//		bean.setQuietZone(quietzoneWidth);
//		bean.setChecksumMode(ChecksumMode.CP_ADD);
//		bean.setMsgPosition(HumanReadablePlacement.HRP_BOTTOM);
//		bean.setFontName(fontFace);
//		bean.setFontSize(fontSize);
		
		UPCABean bean = new UPCABean();
		bean.setBarHeight(barHeight);
		bean.setModuleWidth(moduleWidth);
		bean.setQuietZone(quietzoneWidth);
		bean.setChecksumMode(ChecksumMode.CP_ADD);
		bean.setMsgPosition(HumanReadablePlacement.HRP_BOTTOM);
		bean.setFontName(fontFace);
		bean.setFontSize(fontSize);
		
		// Get list of unique supported write formats
		//String[] formatNames = ImageIO.getWriterMIMETypes();
		//int formatNamesLength = formatNames.length;
		//formatNames = formatNames;
		
		//for (int i = 0; i < formatNamesLength; i++){
		
			//System.out.println(formatNames[i]);
		
		//}
		
		//Open output file
		File outputFile = new File("preview.png");
		OutputStream out = null;
		try {
			out = new FileOutputStream(outputFile);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
		    //Set up the canvas provider for monochrome PNG output
		    BitmapCanvasProvider canvas = new BitmapCanvasProvider(out, "image/png", resolution, BufferedImage.TYPE_INT_ARGB, false, 0, new Color(0, 0, 0, 255), new Color(0, 0, 0, 255), new Color(255, 255, 255, 255), false);

		    //Generate the barcode
		    bean.generateBarcode(canvas, "01234567890");

		    //Signal end of generation
		    try {
				canvas.finish();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} finally {
		    try {
				out.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		
		//System.out.println(UnitConv.mm2in(bean.calcDimensions("01234567890+12345").getHeightPlusQuiet()));
		
		//String[] formatNames = ImageIO.getWriterMIMETypes();
	    //System.out.println(Arrays.toString(formatNames));

		//double bcodeWidth = (double) Math.round((bean.calcDimensions("01234567891").getWidthPlusQuiet(0)) * 100) / 100;
		//double bcodeHeight = (double) Math.round((bean.calcDimensions("01234567891").getHeightPlusQuiet(0)) * 100) / 100;
		//double bcodeWidthIN = (double) Math.round((bean.calcDimensions("01234567891").getWidthPlusQuiet(0) * 0.0393700787401575) * 100) / 100;
		//double bcodeHeightIN = (double) Math.round((bean.calcDimensions("01234567891").getHeightPlusQuiet(0) * 0.0393700787401575) * 100) / 100;
		
	    BufferedImage previewImage = null;
		try {
			previewImage = ImageIO.read(outputFile);
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		
		double bcodeWidth = (double) Math.round(bean.calcDimensions("01234567890").getWidthPlusQuiet() * 100) / 100;
		double bcodeHeight = (double) Math.round(bean.calcDimensions("01234567890").getHeightPlusQuiet() * 100) / 100;
		double bcodeWidthIN = (double) Math.round(UnitConv.mm2in(bean.calcDimensions("01234567890").getWidthPlusQuiet() * 100)) / 100;
		double bcodeHeightIN = (double) Math.round(UnitConv.mm2in(bean.calcDimensions("01234567890").getHeightPlusQuiet() * 100)) / 100;
		
		//System.out.println("bcodeWidth: " + bcodeWidth);
					
//		QRCodeWriter QRWriter = new QRCodeWriter();
//	    Hashtable<EncodeHintType, ErrorCorrectionLevel> hintMap = new Hashtable<EncodeHintType, ErrorCorrectionLevel>();
//	    hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
//		BitMatrix bitMatrix = null;
//		try {
//			bitMatrix = QRWriter.encode("ABCabc", BarcodeFormat.QR_CODE, 250, 250, hintMap);
//		} catch (WriterException e1) {
//			e1.printStackTrace();
//		}
		//String QRCodeBufferedImage = MatrixToImageWriter.toEPSImage(bitMatrix, new Color(255, 255, 255), new Color(120, 0, 240));;
//		MatrixToImageWriter.toSVGImage(bitMatrix, "test1.svg", new Color(255, 255, 255), new Color(120, 0, 240));
		
	    // Get a DOMImplementation.
	    //DOMImplementation domImpl = GenericDOMImplementation.getDOMImplementation();

	    // Create an instance of org.w3c.dom.Document.
	    //String svgNS = "http://www.w3.org/2000/svg";
	    //Document document = domImpl.createDocument(svgNS, "svg", null);
		
		//System.out.println(QRCodeBufferedImage);
		
		//try {
		    //BufferedWriter testOut = new BufferedWriter(new FileWriter("test.eps"));
		    //BufferedWriter testOut = new BufferedWriter(new FileWriter("test.svg"));
		    //testOut.write(QRCodeBufferedImage);
		    //testOut.close();
		//} catch (IOException e) {
		//}
		
		//QRCode code = new QRCode();
	    //new QRCodeWriter();
		//code.setVersion(value);
		//System.out.println(code.getVersion());
	    //Encoder.encode("mmmmmmmmmmmmmmmmmm", ErrorCorrectionLevel.L, hintMap, code);
	    
		//BitMatrix bitMatrix = QRCodeWriter.renderResult(code, code.getMatrixWidth(), code.getMatrixWidth());
		//BufferedImage QRCodeBufferedImage = MatrixToImageWriter.toBufferedImage(bitMatrix);
		
		//System.out.println(image.getWidth());
		
		//ImageIO.write(image, "png", outputFile);
		//final BufferedImage image = ImageIO.read(outputFile);
		
	    //pLabel = new JLabel(new ImageIcon(image));
	    previewLabel = new JLabel(new ImageIcon(previewImage));
		previewLabel.setOpaque(true);
	    previewLabel.setBackground(new Color(255, 255, 255));
		previewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		previewLabel.setVerticalAlignment(SwingConstants.CENTER);
		previewLabel.setPreferredSize(new java.awt.Dimension(previewImage.getWidth() + 20, previewImage.getHeight() + 20));
	    previewScrollPane = new JScrollPane(previewLabel);
	    previewScrollPane.getVerticalScrollBar().setUnitIncrement(5);
	    previewScrollPane.setOpaque(true);
	    previewScrollPane.setBackground(new Color(255, 255, 255));
	    previewScrollPane.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(new LineBorder(new Color(143, 143, 143), 1, false), "UPC Preview", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14)), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));
		windowPanel.add(getAddonLabel(), "1,5,r,f");
		windowPanel.add(getaddonTextField(), "2, 5, 4, 5");
		windowPanel.add(getJLabel10(), "11, 1, 14, 1");
		windowPanel.add(getJLabel12(), "1,6,3,6,r,b");
		windowPanel.add(getJLabel13(), "4,6,9,6,r,b");
		windowPanel.add(getExportButton(), "11, 16, 12, 16");
		windowPanel.add(previewScrollPane, "1,7,9,16,f,f");
		measurementsLabel.setText(bcodeWidth + "mm x " + bcodeHeight + "mm / " + bcodeWidthIN + "in x " + bcodeHeightIN + "in");

		//jTextPane1.setPreferredSize(new java.awt.Dimension(232, 104));
		
		//popupMenu = getJPopupMenu();
		
		//System.out.println(this.getName());
		
		applicationMenu = new JMenuBar();
		setJMenuBar(applicationMenu);
		
		fileMenu = new JMenu();
		applicationMenu.add(fileMenu);
		fileMenu.setText("File");

		fileMenuItem1 = new JMenuItem();
		fileMenuItem1.setText("Export Barcode");
		fileMenuItem1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/saveas16x16.png")));
		//System.out.println(newFileMenuItem.getSize().width +" | " + newFileMenuItem.getSize().height);
		fileMenuItem1.setPreferredSize(new java.awt.Dimension(120, 22));
		fileMenuItem1.setSize(new java.awt.Dimension(100, 22));
		fileMenuItem1.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                	CalculateCheckDigit();
                	exportBarcode();
                }
            }
        );
		fileMenuItem1.setIconTextGap(5);
		fileMenu.add(fileMenuItem1);
		//saveAsPNGMenuItem.setEnabled(false);
		fileMenu.add(getMenuSeparator());
		
		newFileMenuItem = new JMenuItem();
		newFileMenuItem.setText("Exit");
		newFileMenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/exit16x16.png")));
		//System.out.println(newFileMenuItem.getSize().width +" | " + newFileMenuItem.getSize().height);
		newFileMenuItem.setPreferredSize(new java.awt.Dimension(110, 22));
		newFileMenuItem.setSize(new java.awt.Dimension(110, 22));
		newFileMenuItem.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    CheckDigitCalculator.this.CloseProgram();
                }
            }
        );
		newFileMenuItem.setIconTextGap(5);
		fileMenu.add(newFileMenuItem);

		symbologyMenu = new JMenu();
		symbologyMenu.setText("Symbology");
		applicationMenu.add(symbologyMenu);
		
		symbology1DMenu = new JMenu();
		symbology1DMenu.setPreferredSize(new java.awt.Dimension(100, 22));
		symbology1DMenu.setSize(new java.awt.Dimension(135, 22));
		//symbology1DMenu.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
		symbology1DMenu.setText("1D Barcodes");
		symbology1DMenu.setIconTextGap(5);
		symbologyMenu.add(symbology1DMenu);
		
		symbology2DMenu = new JMenu();
		symbology2DMenu.setPreferredSize(new java.awt.Dimension(135, 22));
		symbology2DMenu.setSize(new java.awt.Dimension(100, 22));
		//symbology2DMenu.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
		symbology2DMenu.setText("2D Barcodes");
		symbology2DMenu.setIconTextGap(5);
		symbologyMenu.add(symbology2DMenu);

		upcAMenuItem = new JMenuItem();
		upcAMenuItem.setPreferredSize(new java.awt.Dimension(85, 22));
		upcAMenuItem.setSize(new java.awt.Dimension(85, 22));
		upcAMenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/checkmark16x16.png")));
		upcAMenuItem.setText("UPC-A");
		upcAMenuItem.setIconTextGap(5);
		symbology1DMenu.add(upcAMenuItem);
		upcAMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				UPCTypeSwitch = 2;
				UPCTypeChangeListener();
			}
		});

		upcEMenuItem = new JMenuItem();
		upcEMenuItem.setPreferredSize(new java.awt.Dimension(85, 22));
		upcEMenuItem.setSize(new java.awt.Dimension(85, 22));
		upcEMenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
		upcEMenuItem.setText("UPC-E");
		upcEMenuItem.setIconTextGap(5);
		symbology1DMenu.add(upcEMenuItem);
		upcEMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				UPCTypeSwitch = 5;
				UPCTypeChangeListener();
			}
		});
		
		ean8MenuItem = new JMenuItem();
		ean8MenuItem.setPreferredSize(new java.awt.Dimension(85, 22));
		ean8MenuItem.setSize(new java.awt.Dimension(85, 22));
		ean8MenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
		ean8MenuItem.setText("EAN-8");
		ean8MenuItem.setIconTextGap(5);
		symbology1DMenu.add(ean8MenuItem);
		ean8MenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				UPCTypeSwitch = 1;
				UPCTypeChangeListener();
			}
		});
		upcTextField.setDocument(new JTextFieldLimit(11));
		upcTextField.setText("01234567890");
		
		ean13MenuItem = new JMenuItem();
		ean13MenuItem.setPreferredSize(new java.awt.Dimension(85, 22));
		ean13MenuItem.setSize(new java.awt.Dimension(85, 22));
		ean13MenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
		ean13MenuItem.setText("EAN-13");
		ean13MenuItem.setIconTextGap(5);
		symbology1DMenu.add(ean13MenuItem);
		ean13MenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				UPCTypeSwitch = 3;
				UPCTypeChangeListener();
			}
		});
		
		code39MenuItem = new JMenuItem();
		code39MenuItem.setPreferredSize(new java.awt.Dimension(85, 22));
		code39MenuItem.setSize(new java.awt.Dimension(85, 22));
		code39MenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
		code39MenuItem.setText("Code 39");
		code39MenuItem.setIconTextGap(5);
		symbology1DMenu.add(code39MenuItem);
		code39MenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				UPCTypeSwitch = 6;
				UPCTypeChangeListener();
			}
		});
		
		QRCodeMenuItem = new JMenuItem();
		QRCodeMenuItem.setPreferredSize(new java.awt.Dimension(85, 22));
		QRCodeMenuItem.setSize(new java.awt.Dimension(85, 22));
		QRCodeMenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
		QRCodeMenuItem.setText("QRCode");
		QRCodeMenuItem.setIconTextGap(5);
		symbology2DMenu.add(QRCodeMenuItem);
		QRCodeMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				UPCTypeSwitch = 4;
				UPCTypeChangeListener();
			}
		});
		
		toolsMenu = new JMenu();
		applicationMenu.add(toolsMenu);
		toolsMenu.setText("Tools");
		
		ImageIcon refreshIcon = new ImageIcon(getClass().getClassLoader().getResource("images/refresh16x16.png"));
		converterMenuItem = new JMenuItem();
		converterMenuItem.setText("UPC-A/E Converter");
		converterMenuItem.setIcon(refreshIcon);
		converterMenuItem.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    	mFrame.converterMenuItemActionPerformed(e);
                    }
                }
            );
		toolsMenu.add(converterMenuItem);
		
		helpMenu = new JMenu();
		applicationMenu.add(helpMenu);
		helpMenu.setText("Help");
		
		ImageIcon InfoIcon = new ImageIcon(getClass().getClassLoader().getResource("images/info16x16.png"));
		helpMenuItem = new JMenuItem();
		helpMenuItem.setText("About Barcode Generator 1.1");
		helpMenuItem.setIcon(InfoIcon);
		helpMenuItem.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    	mFrame.helpMenuItemActionPerformed(e);
                    }
                }
            );
		helpMenu.add(helpMenuItem);
	}

	/**
   * Empty implementation of the ClipboardOwner interface.
   */
   public void lostOwnership( Clipboard aClipboard, Transferable aContents) {
     //do nothing
   }

  /**
  * Place a String on the clipboard, and make this class the
  * owner of the Clipboard's contents.
  */
  public void setClipboardContents( String aString ){
    StringSelection stringSelection = new StringSelection( aString );
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    clipboard.setContents( stringSelection, (ClipboardOwner) this );
  }

  /**
  * Get the String residing on the clip board.
  *
  * @return any text found on the Clip board; if none found, return an
  * empty String.
  */
  public String getClipboardContents() {
    String result = "";
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    //odd: the Object parameter of getContents is not currently used
    Transferable contents = clipboard.getContents(null);
    boolean hasTransferableText =
      (contents != null) &&
      contents.isDataFlavorSupported(DataFlavor.stringFlavor)
    ;
    if ( hasTransferableText ) {
      try {
        result = (String)contents.getTransferData(DataFlavor.stringFlavor);
      }
      catch (UnsupportedFlavorException ex){
        //highly unlikely since we are using a standard DataFlavor
        //System.out.println(ex);
        ex.printStackTrace();
      }
      catch (IOException ex) {
        //System.out.println(ex);
        ex.printStackTrace();
      }
    }
    return result;
  }
	
	protected void CloseProgram() {
		System.exit(0);
	}
	
	private void helpMenuItemActionPerformed(ActionEvent evt) {
		
		JOptionPane.showMessageDialog(CheckDigitCalculator.this,
			    "--------------------------------------------------------------------------------     \n" +
			    "Barcode Generator 1.1\n" +
			    "--------------------------------------------------------------------------------     \n" +
			    "By: Tyler Janzen\n" +
			    "Created: June 17, 2011\n" +
			    "Current Version: 1.1 \n" +
			    "Current Version Release: March 6, 2012\n" +
			    "\n" +
			    "--------------------------------------------------------------------------------     \n" +
			    "Credits:\n" +
			    "--------------------------------------------------------------------------------     \n" +
			    "Jigloo - www.cloudgarden.com/jigloo/\n" +
			    "Free Java GUI Editor\n" +
			    "\n" +
			    "JTattoo - www.jtattoo.net\n" +
			    "Free Java Interface Styles\n" +
			    "\n" +
			    "Barcode4J - barcode4j.sourceforge.net\n" +
			    "Free Java Barcode Generation Class\n" +
			    "\n" +
			    "Zxing - code.google.com/p/zxing/\n" +
			    "Free Java Barcode Generation Class (QRCode/Aztec Code)\n" +
			    "\n",
			    "About Barcode Generator 1.1",
			    JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getClassLoader().getResource("images/barcode48x48.png")));
		
	}
	
	private void converterMenuItemActionPerformed(ActionEvent evt) {
		
		ConverterDialog converterDialog = new ConverterDialog(mFrame, true, UPCTypeSwitch);
		//converterDialog.setVisible(true);
		
	}
	
	private void CalculateCheckDigit() {
		
		String UPCNum;
		if (UPCTypeSwitch == QRCODE){
			
			UPCNum = qrCodeTextArea.getText();
			
		}
		else{
			
			UPCNum = upcTextField.getText();
			
		}
		
		String addon = addonTextField.getText();
		int UPCLength = UPCNum.length();
		
		String UPCType = null;
		int QRCodeLength = 0;
		if (UPCTypeSwitch == EAN8){
			
			UPCType = "EAN-8";
			
		}
		else if (UPCTypeSwitch == UPCA){
			
			UPCType = "UPC-A";
			
		}
		else if (UPCTypeSwitch == UPCE){
			
			UPCType = "UPC-E";
			
		}
		else if (UPCTypeSwitch == EAN13){
			
			UPCType = "EAN-13";
			
		}
		else if (UPCTypeSwitch == CODE39){
			
			UPCType = "Code39";
			
		}
		else if (UPCTypeSwitch == QRCODE){
			
			UPCType = "QRCode";
			QRCodeLength = qrCodeTextArea.getText().length();
			
		}
		
		if ((UPCTypeSwitch != QRCODE && UPCTypeSwitch != CODE39) && (UPCNum == null || UPCNum.equals("") || UPCLength != UPCLengthConstraint)) {
			
			JOptionPane.showMessageDialog(CheckDigitCalculator.this,
					"Please enter a valid " + UPCType + "\nwithout the check digit.\n\nRequirement: " + UPCLengthConstraint + " Digits\n",
					"Invalid " + UPCType,
					JOptionPane.ERROR_MESSAGE, new ImageIcon(getClass().getClassLoader().getResource("images/error48x48.png")));
			
		}
		else if (UPCTypeSwitch == CODE39 && (UPCNum == null || UPCNum.equals("") || UPCLength <= 0 || UPCLength > UPCLengthConstraint)) {
			
			JOptionPane.showMessageDialog(CheckDigitCalculator.this,
					"You must enter at least 1 character to encode, and\nno more than " + UPCLengthConstraint + " characters total.\n\nRequirement: Between 0 and " + UPCLengthConstraint + " alphanumeric characters\n",
					"Invalid " + UPCType,
					JOptionPane.ERROR_MESSAGE, new ImageIcon(getClass().getClassLoader().getResource("images/error48x48.png")));
			
		}
		else if (UPCTypeSwitch == QRCODE && (qrCodeTextArea == null || qrCodeTextArea.equals("") || QRCodeLength <= 0 || QRCodeLength > UPCLengthConstraint)){
			
			JOptionPane.showMessageDialog(CheckDigitCalculator.this,
					"You must enter at least 1 character to encode, and\nno more than " + UPCLengthConstraint + " characters total.\n\nRequirement: Between 0 and " + UPCLengthConstraint + " alphanumeric characters\n",
					"Invalid QRCode",
					JOptionPane.ERROR_MESSAGE, new ImageIcon(getClass().getClassLoader().getResource("images/error48x48.png")));
			
		}
		else if (addon.length() != 0 && (addon.length() != 2 && addon.length() != 5)){
			
			JOptionPane.showMessageDialog(CheckDigitCalculator.this, "An add-on can only be 2 or 5 characters in length,\nand must be comprised of only numbers.\n\nLeave this field blank if you do not need an add-on.\n", "Invalid Add-on Digits",
					JOptionPane.ERROR_MESSAGE, new ImageIcon(getClass().getClassLoader().getResource("images/error48x48.png")));
			
		}
		else {
			
			//System.out.println(UPCNums[0]);
			int CheckDigit = 0;
			File outputFile = null;
			OutputStream out = null;
			BufferedImage image = null;
			
			String imageFormat = "image/x-png";
			int imageResolution = Integer.parseInt(dpiTextField.getText());
			Color barColor = barColorTextField.getBackground();
			Color fontColor = fontColorTextField.getBackground();
			Color backgroundColor = backgroundColorTextfield.getBackground();
			boolean isTransparent = isTransparentBackground.isSelected();
			
			int pxModuleWidth = Integer.parseInt(moduleWidthTextField.getText());
			String fontFace = fontFaceValueLabel.getText();
			double barHeight = px2mm(Integer.parseInt(barHeightTextField.getText()));
			double moduleWidth = moduleWidth(pxModuleWidth, Integer.parseInt(dpiTextField.getText()));
			double quietzoneWidth = quietzoneWidth(moduleWidth);
			double fontSize = px2mm(Integer.parseInt(fontSizeValueLabel.getText()));
			
			HumanReadablePlacement HRP;
			if (hrtComboBox.getSelectedItem() == "Bottom"){
				
				HRP = HumanReadablePlacement.HRP_BOTTOM;
				
			}
			else if (hrtComboBox.getSelectedItem() == "Top"){
				
				HRP = HumanReadablePlacement.HRP_TOP;
				
			}
			else {
				
				HRP = HumanReadablePlacement.HRP_NONE;
				
			}
			
			EAN8Bean EAN8bean = new EAN8Bean();
			EAN13Bean EAN13bean = new EAN13Bean();
			UPCABean UPCAbean = new UPCABean();
			UPCEBean UPCEbean = new UPCEBean();
			Code39Bean Code39bean = new Code39Bean();
			
			EAN8bean.setBarHeight(barHeight);
			EAN8bean.setModuleWidth(moduleWidth);
			EAN8bean.setQuietZone(quietzoneWidth);
			EAN8bean.setChecksumMode(ChecksumMode.CP_CHECK);
			EAN8bean.setMsgPosition(HRP);
			EAN8bean.setFontName(fontFace);
			EAN8bean.setFontSize(fontSize);
			
			EAN13bean.setBarHeight(barHeight);
			EAN13bean.setModuleWidth(moduleWidth);
			EAN13bean.setQuietZone(quietzoneWidth);
			EAN13bean.setChecksumMode(ChecksumMode.CP_CHECK);
			EAN13bean.setMsgPosition(HRP);
			EAN13bean.setFontName(fontFace);
			EAN13bean.setFontSize(fontSize);
			
			UPCAbean.setBarHeight(barHeight);
			UPCAbean.setModuleWidth(moduleWidth);
			UPCAbean.setQuietZone(quietzoneWidth);
			UPCAbean.setChecksumMode(ChecksumMode.CP_CHECK);
			UPCAbean.setMsgPosition(HRP);
			UPCAbean.setFontName(fontFace);
			UPCAbean.setFontSize(fontSize);
			
			UPCEbean.setBarHeight(barHeight);
			UPCEbean.setModuleWidth(moduleWidth);
			UPCEbean.setQuietZone(quietzoneWidth);
			UPCEbean.setChecksumMode(ChecksumMode.CP_CHECK);
			UPCEbean.setMsgPosition(HRP);
			UPCEbean.setFontName(fontFace);
			UPCEbean.setFontSize(fontSize);
			
			Code39bean.setBarHeight(barHeight);
			Code39bean.setModuleWidth(moduleWidth);
			Code39bean.setWideFactor((moduleWidth > 0.508f) ? 3.0f : 2.0f);
			Code39bean.setIntercharGapWidth(moduleWidth);
			Code39bean.setQuietZone(quietzoneWidth);
			Code39bean.setChecksumMode(ChecksumMode.CP_IGNORE);
			Code39bean.setMsgPosition(HRP);
			Code39bean.setFontName(fontFace);
			Code39bean.setFontSize(fontSize);

			String addonString = "";
			
			double bcodeWidth = 0;
			double bcodeHeight = 0;
			double bcodeWidthIN = 0;
			double bcodeHeightIN = 0;
			switch (UPCTypeSwitch){
				
				case EAN8:
					
					CheckDigit = EAN.getCheckDigit(UPCNum, 8);
				//Open output file
					outputFile = new File("preview.png");
					try {
						out = new FileOutputStream(outputFile);
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					}
					try {
					    //Set up the canvas provider for monochrome PNG output 
						//Point test = shell.getDisplay().getDPI();
						//test.toString();
					    BitmapCanvasProvider canvas = new BitmapCanvasProvider(out, imageFormat, imageResolution, BufferedImage.TYPE_INT_ARGB, false, 0, barColor, fontColor, backgroundColor, isTransparent);

					    //Generate the barcode
					    EAN8bean.generateBarcode(canvas, UPCNum + CheckDigit);

					    //Signal end of generation
					    try {
							canvas.finish();
						} catch (IOException e) {
							e.printStackTrace();
						}
					} finally {
					    try {
							out.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					
					try {
						 image = ImageIO.read(outputFile);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					
					bcodeWidth = (double) Math.round(EAN8bean.calcDimensions(UPCNum + CheckDigit).getWidthPlusQuiet() * 100) / 100;
					bcodeHeight = (double) Math.round(EAN8bean.calcDimensions(UPCNum + CheckDigit).getHeightPlusQuiet() * 100) / 100;
					bcodeWidthIN = (double) Math.round(UnitConv.mm2in(EAN8bean.calcDimensions(UPCNum + CheckDigit).getWidthPlusQuiet() * 100)) / 100;
					bcodeHeightIN = (double) Math.round(UnitConv.mm2in(EAN8bean.calcDimensions(UPCNum + CheckDigit).getHeightPlusQuiet() * 100)) / 100;
					
					checkdigitTextField.setText("" + CheckDigit);
					
					break;
					
				case UPCA:
					
					CheckDigit = UPC.getCheckDigit(UPCNum, 12);
				//Open output file
					outputFile = new File("preview.png");
					try {
						out = new FileOutputStream(outputFile);
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					}
					try {
					    //Set up the canvas provider for monochrome PNG output 
						//Point test = shell.getDisplay().getDPI();
						//test.toString();
						BitmapCanvasProvider canvas = new BitmapCanvasProvider(out, imageFormat, imageResolution, BufferedImage.TYPE_INT_ARGB, false, 0, barColor, fontColor, backgroundColor, isTransparent);

						if (addonTextField.getText().length() == 2 || addonTextField.getText().length() == 5){
							
							char[] digits;
							digits = addonTextField.getText().toCharArray();
							for (int i = 0; i < 5; i++){
								
								if (Character.isDigit(Integer.parseInt(Character.toString(digits[0]))) == false){
									
									verifyAddon = true;
									
								}
								
							}
							
							if (verifyAddon == true){
								
								addonString = "+" + addonTextField.getText();
								
							}
							else {
								
								addonString = "";
								
							}
							
						}
						
					    //Generate the barcode
					    UPCAbean.generateBarcode(canvas, UPCNum + CheckDigit + addonString);

					    //Signal end of generation
					    try {
							canvas.finish();
						} catch (IOException e) {
							e.printStackTrace();
						}
					} finally {
					    try {
							out.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					
					try {
						 image = ImageIO.read(outputFile);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					
					bcodeWidth = (double) Math.round(UPCAbean.calcDimensions(UPCNum + CheckDigit + addonString).getWidthPlusQuiet() * 100) / 100;
					bcodeHeight = (double) Math.round(UPCAbean.calcDimensions(UPCNum + CheckDigit + addonString).getHeightPlusQuiet() * 100) / 100;
					bcodeWidthIN = (double) Math.round(UnitConv.mm2in(UPCAbean.calcDimensions(UPCNum + CheckDigit + addonString).getWidthPlusQuiet() * 100)) / 100;
					bcodeHeightIN = (double) Math.round(UnitConv.mm2in(UPCAbean.calcDimensions(UPCNum + CheckDigit + addonString).getHeightPlusQuiet() * 100)) / 100;
					
					checkdigitTextField.setText("" + CheckDigit);
					
					break;
					
				case EAN13:
					
					CheckDigit = EAN.getCheckDigit(UPCNum, 13);
				//Open output file
					outputFile = new File("preview.png");
					try {
						out = new FileOutputStream(outputFile);
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					}
					try {
					    //Set up the canvas provider for monochrome PNG output 
						//Point test = shell.getDisplay().getDPI();
						//test.toString();
						BitmapCanvasProvider canvas = new BitmapCanvasProvider(out, imageFormat, imageResolution, BufferedImage.TYPE_INT_ARGB, false, 0, barColor, fontColor, backgroundColor, isTransparent);

						if (addonTextField.getText().length() == 2 || addonTextField.getText().length() == 5){
							
							char[] digits;
							digits = addonTextField.getText().toCharArray();
							for (int i = 0; i < 5; i++){
								
								if (Character.isDigit(Integer.parseInt(Character.toString(digits[0]))) == false){
									
									verifyAddon = true;
									
								}
								
							}
							
							if (verifyAddon == true){
								
								addonString = "+" + addonTextField.getText();
								
							}
							else {
								
								addonString = "";
								
							}
							
						}
						
					    //Generate the barcode
					    EAN13bean.generateBarcode(canvas, UPCNum + CheckDigit + addonString);

					    //Signal end of generation
					    try {
							canvas.finish();
						} catch (IOException e) {
							e.printStackTrace();
						}
					} finally {
					    try {
							out.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					
					try {
						 image = ImageIO.read(outputFile);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					
					bcodeWidth = (double) Math.round(EAN13bean.calcDimensions(UPCNum + CheckDigit + addonString).getWidthPlusQuiet() * 100) / 100;
					bcodeHeight = (double) Math.round(EAN13bean.calcDimensions(UPCNum + CheckDigit + addonString).getHeightPlusQuiet() * 100) / 100;
					bcodeWidthIN = (double) Math.round(UnitConv.mm2in(EAN13bean.calcDimensions(UPCNum + CheckDigit + addonString).getWidthPlusQuiet() * 100)) / 100;
					bcodeHeightIN = (double) Math.round(UnitConv.mm2in(EAN13bean.calcDimensions(UPCNum + CheckDigit + addonString).getHeightPlusQuiet() * 100)) / 100;
					
					checkdigitTextField.setText("" + CheckDigit);
					
					break;
					
				case QRCODE:
					
					//Open output file
					outputFile = new File("preview.png");
					out = null;
					try {
						out = new FileOutputStream(outputFile);
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					}
					
					if (errorLevelSelectQR.getSelectedIndex() == 0){
						
						errorCorrectionLevel = ErrorCorrectionLevel.L;
						
					}
					else if (errorLevelSelectQR.getSelectedIndex() == 1){
						
						errorCorrectionLevel = ErrorCorrectionLevel.M;
						
					}
					else if (errorLevelSelectQR.getSelectedIndex() == 2){
						
						errorCorrectionLevel = ErrorCorrectionLevel.Q;
						
					}
					else if (errorLevelSelectQR.getSelectedIndex() == 3){
						
						errorCorrectionLevel = ErrorCorrectionLevel.H;
						
					}
					
					qrSize = Integer.parseInt(sizeTextFieldQR.getText());
					
					QRCodeWriter QRWriter = new QRCodeWriter();
				    Hashtable<EncodeHintType, ErrorCorrectionLevel> hintMap = new Hashtable<EncodeHintType, ErrorCorrectionLevel>();
				    hintMap.put(EncodeHintType.ERROR_CORRECTION, errorCorrectionLevel);
					BitMatrix bitMatrix = null;
					try {
						bitMatrix = QRWriter.encode(UPCNum, BarcodeFormat.QR_CODE, qrSize, qrSize, hintMap);
					} catch (WriterException e2) {
						e2.printStackTrace();
					}
					BufferedImage QRCodeBufferedImage = MatrixToImageWriter.toBufferedImage(bitMatrix, backgroundColor, barColor);
					
					try {
						ImageIO.write(QRCodeBufferedImage, "png", outputFile);
					} catch (IOException e) {
						e.printStackTrace();
					}
					
					try {
						 image = ImageIO.read(outputFile);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				    
				    bcodeWidth = (double) Math.round(((image.getWidth() * 25.4) / guestResolution) * 100) / 100;
					bcodeHeight = (double) Math.round(((image.getHeight() * 25.4) / guestResolution) * 100) / 100;
					bcodeWidthIN = (double) Math.round((((image.getWidth() * 25.4) / guestResolution) * 0.0393700787401575) * 100) / 100;
					bcodeHeightIN = (double) Math.round((((image.getHeight() * 25.4) / guestResolution) * 0.0393700787401575) * 100) / 100;
					
					break;
					
				case UPCE:
					
					CheckDigit = UPC.getCheckDigit(UPCNum, 6);
				//Open output file
					outputFile = new File("preview.png");
					try {
						out = new FileOutputStream(outputFile);
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					}
					try {
					    //Set up the canvas provider for monochrome PNG output 
						//Point test = shell.getDisplay().getDPI();
						//test.toString();
						BitmapCanvasProvider canvas = new BitmapCanvasProvider(out, imageFormat, imageResolution, BufferedImage.TYPE_INT_ARGB, false, 0, barColor, fontColor, backgroundColor, isTransparent);

						if (addonTextField.getText().length() == 2 || addonTextField.getText().length() == 5){
							
							char[] digits;
							digits = addonTextField.getText().toCharArray();
							for (int i = 0; i < 5; i++){
								
								if (Character.isDigit(Integer.parseInt(Character.toString(digits[0]))) == false){
									
									verifyAddon = true;
									
								}
								
							}
							
							if (verifyAddon == true){
								
								addonString = "+" + addonTextField.getText();
								
							}
							else {
								
								addonString = "";
								
							}
							
						}
						
					    //Generate the barcode
					    UPCEbean.generateBarcode(canvas, UPCNum + CheckDigit + addonString);

					    //Signal end of generation
					    try {
							canvas.finish();
						} catch (IOException e) {
							e.printStackTrace();
						}
					} finally {
					    try {
							out.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					
					try {
						 image = ImageIO.read(outputFile);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					
					bcodeWidth = (double) Math.round(UPCAbean.calcDimensions(UPCNum + CheckDigit + addonString).getWidthPlusQuiet() * 100) / 100;
					bcodeHeight = (double) Math.round(UPCAbean.calcDimensions(UPCNum + CheckDigit + addonString).getHeightPlusQuiet() * 100) / 100;
					bcodeWidthIN = (double) Math.round(UnitConv.mm2in(UPCAbean.calcDimensions(UPCNum + CheckDigit + addonString).getWidthPlusQuiet() * 100)) / 100;
					bcodeHeightIN = (double) Math.round(UnitConv.mm2in(UPCAbean.calcDimensions(UPCNum + CheckDigit + addonString).getHeightPlusQuiet() * 100)) / 100;
					
					checkdigitTextField.setText("" + CheckDigit);
					
					break;
				
				case CODE39:
					
					//Open output file
					outputFile = new File("preview.png");
					try {
						out = new FileOutputStream(outputFile);
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					}
					try {
					    //Set up the canvas provider for monochrome PNG output 
						//Point test = shell.getDisplay().getDPI();
						//test.toString();
					    BitmapCanvasProvider canvas = new BitmapCanvasProvider(out, imageFormat, imageResolution, BufferedImage.TYPE_INT_ARGB, false, 0, barColor, fontColor, backgroundColor, isTransparent);

					    //Generate the barcode
					    Code39bean.generateBarcode(canvas, UPCNum);

					    //Signal end of generation
					    try {
							canvas.finish();
						} catch (IOException e) {
							e.printStackTrace();
						}
					} finally {
					    try {
							out.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					
					try {
						 image = ImageIO.read(outputFile);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					
					bcodeWidth = (double) Math.round(Code39bean.calcDimensions(UPCNum).getWidthPlusQuiet() * 100) / 100;
					bcodeHeight = (double) Math.round(Code39bean.calcDimensions(UPCNum).getHeightPlusQuiet() * 100) / 100;
					bcodeWidthIN = (double) Math.round(UnitConv.mm2in(Code39bean.calcDimensions(UPCNum).getWidthPlusQuiet() * 100)) / 100;
					bcodeHeightIN = (double) Math.round(UnitConv.mm2in(Code39bean.calcDimensions(UPCNum).getHeightPlusQuiet() * 100)) / 100;
					
					checkdigitTextField.setText("");
					
					break;
				
			}
			
			previewLabel.setIcon(new ImageIcon(image));
			previewLabel.setPreferredSize(new java.awt.Dimension(image.getWidth() + 20, image.getHeight() + 20));
			measurementsLabel.setText(bcodeWidth + "mm x " + bcodeHeight + "mm / " + bcodeWidthIN + "in x " + bcodeHeightIN + "in");
			
		}
	}
	
	private JSeparator getMenuSeparator() {
		if(menuSeparator == null) {
			menuSeparator = new JSeparator();
		}
		return menuSeparator;
	}
	
	private void validateUPC(KeyEvent evt) {
		//Pattern pattern = Pattern.compile("[0-9]+");
		// In case you would like to ignore case sensitivity you could use this
		// statement
		// Pattern pattern = Pattern.compile("\\s+", Pattern.CASE_INSENSITIVE);
		//Matcher matcher = pattern.matcher(jTextField1.getText());
		
		if (UPCTypeSwitch != QRCODE && UPCTypeSwitch != CODE39){
		
			char UPCNumbers[] = upcTextField.getText().toCharArray();
			//System.out.println("matcher: " + matcher.group());
			
			boolean InvalidUPC = false;
			for (int i = 0; i < UPCNumbers.length; i++){
				//System.out.println(Character.isDigit(UPCNumbers[i]));
				//System.out.println(Character.isDigit(Integer.parseInt(Character.toString(UPCNumbers[i]))));
				if (Character.isDigit(UPCNumbers[i]) == false){
					InvalidUPC = true;
				}
				else{
					InvalidUPC = false;
				}
			}
			//System.out.println("UPCNumber: " + jTextField1.getText() + " | UPCLengthConstraint: " + UPCLengthConstraint + " | InvalidUPC: " + InvalidUPC);
			if (upcTextField.getText().length() != UPCLengthConstraint || InvalidUPC == true){
				checkdigitTextField.setText("");
				fileMenuItem1.setEnabled(false);
				exportButton.setEnabled(false);
				updateButton.setEnabled(false);
			}
			else{
				fileMenuItem1.setEnabled(true);
				exportButton.setEnabled(true);
				updateButton.setEnabled(true);
			}
			
		}
		else if (UPCTypeSwitch == QRCODE && qrCodeTextArea.getText().length() > 0){
			
			fileMenuItem1.setEnabled(true);
			exportButton.setEnabled(true);
			updateButton.setEnabled(true);
			
		}
		else if (UPCTypeSwitch == QRCODE && qrCodeTextArea.getText().length() == 0){
			
			fileMenuItem1.setEnabled(false);
			exportButton.setEnabled(false);
			updateButton.setEnabled(false);
			
		}
		else if (UPCTypeSwitch == CODE39 && upcTextField.getText().length() > 0){
			
			fileMenuItem1.setEnabled(true);
			exportButton.setEnabled(true);
			updateButton.setEnabled(true);
			
		}
		else if (UPCTypeSwitch == CODE39 && upcTextField.getText().length() == 0){
			
			fileMenuItem1.setEnabled(true);
			exportButton.setEnabled(true);
			updateButton.setEnabled(true);
			
		}
	}
	
	private void UPCTypeChangeListener() {
		
		File outputFile = null;
		OutputStream out = null;
		BufferedImage image = null;
		Color barColor = barColorTextField.getBackground();
		Color fontColor = fontColorTextField.getBackground();
		Color backgroundColor = backgroundColorTextfield.getBackground();
		boolean isTransparent = isTransparentBackground.isSelected();
		
		int resolution = Integer.parseInt(dpiTextField.getText());
		int pxModuleWidth = (int) Math.ceil(resolution/96);
		String fontFace = fontFaceValueLabel.getText();
		double barHeight = px2mm(Integer.parseInt(barHeightTextField.getText()));
		double moduleWidth = moduleWidth(pxModuleWidth, resolution);
		double quietzoneWidth = quietzoneWidth(moduleWidth);
		double fontSize = px2mm(Integer.parseInt(fontSizeValueLabel.getText()));
		
		HumanReadablePlacement HRP;
		if (hrtComboBox.getSelectedItem() == "Bottom"){
			
			HRP = HumanReadablePlacement.HRP_BOTTOM;
			
		}
		else if (hrtComboBox.getSelectedItem() == "Top"){
			
			HRP = HumanReadablePlacement.HRP_TOP;
			
		}
		else {
			
			HRP = HumanReadablePlacement.HRP_NONE;
			
		}
		
		EAN8Bean EAN8bean = new EAN8Bean();
		EAN13Bean EAN13bean = new EAN13Bean();
		UPCABean UPCAbean = new UPCABean();
		UPCEBean UPCEbean = new UPCEBean();
		Code39Bean Code39bean = new Code39Bean();
		
		EAN8bean.setBarHeight(barHeight);
		EAN8bean.setModuleWidth(moduleWidth);
		EAN8bean.setQuietZone(quietzoneWidth);
		EAN8bean.setChecksumMode(ChecksumMode.CP_ADD);
		EAN8bean.setMsgPosition(HRP);
		EAN8bean.setFontName(fontFace);
		EAN8bean.setFontSize(fontSize);
		
		EAN13bean.setBarHeight(barHeight);
		EAN13bean.setModuleWidth(moduleWidth);
		EAN13bean.setQuietZone(quietzoneWidth);
		EAN13bean.setChecksumMode(ChecksumMode.CP_ADD);
		EAN13bean.setMsgPosition(HRP);
		EAN13bean.setFontName(fontFace);
		EAN13bean.setFontSize(fontSize);
		
		UPCAbean.setBarHeight(barHeight);
		UPCAbean.setModuleWidth(moduleWidth);
		UPCAbean.setQuietZone(quietzoneWidth);
		UPCAbean.setChecksumMode(ChecksumMode.CP_ADD);
		UPCAbean.setMsgPosition(HRP);
		UPCAbean.setFontName(fontFace);
		UPCAbean.setFontSize(fontSize);
		
		UPCEbean.setBarHeight(barHeight);
		UPCEbean.setModuleWidth(moduleWidth);
		UPCEbean.setQuietZone(quietzoneWidth);
		UPCEbean.setChecksumMode(ChecksumMode.CP_ADD);
		UPCEbean.setMsgPosition(HRP);
		UPCEbean.setFontName(fontFace);
		UPCEbean.setFontSize(fontSize);
		
		Code39bean.setBarHeight(barHeight);
		Code39bean.setModuleWidth(moduleWidth);
		Code39bean.setWideFactor((moduleWidth > 0.508f) ? 3.0f : 2.0f);
		Code39bean.setIntercharGapWidth(moduleWidth);
		Code39bean.setQuietZone(quietzoneWidth);
		Code39bean.setChecksumMode(ChecksumMode.CP_IGNORE);
		Code39bean.setMsgPosition(HRP);
		Code39bean.setFontName(fontFace);
		Code39bean.setFontSize(fontSize);
		
		//Display display = new Display();
	    //Shell shell = new Shell(display);
		//Device device = shell.getDisplay();
		
		double bcodeWidth;
		double bcodeHeight;
		double bcodeWidthIN;
		double bcodeHeightIN;
		switch(UPCTypeSwitch){
		
		case 1: // GTIN-8
		    
		    //MutableAttributeSet attributes = new SimpleAttributeSet();
		    
		    //jTextPane1.setStyledDocument(new DefaultStyledDocument(new StyleContext() {
		    //    @Override
		    //    public Font getFont(AttributeSet attr) {
		    //        return dynamicFont32Pt;
		    //    }
		    //}));
		    
		    //main.addAttribute("ean13", dynamicFont78Pt);
			
			//Open output file
			outputFile = new File("preview.png");
			try {
				out = new FileOutputStream(outputFile);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			try {
			    //Set up the canvas provider for monochrome PNG output 
				//Point test = shell.getDisplay().getDPI();
				//test.toString();
			    BitmapCanvasProvider canvas = new BitmapCanvasProvider(out, "image/png", resolution, BufferedImage.TYPE_INT_ARGB, false, 0, barColor, fontColor, backgroundColor, isTransparent);

			    //Generate the barcode
			    EAN8bean.generateBarcode(canvas, "0123456");

			    //Signal end of generation
			    try {
					canvas.finish();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} finally {
			    try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			try {
				 image = ImageIO.read(outputFile);
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		    //StyleConstants.setAlignment(main, StyleConstants.ALIGN_CENTER);  
		    //StyleConstants.setFontFamily(main,dynamicFontEAN78Pt.getFamily());
		    //StyleConstants.setFontSize(main, 78);
		    //StyleConstants.setSpaceAbove(main, -11);
		    
			//jTextPane1.getStyledDocument().setCharacterAttributes(
		    //        text.indexOf(toHighlight),
		    //        toHighlight.length(),
		    //        attributes, true
		    //    );
		    //try  
		    //{
		    // doc.remove(0, doc.getEndPosition());
		    // doc.remove(0, doc.getLength());
		    // doc.insertString(0,":AAAA*aaaa+",main);  
		    // doc.setLogicalStyle(0,main);  
		    //} catch (BadLocationException e) {}
		    //jTextPane1.setFont(dynamicFont32Pt);
		    
		    bcodeWidth = (double) Math.round(((image.getWidth() * 25.4) / guestResolution) * 100) / 100;
			bcodeHeight = (double) Math.round(((image.getHeight() * 25.4) / guestResolution) * 100) / 100;
			bcodeWidthIN = (double) Math.round((((image.getWidth() * 25.4) / guestResolution) * 0.0393700787401575) * 100) / 100;
			bcodeHeightIN = (double) Math.round((((image.getHeight() * 25.4) / guestResolution) * 0.0393700787401575) * 100) / 100;
			previewLabel.setIcon(new ImageIcon(image));
			previewLabel.setPreferredSize(new java.awt.Dimension(image.getWidth() + 20, image.getHeight() + 20));
			measurementsLabel.setText(bcodeWidth + "mm x " + bcodeHeight + "mm / " + bcodeWidthIN + "in x " + bcodeHeightIN + "in");
			
		    upcAMenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
		    upcEMenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
			ean8MenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/checkmark16x16.png")));
			ean13MenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
			code39MenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
			QRCodeMenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
			fileMenuItem1.setEnabled(true);
			UPCLengthConstraint = 7;
			symbologyTitleLabel.setText("Symbology: EAN-8");
			upcLabelLabel.setText("EAN (7 Digits)");
			upcTextField.setDocument(new JTextFieldLimit(7));
			upcTextField.setText("0123456");
			checkdigitTextField.setText("5");
			addonTextField.setText("");
			addonTextField.setEnabled(false);
			addonLabel.setEnabled(false);
			
			optionsTabbedPane.removeTabAt(0);
			optionsTabbedPane.insertTab("Configuration", null, configurationPanel, null, 0);
			optionsTabbedPane.setSelectedIndex(0);
			
			if (optionsTabbedPane.indexOfTab("Font") == -1){
				
				optionsTabbedPane.insertTab("Font", null, fontPanel, null, 1);
				
			}
			
			try{
				
				windowPanel.remove(dataAssistantButton);
				windowPanel.remove(qrCodeTextAreaScrollPane);
				
			}
			catch (NullPointerException e){
				
				
				
			}
			
			windowPanel.add(upcTextField, "2, 3, 7, 3");
			windowPanel.add(checkdigitTextField, "9, 3");
			windowPanel.add(addonLabel, "1, 5, r, f");
			windowPanel.add(addonTextField, "2, 5, 4, 5");
			
			break;
			
		case 2: // GTIN-12
			
			//Open output file
			outputFile = new File("preview.png");
			out = null;
			try {
				out = new FileOutputStream(outputFile);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			try {
			    //Set up the canvas provider for monochrome PNG output 
				BitmapCanvasProvider canvas = new BitmapCanvasProvider(out, "image/png", resolution, BufferedImage.TYPE_INT_ARGB, false, 0, barColor, fontColor, backgroundColor, isTransparent);

			    //Generate the barcode
			    UPCAbean.generateBarcode(canvas, "01234567890");

			    //Signal end of generation
			    try {
					canvas.finish();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} finally {
			    try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			try {
				 image = ImageIO.read(outputFile);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		    
		    //StyleConstants.setAlignment(main, StyleConstants.ALIGN_CENTER);  
		    //StyleConstants.setFontFamily(main,dynamicFontUPC40Pt.getFamily());
		    //StyleConstants.setFontSize(main, 40);
		    //StyleConstants.setSpaceAbove(main, 0);
		    //try  
		    //{
		    // doc.remove(0, doc.getEndPosition());
		    // doc.remove(0, doc.getLength());
		    // doc.insertString(0,"0ppppp-;;;;;/",main);  
		    // doc.setLogicalStyle(0,main);  
		    //} catch (BadLocationException e) {}
		    
		    bcodeWidth = (double) Math.round(((image.getWidth() * 25.4) / guestResolution) * 100) / 100;
			bcodeHeight = (double) Math.round(((image.getHeight() * 25.4) / guestResolution) * 100) / 100;
			bcodeWidthIN = (double) Math.round((((image.getWidth() * 25.4) / guestResolution) * 0.0393700787401575) * 100) / 100;
			bcodeHeightIN = (double) Math.round((((image.getHeight() * 25.4) / guestResolution) * 0.0393700787401575) * 100) / 100;
			previewLabel.setIcon(new ImageIcon(image));
			previewLabel.setPreferredSize(new java.awt.Dimension(image.getWidth() + 20, image.getHeight() + 20));
			measurementsLabel.setText(bcodeWidth + "mm x " + bcodeHeight + "mm / " + bcodeWidthIN + "in x " + bcodeHeightIN + "in");
			
		    upcAMenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/checkmark16x16.png")));
		    upcEMenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
			ean8MenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
			ean13MenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
			code39MenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
			QRCodeMenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
			fileMenuItem1.setEnabled(true);
			UPCLengthConstraint = 11;
			symbologyTitleLabel.setText("Symbology: UPC-A");
			upcLabelLabel.setText("UPC (11 Digits)");
			upcTextField.setDocument(new JTextFieldLimit(11));
			upcTextField.setText("01234567890");
			checkdigitTextField.setText("5");
			addonTextField.setText("");
			addonTextField.setEnabled(true);
			addonLabel.setEnabled(true);
			
			optionsTabbedPane.removeTabAt(0);
			optionsTabbedPane.insertTab("Configuration", null, configurationPanel, null, 0);
			optionsTabbedPane.setSelectedIndex(0);
			
			if (optionsTabbedPane.indexOfTab("Font") == -1){
				
				optionsTabbedPane.insertTab("Font", null, fontPanel, null, 1);
				
			}
			
			try{
				
				windowPanel.remove(dataAssistantButton);
				windowPanel.remove(qrCodeTextAreaScrollPane);
				
			}
			catch (NullPointerException e){
				
				
				
			}
			
			windowPanel.add(upcTextField, "2, 3, 7, 3");
			windowPanel.add(checkdigitTextField, "9, 3");
			windowPanel.add(addonLabel, "1, 5, r, f");
			windowPanel.add(addonTextField, "2, 5, 4, 5");
			
			break;
			
		case 3: // GTIN-13
			
			//Open output file
			outputFile = new File("preview.png");
			out = null;
			try {
				out = new FileOutputStream(outputFile);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			try {
			    //Set up the canvas provider for monochrome PNG output 
			    BitmapCanvasProvider canvas = new BitmapCanvasProvider(out, "image/png", resolution, BufferedImage.TYPE_INT_ARGB, false, 0, barColor, fontColor, backgroundColor, isTransparent);

			    //Generate the barcode
			    EAN13bean.generateBarcode(canvas, "012345678901");

			    //Signal end of generation
			    try {
					canvas.finish();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} finally {
			    try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			try {
				 image = ImageIO.read(outputFile);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		    
		    //StyleConstants.setAlignment(main, StyleConstants.ALIGN_CENTER);  
		    //StyleConstants.setFontFamily(main,dynamicFontEAN78Pt.getFamily());
		    //StyleConstants.setFontSize(main, 78);
		    //StyleConstants.setSpaceAbove(main, -11);
		    //try  
		    //{
		    // doc.remove(0, doc.getEndPosition());
		    // doc.remove(0, doc.getLength());
		    // doc.insertString(0,"0AAAAAA*aaaaaa+",main);  
		    // doc.setLogicalStyle(0,main);  
		    //} catch (BadLocationException e) {}
		    
		    bcodeWidth = (double) Math.round(((image.getWidth() * 25.4) / guestResolution) * 100) / 100;
			bcodeHeight = (double) Math.round(((image.getHeight() * 25.4) / guestResolution) * 100) / 100;
			bcodeWidthIN = (double) Math.round((((image.getWidth() * 25.4) / guestResolution) * 0.0393700787401575) * 100) / 100;
			bcodeHeightIN = (double) Math.round((((image.getHeight() * 25.4) / guestResolution) * 0.0393700787401575) * 100) / 100;
			previewLabel.setIcon(new ImageIcon(image));
			previewLabel.setPreferredSize(new java.awt.Dimension(image.getWidth() + 20, image.getHeight() + 20));
			measurementsLabel.setText(bcodeWidth + "mm x " + bcodeHeight + "mm / " + bcodeWidthIN + "in x " + bcodeHeightIN + "in");
			
		    upcAMenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
		    upcEMenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
			ean8MenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
			ean13MenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/checkmark16x16.png")));
			code39MenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
			QRCodeMenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
			fileMenuItem1.setEnabled(true);
			UPCLengthConstraint = 12;
			symbologyTitleLabel.setText("Symbology: EAN-13");
			upcLabelLabel.setText("EAN (12 Digits)");
			upcTextField.setDocument(new JTextFieldLimit(12));
			upcTextField.setText("012345678901");
			checkdigitTextField.setText("2");
			addonTextField.setText("");
			addonTextField.setEnabled(true);
			addonLabel.setEnabled(true);
			
			optionsTabbedPane.removeTabAt(0);
			optionsTabbedPane.insertTab("Configuration", null, configurationPanel, null, 0);
			optionsTabbedPane.setSelectedIndex(0);
			
			if (optionsTabbedPane.indexOfTab("Font") == -1){
				
				optionsTabbedPane.insertTab("Font", null, fontPanel, null, 1);
				
			}
			
			try{
				
				windowPanel.remove(dataAssistantButton);
				windowPanel.remove(qrCodeTextAreaScrollPane);
				
			}
			catch (NullPointerException e){
				
				
				
			}
			
			windowPanel.add(upcTextField, "2, 3, 7, 3");
			windowPanel.add(checkdigitTextField, "9, 3");
			windowPanel.add(addonLabel, "1, 5, r, f");
			windowPanel.add(addonTextField, "2, 5, 4, 5");
			
			break;
			
		case 4: // QRCode
			
			//Open output file
			outputFile = new File("preview.png");
			out = null;
			try {
				out = new FileOutputStream(outputFile);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			
			ErrorCorrectionLevel ECL = ErrorCorrectionLevel.L;
			switch (errorLevelSelectQR.getSelectedIndex()){
			
			case 0:
				
				ECL = ErrorCorrectionLevel.L;
				break;
				
			case 1:
				
				ECL = ErrorCorrectionLevel.M;
				break;
				
			case 2:
				
				ECL = ErrorCorrectionLevel.Q;
				break;
				
			case 4:
				
				ECL = ErrorCorrectionLevel.H;
			break;
			
			}
			
			QRCodeWriter QRWriter = new QRCodeWriter();
		    Hashtable<EncodeHintType, ErrorCorrectionLevel> hintMap = new Hashtable<EncodeHintType, ErrorCorrectionLevel>();
		    hintMap.put(EncodeHintType.ERROR_CORRECTION, ECL);
			BitMatrix bitMatrix = null;
			try {
				bitMatrix = QRWriter.encode("ABCabc", BarcodeFormat.QR_CODE, Integer.parseInt(sizeTextFieldQR.getText()), Integer.parseInt(sizeTextFieldQR.getText()), hintMap);
			} catch (WriterException e2) {
				e2.printStackTrace();
			}
			BufferedImage QRCodeBufferedImage = MatrixToImageWriter.toBufferedImage(bitMatrix, backgroundColor, barColor);
			
			try {
				ImageIO.write(QRCodeBufferedImage, "png", outputFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				 image = ImageIO.read(outputFile);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		    
		    bcodeWidth = (double) Math.round(((image.getWidth() * 25.4) / guestResolution) * 100) / 100;
			bcodeHeight = (double) Math.round(((image.getHeight() * 25.4) / guestResolution) * 100) / 100;
			bcodeWidthIN = (double) Math.round((((image.getWidth() * 25.4) / guestResolution) * 0.0393700787401575) * 100) / 100;
			bcodeHeightIN = (double) Math.round((((image.getHeight() * 25.4) / guestResolution) * 0.0393700787401575) * 100) / 100;
			previewLabel.setIcon(new ImageIcon(image));
			previewLabel.setPreferredSize(new java.awt.Dimension(image.getWidth() + 20, image.getHeight() + 20));
			measurementsLabel.setText(bcodeWidth + "mm x " + bcodeHeight + "mm / " + bcodeWidthIN + "in x " + bcodeHeightIN + "in");
			
		    upcAMenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
		    upcEMenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
			ean8MenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
			ean13MenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
			code39MenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
			QRCodeMenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/checkmark16x16.png")));
			fileMenuItem1.setEnabled(true);
			UPCLengthConstraint = 7000;
			symbologyTitleLabel.setText("Symbology: QRCode");
			upcLabelLabel.setText("Raw Data:");
			upcTextField.setDocument(new JTextFieldLimit(UPCLengthConstraint));
			addonTextField.setEnabled(false);
			addonLabel.setEnabled(false);
			
			optionsTabbedPane.removeTabAt(0);
			optionsTabbedPane.insertTab("QR Configuration", null, qrConfigurationPanel, null, 0);
			optionsTabbedPane.setSelectedIndex(0);
			
			if (optionsTabbedPane.indexOfTab("Font") >= 0){
				
				optionsTabbedPane.removeTabAt(optionsTabbedPane.indexOfTab("Font"));
				
			}
			
			//dataAssistantButton = new JButton();
			dataAssistantButton.setText("Data Assistant");
			dataAssistantButton.setFont(new java.awt.Font("Calibri",1,20));
			dataAssistantButton.addMouseListener(new MouseAdapter() {

				public void mouseClicked(MouseEvent evt) {
					DataAssistant dataAssistant = new DataAssistant(mFrame);
					if (frameIsActive == false){
						frameIsActive = true;
						mFrame.setEnabled(false);
						dataAssistant.setLocationRelativeTo(mFrame);
						dataAssistant.setVisible(true);
					}
				}
			});
			
			try{
				
				windowPanel.remove(upcTextField);
				windowPanel.remove(checkdigitTextField);
				windowPanel.remove(addonLabel);
				windowPanel.remove(addonTextField);
				
			}
			catch (NullPointerException e){
				
				
				
			}
			
			qrCodeTextArea = new JTextArea();
			qrCodeTextAreaScrollPane = new JScrollPane(qrCodeTextArea);
			qrCodeTextAreaScrollPane.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
			qrCodeTextArea.setText("ABCabc");
			qrCodeTextArea.addKeyListener(new KeyAdapter() {
				public void keyReleased(KeyEvent evt) {
					validateUPC(evt);
				}
			}
			);
			
			windowPanel.add(dataAssistantButton, "1, 5, 2, 5");
			windowPanel.add(qrCodeTextAreaScrollPane, "3, 3, 9, 5");
			
			break;
			
		case 5: // UPC-E
			
			//Open output file
			outputFile = new File("preview.png");
			out = null;
			try {
				out = new FileOutputStream(outputFile);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			try {
			    //Set up the canvas provider for monochrome PNG output 
				BitmapCanvasProvider canvas = new BitmapCanvasProvider(out, "image/png", resolution, BufferedImage.TYPE_INT_ARGB, false, 0, barColor, fontColor, backgroundColor, isTransparent);

			    //Generate the barcode
			    UPCEbean.generateBarcode(canvas, "0712345");

			    //Signal end of generation
			    try {
					canvas.finish();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} finally {
			    try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			try {
				 image = ImageIO.read(outputFile);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		    
		    //StyleConstants.setAlignment(main, StyleConstants.ALIGN_CENTER);  
		    //StyleConstants.setFontFamily(main,dynamicFontUPC40Pt.getFamily());
		    //StyleConstants.setFontSize(main, 40);
		    //StyleConstants.setSpaceAbove(main, 0);
		    //try  
		    //{
		    // doc.remove(0, doc.getEndPosition());
		    // doc.remove(0, doc.getLength());
		    // doc.insertString(0,"0ppppp-;;;;;/",main);  
		    // doc.setLogicalStyle(0,main);  
		    //} catch (BadLocationException e) {}
		    
		    bcodeWidth = (double) Math.round(((image.getWidth() * 25.4) / guestResolution) * 100) / 100;
			bcodeHeight = (double) Math.round(((image.getHeight() * 25.4) / guestResolution) * 100) / 100;
			bcodeWidthIN = (double) Math.round((((image.getWidth() * 25.4) / guestResolution) * 0.0393700787401575) * 100) / 100;
			bcodeHeightIN = (double) Math.round((((image.getHeight() * 25.4) / guestResolution) * 0.0393700787401575) * 100) / 100;
			previewLabel.setIcon(new ImageIcon(image));
			previewLabel.setPreferredSize(new java.awt.Dimension(image.getWidth() + 20, image.getHeight() + 20));
			measurementsLabel.setText(bcodeWidth + "mm x " + bcodeHeight + "mm / " + bcodeWidthIN + "in x " + bcodeHeightIN + "in");
			
		    upcAMenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
		    upcEMenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/checkmark16x16.png")));
			ean8MenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
			ean13MenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
			code39MenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
			QRCodeMenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
			fileMenuItem1.setEnabled(true);
			UPCLengthConstraint = 7;
			symbologyTitleLabel.setText("Symbology: UPC-E");
			upcLabelLabel.setText("UPC (7 Digits)");
			upcTextField.setDocument(new JTextFieldLimit(7));
			upcTextField.setText("0712345");
			checkdigitTextField.setText("0");
			addonTextField.setText("");
			addonTextField.setEnabled(true);
			addonLabel.setEnabled(true);
			
			optionsTabbedPane.removeTabAt(0);
			optionsTabbedPane.insertTab("Configuration", null, configurationPanel, null, 0);
			optionsTabbedPane.setSelectedIndex(0);
			
			if (optionsTabbedPane.indexOfTab("Font") == -1){
				
				optionsTabbedPane.insertTab("Font", null, fontPanel, null, 1);
				
			}
			
			try{
				
				windowPanel.remove(dataAssistantButton);
				windowPanel.remove(qrCodeTextAreaScrollPane);
				
			}
			catch (NullPointerException e){
				
				
				
			}
			
			windowPanel.add(upcTextField, "2, 3, 7, 3");
			windowPanel.add(checkdigitTextField, "9, 3");
			windowPanel.add(addonLabel, "1, 5, r, f");
			windowPanel.add(addonTextField, "2, 5, 4, 5");
			break;
			
		case 6: // GTIN-8
		    
		    //MutableAttributeSet attributes = new SimpleAttributeSet();
		    
		    //jTextPane1.setStyledDocument(new DefaultStyledDocument(new StyleContext() {
		    //    @Override
		    //    public Font getFont(AttributeSet attr) {
		    //        return dynamicFont32Pt;
		    //    }
		    //}));
		    
		    //main.addAttribute("ean13", dynamicFont78Pt);
			
			//Open output file
			outputFile = new File("preview.png");
			try {
				out = new FileOutputStream(outputFile);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			try {
			    //Set up the canvas provider for monochrome PNG output 
				//Point test = shell.getDisplay().getDPI();
				//test.toString();
			    BitmapCanvasProvider canvas = new BitmapCanvasProvider(out, "image/png", resolution, BufferedImage.TYPE_INT_ARGB, false, 0, barColor, fontColor, backgroundColor, isTransparent);

			    //Generate the barcode
			    Code39bean.generateBarcode(canvas, "123456ABCabc$%");

			    //Signal end of generation
			    try {
					canvas.finish();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} finally {
			    try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			try {
				 image = ImageIO.read(outputFile);
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		    //StyleConstants.setAlignment(main, StyleConstants.ALIGN_CENTER);  
		    //StyleConstants.setFontFamily(main,dynamicFontEAN78Pt.getFamily());
		    //StyleConstants.setFontSize(main, 78);
		    //StyleConstants.setSpaceAbove(main, -11);
		    
			//jTextPane1.getStyledDocument().setCharacterAttributes(
		    //        text.indexOf(toHighlight),
		    //        toHighlight.length(),
		    //        attributes, true
		    //    );
		    //try  
		    //{
		    // doc.remove(0, doc.getEndPosition());
		    // doc.remove(0, doc.getLength());
		    // doc.insertString(0,":AAAA*aaaa+",main);  
		    // doc.setLogicalStyle(0,main);  
		    //} catch (BadLocationException e) {}
		    //jTextPane1.setFont(dynamicFont32Pt);
		    
		    bcodeWidth = (double) Math.round(((image.getWidth() * 25.4) / guestResolution) * 100) / 100;
			bcodeHeight = (double) Math.round(((image.getHeight() * 25.4) / guestResolution) * 100) / 100;
			bcodeWidthIN = (double) Math.round((((image.getWidth() * 25.4) / guestResolution) * 0.0393700787401575) * 100) / 100;
			bcodeHeightIN = (double) Math.round((((image.getHeight() * 25.4) / guestResolution) * 0.0393700787401575) * 100) / 100;
			previewLabel.setIcon(new ImageIcon(image));
			previewLabel.setPreferredSize(new Dimension(image.getWidth() + 20, image.getHeight() + 20));
			measurementsLabel.setText(bcodeWidth + "mm x " + bcodeHeight + "mm / " + bcodeWidthIN + "in x " + bcodeHeightIN + "in");
			
		    upcAMenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
		    upcEMenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
			ean8MenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
			ean13MenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
			code39MenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/checkmark16x16.png")));
			QRCodeMenuItem.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/blank16x16.png")));
			fileMenuItem1.setEnabled(true);
			UPCLengthConstraint = 25;
			symbologyTitleLabel.setText("Symbology: Code 39");
			upcLabelLabel.setText("Code 39 (25 Digits)");
			upcTextField.setDocument(new JTextFieldLimit(25));
			upcTextField.setText("123456ABCabc$%");
			checkdigitTextField.setText("");
			addonTextField.setText("");
			addonTextField.setEnabled(false);
			addonLabel.setEnabled(false);
			
			optionsTabbedPane.removeTabAt(0);
			optionsTabbedPane.insertTab("Configuration", null, configurationPanel, null, 0);
			optionsTabbedPane.setSelectedIndex(0);
			
			if (optionsTabbedPane.indexOfTab("Font") == -1){
				
				optionsTabbedPane.insertTab("Font", null, fontPanel, null, 1);
				
			}
			
			try{
				
				windowPanel.remove(dataAssistantButton);
				windowPanel.remove(qrCodeTextAreaScrollPane);
				
			}
			catch (NullPointerException e){
				
				
				
			}
			
			windowPanel.add(upcTextField, "2, 3, 7, 3");
			windowPanel.add(checkdigitTextField, "9, 3");
			windowPanel.add(addonLabel, "1, 5, r, f");
			windowPanel.add(addonTextField, "2, 5, 4, 5");
			
			break;
		
		}
		
	}
	
	public class JTextFieldLimit extends PlainDocument {
		/**
		 * 
		 */
		private static final long serialVersionUID = -9112284906687884430L;
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

		   if ((getLength() + str.length()) <= limit) {
			   if (toUppercase) str = str.toUpperCase();
			   super.insertString(offset, str, attr);
		   }
	   }
	}
	
	private JLabel getAddonLabel() {
		if(addonLabel == null) {
			addonLabel = new JLabel();
			addonLabel.setText("Add-On:");
			addonLabel.setFont(new java.awt.Font("Calibri",1,18));
		}
		return addonLabel;
	}
	
	private JTextField getaddonTextField() {
		if(addonTextField == null) {
			addonTextField = new JTextField();
			addonTextField.setFont(new java.awt.Font("Calibri",0,18));
			addonTextField.setDocument(new JTextFieldLimit(11));
			addonTextField.setColumns(11);
			addonTextField.setPreferredSize(new java.awt.Dimension(287, 28));
			addonTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
			MouseListener addonPopupListener = new addonPopupListener();
			addonTextField.addMouseListener(addonPopupListener);
			addonTextField.setName("jTextField3");
			addonTextField.setSize(287, 28);
			addonTextField.setDocument(new JTextFieldLimit(5));
			addonTextField.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					int key = e.getKeyCode();
					if (key == KeyEvent.VK_ENTER) {
						//Toolkit.getDefaultToolkit().beep();   
						//System.out.println("ENTER pressed");
						CalculateCheckDigit();
					}
				}
			});
		}
		return addonTextField;
	}

	private JLabel getJLabel10() {
		if(jLabel10 == null) {
			jLabel10 = new JLabel();
			jLabel10.setText("Settings");
			jLabel10.setFont(new java.awt.Font("Calibri",1,24));
		}
		return jLabel10;
	}

	private JLabel getJLabel12() {
		if(jLabel12 == null) {
			jLabel12 = new JLabel();
			jLabel12.setText("Dimensions: ");
			jLabel12.setFont(new java.awt.Font("Calibri",1,12));
		}
		return jLabel12;
	}
	
	private JLabel getJLabel13() {
		if(measurementsLabel == null) {
			measurementsLabel = new JLabel();
			measurementsLabel.setFont(new java.awt.Font("Calibri",0,12));
		}
		return measurementsLabel;
	}
	
	private JButton getExportButton() {
		if(exportButton == null) {
			exportButton = new JButton();
			exportButton.setText("Export Barcode");
			exportButton.setFont(new java.awt.Font("Calibri",1,20));
			exportButton.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent evt) {
					CalculateCheckDigit();
					exportBarcode();
				}
			});
		}
		return exportButton;
	}

	class upcPopupListener extends MouseAdapter {
	    public void mousePressed(MouseEvent e) {
	        maybeShowPopup(e);
	    }

	    public void mouseReleased(MouseEvent e) {
	        maybeShowPopup(e);
	    }

	    private void maybeShowPopup(MouseEvent e) {
	        if (e.isPopupTrigger()) {
	        	popupMenu = getJPopupMenu(upcTextField);
	            popupMenu.show(e.getComponent(), e.getX(), e.getY());
	        }
	    }
	}

	class addonPopupListener extends MouseAdapter {
	    public void mousePressed(MouseEvent e) {
	        maybeShowPopup(e);
	    }

	    public void mouseReleased(MouseEvent e) {
	        maybeShowPopup(e);
	    }

	    private void maybeShowPopup(MouseEvent e) {
	        if (e.isPopupTrigger()) {
	        	popupMenu = getJPopupMenu(addonTextField);
	            popupMenu.show(e.getComponent(), e.getX(), e.getY());
	        }
	    }
	}
	
	private void exportBarcode(){
		
		final JComboBox<String> fileTypeCB;
		
		if (UPCTypeSwitch == 4){
			
			fileTypeCB = selectFormatQR;
			
		}
		else{
			
			fileTypeCB = fileTypeComboBox;
			
		}
		
		chooser = new JFileChooser(); 
	    chooser.setCurrentDirectory(new java.io.File(browseLocation));
	    chooser.setDialogTitle("Export Barcode As " + fileTypeCB.getSelectedItem());
	    chooser.setApproveButtonText("Export Barcode");
	    chooser.setFileFilter(new FileFilter(){

	    	public boolean accept(File f)
            {
                //boolean rightType = true;
				if (fileTypeCB.getSelectedItem() == "PNG"){
                
	                if(f.isDirectory())return true;	
	                else if(f.getName().endsWith(".png"))return true;
	                
                }
                else if (fileTypeCB.getSelectedItem() == "JPEG"){
                
	                if(f.isDirectory())return true;	
	                else if(f.getName().endsWith(".jpg"))return true;
	                else if(f.getName().endsWith(".jpeg"))return true;
	                
                }
                else if (fileTypeCB.getSelectedItem() == "GIF"){
                
	                if(f.isDirectory())return true;	
	                else if(f.getName().endsWith(".gif"))return true;
	                
                }
                else if (fileTypeCB.getSelectedItem() == "BMP"){
                
	                if(f.isDirectory())return true;	
	                else if(f.getName().endsWith(".bmp"))return true;
	                
                }
                else if (fileTypeCB.getSelectedItem() == "TIFF"){
                
	                if(f.isDirectory())return true;	
	                else if(f.getName().endsWith(".tiff"))return true;
	                
                }
                else if (fileTypeCB.getSelectedItem() == "EPS"){
                
	                if(f.isDirectory())return true;	
	                else if(f.getName().endsWith(".eps"))return true;
	                
                }
                else if (fileTypeCB.getSelectedItem() == "SVG"){
                
	                if(f.isDirectory())return true;	
	                else if(f.getName().endsWith(".svg"))return true;
	                
                }
				
				return false;
            }

            public String getDescription()
            {
            	String description = "";
				//if(f.getName().endsWith(".png"))return "*.png (Tansparency/Lossless)";
                //else if(f.getName().endsWith(".jpg"))return "*.jpg (Compressed Format)";
            	if (fileTypeCB.getSelectedItem() == "PNG"){
                    
            		description = "*.png (PNG Image)";
	                
                }
                else if (fileTypeCB.getSelectedItem() == "JPEG"){
                
                	description = "*.jpg, *.jpeg (JPEG Image)";
	                
                }
                else if (fileTypeCB.getSelectedItem() == "GIF"){
                
                	description = "*.gif (GIF Image)";
	                
                }
                else if (fileTypeCB.getSelectedItem() == "BMP"){
                
                	description = "*.bmp (BMP Image)";
	                
                }
                else if (fileTypeCB.getSelectedItem() == "TIFF"){
                
                	description = "*.tiff (TIFF Image)";
	                
                }
                else if (fileTypeCB.getSelectedItem() == "EPS"){
                
                	description = "*.eps (EPS Image)";
	                
                }
                else if (fileTypeCB.getSelectedItem() == "SVG"){
                
                	description = "*.svg (SVG Image)";
	                
                }
            	
            	return description;
            }
        });
	    chooser.setAcceptAllFileFilterUsed(false);
	    int answer;
    	
	    if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
	    	
	    	File selectedFile = chooser.getSelectedFile();
	    	File selectedPath = new File(selectedFile.getAbsolutePath());
	    	int lastSlashPos = selectedFile.getPath().lastIndexOf("\\");
	    	selectedPath = new java.io.File(selectedPath.toString().substring(0, lastSlashPos));
	    	if (selectedPath.isDirectory()){
				
				browseLocation = selectedFile.getAbsolutePath().substring(0, lastSlashPos);
				 
			}
	    	
			boolean fileExists = false;
			boolean overwriteGranted = false;
			if (selectedFile.exists()){
	    		
				fileExists = true;
				answer = JOptionPane.showConfirmDialog(new CheckDigitCalculator(), "The file you selected already exists.\nWould you like to overwrite it?", "Overwrite Existing File", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getClassLoader().getResource("images/warning48x48.png")));
				 
				if (answer == JOptionPane.YES_OPTION){
					 
					overwriteGranted = true;
					 
				}
	    		 
	    	}
	    	
	    	if (fileExists && overwriteGranted == false){
	    		
	    		JOptionPane.showMessageDialog(new CheckDigitCalculator(), "The file you selected has not been overwritten!", "File Not Overwriten", JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getClassLoader().getResource("images/warning48x48.png")));
	    		
	    	}
	    	else {
	    		
	    		// Save File
	    		File outputFile = null;
	    		OutputStream out = null;
	    		
	    		String mimeType = "image/png";
	    		
	    		EAN8Bean EAN8bean = new EAN8Bean();
	    		EAN13Bean EAN13bean = new EAN13Bean();
	    		UPCABean UPCAbean = new UPCABean();
	    		UPCEBean UPCEbean = new UPCEBean();
	    		Code39Bean Code39bean = new Code39Bean();
	    		
	    		Color barColor = barColorTextField.getBackground();
	    		Color fontColor = fontColorTextField.getBackground();
	    		Color backgroundColor = backgroundColorTextfield.getBackground();
	    		boolean isTransparent = isTransparentBackground.isSelected();
	    		
	    		if (fileTypeCB.getSelectedItem() == "PNG"){
                    
            		mimeType = "image/png";
            		
            		if (selectedFile.toString().toLowerCase().endsWith(".png")){
    	    			
		    			outputFile = new File(selectedFile.toString());
		    			
	    			}
	    			else{
	    				
	    				outputFile = new File(selectedFile.toString() + ".png");
	    				
	    			}
	                
                }
                else if (fileTypeCB.getSelectedItem() == "JPEG"){
                
                	mimeType = "image/jpeg";
            		
            		if (selectedFile.toString().toLowerCase().endsWith(".jpg") || selectedFile.toString().toLowerCase().endsWith(".jpeg")){
    	    			
		    			outputFile = new File(selectedFile.toString());
		    			
	    			}
	    			else{
	    				
	    				outputFile = new File(selectedFile.toString() + ".jpg");
	    				
	    			}
	                
                }
                else if (fileTypeCB.getSelectedItem() == "GIF"){
                
                	mimeType = "image/gif";
            		
            		if (selectedFile.toString().toLowerCase().endsWith(".gif")){
    	    			
		    			outputFile = new File(selectedFile.toString());
		    			
	    			}
	    			else{
	    				
	    				outputFile = new File(selectedFile.toString() + ".gif");
	    				
	    			}
	                
                }
                else if (fileTypeCB.getSelectedItem() == "BMP"){
                
                	mimeType = "image/bmp";
            		
            		if (selectedFile.toString().toLowerCase().endsWith(".bmp")){
    	    			
		    			outputFile = new File(selectedFile.toString());
		    			
	    			}
	    			else{
	    				
	    				outputFile = new File(selectedFile.toString() + ".bmp");
	    				
	    			}
	                
                }
                else if (fileTypeCB.getSelectedItem() == "TIFF"){
                
                	mimeType = "image/tiff";
            		
            		if (selectedFile.toString().toLowerCase().endsWith(".tiff")){
    	    			
		    			outputFile = new File(selectedFile.toString());
		    			
	    			}
	    			else{
	    				
	    				outputFile = new File(selectedFile.toString() + ".tiff");
	    				
	    			}
	                
                }
                else if (fileTypeCB.getSelectedItem() == "EPS"){
                
                	mimeType = "image/eps";
            		
            		if (selectedFile.toString().toLowerCase().endsWith(".eps")){
    	    			
		    			outputFile = new File(selectedFile.toString());
		    			
	    			}
	    			else{
	    				
	    				outputFile = new File(selectedFile.toString() + ".eps");
	    				
	    			}
	                
                }
                else if (fileTypeCB.getSelectedItem() == "SVG"){
                
                	mimeType = "image/svg";
            		
            		if (selectedFile.toString().toLowerCase().endsWith(".svg")){
    	    			
		    			outputFile = new File(selectedFile.toString());
		    			
	    			}
	    			else{
	    				
	    				outputFile = new File(selectedFile.toString() + ".svg");
	    				
	    			}
	                
                }
	    		
	    		int pxModuleWidth;
				if (UPCTypeSwitch == 4){
	    		
	    			pxModuleWidth = Integer.parseInt(sizeTextFieldQR.getText());
	    			
	    		}
	    		else{
	    			
	    			pxModuleWidth = Integer.parseInt(moduleWidthTextField.getText());
	    			
	    		}
	    		
	    		String fontFace = fontFaceValueLabel.getText();
	    		double barHeight = px2mm(Integer.parseInt(barHeightTextField.getText()));
	    		double moduleWidth = moduleWidth(pxModuleWidth, Integer.parseInt(dpiTextField.getText()));
	    		double quietzoneWidth = quietzoneWidth(moduleWidth);
	    		double fontSize = px2mm(Integer.parseInt(fontSizeValueLabel.getText()));
	    		
	    		HumanReadablePlacement HRP;
	    		if (hrtComboBox.getSelectedItem() == "Bottom"){
	    			
	    			HRP = HumanReadablePlacement.HRP_BOTTOM;
	    			
	    		}
	    		else if (hrtComboBox.getSelectedItem() == "Top"){
	    			
	    			HRP = HumanReadablePlacement.HRP_TOP;
	    			
	    		}
	    		else {
	    			
	    			HRP = HumanReadablePlacement.HRP_NONE;
	    			
	    		}
	    		
	    		if (UPCTypeSwitch == 1){
	    			
	    			EAN8bean.setBarHeight(barHeight);
		    		EAN8bean.setModuleWidth(moduleWidth);
		    		EAN8bean.setQuietZone(quietzoneWidth);
		    		EAN8bean.setChecksumMode(ChecksumMode.CP_ADD);
		    		EAN8bean.setMsgPosition(HRP);
		    		EAN8bean.setFontName(fontFace);
		    		EAN8bean.setFontSize(fontSize);
	    		
	    		}
	    		else if (UPCTypeSwitch == 2){
	    			
	    			UPCAbean.setBarHeight(barHeight);
	    			UPCAbean.setModuleWidth(moduleWidth);
	    			UPCAbean.setQuietZone(quietzoneWidth);
		    		UPCAbean.setChecksumMode(ChecksumMode.CP_ADD);
		    		UPCAbean.setMsgPosition(HRP);
		    		UPCAbean.setFontName(fontFace);
		    		UPCAbean.setFontSize(fontSize);
	    			
	    		}
	    		else if (UPCTypeSwitch == 3){
	    			
	    			EAN13bean.setBarHeight(barHeight);
	    			EAN13bean.setModuleWidth(moduleWidth);
		    		EAN13bean.setQuietZone(quietzoneWidth);
		    		EAN13bean.setChecksumMode(ChecksumMode.CP_ADD);
		    		EAN13bean.setMsgPosition(HRP);
		    		EAN13bean.setFontName(fontFace);
		    		EAN13bean.setFontSize(fontSize);
	    			
	    		}
	    		else if (UPCTypeSwitch == 5){
	    			
	    			UPCEbean.setBarHeight(barHeight);
	    			UPCEbean.setModuleWidth(moduleWidth);
	    			UPCEbean.setQuietZone(quietzoneWidth);
	    			UPCEbean.setChecksumMode(ChecksumMode.CP_ADD);
	    			UPCEbean.setMsgPosition(HRP);
	    			UPCEbean.setFontName(fontFace);
	    			UPCEbean.setFontSize(fontSize);
	    			
	    		}
	    		else if (UPCTypeSwitch == 6){
	    			
	    			Code39bean.setBarHeight(barHeight);
	    			Code39bean.setModuleWidth(moduleWidth);
	    			Code39bean.setWideFactor((moduleWidth > 0.508f) ? 3.0f : 2.0f);
	    			Code39bean.setIntercharGapWidth(moduleWidth);
	    			Code39bean.setQuietZone(quietzoneWidth);
	    			Code39bean.setChecksumMode(ChecksumMode.CP_IGNORE);
	    			Code39bean.setMsgPosition(HRP);
	    			Code39bean.setFontName(fontFace);
	    			Code39bean.setFontSize(fontSize);
	    			
	    		}
	    		
	    		ImageIcon formatImage  = new ImageIcon(getClass().getClassLoader().getResource("images/format_icons/PNG48x48.png"));
	    			
	    		if (fileTypeCB.getSelectedItem() == "JPEG"){
	    			
	    			formatImage = new ImageIcon(getClass().getClassLoader().getResource("images/format_icons/JPG48x48.png"));
	    			
	    		}
	    		else if (fileTypeCB.getSelectedItem() == "GIF"){
	    			
	    			formatImage = new ImageIcon(getClass().getClassLoader().getResource("images/format_icons/GIF48x48.png"));
	    			
	    		}
	    		else if (fileTypeCB.getSelectedItem() == "BMP"){
	    			
	    			formatImage = new ImageIcon(getClass().getClassLoader().getResource("images/format_icons/BMP48x48.png"));
	    			
	    		}
	    		else if (fileTypeCB.getSelectedItem() == "TIFF"){
	    			
	    			formatImage = new ImageIcon(getClass().getClassLoader().getResource("images/format_icons/TIFF48x48.png"));
	    			
	    		}
	    		else if (fileTypeCB.getSelectedItem() == "EPS"){
	    			
	    			formatImage = new ImageIcon(getClass().getClassLoader().getResource("images/format_icons/EPS48x48.png"));
	    			
	    		}
	    		else if (fileTypeCB.getSelectedItem() == "SVG"){
	    			
	    			formatImage = new ImageIcon(getClass().getClassLoader().getResource("images/format_icons/SVG48x48.png"));
	    			
	    		}
	    		
	    		//Open output file
	    		
	    		if (fileTypeCB.getSelectedItem() == "PNG" || fileTypeCB.getSelectedItem() == "JPEG" || fileTypeCB.getSelectedItem() == "GIF" || fileTypeCB.getSelectedItem() == "BMP" || fileTypeCB.getSelectedItem() == "TIFF" && UPCTypeSwitch != 4){
	    		
	    			try {
	    				out = new FileOutputStream(outputFile);
	    			} catch (FileNotFoundException e1) {
	    				e1.printStackTrace();
	    			}
	    			try {
	    			    //Set up the canvas provider for monochrome PNG output 
	    				//Point test = shell.getDisplay().getDPI();
	    				//test.toString();
	    				//System.out.println("res1: " + jTextField6.getText());
	    				
	    				BitmapCanvasProvider canvas;
						if (fileTypeCB.getSelectedItem() == "JPEG" || fileTypeCB.getSelectedItem() == "BMP"){
	    					
	    					canvas = new BitmapCanvasProvider(out, mimeType, Integer.parseInt(dpiTextField.getText()), BufferedImage.TYPE_INT_RGB, false, 0, barColor, fontColor, backgroundColor, isTransparent);
	    					
	    				}
	    				else{
	    				
	    					canvas = new BitmapCanvasProvider(out, mimeType, Integer.parseInt(dpiTextField.getText()), BufferedImage.TYPE_INT_ARGB, false, 0, barColor, fontColor, backgroundColor, isTransparent);
	    					
	    				}
	    				
	    			    String addonString = "";
	    			    try {
	    			    	
		    			    //Generate the barcode
	    			    	if (UPCTypeSwitch == 1){
		    			    
	    			    		EAN8bean.generateBarcode(canvas, upcTextField.getText());
	    			    		
	    			    	}
	    			    	else if (UPCTypeSwitch == 2){
	    			    		
	    			    		if (addonTextField.getText().length() == 2 || addonTextField.getText().length() == 5){
	    			    			
	    			    			addonString = "+" + addonTextField.getText();
	    			    			
	    			    		}
	    			    		else {
	    			    			
	    			    			addonString = "";
	    			    			
	    			    		}
	    			    		
	    			    		UPCAbean.generateBarcode(canvas, upcTextField.getText() + addonString);
	    			    		
	    			    	}
	    			    	else if (UPCTypeSwitch == 5){
	    			    		
	    			    		if (addonTextField.getText().length() == 2 || addonTextField.getText().length() == 5){
	    			    			
	    			    			addonString = "+" + addonTextField.getText();
	    			    			
	    			    		}
	    			    		else {
	    			    			
	    			    			addonString = "";
	    			    			
	    			    		}
	    			    		
	    			    		UPCEbean.generateBarcode(canvas, upcTextField.getText() + addonString);
	    			    		
	    			    	}
	    			    	else if (UPCTypeSwitch == 6){
	    			    		
	    			    		Code39bean.generateBarcode(canvas, upcTextField.getText());
	    			    		
	    			    	}
	    			    	else if (UPCTypeSwitch == 3){
	    			    		
	    			    		if (addonTextField.getText().length() == 2 || addonTextField.getText().length() == 5){
	    			    			
	    			    			addonString = "+" + addonTextField.getText();
	    			    			
	    			    		}
	    			    		else {
	    			    			
	    			    			addonString = "";
	    			    			
	    			    		}
	    			    		
	    			    		EAN13bean.generateBarcode(canvas, upcTextField.getText() + addonString);
	    			    		
	    			    	}
		    			    
	    			    }
	    			    catch (NullPointerException e){
	    			    	
	    			    	//System.out.println("NullPointerException: " + e + " | canvas: " + canvas.toString() + " | bean: " + UPCAbean.toString());
	    			    	
	    			    }

	    			    //Signal end of generation
	    			    try {
	    					canvas.finish();
	    				} catch (IOException e) {
	    					e.printStackTrace();
	    				}
	    			} finally {
	    			    try {
	    					out.close();
	    					JOptionPane.showMessageDialog(new CheckDigitCalculator(), "Your barcode has been successfully exported as a " + fileTypeCB.getSelectedItem() + "!", "File Export Successful", JOptionPane.WARNING_MESSAGE, formatImage);
	    				} catch (IOException e) {
	    					e.printStackTrace();
	    				}
	    			}
	    			
	    			try {
	    				 ImageIO.read(outputFile);
	    			} catch (IOException e1) {
	    				e1.printStackTrace();
	    			}
	    			
	    		}
	    		else if (fileTypeCB.getSelectedItem() == "EPS" && UPCTypeSwitch != 4){
	    			
	    			//outputFile = new File("preview.eps");
	    			//mimeType = "image/eps";
	    			
	    			try {
						out = new FileOutputStream(outputFile);
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					}
					
					try{
		    			EPSCanvasProvider canvas = new EPSCanvasProvider(out, 0);
		    			
		    			String addonString;
						if (UPCTypeSwitch == 1){
		    			    
				    		EAN8bean.generateBarcode(canvas, upcTextField.getText());
				    		
				    	}
				    	else if (UPCTypeSwitch == 2){
				    		
				    		if (addonTextField.getText().length() == 2 || addonTextField.getText().length() == 5){
				    			
				    			addonString = "+" + addonTextField.getText();
				    			
				    		}
				    		else {
				    			
				    			addonString = "";
				    			
				    		}
				    		
				    		UPCAbean.generateBarcode(canvas, upcTextField.getText() + addonString);
				    		
				    	}
				    	else if (UPCTypeSwitch == 5){
				    		
				    		if (addonTextField.getText().length() == 2 || addonTextField.getText().length() == 5){
				    			
				    			addonString = "+" + addonTextField.getText();
				    			
				    		}
				    		else {
				    			
				    			addonString = "";
				    			
				    		}
				    		
				    		UPCEbean.generateBarcode(canvas, upcTextField.getText() + addonString);
				    		
				    	}
				    	else if (UPCTypeSwitch == 6){
				    		
				    		Code39bean.generateBarcode(canvas, upcTextField.getText());
				    		
				    	}
				    	else if (UPCTypeSwitch == 3){
				    		
				    		if (addonTextField.getText().length() == 2 || addonTextField.getText().length() == 5){
				    			
				    			addonString = "+" + addonTextField.getText();
				    			
				    		}
				    		else {
				    			
				    			addonString = "";
				    			
				    		}
				    		
				    		EAN13bean.generateBarcode(canvas, upcTextField.getText() + addonString);
				    		
				    	}
		    			
		    			try {
							canvas.finish();
						} catch (IOException e) {
							e.printStackTrace();
						}
						
					} catch (IOException e) {
						e.printStackTrace();
					}
					finally {
	    			    try {
	    					out.close();
	    					JOptionPane.showMessageDialog(new CheckDigitCalculator(), "Your barcode has been successfully exported as a " + fileTypeCB.getSelectedItem() + "!", "File Export Successful", JOptionPane.WARNING_MESSAGE, formatImage);
	    				} catch (IOException e) {
	    					e.printStackTrace();
	    				}
	    			}
	    			
	    		}
	    		else if (fileTypeCB.getSelectedItem() == "SVG" && UPCTypeSwitch != 4){
	    			
	    			//outputFile = new File("preview.svg");
	    			//mimeType = "image/svg";
	    			
	    			try {
						out = new FileOutputStream(outputFile);
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					}
					
					try{
						SVGCanvasProvider canvas = null;
						try {
							canvas = new SVGCanvasProvider(false, 0);
						} catch (BarcodeCanvasSetupException e1) {
							e1.printStackTrace();
						}
		    			
		    			String addonString;
						if (UPCTypeSwitch == 1){
		    			    
				    		EAN8bean.generateBarcode(canvas, upcTextField.getText());
				    		
				    	}
				    	else if (UPCTypeSwitch == 2){
				    		
				    		if (addonTextField.getText().length() == 2 || addonTextField.getText().length() == 5){
				    			
				    			addonString = "+" + addonTextField.getText();
				    			
				    		}
				    		else {
				    			
				    			addonString = "";
				    			
				    		}
				    		
				    		UPCAbean.generateBarcode(canvas, upcTextField.getText() + addonString);
				    		
				    	}
				    	else if (UPCTypeSwitch == 5){
				    		
				    		if (addonTextField.getText().length() == 2 || addonTextField.getText().length() == 5){
				    			
				    			addonString = "+" + addonTextField.getText();
				    			
				    		}
				    		else {
				    			
				    			addonString = "";
				    			
				    		}
				    		
				    		UPCEbean.generateBarcode(canvas, upcTextField.getText() + addonString);
				    		
				    	}
				    	else if (UPCTypeSwitch == 6){
				    		
				    		Code39bean.generateBarcode(canvas, upcTextField.getText());
				    		
				    	}
				    	else if (UPCTypeSwitch == 3){
				    		
				    		if (addonTextField.getText().length() == 2 || addonTextField.getText().length() == 5){
				    			
				    			addonString = "+" + addonTextField.getText();
				    			
				    		}
				    		else {
				    			
				    			addonString = "";
				    			
				    		}
				    		
				    		EAN13bean.generateBarcode(canvas, upcTextField.getText() + addonString);
				    		
				    	}
						
						DocumentFragment documentFragment = canvas.getDOMFragment();
		    			
		    			TransformerFactory factory = TransformerFactory.newInstance();
	    			    Transformer trans = null;
						try {
							trans = factory.newTransformer();
						} catch (TransformerConfigurationException e) {
							e.printStackTrace();
						}
	    			    Source src = new DOMSource(documentFragment);
	    			    Result res = new StreamResult(outputFile);
	    			    try {
							trans.transform(src, res);
						} catch (TransformerException e) {
							e.printStackTrace();
						}
						
					}
					finally {
	    			    try {
	    					out.close();
	    					JOptionPane.showMessageDialog(new CheckDigitCalculator(), "Your barcode has been successfully exported as a " + fileTypeCB.getSelectedItem() + "!", "File Export Successful", JOptionPane.WARNING_MESSAGE, formatImage);
	    				} catch (IOException e) {
	    					e.printStackTrace();
	    				}
	    			}
	    			
	    		}
	    		else if (fileTypeCB.getSelectedItem() == "PNG" || fileTypeCB.getSelectedItem() == "JPEG" || fileTypeCB.getSelectedItem() == "GIF" || fileTypeCB.getSelectedItem() == "BMP" || fileTypeCB.getSelectedItem() == "TIFF" && UPCTypeSwitch == 4){
	    			try{
	    				
		    			//Open output file
		    			//outputFile = new File("preview.png");
		    			out = null;
		    			try {
		    				out = new FileOutputStream(outputFile);
		    			} catch (FileNotFoundException e1) {
		    				e1.printStackTrace();
		    			}
		    			
		    			QRCodeWriter QRWriter = new QRCodeWriter();
		    		    Hashtable<EncodeHintType, ErrorCorrectionLevel> hintMap = new Hashtable<EncodeHintType, ErrorCorrectionLevel>();
		    		    hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
		    			BitMatrix bitMatrix = null;
		    			try {
		    				bitMatrix = QRWriter.encode(upcTextField.getText(), BarcodeFormat.QR_CODE, 150, 150, hintMap);
		    			} catch (WriterException e2) {
		    				e2.printStackTrace();
		    			}
		    			BufferedImage QRCodeBufferedImage = MatrixToImageWriter.toBufferedImage(bitMatrix, backgroundColor, barColor);
		    			
		    			try {
		    				ImageIO.write(QRCodeBufferedImage, "png", outputFile);
		    			} catch (IOException e) {
		    				e.printStackTrace();
		    			}
		    			
		    			try {
		    				 ImageIO.read(outputFile);
		    			} catch (IOException e1) {
		    				e1.printStackTrace();
		    			}
		    			
		    			//ImageIO
		    			
	    			}
	    			finally {
	    			    try {
	    					out.close();
	    					JOptionPane.showMessageDialog(new CheckDigitCalculator(), "Your barcode has been successfully exported as a " + fileTypeCB.getSelectedItem() + "!", "File Export Successful", JOptionPane.WARNING_MESSAGE, formatImage);
	    				} catch (IOException e) {
	    					e.printStackTrace();
	    				}
	    			}
	    			
	    		}
	    		else if (fileTypeCB.getSelectedItem() == "EPS" && UPCTypeSwitch == 4){
	    			
	    			try{
	    				
		    			//Open output file
		    			//outputFile = new File("preview.png");
		    			out = null;
		    			try {
		    				out = new FileOutputStream(outputFile);
		    			} catch (FileNotFoundException e1) {
		    				e1.printStackTrace();
		    			}
		    			
		    			QRCodeWriter QRWriter = new QRCodeWriter();
		    		    Hashtable<EncodeHintType, ErrorCorrectionLevel> hintMap = new Hashtable<EncodeHintType, ErrorCorrectionLevel>();
		    		    hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
		    			BitMatrix bitMatrix = null;
		    			try {
		    				bitMatrix = QRWriter.encode(upcTextField.getText(), BarcodeFormat.QR_CODE, 150, 150, hintMap);
		    			} catch (WriterException e2) {
		    				e2.printStackTrace();
		    			}
		    			String QRCodeBufferedImage = MatrixToImageWriter.toEPSImage(bitMatrix, backgroundColor, barColor);
		    			
		    			try {
		    			    BufferedWriter testOut = new BufferedWriter(new FileWriter(outputFile.getAbsoluteFile()));
		    			    testOut.write(QRCodeBufferedImage);
		    			    testOut.close();
		    			} catch (IOException e) {
		    				System.out.println("IOException");
		    			}
		    			
	    			}
	    			finally {
	    			    try {
	    					out.close();
	    					JOptionPane.showMessageDialog(new CheckDigitCalculator(), "Your barcode has been successfully exported as a " + fileTypeCB.getSelectedItem() + "!", "File Export Successful", JOptionPane.WARNING_MESSAGE, formatImage);
	    				} catch (IOException e) {
	    					e.printStackTrace();
	    				}
	    			}
	    			
	    		}
	    		else if (fileTypeCB.getSelectedItem() == "SVG" && UPCTypeSwitch == 4){
	    			
	    			try{
	    				
		    			//Open output file
		    			//outputFile = new File("preview.png");
		    			out = null;
		    			try {
		    				out = new FileOutputStream(outputFile);
		    			} catch (FileNotFoundException e1) {
		    				e1.printStackTrace();
		    			}
		    			
		    			QRCodeWriter QRWriter = new QRCodeWriter();
		    		    Hashtable<EncodeHintType, ErrorCorrectionLevel> hintMap = new Hashtable<EncodeHintType, ErrorCorrectionLevel>();
		    		    hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
		    			BitMatrix bitMatrix = null;
		    			try {
		    				bitMatrix = QRWriter.encode(upcTextField.getText(), BarcodeFormat.QR_CODE, 150, 150, hintMap);
		    			} catch (WriterException e2) {
		    				e2.printStackTrace();
		    			}
		    			MatrixToImageWriter.toSVGImage(bitMatrix, outputFile.getAbsolutePath(), backgroundColor, barColor);
		    			
	    			}
	    			finally {
	    			    try {
	    					out.close();
	    					JOptionPane.showMessageDialog(new CheckDigitCalculator(), "Your barcode has been successfully exported as a " + fileTypeCB.getSelectedItem() + "!", "File Export Successful", JOptionPane.WARNING_MESSAGE, formatImage);
	    				} catch (IOException e) {
	    					e.printStackTrace();
	    				}
	    			}
	    			
	    		}
	    		
	    	}
	    	
	    }
	    else {
	    	
	    	JOptionPane.showMessageDialog(new CheckDigitCalculator(), "Barcode export cancelled!", "Barcode Export Cancelled", JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getClassLoader().getResource("images/error48x48.png")));
	    	
	    }
		
	}

	private JPopupMenu getJPopupMenu(final JTextField jTextFieldRef) {
		
		//Create the popup menus.
		copyMenu = new JMenu("Copy");
		copyMenuItem1 = new JMenuItem("Copy Selection");
	    copyMenuItem1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				jTextFieldRef.copy();
				
			}
			
	    });
	    copyMenu.add(copyMenuItem1);
		copyMenuItem2 = new JMenuItem("Copy UPC");
	    copyMenuItem2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
	            Clipboard clipboard = toolkit.getSystemClipboard();
	            StringSelection selection = new StringSelection(upcTextField.getText());
	            clipboard.setContents(selection, null);
				
			}
			
	    });
	    copyMenu.add(copyMenuItem2);
		copyMenuItem3 = new JMenuItem("Copy Check Digit");
	    copyMenuItem3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				CalculateCheckDigit();
				Toolkit toolkit = Toolkit.getDefaultToolkit();
	            Clipboard clipboard = toolkit.getSystemClipboard();
	            StringSelection selection = new StringSelection(checkdigitTextField.getText());
	            clipboard.setContents(selection, null);
				
			}
			
	    });
	    copyMenu.add(copyMenuItem3);
		copyMenuItem4 = new JMenuItem("Copy UPC/Check Digit");
	    copyMenuItem4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				CalculateCheckDigit();
				Toolkit toolkit = Toolkit.getDefaultToolkit();
	            Clipboard clipboard = toolkit.getSystemClipboard();
	            StringSelection selection = new StringSelection(upcTextField.getText() + checkdigitTextField.getText());
	            clipboard.setContents(selection, null);
				
			}
			
	    });
	    copyMenu.add(copyMenuItem4);
		copyMenuItem5 = new JMenuItem("Copy Add-On");
	    copyMenuItem5.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
	            Clipboard clipboard = toolkit.getSystemClipboard();
	            StringSelection selection = new StringSelection(addonTextField.getText());
	            clipboard.setContents(selection, null);
				
			}
			
	    });
	    copyMenu.add(copyMenuItem5);
		
	    popupMenu = new JPopupMenu();
	    popupMenuItem1 = new JMenuItem("Select All");
	    popupMenuItem1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				jTextFieldRef.requestFocus();
				jTextFieldRef.setSelectionStart(0);
		        jTextFieldRef.setSelectionEnd(jTextFieldRef.getText().length());
				
			}
			
	    });
	    popupMenu.add(popupMenuItem1);
	    JMenuItem popupMenuItem2 = new JMenuItem("Cut");
	    popupMenuItem2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				
				jTextFieldRef.cut();
				
			}
			
	    });
	    popupMenu.add(popupMenuItem2);
	    //JMenuItem popupMenuItem3 = new JMenuItem("Copy");
	    //popupMenuItem3.add(copyMenu);
	    //popupMenu.add(popupMenuItem3);
	    popupMenu.add(copyMenu);
	    JMenuItem popupMenuItem4 = new JMenuItem("Paste");
	    popupMenuItem4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				
				jTextFieldRef.paste();
				
			}
			
	    });
	    popupMenu.add(popupMenuItem4);
		
		return popupMenu;
		
	}

	private JTabbedPane getOptionsTabbedPane() {
		if(optionsTabbedPane == null) {
			optionsTabbedPane = new JTabbedPane();

			TableLayout configurationPanelLayout = new TableLayout(new double[][] {{7.0, 131.0, TableLayout.FILL, 79.0, 79.0, 7.0}, {7.0, 30.0, 7.0, 30.0, 7.0, 30.0, 7.0, 30.0, 7.0, 30.0}});
			configurationPanelLayout.setHGap(5);
			configurationPanelLayout.setVGap(5);
			
			configurationPanel = makeTextPanel(null);
			configurationPanel.setLayout(configurationPanelLayout);
			//GridBagLayout panel1Layout = new GridBagLayout();
			configurationPanel.add(getFormatLabel(), "1,1,3,1,l,f");
			configurationPanel.add(getFileTypeComboBox(), "4, 1");
			configurationPanel.add(getModuleWidthLabel(), "1,5,3,5,l,c");
			configurationPanel.add(getModuleWidthTextField(), "4, 5");
			configurationPanel.add(getDPILabel(), "1,3,3,3,l,f");
			configurationPanel.add(getDPITextField(), "4, 3");
			configurationPanel.add(getBarHeightLabel(), "1, 7, 3, 7");
			configurationPanel.add(getBarHeightTextField(), "4, 7");
			configurationPanel.setPreferredSize(new java.awt.Dimension(325, 119));
			configurationPanel.setFont(new java.awt.Font("Calibri",0,12));
			optionsTabbedPane.addTab("Configuration", null, configurationPanel, null);
			
			TableLayout fontPanelLayout = new TableLayout(new double[][] {{7.0, 175.0, 121.0, 7.0}, {7.0, 30.0, 7.0, 30.0, 5.0, 30.0, 7.0, 30.0, TableLayout.FILL, TableLayout.FILL}});
			fontPanelLayout.setHGap(5);
			fontPanelLayout.setVGap(5);
			
			fontPanel = makeTextPanel(null);
			fontPanel.setLayout(fontPanelLayout);
			fontPanel.setFont(new java.awt.Font("Calibri",0,12));
			fontPanel.add(getChangeFontButton(), "2, 7");
			fontPanel.add(getHRTLabel(), "1, 1");
			fontPanel.add(getHRTComboBox(), "2, 1");
			fontPanel.add(getFontFaceLabel(), "1, 3");
			fontPanel.add(getFontSizeLabel(), "1, 5");
			fontPanel.add(getFontFaceLabelField(), "2, 3");
			fontPanel.add(getFontSizeValueLabel(), "2, 5");
			optionsTabbedPane.addTab("Font", null, fontPanel, null);

			TableLayout colorPanelLayout = new TableLayout(new double[][] {{7.0, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, 79.0, 7.0}, {7.0, 30.0, 7.0, 30.0, 7.0, 30.0, 7.0, TableLayout.FILL, 7.0, 30.0, TableLayout.FILL}});
			colorPanelLayout.setHGap(5);
			colorPanelLayout.setVGap(5);
			
			colorPanel = makeTextPanel(null);
			colorPanel.setLayout(colorPanelLayout);
			colorPanel.setPreferredSize(new java.awt.Dimension(325, 272));
			colorPanel.setFont(new java.awt.Font("Calibri",0,12));
			colorPanel.add(getTransparentBackgroundLabel(), "1,1,3,1,f,c");
			colorPanel.add(getIsTransparentBackground(), "4, 1");
			colorPanel.add(getBackgroundColorLabel(), "1, 3, 3, 3");
			colorPanel.add(getBackgroundColorTextField(), "4, 3");
			colorPanel.add(getbarColorTextField(), "4, 5");
			colorPanel.add(getBarColorLabel(), "1, 5, 3, 5");
			colorPanel.add(getFontColorTextField(), "4, 7");
			colorPanel.add(getFontColorLabel(), "1, 7, 3, 7");
			optionsTabbedPane.addTab("Colour", null, colorPanel, null);
			
			double[][] qrConfigurationPanelSize = new double[][] {{7.0, 131.0, TableLayout.FILL, 39.5, 39.5, 79.0, 7.0}, // COLUMNS
					                                              {7.0, 30.0, 7.0, 30.0, 7.0, 30.0, 7.0, 30.0, 7.0, 30.0}}; // ROWS
			TableLayout qrConfigurationPanelLayout = new TableLayout(qrConfigurationPanelSize);
			qrConfigurationPanelLayout.setHGap(5);
			qrConfigurationPanelLayout.setVGap(5);
			
			qrConfigurationPanel = makeTextPanel(null);
			qrConfigurationPanel.setLayout(qrConfigurationPanelLayout);
			//GridBagLayout panel1Layout = new GridBagLayout();
			qrConfigurationPanel.add(getformatLabelQR(), "1, 1, 3, 1, L, f");
			qrConfigurationPanel.add(getSelectFormatQR(), "5, 1");
			qrConfigurationPanel.add(getErrorLevelLabelQR(), "1, 3, 2, 3, L, f");
			qrConfigurationPanel.add(getErrorLevelSelectQR(), "3, 3, 5, 3, f, f");
			qrConfigurationPanel.add(getSizeLabelQR(), "1, 5, 3, 5, L, f");
			qrConfigurationPanel.add(getSizeTextFieldQR(), "5, 5, 5, 5, f, f");
//			qrConfigurationPanel.add(jLabel7, "1,5,3,5,l,c");
//			qrConfigurationPanel.add(jTextField5, "4, 5");
//			qrConfigurationPanel.add(jLabel6, "1,3,3,3,l,f");
//			qrConfigurationPanel.add(jTextField6, "4, 3");
//			qrConfigurationPanel.add(jLabel14, "1, 7, 3, 7");
//			qrConfigurationPanel.add(jTextField4, "4, 7");
			qrConfigurationPanel.setPreferredSize(new java.awt.Dimension(325, 119));
			qrConfigurationPanel.setFont(new java.awt.Font("Calibri",0,12));
			//jTabbedPane1.addTab("QR Configuration", null, panel4, null);

		}
		optionsTabbedPane.setMnemonicAt(0, KeyEvent.VK_1);

		optionsTabbedPane.setMnemonicAt(1, KeyEvent.VK_2);

		optionsTabbedPane.setMnemonicAt(2, KeyEvent.VK_3);
		return optionsTabbedPane;
		
	}
	
	protected JComponent makeTextPanel(String text) {
        JPanel panel = new JPanel(false);
        return panel;
    }
	private JLabel getFormatLabel() {
		if(formatLabel == null) {
			formatLabel = new JLabel();
			formatLabel.setText("Format:");
			formatLabel.setFont(new java.awt.Font("Calibri",1,18));
		}
		return formatLabel;
	}
	private JComboBox<String> getFileTypeComboBox() {
		if(fileTypeComboBox == null) {
			ComboBoxModel<String> selectFormatModel = 
				new DefaultComboBoxModel<String>(
						new String[] { "PNG", "GIF", "JPEG", "BMP", "TIFF", "EPS", "SVG" });
			fileTypeComboBox = new JComboBox<String>();
			fileTypeComboBox.setModel(selectFormatModel);
			fileTypeComboBox.setFont(new java.awt.Font("Calibri",0,18));
			fileTypeComboBox.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent evt) {
					if (fileTypeComboBox.getSelectedItem() == "JPEG" || fileTypeComboBox.getSelectedItem() == "GIF" || fileTypeComboBox.getSelectedItem() == "BMP"){
						
						isTransparentBackground.setEnabled(false);
						trasparnetBackgroundLabel.setEnabled(false);
						backgroundColorLabel.setEnabled(true);
						if (isTransparentBackground.isSelected()){
							
							backgroundColorTextfield.setBackground(Color.WHITE);
							isTransparentBackground.setSelected(false);
							
						}
						
					}
					else {
						
						isTransparentBackground.setEnabled(true);
						trasparnetBackgroundLabel.setEnabled(true);
						
					}
				}
			});
		}
		return fileTypeComboBox;
	}
	private JLabel getformatLabelQR() {
		if(formatLabelQR == null) {
			formatLabelQR = new JLabel();
			formatLabelQR.setText("Format:");
			formatLabelQR.setFont(new java.awt.Font("Calibri",1,18));
		}
		return formatLabelQR;
	}
	private JComboBox<String> getSelectFormatQR() {
		if(selectFormatQR == null) {
			ComboBoxModel<String> selectFormatModel = 
				new DefaultComboBoxModel<String>(
						new String[] { "PNG", "GIF", "JPEG", "BMP", "TIFF", "EPS", "SVG" });
			selectFormatQR = new JComboBox<String>();
			selectFormatQR.setModel(selectFormatModel);
			selectFormatQR.setFont(new java.awt.Font("Calibri",0,16));
			selectFormatQR.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent evt) {
					if (selectFormatQR.getSelectedItem() == "JPEG" || selectFormatQR.getSelectedItem() == "GIF" || selectFormatQR.getSelectedItem() == "BMP"){
						
						isTransparentBackground.setEnabled(false);
						trasparnetBackgroundLabel.setEnabled(false);
						backgroundColorLabel.setEnabled(true);
						if (isTransparentBackground.isSelected()){
							
							backgroundColorTextfield.setBackground(Color.WHITE);
							isTransparentBackground.setSelected(false);
							
						}
						
					}
					else {
						
						isTransparentBackground.setEnabled(true);
						trasparnetBackgroundLabel.setEnabled(true);
						
					}
				}
			});
		}
		return selectFormatQR;
	}
	private JLabel getSizeLabelQR() {
		if(sizeLabelQR == null) {
			sizeLabelQR = new JLabel();
			sizeLabelQR.setText("Width/Height:");
			sizeLabelQR.setFont(new java.awt.Font("Calibri",1,18));
		}
		return sizeLabelQR;
	}
	private JTextField getSizeTextFieldQR() {
		if(sizeTextFieldQR == null) {
			sizeTextFieldQR = new JTextField();
			sizeTextFieldQR.setFont(new java.awt.Font("Calibri",0,18));
			sizeTextFieldQR.setText("150");
		}
		return sizeTextFieldQR;
	}
	private JLabel getErrorLevelLabelQR() {
		if(errorLevelLabelQR == null) {
			errorLevelLabelQR = new JLabel();
			errorLevelLabelQR.setText("Error Correction:");
			errorLevelLabelQR.setFont(new java.awt.Font("Calibri",1,18));
		}
		return errorLevelLabelQR;
	}
	private JComboBox<String> getErrorLevelSelectQR() {
		if(errorLevelSelectQR == null) {
			ComboBoxModel<String> selectErrorLevelModel = 
				new DefaultComboBoxModel<String>(
						new String[] { "(L)ow - 7%", "(M)edium - 15%", "(Q)uartile - 25%", "(H)igh - 30%" });
			errorLevelSelectQR = new JComboBox<String>();
			errorLevelSelectQR.setModel(selectErrorLevelModel);
			errorLevelSelectQR.setFont(new java.awt.Font("Calibri",0,18));
			errorLevelSelectQR.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent evt) {
					
				}
			});
		}
		return errorLevelSelectQR;
	}
	private JLabel getDPILabel() {
		if(dpiLabel == null) {
			dpiLabel = new JLabel();
			dpiLabel.setText("DPI:");
			dpiLabel.setFont(new java.awt.Font("Calibri",1,18));
		}
		return dpiLabel;
	}
	private JTextField getDPITextField() {
		if(dpiTextField == null) {
			dpiTextField = new JTextField();
			dpiTextField.setFont(new java.awt.Font("Calibri",0,18));
			dpiTextField.setDocument(new JTextFieldLimit(11));
			dpiTextField.setColumns(11);
			dpiTextField.setPreferredSize(new java.awt.Dimension(287,28));
			dpiTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
			dpiTextField.setName("jTextField6");
			dpiTextField.setSize(287, 28);
			dpiTextField.setText(Integer.toString(guestResolution));
			dpiTextField.setHorizontalAlignment(SwingConstants.CENTER);
			dpiTextField.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					int key = e.getKeyCode();
					if (key == KeyEvent.VK_ENTER) {
						//Toolkit.getDefaultToolkit().beep();   
						//System.out.println("ENTER pressed");
						CalculateCheckDigit();
					}
				}
			});
		}
		return dpiTextField;
	}
	private JLabel getModuleWidthLabel() {
		if(moduleWidthLabel == null) {
			moduleWidthLabel = new JLabel();
			moduleWidthLabel.setText("Module Width (px):");
			moduleWidthLabel.setFont(new java.awt.Font("Calibri",1,18));
		}
		return moduleWidthLabel;
	}
	private JTextField getModuleWidthTextField() {
		if(moduleWidthTextField == null) {
			moduleWidthTextField = new JTextField();
			moduleWidthTextField.setFont(new java.awt.Font("Calibri",0,18));
			moduleWidthTextField.setDocument(new JTextFieldLimit(11));
			moduleWidthTextField.setColumns(11);
			moduleWidthTextField.setPreferredSize(new java.awt.Dimension(287,28));
			moduleWidthTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
			moduleWidthTextField.setName("jTextField5");
			moduleWidthTextField.setSize(287, 28);
			moduleWidthTextField.setHorizontalAlignment(SwingConstants.CENTER);
			moduleWidthTextField.setText("1");
			moduleWidthTextField.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					int key = e.getKeyCode();
					if (key == KeyEvent.VK_ENTER) {
						//Toolkit.getDefaultToolkit().beep();   
						//System.out.println("ENTER pressed");
						CalculateCheckDigit();
					}
				}
			});
		}
		return moduleWidthTextField;
	}
	private JLabel getTransparentBackgroundLabel() {
		if(trasparnetBackgroundLabel == null) {
			trasparnetBackgroundLabel = new JLabel();
			trasparnetBackgroundLabel.setText("Transparent Background:");
			trasparnetBackgroundLabel.setFont(new java.awt.Font("Calibri",1,18));
			trasparnetBackgroundLabel.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent evt) {
					
					if (trasparnetBackgroundLabel.isEnabled() && isTransparentBackground.isSelected()){
						
						isTransparentBackground.setSelected(false);
						backgroundColorTextfield.setEnabled(true);
						backgroundColorTextfield.setBackground(new Color(255, 255, 255));
						backgroundColorLabel.setEnabled(true);
						
					}
					else if (trasparnetBackgroundLabel.isEnabled()) {
						
						isTransparentBackground.setSelected(true);
						backgroundColorTextfield.setEnabled(false);
						backgroundColorTextfield.setBackground(new Color(244, 244, 244));
						backgroundColorLabel.setEnabled(false);
						
					}
					
				}
			});
		}
		return trasparnetBackgroundLabel;
	}
	private JCheckBox getIsTransparentBackground() {
		if(isTransparentBackground == null) {
			isTransparentBackground = new JCheckBox();
			isTransparentBackground.addActionListener(new ActionListener() {
				private Color oldBackgroundColor;

				public void actionPerformed(ActionEvent evt) {
					
					if (isTransparentBackground.isSelected()){
						
						backgroundColorTextfield.setEnabled(false);
						oldBackgroundColor = backgroundColorTextfield.getBackground();
						backgroundColorTextfield.setBackground(new Color(244, 244, 244));
						backgroundColorLabel.setEnabled(false);
						//jTextPane1.setBackground(new Color(244, 244, 244));
						
					}
					else {
						
						backgroundColorTextfield.setEnabled(true);
						backgroundColorTextfield.setBackground(oldBackgroundColor);
						backgroundColorLabel.setEnabled(true);
						//jTextPane1.setBackground(new Color(255, 255, 255));
						
					}
					
				}
			});
		}
		return isTransparentBackground;
	}
	private JLabel getBackgroundColorLabel() {
		if(backgroundColorLabel == null) {
			backgroundColorLabel = new JLabel();
			backgroundColorLabel.setText("Background Colour:");
			backgroundColorLabel.setFont(new java.awt.Font("Calibri",1,18));
		}
		return backgroundColorLabel;
	}
	private JTextField getBackgroundColorTextField() {
		if(backgroundColorTextfield == null) {
			backgroundColorTextfield = new JTextField();
			backgroundColorTextfield.setFont(new java.awt.Font("Calibri",0,18));
			backgroundColorTextfield.setDocument(new JTextFieldLimit(11));
			backgroundColorTextfield.setColumns(11);
			backgroundColorTextfield.setPreferredSize(new java.awt.Dimension(287,28));
			backgroundColorTextfield.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
			backgroundColorTextfield.setName("jTextField7");
			backgroundColorTextfield.setSize(287, 28);
			backgroundColorTextfield.setEditable(false);
			backgroundColorTextfield.setBackground(new java.awt.Color(255,255,255));
			backgroundColorTextfield.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent evt) {
					if (isTransparentBackground.isSelected() == false){
						Color currentColor = backgroundColorTextfield.getBackground();
						Color newColor = JColorChooser.showDialog(mFrame, "Choose Background Color", currentColor);
						
						if (newColor != null){
							
							backgroundColorTextfield.setBackground(newColor);
							backgroundColor = newColor;
							//jTextPane1.setBackground(newColor);
							
						}
					}
				}
			});
			backgroundColorTextfield.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					int key = e.getKeyCode();
					if (key == KeyEvent.VK_ENTER) {
						//Toolkit.getDefaultToolkit().beep();   
						//System.out.println("ENTER pressed");
						CalculateCheckDigit();
					}
				}
			});
		}
		return backgroundColorTextfield;
	}
	private JTextField getbarColorTextField() {
		if(barColorTextField == null) {
			barColorTextField = new JTextField();
			barColorTextField.setFont(new java.awt.Font("Calibri",0,28));
			barColorTextField.setDocument(new JTextFieldLimit(11));
			barColorTextField.setColumns(11);
			barColorTextField.setPreferredSize(new java.awt.Dimension(287,28));
			barColorTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
			barColorTextField.setName("jTextField8");
			barColorTextField.setSize(287, 28);
			barColorTextField.setEditable(false);
			barColorTextField.setBackground(new java.awt.Color(0,0,0));
			barColorTextField.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent evt) {
					Color currentColor = barColorTextField.getBackground();
					Color newColor = JColorChooser.showDialog(mFrame, "Choose Barcode Color", currentColor);
					
					if (newColor != null){
						
						barColorTextField.setBackground(newColor);
						
					}
				}
			});
			barColorTextField.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					int key = e.getKeyCode();
					if (key == KeyEvent.VK_ENTER) {
						//Toolkit.getDefaultToolkit().beep();   
						//System.out.println("ENTER pressed");
						CalculateCheckDigit();
					}
				}
			});
		}
		return barColorTextField;
	}
	private JLabel getBarColorLabel() {
		if(barColorLabel == null) {
			barColorLabel = new JLabel();
			barColorLabel.setText("Barcode Colour:");
			barColorLabel.setFont(new java.awt.Font("Calibri",1,18));
		}
		return barColorLabel;
	}

	private JButton getChangeFontButton() {
		if(changeFontButton == null) {
			changeFontButton = new JButton();
			changeFontButton.setText("Change Font");
			changeFontButton.setFont(new java.awt.Font("Calibri",1,18));
			changeFontButton.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent evt) {
					JTextPane txtDoc = new JTextPane();
					JFontChooser fd = new JFontChooser(mFrame, new Font(fontFaceValueLabel.getText(), (int) Font.PLAIN, Integer.parseInt(fontSizeValueLabel.getText())));
					fd.setVisible(true);
					if(fd.getReturnStatus() == JFontChooser.RET_OK){
					       txtDoc.setFont(fd.getFont());
					}
					
					fd.dispose();
					
					if (fd.getReturnStatus() == JFontChooser.RET_OK){
						
						Font font = fd.getFont();
						
						fontFaceValueLabel.setText(font.getFamily());
						fontSizeValueLabel.setText(Integer.toString(font.getSize()));
						
					}
				}
			});
		}
		return changeFontButton;
	}
	
	private double px2mm(int px){
		
		return (double) px * 0.264583333;
		
	}
	
	private double moduleWidth(int px, int resolution){
		
		return (double) (px * 25.4) / resolution;
		
	}
	
	private double quietzoneWidth(double moduleWidth){
		
		return (double) moduleWidth * 10;
		
	}
	
	private JLabel getBarHeightLabel() {
		if(barHeightLabel == null) {
			barHeightLabel = new JLabel();
			barHeightLabel.setText("Bar Height (px):");
			barHeightLabel.setFont(new java.awt.Font("Calibri",1,18));
		}
		return barHeightLabel;
	}
	
	private JTextField getBarHeightTextField() {
		if(barHeightTextField == null) {
			barHeightTextField = new JTextField();
			barHeightTextField.setFont(new java.awt.Font("Calibri",0,18));
			barHeightTextField.setDocument(new JTextFieldLimit(11));
			barHeightTextField.setColumns(11);
			barHeightTextField.setHorizontalAlignment(SwingConstants.CENTER);
			barHeightTextField.setText("56");
			barHeightTextField.setPreferredSize(new java.awt.Dimension(287,28));
			barHeightTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
			barHeightTextField.setName("jTextField4");
			barHeightTextField.setSize(287, 28);
			barHeightTextField.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					int key = e.getKeyCode();
					if (key == KeyEvent.VK_ENTER) {
						CalculateCheckDigit();
					}
				}
			});
		}
		return barHeightTextField;
	}
	
	private JLabel getHRTLabel() {
		if(hrtLabel == null) {
			hrtLabel = new JLabel();
			hrtLabel.setText("Human Readable Text:");
			hrtLabel.setFont(new java.awt.Font("Calibri",1,18));
		}
		return hrtLabel;
	}
	
	private JComboBox<String> getHRTComboBox() {
		if(hrtComboBox == null) {
			ComboBoxModel<String> jComboBox1Model = 
				new DefaultComboBoxModel<String>(
						new String[] { "Bottom", "Top", "None" });
			hrtComboBox = new JComboBox<String>();
			hrtComboBox.setModel(jComboBox1Model);
			hrtComboBox.setFont(new java.awt.Font("Calibri",0,18));
		}
		return hrtComboBox;
	}
	
	private JLabel getFontFaceLabel() {
		if(fontFaceLabel == null) {
			fontFaceLabel = new JLabel();
			fontFaceLabel.setText("Font Face:");
			fontFaceLabel.setFont(new java.awt.Font("Calibri",1,18));
		}
		return fontFaceLabel;
	}
	
	private JLabel getFontSizeLabel() {
		if(fontSizeLabel == null) {
			fontSizeLabel = new JLabel();
			fontSizeLabel.setText("Font Size:");
			fontSizeLabel.setFont(new java.awt.Font("Calibri",1,18));
		}
		return fontSizeLabel;
	}
	
	private JLabel getFontFaceLabelField() {
		if(fontFaceValueLabel == null) {
			fontFaceValueLabel = new JLabel();
			fontFaceValueLabel.setText("Helvetica");
			fontFaceValueLabel.setFont(new java.awt.Font("Calibri",0,18));
		}
		return fontFaceValueLabel;
	}
	
	private JLabel getFontSizeValueLabel() {
		if(fontSizeValueLabel == null) {
			fontSizeValueLabel = new JLabel();
			fontSizeValueLabel.setText("12");
			fontSizeValueLabel.setFont(new java.awt.Font("Calibri",0,18));
		}
		return fontSizeValueLabel;
	}

	private JTextField getFontColorTextField() {
		if(fontColorTextField == null) {
			fontColorTextField = new JTextField();
			fontColorTextField.setFont(new java.awt.Font("Calibri",0,28));
			fontColorTextField.setDocument(new JTextFieldLimit(11));
			fontColorTextField.setColumns(11);
			fontColorTextField.setEditable(false);
			fontColorTextField.setBackground(new java.awt.Color(0,0,0));
			fontColorTextField.setPreferredSize(new java.awt.Dimension(287,28));
			fontColorTextField.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
			fontColorTextField.setName("jTextField9");
			fontColorTextField.setSize(287, 28);
			fontColorTextField.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent evt) {
					Color currentColor = barColorTextField.getBackground();
					Color newColor = JColorChooser.showDialog(mFrame, "Choose Font Color", currentColor);
					
					if (newColor != null){
						
						fontColorTextField.setBackground(newColor);
						
					}
				}
			});
			fontColorTextField.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					int key = e.getKeyCode();
					if (key == KeyEvent.VK_ENTER) {
						//Toolkit.getDefaultToolkit().beep();   
						//System.out.println("ENTER pressed");
						CalculateCheckDigit();
					}
				}
			});
		}
		return fontColorTextField;
	}
	
	private JLabel getFontColorLabel() {
		if(fontColorLabel == null) {
			fontColorLabel = new JLabel();
			fontColorLabel.setText("Font Colour:");
			fontColorLabel.setFont(new java.awt.Font("Calibri",1,18));
		}
		return fontColorLabel;
	}
	
	/**
     * Call this method to create a QR-code image. You must provide the OutputStream where the image data can be written.
     *
     * @param outputStream The OutputStream where the QR-code image data is written.
     * @param content The string that should be encoded with the QR-code.
     * @param qrCodeSize The QR-code must be quadratic. So this is the number of pixel in width and height.
     * @param imageFormat The image format in which the image should be rendered. As Example 'png' or 'jpg'. See @javax.imageio.ImageIO for
     *        more information which image formats are supported.
	 * @return 
     * @throws Exception If an Exception occur during the create of the QR-code or while writing the data into the OutputStream.
     */
    public ImageIcon createQrCode(OutputStream outputStream, String content, int qrCodeSize, String imageFormat)
    {
        BufferedImage image = null;
		try
        {
            // Create the ByteMatrix for the QR-Code that encodes the given String.
 
            Hashtable<EncodeHintType, ErrorCorrectionLevel> hintMap = new Hashtable<EncodeHintType, ErrorCorrectionLevel>();
            hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.Q);
 
            QRCodeWriter qrCodeWriter = new QRCodeWriter();
            BitMatrix biteMatrix = qrCodeWriter.encode(content, BarcodeFormat.QR_CODE, qrCodeSize, qrCodeSize, hintMap);
 
            // Make the BufferedImage that are to hold the QRCode
 
            int matrixWidth = biteMatrix.getWidth();
 
            image = new BufferedImage(matrixWidth, matrixWidth, BufferedImage.TYPE_INT_RGB);
            image.createGraphics();
 
            Graphics2D graphics = (Graphics2D) image.getGraphics();
            graphics.setColor(Color.WHITE);
            graphics.fillRect(0, 0, matrixWidth, matrixWidth);
 
            // Paint and save the image using the ByteMatrix
 
            graphics.setColor(Color.BLACK);
 
            for (int i = 0; i < matrixWidth; i++)
            {
                for (int j = 0; j < matrixWidth; j++)
                {
                    if (biteMatrix.get(i, j) == true)
                    {
                        graphics.fillRect(i, j, 1, 1);
                    }
                }
            }
 
            //ImageIO.write(image, imageFormat, outputStream);
        }
        catch (Exception ex)
        {
            
        }
        
        return new ImageIcon(image);
    }

}
