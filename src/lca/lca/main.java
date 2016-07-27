package lca;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Color;
import java.awt.Desktop;

import java.awt.EventQueue;
import javax.swing.border.MatteBorder;


import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JTextField;



import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import net.proteanit.sql.DbUtils;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JList;
import javax.swing.JOptionPane;

import javax.swing.JTabbedPane;
import javax.swing.JTable;

import javax.swing.border.Border;

import javax.swing.border.EtchedBorder;
import java.awt.CardLayout;


import javax.swing.BorderFactory;

import javax.swing.DefaultComboBoxModel;





import javax.swing.ListSelectionModel;
import javax.swing.JTextPane;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JYearChooser;
import javax.swing.JEditorPane;
import javax.swing.JScrollBar;
import javax.swing.JTree;
import javax.swing.JCheckBox;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import com.toedter.calendar.JMonthChooser;
import com.toedter.components.JSpinField;
<<<<<<< HEAD
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JTextArea;
import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.border.BevelBorder;


public class main extends JFrame {
	static String startDir=System.getProperty("user.dir");
	private JTextField textProject;
	private JTextField textCategory;
	private JTextField textSubCat;
	JLabel lblDirectory = new JLabel("folder path");
	static String s2;
	static String value="";
=======


public class main extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	static String s2;
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
static String s3;
String pr_nm;
String nm = "sam";
  static String response;
	static String s1;
	String catia_path;
	String space_ei;
	String eq_id;
	String work_dir;
	File source;
	File dest;
	//String pro1;
	private static String str1;
	private static String str2;
	private static String str3;
	protected String[] ar;
	Double dens;
	Double vol;
	Double new_wt;
	Double newalt_wt;
	Double tot;
	Double sum_tot;
	Double imp_wt;
	String alt_sp;
<<<<<<< HEAD
	JLabel lblCurrentPath = new JLabel("Default Path>");
	static JLabel lblDefaultPath = new JLabel("directory path");
	JComboBox<String> mfg_combo = new JComboBox<String>();
	 //JPanel panel = nitnew JPanel();
	static JPanel panel_49 = new JPanel();
	JPanel panel_1 = new JPanel();
=======
	JLabel label = new JLabel("New Project");
	JComboBox<String> mfg_combo = new JComboBox<String>();
	 JPanel panel = new JPanel();
	static JPanel panel_49 = new JPanel();
	JPanel panel_1 = new JPanel();
	JPanel panel_2 = new JPanel();
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
	JPanel panel_3 = new JPanel();
	JPanel panel_4 = new JPanel();
	JPanel panel_5 = new JPanel();
	JPanel panel_6 = new JPanel();
	JPanel panel_7 = new JPanel();
	JPanel panel_8 = new JPanel();
	JPanel panel_9 = new JPanel();
	JPanel panel_10 = new JPanel();
	JPanel panel_18 = new JPanel();
	JPanel panel_17 = new JPanel();
	JPanel panel_16 = new JPanel();
	JPanel panel_15 = new JPanel();
	JPanel lot = new JPanel();
<<<<<<< HEAD
	static JLabel projectPath = new JLabel("Project Path");
=======
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
	String catPro;
	String catPr;
	String mat;
	String instance;
	String pr_id1;
	JButton button_2 = new JButton("Upload Image");
	JList<String> list_1 = new JList<String>();
	 List<String> results = new ArrayList<String>();
	 JList list_rel = new JList();
	DefaultListModel<String> lm = new DefaultListModel<String>();
	DefaultListModel<String> lmr = new DefaultListModel<String>();
	DefaultTableModel dm_ea = new DefaultTableModel();
	DefaultTableModel dm_lcp = new DefaultTableModel();
	JComboBox<String> comb_space; 
	DefaultTableModel dm_im = new DefaultTableModel();
	DefaultTableModel dm_idc = new DefaultTableModel();
	DefaultTableModel dm_idp = new DefaultTableModel();
	DefaultTableModel dm_ids = new DefaultTableModel();
	DefaultTableModel dm_impa = new DefaultTableModel();
	DefaultTableModel dm_lcpa = new DefaultTableModel();
	DefaultTableModel dm_prt = new DefaultTableModel();
	DefaultTableModel dm_den = new DefaultTableModel();
	DefaultTableModel dm_am = new DefaultTableModel();
	DefaultTableModel dm_conf= new DefaultTableModel();
	private final JTabbedPane tabbedPane = new JTabbedPane();
	private final JPanel panel_11 = new JPanel();
	private final JPanel panel_13 = new JPanel();
	Connection connection = null;
	PreparedStatement prepared = null;
	ResultSet rs = null;
	String filename1;
	String proimage;
	String mac_excel;
	String pr_id;
	String pro_impalt;
	String mat_alt;
	byte[] pro_image = null;
	String prodimage;
	byte[] prod_image = null;
	String subcatimage;
	byte[] subcat_image = null;
	private JTextField textField_4;
	 DefaultTableModel dm_iei = new DefaultTableModel(); 
	int rows = 0;
	Object data1[][];
	private JTextField txtEquitext;
	private JTextField space_text;
	private JTable table_in;
	private JTable seq_table;
	private JTable space_table;
	private JTable equip_lib;
	private JTable table_3;
	JLabel lblAssignToProcess = new JLabel("Assign to Process");
	private JTable table_4;
	private JTable table_6;
	private JTable table_8;
	private JTable table_equip;
	private JTextField equi;
	private JTextField op;
	 int equi_int;
	 int op_int;
	 double spf;
	 double tempf = 0.7;
	 double conf = 0.0;
	 DefaultTableModel dm_lc = new DefaultTableModel();
	 DefaultTableModel dm_time = new DefaultTableModel();
	 DefaultTableModel dm_spa= new DefaultTableModel();
	 DefaultTableModel dm_imp = new DefaultTableModel();
	 DefaultTableModel dm_ei = new DefaultTableModel();
	 DefaultTableModel dm_c = new DefaultTableModel();
	 DefaultTableModel dm_p = new DefaultTableModel();
	 DefaultTableModel dm_s = new DefaultTableModel();
	 DefaultTableModel dm_mat = new DefaultTableModel();
	 DefaultTableModel dm_mod = new DefaultTableModel();
	 DefaultTableModel dm_ap = new DefaultTableModel();
	 DefaultTableModel dm_asp = new DefaultTableModel();
	 DefaultTableModel dm_du = new DefaultTableModel();
	 DefaultTableModel dm_ipr = new DefaultTableModel();
	 DefaultTableModel dm_lcalt = new DefaultTableModel();
	 DefaultTableModel dm_eaq = new DefaultTableModel();
	 int lc_id;
	 String loc_if1;
	 String loc_ifid;
	 String loc_if2;
	 String loc_if3;
	 String pro_select;
	 String pro_imp1;
	 private JTable lif;
	 private JTextField textField_3;
	 private JTable pro_tab;
	 private JTextField sp;
	 private JTextField dur;
	 private JTable loc_tab;
	 private JTable pro_set;
	 private JTextField tt;
	 private JTextField textField_7;
	 private JTextField textField_8;
	 private JTextField io;
	 String inp;
	 String out;
	 String mac_bom;
	 Process process;
	 private JTable mat_table;
	 private JTable pro_alt;
	 private JTable pro_imp;
	 private JTable idc;
	 private JTable idp;
	 private JTable ids;
	 private JTable table_ei;
	 private JTextField search_nm;
	 private JTextField as_sp;
	 private JTable newmat_alt;
	 private JTextField search_altmat;
	 private JTable alt_pro;
		JComboBox combo_alt ;
		private JTable equi_alt;
		private JTable tb_imp;
		private JTable tb_lcp;
		private JTable alt_sp_tab;
		private JTable pt_alt;
		private JTextField textField_6;
		private JTextField textField_9;
		private JTextField textField_10;
		private JTextField textField_11;
		private JTable imp_pr;
		private JTable imp_ei;
		private JTable table_lcalt;
		private JTable table_alteq;
		private JTextField textField_12;
		Object[] column_idc = {"IDC","LongC","LatC", "TimeyC","DuraC","ImpC", "MenC" , "MachC" ,"TransC"};
		private JTable table_idc;
		private JTable table_idp;
		private JTable table_ids;
		private JTable table_imp;
		private JTable table_lcp;
		private JTextField density;
		private JTable pr_tr;
		private JTable table_den;
		private JTextField search_mat;
		private JTable table_matalter;
		private JTable table_conf;
		private JTextField textField_5;
	// String pro_select;
		InputChecker4 inpCheck;
		private JTable table_assio;
		private JTable table;
		private JTable table_1;
		private JTextField textField_13;
<<<<<<< HEAD
		private JTree tree;
=======
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
		/*public main(InputChecker4 inp)
		{
			inpCheck = inp;
		}*/
			public main() {
			
				
				
		setTitle("Space-Time LCA Tool");
		setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 17));
<<<<<<< HEAD
		JPanel panel = new JPanel();
=======
		//JPanel panel = new JPanel();
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setBackground(new Color(198,198,198));
		panel.setLayout(null);
		
		//JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(208,208,208));
		panel_3.setBorder(new MatteBorder(1, 1, 1, 1,new Color(205,205,205)));
		panel_3.setBackground(SystemColor.control);
		panel_3.setBounds(10, 91, 564, 581);
		panel.add(panel_3);
		panel_3.setBackground(new Color(208,208,208));
		panel_3.setBorder(new MatteBorder(1, 1, 1, 1,new Color(205,205,205)));
		panel_3.setLayout(new CardLayout(0, 0));
		panel_3.setVisible(true);
		panel_3.add(panel_1, "name_2100885253400100");
		panel_1.setVisible(false);
		
		//JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(208,208,208));
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1,new Color(205,205,205)));
<<<<<<< HEAD
		lblCurrentPath.setBounds(11, 12, 110, 19);
		
	
		lblCurrentPath.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		textCategory = new JTextField("Product Category");
		textCategory.setBounds(106, 100, 190, 25);
		textCategory.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textCategory.setBackground(new Color(221,221,221));
		textCategory.setBorder(new MatteBorder(2,2,2,2,new Color(209,209,209)));
		textCategory.setToolTipText("Enter the product category");
		textCategory.setForeground(Color.BLACK);
		textCategory.setEditable(false);
		textCategory.setColumns(10);
		textCategory.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg1) {
				textCategory.setEditable(true);
				textCategory.setText("");
				}
		});
		
		textSubCat = new JTextField("Add Sub-Categories");
		textSubCat.setBounds(132, 148, 164, 25);
		textSubCat.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textSubCat.setBackground(new Color(221,221,221));
		textSubCat.setBorder(new MatteBorder(2,2,2,2,new Color(209,209,209)));
		textSubCat.setToolTipText("Enter Sub-Category");
		textSubCat.setForeground(Color.BLACK);
		textSubCat.setEditable(false);
		textSubCat.setColumns(10);
		textSubCat.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg1) {
				textSubCat.setEditable(true);
				textSubCat.setText("");
=======
		
	
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		textField_1 = new JTextField("Product Category");
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_1.setBackground(new Color(221,221,221));
		textField_1.setBorder(new MatteBorder(2,2,2,2,new Color(209,209,209)));
		textField_1.setToolTipText("Enter the product category");
		textField_1.setForeground(Color.BLACK);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg1) {
				textField_1.setEditable(true);
				textField_1.setText("");
				}
		});
		
		textField_2 = new JTextField("Add Sub-Categories");
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_2.setBackground(new Color(221,221,221));
		textField_2.setBorder(new MatteBorder(2,2,2,2,new Color(209,209,209)));
		textField_2.setToolTipText("Enter Sub-Category");
		textField_2.setForeground(Color.BLACK);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg1) {
				textField_2.setEditable(true);
				textField_2.setText("");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				}
		});
		
		
<<<<<<< HEAD
		textProject = new JTextField("Project Name");
		textProject.setBounds(11, 52, 285, 25);
		textProject.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textProject.setToolTipText("Enter project name ");
		textProject.setForeground(Color.BLACK);
		textProject.setBackground(new Color(221,221,221));
		textProject.setBorder(new MatteBorder(2,2,2,2,new Color(209,209,209)));
		textProject.setEditable(false);
		textProject.setColumns(10);
		textProject.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg1) {
				textProject.setEditable(true);
				textProject.setText("");
				}
		});
		
		JButton btnUploadImage = new JButton("Upload Image");
		btnUploadImage.setHorizontalAlignment(SwingConstants.LEFT);
		btnUploadImage.setBounds(431, 52, 121, 30);
		btnUploadImage.setBackground(new Color(221,221,221));
		btnUploadImage.setContentAreaFilled(false);
		btnUploadImage.setOpaque(true);
		btnUploadImage.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnUploadImage.addActionListener(new ActionListener() {
=======
		textField = new JTextField("Project Name");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setToolTipText("Enter project name ");
		textField.setForeground(Color.BLACK);
		textField.setBackground(new Color(221,221,221));
		textField.setBorder(new MatteBorder(2,2,2,2,new Color(209,209,209)));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg1) {
				textField.setEditable(true);
				textField.setText("");
				}
		});
		
		JButton button_2_1 = new JButton("Upload Image");
		button_2_1.setBackground(new Color(221,221,221));
		button_2_1.setContentAreaFilled(false);
		button_2_1.setOpaque(true);
		button_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_2_1.addActionListener(new ActionListener() {
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
			public void actionPerformed(ActionEvent e) {
				 JFileChooser fileChooser = new JFileChooser();
				 FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif", "png" , "bmp");
				 fileChooser.setFileFilter(filter);
				    int returnValue = fileChooser.showOpenDialog(null);
				    if (returnValue == JFileChooser.APPROVE_OPTION)
				    {
				        File selectedFile1 = fileChooser.getSelectedFile();
				        proimage = selectedFile1.getAbsolutePath();
				        
				        
				        System.out.println("Uploaded Image  : " + selectedFile1.getName());
				    }
				    else if (returnValue == JFileChooser.CANCEL_OPTION) {
				        System.out.println(JFileChooser.CANCEL_OPTION);
				      }
				    	
			try{
				File image = new File(proimage);
				FileInputStream fis = new FileInputStream(image);
				ByteArrayOutputStream bos = new ByteArrayOutputStream();
				byte[] buf = new byte[1024];
				for(int readNum ; (readNum = fis.read(buf))!= -1 ;  ){
				
				bos.write(buf,0,readNum);
			}
				pro_image = bos.toByteArray();
				fis.close();
			}
			catch(Exception e1)
			{
				JOptionPane.showMessageDialog(null, "Not inserted image" + e1);
			}
			
			}	
			
		});
<<<<<<< HEAD
		btnUploadImage.setForeground(Color.BLACK);
		
		JButton btnUploadImage_1 = new JButton("Upload Image");
		btnUploadImage_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnUploadImage_1.setBounds(431, 100, 121, 30);
		btnUploadImage_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnUploadImage_1.setBackground(new Color(221,221,221));
		btnUploadImage_1.setContentAreaFilled(false);
		btnUploadImage_1.setOpaque(true);
		btnUploadImage_1.addActionListener(new ActionListener() {
=======
		button_2_1.setForeground(Color.BLACK);
		
		JButton button = new JButton("Upload Image");
		button.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button.setBackground(new Color(221,221,221));
		button.setContentAreaFilled(false);
		button.setOpaque(true);
		button.addActionListener(new ActionListener() {
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
			public void actionPerformed(ActionEvent e) {
				 JFileChooser fileChooser = new JFileChooser();
				 FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif", "png" , "bmp");
				 fileChooser.setFileFilter(filter);
				    int returnValue = fileChooser.showOpenDialog(null);
				    if (returnValue == JFileChooser.APPROVE_OPTION)
				    {
				        File selectedFile2 = fileChooser.getSelectedFile();
				        prodimage = selectedFile2.getAbsolutePath();
				    }
				    else if (returnValue == JFileChooser.CANCEL_OPTION) {
				        System.out.println(JFileChooser.CANCEL_OPTION);
				      }
				    	
			try{
				File image = new File(prodimage);
				FileInputStream fis = new FileInputStream(image);
				ByteArrayOutputStream bos = new ByteArrayOutputStream();
				byte[] buf = new byte[1024];
				for(int readNum ; (readNum = fis.read(buf))!= -1 ;  ){
				
				bos.write(buf,0,readNum);
			}
				prod_image = bos.toByteArray();
				fis.close();
			}
			catch(Exception e1)
			{
				JOptionPane.showMessageDialog(null, "Not inserted image" + e1);
			}
			
			}	
		});
		
<<<<<<< HEAD
		btnUploadImage_1.setForeground(Color.BLACK);
		
		
		JButton btnUploadImage_2 = new JButton("Upload Image");
		btnUploadImage_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnUploadImage_2.setBounds(431, 148, 121, 30);
		btnUploadImage_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnUploadImage_2.setBackground(new Color(221,221,221));
		btnUploadImage_2.setContentAreaFilled(false);
		btnUploadImage_2.setOpaque(true);
		btnUploadImage_2.addActionListener(new ActionListener() {
=======
		button.setForeground(Color.BLACK);
		
		
		JButton button_1 = new JButton("Upload Image");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_1.setBackground(new Color(221,221,221));
		button_1.setContentAreaFilled(false);
		button_1.setOpaque(true);
		button_1.addActionListener(new ActionListener() {
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
			public void actionPerformed(ActionEvent e) {
				 JFileChooser fileChooser = new JFileChooser();
				 FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif", "png" , "bmp");
				 fileChooser.setFileFilter(filter);
				    int returnValue = fileChooser.showOpenDialog(null);
				    if (returnValue == JFileChooser.APPROVE_OPTION)
				    {
				        File selectedFile3 = fileChooser.getSelectedFile();
				       subcatimage = selectedFile3.getAbsolutePath();
				        System.out.println("Uploaded Image  : " + selectedFile3.getName());
				    }
				    else if (returnValue == JFileChooser.CANCEL_OPTION) {
				        System.out.println(JFileChooser.CANCEL_OPTION);
				      }
				    	
			try{
				File image = new File(subcatimage);
				FileInputStream fis = new FileInputStream(image);
				ByteArrayOutputStream bos = new ByteArrayOutputStream();
				byte[] buf = new byte[1024];
				for(int readNum ; (readNum = fis.read(buf))!= -1 ;  ){
				
				bos.write(buf,0,readNum);
			}
				subcat_image = bos.toByteArray();
				fis.close();
			}
			catch(Exception e1)
			{
				JOptionPane.showMessageDialog(null, "Not inserted image" + e1);
			}
			
			}	
		});
		
<<<<<<< HEAD
		btnUploadImage_2.setForeground(Color.BLACK);
		JPanel display = new JPanel();
		JButton submit = new JButton("Submit");
		submit.setBounds(206, 521, 103, 34);
=======
		button_1.setForeground(Color.BLACK);
		JPanel display = new JPanel();
		JButton submit = new JButton("Submit");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
		submit.setBackground(new Color(221,221,221));
		submit.setContentAreaFilled(false);
		submit.setOpaque(true);
		submit.addActionListener(new ActionListener() {
			
			private String[] args;

			public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD
				new File(lblDefaultPath+"\\"+lblDirectory).mkdir();
				
=======
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				panel_3.removeAll();
				panel_3.repaint();
				panel_3.revalidate();
				panel_3.add(display);
				display.setVisible(true);
				create_mainfolder();
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection1 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection1 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					// JOptionPane.showMessageDialog(null, "connection1 successful");
					
					String insertTableSQL =( "INSERT INTO Project_info"
							+ "( NAME, Pro_cat,Sub_cat,Proj_image,Procat_image,Subcat_image) VALUES"
							+ "(?,?,?,?,?,?)");
					prepared = connection1.prepareStatement(insertTableSQL);
<<<<<<< HEAD
					prepared.setString(1, textProject.getText());
					prepared.setString(2,  textCategory.getText());
					prepared.setString(3,  textSubCat.getText());
=======
					prepared.setString(1, textField.getText());
					prepared.setString(2,  textField_1.getText());
					prepared.setString(3,  textField_2.getText());
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					prepared.setBytes(4, pro_image);
					prepared.setBytes(5, prod_image);
					prepared.setBytes(6, subcat_image);

					// execute insert SQL stetement
					prepared.executeUpdate();
					
					System.out.println("Record is inserted into Project_info table!");
					connection1.close();
			    } catch ( Exception e1 ) {
			      System.err.println( e1.getClass().getName() + ": " + e1.getMessage() );
			     e1.printStackTrace();
			    
			    }
				finally {
					try{
					rs.close(); prepared.close(); }//connection1.close(); }
					catch(Exception e1) { } }
				
					//String sql1 = "SELECT * FROM Project_info  " ;
					try {
						String sql1 = "SELECT * FROM Project_info  " ;
						Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
						 Connection connection2 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
						 Connection connection2 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
						 //JOptionPane.showMessageDialog(null, "connection2 successful");
						
						prepared = connection2.prepareStatement(sql1);
						rs = prepared.executeQuery();
						while(rs.next())
						{
							//proName.setText(rs.getString("name"));
							
						}
						connection2.close();}
						catch(Exception e3)
						{
							System.err.println( e3.getClass().getName() + ": " + e3.getMessage() );
						}
				
					finally {
						try{
						rs.close(); prepared.close();
						//connection2.close(); 
						}
						catch(Exception e1) { } }
					
					}
					
			});
		submit.setFont(new Font("Tahoma", Font.PLAIN, 14));
<<<<<<< HEAD
			panel_1.setLayout(null);
			
			JScrollPane scrollPane_40 = new JScrollPane();
			scrollPane_40.setBounds(11, 202, 502, 308);
			panel_1.add(scrollPane_40);
			
			tree = new JTree();
			tree.setEditable(true);
			tree.setForeground(new Color(0, 0, 0));
			tree.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			tree.setBackground(Color.LIGHT_GRAY);
			tree.addTreeSelectionListener(new TreeSelectionListener() {
				public void valueChanged(TreeSelectionEvent e) {
					//lblDefaultPath.setText((String) tree.getLastSelectedPathComponent());
				
					TreePath treepath=e.getPath();
					Object elements[]=treepath.getPath();
					for(int i=0,n=elements.length;i<n;i++)
					{
						value += elements[i]+"\\";
					}
					value=value.replaceAll("^null","");
					lblDirectory.setText(String.valueOf(value));
					//JOptionPane.showMessageDialog(null, value);
					
					for(int i=0,n=elements.length;i<n;i++)
					{
						value=null;
					}
					
				}
			});
			tree.setModel(new DefaultTreeModel(
				new DefaultMutableTreeNode(textProject.getText()) {
					{
					}
				}
			));
			scrollPane_40.setViewportView(tree);
			panel_1.add(lblCurrentPath);
			panel_1.add(textProject);
			panel_1.add(textCategory);
			panel_1.add(textSubCat);
			panel_1.add(btnUploadImage);
			panel_1.add(btnUploadImage_1);
			panel_1.add(btnUploadImage_2);
			panel_1.add(submit);
			
			JButton btnAddproje = new JButton("add Project");
			btnAddproje.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					tree.getModel().getRoot();
					String projectName;
					String location;						
					
					projectName=textProject.getText();
					location=lblDefaultPath.getText();
					
					DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
					DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
					//model.insertNodeInto(new DefaultMutableTreeNode("another_child"), root, root.getChildCount());
					
					
					
					DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode)tree.getLastSelectedPathComponent(); 
					model.insertNodeInto(new DefaultMutableTreeNode(projectName), selectedNode, selectedNode.getChildCount());
					//root.setUserObject("All Projects");
					model.nodeChanged(root);
					new File(lblDefaultPath.getText()+"\\"+lblDirectory.getText()).mkdir();
					String test=lblDefaultPath.getText()+"\\"+lblDirectory.getText();
					//TreePath currentSelection = tree.getSelectionPath();
				//	textLocation.setText(currentSelection.toString());
				      JOptionPane.showMessageDialog(null,test);
				    
					//lblDefaultPath.setText(location+"\\"+projectName);
				
				}
			});
			btnAddproje.setBounds(300, 54, 121, 23);
			panel_1.add(btnAddproje);
			lblDefaultPath.setVerticalAlignment(SwingConstants.TOP);
			lblDefaultPath.setToolTipText(lblDefaultPath.getText());
			
			
			lblDefaultPath.setFont(new Font("Tahoma", Font.ITALIC, 10));
			lblDefaultPath.setBounds(118, 17, 303, 19);
			panel_1.add(lblDefaultPath);
			
			JLabel lblChangePath = new JLabel("<Change Path");
			lblChangePath.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					FileBrowser.main(null);
				}
			});
			lblChangePath.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblChangePath.setBounds(423, 13, 103, 17);
			panel_1.add(lblChangePath);
			
			JButton btnNewButton_20 = new JButton("add Category");
			btnNewButton_20.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {


					tree.getModel().getRoot();
					String projectName;
					String location;						
					
					projectName=textCategory.getText();
					location=lblDefaultPath.getText();
					
					DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
					DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
					//model.insertNodeInto(new DefaultMutableTreeNode("another_child"), root, root.getChildCount());
					
					
					
					DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode)tree.getLastSelectedPathComponent(); 
					model.insertNodeInto(new DefaultMutableTreeNode(projectName), selectedNode, selectedNode.getChildCount());
					//root.setUserObject("All Projects");
					//model.nodeChanged(root);
					new File(lblDefaultPath.getText()+"\\"+lblDirectory.getText()).mkdir();
					String test=lblDefaultPath.getText()+"\\"+lblDirectory.getText();
					//new File(lblDefaultPath+"\\"+lblDirectory).mkdir();
					
					TreePath currentSelection = tree.getSelectionPath();
				//	textLocation.setText(currentSelection.toString());
				      //JOptionPane.showMessageDialog(null,currentSelection);
				    
					//lblDefaultPath.setText(location+"\\"+projectName);
				
				
					
				}
			});
			btnNewButton_20.setBounds(302, 102, 119, 23);
			panel_1.add(btnNewButton_20);
			
			JButton btnAdd_3 = new JButton("add Subcategory");
			btnAdd_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {



					tree.getModel().getRoot();
					String projectName;
					String location;						
					
					projectName=textSubCat.getText();
					location=lblDefaultPath.getText();
					
					DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
					DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
					//model.insertNodeInto(new DefaultMutableTreeNode("another_child"), root, root.getChildCount());
					
					
					
					DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode)tree.getLastSelectedPathComponent(); 
					model.insertNodeInto(new DefaultMutableTreeNode(projectName), selectedNode, selectedNode.getChildCount());
					//root.setUserObject("All Projects");
					model.nodeChanged(root);
					new File(lblDefaultPath+"\\"+lblDirectory).mkdir();
					
					TreePath currentSelection = tree.getSelectionPath();
				//	textLocation.setText(currentSelection.toString());
				      //JOptionPane.showMessageDialog(null,currentSelection);
				    
					//lblDefaultPath.setText(location+"\\"+projectName);
				
				
					
				
				}
			});
			btnAdd_3.setBounds(302, 150, 119, 23);
			panel_1.add(btnAdd_3);
			
			
			lblDirectory.setBounds(11, 30, 541, 14);
			panel_1.add(lblDirectory);
=======
		
		
			panel_2.setBackground(new Color(208,208,208));
			GroupLayout gl_panel_1 = new GroupLayout(panel_1);
			gl_panel_1.setHorizontalGroup(
				gl_panel_1.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel_1.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
							.addComponent(label)
							.addGroup(gl_panel_1.createSequentialGroup()
								.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
									.addComponent(textField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE))
								.addGap(39)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
									.addComponent(button_2_1, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
									.addComponent(button, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
									.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE))
								.addGap(10)))
						.addGap(48))
					.addGroup(gl_panel_1.createSequentialGroup()
						.addGap(205)
						.addComponent(submit, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(252, Short.MAX_VALUE))
					.addGroup(gl_panel_1.createSequentialGroup()
						.addContainerGap()
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(106, Short.MAX_VALUE))
			);
			gl_panel_1.setVerticalGroup(
				gl_panel_1.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel_1.createSequentialGroup()
						.addContainerGap()
						.addComponent(label)
						.addGap(18)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addComponent(button_2_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
						.addGap(30)
						.addComponent(submit, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addGap(25))
			);
			GridBagLayout gbl_panel_2 = new GridBagLayout();
			gbl_panel_2.columnWidths = new int[]{51, 95, 114, 41, 41, 0};
			gbl_panel_2.rowHeights = new int[]{23, 0, 0, 0};
			gbl_panel_2.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
			panel_2.setLayout(gbl_panel_2);
			
			JButton button_3 = new JButton("+");
			GridBagConstraints gbc_button_3 = new GridBagConstraints();
			gbc_button_3.insets = new Insets(0, 0, 5, 5);
			gbc_button_3.anchor = GridBagConstraints.NORTHWEST;
			gbc_button_3.gridx = 0;
			gbc_button_3.gridy = 0;
			panel_2.add(button_3, gbc_button_3);
			button_3.setVerticalAlignment(SwingConstants.TOP);
			
			JLabel lblAddSubcategories = new JLabel("Add Sub-Categories");
			GridBagConstraints gbc_lblAddSubcategories = new GridBagConstraints();
			gbc_lblAddSubcategories.anchor = GridBagConstraints.WEST;
			gbc_lblAddSubcategories.insets = new Insets(0, 0, 5, 5);
			gbc_lblAddSubcategories.gridx = 1;
			gbc_lblAddSubcategories.gridy = 0;
			panel_2.add(lblAddSubcategories, gbc_lblAddSubcategories);
			
			JButton button_4 = new JButton("+");
			GridBagConstraints gbc_button_4 = new GridBagConstraints();
			gbc_button_4.anchor = GridBagConstraints.NORTHWEST;
			gbc_button_4.insets = new Insets(0, 0, 5, 5);
			gbc_button_4.gridx = 3;
			gbc_button_4.gridy = 0;
			panel_2.add(button_4, gbc_button_4);
			
			JLabel lblAddProductCategories = new JLabel("Add Product Categories");
			GridBagConstraints gbc_lblAddProductCategories = new GridBagConstraints();
			gbc_lblAddProductCategories.insets = new Insets(0, 0, 5, 0);
			gbc_lblAddProductCategories.gridx = 4;
			gbc_lblAddProductCategories.gridy = 0;
			panel_2.add(lblAddProductCategories, gbc_lblAddProductCategories);
			panel_1.setLayout(gl_panel_1);
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
			
			
			panel_3.add(display, "name_2100923842523197");
			display.setBackground(new Color(208,208,208));
			display.setBorder(new MatteBorder(1, 1, 1, 1,new Color(205,205,205)));
			display.setLayout(null);
			
			
			panel_49.setBounds(10, 204, 531, 333);
			display.add(panel_49);
			
<<<<<<< HEAD
			JButton btnTest = new JButton("existing Project ");
			btnTest.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					FileBrowser.main(null);			//neelz
				}
			});
			btnTest.setBounds(0, 0, 109, 23);
			display.add(btnTest);
			
//			JLabel projectPath = new JLabel("Project Path");
			projectPath.setBounds(142, 4, 399, 14);
			display.add(projectPath);
			
=======
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
			/*JEditorPane editorPane = new JEditorPane();
			editorPane.setBounds(10, 300, 542, 256);
			display.add(editorPane);
			try {
				editorPane.setPage("C:\\Save\\3DXMLProduct_2016.1.14_17.6.20.3dxml");
			} catch (IOException e3) {
				
				e3.printStackTrace();
			}*/
		
		panel_4.setBounds(584, 147, 745, 528);
		panel.add(panel_4);
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(208,208,208));
		panel_4.setBorder(new MatteBorder(1, 1, 1, 1,new Color(205,205,205)));
		panel_4.setVisible(false);
		tabbedPane.setBounds(10, 11, 725, 505);
		
		panel_4.add(tabbedPane);
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		panel_11.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.GRAY, null));
		panel_11.setBackground(new Color(224,224,225));
		
	
	
		
		
		panel_5.setBackground(new Color(208,208,208));
		panel_5.setBounds(584, 40, 373, 45);
		panel.add(panel_5);
		panel_5.setLayout(null);
		panel_5.setBorder(new MatteBorder(1, 1, 1, 1,new Color(205,205,205)));
		
		JLabel model = new JLabel("Model Details");
		model.setFont(new Font("Tahoma", Font.BOLD, 15));
		model.setToolTipText("Model Details");
		model.setBounds(28, 11, 161, 23);
		panel_5.add(model);
		JPanel Model = new JPanel();
		JButton modButton = new JButton("+");
		modButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_4.setVisible(true);
				
	            	   tabbedPane.setVisible(true);
	            	   tabbedPane.removeAll();
	                	tabbedPane.addTab("Model Library", Model);
	            	   
	            	   
	            	   //tabbedPane.addTab("Process", null,panel_12, null);
	                	/*tabbedPane.setEnabled(true);
	                	//tabbedPane.removeAll();
	                	tabbedPane.remove(panel_11);
	                	tabbedPane.remove(panel_13);
	                	tabbedPane.setSelectedComponent(panel_12);*/
	            	   //tabbedPane.remove(panel_11);
	                	//tabbedPane.remove(panel_13);
	            	   //tabbedPane.addTab("Process", null, panel_12, null);
	            	   tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
			}
		});
		modButton.setBounds(322, 13, 41, 23);
		panel_5.add(modButton);
		
		
		panel_7.setBounds(961, 40, 368, 45);
		panel.add(panel_7);
		panel_7.setLayout(null);
		panel_7.setBackground(new Color(208,208,208));
		panel_7.setBorder(new MatteBorder(1, 1, 1, 1,new Color(205,205,205)));
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setForeground(Color.RED);
		comboBox.setBounds(102, 11, 194, 23);
		comboBox.setBackground(new Color(221,221,221));
		comboBox.setOpaque(true);
		panel_7.add(comboBox);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.addItem("Material");
		comboBox.addItem("Process");
		comboBox.addItem("Space");
		comboBox.addItem("Time");
		comboBox.addItem("Equipment");
		comboBox.addItem("LC Phase");
		comboBox.addItem("Relations");
		comboBox.addItem("Impacts");
		tabbedPane.setVisible(false);
		JLabel lblNewLabel_4 = new JLabel("Material");
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		
	
		tabbedPane.addTab("Model", null, Model, null);
		Model.setLayout(new CardLayout(0, 0));
		
		JPanel panel_31 = new JPanel();
		Model.add(panel_31, "name_5364441329677");
		JLabel lblCreateTheModel = new JLabel("Create Model");
		//lblCreateTheModel.setVisible(false);
		
		JLabel lblModelLibrary = new JLabel("Model Library");
		lblModelLibrary.setForeground(Color.RED);
		lblModelLibrary.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton catia = new JButton("Open CATIA");
		catia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser fileChooser = new JFileChooser();
				 FileNameExtensionFilter filter = new FileNameExtensionFilter("CATIA Application", "exe");
				 fileChooser.setFileFilter(filter);
				    int returnValue = fileChooser.showOpenDialog(null);
				    if (returnValue == JFileChooser.APPROVE_OPTION)
				    {
				        File selectedFile1 = fileChooser.getSelectedFile();
				        catia_path = selectedFile1.getAbsolutePath();
				        
				        
				        System.out.println("CATIA Product  : " + selectedFile1.getName());
				    }
				    else if (returnValue == JFileChooser.CANCEL_OPTION) {
				        System.out.println(JFileChooser.CANCEL_OPTION);
				      }
				process = Cat.run(catia_path);
			}
		});
		catia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		//catia.setVisible(false);
		JButton btnChoose = new JButton("Choose");
		btnChoose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*JFileChooser fileChooser = new JFileChooser();
				 FileNameExtensionFilter filter = new FileNameExtensionFilter("CATIA Application", "exe");
				 fileChooser.setFileFilter(filter);
				    int returnValue = fileChooser.showOpenDialog(null);
				    if (returnValue == JFileChooser.APPROVE_OPTION)
				    {
				        File selectedFile1 = fileChooser.getSelectedFile();
				        catia_path = selectedFile1.getAbsolutePath();
				        
				        
				        System.out.println("CATIA Product  : " + selectedFile1.getName());
				    }
				    else if (returnValue == JFileChooser.CANCEL_OPTION) {
				        System.out.println(JFileChooser.CANCEL_OPTION);
				      }*/
				process = Cat.run(catia_path);
			}
			
		});
		btnChoose.setFont(new Font("Tahoma", Font.PLAIN, 14));
		//btnChoose.setVisible(false);
		JLabel lblNewLabel_3 = new JLabel("Choose an existing model");
		
		lblCreateTheModel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
				//lblNewLabel_3.setVisible(false);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_14 = new JLabel("Model Alternatives");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JButton btnChoose_1 = new JButton("Choose");
		btnChoose_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				 FileNameExtensionFilter filter = new FileNameExtensionFilter("CATIA Product", "CATPRoduct" , "CATpart" ,"CATProcess");
				 fileChooser.setFileFilter(filter);
				    int returnValue = fileChooser.showOpenDialog(null);
				    if (returnValue == JFileChooser.APPROVE_OPTION)
				    {
				        File selectedFile2 = fileChooser.getSelectedFile();
				        catPr = selectedFile2.getAbsolutePath();
				        
				        
				        System.out.println("Uploaded Image  : " + selectedFile2.getName());
				    }
				    else if (returnValue == JFileChooser.CANCEL_OPTION) {
				        System.out.println(JFileChooser.CANCEL_OPTION);
				      }
				process = Cat.run(catPr);
			}
			
		});
		JLabel lblNewLabel_16 = new JLabel("Choose an Alternative model ");
		JButton btnAssign = new JButton("Assign");
		btnAssign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnChoose_1.setVisible(true);
				lblNewLabel_16.setVisible(true);
				/*Model.removeAll();
				Model.repaint();
				Model.revalidate();
				Model.add(panel_32);
				panel_32.setVisible(true);
				
				String sql = "Select Inst_nm , inst_Type from macro_ex";
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection64 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection64 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection7 successful");		
						
						PreparedStatement pst = connection64.prepareStatement(sql);
					    ResultSet rs1 = pst.executeQuery();
					    
					    while(rs1.next())
					    {
					    	String inst = rs1.getString(1);
					    	String typ = rs1.getString(2);
					    	
					    	Object[] row = {inst,typ};
					    	dm_mod.addRow(row);
					    	System.out.print("Yes");
					    	
					    }
					    connection64.close();
					    dm_mod.removeRow(0);
					  }
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				}*/}
			
				});
				
				
				
				
				
			
		btnAssign.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		
		lblNewLabel_16.setVisible(false);
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		
		btnChoose_1.setVisible(false);
		btnChoose_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblChoosedxmlFile = new JLabel("Choose 3DXML file ");
		lblChoosedxmlFile.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton xmlUpload_2 = new JButton("Upload");
		xmlUpload_2.addActionListener(new ActionListener() {
			private String[] args2 = null;

			public void actionPerformed(ActionEvent e) {
				//SwtBrowserCanvas.main(args2);
			BrowserCanvas.main(args2);
				//BrowserCanvas.run("file:///C:/Save/3DXML/Product_2015.12.22_20.41.12.3dxml");
			}
		});
		xmlUpload_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel label_9 = new JLabel("Upload the Macro generated Excel ");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton button_18 = new JButton("Upload");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String sql = "Delete from macro_ex";
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection7 successful");		
						
						PreparedStatement pst = connection16.prepareStatement(sql);
						pst.execute();   
					  }
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				
				String sql12 = "Delete from bom";
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection7 successful");		
						
						PreparedStatement pst = connection16.prepareStatement(sql12);
						pst.execute();   
					  }
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				
				 JFileChooser fileChooser = new JFileChooser();
				 FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel",".csv");
				 fileChooser.setFileFilter(filter);
				    int returnValue = fileChooser.showOpenDialog(null);
				    if (returnValue == JFileChooser.APPROVE_OPTION)
				    {
				        File selectedFile1 = fileChooser.getSelectedFile();
				        mac_excel = selectedFile1.getAbsolutePath();
				        
				        
				        JOptionPane.showConfirmDialog(null, "Uploaded macro_file  : " + selectedFile1.getName() + mac_excel);
				    }
				    else if (returnValue == JFileChooser.CANCEL_OPTION) {
				        System.out.println(JFileChooser.CANCEL_OPTION);
				      }
				    
				    // save the macro excel sheet in db table
				    try{
						Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection63 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection63 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					// JOptionPane.showMessageDialog(null, "connection1 successful");
					
				
					BufferedReader br_mac = new BufferedReader(new FileReader(mac_excel));
					String line ;
					while((line = br_mac.readLine()) != null){
						String[]value = line.split(",");
						String insertTableSQL =( "INSERT or REPLACE INTO macro_ex"
								+ "( Inst_nm, part_nm , ass_mat , vol, len , br, ht, weight ) VALUES"
								+ "(?,?, ? , ? ,? ,?, ?,? )");
					
					prepared = connection63.prepareStatement(insertTableSQL);
					prepared.setString(1, value[0]);
					
					prepared.setString(2, value[1]);
					prepared.setString(3, value[2]);
					prepared.setString(4, value[3]);
					prepared.setString(5, value[4]);
					prepared.setString(6, value[5]);
					prepared.setString(7, value[6]);
					prepared.setString(8, value[7]);
					prepared.execute();
					}
					
					System.out.println("Record is inserted into macro_ex table!");
					connection63.close();
					br_mac.close();
			    } catch ( Exception e1 ) {
			      System.err.println( e1.getClass().getName() + ": " + e1.getMessage() );
			      //JOptionPane.showMessageDialog(null, "Enter the processes before retrieving");
			     e1.printStackTrace();
			    
			    }
				finally {
					try{
					rs.close(); prepared.close(); }//connection1.close(); }
					catch(Exception e1) { } 
				}
				   /*
					XSSFWorkbook workbook = new XSSFWorkbook(mac_excel);
					XSSFSheet shet = workbook.getSheetAt(0);
					Iterator Row = shet.iterator();
					while(ite.hasNext()){
						Row row = ite.next();
						Iterator<Cell> cite = row.cellIterator();
						while(cite.hasNext()){
							Cell c = cite.next();
							System.out.print(c.toString() +"  ");
						}
						System.out.println();
					}
					fis.close();
				*/
<<<<<<< HEAD
				    File file_bom = new File(startDir+"\\templates\\new.csv");
				    mac_bom = file_bom.getAbsolutePath();
				    try{
						Class.forName("org.sqlite.JDBC");
					 Connection connection63 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
				    File file_bom = new File("M:\\templates\\new.csv");
				    mac_bom = file_bom.getAbsolutePath();
				    try{
						Class.forName("org.sqlite.JDBC");
					 Connection connection63 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					// JOptionPane.showMessageDialog(null, "connection1 successful");
					
				
					BufferedReader br_mac = new BufferedReader(new FileReader(file_bom));
					String line ;
					while((line = br_mac.readLine()) != null){
						String[]value = line.split(",");
						String insertTableSQL1 =( "INSERT or REPLACE INTO bom"
								+ "( Part_name, Status , Part_id , SA, Part , class ) VALUES"
								+ "(?,?,?,?,?,?)");
					
					prepared = connection63.prepareStatement(insertTableSQL1);
					prepared.setString(1, value[0]);
					prepared.setString(2, value[1]);
					prepared.setString(3, value[2]);
					prepared.setString(4, value[3]);
					prepared.setString(5, value[4]);
					prepared.setString(6, value[5]);
					
					prepared.execute();
					}
					
					System.out.println("Record is inserted into bom table!");
					connection63.close();
					br_mac.close();
			    } catch ( Exception e1 ) {
			      System.err.println( e1.getClass().getName() + ": " + e1.getMessage() );
			      //JOptionPane.showMessageDialog(null, "Enter the processes before retrieving");
			     e1.printStackTrace();
			    
			    }
				finally {
					try{
					rs.close(); prepared.close(); }//connection1.close(); }
					catch(Exception e1) { } 
				}
				    pop_mat();
				
				    fillcombo();
				    
				    
			}
			
		});
		button_18.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblUploadTheAssembly = new JLabel("Upload the Assembly Tree structure");
		lblUploadTheAssembly.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUploadTheAssembly.setVisible(false);
		JButton button_19 = new JButton("Upload");
		button_19.setVisible(false);
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		/*button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				 FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel", "xls" , "xlsx" , "csv");
				 fileChooser.setFileFilter(filter);
				    int returnValue = fileChooser.showOpenDialog(null);
				    if (returnValue == JFileChooser.APPROVE_OPTION)
				    {
				        File selectedFile_new = fileChooser.getSelectedFile();
				        mac_bom = selectedFile_new.getAbsolutePath();
				        
				        
				        JOptionPane.showConfirmDialog(null, "Uploaded macro_file  : " + selectedFile_new.getName() + mac_bom);
				    }
				    else if (returnValue == JFileChooser.CANCEL_OPTION) {
				        System.out.println(JFileChooser.CANCEL_OPTION);
				      }
				
				mac_bom = "M:\\templates\\new.csv";
				    try{
						Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection63 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection63 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					// JOptionPane.showMessageDialog(null, "connection1 successful");
					
				
					BufferedReader br_mac = new BufferedReader(new FileReader(mac_bom));
					String line ;
					while((line = br_mac.readLine()) != null){
						String[]value = line.split(",");
						String insertTableSQL =( "INSERT or REPLACE INTO bom"
								+ "( Part_name, Status , Part_id , SA, Part , class ) VALUES"
								+ "(?,?, ? , ? ,? ,? )");
					
					prepared = connection63.prepareStatement(insertTableSQL);
					prepared.setString(1, value[0]);
					prepared.setString(2, value[1]);
					prepared.setString(3, value[2]);
					prepared.setString(4, value[3]);
					prepared.setString(5, value[4]);
					prepared.setString(6, value[5]);
					
					prepared.execute();
					}
					
					System.out.println("Record is inserted into bom table!");
					connection63.close();
					br_mac.close();
			    } catch ( Exception e1 ) {
			      System.err.println( e1.getClass().getName() + ": " + e1.getMessage() );
			      //JOptionPane.showMessageDialog(null, "Enter the processes before retrieving");
			     e1.printStackTrace();
			    
			    }
				finally {
					try{
					rs.close(); prepared.close(); }//connection1.close(); }
					catch(Exception e1) { } 
				}
				    }
		});*/
		button_19.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GroupLayout gl_panel_31 = new GroupLayout(panel_31);
		gl_panel_31.setHorizontalGroup(
			gl_panel_31.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_31.createSequentialGroup()
					.addGroup(gl_panel_31.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_31.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblModelLibrary, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_31.createSequentialGroup()
							.addGap(27)
							.addGroup(gl_panel_31.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_31.createSequentialGroup()
									.addGap(160)
									.addGroup(gl_panel_31.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_panel_31.createSequentialGroup()
											.addComponent(btnChoose)
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel_31.createSequentialGroup()
											.addComponent(catia, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
											.addGap(143)
											.addComponent(lblChoosedxmlFile)))
									.addGap(18)
									.addGroup(gl_panel_31.createParallelGroup(Alignment.LEADING)
										.addComponent(button_18)
										.addComponent(xmlUpload_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
								.addGroup(gl_panel_31.createSequentialGroup()
									.addGroup(gl_panel_31.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_16)
										.addComponent(lblNewLabel_14))
									.addGap(18)
									.addGroup(gl_panel_31.createParallelGroup(Alignment.LEADING)
										.addComponent(btnAssign)
										.addComponent(btnChoose_1)))))
						.addGroup(gl_panel_31.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblCreateTheModel, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_31.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_3)))
					.addContainerGap(66, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel_31.createSequentialGroup()
					.addContainerGap(338, Short.MAX_VALUE)
					.addComponent(lblUploadTheAssembly, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(button_19, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
					.addGap(65))
		);
		gl_panel_31.setVerticalGroup(
			gl_panel_31.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_31.createSequentialGroup()
					.addGap(18)
					.addComponent(lblModelLibrary, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addGap(31)
					.addGroup(gl_panel_31.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCreateTheModel, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(catia)
						.addComponent(lblChoosedxmlFile, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(xmlUpload_2))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_31.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(btnChoose)
						.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_18, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_31.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUploadTheAssembly, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_19, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(89)
					.addGroup(gl_panel_31.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_14)
						.addComponent(btnAssign))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_31.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_16)
						.addComponent(btnChoose_1))
					.addContainerGap(163, Short.MAX_VALUE))
		);
		panel_31.setLayout(gl_panel_31);
		Object[] column_mat = {"Instance Name " , "Assigned Material" ,"Weight(Kg)","Volume (mm3)","Alternate Material Name"};
		
		dm_mod.setColumnIdentifiers(column_mat);
		
		
		JPanel panel_33 = new JPanel();
		panel_33.setBounds(0, 0, 10, 10);
		panel_33.setLayout(new CardLayout(0, 0));
		panel_33.add(panel_11 ,"p11");
		JScrollPane scrollPane_10 = new JScrollPane();
		
		JComboBox<String> pp_combo = new JComboBox<String>();
		pp_combo.setVisible(false);
		pp_combo.addItem("Assembly");
		pp_combo.addItem("Subassembly");
		pp_combo.addItem("Part");
		pp_combo.setSelectedIndex(-1);
		
		JButton btnAdd_1 = new JButton("Add");
		btnAdd_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
            String nm = dm_mat.getValueAt(mat_table.getSelectedRow(), 0).toString();
			String new_mat = dm_den.getValueAt(table_den.getSelectedRow(), 0).toString();
				System.out.println(nm);
				dens =  Double.parseDouble( dm_den.getValueAt(table_den.getSelectedRow(), 3).toString());
				 vol = Double.parseDouble(dm_mat.getValueAt(mat_table.getSelectedRow(), 3).toString());
				 new_wt = (dens * vol) ;
				 System.out.println( + new_wt + "weight");
				//String typ = pp_combo.getSelectedItem().toString();
				try{
					
					String query = ("Update macro_ex SET new_mat =?,dens =?,new_wt=? where Inst_nm=?");
							
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection24 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection24 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					JOptionPane.showMessageDialog(null, "connection13 successful");		
					//String id = dm1.getValueAt(i, 0).toString();
					
					//mat_table.getModel().setValueAt(typ, mat_table.getSelectedRow(), 5);
						PreparedStatement pst = connection24.prepareStatement(query);
						//System.out.println(typ);
					//pst.setString(1, typ);
					pst.setString(1, new_mat);
					pst.setDouble(2, dens);
					pst.setDouble(3, new_wt);
					pst.setString(4,nm);
					    
					mat_table.getModel().setValueAt(new_mat, mat_table.getSelectedRow(), 4);		
						
					  pst.execute();
					    connection24.close();
					  
					   					
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				
				mat_table.setValueAt(new_wt, mat_table.getSelectedRow(), 2);
			}
		});
		btnAdd_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JPanel panel_32 = new JPanel();
		panel_33.add(panel_32, "name_1499632957564753");
		
		JButton btnMaterialAlternatives = new JButton("Material Alternatives");
		btnMaterialAlternatives.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_33.removeAll();
				panel_33.repaint();
				panel_33.revalidate();
				panel_33.add(panel_32);
				panel_32.setVisible(true);
				
				String sql = "Select Inst_nm,new_mat,new_wt , vol  from macro_ex";
					try
					{
						Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					JOptionPane.showMessageDialog(null, "connection7 successful");		
						
						PreparedStatement pst = connection16.prepareStatement(sql);
					    ResultSet rs1 = pst.executeQuery();
					    
					    while(rs1.next())
					    {
					    	String new_mat = rs1.getString(2);
					    	String inst_nm = rs1.getString(1);
					    	String vol= rs1.getString(4);
					    	String wt = rs1.getString(3);
					    	//String den = rs1.getString(4);
					    	Object[] row = {inst_nm , new_mat ,wt, vol};
					    	dm_mod.addRow(row);
					    	//System.out.print("Yes");
					    	   }
					    connection16.close();
					    dm_mod.removeRow(0);
					  }
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
					finally {
						try{
						rs.close(); prepared.close(); }//connection1.close(); }
						catch(Exception e1) { } 
					}

				
				
				/*String sql_search = "Select Type,Name,Sub,density from mat where name like '%"  + search_mat.getText() +  "%' OR type like '%"  + search_mat.getText() +  "%' ;";
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					JOptionPane.showMessageDialog(null, "connection7 successful");		
						
						PreparedStatement pst = connection16.prepareStatement(sql);
					    ResultSet rs1 = pst.executeQuery();
					    
					    while(rs1.next())
					    {
					    	String mat_nm = rs1.getString(2);
					    	String mat_typ = rs1.getString(1);
					    	String sub= rs1.getString(3);
					    	String den = rs1.getString(4);
					    	Object[] row = {mat_nm , mat_typ , sub,den};
					    	dm_den.addRow(row);
					    	//System.out.print("Yes");
					    	
					    }
					    connection16.close();
					  }
				catch(Exception ex)
				{
					ex.printStackTrace();
				}*/
				
				
				
			}
		});
		
		JLabel lblDensity = new JLabel("Density");
		lblDensity.setVisible(false);
		lblDensity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		density = new JTextField();
		density.setVisible(false);
		density.setColumns(10);
		
		JScrollPane scrollPane_34 = new JScrollPane();
		
		JLabel lblSearchMaterialName = new JLabel("Search Material name");
		lblSearchMaterialName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		search_mat = new JTextField();
		search_mat.setColumns(10);
		
		JButton btnSearch_1 = new JButton("Search");
		btnSearch_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dm_den.setRowCount(0);
				String sql = "Select Type,Name,Sub,density from mat where name like '%"  + search_mat.getText() +  "%' OR type like '%"  + search_mat.getText() +  "%' ;";
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					JOptionPane.showMessageDialog(null, "connection7 successful");		
						
						PreparedStatement pst = connection16.prepareStatement(sql);
					    ResultSet rs1 = pst.executeQuery();
					    
					    while(rs1.next())
					    {
					    	String mat_nm = rs1.getString(2);
					    	String mat_typ = rs1.getString(1);
					    	String sub= rs1.getString(3);
					    	String den = rs1.getString(4);
					    	Object[] row = {mat_nm , mat_typ , sub,den};
					    	dm_den.addRow(row);
					    	//System.out.print("Yes");
					    	
					    }
					    connection16.close();
					  }
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				
				//density();
				/* String mat_select = table_den.getModel().getValueAt(table_den.getSelectedRow(), 2).toString();
				String sql1 = "Select density from mat where name = ? ";
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					JOptionPane.showMessageDialog(null, "connection7 successful");		
						
						PreparedStatement pst = connection16.prepareStatement(sql1);
					pst.setString(1, mat_select);
					    ResultSet rs1 = pst.executeQuery();
					    
					    
					    while(rs1.next())
					    {
					    	density.setText(rs1.getString(1));
					    	//System.out.print("Yes");
					    	
					    }
					    connection16.close();
					  }
				catch(Exception ex)
				{
					ex.printStackTrace();
				}*/
			}
		});
		btnSearch_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		
		
		
		GroupLayout gl_panel_11 = new GroupLayout(panel_11);
		gl_panel_11.setHorizontalGroup(
			gl_panel_11.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_11.createSequentialGroup()
					.addGroup(gl_panel_11.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_11.createSequentialGroup()
							.addGap(8)
							.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_11.createSequentialGroup()
							.addGap(20)
							.addGroup(gl_panel_11.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_11.createSequentialGroup()
									.addGroup(gl_panel_11.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_11.createSequentialGroup()
											.addComponent(scrollPane_10, GroupLayout.PREFERRED_SIZE, 284, GroupLayout.PREFERRED_SIZE)
											.addGap(6)
											.addComponent(scrollPane_34, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel_11.createSequentialGroup()
											.addGap(17)
											.addComponent(lblSearchMaterialName)
											.addGap(18)
											.addComponent(search_mat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(btnSearch_1)))
									.addGap(18)
									.addGroup(gl_panel_11.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_11.createSequentialGroup()
											.addGap(18)
											.addComponent(lblDensity))
										.addComponent(pp_combo, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel_11.createParallelGroup(Alignment.TRAILING)
											.addComponent(btnAdd_1)
											.addComponent(density, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
									.addGap(10))
								.addGroup(gl_panel_11.createSequentialGroup()
									.addComponent(btnMaterialAlternatives)
									.addPreferredGap(ComponentPlacement.RELATED)))))
					.addContainerGap(12, Short.MAX_VALUE))
		);
		gl_panel_11.setVerticalGroup(
			gl_panel_11.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_11.createSequentialGroup()
					.addGap(20)
					.addComponent(lblNewLabel_4)
					.addGap(31)
					.addGroup(gl_panel_11.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSearchMaterialName)
						.addComponent(search_mat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSearch_1))
					.addGap(42)
					.addGroup(gl_panel_11.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrollPane_10, GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
						.addGroup(gl_panel_11.createSequentialGroup()
							.addComponent(pp_combo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(lblDensity)
							.addGap(2)
							.addComponent(density, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
							.addComponent(btnAdd_1))
						.addComponent(scrollPane_34, GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnMaterialAlternatives)
					.addGap(32))
		);
		
		table_den = new JTable();
		scrollPane_34.setViewportView(table_den);
Object[] column_den = { "Material Type","Sub-Categories"," Material name" , "Density ( Kg/mm^3 )"};
table_den.setModel(dm_den);
table_den.setBackground(SystemColor.control);
table_den.setShowVerticalLines(false);
table_den.setShowHorizontalLines(false);
		dm_den.setColumnIdentifiers(column_den);
		
		
		mat_table = new JTable();
		scrollPane_10.setViewportView(mat_table);
		Object[] column_ma = { "Instance Name ","Assigned","Weight(Kg)","Volume (mm3)", "Reassign" };
		
		dm_mat.setColumnIdentifiers(column_ma);
		mat_table.setModel(dm_mat);
		
		
		panel_11.setLayout(gl_panel_11);
		tabbedPane.addTab("Material", null, panel_33, null);
			
		JLabel lblModelAlternatives = new JLabel("Material Alternatives");
		lblModelAlternatives.setForeground(Color.RED);
		lblModelAlternatives.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JScrollPane scrollPane_17 = new JScrollPane();
		
		search_altmat = new JTextField();
		search_altmat.setColumns(10);
		
		JLabel lblAlternateInstance = new JLabel("Search alternate material name");
		lblAlternateInstance.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnAdd_2 = new JButton("Add");
		btnAdd_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  String nm = dm_mod.getValueAt(newmat_alt.getSelectedRow(), 0).toString();
					String new_mat = dm_am.getValueAt(table_matalter.getSelectedRow(), 0).toString();
						
						dens =  Double.parseDouble( dm_am.getValueAt(table_matalter.getSelectedRow(), 3).toString());
						 vol = Double.parseDouble(dm_mod.getValueAt(newmat_alt.getSelectedRow(), 3).toString());
						 newalt_wt = (dens * vol) ;
						 System.out.println( + newalt_wt + "weight");
						//String typ = pp_combo.getSelectedItem().toString();
						try{
							
							String query = ("Update macro_ex SET alt_mat =?,alt_dens =?,alt_wt=? where Inst_nm=?");
									
							Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
							 Connection connection84 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
							 Connection connection84 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
							JOptionPane.showMessageDialog(null, "connection13 successful");		
							//String id = dm1.getValueAt(i, 0).toString();
							
							//mat_table.getModel().setValueAt(typ, mat_table.getSelectedRow(), 5);
								PreparedStatement pre = connection84.prepareStatement(query);
								//System.out.println(typ);
							//pst.setString(1, typ);
							pre.setString(1, new_mat);
							pre.setDouble(2, dens);
							pre.setDouble(3, newalt_wt);
							pre.setString(4,nm);

							
							 pre.execute();
							    connection84.close();
							   
							   					
						}
						catch(Exception ex)
						{
							ex.printStackTrace();
						}
						
						
						finally {
							try{
							rs.close(); prepared.close(); }//connection1.close(); }
							catch(Exception e1) { } 
						}

						newmat_alt.getModel().setValueAt(new_mat, newmat_alt.getSelectedRow(), 4);		
						newmat_alt.setValueAt(newalt_wt, newmat_alt.getSelectedRow(), 2);	
			}
		});
		btnAdd_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JScrollPane scrollPane_35 = new JScrollPane();
		
		JButton btnSearch_2 = new JButton("Search");
		btnSearch_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dm_am.setRowCount(0);
				String sql = "Select Type,Name,Sub,density from mat where name like '%"  + search_altmat.getText() +  "%' OR type like '%"  + search_altmat.getText() +  "%' ;";
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					JOptionPane.showMessageDialog(null, "connection7 successful");		
						
						PreparedStatement pst = connection16.prepareStatement(sql);
					    ResultSet rs1 = pst.executeQuery();
					    
					    while(rs1.next())
					    {
					    	String mat_nm = rs1.getString(2);
					    	String mat_typ = rs1.getString(1);
					    	String sub= rs1.getString(3);
					    	String den = rs1.getString(4);
					    	Object[] row = {mat_nm , mat_typ , sub,den};
					    	dm_am.addRow(row);
					    	//System.out.print("Yes");
					    	
					    }
					    connection16.close();
					   
					  }
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				finally {
					try{
					rs.close(); prepared.close(); }//connection1.close(); }
					catch(Exception e1) { } 
				}

			}
		});
		GroupLayout gl_panel_32 = new GroupLayout(panel_32);
		gl_panel_32.setHorizontalGroup(
			gl_panel_32.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_32.createSequentialGroup()
					.addGroup(gl_panel_32.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_32.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblModelAlternatives, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_32.createSequentialGroup()
							.addGap(45)
							.addGroup(gl_panel_32.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_32.createSequentialGroup()
									.addComponent(lblAlternateInstance)
									.addGap(35)
									.addComponent(search_altmat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(btnSearch_2))
								.addGroup(gl_panel_32.createSequentialGroup()
									.addComponent(scrollPane_17, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(scrollPane_35, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
									.addGap(47)
									.addComponent(btnAdd_2)))))
					.addContainerGap(59, Short.MAX_VALUE))
		);
		gl_panel_32.setVerticalGroup(
			gl_panel_32.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_32.createSequentialGroup()
					.addGroup(gl_panel_32.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_32.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblModelAlternatives, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addGap(32)
							.addGroup(gl_panel_32.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblAlternateInstance)
								.addComponent(search_altmat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnSearch_2))
							.addGap(34)
							.addGroup(gl_panel_32.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_32.createSequentialGroup()
									.addComponent(scrollPane_17, GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 45, Short.MAX_VALUE))
								.addComponent(scrollPane_35, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)))
						.addGroup(gl_panel_32.createSequentialGroup()
							.addContainerGap(385, Short.MAX_VALUE)
							.addComponent(btnAdd_2)))
					.addGap(67))
		);
		
		table_matalter = new JTable();
		scrollPane_35.setViewportView(table_matalter);
		table_matalter.setModel(dm_am);
Object[] column_matalt = {"Material Type","Sub-Categories"," Material name" , "Density ( Kg/mm^3 )"};
		
		dm_am.setColumnIdentifiers(column_matalt);
		table_matalter.setBackground(SystemColor.control);
		table_matalter.setShowVerticalLines(false);
		table_matalter.setShowHorizontalLines(false);
		
		newmat_alt = new JTable();
		scrollPane_17.setViewportView(newmat_alt);
		panel_32.setLayout(gl_panel_32);
		newmat_alt.setModel(dm_mod);
		newmat_alt.setBackground(SystemColor.control);
		newmat_alt.setShowVerticalLines(false);
		newmat_alt.setShowHorizontalLines(false);
		JPanel panel_15 = new JPanel();
		tabbedPane.addTab("Process", null, panel_15, null);
		panel_15.setLayout(new CardLayout(0, 0));
		panel_15.add(panel_18, "p18");
		
		
		panel_18.setLayout(null);
		panel_18.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.GRAY, Color.DARK_GRAY));
		panel_18.setBackground(new Color(224,224,225));
		
		JLabel label_2 = new JLabel("Process");
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_2.setBounds(10, 0, 95, 40);
		panel_18.add(label_2);
		
		JLabel label_3 = new JLabel("Upload Processes");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_3.setBounds(31, 51, 140, 35);
		panel_18.add(label_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBorder(new MatteBorder(2,2,2,2,new Color(209,209,209)));
		textField_4.setBackground(new Color(221, 221, 221));
		textField_4.setBounds(172, 60, 392, 20);
		panel_18.add(textField_4);
		
		JButton button_6 = new JButton("Upload");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_15.removeAll();
				panel_15.repaint();
				panel_15.revalidate();
				panel_15.add(panel_16);
				panel_16.setVisible(true);
				
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
				 Connection connection3 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
				 Connection connection3 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				// JOptionPane.showMessageDialog(null, "connection1 successful");
				
			
				BufferedReader br = new BufferedReader(new FileReader(filename1));
				String line ;
				while((line = br.readLine()) != null){
					String[]value = line.split(",");
					String insertTableSQL =( "INSERT or REPLACE INTO Process_lib"
							+ "( Process_id, Process_name) VALUES"
							+ "(?,?)");
				
				prepared = connection3.prepareStatement(insertTableSQL);
				prepared.setString(1, value[0]);
				prepared.setString(2, value[1]);
				

				// execute insert SQL statement
				prepared.executeUpdate();
				}
				
				System.out.println("Record is inserted into Process_lib table!");
				connection3.close();
				
		    } catch ( Exception e1 ) {
		      System.err.println( e1.getClass().getName() + ": " + e1.getMessage() );
		      JOptionPane.showMessageDialog(null, "Enter the processes before retrieving");
		     e1.printStackTrace();
		    
		    }
			finally {
				try{
				rs.close(); prepared.close(); }//connection1.close(); }
				catch(Exception e1) { } 
			}
				
				
				
				
				/*try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
				 Connection connection7 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
				 Connection connection7 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				JOptionPane.showMessageDialog(null, "connection7 successful");		
					String query =( "SELECT * FROM Process_lib");
					PreparedStatement pst = connection7.prepareStatement(query);
				    ResultSet rs1 = pst.executeQuery();
				   table.setModel(DbUtils.resultSetToTableModel(rs1));
				 
				    System.out.println("data retrieved");
				connection7.close();
						   
				}
				catch ( Exception e1 )
				{
		      System.err.println( e1.getClass().getName() + ": " + e1.getMessage() );
		     e1.printStackTrace();
		    		    }
			finally {
				try{
				rs.close(); prepared.close(); }//connection1.close(); }
				catch(Exception e1) { } }
				
			}*/
				/*DefaultTableModel de = new DefaultTableModel();
				de.addColumn("Id");
				de.addColumn("Process");
				
				try{
			    	data1=new Object[rows][2];
					
					Object[] Colheads={"Id","Name"};
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
				 Connection connection7 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
				 Connection connection7 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				//JOptionPane.showMessageDialog(null, "connection7 successful");		
					String query =( "Select * from Process_lib");
				  
			    	while(rs.next())
			    	{
			    	 
			    	  
			    	  String id = rs.getString(1);
			    	String name = rs.getString(2);
			    	 
			    	  rows++;
			    	
			    	}  
			    	  ResultSet rs = prepared.executeQuery(query);
					for(int i1=0;i1<rows;i1++)
					{
							rs.next();
							for(int j1=0;j1<8;j1++)
							{
								data1[i1][j1]=rs.getString(j1+1);
							}
					}
					 table_1=new JTable(data1,Colheads);
					
				}
				
				catch ( Exception e1 ) {
				      System.err.println( e1.getClass().getName() + ": " + e1.getMessage() );
				     e1.printStackTrace();
				    
				    }
					finally {
						try{
						rs.close(); prepared.close(); }//connection1.close(); }
						catch(Exception e1) { } }*/
			}
		});
		
		
		button_6.setOpaque(false);
		button_6.setForeground(Color.DARK_GRAY);
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_6.setBackground(new Color(132, 132, 132));
		button_6.setBounds(574, 55, 93, 27);
		panel_18.add(button_6);
		
		JButton button_7 = new JButton("Template File");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD
				 File file = new File(startDir+"\\templates\\Process_lib.csv");
=======
				 File file = new File("C:\\Users\\Nitesh\\Desktop\\Process_lib.csv");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				 filename1 = file.getAbsolutePath();
				        try {
				        	//Desktop dt = Desktop.getDesktop();
				            Desktop.getDesktop().open(file);
				            textField_4.setText(file.getAbsolutePath());
				        } catch (IOException e1) {
				            e1.printStackTrace();
				        }
				    
			}
		});
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_7.setBounds(32, 126, 168, 23);
		panel_18.add(button_7);
		panel_16.setToolTipText("table here");
		
		
		panel_15.add(panel_16, "p16");
		panel_16.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.GRAY, Color.DARK_GRAY));
		panel_16.setBackground(new Color(224,224,225));
		
		
		JButton btnNewButton = new JButton("Assign Process Sequence");
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblPreceedingProcess = new JLabel("Assign Preceeding and Succeeding Processes");
		lblPreceedingProcess.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setVisible(false);
		Object[] columnin = {"Id","Process","Input","Output"};
		DefaultTableModel dm_in = new DefaultTableModel();
		dm_in.setColumnIdentifiers(columnin);
		
		JPanel panel_48 = new JPanel();
		panel_15.add(panel_48, "name_1318609894237543");
		
		JScrollPane scrollPane_33 = new JScrollPane();
		
		JComboBox<String> pro_combo = new JComboBox<String>();
		JPanel panel_30 = new JPanel();
		JButton btnUploadInputoutput = new JButton("Upload Input-Output");
		btnUploadInputoutput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_15.removeAll();
				panel_15.repaint();
				panel_15.revalidate();
				panel_15.add(panel_30);
				panel_30.setVisible(true);
				//For input  output
				String sql = "Select Process_id,Process_name from Process_lib";
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection40 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection40 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					JOptionPane.showMessageDialog(null, "connection40 successful");		
						
						PreparedStatement pst = connection40.prepareStatement(sql);
					    ResultSet rs1 = pst.executeQuery();
					    
					    while(rs1.next())
					    {
					    	String id = rs1.getString(1);
					    	String process = rs1.getString(2);
					    	
					    	Object[] row = {id,process};
					    	dm_in.addRow(row);
					    						    	
					    }
					    dm_in.removeRow(0);
					    connection40.close();

					  }
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				
			
		//for storing sequence
		
				
			
			}
		});
		
		JButton btnAssign_3 = new JButton("Assign");
		btnAssign_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int part = pro_combo.getSelectedIndex();
				String part_name = pro_combo.getSelectedItem().toString();
				String pro_id = dm_prt.getValueAt(pr_tr.getSelectedRow(), 0).toString();
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection41 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection41 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				
					
					String insertTable =( "UPDATE Process_lib SET Part_nm = ? where Process_id = ?" );
							
					prepared = connection41.prepareStatement(insertTable);
									
					prepared.setInt(1,part );
					prepared.setString(2,pro_id);
									
					prepared.executeUpdate();
					pr_tr.getModel().setValueAt(pro_combo.getSelectedItem().toString(), pr_tr.getSelectedRow(), 2);
					
					System.out.println("Record is inserted into IO Table!");
					connection41.close();
					
					
			    } catch ( Exception e1 ) {
			      System.err.println( e1.getClass().getName() + ": " + e1.getMessage() );
			     e1.printStackTrace();
			    
			    }
				finally {
					try{
					rs.close(); prepared.close(); }//connection1.close(); }
					catch(Exception e1) { } }
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection42 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection42 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				
					
					String insertTable1 =( "UPDATE Process_lib SET Part = ? where Process_id = ?" );
							
					prepared = connection42.prepareStatement(insertTable1);
									
					prepared.setString(1,part_name );
					prepared.setString(2,pro_id);
									
					prepared.executeUpdate();
					pr_tr.getModel().setValueAt(pro_combo.getSelectedItem().toString(), pr_tr.getSelectedRow(), 2);
					
					System.out.println("Record is inserted into IO Table!");
					connection42.close();
					
					
			    } catch ( Exception e1 ) {
			      System.err.println( e1.getClass().getName() + ": " + e1.getMessage() );
			     e1.printStackTrace();
			    
			    }
				finally {
					try{
					rs.close(); prepared.close(); }//connection1.close(); }
					catch(Exception e1) { } }
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection141 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection141 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				
					
					String updateclass =( "UPDATE process_lib SET class = (SELECT bom.class FROM bom WHERE process_lib.part_nm = bom.part_id);" );
							
					prepared = connection141.prepareStatement(updateclass);									
					prepared.executeUpdate();
					
					System.out.println("class updated in process_lib!");
					connection141.close();
					
					
			    } catch ( Exception e1 ) {
			      System.err.println( e1.getClass().getName() + ": " + e1.getMessage() );
			     e1.printStackTrace();
			    
			    }
				finally {
					try{
					rs.close(); prepared.close(); }//connection1.close(); }
					catch(Exception e1) { } }
			}
		});
		GroupLayout gl_panel_48 = new GroupLayout(panel_48);
		gl_panel_48.setHorizontalGroup(
			gl_panel_48.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_48.createSequentialGroup()
					.addGap(26)
					.addComponent(scrollPane_33, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_48.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_48.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnUploadInputoutput)
							.addGap(83))
						.addGroup(Alignment.LEADING, gl_panel_48.createSequentialGroup()
							.addGap(132)
							.addGroup(gl_panel_48.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnAssign_3)
								.addComponent(pro_combo, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(190, Short.MAX_VALUE))))
		);
		gl_panel_48.setVerticalGroup(
			gl_panel_48.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_48.createSequentialGroup()
					.addGap(77)
					.addComponent(pro_combo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
					.addComponent(btnAssign_3)
					.addGap(110)
					.addComponent(btnUploadInputoutput)
					.addGap(71))
				.addGroup(gl_panel_48.createSequentialGroup()
					.addGap(65)
					.addComponent(scrollPane_33, GroupLayout.PREFERRED_SIZE, 353, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(59, Short.MAX_VALUE))
		);
		
		pr_tr = new JTable();
		Object[] column_prt = {"Id","Process"," Assigned Part "};
		
		dm_prt.setColumnIdentifiers(column_prt);
		pr_tr.setModel(dm_prt);
		pr_tr.setBackground(SystemColor.control);
		pr_tr.setShowVerticalLines(false);
		pr_tr.setShowHorizontalLines(false);
		scrollPane_33.setViewportView(pr_tr);
		panel_48.setLayout(gl_panel_48);
		
		panel_15.add(panel_30, "p30");
		
		JLabel lblInputoutput = new JLabel("Input-Output");
		lblInputoutput.setForeground(Color.RED);
		lblInputoutput.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblUploadArticles = new JLabel("Upload Input-Output");
		lblUploadArticles.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton button_14 = new JButton("Template File");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD
				File file = new File(startDir+"\\templates\\IO_lib.csv");
=======
				File file = new File("C:\\Users\\Nitesh\\Desktop\\IO_lib.csv");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				 filename1 = file.getAbsolutePath();
				        try {
				        	//Desktop dt = Desktop.getDesktop();
				            Desktop.getDesktop().open(file);
				            io.setText(file.getAbsolutePath());
				        } catch (IOException e1) {
				            e1.printStackTrace();
				        }
				    
			}
			
		});
		button_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		io = new JTextField();
		io.setEditable(false);
		io.setColumns(10);
		io.setBorder(new MatteBorder(2,2,2,2,new Color(209,209,209)));
		io.setBackground(new Color(221, 221, 221));
JComboBox<String> inp_combo = new JComboBox<String>();
inp_combo.insertItemAt("---None---", 0);
		JComboBox<String> out_combo = new JComboBox<String>();
		out_combo.insertItemAt("---None---", 0);
		JButton button_15 = new JButton("Upload");
		
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_15.removeAll();
				panel_15.repaint();
				panel_15.revalidate();
				panel_15.add(panel_17);
				panel_17.setVisible(true);
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
				 Connection connection3 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
				 Connection connection3 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				// JOptionPane.showMessageDialog(null, "connection1 successful");
						
				BufferedReader br = new BufferedReader(new FileReader(filename1));
				String line ;
				while((line = br.readLine()) != null){
					String[]value = line.split(",");
					String insertTableSQL =( "INSERT or REPLACE INTO IO_name"
							+ "( io_id, io_name) VALUES"
							+ "(?,?)");
				
				prepared = connection3.prepareStatement(insertTableSQL);
				prepared.setString(1, value[0]);
				prepared.setString(2, value[1]);
				
				
				// execute insert SQL statement
				prepared.executeUpdate();
				}
				
				System.out.println("Record is inserted into IO_name table!");
				connection3.close();
				
		    } catch ( Exception e1 ) {
		      System.err.println( e1.getClass().getName() + ": " + e1.getMessage() );
		      JOptionPane.showMessageDialog(null, "Enter the alternatives before leaving");
		     e1.printStackTrace();
		    
		    }
			finally {
				try{
				rs.close(); prepared.close(); }//connection1.close(); }
				catch(Exception e1) { } 
			}
			
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection50 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection50 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					// JOptionPane.showMessageDialog(null, "connection6 successful");
					 //connection = sqlite_conn.dbConnector();
					String sql = "SELECT DISTINCT io_name FROM io_name ";
					prepared = connection50.prepareStatement(sql);
					rs = prepared.executeQuery();
					
					while (rs.next())
					{
						inp_combo.addItem(rs.getString("io_name"));
						 
					}
					connection50.close();
				}catch(Exception e2){
					JOptionPane.showMessageDialog(null, e2);
				}
				finally {
					try{
					rs.close(); prepared.close(); }
					catch(Exception e1) { } }
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection51 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection51 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					// JOptionPane.showMessageDialog(null, "connection6 successful");
					 //connection = sqlite_conn.dbConnector();
					String sql = "SELECT DISTINCT io_name FROM io_name ";
					prepared = connection51.prepareStatement(sql);
					rs = prepared.executeQuery();
					
					while (rs.next())
					{
						out_combo.addItem(rs.getString("io_name"));
						 
					}
					connection51.close();
				}catch(Exception e2){
					JOptionPane.showMessageDialog(null, e2);
				}
				finally {
					try{
					rs.close(); prepared.close(); }
					catch(Exception e1) { } }
			}
		});
		button_15.setOpaque(false);
		button_15.setForeground(Color.DARK_GRAY);
		button_15.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_15.setBackground(new Color(132, 132, 132));
		GroupLayout gl_panel_30 = new GroupLayout(panel_30);
		gl_panel_30.setHorizontalGroup(
			gl_panel_30.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_30.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_30.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_30.createSequentialGroup()
							.addComponent(lblUploadArticles, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(io, GroupLayout.PREFERRED_SIZE, 392, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblInputoutput, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(152, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel_30.createSequentialGroup()
					.addGap(51)
					.addComponent(button_14, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 320, Short.MAX_VALUE)
					.addComponent(button_15, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addGap(86))
		);
		gl_panel_30.setVerticalGroup(
			gl_panel_30.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_30.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblInputoutput, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addGroup(gl_panel_30.createParallelGroup(Alignment.BASELINE)
						.addComponent(io, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblUploadArticles, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel_30.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_30.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_15, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_30.createSequentialGroup()
							.addGap(30)
							.addComponent(button_14, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(245, Short.MAX_VALUE))
		);
		panel_30.setLayout(gl_panel_30);
		JComboBox<String> pre_pro = new JComboBox<String>();
		JComboBox<String> suc_pro = new JComboBox<String>();
		
		
		pre_pro.setVisible(false);
		//pre_pro.addItem(" ");
		DefaultComboBoxModel<String> dc = new DefaultComboBoxModel<>();
		/*pre_pro.setModel(dc);
         dc.addElement("--None--",0);*/
		pre_pro.insertItemAt("--None--", 0);
		JLabel lblPreceedingProcess_1 = new JLabel("Preceeding Process");
		lblPreceedingProcess_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPreceedingProcess_1.setVisible(false);
		JLabel lblSucceedingprocess = new JLabel("Succeeding Process");
		lblSucceedingprocess.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSucceedingprocess.setVisible(false);
		
		suc_pro.setVisible(false);
		suc_pro.insertItemAt("--None--", 0);
		JButton btnNewButton_5 = new JButton("Add");
		btnNewButton_5.setVisible(false);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name =  seq_table.getValueAt(seq_table.getSelectedRow(), 1).toString();
				String id =  seq_table.getValueAt(seq_table.getSelectedRow(), 0).toString();
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection1 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection1 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					// JOptionPane.showMessageDialog(null, "connection1 successful");
					//input from comboBox
					String insertTableSQL =( "INSERT or Replace INTO Process_seq "
							+ "( Id, Name, Pre_Pro , Suc_pro) VALUES"
							+ "(?,?,?,?)");
					prepared = connection1.prepareStatement(insertTableSQL);
										
					if(pre_pro.getSelectedIndex() > 0)
					{
						inp = pre_pro.getSelectedItem().toString();
					}
					else if(pre_pro.getSelectedIndex() == 0)
					{
						inp = " ";
					}
					if(suc_pro.getSelectedIndex() > 0)
					{
						 out = suc_pro.getSelectedItem().toString();
					}
					else if(suc_pro.getSelectedIndex() == 0)
					{
						out = " ";
					}
				prepared.setString(1, id);
			prepared.setString(2, name);
			prepared.setString(3, inp);
		prepared.setString(4, out);
			prepared.executeUpdate();
			seq_table.getModel().setValueAt(inp, seq_table.getSelectedRow(), 2);
			seq_table.getModel().setValueAt(out, seq_table.getSelectedRow(), 3);
				System.out.println("Record is inserted into Process_seq table!");
					connection1.close();
			    } catch ( Exception e1 ) {
			      System.err.println( e1.getClass().getName() + ": " + e1.getMessage() );
			     e1.printStackTrace();
			    
			    }
				finally {
					try{
					rs.close(); prepared.close(); }//connection1.close(); }
					catch(Exception e1) { } }
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnAssignToProduct = new JButton("Assign to Product Tree");
		btnAssignToProduct.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAssignToProduct.setVisible(false);
		btnAssignToProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_15.removeAll();
				panel_15.repaint();
				panel_15.revalidate();
				panel_15.add(panel_48);
				panel_48.setVisible(true);
				
				String sql = "Select Process_id,Process_name from Process_lib";
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection40 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection40 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection40 successful");		
						
						PreparedStatement pst = connection40.prepareStatement(sql);
					    ResultSet rs1 = pst.executeQuery();
					    
					    while(rs1.next())
					    {
					    	String id = rs1.getString(1);
					    	String process = rs1.getString(2);
					    	
					    	Object[] row = {id,process};
					    	dm_prt.addRow(row);
					    						    	
					    }
					    dm_prt.removeRow(0);
					    connection40.close();

					  }
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection50 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection50 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					// JOptionPane.showMessageDialog(null, "connection6 successful");
					 //connection = sqlite_conn.dbConnector();
					String sql_pr = "SELECT Inst_nm FROM macro_ex  ";
					// String sql_pr = "SELECT Part_name FROM bom where class =2 ";
					prepared = connection50.prepareStatement(sql_pr);
					rs = prepared.executeQuery();
					
					while (rs.next())
					{
						pro_combo.addItem(rs.getString("Inst_nm"));
						 
					}
					connection50.close();
				}catch(Exception e2){
					JOptionPane.showMessageDialog(null, e2);
				}
				finally {
					try{
					rs.close(); prepared.close(); }
					catch(Exception e1) { } }
			}
		});
	
		GroupLayout gl_panel_16 = new GroupLayout(panel_16);
		gl_panel_16.setHorizontalGroup(
			gl_panel_16.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_16.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_16.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPreceedingProcess)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_16.createSequentialGroup()
							.addGroup(gl_panel_16.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_16.createSequentialGroup()
									.addGap(25)
									.addGroup(gl_panel_16.createParallelGroup(Alignment.LEADING)
										.addComponent(lblPreceedingProcess_1)
										.addComponent(lblSucceedingprocess))
									.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
									.addGroup(gl_panel_16.createParallelGroup(Alignment.LEADING)
										.addComponent(suc_pro, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
										.addComponent(pre_pro, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
									.addGap(35))
								.addGroup(gl_panel_16.createSequentialGroup()
									.addGap(40)
									.addGroup(gl_panel_16.createParallelGroup(Alignment.LEADING)
										.addComponent(btnAssignToProduct, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnNewButton_5, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
									.addGap(75)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE)
							.addGap(65)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_16.setVerticalGroup(
			gl_panel_16.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_16.createSequentialGroup()
					.addGap(16)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblPreceedingProcess)
					.addGroup(gl_panel_16.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_16.createSequentialGroup()
							.addGap(57)
							.addGroup(gl_panel_16.createParallelGroup(Alignment.BASELINE)
								.addComponent(pre_pro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPreceedingProcess_1))
							.addGap(44)
							.addGroup(gl_panel_16.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblSucceedingprocess, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
								.addComponent(suc_pro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnNewButton_5)
							.addGap(18)
							.addComponent(btnAssignToProduct)
							.addGap(137))
						.addGroup(gl_panel_16.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		
		seq_table = new JTable();
		scrollPane_2.setViewportView(seq_table);
		
		Object[] columns = {"Id","Process","Preceeding Process","Succeeding Process"};
		DefaultTableModel dm = new DefaultTableModel();
		dm.setColumnIdentifiers(columns);
		seq_table.setModel(dm);
		seq_table.setBackground(SystemColor.control);
		seq_table.setShowVerticalLines(false);
		seq_table.setShowHorizontalLines(false);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setVisible(false);
			//	btnUploadSequence.setVisible(true);
				lblPreceedingProcess_1.setVisible(true);
				lblSucceedingprocess.setVisible(true);
				pre_pro.setVisible(true);
				suc_pro.setVisible(true);
				btnNewButton_5.setVisible(true);
				btnAssignToProduct.setVisible(true);
				String sql = "Select * from Process_lib";
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection12 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection12 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection12 successful");		
						
						PreparedStatement pst = connection12.prepareStatement(sql);
					    ResultSet rs1 = pst.executeQuery();
					    
					    while(rs1.next())
					    {
					    	String id = rs1.getString(1);
					    	String process = rs1.getString(2);
					    	
					    	Object[] row = {id,process};
					    	dm.addRow(row);
					    	System.out.print("Yes");
					    	
					    }
					    connection12.close();
dm.removeRow(0);
					  }
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection6 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection6 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					// JOptionPane.showMessageDialog(null, "connection6 successful");
					 //connection = sqlite_conn.dbConnector();
					String sql1 = "SELECT DISTINCT Process_id from process_lib ";
					prepared = connection6.prepareStatement(sql1);
					rs = prepared.executeQuery();
					
					while (rs.next())
					{
						pre_pro.addItem(rs.getString("Process_id"));
										}
					connection6.close();
				}catch(Exception e2){
					JOptionPane.showMessageDialog(null, e2);
				}
				finally {
					try{
					rs.close(); prepared.close();}
					catch(Exception e1) { } }
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection6 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection6 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					// JOptionPane.showMessageDialog(null, "connection6 successful");
					 //connection = sqlite_conn.dbConnector();
					String sql2 = "SELECT DISTINCT Process_id from process_lib";
					prepared = connection6.prepareStatement(sql2);
					rs = prepared.executeQuery();
					
					while (rs.next())
					{
						suc_pro.addItem(rs.getString("Process_id"));
					}
					connection6.close();
				}catch(Exception e2){
					JOptionPane.showMessageDialog(null, e2);
				}
				finally {
					try{
					rs.close(); prepared.close(); }
					catch(Exception e1) { } }
						
			}
		

			});
		
		panel_16.setLayout(gl_panel_16);
		lblPreceedingProcess.setVisible(false);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollPane_2.setVisible(true);
				
				lblPreceedingProcess.setVisible(true);
			}});
		
	
				
				
			
			
	
		panel_17.setBackground(new Color(224,224,225));
		
		panel_15.add(panel_17, "p17");
		
		JLabel label_4 = new JLabel("Input-Output");
		label_4.setForeground(Color.RED);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		JLabel lblOutput = new JLabel("Output");
		lblOutput.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
JCheckBox Input_checkbox = new JCheckBox("Is the Input locally sourced?");
		
		JCheckBox Output_checkbox = new JCheckBox("Is the output locally discarded?");
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection41 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection41 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					// JOptionPane.showMessageDialog(null, "connection1 successful");
					
					String insertTableSQL =( "INSERT or Replace INTO IO_lib"
							+ "(Pro_id,Pro_name, Inp_name , Out_name) VALUES"
							+ "(?,?,?,?)");
					prepared = connection41.prepareStatement(insertTableSQL);
					String pro_id = dm_in.getValueAt(table_in.getSelectedRow(), 0).toString();
					String pro_name = dm_in.getValueAt(table_in.getSelectedRow(), 1).toString();
					//String inp = inp_combo.getSelectedItem().toString();
							//String out = out_combo.getSelectedItem().toString();
					String inp1 = null; String out1 = null;
							if(inp_combo.getSelectedIndex() > 0)
							{
								inp1 = inp_combo.getSelectedItem().toString();
							}
							else if(inp_combo.getSelectedIndex() == 0)
							{
								inp1 = " ";
							}
							if(out_combo.getSelectedIndex() > 0)
							{
								 out1 = out_combo.getSelectedItem().toString();
							}
							else if(out_combo.getSelectedIndex() == 0)
							{
								out1 = " ";
							}
							
					prepared.setString(1,pro_id );
					prepared.setString(2,  pro_name);
					prepared.setString(3, inp1);
					prepared.setString(4,out1);
					
					// execute insert SQL statement
					prepared.executeUpdate();
					table_in.getModel().setValueAt(inp1, table_in.getSelectedRow(), 2);
					table_in.getModel().setValueAt(out1, table_in.getSelectedRow(), 3);
					System.out.println("Record is inserted into IO Table!");
					connection41.close();
					
					
			    } catch ( Exception e1 ) {
			      System.err.println( e1.getClass().getName() + ": " + e1.getMessage() );
			     e1.printStackTrace();
			    
			    }
				finally {
					try{
					rs.close(); prepared.close(); }//connection1.close(); }
					catch(Exception e1) { } }
			
			if (Input_checkbox.isSelected()== true)
			{
				try{					
					String query = ("Update Process_lib SET Transport='2' where Process_id = ? ");
						
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection24 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection24 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection13 successful");		
					//String id = dm1.getValueAt(i, 0).toString();
					
					//table_3.getModel().setValueAt(selected.toString(), table_3.getSelectedRow(), 2);
						PreparedStatement pst = connection24.prepareStatement(query);
						String pid = table_in.getValueAt(table_in.getSelectedRow(), 0).toString();
						pst.setString(1, pid);
						/*
					pst.setInt(1, lc_id);
					pst.setString(2,id);
					    */
							
						
					  pst.execute();
					    connection24.close();
					  
					   	System.out.println("Here");				
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
				if (Output_checkbox.isSelected()== true)
				{
					try{					
						String query = ("Update Process_lib SET Transport='3' where Process_id = ? ");
							
						Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
						 Connection connection24 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
						 Connection connection24 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
						//JOptionPane.showMessageDialog(null, "connection13 successful");		
						//String id = dm1.getValueAt(i, 0).toString();
						
						//table_3.getModel().setValueAt(selected.toString(), table_3.getSelectedRow(), 2);
							PreparedStatement pst = connection24.prepareStatement(query);
							String pid = table_in.getValueAt(table_in.getSelectedRow(), 0).toString();
							pst.setString(1, pid);
							/*
						pst.setInt(1, lc_id);
						pst.setString(2,id);
						    */
								
							
						  pst.execute();
						    connection24.close();
						  
						   	System.out.println("Here");				
					}
					catch(Exception ex)
					{
						ex.printStackTrace();
					}
				Input_checkbox.setSelected(false);
				Output_checkbox.setSelected(false);
			}
			}
			
		});
		
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JPanel panel_29 = new JPanel();
		panel_15.add(panel_29, "p29");
		
		JButton btnNewButton_4 = new JButton("Process Alternatives");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_15.removeAll();
				panel_15.repaint();
				panel_15.revalidate();
				panel_15.add(panel_29);
				panel_29.setVisible(true);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_5 = new JLabel("Input");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		
		
		
		
		GroupLayout gl_panel_17 = new GroupLayout(panel_17);
		gl_panel_17.setHorizontalGroup(
			gl_panel_17.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_17.createSequentialGroup()
					.addGroup(gl_panel_17.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_panel_17.createSequentialGroup()
							.addContainerGap()
							.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, gl_panel_17.createSequentialGroup()
							.addContainerGap()
							.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(inp_combo, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, gl_panel_17.createSequentialGroup()
							.addGap(44)
							.addComponent(btnAdd))
						.addGroup(gl_panel_17.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_17.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel_17.createSequentialGroup()
									.addComponent(lblOutput, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(out_combo, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))
								.addComponent(Output_checkbox, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(Input_checkbox, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addPreferredGap(ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 415, GroupLayout.PREFERRED_SIZE)
					.addGap(32))
				.addGroup(gl_panel_17.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(496, Short.MAX_VALUE))
		);
		gl_panel_17.setVerticalGroup(
			gl_panel_17.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_17.createSequentialGroup()
					.addGroup(gl_panel_17.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_17.createSequentialGroup()
							.addContainerGap()
							.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addGap(51)
							.addGroup(gl_panel_17.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addComponent(inp_combo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(Input_checkbox)
							.addGap(12)
							.addGroup(gl_panel_17.createParallelGroup(Alignment.BASELINE)
								.addComponent(out_combo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblOutput, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(Output_checkbox))
						.addGroup(gl_panel_17.createSequentialGroup()
							.addGap(68)
							.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
					.addComponent(btnNewButton_4)
					.addGap(107))
				.addGroup(Alignment.TRAILING, gl_panel_17.createSequentialGroup()
					.addContainerGap(307, Short.MAX_VALUE)
					.addComponent(btnAdd)
					.addGap(145))
		);
		table_in = new JTable();
		scrollPane_1.setViewportView(table_in);
		table_in.setModel(dm_in);
		table_in.setBackground(SystemColor.control);
		table_in.setShowVerticalLines(false);
		table_in.setShowHorizontalLines(false);
		panel_17.setLayout(gl_panel_17);
		
		
		
		JLabel lblProcessAlternatives = new JLabel("Process Alternatives");
		lblProcessAlternatives.setForeground(Color.RED);
		lblProcessAlternatives.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblUploadAlternativeProcesses = new JLabel("Upload Alternative Processes");
		lblUploadAlternativeProcesses.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton button_8 = new JButton("Template File");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
<<<<<<< HEAD
				File file = new File(startDir+"\\templates\\Pro_alt.csv");
=======
				File file = new File("C:\\Users\\Nitesh\\Desktop\\Pro_alt.csv");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				 filename1 = file.getAbsolutePath();
				        try {
				        	//Desktop dt = Desktop.getDesktop();
				            Desktop.getDesktop().open(file);
				            textField_8.setText(file.getAbsolutePath());
				        } catch (IOException e1) {
				            e1.printStackTrace();
				        }
				    
			}
			
		});
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBorder(new MatteBorder(2,2,2,2,new Color(209,209,209)));
		textField_8.setBackground(new Color(221, 221, 221));
		JPanel panel_34 = new JPanel();
		panel_15.add(panel_34, "name_876121011966497");
		
		JLabel lblNewLabel_10 = new JLabel("Assign Alternatives to process");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JScrollPane scrollPane_11 = new JScrollPane();
		
		JComboBox pro_alt_combo = new JComboBox();
		pro_alt = new JTable();
		scrollPane_11.setViewportView(pro_alt);
		DefaultTableModel dm_alt = new DefaultTableModel();
		Object[] columnpr = {"Id","Process","Alternate"};
		pro_alt.setModel(dm_alt);
		dm_alt.setColumnIdentifiers(columnpr);
		JButton btnNewButton_6 = new JButton("Add");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection41 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection41 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					// JOptionPane.showMessageDialog(null, "connection1 successful");
					
					String insertTableSQL =( "INSERT or Replace INTO proalt_assign"
							+ "(P_id,P_name,alt_name) VALUES"
							+ "(?,?,?)");
					prepared = connection41.prepareStatement(insertTableSQL);
					String pro_id = dm_alt.getValueAt(pro_alt.getSelectedRow(), 0).toString();
					String pro_name = dm_alt.getValueAt(pro_alt.getSelectedRow(), 1).toString();
					String inp = pro_alt_combo.getSelectedItem().toString();
							//String out = out_combo.getSelectedItem().toString();
					prepared.setString(1,pro_id );
					prepared.setString(2,  pro_name);
					prepared.setString(3, inp);
					//prepared.setString(4,out);
					
					// execute insert SQL statement
					prepared.executeUpdate();
					pro_alt.getModel().setValueAt(inp, pro_alt.getSelectedRow(), 2);
					//table_in.getModel().setValueAt(out, table_in.getSelectedRow(), 3);
					System.out.println("Record is inserted into alt_assign Table!");
					connection41.close();
					
					
			    } catch ( Exception e1 ) {
			      System.err.println( e1.getClass().getName() + ": " + e1.getMessage() );
			     e1.printStackTrace();
			    
			    }
				finally {
					try{
					rs.close(); prepared.close(); }//connection1.close(); }
					catch(Exception e1) { } }
			}
			
		});
		GroupLayout gl_panel_34 = new GroupLayout(panel_34);
		gl_panel_34.setHorizontalGroup(
			gl_panel_34.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_34.createSequentialGroup()
					.addGap(34)
					.addGroup(gl_panel_34.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_34.createSequentialGroup()
							.addComponent(scrollPane_11, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_panel_34.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel_34.createSequentialGroup()
									.addGap(52)
									.addComponent(pro_alt_combo, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.TRAILING, gl_panel_34.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnNewButton_6)
									.addGap(26))))
						.addComponent(lblNewLabel_10))
					.addContainerGap(46, Short.MAX_VALUE))
		);
		gl_panel_34.setVerticalGroup(
			gl_panel_34.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_34.createSequentialGroup()
					.addGroup(gl_panel_34.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_34.createSequentialGroup()
							.addGap(25)
							.addComponent(lblNewLabel_10)
							.addGap(43)
							.addComponent(scrollPane_11, GroupLayout.PREFERRED_SIZE, 353, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_34.createSequentialGroup()
							.addGap(118)
							.addComponent(pro_alt_combo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(122)
							.addComponent(btnNewButton_6)))
					.addContainerGap(37, Short.MAX_VALUE))
		);
		
		
	
		panel_34.setLayout(gl_panel_34);
		
		JButton button_13 = new JButton("Upload");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_15.removeAll();
				panel_15.repaint();
				panel_15.revalidate();
				panel_15.add(panel_34);
				panel_34.setVisible(true);
				
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
				 Connection connection3 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
				 Connection connection3 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				// JOptionPane.showMessageDialog(null, "connection1 successful");
				
			
				BufferedReader br = new BufferedReader(new FileReader(filename1));
				String line ;
				while((line = br.readLine()) != null){
					String[]value = line.split(",");
					String insertTableSQL =( "INSERT or REPLACE INTO Pro_alt"
							+ "( P_id,P_name) VALUES"
							+ "(?,?)");
				
				prepared = connection3.prepareStatement(insertTableSQL);
				prepared.setString(1, value[0]);
				prepared.setString(2, value[1]);
				
				
				// execute insert SQL statement
				prepared.executeUpdate();
				}
				
				System.out.println("Record is inserted into Process_alt table!");
				connection3.close();
				
		    } catch ( Exception e1 ) {
		      System.err.println( e1.getClass().getName() + ": " + e1.getMessage() );
		      JOptionPane.showMessageDialog(null, "Enter the alternatives before leaving");
		    // e1.printStackTrace();
		    
		    }
			finally {
				try{
				rs.close(); prepared.close(); }//connection1.close(); }
				catch(Exception e1) { } 
			}
			
			/*try{
				Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
				 Connection connection6 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
				 Connection connection6 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				// JOptionPane.showMessageDialog(null, "connection6 successful");
				 //connection = sqlite_conn.dbConnector();
				String sql = "SELECT DISTINCT p_name FROM pro_alt";
				prepared = connection6.prepareStatement(sql);
				rs = prepared.executeQuery();
				
				while (rs.next())
				{
					pro_alt_combo.addItem(rs.getString("p_name"));
					 
				}
				connection6.close();
			}catch(Exception e2){
				JOptionPane.showMessageDialog(null, e2);
			}
			finally {
				try{
				rs.close(); prepared.close(); connection.close();}
				catch(Exception e1) { } }*/
			
			String sql = "Select Process_id,Process_name from Process_lib";
			try{
				Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
				 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
				 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				//JOptionPane.showMessageDialog(null, "connection7 successful");		
					
					PreparedStatement pst = connection16.prepareStatement(sql);
				    ResultSet rs1 = pst.executeQuery();
				    
				    while(rs1.next())
				    {
				    	String id = rs1.getString(1);
				    	String process = rs1.getString(2);
				    	
				    	
				    	Object[] row = {id,process};
				    	dm_alt.addRow(row);
				    	
				    	
				    }
				    dm_alt.removeRow(0);
				    connection16.close();
				   
				  }
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			
			try{
				Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
				 Connection connection6 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
				 Connection connection6 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				// JOptionPane.showMessageDialog(null, "connection6 successful");
				 //connection = sqlite_conn.dbConnector();
				String sqlal = "SELECT DISTINCT P_name FROM Pro_alt ";
				prepared = connection6.prepareStatement(sqlal);
				rs = prepared.executeQuery();
				
				while (rs.next())
				{
					pro_alt_combo.addItem(rs.getString("p_name"));
					 
				}
				connection6.close();
			}catch(Exception e2){
				JOptionPane.showMessageDialog(null, e2);
			}
			finally {
				try{
				rs.close(); prepared.close(); connection.close();}
				catch(Exception e1) { } }
			
			}
			
		});
		button_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GroupLayout gl_panel_29 = new GroupLayout(panel_29);
		gl_panel_29.setHorizontalGroup(
			gl_panel_29.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_29.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_29.createParallelGroup(Alignment.LEADING)
						.addComponent(lblProcessAlternatives, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_29.createSequentialGroup()
							.addGap(12)
							.addComponent(lblUploadAlternativeProcesses, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 413, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_29.createSequentialGroup()
							.addGap(605)
							.addComponent(button_13, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_29.createSequentialGroup()
							.addGap(40)
							.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(30, Short.MAX_VALUE))
		);
		gl_panel_29.setVerticalGroup(
			gl_panel_29.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_29.createSequentialGroup()
					.addGap(32)
					.addComponent(lblProcessAlternatives, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addGroup(gl_panel_29.createParallelGroup(Alignment.LEADING)
						.addComponent(lblUploadAlternativeProcesses, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_29.createSequentialGroup()
							.addGap(10)
							.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)))
					.addGap(6)
					.addComponent(button_13, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(24)
					.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(221, Short.MAX_VALUE))
		);
		panel_29.setLayout(gl_panel_29);
		
	
		JPanel panel_21 = new JPanel();
		tabbedPane.addTab("Equipment", null, panel_21, null);
		panel_21.setLayout(new CardLayout(0, 0));
		
		JPanel panel_19 = new JPanel();
		panel_19.setBackground(new Color(224,224,225));
		panel_21.add(panel_19,"p19");
		

		JPanel panel_22 = new JPanel();
	
		panel_22.setBackground(new Color(224,224,225));
		panel_21.add(panel_22,"p22");
		equip_lib = new JTable();
		Object[] column = {"Id","Process","Equipment_id", "Equipment Count" , "Operator Count"};
		DefaultTableModel dm1 = new DefaultTableModel();
		dm1.setColumnIdentifiers(column);
		equip_lib.setModel(dm1);
		equip_lib.setBackground(SystemColor.control);
		equip_lib.setShowVerticalLines(false);
		equip_lib.setShowHorizontalLines(false);
		equip_lib.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		equip_lib.setBorder(null);
		JScrollPane Equip_scroll = new JScrollPane();
		Equip_scroll.setViewportView(equip_lib);
		Equip_scroll.setViewportBorder(null);
		Equip_scroll.setBorder(null);
		
		JComboBox comboBox_4 = new JComboBox();
		
		
		JButton btnSave_1 = new JButton("Assign Equipments");
		btnSave_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSave_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = dm1.getValueAt(equip_lib.getSelectedRow(), 0).toString();
				String name = dm1.getValueAt(equip_lib.getSelectedRow(), 1).toString();
				System.out.print(id);
				//String name = dm1.getValueAt(equip_lib.getSelectedRow(), 2).toString();
				String equ = comboBox_4.getSelectedItem().toString();
				
				try{
					/*String query = ("INSERT or Replace INTO demo "
							+ "( eid ,name,pro ) VALUES"
							+ "(?,?,?)");*/
					String query = ("UPDATE process_lib SET equip_id = ? , equi_count = ?  , op_count = ? where process_id = ? ");
							
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection26 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection26 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection13 successful");		
					//String id = dm1.getValueAt(i, 0).toString();
					
					equip_lib.getModel().setValueAt(equ, equip_lib.getSelectedRow(), 2);
						PreparedStatement prepared = connection26.prepareStatement(query);
						System.out.println(equ);
						try{
							String eq = equi.getText();
						 equi_int = Integer.parseInt(eq);
						String op_count = op.getText();
						op_int = Integer.parseInt(op_count);
						}
						catch(NumberFormatException e1)
						{
							System.out.println("Enter Integer value");
						}
					prepared.setString(4, id);//PID
					prepared.setInt(2,equi_int);//enum
					prepared.setInt(3,op_int);//opcount
					//prepared.setString(2,name);//pname
					prepared.setString(1, equ);//eid
					equip_lib.getModel().setValueAt(equ, equip_lib.getSelectedRow(), 2);
					equip_lib.getModel().setValueAt(equi_int, equip_lib.getSelectedRow(), 3);
					equip_lib.getModel().setValueAt(op_int, equip_lib.getSelectedRow(), 4);
						prepared.execute();
						connection26.close();
					   
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				
		/*	
			String id1 = comboBox_4.getSelectedItem().toString();
			try{
				String query = ("Update Process_lib SET Equip_id=? where Process_id=?");
						
				Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
				 Connection connection26 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
				 Connection connection26 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				JOptionPane.showMessageDialog(null, "connection13 successful");		
				
				
				equip_lib.getModel().setValueAt(id1, equip_lib.getSelectedRow(), 2);
				equip_lib.getModel().setValueAt(equi_int, equip_lib.getSelectedRow(), 3);
				equip_lib.getModel().setValueAt(op_int, equip_lib.getSelectedRow(), 4);
					PreparedStatement prepared = connection26.prepareStatement(query);
					System.out.println(equ);
				prepared.setString(1, equ);
				prepared.setString(2,id1);
				  
					
					prepared.execute();
					
					
						
					
				  
				    connection26.close();
				   
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			}*/
			}
			});
		
		JLabel lblSelectEquipment = new JLabel("Select Equipment");
		lblSelectEquipment.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblEquipmentCount = new JLabel("Equipment Count ");
		lblEquipmentCount.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblOperatorCount = new JLabel("Operator Count");
		lblOperatorCount.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		equi = new JTextField();
		equi.setColumns(10);
		
		op = new JTextField();
		op.setColumns(10);
		JPanel panel_28 = new JPanel();
		panel_21.add(panel_28, "p28");
		
		JLabel lblEquipmentAlternatives = new JLabel("Equipment Alternatives");
		lblEquipmentAlternatives.setForeground(Color.RED);
		lblEquipmentAlternatives.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblUploadAlternativeEquipments = new JLabel("Upload Alternative Equipments");
		lblUploadAlternativeEquipments.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton button_11 = new JButton("Template File");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
<<<<<<< HEAD
				File file = new File(startDir+"\\templates\\Equip_alt.csv");
=======
				File file = new File("C:\\Users\\Nitesh\\Desktop\\Equip_alt.csv");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				 filename1 = file.getAbsolutePath();
				        try {
				        	//Desktop dt = Desktop.getDesktop();
				            Desktop.getDesktop().open(file);
				            textField_7.setText(file.getAbsolutePath());
				        } catch (IOException e1) {
				            e1.printStackTrace();
				        }
				    
			}
			
		});
		button_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBorder(new MatteBorder(2,2,2,2,new Color(209,209,209)));
		textField_7.setBackground(new Color(221, 221, 221));
		
		JButton button_12 = new JButton("Upload");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
				 Connection connection44 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
				 Connection connection44 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				// JOptionPane.showMessageDialog(null, "connection1 successful");
				
			
				BufferedReader br = new BufferedReader(new FileReader(filename1));
				String line ;
				while((line = br.readLine()) != null){
					String[]value = line.split(",");
					String insertTableSQL =( "INSERT or REPLACE INTO Equip_alt"
							+ "( eq_id, eq_nm) VALUES"
							+ "(?,?)");
				
				prepared = connection44.prepareStatement(insertTableSQL);
				prepared.setString(1, value[0]);
				prepared.setString(2, value[1]);
				
				
				// execute insert SQL statement
				prepared.executeUpdate();
				}
				
				System.out.println("Record is inserted into Process_lib table!");
				connection44.close();
				
		    } catch ( Exception e1 ) {
		      System.err.println( e1.getClass().getName() + ": " + e1.getMessage() );
		      JOptionPane.showMessageDialog(null, "Enter the alternatives before leaving");
		     e1.printStackTrace();
		    
		    }
			finally {
				try{
				rs.close(); prepared.close(); }//connection1.close(); }
				catch(Exception e1) { } 
			}
			}
			
		});
		button_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GroupLayout gl_panel_28 = new GroupLayout(panel_28);
		gl_panel_28.setHorizontalGroup(
			gl_panel_28.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_28.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_28.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_28.createSequentialGroup()
							.addGap(12)
							.addComponent(lblUploadAlternativeEquipments, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 392, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_28.createSequentialGroup()
							.addGap(605)
							.addComponent(button_12, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_28.createSequentialGroup()
							.addGap(40)
							.addComponent(button_11, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblEquipmentAlternatives, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(30, Short.MAX_VALUE))
		);
		gl_panel_28.setVerticalGroup(
			gl_panel_28.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_28.createSequentialGroup()
					.addGap(30)
					.addComponent(lblEquipmentAlternatives, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addGroup(gl_panel_28.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUploadAlternativeEquipments, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addComponent(button_12, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(24)
					.addComponent(button_11, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(223, Short.MAX_VALUE))
		);
		panel_28.setLayout(gl_panel_28);
		
		JButton btnAlternateEquipments = new JButton("Alternate Equipments");
		btnAlternateEquipments.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_21.removeAll();
				panel_21.repaint();
				panel_21.revalidate();
				panel_21.add(panel_28);
				
				
			}
		});
		btnAlternateEquipments.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblEquipmentCapacity = new JLabel("Equipment capacity");
		lblEquipmentCapacity.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
			
		
		GroupLayout gl_panel_22 = new GroupLayout(panel_22);
		gl_panel_22.setHorizontalGroup(
			gl_panel_22.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_22.createSequentialGroup()
					.addGap(10)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addComponent(Equip_scroll, GroupLayout.PREFERRED_SIZE, 338, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_22.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_22.createSequentialGroup()
							.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_panel_22.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_22.createSequentialGroup()
								.addGroup(gl_panel_22.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_panel_22.createParallelGroup(Alignment.LEADING)
										.addComponent(equi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel_22.createParallelGroup(Alignment.LEADING)
											.addComponent(lblSelectEquipment)
											.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblOperatorCount, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
											.addComponent(lblEquipmentCount, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
									.addComponent(op, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(720))
							.addGroup(gl_panel_22.createSequentialGroup()
								.addComponent(lblEquipmentCapacity)
								.addContainerGap()))))
				.addGroup(gl_panel_22.createSequentialGroup()
					.addGap(522)
					.addGroup(gl_panel_22.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAlternateEquipments, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSave_1, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(728, Short.MAX_VALUE))
		);
		gl_panel_22.setVerticalGroup(
			gl_panel_22.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_22.createSequentialGroup()
					.addGroup(gl_panel_22.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_22.createSequentialGroup()
							.addGap(43)
							.addComponent(lblSelectEquipment)
							.addGap(18)
							.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(23)
							.addComponent(lblEquipmentCount, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(equi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblOperatorCount, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(op, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblEquipmentCapacity, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_22.createSequentialGroup()
							.addGap(20)
							.addGroup(gl_panel_22.createParallelGroup(Alignment.BASELINE)
								.addComponent(Equip_scroll, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)
								.addComponent(scrollPane, 0, 0, Short.MAX_VALUE))))
					.addGap(34)
					.addComponent(btnSave_1)
					.addGap(18)
					.addComponent(btnAlternateEquipments, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(42))
		);
		
		table_equip = new JTable();
		scrollPane.setViewportView(table_equip);
		
		Object[] column_eq = {"Equipment_id", "Equipment_name"};
		DefaultTableModel dm_eq = new DefaultTableModel();
		dm_eq.setColumnIdentifiers(column_eq);
		table_equip.setModel(dm_eq);
		table_equip.setBackground(SystemColor.control);
		table_equip.setShowVerticalLines(false);
		table_equip.setShowHorizontalLines(false);
		table_equip.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		
		table_equip.setBorder(null);
		
		
		panel_22.setLayout(gl_panel_22);
		//System.out.println(equip_lib.getSelectedColumnCount());
		JLabel lblEquipment = new JLabel("Equipment");
		lblEquipment.setForeground(Color.RED);
		lblEquipment.setFont(new Font("Tahoma", Font.BOLD, 15));
		
/*comboBox_4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 String newSelection = (String) comboBox_4.getSelectedItem();
				 int index = equip_lib.getSelectedRow(); 
				 //int index_col = equip_lib.getSelectedColumn(); 
				 if (index == -1) { // no selection, so insert at beginning
				       JOptionPane.showConfirmDialog(panel_22, "Select the cell first!");
				 }
				 // get selected index
			      if (index == -1) { // no selection, so insert at beginning
			        index = 0;
			      } else { // add after the selected item
			        index++;
			      }
			   dm1.setValueAt(newSelection, index, 2);
			}
		});
		*/
		JLabel lblUploadEquipments = new JLabel("Upload Equipments");
		lblUploadEquipments.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton button_5 = new JButton("Template File");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD
				 File file = new File(startDir+"\\templates\\Equipment_lib.csv");
=======
				 File file = new File("C:\\Users\\Nitesh\\Desktop\\Equipment_lib.csv");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				 filename1 = file.getAbsolutePath();
				        try {
				        	//Desktop dt = Desktop.getDesktop();
				            Desktop.getDesktop().open(file);
				            txtEquitext.setText(file.getAbsolutePath());
				        } catch (IOException e1) {
				            e1.printStackTrace();
				        }
				  	}
			
		});
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton equip_up = new JButton("Upload");
		
		equip_up.setOpaque(false);
		equip_up.setForeground(Color.DARK_GRAY);
		equip_up.setFont(new Font("Tahoma", Font.PLAIN, 15));
		equip_up.setBackground(new Color(132, 132, 132));
		
		txtEquitext = new JTextField();
		txtEquitext.setEditable(false);
		txtEquitext.setColumns(10);
		txtEquitext.setBorder(new MatteBorder(2,2,2,2,new Color(209,209,209)));
		txtEquitext.setBackground(new Color(221, 221, 221));
		GroupLayout gl_panel_19 = new GroupLayout(panel_19);
		gl_panel_19.setHorizontalGroup(
			gl_panel_19.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_19.createSequentialGroup()
					.addGroup(gl_panel_19.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_19.createSequentialGroup()
							.addGap(32)
							.addComponent(lblUploadEquipments, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtEquitext, GroupLayout.PREFERRED_SIZE, 392, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(equip_up, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_19.createSequentialGroup()
							.addGap(62)
							.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_19.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblEquipment, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(39, Short.MAX_VALUE))
		);
		gl_panel_19.setVerticalGroup(
			gl_panel_19.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_19.createSequentialGroup()
					.addComponent(lblEquipment, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(17)
					.addGroup(gl_panel_19.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUploadEquipments, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtEquitext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(equip_up, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(button_5)
					.addContainerGap(278, Short.MAX_VALUE))
		);
		panel_19.setLayout(gl_panel_19);
		
		
		equip_up.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_21.removeAll();
				panel_21.repaint();
				panel_21.revalidate();
				panel_21.add(panel_22);
				panel_22.setVisible(true);
				
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
				 Connection connection10 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
				 Connection connection10 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				// JOptionPane.showMessageDialog(null, "connection1 successful");
				BufferedReader br = new BufferedReader(new FileReader(filename1));
				String line ;
				while((line = br.readLine()) != null){
					String[]value = line.split(",");
					String insertTableSQL =( "INSERT or REplace INTO Equip_lib"
							+ "( Equip_id, Equip_name) VALUES"
							+ "(?,?)");
				
				prepared = connection10.prepareStatement(insertTableSQL);
				prepared.setString(1, value[0]);
				prepared.setString(2, value[1]);
				

				// execute insert SQL statement
				prepared.executeUpdate();
				}
				
				System.out.println("Record is inserted into Equipment_lib table!");
				connection10.close();
				
		    } catch ( Exception e1 ) {
		      //System.err.println( e1.getClass().getName() + ": " + e1.getMessage() );
		      JOptionPane.showMessageDialog(null, "Enter the equipments before retrieving");
		  	    }
			finally {
				try{
				rs.close(); prepared.close(); }//connection1.close(); }
				catch(Exception e1) { } 
			}
			
			String sql = "Select Process_id,Process_name from Process_lib";
			try{
				Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
				 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
				 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				//JOptionPane.showMessageDialog(null, "connection7 successful");		
					
					PreparedStatement pst = connection16.prepareStatement(sql);
				    ResultSet rs1 = pst.executeQuery();
				    
				    while(rs1.next())
				    {
				    	String id = rs1.getString(1);
				    	String process = rs1.getString(2);
				    	String eq = equi.getText();
				    	String ope = op.getText();
				    	
				    	Object[] row = {id,process,eq,ope};
				    	dm1.addRow(row);
				    	
				    	
				    }
				    dm1.removeRow(0);
				    connection16.close();
				   
				  }
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			String sql_eq = "Select Equip_id,Equip_name from Equip_lib";
			try{
				Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
				 Connection connection20 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
				 Connection connection20 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				//JOptionPane.showMessageDialog(null, "connection7 successful");		
					
					PreparedStatement pst = connection20.prepareStatement(sql_eq);
				    ResultSet rs1 = pst.executeQuery();
				    
				    while(rs1.next())
				    {
				    	String id = rs1.getString(1);
				    	String equip = rs1.getString(2);
				    	
				    	Object[] row = {id,equip};
				    	dm_eq.addRow(row);
				    	System.out.print("Yes");
				    	
				    	
				    }
				    dm_eq.removeRow(0);
				    connection20.close();
				   
				  }
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			String sql4 = "Select equip_id from Equip_lib order by equip_id";
			try{
				Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
				 Connection connection19 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
				 Connection connection19 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				//JOptionPane.showMessageDialog(null, "connection19 successful");		
					
					PreparedStatement pst = connection19.prepareStatement(sql4);
				    ResultSet rs1 = pst.executeQuery();
				    
				    while(rs1.next())
				    {
				    	String id = rs1.getString(1);
				    	comboBox_4.addItem(id);
				    	
				    }
				    connection19.close();

			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			}
			});
		
		JPanel panel_23 = new JPanel();
		tabbedPane.addTab("Space", null, panel_23, null);
		panel_23.setLayout(new CardLayout(0, 0));
		
		
		
		JPanel panel_20 = new JPanel();
	
		panel_20.setBackground(new Color(224,224,225));
		panel_23.add(panel_20, "p20");
		
		JLabel lblSpace = new JLabel("Space");
		lblSpace.setForeground(Color.RED);
		lblSpace.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblUploadLocations = new JLabel("Upload Locations");
		lblUploadLocations.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton button_9 = new JButton("Template File");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD
				File file = new File(startDir+"\\templates\\Space_lib.csv");
=======
				File file = new File("C:\\Users\\Nitesh\\Desktop\\Space_lib.csv");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				 filename1 = file.getAbsolutePath();
				        try {
				        	//Desktop dt = Desktop.getDesktop();
				            Desktop.getDesktop().open(file);
				            space_text.setText(file.getAbsolutePath());
				        } catch (IOException e1) {
				            e1.printStackTrace();
				        }
			}
		});
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		space_text = new JTextField();
		space_text.setEditable(false);
		space_text.setColumns(10);
		space_text.setBorder(new MatteBorder(2,2,2,2,new Color(209,209,209)));
		space_text.setBackground(new Color(221, 221, 221));
		
		JPanel panel_24 = new JPanel();
		panel_23.add(panel_24, "p24");
		panel_24.setBackground(new Color(224,224,225));
		JPanel panel_25 = new JPanel();
		panel_23.add(panel_25, "p25");
		panel_25.setBackground(new Color(224,224,225));
		
JComboBox source_combo = new JComboBox();
		
		JComboBox dest_combo = new JComboBox();
		source_combo.setVisible(false);
		dest_combo.setVisible(false);
		JScrollPane scrollPane_6 = new JScrollPane();
		JCheckBox chckbxNewCheckBox = new JCheckBox("Is shipping involved?");
	/*	if (chckbxNewCheckBox.isSelected()== true)
		{
			try{					
				String query = ("Update Process_lib SET Transport='1' where Process_id = ? ");
					
				Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
				 Connection connection24 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
				 Connection connection24 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				//JOptionPane.showMessageDialog(null, "connection13 successful");		
				//String id = dm1.getValueAt(i, 0).toString();
				
				//table_3.getModel().setValueAt(selected.toString(), table_3.getSelectedRow(), 2);
					PreparedStatement pst = connection24.prepareStatement(query);
					String id = table_6.getValueAt(table_6.getSelectedRow(), 0).toString();
					pst.setString(1, id);
					
				pst.setInt(1, lc_id);
				pst.setString(2,id);
				    
						
					
				  pst.execute();
				    connection24.close();
				  
				   	System.out.println("Here");				
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}*/
		
		/*chckbxNewCheckBox.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				source_combo.setVisible(true);
				dest_combo.setVisible(true);
			}
		});*/
		chckbxNewCheckBox.setVisible(true);
		JScrollPane scrollPane_8 = new JScrollPane();
		
		table_6 = new JTable();
		scrollPane_8.setViewportView(table_6);
		table_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				chckbxNewCheckBox.setVisible(true);
				source_combo.setVisible(true);
				dest_combo.setVisible(true);
			}
		});
		Object[] column6 = {"Process","Process_name","Space"};
		DefaultTableModel dm6 = new DefaultTableModel();
		dm6.setColumnIdentifiers(column6);
		table_6.setModel(dm6);
		table_6.setBackground(SystemColor.control);
		table_6.setShowVerticalLines(false);
		table_6.setShowHorizontalLines(false);
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String id = dm6.getValueAt(table_6.getSelectedRow(), 0).toString();
				
				System.out.print(id);
				
				String pro = comb_space.getSelectedItem().toString();
				try{
					
					String query = ("Update Process_lib SET Space_id=? where Process_id=?");
							
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection24 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection24 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection13 successful");		
					//String id = dm1.getValueAt(i, 0).toString();
					
					table_6.getModel().setValueAt(pro, table_6.getSelectedRow(), 2);
						PreparedStatement pst = connection24.prepareStatement(query);
						System.out.println(pro);
					pst.setString(1, pro);
					pst.setString(2,id);
					    
							
						
					  pst.execute();
					    connection24.close();
					  
					   					
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				if (chckbxNewCheckBox.isSelected()== true)
				{
					try{					
						String query = ("Update Process_lib SET Transport='1' where Process_id = ? ");
							
						Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
						 Connection connection24 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
						 Connection connection24 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
						//JOptionPane.showMessageDialog(null, "connection13 successful");		
						//String id = dm1.getValueAt(i, 0).toString();
						
						//table_3.getModel().setValueAt(selected.toString(), table_3.getSelectedRow(), 2);
							PreparedStatement pst = connection24.prepareStatement(query);
							String pid = table_6.getValueAt(table_6.getSelectedRow(), 0).toString();
							pst.setString(1, pid);
							/*
						pst.setInt(1, lc_id);
						pst.setString(2,id);
						    */
								
							
						  pst.execute();
						    connection24.close();
						  
						   	System.out.println("Here");				
					}
					catch(Exception ex)
					{
						ex.printStackTrace();
					}
					try{
						
						String query = ("Update Process_lib SET Space_id=? where Process_id=?");
								
						Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
						 Connection connection24 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
						 Connection connection24 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
						//JOptionPane.showMessageDialog(null, "connection13 successful");		
						//String id = dm1.getValueAt(i, 0).toString();
						
						table_6.getModel().setValueAt(pro, table_6.getSelectedRow(), 2);
							PreparedStatement pst = connection24.prepareStatement(query);
							String sid = (String) dest_combo.getSelectedItem();
							String p_id = table_6.getValueAt(table_6.getSelectedRow(), 0).toString();
						pst.setString(1, sid);
						pst.setString(2,p_id);
						    
								
							
						  pst.execute();
						    connection24.close();
						  
						   					
					}
					catch(Exception ex)
					{
						ex.printStackTrace();
					}
				}
				chckbxNewCheckBox.setSelected(false);
			}
		});
			
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		 comb_space = new JComboBox();
			JPanel panel_12 = new JPanel();
			panel_23.add(panel_12, "p12");
			
			JScrollPane scrollPane_4 = new JScrollPane();
			
			JLabel lblNewLabel_7 = new JLabel("Location in Focus");
			lblNewLabel_7.setForeground(Color.RED);
			lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 15));
			
			JButton btnSave_2 = new JButton("Save ");
			btnSave_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					loc_ifid = lif.getModel().getValueAt(lif.getSelectedRow(), 0).toString();
					 loc_if1 = lif.getModel().getValueAt(lif.getSelectedRow(), 1).toString();
					 loc_if2 = lif.getModel().getValueAt(lif.getSelectedRow(), 2).toString();
					 loc_if3 = lif.getModel().getValueAt(lif.getSelectedRow(), 3).toString();
				}
			});
			btnSave_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			
			JPanel panel_27 = new JPanel();
			panel_23.add(panel_27, "name_20215552367250");
			
			JButton btnNewButton_1 = new JButton("Alternatives");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel_23.removeAll();
					panel_23.repaint();
					panel_23.revalidate();
					panel_23.add(panel_27);
					panel_27.setVisible(true);
					
					
				}
			});
			btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			GroupLayout gl_panel_12 = new GroupLayout(panel_12);
			gl_panel_12.setHorizontalGroup(
				gl_panel_12.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel_12.createSequentialGroup()
						.addGroup(gl_panel_12.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_12.createSequentialGroup()
								.addGap(33)
								.addComponent(lblNewLabel_7))
							.addGroup(gl_panel_12.createSequentialGroup()
								.addGap(82)
								.addComponent(scrollPane_4, GroupLayout.PREFERRED_SIZE, 317, GroupLayout.PREFERRED_SIZE)
								.addGap(44)
								.addGroup(gl_panel_12.createParallelGroup(Alignment.LEADING)
									.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnSave_2, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(151, Short.MAX_VALUE))
			);
			gl_panel_12.setVerticalGroup(
				gl_panel_12.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel_12.createSequentialGroup()
						.addGap(20)
						.addGroup(gl_panel_12.createParallelGroup(Alignment.TRAILING)
							.addComponent(btnSave_2)
							.addGroup(gl_panel_12.createSequentialGroup()
								.addComponent(lblNewLabel_7)
								.addGap(18)
								.addComponent(scrollPane_4, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(86, Short.MAX_VALUE))
			);
			
			lif = new JTable();
			scrollPane_4.setViewportView(lif);
			panel_12.setLayout(gl_panel_12);
		JButton LIF = new JButton("Location in focus");
		Object[] columnlif = {"Space Id","Space Role","Factory name","City","Country","Continent"};
		lif.getTableHeader().setVisible(false);
		lif.setTableHeader(null);
		DefaultTableModel dmlif = new DefaultTableModel();
		dmlif.setColumnIdentifiers(columnlif);
		lif.setModel(dmlif);
		lif.setBackground(SystemColor.control);
		lif.setShowVerticalLines(false);
		lif.setShowHorizontalLines(false);
		
		
		LIF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_23.removeAll();
				panel_23.repaint();
				panel_23.revalidate();
				panel_23.add(panel_12);
				panel_12.setVisible(true);
				
				String sql_query = "Select space_id,space_role,factory_name,city,country,continent from space_lib";
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection26 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection26 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection7 successful");		
						
						PreparedStatement pst = connection26.prepareStatement(sql_query);
					    ResultSet rs1 = pst.executeQuery();
					    
					    while(rs1.next())
					    {
					    	String id = rs1.getString(1);
					    	String role = rs1.getString(2);
					    	String fname = rs1.getString(3);
					    	String city = rs1.getString(4);
      				    	String country = rs1.getString(5);
					    	String cont = rs1.getString(6);

					    	
					    	Object[] row = {id,role,fname,city,country,cont};
					    	dmlif.addRow(row);
					    	//System.out.print("Yes");
					    	
					    }
					    connection26.close();

					  }
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		LIF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblSpaceId = new JLabel("Space Id");
		lblSpaceId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		
		
		
		
		JLabel lblSource = new JLabel("Source");
		
		JLabel lblDestination = new JLabel("Destination");
		GroupLayout gl_panel_25 = new GroupLayout(panel_25);
		gl_panel_25.setHorizontalGroup(
			gl_panel_25.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_25.createSequentialGroup()
					.addGroup(gl_panel_25.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_25.createSequentialGroup()
							.addGap(24)
							.addComponent(scrollPane_6, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(scrollPane_8, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_panel_25.createParallelGroup(Alignment.LEADING)
								.addComponent(comb_space, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSpaceId)
								.addComponent(source_combo, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_25.createParallelGroup(Alignment.TRAILING)
									.addGroup(Alignment.LEADING, gl_panel_25.createSequentialGroup()
										.addComponent(lblSource)
										.addGap(59)
										.addComponent(lblDestination, GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
									.addComponent(chckbxNewCheckBox, Alignment.LEADING))))
						.addGroup(gl_panel_25.createSequentialGroup()
							.addContainerGap(566, Short.MAX_VALUE)
							.addGroup(gl_panel_25.createParallelGroup(Alignment.TRAILING)
								.addComponent(LIF)
								.addGroup(gl_panel_25.createParallelGroup(Alignment.LEADING)
									.addComponent(dest_combo, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnSave)))))
					.addGap(49))
		);
		gl_panel_25.setVerticalGroup(
			gl_panel_25.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_25.createSequentialGroup()
					.addGroup(gl_panel_25.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_25.createSequentialGroup()
							.addGap(54)
							.addGroup(gl_panel_25.createParallelGroup(Alignment.BASELINE)
								.addComponent(scrollPane_6, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)
								.addComponent(scrollPane_8, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_25.createSequentialGroup()
									.addGroup(gl_panel_25.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_25.createSequentialGroup()
											.addComponent(lblSpaceId)
											.addGap(77)
											.addComponent(lblSource))
										.addGroup(gl_panel_25.createSequentialGroup()
											.addGap(96)
											.addComponent(lblDestination)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_25.createParallelGroup(Alignment.BASELINE)
										.addComponent(source_combo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(dest_combo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_panel_25.createSequentialGroup()
							.addGap(82)
							.addComponent(comb_space, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(chckbxNewCheckBox)))
					.addPreferredGap(ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
					.addComponent(btnSave)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(LIF)
					.addGap(19))
		);
		Object[] column5 = {"Process Id","Process Name"};
		DefaultTableModel dm5 = new DefaultTableModel();
		dm5.setColumnIdentifiers(column5);
		
		
		table_4 = new JTable();
		Object[] column4 = {"Space Id","Space Name"};
		table_4.getTableHeader().setVisible(false);
		table_4.setTableHeader(null);
		DefaultTableModel dm4 = new DefaultTableModel();
		dm4.setColumnIdentifiers(column4);
		table_4.setModel(dm4);
		table_4.setBackground(SystemColor.control);
		table_4.setShowVerticalLines(false);
		table_4.setShowHorizontalLines(false);
		scrollPane_6.setViewportView(table_4);
		
		panel_25.setLayout(gl_panel_25);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		 Border border = BorderFactory.createLineBorder(Color.GRAY);
		lblAssignToProcess.setBorder(border);
		lblAssignToProcess.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_23.removeAll();
				panel_23.repaint();
				panel_23.revalidate();
				panel_23.add(panel_25);
				
				String sql = "Select space_id,city from space_lib";
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection26 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection26 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection7 successful");		
						
						PreparedStatement pst = connection26.prepareStatement(sql);
					    ResultSet rs1 = pst.executeQuery();
					    
					    while(rs1.next())
					    {
					    	String id = rs1.getString(1);
					    	String name = rs1.getString(2);
					    	
					    	Object[] row = {id,name};
					    	dm4.addRow(row);
					    	//System.out.print("Yes");
					    	
					    }
					    connection26.close();

					  }
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				
			String sql1 = "Select process_id,process_name from process_lib";
			try{
				Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
				 Connection connection27 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
				 Connection connection27 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				//JOptionPane.showMessageDialog(null, "connection7 successful");		
					
					PreparedStatement pst = connection27.prepareStatement(sql1);
				    ResultSet rs1 = pst.executeQuery();
				    
				    while(rs1.next())
				    {
				    	String id = rs1.getString(1);
				    	String name = rs1.getString(2);
				    	
				    	Object[] row = {id,name};
				    	dm5.addRow(row);
				    	//System.out.print("Yes");
				    	
				    }
				    connection27.close();

				  }
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			String sql3 = "Select Process_id,Process_name from Process_lib";
			try{
				Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
				 Connection connection28 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
				 Connection connection28 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				//JOptionPane.showMessageDialog(null, "connection7 successful");		
					
					PreparedStatement pst = connection28.prepareStatement(sql3);
				    ResultSet rs1 = pst.executeQuery();
				    
				    while(rs1.next())
				    {
				    	String id = rs1.getString(1);
				    	String name = rs1.getString(2);
				    	
				    	Object[] row = {id,name};
				    	dm6.addRow(row);
				    	
				    	
				    }
				    connection28.close();

				  }
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			
			String sql4 = "Select space_id from Space_lib order by space_id";
			try{
				Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
				 Connection connection19 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
				 Connection connection19 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				//JOptionPane.showMessageDialog(null, "connection19 successful");		
					
					PreparedStatement pst = connection19.prepareStatement(sql4);
				    ResultSet rs1 = pst.executeQuery();
				    
				    while(rs1.next())
				    {
				    	String id = rs1.getString(1);
				    	comb_space.addItem(id);
				    	
				    }
				    connection19.close();

			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		
			String sql5 = "Select space_id from Space_lib order";
			try{
				Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
				 Connection connection19 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
				 Connection connection19 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				//JOptionPane.showMessageDialog(null, "connection19 successful");		
					
					PreparedStatement pst = connection19.prepareStatement(sql4);
				    ResultSet rs1 = pst.executeQuery();
				    
				    while(rs1.next())
				    {
				    	String id = rs1.getString(1);
				    	source_combo.addItem(id);
				    	
				    }
				    connection19.close();

			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			String sql6 = "Select space_id from Space_lib  ";
			try{
				Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
				 Connection connection19 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
				 Connection connection19 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				//JOptionPane.showMessageDialog(null, "connection19 successful");		
					
					PreparedStatement pst = connection19.prepareStatement(sql4);
				    ResultSet rs1 = pst.executeQuery();
				    
				    while(rs1.next())
				    {
				    	String id = rs1.getString(1);
				    	dest_combo.addItem(id);
				    	
				    }
				    connection19.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		
			}		
		});
				
		
		
		
		
		lblAssignToProcess.setOpaque(true);
		lblAssignToProcess.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GroupLayout gl_panel_24 = new GroupLayout(panel_24);
		gl_panel_24.setHorizontalGroup(
			gl_panel_24.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_24.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_3, GroupLayout.PREFERRED_SIZE, 668, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(42, Short.MAX_VALUE))
				.addGroup(gl_panel_24.createSequentialGroup()
					.addContainerGap(467, Short.MAX_VALUE)
					.addComponent(lblAssignToProcess, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
					.addGap(97))
		);
		gl_panel_24.setVerticalGroup(
			gl_panel_24.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_24.createSequentialGroup()
					.addGap(42)
					.addComponent(scrollPane_3, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblAssignToProcess, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(54, Short.MAX_VALUE))
		);
		
		
		
		space_table = new JTable();
		scrollPane_3.setViewportView(space_table);
		panel_24.setLayout(gl_panel_24);
		space_table.setShowVerticalLines(false);
		space_table.setShowHorizontalLines(false);
		space_table.setBackground(SystemColor.control);
		
		JButton button_10 = new JButton("Upload");
		
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_23.removeAll();
				panel_23.repaint();
				panel_23.revalidate();
				panel_23.add(panel_24);
				
				panel_24.setVisible(true);
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
				 Connection connection14 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
				 Connection connection14 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				// JOptionPane.showMessageDialog(null, "connection1 successful");
				BufferedReader br = new BufferedReader(new FileReader(filename1));
				String line ;
				while((line = br.readLine()) != null){
					String[]value = line.split(",");
					String insertTableSQL =( "INSERT or REPLACE INTO Space_lib"
							+ "( Space_id, Space_role, Longitude, Latitude, Factory_Name , City, State , Country , Continent) VALUES"
							+ "(?,?,?,?,?,?,?,?,?)");
				
				prepared = connection14.prepareStatement(insertTableSQL);
				prepared.setString(1, value[0]);
				prepared.setString(2, value[1]);
				prepared.setString(3, value[2]);
				prepared.setString(4, value[3]);
				prepared.setString(5, value[4]);
				prepared.setString(6, value[5]);
				prepared.setString(7, value[6]);
				prepared.setString(8, value[7]);
				prepared.setString(9, value[8]);
				
		
				// execute insert SQL statement
				prepared.executeUpdate();
				}
				
				System.out.println("Record is inserted into Space_lib table!");
				connection14.close();
				br.close();
				
		    } catch ( Exception e1 ) {
		      System.err.println( e1.getClass().getName() + ": " + e1.getMessage() );
		      JOptionPane.showMessageDialog(null, "Enter the Space Information before retrieving");
		     e1.printStackTrace();
		       }
			finally {
				try{
				rs.close(); prepared.close(); }//connection1.close(); }
				catch(Exception e1) { } 
			}
								
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
				 Connection connection15 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
				 Connection connection15 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				//JOptionPane.showMessageDialog(null, "connection7 successful");		
					String query =( "SELECT * FROM Space_lib");
					PreparedStatement pst = connection15.prepareStatement(query);
				    ResultSet rs1 = pst.executeQuery();
				   space_table.setModel(DbUtils.resultSetToTableModel(rs1));
				 
				    System.out.println("data retrieved");
				connection15.close();

				}
				catch ( Exception e1 )
				{
		      System.err.println( e1.getClass().getName() + ": " + e1.getMessage() );
		     e1.printStackTrace();
		    		    }
			finally {
				try{
				rs.close(); }//connection1.close(); }
				catch(Exception e1) { } }
				
			}
			
		});
		button_10.setOpaque(false);
		button_10.setForeground(Color.DARK_GRAY);
		button_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_10.setBackground(new Color(132, 132, 132));
		
		GroupLayout gl_panel_20 = new GroupLayout(panel_20);
		gl_panel_20.setHorizontalGroup(
			gl_panel_20.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_20.createSequentialGroup()
					.addGroup(gl_panel_20.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_20.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_panel_20.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_20.createSequentialGroup()
									.addGap(10)
									.addComponent(lblUploadLocations, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(space_text, GroupLayout.PREFERRED_SIZE, 392, GroupLayout.PREFERRED_SIZE)
									.addGap(27)
									.addComponent(button_10, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblSpace, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_20.createSequentialGroup()
							.addGap(58)
							.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(36, Short.MAX_VALUE))
		);
		gl_panel_20.setVerticalGroup(
			gl_panel_20.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_20.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblSpace, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_20.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUploadLocations, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(space_text, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_10, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addGap(40)
					.addComponent(button_9)
					.addContainerGap(251, Short.MAX_VALUE))
		);
		panel_20.setLayout(gl_panel_20);
		
	
		
		JLabel lblNewLabel_8 = new JLabel("Space Alternatives");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_8.setForeground(Color.RED);
		
		JLabel lblUploadAlternativesLocations = new JLabel("Upload Alternative Locations");
		lblUploadAlternativesLocations.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBorder(new MatteBorder(2,2,2,2,new Color(209,209,209)));
		textField_3.setBackground(new Color(221, 221, 221));
		
		JButton btnNewButton_2 = new JButton("Template File");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD
				File file = new File(startDir+"\\templates\\Space_alt.csv");
=======
				File file = new File("C:\\Users\\Nitesh\\Desktop\\Space_alt.csv");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				 filename1 = file.getAbsolutePath();
				        try {
				        	//Desktop dt = Desktop.getDesktop();
				            Desktop.getDesktop().open(file);
				            textField_3.setText(file.getAbsolutePath());
				        } catch (IOException e1) {
				            e1.printStackTrace();
				        }
				    
			}
			
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
				 Connection connection3 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
				 Connection connection3 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				// JOptionPane.showMessageDialog(null, "connection1 successful");
				
			
				BufferedReader br = new BufferedReader(new FileReader(filename1));
				String line ;
				while((line = br.readLine()) != null){
					String[]value = line.split(",");
					String insertTableSQL =( "INSERT or REPLACE INTO Space_alt"
							+ "( Sid, S_role,long, lat, F_name, City,state,country,continent) VALUES"
							+ "(?,?,?,?,?,?,?,?,?)");
				
				prepared = connection3.prepareStatement(insertTableSQL);
				prepared.setString(1, value[0]);
				prepared.setString(2, value[1]);
				prepared.setString(3, value[2]);
				prepared.setString(4, value[3]);
				prepared.setString(5, value[4]);
				prepared.setString(6, value[5]);
				prepared.setString(7, value[6]);
				prepared.setString(8, value[7]);
				prepared.setString(9, value[8]);
				
				// execute insert SQL statement
				prepared.executeUpdate();
				}
				
				System.out.println("Record is inserted into Process_lib table!");
				connection3.close();
				
		    } catch ( Exception e1 ) {
		      System.err.println( e1.getClass().getName() + ": " + e1.getMessage() );
		      JOptionPane.showMessageDialog(null, "Enter the alternatives before leaving");
		     e1.printStackTrace();
		    
		    }
			finally {
				try{
				rs.close(); prepared.close(); }//connection1.close(); }
				catch(Exception e1) { } 
			}
			}
		});
		btnUpload.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GroupLayout gl_panel_27 = new GroupLayout(panel_27);
		gl_panel_27.setHorizontalGroup(
			gl_panel_27.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_27.createSequentialGroup()
					.addGroup(gl_panel_27.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_27.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_8))
						.addGroup(gl_panel_27.createSequentialGroup()
							.addGap(22)
							.addComponent(lblUploadAlternativesLocations)
							.addGap(18)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 392, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_27.createSequentialGroup()
							.addGap(50)
							.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(79, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel_27.createSequentialGroup()
					.addContainerGap(615, Short.MAX_VALUE)
					.addComponent(btnUpload)
					.addGap(30))
		);
		gl_panel_27.setVerticalGroup(
			gl_panel_27.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_27.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_8)
					.addGap(28)
					.addGroup(gl_panel_27.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUploadAlternativesLocations, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnUpload, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(24)
					.addComponent(btnNewButton_2)
					.addContainerGap(242, Short.MAX_VALUE))
		);
		panel_27.setLayout(gl_panel_27);
		
	
		
		JPanel panel_26 = new JPanel();
		tabbedPane.addTab("LC Phase", null, panel_26, null);
		panel_26.setBackground(new Color(224,224,225));
		
		JLabel lblCPhase = new JLabel("LC Phase ");
		lblCPhase.setForeground(Color.RED);
		lblCPhase.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JScrollPane scrollPane_5 = new JScrollPane();
		
		JComboBox<String> LC_combo = new JComboBox<String>();
		LC_combo.addItem("Material");
		LC_combo.addItem("Manufacturing");
		LC_combo.addItem("Assembly");
		LC_combo.addItem("Package");
		LC_combo.addItem("Transport");
		LC_combo.addItem("Usage");
		LC_combo.addItem("After use");
		
		JButton btnAssignLcphase = new JButton("Assign ");
		btnAssignLcphase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
String id = dm_lc.getValueAt(table_3.getSelectedRow(), 0).toString();
				
				
				
          Object selected = LC_combo.getSelectedItem();
          if(selected.toString().equals("Material"))
				{
					 lc_id = 1; 
				}
          else if(selected.toString().equals("Manufacturing"))
			{
				 lc_id = 2; 
			}
          else if(selected.toString().equals("Assembly"))
			{
				 lc_id = 3; 
			}
          else if(selected.toString().equals("Package"))
			{
				 lc_id = 4; 
			}
          else if(selected.toString().equals("Transport"))
			{
				 lc_id = 5; 
			}
          else if(selected.toString().equals("Usage"))
			{
				 lc_id = 6; 
			}
          else{
        	  lc_id = 7;
          }
				try{					
					String query = ("Update Process_lib SET LC_id=? where Process_id=?");
						
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection24 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection24 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection13 successful");		
					//String id = dm1.getValueAt(i, 0).toString();
					
					table_3.getModel().setValueAt(selected.toString(), table_3.getSelectedRow(), 2);
						PreparedStatement pst = connection24.prepareStatement(query);
						
					pst.setInt(1, lc_id);
					pst.setString(2,id);
					    
							
						
					  pst.execute();
					    connection24.close();
					  
					   					
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				
				/*try{					
					String query = ("Update Process_lib SET Transport='1' where LC_id = '5'");
						
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection24 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection24 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection13 successful");		
					//String id = dm1.getValueAt(i, 0).toString();
					
					table_3.getModel().setValueAt(selected.toString(), table_3.getSelectedRow(), 2);
						PreparedStatement pst = connection24.prepareStatement(query);
						
					pst.setInt(1, lc_id);
					pst.setString(2,id);
					    
							
						
					  pst.execute();
					    connection24.close();
					  
					   					
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}*/
			}
			
		});
		btnAssignLcphase.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
	
		
		GroupLayout gl_panel_26 = new GroupLayout(panel_26);
		gl_panel_26.setHorizontalGroup(
			gl_panel_26.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_26.createSequentialGroup()
					.addGroup(gl_panel_26.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_26.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblCPhase, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_26.createSequentialGroup()
							.addGap(44)
							.addComponent(scrollPane_5, GroupLayout.PREFERRED_SIZE, 338, GroupLayout.PREFERRED_SIZE)
							.addGap(88)
							.addGroup(gl_panel_26.createParallelGroup(Alignment.LEADING)
								.addComponent(btnAssignLcphase, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
								.addComponent(LC_combo, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(131, Short.MAX_VALUE))
		);
		gl_panel_26.setVerticalGroup(
			gl_panel_26.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_26.createSequentialGroup()
					.addGroup(gl_panel_26.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_26.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblCPhase, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(scrollPane_5, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_26.createSequentialGroup()
							.addGap(74)
							.addComponent(LC_combo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(95)
							.addComponent(btnAssignLcphase)))
					.addContainerGap(140, Short.MAX_VALUE))
		);
		
		table_3 = new JTable();
		scrollPane_5.setViewportView(table_3);
		panel_26.setLayout(gl_panel_26);
		Object[] column_lc = {"Id","Process","LC Phase"};
		
		dm_lc.setColumnIdentifiers(column_lc);
		table_3.setModel(dm_lc);
		table_3.setBackground(SystemColor.control);
		table_3.setShowVerticalLines(false);
		table_3.setShowHorizontalLines(false);
		table_3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		table_3.setBorder(null);
		
		JPanel panel_36 = new JPanel();
		tabbedPane.addTab("Time", null, panel_36, null);
		panel_36.setLayout(new CardLayout(0, 0));
		JPanel Time = new JPanel();
		panel_36.add(Time , "Time tab");
			
		JScrollPane pro = new JScrollPane();
		pro.setBounds(19, 100, 158, 254);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(19, 0, 95, 40);
		lblTime.setForeground(Color.RED);
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		sp = new JTextField();
		sp.setBounds(401, 100, 190, 48);
		sp.setColumns(10);
		
		dur = new JTextField();
		dur.setBounds(609, 109, 64, 30);
		dur.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Process");
		lblNewLabel_9.setBounds(31, 63, 50, 19);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblEquipment_1 = new JLabel("Equipment");
		lblEquipment_1.setBounds(215, 63, 68, 19);
		lblEquipment_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblSpace_1 = new JLabel("Space");
		lblSpace_1.setBounds(401, 63, 63, 19);
		lblSpace_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblTime_1 = new JLabel("Time (duration in sec)");
		lblTime_1.setBounds(560, 63, 160, 19);
		lblTime_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnUpload_1 = new JButton("Add");
		btnUpload_1.setBounds(633, 177, 57, 27);
		btnUpload_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
						try{
					
					String query = ("Update Process_lib SET duration=? where Process_id=?");
							
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection45 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection45 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection45 successful");		
					//String id = dm1.getValueAt(i, 0).toString();
					String id = dm_time.getValueAt(pro_tab.getSelectedRow(), 0).toString();
					System.out.println(id);
					//pro_tab.getModel().setValueAt(pro_select, pro_tab.getSelectedRow(), 2);
						PreparedStatement pst = connection45.prepareStatement(query);
						/*String eq = equi.getText();
						 equi_int = Integer.parseInt(eq);*/
						String duration = dur.getText();
						int dura = Integer.parseInt(duration);	
						System.out.println(dura);
					//int du = Integer.parseInt(dur.getText());
					//pst.setString(2,id);
					pst.setInt(1, dura);
					pst.setString(2, id);
					
					pst.executeUpdate();
					  connection45.close();
								
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
				
			
		});
		btnUpload_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		//tabbedPane.addTab("Lot in focus", null, lot, null);
		
		JScrollPane scrollPane_7 = new JScrollPane();
		
		JScrollPane scrollPane_9 = new JScrollPane();
		
		JLabel sd = new JLabel("Start date");
		sd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel dd = new JLabel("(dd-mm-yy)");
		dd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblStartTime = new JLabel("Start time");
		lblStartTime.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblinGmt = new JLabel("(In GMT)");
		lblinGmt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_5 = new JTextField();
		tt = new JTextField();
		tt.setColumns(10);
		
		JButton btnSave_3 = new JButton("Save");
		btnSave_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 System.out.println("first " + Integer.parseInt(textField_5.getText()));
				 int n = Integer.parseInt(textField_5.getText());
				inpCheck.first_pro = n; 
				inpCheck.postData();
			}
		});
		btnSave_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JYearChooser yearChooser = new JYearChooser();
		
		JMonthChooser monthChooser = new JMonthChooser();
		
		JDateChooser dateChooser = new JDateChooser();
		
		JLabel lblStartProcess = new JLabel("Start Process");
		lblStartProcess.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
	
		textField_5.setColumns(10);
		
		
		GroupLayout gl_lot = new GroupLayout(lot);
		gl_lot.setHorizontalGroup(
			gl_lot.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_lot.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(scrollPane_7, GroupLayout.PREFERRED_SIZE, 283, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane_9, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_lot.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_lot.createSequentialGroup()
							.addGap(4)
							.addComponent(lblStartProcess))
						.addGroup(gl_lot.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_lot.createSequentialGroup()
								.addGroup(gl_lot.createParallelGroup(Alignment.TRAILING)
									.addComponent(sd, Alignment.LEADING)
									.addComponent(dd, Alignment.LEADING))
								.addGap(58))
							.addGroup(gl_lot.createSequentialGroup()
								.addComponent(monthChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(yearChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_lot.createParallelGroup(Alignment.TRAILING)
							.addComponent(btnSave_3)
							.addComponent(tt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_lot.createSequentialGroup()
							.addGroup(gl_lot.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(textField_5, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
								.addComponent(lblStartTime, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblinGmt, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_lot.setVerticalGroup(
			gl_lot.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_lot.createSequentialGroup()
					.addGroup(gl_lot.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_lot.createSequentialGroup()
							.addGap(43)
							.addGroup(gl_lot.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPane_9, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
								.addComponent(scrollPane_7, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_lot.createSequentialGroup()
							.addGap(58)
							.addComponent(sd)
							.addGap(9)
							.addComponent(dd)
							.addGap(11)
							.addGroup(gl_lot.createParallelGroup(Alignment.LEADING)
								.addComponent(yearChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(monthChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblStartProcess)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_lot.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblStartTime, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblinGmt, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
							.addGap(11)
							.addComponent(tt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(45)
					.addComponent(btnSave_3)
					.addContainerGap(97, Short.MAX_VALUE))
		);
		
		pro_set = new JTable();
		scrollPane_9.setViewportView(pro_set);
		DefaultTableModel dm_pro = new DefaultTableModel();
		Object[] column_pro = {"Process_id","Process_name"};
		dm_pro.setColumnIdentifiers(column_pro);
		pro_set.setModel(dm_pro);
		pro_set.setBackground(SystemColor.control);
		pro_set.setShowVerticalLines(false);
		pro_set.setShowHorizontalLines(false);
		pro_set.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		loc_tab = new JTable();
		scrollPane_7.setViewportView(loc_tab);
		DefaultTableModel dm_loc = new DefaultTableModel();
		lot.setLayout(gl_lot);
		panel_36.add(lot, "lot_in_focus");
		JButton btnNewButton_3 = new JButton("Set Lot in focus");
		btnNewButton_3.setBounds(577, 339, 133, 27);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_36.removeAll();
				panel_36.repaint();
				panel_36.revalidate();
				panel_36.add(lot);
				
				Object[] column_loc = {"Location in focus","Factory_name","City"};
				
				dm_loc.setColumnIdentifiers(column_loc);
				loc_tab.setModel(dm_loc);
				loc_tab.setBackground(SystemColor.control);
				loc_tab.setShowVerticalLines(false);
				loc_tab.setShowHorizontalLines(false);
				loc_tab.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				
				loc_tab.setBorder(null);
				Object[] row = {loc_if1,loc_if2,loc_if3};
		    	dm_loc.addRow(row);		
		    	
		    	String sql = "Select Process_id,Process_name from Process_lib where Space_id = ?";
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection46 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection46 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection46 successful");		
						
						PreparedStatement pst = connection46.prepareStatement(sql);
						pst.setString(1, loc_ifid);
					    ResultSet rs1 = pst.executeQuery();
					    
					    while(rs1.next())
					    {
					    	String id = rs1.getString(1);
					    	String process = rs1.getString(2);
					    	
					    	
					    	Object[] row1 = {id,process};
					    	dm_pro.addRow(row1);
					    	
					    	
					    }
					   System.out.println("Retrieved");
					    connection46.close();
					   
					  }
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
		}
				
			
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		pro_tab = new JTable();
		Object[] column_proc = {"Id","Process"};
		
		dm_time.setColumnIdentifiers(column_proc);
		pro_tab.setModel(dm_time);
		pro_tab.setBackground(SystemColor.control);
		pro_tab.setShowVerticalLines(false);
		pro_tab.setShowHorizontalLines(false);
		pro_tab.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		pro_tab.setBorder(null);
		pro_tab.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
					    if (e.getClickCount() == 1) {
					      JTable target = (JTable)e.getSource();
					      pr_id1 = dm_time.getValueAt(target.getSelectedRow(), 0).toString();
					      // do some action if appropriate column
					      System.out.print(pr_id1);
					      equip();
					      space();
					      
					    }
					  }
					});
			
		pro.setViewportView(pro_tab);
		Time.setLayout(null);
		Time.add(lblTime);
		Time.add(pro);
		Time.add(lblEquipment_1);
		list_1.setBounds(215, 100, 162, 47);
		Time.add(list_1);
		Time.add(sp);
		Time.add(dur);
		Time.add(btnNewButton_3);
		Time.add(btnUpload_1);
		Time.add(lblSpace_1);
		Time.add(lblTime_1);
		Time.add(lblNewLabel_9);
		
		
		
		JPanel Impact = new JPanel();
		tabbedPane.addTab("Impact", null, Impact, null);
		Impact.setLayout(new CardLayout(0, 0));
		
		JPanel panel_35 = new JPanel();
		Impact.add(panel_35, "name_879095363098529");
		
		JLabel lblNewLabel_11 = new JLabel("Impacts Library");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_11.setForeground(Color.RED);
		
		JLabel lblNewLabel_12 = new JLabel("Assign process to EI equivalent");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JScrollPane scrollPane_12 = new JScrollPane();
		JPanel panel_37 = new JPanel();
		Impact.add(panel_37, "p37");
		
		JScrollPane scrollPane_13 = new JScrollPane();
		
		JScrollPane scrollPane_14 = new JScrollPane();
		
		JScrollPane scrollPane_15 = new JScrollPane();
		
		JScrollPane scrollPane_20 = new JScrollPane();
		
		JScrollPane scrollPane_21 = new JScrollPane();
	Object[] column_conf = {"Id","Conf", "Product_type", "Class" , "Process_Name"};
		
		dm_conf.setColumnIdentifiers(column_conf);
		
		JScrollPane scrollPane_36 = new JScrollPane();
		
		GroupLayout gl_panel_37 = new GroupLayout(panel_37);
		gl_panel_37.setHorizontalGroup(
			gl_panel_37.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_37.createSequentialGroup()
					.addGroup(gl_panel_37.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_37.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane_13, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(scrollPane_14, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_37.createSequentialGroup()
							.addGap(116)
							.addComponent(scrollPane_20, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(scrollPane_21, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_panel_37.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_37.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrollPane_15, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_37.createSequentialGroup()
							.addGap(44)
							.addComponent(scrollPane_36, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(18, Short.MAX_VALUE))
		);
		gl_panel_37.setVerticalGroup(
			gl_panel_37.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_37.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_37.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane_15, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane_14, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane_13, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_panel_37.createParallelGroup(Alignment.BASELINE)
						.addComponent(scrollPane_20, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane_21, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane_36, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(22, Short.MAX_VALUE))
		);
		
		table_conf = new JTable();
		scrollPane_36.setViewportView(table_conf);
		table_conf.setModel(dm_conf);
		table_conf.setBackground(SystemColor.control);
		table_conf.setShowVerticalLines(false);
		table_conf.setShowHorizontalLines(false);
		table_conf.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table_conf.setBorder(null);
		
		tb_lcp = new JTable();
		scrollPane_21.setViewportView(tb_lcp);
		Object[] columni = {"process_id" , "Phase"};
		dm_lcp.setColumnIdentifiers(columni);
		tb_lcp.setModel(dm_lcp);
		tb_lcp.setBackground(SystemColor.control);
		tb_lcp.setShowVerticalLines(false);
		tb_lcp.setShowHorizontalLines(false);
		
		
		tb_imp = new JTable();
		scrollPane_20.setViewportView(tb_imp);
		Object[] columnimpact = {"Id","Imp"};
		
		dm_im.setColumnIdentifiers(columnimpact);
		tb_imp.setModel(dm_im);
		tb_imp.setBackground(SystemColor.control);
		tb_imp.setShowVerticalLines(false);
		tb_imp.setShowHorizontalLines(false);
		//Equip_scroll.setViewportView(equip_lib);
		ids = new JTable();
		scrollPane_15.setViewportView(ids);
	
		Object[] column_ids = {"IDS","LongS","LatS","TimeyS", "DuraS","ImpS", "MenS" , "MachS" ,"TransS"};
	
		dm_s.setColumnIdentifiers(column_ids);
		ids.setModel(dm_s);
		ids.setBackground(SystemColor.control);
		ids.setShowVerticalLines(false);
		ids.setShowHorizontalLines(false);
		
		idp = new JTable();
		scrollPane_14.setViewportView(idp);
		Object[] column_idp = {"IDP","LongP","LatP", "TimeyP","DuraP","ImpP", "MenP" , "MachP" ,"TransP"};
		
		dm_p.setColumnIdentifiers(column_idp);
		idp.setModel(dm_p);
		idp.setBackground(SystemColor.control);
		idp.setShowVerticalLines(false);
		idp.setShowHorizontalLines(false);
		
		idc = new JTable();
		scrollPane_13.setViewportView(idc);
	
		
		
		dm_c.setColumnIdentifiers(column_idc);
		idc.setModel(dm_c);
		idc.setBackground(SystemColor.control);
		idc.setShowVerticalLines(false);
		idc.setShowHorizontalLines(false);
		
		panel_37.setLayout(gl_panel_37);
		JPanel panel_38 = new JPanel();
		JButton btnNewButton_7 = new JButton("View Impacts");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/* tabbedPane.removeAll();
	             	tabbedPane.addTab("Environmental Assessment", panel_38);*/
				Impact.removeAll();
				Impact.repaint();
				Impact.revalidate();
				Impact.add(panel_37);
				panel_37.setVisible(true);
				idc.removeAll();
	             	String sql1 = "Drop view if exists p_snew; "; 
					String sql2 ="Create view p_snew as select * from  process_lib natural join space_lib;";
	           String sql3 = "Drop view if exists pidnew;";
	           String sql4 = "Create view pidnew as select id from process_seq order by seq_id;";
	           String sql5 = "Drop view if exists pCnew;";
	          String sql6 = " create view pCnew as select p_snew.process_id as IDC,longitude as LongS,latitude as LatS, timeY as timeY ,duration as DuraS, Imp as ImpS , Op_count as MenS , Equi_count as MachS , transport as TransS from pidnew left join p_snew on pidnew.id=p_snew.process_id;";
					try{
						Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
						 Connection connection56 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
						 Connection connection56 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
						//JOptionPane.showMessageDialog(null, "connection56 successful");		
							
							Statement pst = connection56.createStatement();
							pst.addBatch(sql1);
							pst.addBatch(sql2);
							pst.addBatch(sql3);
							pst.addBatch(sql4);
							pst.addBatch(sql5);
							pst.addBatch(sql6);
							//PreparedStatement pst = connection56.prepareStatement(res);
							//pst1.executeUpdate();
							pst.executeBatch();
						    ResultSet rs2 = pst.executeQuery( "Select * from pCnew");
						    
						    while(rs2.next())
						    {
						    	String idc = rs2.getString(1);
						    	String longc = rs2.getString(2);
						    	String latc = rs2.getString(3);
						    	String durac = rs2.getString(5);
						    	String timey = rs2.getString(4);
						    	String imp = rs2.getString(6);
						    	String men = rs2.getString(7);
						    	String mach = rs2.getString(8);
						    	String trans = rs2.getString(9);
						    	
						    	Object[] row = {idc,longc,latc,timey,durac,imp, men, mach,trans};
						    	dm_c.addRow(row);
						    	System.out.print("IDC");
						    	
						    }
						    connection56.close();
						  }
					catch(Exception ex)
					{
						ex.printStackTrace();
					}
					
				
					String sql12 = "Drop view if exists p_snew; "; 
					String sql7 ="Create view p_snew as select * from process_lib natural join space_lib;";
	           String sql8 = "Drop view if exists pidnew;";
	           String sql9 = "Create view pidnew as select pre_pro from process_seq order by seq_id;";
	           String sql10 = "Drop view if exists pPnew;";
	          String sql11 = " create view pPnew as select p_snew.process_id as IDP,longitude as LongS,latitude as LatS, timeY as timeY ,duration as DuraS, Imp as ImpS , Op_count as MenS , Equi_count as MachS , transport as TransS from pidnew left join p_snew on pidnew.pre_pro=p_snew.process_id;";
					try{
						Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
						 Connection connection57 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
						 Connection connection57 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
						//JOptionPane.showMessageDialog(null, "connection56 successful");		
							
							Statement pst = connection57.createStatement();
							pst.addBatch(sql12);
							pst.addBatch(sql7);
							pst.addBatch(sql8);
							pst.addBatch(sql9);
							pst.addBatch(sql10);
							pst.addBatch(sql11);
							//PreparedStatement pst = connection56.prepareStatement(res);
							//pst1.executeUpdate();
							pst.executeBatch();
						    ResultSet rs2 = pst.executeQuery( "Select * from pPnew");
						    
						    while(rs2.next())
						    {
						    	String idc = rs2.getString(1);
						    	String longc = rs2.getString(2);
						    	String latc = rs2.getString(3);
						    	String durac = rs2.getString(5);
						    	String timey = rs2.getString(4);
						    	String imp = rs2.getString(6);
						    	String men = rs2.getString(7);
						    	String mach = rs2.getString(8);
						    	String trans = rs2.getString(9);
						    	
						    	Object[] row = {idc,longc,latc,timey,durac,imp, men, mach,trans};
						    	dm_p.addRow(row);
						    	System.out.print("IDP");
						    	
						    }
						    connection57.close();
						    //dm_p.removeRow(0);
						  }
					catch(Exception ex)
					{
						ex.printStackTrace();
					}
					
				String sql13 = "Drop view if exists p_snew; "; 
				String sql14 ="Create view p_snew as select * from process_lib natural join space_lib;";
           String sql15 = "Drop view if exists pidnew;";
           String sql16 = "Create view pidnew as select suc_pro from process_seq order by seq_id;";
           String sql17 = "Drop view if exists pSnew;";
          String sql18 = " create view pSnew as select p_snew.process_id as IDS,longitude as LongS,latitude as LatS, timeY as timeY ,duration as DuraS, Imp as ImpS , Op_count as MenS , Equi_count as MachS , transport as TransS from pidnew left join p_snew on pidnew.suc_pro=p_snew.process_id;";
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection57 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection57 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection56 successful");		
						
						Statement pst = connection57.createStatement();
						pst.addBatch(sql13);
						pst.addBatch(sql14);
						pst.addBatch(sql15);
						pst.addBatch(sql16);
						pst.addBatch(sql17);
						pst.addBatch(sql18);
						//PreparedStatement pst = connection56.prepareStatement(res);
						//pst1.executeUpdate();
						pst.executeBatch();
					    ResultSet rs2 = pst.executeQuery( "Select * from pSnew");
					    
					    while(rs2.next())
					    {
					    	String idc = rs2.getString(1);
					    	String longc = rs2.getString(2);
					    	String latc = rs2.getString(3);
					    	String durac = rs2.getString(5);
					    	String timey = rs2.getString(4);
					    	String imp = rs2.getString(6);
					    	String men = rs2.getString(7);
					    	String mach = rs2.getString(8);
					    	String trans = rs2.getString(9);
					    	
					    	Object[] row = {idc,longc,latc,timey,durac,imp, men, mach,trans};
					    	dm_s.addRow(row);
					    	System.out.print("IDS");
					    	
					    }
					    connection57.close();
					  }
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				String sql_lc = "Select Process_id,Lc_id from Process_lib";
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection68 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection68 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection68 successful");		
						
						PreparedStatement pst = connection68.prepareStatement(sql_lc);
					    ResultSet rs1 = pst.executeQuery();
					    
					    while(rs1.next())
					    {
					    	String id = rs1.getString(1);
					    		String lc = rs1.getString(2);
					    	Object[] row = {id , lc};
					    	dm_lcp.addRow(row);
					    	
					    }
					    connection68.close();
					   	dm_lcp.removeRow(0);				
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}

				String sql_im = "Select Process_id, Imp  from Process_lib";
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection68 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection68 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection68 successful");		
						
						PreparedStatement pst = connection68.prepareStatement(sql_im);
					    ResultSet rs1 = pst.executeQuery();
					    
					    while(rs1.next())
					    {
					    	String id = rs1.getString(1);
					    	
					    	String im = rs1.getString(2);
					    	Object[] row = {id ,im};
					    	dm_im.addRow(row);
					    	
					    }
					    connection68.close();
					   		dm_im.removeRow(0);			
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				String sql_con = "Select Process_id, Conf , Part_nm, Class , Process_name from Process_lib";
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection68 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection68 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection68 successful");		
						
						PreparedStatement pst = connection68.prepareStatement(sql_con);
					    ResultSet rs1 = pst.executeQuery();
					    
					    while(rs1.next())
					    {
					    	String id = rs1.getString(1);
					    	
					    	String conf = rs1.getString(2);
					    	String part_nm = rs1.getString(3);
					    	String clas = rs1.getString(4);
					    	String pro_nm = rs1.getString(5);
					    	Object[] row = {id, conf, part_nm, clas , pro_nm};
					    	dm_conf.addRow(row);
					    	
					    }
					    connection68.close();
					   		dm_conf.removeRow(0);			
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				
				
				
				/*try {
					exportTable(dm_c, new File("M:\\templates\\IDC.xls"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}*/

				/*try {
					exportTable(dm_p, new File("M:\\templates\\IDP.xls"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				try {
					exportTable(dm_s, new File("M:\\templates\\IDS.xls"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}*/
				
				try {
<<<<<<< HEAD
					exportTable(dm_im, new File(startDir+"\\templates\\processImpact.xls"));
=======
					exportTable(dm_im, new File("M:\\templates\\processImpact.xls"));
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				try {
<<<<<<< HEAD
					exportTable(dm_lcp, new File(startDir+"\\templates\\processLCPhase.xls"));
=======
					exportTable(dm_lcp, new File("M:\\templates\\processLCPhase.xls"));
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				try {
<<<<<<< HEAD
					exportTable(dm_conf, new File(startDir+"\\templates\\processConf.xls"));
=======
					exportTable(dm_conf, new File("M:\\templates\\processConf.xls"));
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				//exportidc();
				exportidc();
				exportidp();
				exportids();
				//exportplc();
				//String path=("cmd.exe") , "/c" , "Start" , "M:\\templates\\process.bat");
				//Runtime run=Runtime.getRuntime();
				try {
					//Process pr=Runtime.getRuntime().exec("cmd.exe", "Start" , "M:\\templates\\process.bat");
<<<<<<< HEAD
					Process pr=Runtime.getRuntime().exec("cmd /c start "+startDir+"\\templates\\header.vbs");
=======
					Process pr=Runtime.getRuntime().exec("cmd /c start M:\\templates\\header.vbs");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					System.out.println("batch file executed_header");
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				//Runtime rn=Runtime.getRuntime();
				/*try {
					//Process pr=Runtime.getRuntime().exec("cmd.exe", "Start" , "M:\\templates\\process.bat");
					Process pr=Runtime.getRuntime().exec("cmd /c start M:\\templates\\process.bat");
					System.out.println("batch file executed_process");
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}*/
				
				//DisplayFrameTree_viz dsv = new DisplayFrameTree_viz();
				//tree_imp.main(arg );
				try {
					//Process pr=Runtime.getRuntime().exec("cmd.exe", "Start" , "M:\\templates\\process.bat");
<<<<<<< HEAD
					Process pr=Runtime.getRuntime().exec("cmd /c start "+startDir+"\\templates\\testVba.vbs");
=======
					Process pr=Runtime.getRuntime().exec("cmd /c start M:\\templates\\testVba.vbs");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					System.out.println("batch file executed_header");
				} catch (IOException e1) {
					
					e1.printStackTrace();
				
			}
			}	
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_13 = new JLabel("Search equivalent Eco-Invent Process");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JScrollPane scrollPane_16 = new JScrollPane();
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dm_ei.setRowCount(0);
				String sql = "Select distinct Material_name, Material_type, Country from EI_new where Material_Name like '%"  + search_nm.getText() +  "%' ;";
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection7 successful");		
						
						PreparedStatement pst = connection16.prepareStatement(sql);
					    ResultSet rs1 = pst.executeQuery();
					    
					    while(rs1.next())
					    {
					    	String mat_nm = rs1.getString(1);
					    	String mat_typ = rs1.getString(2);
					    	String con= rs1.getString(3);
					    	
					    	Object[] row = {mat_nm , mat_typ , con};
					    	dm_ei.addRow(row);
					    	//System.out.print("Yes");
					    	
					    }
					    connection16.close();
					  }
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				
			}
		});
		
		search_nm = new JTextField();
		search_nm.setColumns(10);
		
		as_sp = new JTextField();
		as_sp.setColumns(10);
		
		JLabel lblAssignedSpace = new JLabel("Assigned space");
		lblAssignedSpace.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblTemporalFactor = new JLabel("Spatial Factor");
		lblTemporalFactor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JComboBox sp_combo = new JComboBox();
		
		JButton btnNewButton_8 = new JButton("Add");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch( sp_combo.getSelectedItem().toString())
				{
				case ("Local"): 
					spf = 1.00;
				break;
				case ("Country"): 
					spf = 0.95;
				break;
				case ("Continent"): 
					spf = 0.85;
				break;
				case ("other"): 
					spf = 0.75;
				break;
				case (" "): 
					spf = 0.70;
				}
				
				
				System.out.println(spf);
				conf = spf * tempf * 100 ;
				System.out.println(conf);
				
				mat = dm_ei.getValueAt(table_ei.getSelectedRow(), 0).toString(); 
				instance = dm_imp.getValueAt(pro_imp.getSelectedRow(), 2).toString();
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection85 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection85 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					// JOptionPane.showMessageDialog(null, "connection1 successful");
					
					String new_sql =( "Select weight from macro_ex where Inst_nm = ?");
					
							PreparedStatement pst = connection85.prepareStatement(new_sql);
							pst.setString(1, instance);
							ResultSet rs1 = pst.executeQuery();
						    
						    while(rs1.next())
						    {
						    	imp_wt = rs1.getDouble(1);
						    	 System.out.println();
						    	 System.out.print(" Weight" + imp_wt);
						     }
						    connection85.close();
						  }
					catch(Exception ex)
					{
						ex.printStackTrace();
					}
				finally {
					try{
					rs.close(); prepared.close(); }//connection1.close(); }
					catch(Exception e1) { } 
				
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection85 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection85 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					// JOptionPane.showMessageDialog(null, "connection1 successful");
					
					String new_sql =( "Select Total from EI_new where Material_name=?");
					
							PreparedStatement pst = connection85.prepareStatement(new_sql);
							pst.setString(1, mat);
							ResultSet rs1 = pst.executeQuery();
						    
						    while(rs1.next())
						    {
						    	 tot = rs1.getDouble(1);
						    	 System.out.println();
						    	 System.out.println(" Impact " + tot);
						     }
						    connection85.close();
						  }
					catch(Exception ex)
					{
						ex.printStackTrace();
					}
				finally {
					try{
					rs.close(); prepared.close(); }//connection1.close(); }
					catch(Exception e1) { } 
					
					sum_tot = imp_wt * tot;
					System.out.println("Sum total impact "  + sum_tot);
					
					
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection1 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection1 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					// JOptionPane.showMessageDialog(null, "connection1 successful");
					
					String insertTableSQL =( "Update Process_lib SET conf=?,mat_nm=?,Imp=? where Process_id=?");
					prepared = connection1.prepareStatement(insertTableSQL);
					
					prepared.setDouble(1, conf);
					prepared.setString(2, mat);
					prepared.setDouble(3, sum_tot);
					prepared.setString(4,  pro_imp1);
					

					// execute insert SQL statement
					prepared.executeUpdate();
					
					System.out.println("Record is inserted into Project_lib table!");
					connection1.close();
			    } catch ( Exception e1 ) {
			      System.err.println( e1.getClass().getName() + ": " + e1.getMessage() );
			     e1.printStackTrace();
			    
			    }
				finally {
					try{
					rs.close(); prepared.close(); }//connection1.close(); }
					catch(Exception e1) { } }
			
			}}}
		});
		GroupLayout gl_panel_35 = new GroupLayout(panel_35);
		gl_panel_35.setHorizontalGroup(
			gl_panel_35.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_35.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_35.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_35.createSequentialGroup()
							.addComponent(lblNewLabel_11, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblNewLabel_12)
							.addPreferredGap(ComponentPlacement.RELATED, 328, Short.MAX_VALUE))
						.addGroup(gl_panel_35.createSequentialGroup()
							.addComponent(lblNewLabel_13)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(search_nm, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_35.createParallelGroup(Alignment.LEADING)
								.addComponent(btnSearch, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_35.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
									.addComponent(btnNewButton_7, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel_35.createSequentialGroup()
							.addComponent(scrollPane_12, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrollPane_16, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_panel_35.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_35.createSequentialGroup()
									.addGap(18)
									.addGroup(gl_panel_35.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_35.createSequentialGroup()
											.addComponent(lblAssignedSpace)
											.addGap(18)
											.addComponent(as_sp, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
										.addGroup(gl_panel_35.createSequentialGroup()
											.addComponent(lblTemporalFactor, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(sp_combo, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))))
								.addGroup(gl_panel_35.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnNewButton_8)
									.addGap(49)))))
					.addGap(39))
		);
		gl_panel_35.setVerticalGroup(
			gl_panel_35.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_35.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_35.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_11)
						.addComponent(lblNewLabel_12))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_35.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_13, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
						.addComponent(search_nm, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSearch))
					.addGap(8)
					.addGroup(gl_panel_35.createParallelGroup(Alignment.BASELINE)
						.addComponent(scrollPane_12, GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
						.addComponent(scrollPane_16, GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
						.addGroup(gl_panel_35.createSequentialGroup()
							.addGroup(gl_panel_35.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_35.createSequentialGroup()
									.addComponent(lblAssignedSpace)
									.addGap(27)
									.addGroup(gl_panel_35.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblTemporalFactor, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
										.addComponent(sp_combo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addComponent(as_sp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(35)
							.addComponent(btnNewButton_8)))
					.addGap(18)
					.addComponent(btnNewButton_7, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		
		sp_combo.addItem("Local");
		sp_combo.addItem("Country");
		sp_combo.addItem("Continent");
		sp_combo.addItem("Other");
		
		table_ei = new JTable();
		scrollPane_16.setViewportView(table_ei);
		Object[] column_ei = {"Material Name","Material Type" , "Country"};
		dm_ei.setColumnIdentifiers(column_ei);
		table_ei.setModel(dm_ei);
		table_ei.setBackground(SystemColor.control);
		table_ei.setShowVerticalLines(false);
		table_ei.setShowHorizontalLines(false);
		
		
		table_ei.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
					    if (e.getClickCount() == 1) {
					      JTable target = (JTable)e.getSource();
					      space_ei = dm_ei.getValueAt(target.getSelectedRow(), 2).toString();
					      // do some action if appropriate column
					      System.out.print(space_ei);
					     
					      imp_space();
					      
					    }
					  }
					});
		pro_imp = new JTable();
		scrollPane_12.setViewportView(pro_imp);
		panel_35.setLayout(gl_panel_35);
		
		Object[] columnimp = {"Id","Process", "Assigned Part name"};
	
		dm_imp.setColumnIdentifiers(columnimp);
		pro_imp.setModel(dm_imp);
		pro_imp.setBackground(SystemColor.control);
		pro_imp.setShowVerticalLines(false);
		pro_imp.setShowHorizontalLines(false);
		scrollPane_12.setViewportView(pro_imp);
			
		tabbedPane.addTab("Environment Assessment", null, panel_38, null);
		panel_38.setLayout(new CardLayout(0, 0));
		
		JPanel ea_pane = new JPanel();
		panel_38.add(ea_pane, "name_2031135168159224");
		ea_pane.setLayout(null);
		String[] _args1 = null;
		JButton btnNewButton_9 = new JButton("View Space-Time network");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//dynmaps14.main(_args1);
			DisplayFramewo dis = new DisplayFramewo();
				/*javax.swing.JPanel panel = new javax.swing.JPanel();
		        panel.setBounds(20, 20, 600, 600);
				 processing.core.PApplet sketch = new dynmaps14();
				 panel.add(sketch);
				 getContentPane().add(panel);
				 sketch.init();*/
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_9.setBounds(27, 80, 189, 40);
		ea_pane.add(btnNewButton_9);
		String[] _args = null;
		JButton btnNewButton_18 = new JButton("Network");
		JButton btnViewImpacts = new JButton("View Impacts");
		JButton btnSpace = new JButton("Space");
		btnSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*Inputcheckdisp inp = new Inputcheckdisp();
				try {
					//Process pr=Runtime.getRuntime().exec("cmd.exe", "Start" , "M:\\templates\\process.bat");
					Process pr=Runtime.getRuntime().exec("cmd /c start M:\\templates\\duration.bat");
					System.out.println("batch file executed_duration");
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}*/
				DisplayFrame_space dsp = new DisplayFrame_space();
			}
		});
		btnSpace.setVisible(false);
		JButton btnProductStructure = new JButton("Product Structure");
		JButton btnLcPhase = new JButton("LC Phase");
		btnViewImpacts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_18.setVisible(true);
				btnSpace.setVisible(true);
				btnProductStructure.setVisible(true);
				btnLcPhase.setVisible(true);
				Inputcheckdisp inp = new Inputcheckdisp();
				try {
					//Process pr=Runtime.getRuntime().exec("cmd.exe", "Start" , "M:\\templates\\process.bat");
<<<<<<< HEAD
					Process pr=Runtime.getRuntime().exec("cmd /c start "+startDir+"\\templates\\duration.vbs");
=======
					Process pr=Runtime.getRuntime().exec("cmd /c start M:\\templates\\duration.vbs");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					System.out.println("batch file executed_duration");
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
			}
		});
		btnViewImpacts.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnViewImpacts.setBounds(27, 142, 180, 42);
		ea_pane.add(btnViewImpacts);
		
		JLabel lblEnvironmentAssessment = new JLabel("Environment assessment");
		lblEnvironmentAssessment.setForeground(Color.RED);
		lblEnvironmentAssessment.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEnvironmentAssessment.setBounds(10, 11, 231, 19);
		ea_pane.add(lblEnvironmentAssessment);
		JPanel panel_50 = new JPanel();
		JButton btnNewButton_16 = new JButton("Confirm Relations");
		btnNewButton_16.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_38.removeAll();
				panel_38.repaint();
				panel_38.revalidate();
				panel_38.add(panel_50);
				lmr.removeAllElements();
				
				//pro_select = dm_time.getValueAt(pro_tab.getSelectedRow(), 0).toString();
				String sql_rel = "SELECT DISTINCT * FROM Relations_info order by Rid";
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection7 successful");		
						
						PreparedStatement pst = connection16.prepareStatement(sql_rel);
						//pst.setString(1,pro_select);
						ResultSet rs = pst.executeQuery();
						while(rs.next())
						{
							int id = rs.getInt("rid");
							String name = rs.getString("name");
						
					        lmr.addElement(name);
						}
						list_rel.setModel(lmr);
					    connection16.close();
					   
					  }
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		btnNewButton_16.setBounds(27, 205, 180, 40);
		ea_pane.add(btnNewButton_16);
		
		
		btnNewButton_18.setVisible(false);
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//InputcheckdispAR disp = new InputcheckdispAR();
				Inputcheckdisp disp = new Inputcheckdisp();
				DisplayFrame dis = new DisplayFrame();
			}
		});
		btnNewButton_18.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_18.setBounds(309, 145, 148, 40);
		ea_pane.add(btnNewButton_18);
		
		
		btnSpace.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSpace.setBounds(309, 205, 148, 40);
		ea_pane.add(btnSpace);
		
	
		btnProductStructure.setVisible(false);
		btnProductStructure.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] arg = null;
				
				DisplayFrameTree dt = new DisplayFrameTree();
			}
		});
		btnProductStructure.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnProductStructure.setBounds(309, 265, 148, 40);
		ea_pane.add(btnProductStructure);
		
	
		btnLcPhase.setVisible(false);
		btnLcPhase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DisplayFrameLC lcd = new DisplayFrameLC();
			}
		});
		btnLcPhase.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLcPhase.setBounds(309, 321, 148, 40);
		ea_pane.add(btnLcPhase);
		
	
		panel_38.add(panel_50, "name_2942920429862068");
		
		JLabel lblRelations = new JLabel("Relations");
		lblRelations.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnNewButton_17 = new JButton("View Relations");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String rel_name = list_rel.getSelectedValue().toString();

				String sql1 = "Drop view if exists p_snew; "; 
				String sql2 ="Create view p_snew as select * from  " + rel_name + " natural join space_lib;";
           String sql3 = "Drop view if exists pidnew;";
           String sql4 = "Create view pidnew as select id from process_seq order by seq_id;";
           String sql5 = "Drop view if exists pCnew;";
          String sql6 = " create view pCnew as select p_snew.process_id as IDC,longitude as LongS,latitude as LatS, timeY as timeY ,duration as DuraS, Imp as ImpS , Op_count as MenS , Equi_count as MachS , transport as TransS from pidnew left join p_snew on pidnew.id=p_snew.process_id;";
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection56 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection56 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection56 successful");		
						
						Statement pst = connection56.createStatement();
						pst.addBatch(sql1);
						pst.addBatch(sql2);
						pst.addBatch(sql3);
						pst.addBatch(sql4);
						pst.addBatch(sql5);
						pst.addBatch(sql6);
						//PreparedStatement pst = connection56.prepareStatement(res);
						//pst1.executeUpdate();
						pst.executeBatch();
					    ResultSet rs2 = pst.executeQuery( "Select * from pCnew");
					    
					    while(rs2.next())
					    {
					    	String idc = rs2.getString(1);
					    	String longc = rs2.getString(2);
					    	String latc = rs2.getString(3);
					    	String durac = rs2.getString(5);
					    	String timey = rs2.getString(4);
					    	String imp = rs2.getString(6);
					    	String men = rs2.getString(7);
					    	String mach = rs2.getString(8);
					    	String trans = rs2.getString(9);
					    	
					    	Object[] row = {idc,longc,latc,timey,durac,imp, men, mach,trans};
					    	dm_idc.addRow(row);
					    	System.out.print("IDC");
					    	
					    }
					    connection56.close();
					  }
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				
				String sql12 = "Drop view if exists p_snew; "; 
				String sql7 ="Create view p_snew as select * from "+rel_name +"  natural join space_lib;";
           String sql8 = "Drop view if exists pidnew;";
           String sql9 = "Create view pidnew as select pre_pro from process_seq order by seq_id;";
           String sql10 = "Drop view if exists pPnew;";
          String sql11 = " create view pPnew as select p_snew.process_id as IDP,longitude as LongS,latitude as LatS, timeY as timeY ,duration as DuraS, Imp as ImpS , Op_count as MenS , Equi_count as MachS , transport as TransS from pidnew left join p_snew on pidnew.pre_pro=p_snew.process_id;";
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection57 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection57 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection56 successful");		
						
						Statement pst = connection57.createStatement();
						pst.addBatch(sql12);
						pst.addBatch(sql7);
						pst.addBatch(sql8);
						pst.addBatch(sql9);
						pst.addBatch(sql10);
						pst.addBatch(sql11);
						//PreparedStatement pst = connection56.prepareStatement(res);
						//pst1.executeUpdate();
						pst.executeBatch();
					    ResultSet rs2 = pst.executeQuery( "Select * from pPnew");
					    
					    while(rs2.next())
					    {
					    	String idc = rs2.getString(1);
					    	String longc = rs2.getString(2);
					    	String latc = rs2.getString(3);
					    	String durac = rs2.getString(5);
					    	String timey = rs2.getString(4);
					    	String imp = rs2.getString(6);
					    	String men = rs2.getString(7);
					    	String mach = rs2.getString(8);
					    	String trans = rs2.getString(9);
					    	
					    	Object[] row = {idc,longc,latc,timey,durac,imp, men, mach,trans};
					    	dm_idp.addRow(row);
					    	System.out.print("IDP");
					    	
					    }
					    connection57.close();
					  }
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				
				String sql13 = "Drop view if exists p_snew; "; 
				String sql14 ="Create view p_snew as select * from "+ rel_name + " natural join space_lib;";
           String sql15 = "Drop view if exists pidnew;";
           String sql16 = "Create view pidnew as select suc_pro from process_seq order by seq_id;";
           String sql17 = "Drop view if exists pSnew;";
          String sql18 = " create view pSnew as select p_snew.process_id as IDS,longitude as LongS,latitude as LatS, timeY as timeY ,duration as DuraS, Imp as ImpS , Op_count as MenS , Equi_count as MachS , transport as TransS from pidnew left join p_snew on pidnew.suc_pro=p_snew.process_id;";
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection57 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection57 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection56 successful");		
						
						Statement pst = connection57.createStatement();
						pst.addBatch(sql13);
						pst.addBatch(sql14);
						pst.addBatch(sql15);
						pst.addBatch(sql16);
						pst.addBatch(sql17);
						pst.addBatch(sql18);
						//PreparedStatement pst = connection56.prepareStatement(res);
						//pst1.executeUpdate();
						pst.executeBatch();
					    ResultSet rs2 = pst.executeQuery( "Select * from pSnew");
					    
					    while(rs2.next())
					    {
					    	String idc = rs2.getString(1);
					    	String longc = rs2.getString(2);
					    	String latc = rs2.getString(3);
					    	String durac = rs2.getString(5);
					    	String timey = rs2.getString(4);
					    	String imp = rs2.getString(6);
					    	String men = rs2.getString(7);
					    	String mach = rs2.getString(8);
					    	String trans = rs2.getString(9);
					    	
					    	Object[] row = {idc,longc,latc,timey,durac,imp, men, mach,trans};
					    	dm_ids.addRow(row);
					    	System.out.print("IDS");
					    	
					    }
					    connection57.close();
					  }
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				
				String sql_lc = "Select Process_id, Lc_id from " + rel_name;
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection68 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection68 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection68 successful");		
						
						PreparedStatement pst = connection68.prepareStatement(sql_lc);
					    ResultSet rs1 = pst.executeQuery();
					    
					    while(rs1.next())
					    {
					    	String id = rs1.getString(1);
					    	//String pnm = rs1.getString(2);
					    	String lc = rs1.getString(2);
					    	Object[] row = {id , lc};
					    	dm_lcpa.addRow(row);
					    	
					    }
					    connection68.close();
					   					
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				
				String sql_im = "Select Process_id, Imp  from " + rel_name;
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection68 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection68 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection68 successful");		
						
						PreparedStatement pst = connection68.prepareStatement(sql_im);
					    ResultSet rs1 = pst.executeQuery();
					    
					    while(rs1.next())
					    {
					    	String id = rs1.getString(1);
					    	
					    	String im = rs1.getString(2);
					    	Object[] row = {id ,im};
					    	dm_impa.addRow(row);
					    	
					    }
					    connection68.close();
					   	dm_impa.removeRow(0);				
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				
				/*exportidca();
				exportidpa();
				exportidsa();*/
				//exportlcpa();
				try {
					//exportTable(dm_idc, new File("M:\\Relations\\" + response +"\\IDCA.xls"));
<<<<<<< HEAD
					exportTable(dm_idc, new File(startDir+"\\templates\\IDCA.xls"));
=======
					exportTable(dm_idc, new File("M:\\templates\\IDCA.xls"));
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				try {
					//exportTable(dm_idp, new File("M:\\Relations\\" + response +"\\IDPA.xls"));
<<<<<<< HEAD
					exportTable(dm_idp, new File(startDir+"\\templates\\IDPA.xls"));
=======
					exportTable(dm_idp, new File("M:\\templates\\IDPA.xls"));
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				try {
					//exportTable(dm_ids, new File("M:\\Relations\\" + response +"\\IDSA.xls"));
<<<<<<< HEAD
					exportTable(dm_ids, new File(startDir+"\\templates\\IDSA.xls"));
=======
					exportTable(dm_ids, new File("M:\\templates\\IDSA.xls"));
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
				try {
					//exportTable(dm_ids, new File("M:\\Relations\\" + response +"\\IDSA.xls"));
<<<<<<< HEAD
					exportTable(dm_impa, new File(startDir+"\\templates\\processImpactAR.xls"));
=======
					exportTable(dm_impa, new File("M:\\templates\\processImpactAR.xls"));
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					//exportTable(dm_ids, new File("M:\\Relations\\" + response +"\\IDSA.xls"));
<<<<<<< HEAD
					exportTable(dm_lcpa, new File(startDir+"\\templates\\processLCPhaseAR.xls"));
=======
					exportTable(dm_lcpa, new File("M:\\templates\\processLCPhaseAR.xls"));
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
<<<<<<< HEAD
				String path=startDir+"\\templates\\processAR.bat";
=======
				String path="M:\\templates\\processAR.bat";
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				Runtime rn=Runtime.getRuntime();
				try {
					Process pr=rn.exec(path);
					System.out.println("batch file executed");
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				Inputcheckdisp disp = new Inputcheckdisp();
				DisplayFrameAR dis = new DisplayFrameAR();
				
				
			}
		});
		
		
		GroupLayout gl_panel_50 = new GroupLayout(panel_50);
		gl_panel_50.setHorizontalGroup(
			gl_panel_50.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_50.createSequentialGroup()
					.addGroup(gl_panel_50.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_50.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblRelations))
						.addGroup(gl_panel_50.createSequentialGroup()
							.addGap(50)
							.addComponent(list_rel, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
							.addGap(110)
							.addComponent(btnNewButton_17)))
					.addContainerGap(275, Short.MAX_VALUE))
		);
		gl_panel_50.setVerticalGroup(
			gl_panel_50.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_50.createSequentialGroup()
					.addGroup(gl_panel_50.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_50.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblRelations)
							.addGap(41)
							.addComponent(list_rel, GroupLayout.PREFERRED_SIZE, 352, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_50.createSequentialGroup()
							.addGap(80)
							.addComponent(btnNewButton_17)))
					.addContainerGap(53, Short.MAX_VALUE))
		);
		panel_50.setLayout(gl_panel_50);
		
		JPanel panel_39 = new JPanel();
		//tabbedPane.addTab("Assign Relations", null, panel_39, null);
		panel_39.setLayout(new CardLayout(0, 0));
		
		JPanel panel_40 = new JPanel();
		panel_39.add(panel_40, "name_4709381796756");
		panel_40.setLayout(null);
		
		
		JLabel lblAssignRelations = new JLabel("Assign Relations");
		lblAssignRelations.setForeground(Color.RED);
		lblAssignRelations.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAssignRelations.setBounds(10, 11, 231, 19);
		panel_40.add(lblAssignRelations);
		JPanel panel_42 = new JPanel();
		panel_39.add(panel_42, "name_12776122384752");
		
		JButton btnNewButton_10 = new JButton("Change Process");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_39.removeAll();
				panel_39.repaint();
				panel_39.revalidate();
				panel_39.add(panel_42);
				panel_42.setVisible(true);
				String sql = "Select Process_id, Process_name from " + response;
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection65 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection65 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection7 successful");		
						
						PreparedStatement pst = connection65.prepareStatement(sql);
					    ResultSet rs1 = pst.executeQuery();
					    
					    while(rs1.next())
					    {
					    	String id = rs1.getString(1);
					    	String nm = rs1.getString(2);
					    	
					    	Object[] row = {id,nm};
					    	dm_ap.addRow(row);
					    	System.out.print("Yes");
					    	
					    }
					    connection65.close();
					  }
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				}
				});
			
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_10.setBounds(41, 123, 155, 23);
		panel_40.add(btnNewButton_10);
		JPanel panel_41 = new JPanel();
		JButton btnChangeEquipment = new JButton("Change Equipment");
		btnChangeEquipment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_39.removeAll();
				panel_39.repaint();
				panel_39.revalidate();
				panel_39.add(panel_41);
				panel_41.setVisible(true);
				
				String sql4 = "Select equip_id,equip_name from Equip_lib ";
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection19 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection19 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection19 successful");		
						
						PreparedStatement pst = connection19.prepareStatement(sql4);
					    ResultSet rs1 = pst.executeQuery();
					    
					    while(rs1.next())
					    {
					    	String id = rs1.getString(1);
					    	String equi = rs1.getString(2);
					    	Object[] row = { id,equi};
					    	dm_ea.addRow(row);
					    	
					    }
					    connection19.close();
					    dm_ea.removeRow(0);
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				
				String sql5 = "Select eq_id, eq_nm from Equip_alt ";
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection66 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection66 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection19 successful");		
						
						PreparedStatement pst = connection66.prepareStatement(sql5);
					    ResultSet rs1 = pst.executeQuery();
					    
					    while(rs1.next())
					    {
					    	String id = rs1.getString(1);
					    	String equi = rs1.getString(2);
					    	Object[] row = { id,equi};
					    	dm_eaq.addRow(row);
					    }
					    connection66.close();
					   dm_eaq.removeRow(0);
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				
			}
		});
		btnChangeEquipment.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnChangeEquipment.setBounds(41, 157, 155, 23);
		panel_40.add(btnChangeEquipment);
		
		JPanel panel_52 = new JPanel();
		panel_39.add(panel_52, "name_352460670380498");
		
		JScrollPane scrollPane_38 = new JScrollPane();
		
		JScrollPane scrollPane_39 = new JScrollPane();
		
		JComboBox comboBox_7 = new JComboBox();
		
		JCheckBox chckbxIsShippingInvolved_1 = new JCheckBox("Is shipping involved?");
		
		JComboBox comboBox_8 = new JComboBox();
		
		JComboBox comboBox_9 = new JComboBox();
		GroupLayout gl_panel_52 = new GroupLayout(panel_52);
		gl_panel_52.setHorizontalGroup(
			gl_panel_52.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_52.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_39, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(scrollPane_38, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel_52.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_52.createSequentialGroup()
							.addGap(56)
							.addComponent(comboBox_7, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_52.createSequentialGroup()
							.addGap(42)
							.addGroup(gl_panel_52.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel_52.createSequentialGroup()
									.addComponent(comboBox_8, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(comboBox_9, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
								.addComponent(chckbxIsShippingInvolved_1))))
					.addContainerGap(67, Short.MAX_VALUE))
		);
		gl_panel_52.setVerticalGroup(
			gl_panel_52.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_52.createSequentialGroup()
					.addGap(78)
					.addGroup(gl_panel_52.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_52.createSequentialGroup()
							.addComponent(comboBox_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(chckbxIsShippingInvolved_1)
							.addGap(33)
							.addGroup(gl_panel_52.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboBox_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(scrollPane_39, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane_38, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(122, Short.MAX_VALUE))
		);
		
		table_1 = new JTable();
		scrollPane_38.setViewportView(table_1);
		
		table = new JTable();
		scrollPane_39.setViewportView(table);
		panel_52.setLayout(gl_panel_52);
		
		JPanel panel_43 = new JPanel();
		panel_39.add(panel_43, "name_12776122384752");
		
		
		JButton btnChangeSpace = new JButton("Change Space");
		btnChangeSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_39.removeAll();
				panel_39.repaint();
				panel_39.revalidate();
				panel_39.add(panel_43);
				panel_43.setVisible(true);
				
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
				 Connection connection69 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
				 Connection connection69 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				//JOptionPane.showMessageDialog(null, "connection7 successful");		
					String query =( "SELECT Space_id , Space_role || ' ' || country||' ' ||city||' ' ||state || ' ' ||continent FROM Space_lib");
					PreparedStatement pst = connection69.prepareStatement(query);
				    ResultSet rs1 = pst.executeQuery();
				    
				    
				    while(rs1.next())
				    {
				    	String id = rs1.getString(1);
				    	String nm = rs1.getString(2);
				    	Object[] row = {id , nm };
				    	dm_spa.addRow(row);
				     	
				    }
				    connection69.close();
				   // System.out.println("data retrieved");
				dm_spa.removeRow(0);
				}
				catch ( Exception e1 )
				{
		      System.err.println( e1.getClass().getName() + ": " + e1.getMessage() );
		     e1.printStackTrace();
		    		    }
			finally {
				try{
				rs.close(); }//connection1.close(); }
				catch(Exception e1) { } }
				
			}
		});
		btnChangeSpace.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnChangeSpace.setBounds(41, 191, 155, 23);
		panel_40.add(btnChangeSpace);
		
		JPanel panel_51 = new JPanel();
		panel_39.add(panel_51, "name_3206721843408");
		
		JLabel label_1 = new JLabel("Input-Output");
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel label_10 = new JLabel("Input");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JComboBox<String> comboBox_2 = new JComboBox<String>();
		
		JCheckBox checkBox = new JCheckBox("Is the Input locally sourced?");
		
		JComboBox<String> comboBox_3 = new JComboBox<String>();
		
		JLabel label_11 = new JLabel("Output");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JCheckBox checkBox_1 = new JCheckBox("Is the output locally discarded?");
		Object[] columnio = {"Id","Process","Input","Output"};
		DefaultTableModel dm_aio = new DefaultTableModel();
		dm_aio.setColumnIdentifiers(columnio);
		
		JButton button_20 = new JButton("Add");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection41 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection41 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					// JOptionPane.showMessageDialog(null, "connection1 successful");
					
					String insertTableSQL =( "INSERT or Replace INTO IO_lib"
							+ "(Pro_id,Pro_name, Inp_name , Out_name) VALUES"
							+ "(?,?,?,?)");
					prepared = connection41.prepareStatement(insertTableSQL);
					String pro_id = dm_aio.getValueAt(table_assio.getSelectedRow(), 0).toString();
					String pro_name = dm_aio.getValueAt(table_assio.getSelectedRow(), 1).toString();
					//String inp = inp_combo.getSelectedItem().toString();
							//String out = out_combo.getSelectedItem().toString();
					String inp1 = null; String out1 = null;
							if(comboBox_2.getSelectedIndex() > 0)
							{
								inp1 = comboBox_2.getSelectedItem().toString();
							}
							else if(comboBox_2.getSelectedIndex() == 0)
							{
								inp1 = " ";
							}
							if(comboBox_3.getSelectedIndex() > 0)
							{
								 out1 = comboBox_3.getSelectedItem().toString();
							}
							else if(comboBox_3.getSelectedIndex() == 0)
							{
								out1 = " ";
							}
							
					prepared.setString(1,pro_id );
					prepared.setString(2,  pro_name);
					prepared.setString(3, inp1);
					prepared.setString(4,out1);
					
					// execute insert SQL statement
					prepared.executeUpdate();
					table_assio.getModel().setValueAt(inp1, table_assio.getSelectedRow(), 2);
					table_assio.getModel().setValueAt(out1, table_assio.getSelectedRow(), 3);
					System.out.println("Record is inserted into IO Table!");
					connection41.close();
					
					
			    } catch ( Exception e1 ) {
			      System.err.println( e1.getClass().getName() + ": " + e1.getMessage() );
			     e1.printStackTrace();
			    
			    }
				finally {
					try{
					rs.close(); prepared.close(); }//connection1.close(); }
					catch(Exception e1) { } }
			
			if (checkBox.isSelected()== true)
			{
				try{					
					String query = ("Update " + response +"  SET Transport='2' where Process_id = ? ");
						
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection24 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection24 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection13 successful");		
					//String id = dm1.getValueAt(i, 0).toString();
					
					//table_3.getModel().setValueAt(selected.toString(), table_3.getSelectedRow(), 2);
						PreparedStatement pst = connection24.prepareStatement(query);
						String pid = table_assio.getValueAt(table_assio.getSelectedRow(), 0).toString();
						pst.setString(1, pid);
						/*
					pst.setInt(1, lc_id);
					pst.setString(2,id);
					    */
							
						
					  pst.execute();
					    connection24.close();
					  
					   	System.out.println("Here");				
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
				if (checkBox_1.isSelected()== true)
				{
					try{					
						String query = ("Update " + response +" SET Transport='3' where Process_id = ? ");
							
						Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
						 Connection connection24 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
						 Connection connection24 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
						//JOptionPane.showMessageDialog(null, "connection13 successful");		
						//String id = dm1.getValueAt(i, 0).toString();
						
						//table_3.getModel().setValueAt(selected.toString(), table_3.getSelectedRow(), 2);
							PreparedStatement pst = connection24.prepareStatement(query);
							String pid = table_assio.getValueAt(table_assio.getSelectedRow(), 0).toString();
							pst.setString(1, pid);
							/*
						pst.setInt(1, lc_id);
						pst.setString(2,id);
						    */
								
							
						  pst.execute();
						    connection24.close();
						  
						   	System.out.println("Here");				
					}
					catch(Exception ex)
					{
						ex.printStackTrace();
					}
				checkBox.setSelected(false);
				checkBox_1.setSelected(false);
			
			
			}
		}});
		button_20.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JScrollPane scrollPane_37 = new JScrollPane();
		
		JButton button_21 = new JButton("Save");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_39.removeAll();
				panel_39.repaint();
				panel_39.revalidate();
				panel_39.add(panel_40);
				panel_40.setVisible(true);
				
			}
		});
		GroupLayout gl_panel_51 = new GroupLayout(panel_51);
		gl_panel_51.setHorizontalGroup(
			gl_panel_51.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_51.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_51.createParallelGroup(Alignment.LEADING)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_51.createSequentialGroup()
							.addGroup(gl_panel_51.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_51.createSequentialGroup()
									.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(4)
									.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))
								.addComponent(checkBox, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_51.createSequentialGroup()
									.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))
								.addComponent(checkBox_1, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_51.createSequentialGroup()
									.addGap(34)
									.addGroup(gl_panel_51.createParallelGroup(Alignment.LEADING)
										.addComponent(button_21, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
										.addComponent(button_20, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))))
							.addGap(44)
							.addComponent(scrollPane_37, GroupLayout.PREFERRED_SIZE, 415, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(32, Short.MAX_VALUE))
		);
		gl_panel_51.setVerticalGroup(
			gl_panel_51.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_51.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(17)
					.addGroup(gl_panel_51.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_51.createSequentialGroup()
							.addGap(34)
							.addGroup(gl_panel_51.createParallelGroup(Alignment.LEADING)
								.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_51.createSequentialGroup()
									.addGap(1)
									.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(18)
							.addComponent(checkBox)
							.addGap(12)
							.addGroup(gl_panel_51.createParallelGroup(Alignment.LEADING)
								.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_51.createSequentialGroup()
									.addGap(1)
									.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(18)
							.addComponent(checkBox_1)
							.addGap(69)
							.addComponent(button_20, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(scrollPane_37, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addComponent(button_21)
					.addContainerGap(97, Short.MAX_VALUE))
		);
		
		table_assio = new JTable();
		scrollPane_37.setViewportView(table_assio);
		table_assio.setModel(dm_aio);
		table_assio.setBackground(SystemColor.control);
		table_assio.setShowVerticalLines(false);
		table_assio.setShowHorizontalLines(false);
		panel_51.setLayout(gl_panel_51);
		
		JPanel panel_45 = new JPanel();
		panel_39.add(panel_45, "name_198923973777410");
		
		JButton btnChangeTime = new JButton("Change Time");
		btnChangeTime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_39.removeAll();
				panel_39.repaint();
				panel_39.revalidate();
				panel_39.add(panel_45);
				panel_45.setVisible(true);
				
				
				String sql = "Select Process_id , Process_name, duration from " + response;
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection70 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection70 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection7 successful");		
						
						PreparedStatement pst = connection70.prepareStatement(sql);
					    ResultSet rs1 = pst.executeQuery();
					    
					    while(rs1.next())
					    {
					    	String id = rs1.getString(1);
					    	String pr = rs1.getString(2);
					    	String dur = rs1.getString(3);
					    	Object[] row ={ id,pr,dur};
					    	dm_du.addRow(row);
					    	//System.out.print("Yes");
					    	
					    }
					    connection70.close();
					    dm_du.removeRow(0);
					  }
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		btnChangeTime.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnChangeTime.setBounds(41, 225, 155, 23);
		panel_40.add(btnChangeTime);
		
		JPanel panel_44 = new JPanel();
		panel_39.add(panel_44, "name_198885413193792");
		
		JButton btnNewButton_13 = new JButton("Change Impact");
		btnNewButton_13.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_39.removeAll();
				panel_39.repaint();
				panel_39.revalidate();
				panel_39.add(panel_44);
				panel_44.setVisible(true);
				
				String sql = "Select Process_id,Process_name,Part_nm from " + response;
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection73 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection73 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection7 successful");		
						
						PreparedStatement pst = connection73.prepareStatement(sql);
					    ResultSet rs1 = pst.executeQuery();
					    
					    while(rs1.next())
					    {
					    	String id = rs1.getString(1);
					    	String process = rs1.getString(2);
					    	String mat_nm = rs1.getString(3);
					    	
					    	Object[] row = {id,process,mat_nm};
					    	dm_ipr.addRow(row);
					    	
					    	
					    }
					    dm_ipr.removeRow(0);
					    connection73.close();
					   
					  }
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				
				
			}
		});
		btnNewButton_13.setBounds(41, 259, 155, 23);
		panel_40.add(btnNewButton_13);
		
		JButton btnCreateNewRelation = new JButton("Create New Relation");
		btnCreateNewRelation.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCreateNewRelation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Testing();
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection81 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection81 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					// JOptionPane.showMessageDialog(null, "connection1 successful");
					
					String insertTableSQL =( "INSERT INTO Relations_info"
							+ "(NAME) VALUES"
							+ "(?)");
					prepared = connection81.prepareStatement(insertTableSQL);
					prepared.setString(1, response);
					prepared.executeUpdate();
					
					System.out.println("Record is inserted into Relations_info table!");
					connection81.close();
			    } catch ( Exception e1 ) {
			      System.err.println( e1.getClass().getName() + ": " + e1.getMessage() );
			     e1.printStackTrace();
			    
			    }
				finally {
					try{
					rs.close(); prepared.close(); }//connection1.close(); }
					catch(Exception e1) { } }
				
					//String sql1 = "SELECT * FROM Project_info  " ;
					
					
					
				
				create_folder();
				try {
					create_tab();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		/*btnCreateNewRelation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String path=System.getProperty("user.dir");
				System.out.print(path);
				File source = new File(path);
				File dest = new File("M:\\c");
				try {
				FileUtils.moveDirectory(source, dest);
				} catch (IOException e1) {
				e1.printStackTrace();
				}

				
			}
		});*/
		btnCreateNewRelation.setBounds(41, 58, 155, 23);
		panel_40.add(btnCreateNewRelation);
		JPanel panel_46 = new JPanel();
		JButton btnNewButton_14 = new JButton("Change LCPhase");
		btnNewButton_14.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_39.removeAll();
				panel_39.repaint();
				panel_39.revalidate();
				panel_39.add(panel_46);
				panel_46.setVisible(true);
				
				String sql = "Select Process_id,Process_name, LC_id from " + response;
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection73 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection73 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection7 successful");		
						
						PreparedStatement pst = connection73.prepareStatement(sql);
					    ResultSet rs1 = pst.executeQuery();
					    
					    while(rs1.next())
					    {
					    	String id = rs1.getString(1);
					    	String process = rs1.getString(2);
					    	String lc = rs1.getString(3);
					    	
					    	
					    	Object[] row = {id,process,lc};
					    	dm_lcalt.addRow(row);
					    	
					    	
					    }
					    dm_lcalt.removeRow(0);
					    connection73.close();
					   
					  }
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		btnNewButton_14.setBounds(41, 293, 155, 23);
		panel_40.add(btnNewButton_14);
		JPanel panel_47 = new JPanel();
		JButton btnViewImpactFor = new JButton("View Impact for Relation");
		btnViewImpactFor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		btnViewImpactFor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.removeAll();
				tabbedPane.add( "new", panel_38);
				panel_38.removeAll();
				panel_38.repaint();
				panel_38.revalidate();
				panel_38.add(ea_pane);
			}
		});
		/*btnViewImpactFor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_39.removeAll();
				panel_39.repaint();
				panel_39.revalidate();
				panel_39.add(panel_47);
				
				String sql1 = "Drop view if exists p_snew; "; 
				String sql2 ="Create view p_snew as select * from  " + response + " natural join space_lib;";
           String sql3 = "Drop view if exists pidnew;";
           String sql4 = "Create view pidnew as select id from process_seq order by seq_id;";
           String sql5 = "Drop view if exists pCnew;";
          String sql6 = " create view pCnew as select p_snew.process_id as IDC,longitude as LongS,latitude as LatS, timeY as timeY ,duration as DuraS, Imp as ImpS , Op_count as MenS , Equi_count as MachS , transport as TransS from pidnew left join p_snew on pidnew.id=p_snew.process_id;";
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection56 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection56 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					JOptionPane.showMessageDialog(null, "connection56 successful");		
						
						Statement pst = connection56.createStatement();
						pst.addBatch(sql1);
						pst.addBatch(sql2);
						pst.addBatch(sql3);
						pst.addBatch(sql4);
						pst.addBatch(sql5);
						pst.addBatch(sql6);
						//PreparedStatement pst = connection56.prepareStatement(res);
						//pst1.executeUpdate();
						pst.executeBatch();
					    ResultSet rs2 = pst.executeQuery( "Select * from pCnew");
					    
					    while(rs2.next())
					    {
					    	String idc = rs2.getString(1);
					    	String longc = rs2.getString(2);
					    	String latc = rs2.getString(3);
					    	String durac = rs2.getString(5);
					    	String timey = rs2.getString(4);
					    	String imp = rs2.getString(6);
					    	String men = rs2.getString(7);
					    	String mach = rs2.getString(8);
					    	String trans = rs2.getString(9);
					    	
					    	Object[] row = {idc,longc,latc,timey,durac,imp, men, mach,trans};
					    	dm_idc.addRow(row);
					    	System.out.print("IDC");
					    	
					    }
					    connection56.close();
					  }
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				
				String sql12 = "Drop view if exists p_snew; "; 
				String sql7 ="Create view p_snew as select * from "+response +"  natural join space_lib;";
           String sql8 = "Drop view if exists pidnew;";
           String sql9 = "Create view pidnew as select pre_pro from process_seq order by seq_id;";
           String sql10 = "Drop view if exists pPnew;";
          String sql11 = " create view pPnew as select p_snew.process_id as IDP,longitude as LongS,latitude as LatS, timeY as timeY ,duration as DuraS, Imp as ImpS , Op_count as MenS , Equi_count as MachS , transport as TransS from pidnew left join p_snew on pidnew.pre_pro=p_snew.process_id;";
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection57 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection57 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					JOptionPane.showMessageDialog(null, "connection56 successful");		
						
						Statement pst = connection57.createStatement();
						pst.addBatch(sql12);
						pst.addBatch(sql7);
						pst.addBatch(sql8);
						pst.addBatch(sql9);
						pst.addBatch(sql10);
						pst.addBatch(sql11);
						//PreparedStatement pst = connection56.prepareStatement(res);
						//pst1.executeUpdate();
						pst.executeBatch();
					    ResultSet rs2 = pst.executeQuery( "Select * from pPnew");
					    
					    while(rs2.next())
					    {
					    	String idc = rs2.getString(1);
					    	String longc = rs2.getString(2);
					    	String latc = rs2.getString(3);
					    	String durac = rs2.getString(5);
					    	String timey = rs2.getString(4);
					    	String imp = rs2.getString(6);
					    	String men = rs2.getString(7);
					    	String mach = rs2.getString(8);
					    	String trans = rs2.getString(9);
					    	
					    	Object[] row = {idc,longc,latc,timey,durac,imp, men, mach,trans};
					    	dm_idp.addRow(row);
					    	System.out.print("IDP");
					    	
					    }
					    connection57.close();
					  }
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				
				String sql13 = "Drop view if exists p_snew; "; 
				String sql14 ="Create view p_snew as select * from "+ response + " natural join space_lib;";
           String sql15 = "Drop view if exists pidnew;";
           String sql16 = "Create view pidnew as select suc_pro from process_seq order by seq_id;";
           String sql17 = "Drop view if exists pSnew;";
          String sql18 = " create view pSnew as select p_snew.process_id as IDS,longitude as LongS,latitude as LatS, timeY as timeY ,duration as DuraS, Imp as ImpS , Op_count as MenS , Equi_count as MachS , transport as TransS from pidnew left join p_snew on pidnew.suc_pro=p_snew.process_id;";
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection57 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection57 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					JOptionPane.showMessageDialog(null, "connection56 successful");		
						
						Statement pst = connection57.createStatement();
						pst.addBatch(sql13);
						pst.addBatch(sql14);
						pst.addBatch(sql15);
						pst.addBatch(sql16);
						pst.addBatch(sql17);
						pst.addBatch(sql18);
						//PreparedStatement pst = connection56.prepareStatement(res);
						//pst1.executeUpdate();
						pst.executeBatch();
					    ResultSet rs2 = pst.executeQuery( "Select * from pSnew");
					    
					    while(rs2.next())
					    {
					    	String idc = rs2.getString(1);
					    	String longc = rs2.getString(2);
					    	String latc = rs2.getString(3);
					    	String durac = rs2.getString(5);
					    	String timey = rs2.getString(4);
					    	String imp = rs2.getString(6);
					    	String men = rs2.getString(7);
					    	String mach = rs2.getString(8);
					    	String trans = rs2.getString(9);
					    	
					    	Object[] row = {idc,longc,latc,timey,durac,imp, men, mach,trans};
					    	dm_ids.addRow(row);
					    	System.out.print("IDS");
					    	
					    }
					    connection57.close();
					  }
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				
				String sql_lc = "Select Process_id, Process_name , Lc_id from Process_lib";
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection68 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection68 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					JOptionPane.showMessageDialog(null, "connection68 successful");		
						
						PreparedStatement pst = connection68.prepareStatement(sql_lc);
					    ResultSet rs1 = pst.executeQuery();
					    
					    while(rs1.next())
					    {
					    	String id = rs1.getString(1);
					    	String pnm = rs1.getString(2);
					    	String lc = rs1.getString(3);
					    	Object[] row = {id , pnm , lc};
					    	dm_lcpa.addRow(row);
					    	
					    }
					    connection68.close();
					   					
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				
				
				exportidca();
				exportidpa();
				exportidsa();
				//exportlcpa();
				try {
					//exportTable(dm_idc, new File("M:\\Relations\\" + response +"\\IDCA.xls"));
					exportTable(dm_idc, new File("M:\\templates\\IDCA.xls"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				try {
					//exportTable(dm_idp, new File("M:\\Relations\\" + response +"\\IDPA.xls"));
					exportTable(dm_idp, new File("M:\\templates\\IDPA.xls"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				try {
					//exportTable(dm_ids, new File("M:\\Relations\\" + response +"\\IDSA.xls"));
					exportTable(dm_ids, new File("M:\\templates\\IDSA.xls"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
				InputCheckerAR.main(_args);
				DisplayFrameAR dis = new DisplayFrameAR();
				
			}
		});*/
		btnViewImpactFor.setBounds(41, 378, 173, 23);
		panel_40.add(btnViewImpactFor);
		
	
		
		JLabel lblProcessAlternatives_1 = new JLabel("Process Alternatives");
		lblProcessAlternatives_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JScrollPane scrollPane_18 = new JScrollPane();
		
		combo_alt = new JComboBox();
		
		JLabel lblAssignedAlternateProcess = new JLabel("Assigned Alternate process");
		lblAssignedAlternateProcess.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnNewButton_11 = new JButton("Assign");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String at_pro = combo_alt.getSelectedItem().toString();
				alt_pro.getModel().setValueAt(at_pro, alt_pro.getSelectedRow(), 2);
				//String id = alt_pro.getModel().getValueAt(, columnIndex)
				try{
					
					String query = ("Update " +response + " SET Process_name=? where Process_id=?");
					String id = dm_ap.getValueAt(alt_pro.getSelectedRow(), 0).toString();  		
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection74 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection74 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection13 successful");		
					//String id = dm1.getValueAt(i, 0).toString();
					
					alt_pro.getModel().setValueAt(at_pro.toString(), alt_pro.getSelectedRow(), 2);
						PreparedStatement pst = connection74.prepareStatement(query);
						
					pst.setString(1, at_pro);
					pst.setString(2,id);
					 				
						
					  pst.execute();
					    connection74.close();
					  
					   					
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnNewButton_19 = new JButton("Assign Input-Output");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_39.removeAll();
				panel_39.repaint();
				panel_39.revalidate();
				panel_39.add(panel_51);
				panel_51.setVisible(true);
				String sql = "Select Process_id,Process_name from " + response;
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection40 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection40 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					JOptionPane.showMessageDialog(null, "connection40 successful");		
						
						PreparedStatement pst = connection40.prepareStatement(sql);
					    ResultSet rs1 = pst.executeQuery();
					    
					    while(rs1.next())
					    {
					    	String id = rs1.getString(1);
					    	String process = rs1.getString(2);
					    	
					    	Object[] row = {id,process};
					    	dm_aio.addRow(row);
					    						    	
					    }
					    dm_aio.removeRow(0);
					    connection40.close();

					  }
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				
			
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection50 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection50 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					// JOptionPane.showMessageDialog(null, "connection6 successful");
					 //connection = sqlite_conn.dbConnector();
					String sql1 = "SELECT DISTINCT io_name FROM io_name ";
					prepared = connection50.prepareStatement(sql1);
					rs = prepared.executeQuery();
					
					while (rs.next())
					{
						comboBox_2.addItem(rs.getString("io_name"));
						 
					}
					connection50.close();
				}catch(Exception e2){
					JOptionPane.showMessageDialog(null, e2);
				}
				finally {
					try{
					rs.close(); prepared.close(); }
					catch(Exception e1) { } }
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection51 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection51 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					// JOptionPane.showMessageDialog(null, "connection6 successful");
					 //connection = sqlite_conn.dbConnector();
					String sql1 = "SELECT DISTINCT io_name FROM io_name ";
					prepared = connection51.prepareStatement(sql1);
					rs = prepared.executeQuery();
					
					while (rs.next())
					{
						comboBox_3.addItem(rs.getString("io_name"));
						 
					}
					connection51.close();
				}catch(Exception e2){
					JOptionPane.showMessageDialog(null, e2);
				}
				finally {
					try{
					rs.close(); prepared.close(); }
					catch(Exception e1) { } }
			}
		});
		
	
		
		 
		GroupLayout gl_panel_42 = new GroupLayout(panel_42);
		gl_panel_42.setHorizontalGroup(
			gl_panel_42.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_42.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_42.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_42.createSequentialGroup()
							.addComponent(scrollPane_18, GroupLayout.PREFERRED_SIZE, 290, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_42.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(gl_panel_42.createSequentialGroup()
									.addComponent(lblAssignedAlternateProcess)
									.addGap(37)
									.addComponent(combo_alt, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
									.addGap(47))
								.addGroup(gl_panel_42.createSequentialGroup()
									.addGroup(gl_panel_42.createParallelGroup(Alignment.LEADING)
										.addComponent(btnNewButton_19)
										.addComponent(btnNewButton_11))
									.addGap(65))))
						.addComponent(lblProcessAlternatives_1))
					.addContainerGap(32, Short.MAX_VALUE))
		);
		gl_panel_42.setVerticalGroup(
			gl_panel_42.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_42.createSequentialGroup()
					.addGroup(gl_panel_42.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_42.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblProcessAlternatives_1)
							.addGap(50)
							.addComponent(scrollPane_18, GroupLayout.PREFERRED_SIZE, 340, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_42.createSequentialGroup()
							.addGap(109)
							.addGroup(gl_panel_42.createParallelGroup(Alignment.BASELINE)
								.addComponent(combo_alt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAssignedAlternateProcess))
							.addGap(85)
							.addComponent(btnNewButton_11)
							.addGap(48)
							.addComponent(btnNewButton_19)))
					.addContainerGap(57, Short.MAX_VALUE))
		);
		Object[] column_alt = {"Alternate Process"};
		dm_asp.setColumnIdentifiers(column_alt);
		
		alt_pro = new JTable();
		alt_pro.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				 if (e.getClickCount() == 1) {
				      JTable target = (JTable)e.getSource();
				      pr_id = dm_ap.getValueAt(target.getSelectedRow(), 0).toString();
				      System.out.print(pr_id);
				      
				      pro_alt();
				      alt_prospace();
				 }  	
				
			}
		});
		scrollPane_18.setViewportView(alt_pro);
		panel_42.setLayout(gl_panel_42);
		Object[] column_pr = {"Id","Process" , "Alternate Process" };
		
		dm_ap.setColumnIdentifiers(column_pr);
		alt_pro.setModel(dm_ap);
		alt_pro.setBackground(SystemColor.control);
		alt_pro.setShowVerticalLines(false);
		alt_pro.setShowHorizontalLines(false);
		
		
		panel_39.add(panel_46, "name_901481250475568");
		
		JLabel lblLcphaseAlternatives = new JLabel("LCPhase Alternatives");
		lblLcphaseAlternatives.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JScrollPane scrollPane_26 = new JScrollPane();
		
		JLabel lblMaterial = new JLabel("1. Material");
		lblMaterial.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblManufacturing = new JLabel("2. Manufacturing");
		lblManufacturing.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblAssembly = new JLabel("3. Assembly");
		lblAssembly.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblPackage = new JLabel("4. Package");
		lblPackage.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lbltransport = new JLabel("5.Transport");
		lbltransport.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblusage = new JLabel("6.Usage");
		lblusage.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblAfteruse = new JLabel("7. After-use");
		lblAfteruse.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JComboBox alt_lccombo = new JComboBox();
		alt_lccombo.addItem("Material");
		alt_lccombo.addItem("Manufacturing");
		alt_lccombo.addItem("Assembly");
		alt_lccombo.addItem("Package");
		alt_lccombo.addItem("Transport");
		alt_lccombo.addItem("Usage");
		alt_lccombo.addItem("After use");
		
		JButton btnAssign_2 = new JButton("Assign");
		btnAssign_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id = dm_lcalt.getValueAt(table_lcalt.getSelectedRow(), 0).toString();  
				
				Object selected = alt_lccombo.getSelectedItem();
		          if(selected.toString().equals("Material"))
						{
							 lc_id = 1; 
						}
		          else if(selected.toString().equals("Manufacturing"))
					{
						 lc_id = 2; 
					}
		          else if(selected.toString().equals("Assembly"))
					{
						 lc_id = 3; 
					}
		          else if(selected.toString().equals("Package"))
					{
						 lc_id = 4; 
					}
		          else if(selected.toString().equals("Transport"))
					{
						 lc_id = 5; 
					}
		          else if(selected.toString().equals("Usage"))
					{
						 lc_id = 6; 
					}
		          else{
		        	  lc_id = 7;
		          }
		          
		          try{
						
						String query = ("Update " +response + " SET LC_id=? where Process_id=?");
								
						Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
						 Connection connection74 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
						 Connection connection74 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
						//JOptionPane.showMessageDialog(null, "connection13 successful");		
						//String id = dm1.getValueAt(i, 0).toString();
						
						table_lcalt.getModel().setValueAt(selected.toString(), table_lcalt.getSelectedRow(), 3);
							PreparedStatement pst = connection74.prepareStatement(query);
							
						pst.setInt(1, lc_id);
						pst.setString(2,id);
						 				
							
						  pst.execute();
						    connection74.close();
						  
						   					
					}
					catch(Exception ex)
					{
						ex.printStackTrace();
					}
				}
			
		});
		
		JButton btnSave_9 = new JButton("Save");
		btnSave_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_39.removeAll();
				panel_39.repaint();
				panel_39.revalidate();
				panel_39.add(panel_40);
				panel_40.setVisible(true);
			}
		});
		
		GroupLayout gl_panel_46 = new GroupLayout(panel_46);
		gl_panel_46.setHorizontalGroup(
			gl_panel_46.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_46.createSequentialGroup()
					.addGroup(gl_panel_46.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_46.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblLcphaseAlternatives, GroupLayout.PREFERRED_SIZE, 324, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_46.createSequentialGroup()
							.addGap(22)
							.addComponent(scrollPane_26, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
							.addGap(29)
							.addGroup(gl_panel_46.createParallelGroup(Alignment.LEADING)
								.addComponent(lblAfteruse, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblusage, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbltransport, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPackage, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAssembly, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblManufacturing, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_46.createParallelGroup(Alignment.TRAILING)
									.addGroup(gl_panel_46.createSequentialGroup()
										.addComponent(lblMaterial, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
										.addGap(83)
										.addComponent(alt_lccombo, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_panel_46.createParallelGroup(Alignment.LEADING)
										.addComponent(btnSave_9)
										.addComponent(btnAssign_2))))))
					.addContainerGap(93, Short.MAX_VALUE))
		);
		gl_panel_46.setVerticalGroup(
			gl_panel_46.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_46.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblLcphaseAlternatives, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addGap(31)
					.addGroup(gl_panel_46.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_46.createSequentialGroup()
							.addComponent(scrollPane_26, GroupLayout.PREFERRED_SIZE, 377, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(39, Short.MAX_VALUE))
						.addGroup(gl_panel_46.createSequentialGroup()
							.addGroup(gl_panel_46.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblMaterial)
								.addComponent(alt_lccombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblManufacturing, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblAssembly, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblPackage, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lbltransport, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblusage, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblAfteruse, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
							.addComponent(btnAssign_2)
							.addGap(27)
							.addComponent(btnSave_9)
							.addGap(50))))
		);
		
		table_lcalt = new JTable();
		scrollPane_26.setViewportView(table_lcalt);
		panel_46.setLayout(gl_panel_46);
Object[] column_lca = {"Id","Process" , " Assigned LC Phase", "Alternate LCPhase"};
		
		dm_lcalt.setColumnIdentifiers(column_lca);
		table_lcalt.setModel(dm_lcalt);
		table_lcalt.setBackground(SystemColor.control);
		table_lcalt.setShowVerticalLines(false);
		table_lcalt.setShowHorizontalLines(false);
		
		
		
		panel_39.add(panel_41, "name_12733049496767");
		
		JLabel lblEquipmentAlternatives_1 = new JLabel("Equipment Alternatives");
		lblEquipmentAlternatives_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JScrollPane scrollPane_19 = new JScrollPane();
		
		JButton btnSave_5 = new JButton("Assign");
		btnSave_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String equ = table_alteq.getValueAt(table_alteq.getSelectedRow(), 1).toString();
				equi_alt.getModel().setValueAt(equ, equi_alt.getSelectedRow(), 2);
				
				//String id = alt_pro.getModel().getValueAt(, columnIndex)
				try{
					
					String query = ("Update " +response + " SET Equip_id=? where Equip_id=?");
					String pid = equi_alt.getValueAt(equi_alt.getSelectedRow(), 0).toString();  
					String id = table_alteq.getValueAt(table_alteq.getSelectedRow(), 0).toString();  		
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection74 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection74 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection13 successful");		
					//String id = dm1.getValueAt(i, 0).toString();
					
					equi_alt.getModel().setValueAt(equ, equi_alt.getSelectedRow(), 2);
						PreparedStatement pst = connection74.prepareStatement(query);
						
					pst.setString(1, id);
					pst.setString(2,pid);
					 				
						
					  pst.execute();
					    connection74.close();
					  
					   					
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			
			}
		});
		btnSave_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JScrollPane scrollPane_27 = new JScrollPane();
		
		JButton btnSave_6 = new JButton("Save");
		btnSave_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_39.removeAll();
				panel_39.repaint();
				panel_39.revalidate();
				panel_39.add(panel_40);
				panel_40.setVisible(true);
			}
		});
		btnSave_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GroupLayout gl_panel_41 = new GroupLayout(panel_41);
		gl_panel_41.setHorizontalGroup(
			gl_panel_41.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_41.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblEquipmentAlternatives_1, GroupLayout.PREFERRED_SIZE, 324, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(386, Short.MAX_VALUE))
				.addGroup(gl_panel_41.createSequentialGroup()
					.addGap(52)
					.addComponent(scrollPane_19, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_41.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_41.createSequentialGroup()
							.addComponent(scrollPane_27, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
							.addComponent(btnSave_5))
						.addComponent(btnSave_6, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
					.addGap(38))
		);
		gl_panel_41.setVerticalGroup(
			gl_panel_41.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_41.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblEquipmentAlternatives_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel_41.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_41.createSequentialGroup()
							.addGap(31)
							.addComponent(scrollPane_19, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(71, Short.MAX_VALUE))
						.addGroup(gl_panel_41.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrollPane_27, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
							.addGap(178))))
				.addGroup(Alignment.TRAILING, gl_panel_41.createSequentialGroup()
					.addContainerGap(293, Short.MAX_VALUE)
					.addComponent(btnSave_5)
					.addGap(39)
					.addComponent(btnSave_6, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(95))
		);
		
		table_alteq = new JTable();
		scrollPane_27.setViewportView(table_alteq);
	Object[] column_eaq = {"Id","Equipment" };
		
		dm_eaq.setColumnIdentifiers(column_eaq);
		table_alteq.setModel(dm_eaq);
		table_alteq.setBackground(SystemColor.control);
		table_alteq.setShowVerticalLines(false);
		table_alteq.setShowHorizontalLines(false);
		
		equi_alt = new JTable();
		equi_alt.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				 if (e.getClickCount() == 1) {
				      JTable target = (JTable)e.getSource();
				      eq_id = dm_ea.getValueAt(target.getSelectedRow(), 0).toString();
				      System.out.print(eq_id);
				      
				     
				 }  		
			}
		});
		scrollPane_19.setViewportView(equi_alt);
		panel_41.setLayout(gl_panel_41);
		
		Object[] column_ea = {"Id","Equipment" , " Alternate Equipment"};
		
		dm_ea.setColumnIdentifiers(column_ea);
		equi_alt.setModel(dm_ea);
		equi_alt.setBackground(SystemColor.control);
		equi_alt.setShowVerticalLines(false);
		equi_alt.setShowHorizontalLines(false);
		
		
		JLabel lblSpaceAlternatives = new JLabel("Space Alternatives");
		lblSpaceAlternatives.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JScrollPane scrollPane_22 = new JScrollPane();
JComboBox comboBox_5 = new JComboBox();
		
		JComboBox comboBox_6 = new JComboBox();
		JComboBox comboBox_spalt = new JComboBox();
		JCheckBox chckbxIsShippingInvolved = new JCheckBox("Is shipping involved?");
		chckbxIsShippingInvolved.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				comboBox_spalt.setEnabled(false);
				comboBox_6.removeAllItems();
				comboBox_5.removeAllItems();
				String sql = "Select space_id  from space_lib ";
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection66 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection66 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection7 successful");		
						
						PreparedStatement pst = connection66.prepareStatement(sql);
					    ResultSet rs1 = pst.executeQuery();
					    
					    while(rs1.next())
					    {
					    	String alt = rs1.getString(1);
					    	comboBox_6.addItem(alt);
					    	comboBox_5.addItem(alt);
					    	
					    		    	
					    }
					 
					    connection66.close();
					   
					  }
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
				
			
		});

		JButton btnAssign_1 = new JButton("Assign");
		btnAssign_1.addActionListener(new ActionListener() {
		

			public void actionPerformed(ActionEvent e) {
				
				if (chckbxIsShippingInvolved.isSelected()== true)
				{
					
					try{					
						String query = ("Update " + response +" SET Transport='1' where Process_id = ? ");
							
						Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
						 Connection connection24 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
						 Connection connection24 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
						//JOptionPane.showMessageDialog(null, "connection13 successful");		
						//String id = dm1.getValueAt(i, 0).toString();
						
						//table_3.getModel().setValueAt(selected.toString(), table_3.getSelectedRow(), 2);
							PreparedStatement pst = connection24.prepareStatement(query);
							String pid = alt_sp_tab.getValueAt(alt_sp_tab.getSelectedRow(), 0).toString();
							pst.setString(1, pid);
							/*
						pst.setInt(1, lc_id);
						pst.setString(2,id);
						    */
								
							
						  pst.execute();
						    connection24.close();
						  
						   	System.out.println("Here");				
					}
					catch(Exception ex)
					{
						ex.printStackTrace();
					}
				}
				if (chckbxIsShippingInvolved.isSelected()== true)
				{
					alt_sp = comboBox_6.getSelectedItem().toString();	
				}
				else{
					alt_sp = comboBox_spalt.getSelectedItem().toString();	
				}
				
				alt_sp_tab.getModel().setValueAt(alt_sp, alt_sp_tab.getSelectedRow(), 2);
				
				try{
					
					String query = ("Update " +response + " SET Space_id=? where Space_id=?");
					//String pid = equi_alt.getValueAt(equi_alt.getSelectedRow(), 0).toString();  
					String id = alt_sp_tab.getValueAt(alt_sp_tab.getSelectedRow(), 0).toString();  		
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection74 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection74 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				//	JOptionPane.showMessageDialog(null, "connection13 successful");		
					//String id = dm1.getValueAt(i, 0).toString();
					
					alt_sp_tab.getModel().setValueAt(alt_sp, alt_sp_tab.getSelectedRow(), 2);
						PreparedStatement pst = connection74.prepareStatement(query);
						
					pst.setString(1, alt_sp);
					pst.setString(2,id);
					 				
						
					  pst.execute();
					    connection74.close();
					  
					   					
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		btnAssign_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnSave_7 = new JButton("Save");
		btnSave_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_39.removeAll();
				panel_39.repaint();
				panel_39.revalidate();
				panel_39.add(panel_40);
				panel_40.setVisible(true);
			}
		});
		
		
		
		GroupLayout gl_panel_43 = new GroupLayout(panel_43);
		gl_panel_43.setHorizontalGroup(
			gl_panel_43.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_43.createSequentialGroup()
					.addGap(18)
					.addGroup(gl_panel_43.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_43.createSequentialGroup()
							.addGap(10)
							.addComponent(scrollPane_22, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(43)
							.addGroup(gl_panel_43.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox_spalt, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnSave_7)
								.addComponent(btnAssign_1)
								.addGroup(gl_panel_43.createParallelGroup(Alignment.TRAILING)
									.addGroup(Alignment.LEADING, gl_panel_43.createSequentialGroup()
										.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
										.addComponent(comboBox_6, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED))
									.addComponent(chckbxIsShippingInvolved, Alignment.LEADING))))
						.addComponent(lblSpaceAlternatives, GroupLayout.PREFERRED_SIZE, 324, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(53, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_43.setVerticalGroup(
			gl_panel_43.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_43.createSequentialGroup()
					.addGroup(gl_panel_43.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_43.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblSpaceAlternatives, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addGap(35)
							.addComponent(scrollPane_22, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_43.createSequentialGroup()
							.addGap(81)
							.addComponent(comboBox_spalt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(27)
							.addComponent(chckbxIsShippingInvolved)
							.addGap(18)
							.addGroup(gl_panel_43.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(67)
							.addComponent(btnAssign_1)
							.addGap(74)
							.addComponent(btnSave_7)))
					.addContainerGap(62, Short.MAX_VALUE))
		);
		
		alt_sp_tab = new JTable();
		alt_sp_tab.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				comboBox_spalt.setEnabled(true);
				comboBox_spalt.removeAllItems();
				String sql = "Select space_id  from space_lib ";
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection66 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection66 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection7 successful");		
						
						PreparedStatement pst = connection66.prepareStatement(sql);
					    ResultSet rs1 = pst.executeQuery();
					    
					    while(rs1.next())
					    {
					    	String alt = rs1.getString(1);
					    	comboBox_spalt.addItem(alt);
					    		    	
					    }
					 
					    connection66.close();
					   
					  }
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		scrollPane_22.setViewportView(alt_sp_tab);
		panel_43.setLayout(gl_panel_43);
		Object[] columnsp = {"Id","Space", "Assigned Space" ,"Alternate Space"};
		dm_spa.setColumnIdentifiers(columnsp);
		alt_sp_tab.setModel(dm_spa);
		alt_sp_tab.setBackground(SystemColor.control);
		alt_sp_tab.setShowVerticalLines(false);
		alt_sp_tab.setShowHorizontalLines(false);
		
		
		
		JLabel lblTimeAlternatives = new JLabel("Time Alternatives");
		lblTimeAlternatives.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JScrollPane scrollPane_23 = new JScrollPane();
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		
		JButton btnNewButton_12 = new JButton("Assign");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
try{
					
					String query = ("Update" + response +" SET duration=? where Process_id=?");
							
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection45 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection45 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection45 successful");		
					//String id = dm1.getValueAt(i, 0).toString();
					pt_alt.getModel().setValueAt(textField_9.getText(), pt_alt.getSelectedRow(), 3);
					
						PreparedStatement pst = connection45.prepareStatement(query);
										
					//pst.setString(2,id);
					pst.setInt(1, Integer.parseInt(textField_9.getText()));
					pst.setString(2, pr_nm);
					    connection45.close();
					  
					   					
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
				
			
		});
		
		JLabel lblNewLabel_15 = new JLabel("Space");
		
		JLabel lblProcess = new JLabel("Process");
		
		JLabel lblEquipment_2 = new JLabel("Equipment");
		
		JLabel lblDuration = new JLabel("Duration");
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		
		JButton btnNewButton_15 = new JButton("Save");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_39.removeAll();
				panel_39.repaint();
				panel_39.revalidate();
				panel_39.add(panel_40);
				panel_40.setVisible(true);
			}
		});
		GroupLayout gl_panel_45 = new GroupLayout(panel_45);
		gl_panel_45.setHorizontalGroup(
			gl_panel_45.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_45.createSequentialGroup()
					.addGroup(gl_panel_45.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_45.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblTimeAlternatives, GroupLayout.PREFERRED_SIZE, 324, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_45.createSequentialGroup()
							.addGap(16)
							.addGroup(gl_panel_45.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPane_23, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblProcess))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_45.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_45.createSequentialGroup()
									.addGroup(gl_panel_45.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_15)
										.addGroup(gl_panel_45.createSequentialGroup()
											.addGap(2)
											.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))
									.addGap(26)
									.addGroup(gl_panel_45.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblEquipment_2))
									.addGap(48)
									.addGroup(gl_panel_45.createParallelGroup(Alignment.LEADING)
										.addComponent(lblDuration)
										.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panel_45.createParallelGroup(Alignment.LEADING)
									.addComponent(btnNewButton_12)
									.addComponent(btnNewButton_15)))))
					.addContainerGap(137, Short.MAX_VALUE))
		);
		gl_panel_45.setVerticalGroup(
			gl_panel_45.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_45.createSequentialGroup()
					.addGap(111)
					.addGroup(gl_panel_45.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnNewButton_12)
					.addGap(150)
					.addComponent(btnNewButton_15)
					.addContainerGap(90, Short.MAX_VALUE))
				.addGroup(gl_panel_45.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTimeAlternatives, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addGroup(gl_panel_45.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_15)
						.addComponent(lblEquipment_2)
						.addComponent(lblDuration)
						.addComponent(lblProcess))
					.addGap(18)
					.addComponent(scrollPane_23, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		pt_alt = new JTable();
		Object[] columnpp = {"Id","Process" , "Duration" , "New duration"};
		
		dm_du.setColumnIdentifiers(columnpp);
		pt_alt.setModel(dm_du);
		pt_alt.setBackground(SystemColor.control);
		pt_alt.setShowVerticalLines(false);
		pt_alt.setShowHorizontalLines(false);
		pt_alt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 if (e.getClickCount() == 1) {
				      JTable target = (JTable)e.getSource();
				     pr_nm = dm_du.getValueAt(target.getSelectedRow(), 0).toString();
				      // do some action if appropriate column
				      System.out.print(pr_nm);
				    equip_alt();
				      sp_alt();
				 }
			}
		});
		scrollPane_23.setViewportView(pt_alt);
		panel_45.setLayout(gl_panel_45);
		
		
		//Equip_scroll.setViewportView(equip_lib);
		
		
		JLabel lblImpactAlternatives = new JLabel("Impact Alternatives");
		lblImpactAlternatives.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JScrollPane scrollPane_24 = new JScrollPane();
		
		JScrollPane scrollPane_25 = new JScrollPane();
		
		JLabel label_6 = new JLabel("Search equivalent Eco-Invent Process");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		
		JButton button_16 = new JButton("Search");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dm_iei.setRowCount(0);
				
				String sql = "Select distinct Material_name, Material_type, Country from EI_new where Material_Name like '%"  + textField_10.getText() +  "%' ;";
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					//JOptionPane.showMessageDialog(null, "connection7 successful");		
						
						PreparedStatement pst = connection16.prepareStatement(sql);
					    ResultSet rs1 = pst.executeQuery();
					    
					    while(rs1.next())
					    {
					    	String mat_nm = rs1.getString(1);
					    	String mat_typ = rs1.getString(2);
					    	String con= rs1.getString(3);
					    	
					    	Object[] row = {mat_nm , mat_typ , con};
					    	dm_iei.addRow(row);
					    	//System.out.print("Yes");
					    	
					    }
					    connection16.close();
					  }
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				
			}
			
		});
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		
		JButton button_17 = new JButton("Add");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch( comboBox_1.getSelectedItem().toString())
				{
				case ("Local"): 
					spf = 1.00;
				break;
				case ("Country"): 
					spf = 0.95;
				break;
				case ("Continent"): 
					spf = 0.85;
				break;
				case ("other"): 
					spf = 0.75;
				break;
				case (" "): 
					spf = 0.70;
				}
				
				
				System.out.println(spf);
				conf = spf * tempf;
				System.out.println(conf);
				

				mat = dm_ei.getValueAt(table_ei.getSelectedRow(), 0).toString(); 
				instance = dm_imp.getValueAt(pro_imp.getSelectedRow(), 2).toString();
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection85 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection85 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					// JOptionPane.showMessageDialog(null, "connection1 successful");
					
					String new_sql =( "Select new_wt from macro_ex where Inst_nm = ?");
					
							PreparedStatement pst = connection85.prepareStatement(new_sql);
							pst.setString(1, instance);
							ResultSet rs1 = pst.executeQuery();
						    
						    while(rs1.next())
						    {
						    	imp_wt = rs1.getDouble(1);
						    	 System.out.println();
						    	 System.out.print(imp_wt);
						     }
						    connection85.close();
						  }
					catch(Exception ex)
					{
						ex.printStackTrace();
					}
				finally {
					try{
					rs.close(); prepared.close(); }//connection1.close(); }
					catch(Exception e1) { } 
				
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection85 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection85 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					// JOptionPane.showMessageDialog(null, "connection1 successful");
					
					String new_sql =( "Select Total from EI_new where Material_name=?");
					
							PreparedStatement pst = connection85.prepareStatement(new_sql);
							pst.setString(1, mat);
							ResultSet rs1 = pst.executeQuery();
						    
						    while(rs1.next())
						    {
						    	 tot = rs1.getDouble(1);
						    	 System.out.println();
						    	 System.out.print(tot);
						     }
						    connection85.close();
						  }
					catch(Exception ex)
					{
						ex.printStackTrace();
					}
				finally {
					try{
					rs.close(); prepared.close(); }//connection1.close(); }
					catch(Exception e1) { } 
					
					sum_tot = imp_wt * tot;
					
					
				
			
			//	mat_alt = dm_iei.getValueAt(table_ei.getSelectedRow(), 0).toString(); 
				
				try{
					Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
					 Connection connection1 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
					 Connection connection1 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
					// JOptionPane.showMessageDialog(null, "connection1 successful");
					
					String insertTableSQL =( "Update "+ response +" SET conf=?,mat_nm=? where Process_id=?");
					prepared = connection1.prepareStatement(insertTableSQL);
					
					prepared.setDouble(1, conf);
					prepared.setString(2, mat_alt);
					prepared.setString(3, pro_impalt);
					

					// execute insert SQL statement
					prepared.executeUpdate();
					
					System.out.println("Record is inserted into Project_lib table!");
					connection1.close();
			    } catch ( Exception e1 ) {
			      System.err.println( e1.getClass().getName() + ": " + e1.getMessage() );
			     e1.printStackTrace();
			    
			    }
				finally {
					try{
					rs.close(); prepared.close(); }//connection1.close(); }
					catch(Exception e1) { } }
			
			}
				}
			}
		});
		
		JLabel label_7 = new JLabel("Assigned space");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel label_8 = new JLabel("Spatial Factor");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnSave_8 = new JButton("Save");
		btnSave_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_39.removeAll();
				panel_39.repaint();
				panel_39.revalidate();
				panel_39.add(panel_40);
				panel_40.setVisible(true);
			}
		});
		GroupLayout gl_panel_44 = new GroupLayout(panel_44);
		gl_panel_44.setHorizontalGroup(
			gl_panel_44.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_44.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_44.createParallelGroup(Alignment.LEADING)
						.addComponent(lblImpactAlternatives, GroupLayout.PREFERRED_SIZE, 324, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_44.createSequentialGroup()
							.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(button_16))
						.addGroup(gl_panel_44.createSequentialGroup()
							.addComponent(scrollPane_24, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(scrollPane_25, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_panel_44.createParallelGroup(Alignment.LEADING)
								.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_44.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_44.createSequentialGroup()
									.addGap(3)
									.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_44.createSequentialGroup()
									.addGap(12)
									.addGroup(gl_panel_44.createParallelGroup(Alignment.LEADING)
										.addComponent(btnSave_8)
										.addComponent(button_17, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
									.addGap(11))))))
		);
		gl_panel_44.setVerticalGroup(
			gl_panel_44.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_44.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblImpactAlternatives, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_44.createParallelGroup(Alignment.LEADING)
						.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_44.createSequentialGroup()
							.addGap(16)
							.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_44.createSequentialGroup()
							.addGap(17)
							.addComponent(button_16)))
					.addGap(8)
					.addGroup(gl_panel_44.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane_24, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane_25, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_44.createSequentialGroup()
							.addGroup(gl_panel_44.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
							.addGap(24)
							.addGroup(gl_panel_44.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
							.addGap(35)
							.addComponent(button_17)
							.addGap(112)
							.addComponent(btnSave_8)))
					.addContainerGap(70, Short.MAX_VALUE))
		);
		comboBox_1.addItem("Local");
		comboBox_1.addItem("Country");
		comboBox_1.addItem("Continent");
		comboBox_1.addItem("Other");
		imp_ei = new JTable();
		scrollPane_25.setViewportView(imp_ei);
        Object[] columniei = {"Material Type","Sub-Categories"," Material name" , "Density ( Kg/mm^3 )"};
		dm_iei.setColumnIdentifiers(columniei);
		imp_ei.setModel(dm_iei);
		imp_ei.setBackground(SystemColor.control);
		imp_ei.setShowVerticalLines(false);
		imp_ei.setShowHorizontalLines(false);
		
		imp_pr = new JTable();
		imp_pr.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 1) {
				      JTable target = (JTable)e.getSource();
				      pro_impalt = dm_ipr.getValueAt(target.getSelectedRow(), 0).toString();
				      // do some action if appropriate column
				      System.out.print(pro_impalt);
				     
				   alt_prospace();
				      
				    }
			}
		});
		scrollPane_24.setViewportView(imp_pr);
		Object[] columnipr = {"Id","Process" , "Assigned Part name"};
		
		dm_ipr.setColumnIdentifiers(columnipr);
		imp_pr.setModel(dm_ipr);
		imp_pr.setBackground(SystemColor.control);
		imp_pr.setShowVerticalLines(false);
		imp_pr.setShowHorizontalLines(false);
		panel_44.setLayout(gl_panel_44);
		
		pro_imp.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
					    if (e.getClickCount() == 1) {
					      JTable target = (JTable)e.getSource();
					      pro_imp1 = dm_imp.getValueAt(target.getSelectedRow(), 0).toString();
					      // do some action if appropriate column
					      System.out.print(pro_imp1);
					     
					      imp_space();
					      
					    }
			}
					});
		
		comboBox.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				
				JComboBox<String> comboBox = (JComboBox<String>) e.getSource();

	                Object selected = comboBox.getSelectedItem();
	                if(selected.toString().equals("Material"))
	                	
	                {
	                	tabbedPane.setVisible(true);
	                	tabbedPane.removeAll();
	                	tabbedPane.addTab("Material Library", panel_33);
	    				panel_33.removeAll();
	    				panel_33.repaint();
	    				panel_33.revalidate();
	    				panel_33.add(panel_11);
	    				panel_11.setVisible(true);
	                	//panel_33.add(comp)
//	                	tabbedPane.setEnabled(true);
//	                	//tabbedPane.removeAll();
//	                	panel_12.setVisible(false);
//	                	
//	                	tabbedPane.setSelectedComponent(panel_11);
	                	//tabbedPane.addTab("Material", null, panel_11, null);
	                	tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
	                	
	            }
	               if(selected.toString().equals("Process"))
	                {
	            	   tabbedPane.setVisible(true);
	            	   tabbedPane.removeAll();
	                	tabbedPane.addTab("Process library", panel_15);
	                	panel_15.removeAll();
	                	panel_15.repaint();
	                	panel_15.revalidate();
	                	panel_15.add(panel_18);
	    				panel_18.setVisible(true);
	            	   //tabbedPane.addTab("Process", null,panel_12, null);
	                	/*tabbedPane.setEnabled(true);
	                	//tabbedPane.removeAll();
	                	tabbedPane.remove(panel_11);
	                	tabbedPane.remove(panel_13);
	                	tabbedPane.setSelectedComponent(panel_12);*/
	            	   //tabbedPane.remove(panel_11);
	                	//tabbedPane.remove(panel_13);
	            	   //tabbedPane.addTab("Process", null, panel_12, null);
	            	   tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
	            }
	               if(selected.toString().equals("Equipment"))
	                {
	            	   tabbedPane.setVisible(true);
	            	   tabbedPane.removeAll();
	                	tabbedPane.addTab("Equipment library", panel_21);
	                	panel_21.removeAll();
	                	panel_21.repaint();
	                	panel_21.revalidate();
	                	panel_21.add(panel_19);
	    				panel_19.setVisible(true);
	            	   //tabbedPane.addTab("Process", null,panel_12, null);
	                	/*tabbedPane.setEnabled(true);
	                	//tabbedPane.removeAll();
	                	tabbedPane.remove(panel_11);
	                	tabbedPane.remove(panel_13);
	                	tabbedPane.setSelectedComponent(panel_12);*/
	            	   //tabbedPane.remove(panel_11);
	                	//tabbedPane.remove(panel_13);
	            	   //tabbedPane.addTab("Process", null, panel_12, null);
	            	   tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
	            }
	               if(selected.toString().equals("LC Phase"))
	                {
	            	   tabbedPane.setVisible(true);
	            	   tabbedPane.removeAll();
	                	tabbedPane.addTab("LC Phase library", panel_26);
	                	
	            	   LCPhase();
	            	   //tabbedPane.addTab("Process", null,panel_12, null);
	                	/*tabbedPane.setEnabled(true);
	                	//tabbedPane.removeAll();
	                	tabbedPane.remove(panel_11);
	                	tabbedPane.remove(panel_13);
	                	tabbedPane.setSelectedComponent(panel_12);*/
	            	   //tabbedPane.remove(panel_11);
	                	//tabbedPane.remove(panel_13);
	            	   //tabbedPane.addTab("Process", null, panel_12, null);
	            	   tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
	            }
	               if(selected.toString().equals("Space"))
	                {
	            	   tabbedPane.setVisible(true);
	            	   tabbedPane.removeAll();
	                	tabbedPane.addTab("Space library", panel_23);
	                	panel_23.removeAll();
	                	panel_23.repaint();
	                	panel_23.revalidate();
	                	panel_23.add(panel_20);
	    				panel_20.setVisible(true);    	   
	            	   //tabbedPane.addTab("Process", null,panel_12, null);
	                	/*tabbedPane.setEnabled(true);
	                	//tabbedPane.removeAll();
	                	tabbedPane.remove(panel_11);
	                	tabbedPane.remove(panel_13);
	                	tabbedPane.setSelectedComponent(panel_12);*/
	            	   //tabbedPane.remove(panel_11);
	                	//tabbedPane.remove(panel_13);
	            	   //tabbedPane.addTab("Process", null, panel_12, null);
	            	   tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
	            }
	               if(selected.toString().equals("Relations"))
	                {
	            	   tabbedPane.setVisible(true);
	            	   tabbedPane.removeAll();
	                	tabbedPane.addTab("Assign Relations", panel_39);
	                	panel_39.removeAll();
	                	panel_39.repaint();
	                	panel_39.revalidate();
	                	panel_39.add(panel_40);
	    				panel_40.setVisible(true);
	            	   //tabbedPane.addTab("Process", null,panel_12, null);
	                	/*tabbedPane.setEnabled(true);
	                	//tabbedPane.removeAll();
	                	tabbedPane.remove(panel_11);
	                	tabbedPane.remove(panel_13);
	                	tabbedPane.setSelectedComponent(panel_12);*/
	            	   //tabbedPane.remove(panel_11);
	                	//tabbedPane.remove(panel_13);
	            	   //tabbedPane.addTab("Process", null, panel_12, null);
	            	   tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
	            }
	               
	               if(selected.toString().equals("Time"))
	                {
	            	   tabbedPane.setVisible(true);
	            	   tabbedPane.removeAll();
	                	tabbedPane.addTab("Time library", panel_36);
	                	panel_36.removeAll();
	                	panel_36.repaint();
	                	panel_36.revalidate();
	                	panel_36.add(Time);
	    				Time.setVisible(true);
	            	   pro_time();
	            	   
	            	   //tabbedPane.addTab("Process", null,panel_12, null);
	                	/*tabbedPane.setEnabled(true);
	                	//tabbedPane.removeAll();
	                	tabbedPane.remove(panel_11);
	                	tabbedPane.remove(panel_13);
	                	tabbedPane.setSelectedComponent(panel_12);*/
	            	   //tabbedPane.remove(panel_11);
	                	//tabbedPane.remove(panel_13);
	            	   //tabbedPane.addTab("Process", null, panel_12, null);
	            	   tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
	            }
	               if(selected.toString().equals("Impacts"))
	                {
	            	   tabbedPane.setVisible(true);
	            	   tabbedPane.removeAll();
	                	tabbedPane.addTab("Impacts library", Impact);
	                	Impact.removeAll();
	                	Impact.repaint();
	                	Impact.revalidate();
	                	Impact.add(panel_35);
	    				panel_35.setVisible(true);
	            	   pro_impact();
	            	   
	            	   //tabbedPane.addTab("Process", null,panel_12, null);
	                	/*tabbedPane.setEnabled(true);
	                	//tabbedPane.removeAll();
	                	tabbedPane.remove(panel_11);
	                	tabbedPane.remove(panel_13);
	                	tabbedPane.setSelectedComponent(panel_12);*/
	            	   //tabbedPane.remove(panel_11);
	                	//tabbedPane.remove(panel_13);
	            	   //tabbedPane.addTab("Process", null, panel_12, null);
	            	   tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
	            }
			}
		});
	                //
	                // Get the source of the component, which is our combo
	                // box.
	                //
		tabbedPane.addTab("Assign Relations", null, panel_39, null);
		
		
		panel_39.add(panel_47, "name_1126579149803578");
		
		JScrollPane scrollPane_28 = new JScrollPane();
		
		JScrollPane scrollPane_29 = new JScrollPane();
		
		JScrollPane scrollPane_30 = new JScrollPane();
		
		JScrollPane scrollPane_31 = new JScrollPane();
		
		JScrollPane scrollPane_32 = new JScrollPane();
		GroupLayout gl_panel_47 = new GroupLayout(panel_47);
		gl_panel_47.setHorizontalGroup(
			gl_panel_47.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_47.createSequentialGroup()
					.addGap(68)
					.addGroup(gl_panel_47.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_47.createSequentialGroup()
							.addComponent(scrollPane_31, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
							.addGap(70)
							.addComponent(scrollPane_32, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_47.createSequentialGroup()
							.addComponent(scrollPane_28, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(scrollPane_29, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrollPane_30, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(57, Short.MAX_VALUE))
		);
		gl_panel_47.setVerticalGroup(
			gl_panel_47.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_47.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_47.createParallelGroup(Alignment.LEADING, false)
						.addComponent(scrollPane_30, GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
						.addGroup(gl_panel_47.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(scrollPane_29, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
							.addComponent(scrollPane_28, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)))
					.addPreferredGap(ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
					.addGroup(gl_panel_47.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane_31, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane_32, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE))
					.addGap(81))
		);
		
		table_lcp = new JTable();
		scrollPane_32.setViewportView(table_lcp);
Object[] column_lcpa = {"Id","Equipemnt","Process"};
		
		dm_lcpa.setColumnIdentifiers(column_lcpa);
		table_lcp.setModel(dm_lcpa);
		table_lcp.setBackground(SystemColor.control);
		table_lcp.setShowVerticalLines(false);
		table_lcp.setShowHorizontalLines(false);
		
		table_imp = new JTable();
Object[] column_impa = {"Id"," imp"};
		
		dm_impa.setColumnIdentifiers(column_impa);
		table_imp.setModel(dm_impa);
		table_imp.setBackground(SystemColor.control);
		table_imp.setShowVerticalLines(false);
		table_imp.setShowHorizontalLines(false);
		scrollPane_31.setViewportView(table_imp);
		
		table_ids = new JTable();
		scrollPane_30.setViewportView(table_ids);
Object[] column_idsa = {"IdS","LongS","Lats","TimeyS", "DuraS","ImpS", "MenS" , "MachS" ," TransS"};

		
		dm_ids.setColumnIdentifiers(column_idsa);
		table_ids.setModel(dm_ids);
		table_ids.setBackground(SystemColor.control);
		table_ids.setShowVerticalLines(false);
		table_ids.setShowHorizontalLines(false);
		
		table_idp = new JTable();
		scrollPane_29.setViewportView(table_idp);
Object[] column_idpa = {"IdP","LongP","LatP", "TimeyP","DuraP","ImpP", "MenP" , "MachP" ," TransP"};
		
		dm_idp.setColumnIdentifiers(column_idpa);
		table_idp.setModel(dm_idp);
		table_idp.setBackground(SystemColor.control);
		table_idp.setShowVerticalLines(false);
		table_idp.setShowHorizontalLines(false);
		
		table_idc = new JTable();
		scrollPane_28.setViewportView(table_idc);
Object[] column_idc = {"IdC","LongC","LatC", "TimeyC","DuraC","ImpC", "MenC" , "MachC" ," TransC"};
		
		dm_idc.setColumnIdentifiers(column_idc);
		table_idc.setModel(dm_idc);
		table_idc.setBackground(SystemColor.control);
		table_idc.setShowVerticalLines(false);
		table_idc.setShowHorizontalLines(false);
		
		panel_47.setLayout(gl_panel_47);
		
		JLabel lblNewLabel_2 = new JLabel("Library");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(25, 11, 101, 23);
		panel_7.add(lblNewLabel_2);
		panel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
		    
				tabbedPane.setEnabled(true);
         	tabbedPane.removeAll();
				tabbedPane.addTab("Assign Relations", panel_39);
				
				
				/*panel_39.setVisible(true);
				panel_40.setVisible(true);
				panel_41.setVisible(false);
				panel_41.setVisible(false);
				panel_42.setVisible(false);
				panel_43.setVisible(false);
				panel_44.setVisible(false);*/
				//tabbedPane.insertTab("Assign Relations" ,null , panel_39 , null, 1);
				//tabbedPane.insertTab("Assign Relations" ,null , panel_39, null, 1);
			}
		});
		
		
		panel_6.setBounds(584, 91, 373, 45);
		panel.add(panel_6);
		panel_6.setLayout(null);
		panel_6.setBackground(new Color(208,208,208));
		panel_6.setBorder(new MatteBorder(1, 1, 1, 1,new Color(205,205,205)));
		
		JLabel lblNewLabel = new JLabel("Assign Relations");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(27, 11, 137, 23);
		panel_6.add(lblNewLabel);
		
	
		panel_8.setBackground(new Color(208,208,208));
		panel_8.setBorder(new MatteBorder(1, 1, 1, 1,new Color(205,205,205)));
		panel_8.setBounds(961, 91, 368, 45);
		panel.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Environmental Assessment");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 tabbedPane.removeAll();
             	tabbedPane.addTab("Environmental Assessment", panel_38);
             	panel_38.removeAll();
             	panel_38.repaint();
             	panel_38.revalidate();
             	panel_38.add(ea_pane);
				ea_pane.setVisible(true);
             	
			}
		});
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(21, 11, 220, 23);
		panel_8.add(lblNewLabel_1);
		
		
		panel_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*panel_1.setVisible(true);
				display.setVisible(false);*/
				panel_3.removeAll();
				panel_3.repaint();
				panel_3.revalidate();
				panel_3.add(panel_1);
				panel_1.setVisible(true);
			}
		});
		panel_10.setLayout(null);
		panel_10.setBorder(new MatteBorder(1, 1, 1, 1,new Color(205,205,205)));
		panel_10.setBackground(new Color(208, 208, 208));
		panel_10.setBounds(10, 40, 265, 45);
		panel.add(panel_10);
		
		JLabel lblNewProject = new JLabel("New Project");
		lblNewProject.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewProject.setBounds(10, 11, 143, 23);
		panel_10.add(lblNewProject);
		
		JPanel panel_14 = new JPanel();
		panel_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//panel_3.setVisible(true);
				/*display.setVisible(true);
				panel_1.setVisible(false);*/
				panel_3.removeAll();
				panel_3.repaint();
				panel_3.revalidate();
				panel_3.add(display);
				display.setVisible(true);
			}
		});
		panel_14.setLayout(null);
		panel_14.setBorder(new MatteBorder(1, 1, 1, 1,new Color(205,205,205)));
		panel_14.setBackground(new Color(208, 208, 208));
		panel_14.setBounds(285, 40, 289, 45);
		panel.add(panel_14);
		
		JLabel lblNewLabel_6 = new JLabel("Projects");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setBounds(31, 11, 109, 23);
		panel_14.add(lblNewLabel_6);
		
		
		/*panel_9.setBounds(134, 40, 440, 632);
		panel.add(panel_9);
		panel_9.setVisible(false);
		panel_9.setLayout(null);
		label_list.setBounds(36, 34, 106, -26);
		label_list.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_9.add(label_list);*/
			
		/* DefaultMutableTreeNode root = new DefaultMutableTreeNode(returnstr());
		 DefaultMutableTreeNode child1 = new DefaultMutableTreeNode(returnstr2());
	        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode(returnstr3());
	        root.add(child1);
	        root.add(child2);
	        tree = new JTree(root);
		       add(tree);*/
		
		
	}
	
	

	public static void main(String[] args) {
<<<<<<< HEAD
//		String startDir=System.getProperty("user.dir");
		JOptionPane.showMessageDialog(null,startDir);
		lblDefaultPath.setText(startDir);
		
=======
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
	
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

}
	public void LCPhase()
	{
		String sql = "Select Process_id,Process_name from Process_lib";
		try{
			Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
			 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
			 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
			//JOptionPane.showMessageDialog(null, "connection7 successful");		
				
				PreparedStatement pst = connection16.prepareStatement(sql);
			    ResultSet rs1 = pst.executeQuery();
			    
			    while(rs1.next())
			    {
			    	String id = rs1.getString(1);
			    	String process = rs1.getString(2);
			    	
			    	
			    	Object[] row = {id,process};
			    	dm_lc.addRow(row);
			    	
			    	
			    }
			    dm_lc.removeRow(0);
			    connection16.close();
			   
			  }
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void pro_alt()
	{
		combo_alt.removeAllItems();
		String sql = "Select alt_name  from proalt_assign where p_id ='" + pr_id + "' ; ";
		try{
			Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
			 Connection connection66 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
			 Connection connection66 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
		//	JOptionPane.showMessageDialog(null, "connection7 successful");		
				
				PreparedStatement pst = connection66.prepareStatement(sql);
			    ResultSet rs1 = pst.executeQuery();
			    
			    while(rs1.next())
			    {
			    	String alt = rs1.getString(1);
			    	combo_alt.addItem(alt);
			    		    	
			    }
			   
			    connection66.close();
			   
			  }
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void density()
	{
		 String mat_select = table_den.getModel().getValueAt(table_den.getSelectedRow(), 2).toString();
			String sql1 = "Select density from mat where name = ? ";
			try{
				Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
				 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
				 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				//JOptionPane.showMessageDialog(null, "connection7 successful");		
					
					PreparedStatement pst = connection16.prepareStatement(sql1);
				pst.setString(1, mat_select);
				    ResultSet rs1 = pst.executeQuery();
				    
				    
				    while(rs1.next())
				    {
				    	density.setText(rs1.getString(1));
				    	//System.out.print("Yes");
				    	
				    }
				    connection16.close();
				  }
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
	}
	public void equip()
	{
		lm.removeAllElements();
		
		//pro_select = dm_time.getValueAt(pro_tab.getSelectedRow(), 0).toString();
		String sql_equip = "SELECT DISTINCT Equip_name FROM Equip_lib inner join Pro_equip ON equip_lib.equip_id =Pro_equip.eid and Pro_equip.pid='" + pr_id1 + "' ;";
		try{
			Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
			 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
			 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
			//JOptionPane.showMessageDialog(null, "connection7 successful");		
				
				PreparedStatement pst = connection16.prepareStatement(sql_equip);
				//pst.setString(1,pro_select);
				ResultSet rs = pst.executeQuery();
				while(rs.next())
				{
					String id = rs.getString("Equip_name");
				
			        lm.addElement(id);
				}
				list_1.setModel(lm);
			    connection16.close();
			   
			  }
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void space()
	{
		
		//pro_select = dm_time.getValueAt(pro_tab.getSelectedRow(), 0).toString();
		String sql_equip = "SELECT Space_role FROM space_lib INNER JOIN Process_lib ON Space_lib.space_id = Process_lib.Space_id and Process_lib.process_id='" + pr_id1 + "' ;";
		try{
			Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
			 Connection connection47 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
			 Connection connection47 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
			//JOptionPane.showMessageDialog(null, "connection47 successful");		
				
				PreparedStatement pst = connection47.prepareStatement(sql_equip);
				//pst.setString(1,pro_select);
				ResultSet rs = pst.executeQuery();
				while(rs.next())
				{
					String loc = rs.getString("Space_role");
					sp.setText(loc);
					
					
				}
			    connection47.close();
			   
			  }
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void sp_alt()
	{
		String sql_time = "SELECT Space_id from " + response + " where Process_id =" + pr_nm;
		try{
			Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
			 Connection connection47 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
			 Connection connection47 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
			//JOptionPane.showMessageDialog(null, "connection47 successful");		
				
				PreparedStatement pst = connection47.prepareStatement(sql_time);
				//pst.setString(1,pro_select);
				ResultSet rs = pst.executeQuery();
				while(rs.next())
				{
					String loc = rs.getString(1);
					textField_12.setText(loc);
					
					
				}
			    connection47.close();
			   
			  }
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void equip_alt()
	{
		String sql_eq = "SELECT equip_id from " + response + " where Process_id =" + pr_nm;
		try{
			Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
			 Connection connection47 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
			 Connection connection47 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
			//JOptionPane.showMessageDialog(null, "connection47 successful");		
				
				PreparedStatement pst = connection47.prepareStatement(sql_eq);
				//pst.setString(1,pro_select);
				ResultSet rs = pst.executeQuery();
				while(rs.next())
				{
					String eq = rs.getString(1);
					textField_6.setText(eq);
					
					
				}
			    connection47.close();
			   
			  }
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void alt_prospace()
	{
		
		//pro_select = dm_time.getValueAt(pro_tab.getSelectedRow(), 0).toString();
		String sql_equip = "SELECT Space_role FROM space_lib INNER JOIN Process_lib ON Space_lib.space_id = Process_lib.Space_id and Process_lib.process_id='" + pr_id + "' ;";
		try{
			Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
			 Connection connection47 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
			 Connection connection47 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
			//JOptionPane.showMessageDialog(null, "connection47 successful");		
				
				PreparedStatement pst = connection47.prepareStatement(sql_equip);
				//pst.setString(1,pro_select);
				ResultSet rs = pst.executeQuery();
				while(rs.next())
				{
					String loc = rs.getString("Space_role");
					//sp1.setText(loc);
					textField_12.setText(loc);
					textField_11.setText(loc);
					
				}
			    connection47.close();
			   
			  }
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void imp_space()
	{
		
		//pro_select = dm_time.getValueAt(pro_tab.getSelectedRow(), 0).toString();
		String sql_imp = "SELECT Country FROM space_lib INNER JOIN Process_lib ON Space_lib.space_id = Process_lib.Space_id and Process_lib.process_id='" + pro_imp1 + "' ;";
		try{
			Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
			 Connection connection47 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
			 Connection connection47 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
			//JOptionPane.showMessageDialog(null, "connection47 successful");		
				
				PreparedStatement pst = connection47.prepareStatement(sql_imp);
				//pst.setString(1,pro_select);
				ResultSet rs = pst.executeQuery();
				while(rs.next())
				{
					String loc = rs.getString("Country");
					as_sp.setText(loc);
				}
			    connection47.close();
			   
			  }
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void pro_space()
	{
		
		//pro_select = dm_time.getValueAt(pro_tab.getSelectedRow(), 0).toString();
		String sql_imp = "SELECT Country FROM space_lib INNER JOIN Process_lib ON Space_lib.space_id = Process_lib.Space_id and Process_lib.process_id='" + pro_imp1 + "' ;";
		try{
			Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
			 Connection connection47 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
			 Connection connection47 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
			//JOptionPane.showMessageDialog(null, "connection47 successful");		
				
				PreparedStatement pst = connection47.prepareStatement(sql_imp);
				//pst.setString(1,pro_select);
				ResultSet rs = pst.executeQuery();
				while(rs.next())
				{
					String loc = rs.getString("Country");
					as_sp.setText(loc);
				}
			    connection47.close();
			   
			  }
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	 public void Testing()
	  {
	    response = javax.swing.JOptionPane.showInputDialog("Enter relation name");
	    String msg = "";
	    if(response == null) msg = "cancel, escape or 'x' selected";
	    else if(response.equals("")) msg = "OK button, but nothing entered";
	    else msg = "OK button, you entered "+response;
	    javax.swing.JOptionPane.showMessageDialog(null, msg);
	    String[] _args = null;
		/*InputCheckerAR inp = new InputCheckerAR();
	   inp.getname(response);*/
	    //setname(response);
	  /* File dir = new File(response);
	   dir.mkdir();
	   
	   System.out.println(dir.getPath());*/
	   /* InputCheckerAR.main(_args);*/
/*return response;
*/
	  }
	 public void create_tab() throws IOException
	  {
		 System.out.print("here");
		 String sql = "Create table if not exists " + response + " as select * from process_lib ";
			try{
				Class.forName("org.sqlite.JDBC");
				
<<<<<<< HEAD
				 Connection connection72 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
				 Connection connection72 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				 Statement stmt =  connection72.createStatement();
				 //JOptionPane.showMessageDialog(null, "connection12 successful");		
					
					stmt.executeUpdate(sql);
				      
					connection72.close();
	
				  }
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
<<<<<<< HEAD
			source = new File(startDir +"\\templates");
			dest = new File(startDir +"\\Relations_new");
=======
			source = new File("M:\\Template");
			dest = new File("M:\\Relations_new");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
			copy_folder(  source, dest);
	  }
	 public void create_folder()
	  {
<<<<<<< HEAD
		 work_dir = startDir +"\\Relations\\";
=======
		 work_dir = "M:\\Relations\\";
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
		 File file = new File(work_dir + response);
		 file.mkdir();
		 System.out.print("Folder created" + file.getAbsolutePath());
		  }
	 public void create_mainfolder()
	  {
<<<<<<< HEAD
		 work_dir = startDir ;
		 File file = new File(work_dir + textProject.getText()  );
=======
		 work_dir = "M:\\";
		 File file = new File(work_dir + textField.getText()  );
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
		 file.mkdir();
		 System.out.print("Folder created" + file.getAbsolutePath());
		  }
	public void pro_time()
	{		
		String sql = "Select Process_id,Process_name from Process_lib";
		try{
			Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
			 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
			 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
			//JOptionPane.showMessageDialog(null, "connection7 successful");		
				
				PreparedStatement pst = connection16.prepareStatement(sql);
			    ResultSet rs1 = pst.executeQuery();
			    
			    while(rs1.next())
			    {
			    	String id = rs1.getString(1);
			    	String process = rs1.getString(2);
			    	
			    	
			    	Object[] row = {id,process};
			    	 dm_time.addRow(row);
			    	
			    	
			    }
			    dm_time.removeRow(0);
			    connection16.close();
			   
			  }
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		/*pro_select = dm_time.getValueAt(pro_tab.getSelectedRow(), 0).toString();
			String sql_equip = "SELECT Equip_name FROM Equip_lib INNER JOIN Process_lib on equip_lib.equip_id = Process_lib.equip_id && process_id=?";
			try{
				Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
				 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
				 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
				JOptionPane.showMessageDialog(null, "connection7 successful");		
					
					PreparedStatement pst = connection16.prepareStatement(sql_equip);
					pst.setString(1,pro_select);
					ResultSet rs = pst.executeQuery();
					while(rs.next())
					{
						String id = rs.getString("Equip_name");
						textField_5.setText(id);
					}
				    connection16.close();
				   
				  }
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		*/
	}
	public void exportidc()
	{ 
		/*ExcelExporter exp=new ExcelExporter();
		try {
			 exp.exportTable( dm_c ,new File("M:\\Template\\IDC.xls"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	*/
		try{
		 Workbook wb = new HSSFWorkbook();
		    CreationHelper createhelper = wb.getCreationHelper();
		    Sheet sheet = wb.createSheet("new sheet");
		    Row row = null;
		    Cell cell = null;
		   
		  //  cell.setCellValue(dm_c.getColumnName(0)+"\t");
				
			
		    for (int i=0;i<dm_c.getRowCount();i++) {
		        row = sheet.createRow(i);
		        for (int j=0;j<dm_c.getColumnCount();j++) {
		             
		            cell = row.createCell(j);
		          // cell.setCellValue(column_idc[]+"\t");
		         //   cell.setCellValue(dm_c.getColumnName(i)+"\t");
		            cell.setCellValue((String) dm_c.getValueAt(i, j));
		        }
		    }
		     
		    
<<<<<<< HEAD
		    FileOutputStream out = new FileOutputStream(startDir+"\\templates\\IDC.xls");
=======
		    FileOutputStream out = new FileOutputStream("M:\\templates\\IDC.xls");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
		    wb.write(out);
		    out.close();
		} catch (FileNotFoundException ex) {
		    Logger.getLogger(main.class.getName()).log(Level.FATAL, null, ex);
		} catch (IOException ex) {
		    Logger.getLogger(main.class.getName()).log(Level.FATAL, null, ex);
		}
		     
	}  
public void exportTable(DefaultTableModel model,File file) throws IOException {
		
		FileWriter out=new FileWriter(file);
		@SuppressWarnings("resource")
		BufferedWriter bw=new BufferedWriter(out);
		for(int i=0;i<model.getColumnCount();i++)
		{
			bw.write(model.getColumnName(i)+"\t");
		}
		bw.write("\n");
		//System.out.println(model.getValueAt(2, 2));
		for(int i=0;i<model.getRowCount();i++)
		{
			for(int j=0;j<model.getColumnCount();j++)
			{
				
				System.out.println(model.getValueAt(i,j));
				//Object data = model.getValueAt(i, j);
				if (model.getValueAt(i,j) != null)
				{
				    bw.write(model.getValueAt(i,j).toString() + "\t") ;
				}
				else if  (model.getValueAt(i,j) == null)
				{
				    bw.write("0" + "\t") ;
				}
				// bw.write(model.getValueAt(i,j).toString()+"\t");
			}
			bw.write("\n");
		}
		bw.close();
		System.out.print("file written to"+file);
		
		
		
	}

	public void exportplc()
	{ 
		try{
		 Workbook wb = new HSSFWorkbook();
		    CreationHelper createhelper = wb.getCreationHelper();
		    Sheet sheet = wb.createSheet("new sheet");
		    Row row = null;
		    Cell cell = null;
		    for (int i=0;i<dm_lcp.getRowCount();i++) {
		        row = sheet.createRow(i);
		        for (int j=0;j<dm_lcp.getColumnCount();j++) {
		             
		            cell = row.createCell(j);
		            cell.setCellValue((String) dm_lcp.getValueAt(i, j));
		        }
		    }
		     
		    
<<<<<<< HEAD
		    FileOutputStream out = new FileOutputStream(startDir +"\\Template\\processLCPhase.xls");
=======
		    FileOutputStream out = new FileOutputStream("M:\\Template\\processLCPhase.xls");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
		    wb.write(out);
		    out.close();
		} catch (FileNotFoundException ex) {
		    Logger.getLogger(main.class.getName()).log(Level.FATAL, null, ex);
		} catch (IOException ex) {
		    Logger.getLogger(main.class.getName()).log(Level.FATAL, null, ex);
		}
		     
		   }
	
	public void exportidp()
	{
		try{
		 Workbook wb = new HSSFWorkbook();
		    CreationHelper createhelper = wb.getCreationHelper();
		    Sheet sheet = wb.createSheet("new sheet");
		    Row row = null;
		    Cell cell = null;
		    for (int i=0;i<dm_p.getRowCount();i++) {
		        row = sheet.createRow(i);
		        for (int j=0;j<dm_p.getColumnCount();j++) {
		             
		            cell = row.createCell(j);
		            cell.setCellValue((String) dm_p.getValueAt(i, j));
		        }
		    }
		     
		    
<<<<<<< HEAD
		    FileOutputStream out = new FileOutputStream(startDir+"\\templates\\IDP.xls");
=======
		    FileOutputStream out = new FileOutputStream("M:\\templates\\IDP.xls");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
		    wb.write(out);
		    out.close();
		} catch (FileNotFoundException ex) {
		    Logger.getLogger(main.class.getName()).log(Level.FATAL, null, ex);
		} catch (IOException ex) {
		    Logger.getLogger(main.class.getName()).log(Level.FATAL, null, ex);
		}
		     
		   }
	
	public void exportids()
	{
		try{
		 Workbook wb = new HSSFWorkbook();
		    CreationHelper createhelper = wb.getCreationHelper();
		    Sheet sheet = wb.createSheet("new sheet");
		    Row row = null;
		    Cell cell = null;
		    for (int i=0;i<dm_s.getRowCount();i++) {
		        row = sheet.createRow(i);
		        for (int j=0;j<dm_s.getColumnCount();j++) {
		             
		            cell = row.createCell(j);
		            cell.setCellValue((String) dm_s.getValueAt(i, j));
		        }
		    }
		     
		    
<<<<<<< HEAD
		    FileOutputStream out = new FileOutputStream(startDir+"\\templates\\IDS.xls");
=======
		    FileOutputStream out = new FileOutputStream("M:\\templates\\IDS.xls");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
		    wb.write(out);
		    out.close();
		} catch (FileNotFoundException ex) {
		    Logger.getLogger(main.class.getName()).log(Level.FATAL, null, ex);
		} catch (IOException ex) {
		    Logger.getLogger(main.class.getName()).log(Level.FATAL, null, ex);
		}
		     
		   }
	public void exportidca()
	{ 
		try{
		 Workbook wb = new HSSFWorkbook();
		    CreationHelper createhelper = wb.getCreationHelper();
		    Sheet sheet = wb.createSheet("new sheet");
		    Row row = null;
		    Cell cell = null;
		    for (int i=0;i<dm_idc.getRowCount();i++) {
		        row = sheet.createRow(i);
		        for (int j=0;j<dm_idc.getColumnCount();j++) {
		             
		            cell = row.createCell(j);
		            cell.setCellValue((String) dm_idc.getValueAt(i, j));
		        }
		    }
		     
		    
<<<<<<< HEAD
		    FileOutputStream out = new FileOutputStream(startDir +"\\Relations\\" + response +"\\IDCA.xls");
=======
		    FileOutputStream out = new FileOutputStream("M:\\Relations\\" + response +"\\IDCA.xls");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
		    wb.write(out);
		    out.close();
		} catch (FileNotFoundException ex) {
		    Logger.getLogger(main.class.getName()).log(Level.FATAL, null, ex);
		} catch (IOException ex) {
		    Logger.getLogger(main.class.getName()).log(Level.FATAL, null, ex);
		}
		     
		   }
	public void exportidpa()
	{ 
		try{
		 Workbook wb = new HSSFWorkbook();
		    CreationHelper createhelper = wb.getCreationHelper();
		    Sheet sheet = wb.createSheet("new sheet");
		    Row row = null;
		    Cell cell = null;
		    for (int i=0;i<dm_idp.getRowCount();i++) {
		        row = sheet.createRow(i);
		        for (int j=0;j<dm_idp.getColumnCount();j++) {
		             
		            cell = row.createCell(j);
		            cell.setCellValue((String) dm_idp.getValueAt(i, j));
		        }
		    }
		     
		    
<<<<<<< HEAD
		    FileOutputStream out = new FileOutputStream(startDir +"\\Relations\\" + response +"\\IDPA.xls");
=======
		    FileOutputStream out = new FileOutputStream("M:\\Relations\\" + response +"\\IDPA.xls");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
		    wb.write(out);
		    out.close();
		} catch (FileNotFoundException ex) {
		    Logger.getLogger(main.class.getName()).log(Level.FATAL, null, ex);
		} catch (IOException ex) {
		    Logger.getLogger(main.class.getName()).log(Level.FATAL, null, ex);
		}
		     
		   }
	public void exportidsa()
	{ 
		try{
		 Workbook wb = new HSSFWorkbook();
		    CreationHelper createhelper = wb.getCreationHelper();
		    Sheet sheet = wb.createSheet("new sheet");
		    Row row = null;
		    Cell cell = null;
		    for (int i=0;i<dm_ids.getRowCount();i++) {
		        row = sheet.createRow(i);
		        for (int j=0;j<dm_ids.getColumnCount();j++) {
		             
		            cell = row.createCell(j);
		            cell.setCellValue((String) dm_ids.getValueAt(i, j));
		        }
		    }
		     
		    
<<<<<<< HEAD
		    FileOutputStream out = new FileOutputStream(startDir +"\\Relations\\" + response +"\\IDSA.xls");
=======
		    FileOutputStream out = new FileOutputStream("M:\\Relations\\" + response +"\\IDSA.xls");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
		    wb.write(out);
		    out.close();
		} catch (FileNotFoundException ex) {
		    Logger.getLogger(main.class.getName()).log(Level.FATAL, null, ex);
		} catch (IOException ex) {
		    Logger.getLogger(main.class.getName()).log(Level.FATAL, null, ex);
		}
		     
		   }
	public void copy_folder(File src, File dest)throws IOException{
	    	
	    	if(src.isDirectory()){
	    		
	    		//if directory not exists, create it
	    		if(!dest.exists()){
	    		   dest.mkdir();
	    		   System.out.println("Directory copied from " 
	                              + src + "  to " + dest);
	    		}
	    		
	    		//list all the directory contents
	    		String files[] = src.list();
	    		
	    		for (String file : files) {
	    		   //construct the src and dest file structure
	    		   File srcFile = new File(src, file);
	    		   File destFile = new File(dest, file);
	    		   //recursive copy
	    		   copy_folder(srcFile,destFile);
	    		}
	    	   
	    	}else{
	    		//if file, then copy it
	    		//Use bytes stream to support all file types
	    		InputStream in = new FileInputStream(src);
	    	        OutputStream out = new FileOutputStream(dest); 
	    	                     
	    	        byte[] buffer = new byte[1024];
	    	    
	    	        int length;
	    	        //copy the file content in bytes 
	    	        while ((length = in.read(buffer)) > 0){
	    	    	   out.write(buffer, 0, length);
	    	        }
	 
	    	        in.close();
	    	        out.close();
	    	        System.out.println("File copied from " + src + " to " + dest);
	    	}
	}
	public void pop_mat()
	{
		String sql = "Select  Inst_nm, ass_mat , weight , vol  from macro_ex ";
		try{
			Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
			 Connection connection62 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
			 Connection connection62 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
			//JOptionPane.showMessageDialog(null, "connection12 successful");		
				
				PreparedStatement pst = connection62.prepareStatement(sql);
			    ResultSet rs1 = pst.executeQuery();
			    
			    while(rs1.next())
			    {
			    	
			    	String inst_nm = rs1.getString(1);
			    	String mat = rs1.getString(2);
			    	double wt = rs1.getDouble(3);
			    	double vol = rs1.getDouble(4);
			    	
			    	Object[] row = {inst_nm,mat ,wt ,vol  };
			    	dm_mat.addRow(row);
			    	System.out.print("Yes");
			    	
			    }
			    connection62.close();
dm_mat.removeRow(0);
			  }
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void pro_impact()
	{
		
		String sql = "Select Process_id,Process_name,Part from Process_lib";
		//String sql2 = "Select country from space_lib"
		try{
			Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
			 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
			 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
			//JOptionPane.showMessageDialog(null, "connection16 successful");		
				
				PreparedStatement pst = connection16.prepareStatement(sql);
			    ResultSet rs1 = pst.executeQuery();
			    
			    while(rs1.next())
			    {
			    	String id = rs1.getString(1);
			    	String process = rs1.getString(2);
			    	String pnam= rs1.getString(3);
			    	
			    	Object[] row = {id,process,pnam};
			    	 dm_imp.addRow(row);
			    			    			    	
			    }
			    dm_imp.removeRow(0);
			    connection16.close();
			  //  dm_imp.addColumn("Space name", new String[]{pro1});
			  }
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		String sql2= "SELECT country||' ' ||city||' ' ||state || ' ' ||continent FROM Space_lib inner join Process_lib ON space_lib.space_id =Process_lib.space_id";
		try{
			Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
			 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
			 Connection connection16 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
			//JOptionPane.showMessageDialog(null, "connection16 successful");		
				
				PreparedStatement pst = connection16.prepareStatement(sql2);
			    ResultSet rs1 = pst.executeQuery();
			    
			    while(rs1.next())
			    {
			    	 results.add(rs1.getString(1));
			    	 //dm_imp.addRow(new String[]{ results , "" ,""});	
			    	 
			    }
			   // dm_imp.addrow("Space name", results);
			    //dm_imp.removeRow(0);
			    connection16.close();
			    System.out.println(results);
			  }
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public  void setname(String st1){
		s1 = st1;
		System.out.println(s1 +"jhiuafnkngjkwhqgiowqngklbouwerhgoianswgjkbgouewhgionszkvj nkjghaoigjwlgknsjkghioswjgwlaskngjkabgoawh");
	}
	public String getname()
	{
		System.out.println(s1 +"jhiuafnkngjkwhqgiowqngklbouwerhgoianswgjkbgouewhgionszkvj nkjghaoigjwlgknsjkghioswjgwlaskngjkabgoawh");
		return s1;
	}
	public void fillcombo()
	{
		//Type_combo.removeAll();
		try{
			Class.forName("org.sqlite.JDBC");
<<<<<<< HEAD
			 Connection connection6 = DriverManager.getConnection("jdbc:sqlite:"+startDir+"\\templates\\Project.sqlite");
=======
			 Connection connection6 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Nitesh\\Desktop\\SM\\Project.sqlite");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
			// JOptionPane.showMessageDialog(null, "connection6 successful");
			 //connection = sqlite_conn.dbConnector();
			String sql = "SELECT DISTINCT type FROM mat";
			prepared = connection6.prepareStatement(sql);
			rs = prepared.executeQuery();
			
			while (rs.next())
			{
				//Type_combo.addItem(rs.getString("type"));
				 
			}
			connection6.close();
		}catch(Exception e2){
			JOptionPane.showMessageDialog(null, e2);
		}
		finally {
			try{
			rs.close(); prepared.close(); connection.close();}
			catch(Exception e1) { } }
	}
	
	public  void getstr(String st1){
		s1 = st1;
	}
	public  String returnstr()
	{
		//System.out.println(s1);
		return s1;
	}
	public  void getstr2(String st2)
	{
		s2 = st2;
	}
	public  String returnstr2()
	{//System.out.println(s2);
		return s2;
	}
	public  void getstr3(String st3)
	{
		s3 = st3;
			}
	public  String returnstr3()
	{
	//System.out.println(s3);
		return s3;
	}
<<<<<<< HEAD
	public JTree getTree() {
		return tree;
	}
=======
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
}


