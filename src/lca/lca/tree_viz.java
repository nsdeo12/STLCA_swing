package lca;

import java.io.IOException;

import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PShape;
import processing.data.Table;
import processing.data.TableRow;

public class tree_viz extends PApplet {
	
	PApplet parent;

	public tree_viz(PApplet _parent){
		parent = _parent;
	}
	
	public tree_viz (){}
	
	public static void main(String _args[]){
		PApplet.main(new String[]{"--present", "lca.tree_viz"});
	}
	
	boolean abutton = false;
	boolean bbutton = false;
	boolean buttonmach = false;
	boolean buttonman = false;
	int nadj=5;
	int UID = 0;
	int Vis=100;
	int Vis2=200;
	int Vis1 =100;
	int dzoom = 40;
	PShape symtruck;
	PShape symman;
	PShape symmach;
	float newxloc = 0;
	float newyloc = 0;
	PImage bg;
	PImage img;
	int value = 0;
	float xo;
	float yo;
	int panx;
	int pany=-150;
	int sum;
	float zoom = 1;
	float angle = 0;
	float imp1, imp2, imp3, imp4, imp5, imp6, imptotal; 
	float p_sum_imp;
	float val_conf, imp , pro_multiz = 0 , multiply = 0, pro_multinz = 0 , tot_imp = 0 ;
	float nze = 0 , ze = 0 , tot_pro = 0;

	int cols = 28;
	int cols1 =104;
	int r = 50;
	int s = 20;
	
int y =-100;
//	int rows = 55; // Row no 2 to Row no Last... n-1 rows from excel
	int rowc()
	{
	Table table11 = loadTable("C:\\Users\\Nitesh\\Desktop\\boeing 747-8\\Input_original.csv", "header");
	int rowc = table11.getRowCount();
	return rowc;
	}
	int rows = rowc();
	//int rows1=14;
	int rowc1()
	{
	Table table11 = loadTable("M:\\templates\\new.csv", "header");
	int rowc1 = table11.getRowCount();
	return rowc1;
	}
	int rows1 = rowc1();
	float locationassign=1;
	float sameloc=1;
	int cols()
	{
		//Table table1 = loadTable("C:\\Users\\Nitesh\\Desktop\\Priyal Files\\new.csv", "header");
		Table table1 = loadTable("M:\\templates\\new1.csv", "header");
		int colc = table1.getRowCount();
		return colc;
	}
   
    int columns = cols();
	String[][]Partname = new String[cols1+1][rows1+1];
	//String pa[][];
	//General
	float a, b, c, d;
	int x,z;
	int rl10, gl10, bl10, rl12, gl12, bl12, rl14, gl14, bl14, rl16, gl16, bl16, rl17, gl17, bl17;
	String pr, su;
	float[][] loctime = new float[cols+1][rows+1];
	float[][] pp = new float[cols1+1][rows1];
	float[][]tr ;
	float[][] xloctime = new float[cols+1][rows+1];
	float[][] yloctime = new float[cols+1][rows+1];
	float[][] zloctime = new float[cols+1][rows+1];
	float[][] latloctime = new float[cols+1][rows+1];
	float[][] lonloctime = new float[cols+1][rows+1];
	float[]xxloctime = new float[rows];
	float[][] cell = new float[cols1+1][rows1+1];
	float[][] newcell = new float[cols1+1][rows1+1];

	//Suffix gives phase information. For eg nzpart1 means nzpart of material phase

	/*//Material
	float imatsum, ipart1, iass1, ipro1;
	float nzpart1, nzass1, nzpro1, zpart1, zass1, zpro1;
	float nzsumass1, zsumass1, nzsumpro1, zsumpro1;
	float ConfidencePart1, ConfidenceAss1, ConfidencePro1;
	float[] part_multipnz1= new float[rows+1];
	float[] part_multipz1 = new float[rows+1];
	float[] ass_multipnz1 = new float[rows+1];
	float[] ass_multipz1 = new float[rows+1];
	float[] pro_multipnz1 = new float[rows+1]; 
	float[] pro_multipz1 = new float[rows+1]; 
	float sumpartnz_multip1, sumpartz_multip1, sumassnz_multip1, sumassz_multip1, sumpronz_multip1, sumproz_multip1;*/
	//Material Cases
	float imatsumc, ipart1c, iass1c, ipro1c;
	float nzpart1c, nzass1c, nzpro1c, zpart1c, zass1c, zpro1c;
	float nzsumass1c, zsumass1c, nzsumpro1c, zsumpro1c;
	float ConfidencePart1c, ConfidenceAss1c, ConfidencePro1c;
	float[] part_multipnz1c= new float[rows+1];
	float[] part_multipz1c = new float[rows+1];
	float[] ass_multipnz1c = new float[rows+1];
	float[] ass_multipz1c = new float[rows+1];
	float[] pro_multipnz1c = new float[rows+1]; 
	float[] pro_multipz1c = new float[rows+1]; 
	float sumpartnz_multip1c=0, sumpartz_multip1c=0, sumassnz_multip1c=0, sumassz_multip1c=0, sumpronz_multip1c=0, sumproz_multip1c=0;
	//MaterialPart
	float imatsump, ipart1p, iass1p, ipro1p;
	float nzpart1p, nzass1p, nzpro1p, zpart1p, zass1p, zpro1p;
	float nzsumass1p, zsumass1p, nzsumpro1p, zsumpro1p;
	float ConfidencePart1p, ConfidenceAss1p, ConfidencePro1p;
	float[] part_multipnz1p= new float[rows+1];
	float[] part_multipz1p = new float[rows+1];
	float[] ass_multipnz1p = new float[rows+1];
	float[] ass_multipz1p = new float[rows+1];
	float[] pro_multipnz1p = new float[rows+1]; 
	float[] pro_multipz1p = new float[rows+1]; 
	float sumpartnz_multip1p=0, sumpartz_multip1p=0, sumassnz_multip1p=0, sumassz_multip1p=0, sumpronz_multip1p=0, sumproz_multip1p=0;

	/*//Manufacturing
	float imansum, ipart2, iass2, ipro2;
	float nzpart2, nzass2, nzpro2, zpart2, zass2, zpro2;
	float nzsumass2, zsumass2, nzsumpro2, zsumpro2;
	float ConfidencePart2, ConfidenceAss2, ConfidencePro2;
	float[] part_multipnz2= new float[rows+1];
	float[] part_multipz2 = new float[rows+1];
	float[] ass_multipnz2 = new float[rows+1];
	float[] ass_multipz2 = new float[rows+1];
	float[] pro_multipnz2 = new float[rows+1]; 
	float[] pro_multipz2 = new float[rows+1]; 
	float sumpartnz_multip2, sumpartz_multip2, sumassnz_multip2, sumassz_multip2, sumpronz_multip2, sumproz_multip2;*/
	//Manufacturing Cases
	float imansumc, ipart2c, iass2c, ipro2c;
	float nzpart2c, nzass2c, nzpro2c, zpart2c, zass2c, zpro2c;
	float nzsumass2c, zsumass2c, nzsumpro2c, zsumpro2c;
	float ConfidencePart2c, ConfidenceAss2c, ConfidencePro2c;
	float[] part_multipnz2c= new float[rows+1];
	float[] part_multipz2c = new float[rows+1];
	float[] ass_multipnz2c = new float[rows+1];
	float[] ass_multipz2c = new float[rows+1];
	float[] pro_multipnz2c = new float[rows+1]; 
	float[] pro_multipz2c = new float[rows+1]; 
	float sumpartnz_multip2c, sumpartz_multip2c, sumassnz_multip2c, sumassz_multip2c, sumpronz_multip2c, sumproz_multip2c;
	//ManufacturingPart
	float imansump, ipart2p, iass2p, ipro2p;
	float nzpart2p, nzass2p, nzpro2p, zpart2p, zass2p, zpro2p;
	float nzsumass2p, zsumass2p, nzsumpro2p, zsumpro2p;
	float ConfidencePart2p, ConfidenceAss2p, ConfidencePro2p;
	float[] part_multipnz2p= new float[rows+1];
	float[] part_multipz2p = new float[rows+1];
	float[] ass_multipnz2p = new float[rows+1];
	float[] ass_multipz2p = new float[rows+1];
	float[] pro_multipnz2p = new float[rows+1]; 
	float[] pro_multipz2p = new float[rows+1]; 
	float sumpartnz_multip2p, sumpartz_multip2p, sumassnz_multip2p, sumassz_multip2p, sumpronz_multip2p, sumproz_multip2p;

	/*//PTD
	float iptdsum, ipart3, iass3, ipro3;
	float nzpart3, nzass3, nzpro3, zpart3, zass3, zpro3;
	float nzsumass3, zsumass3, nzsumpro3, zsumpro3;
	float ConfidencePart3, ConfidenceAss3, ConfidencePro3;
	float[] part_multipnz3= new float[rows+1];
	float[] part_multipz3 = new float[rows+1];
	float[] ass_multipnz3 = new float[rows+1];
	float[] ass_multipz3 = new float[rows+1];
	float[] pro_multipnz3 = new float[rows+1]; 
	float[] pro_multipz3 = new float[rows+1]; 
	float sumpartnz_multip3, sumpartz_multip3, sumassnz_multip3, sumassz_multip3, sumpronz_multip3, sumproz_multip3;*/
	//PTD Cases
	float iptdsumc, ipart3c, iass3c, ipro3c;
	float nzpart3c, nzass3c, nzpro3c, zpart3c, zass3c, zpro3c;
	float nzsumass3c, zsumass3c, nzsumpro3c, zsumpro3c;
	float ConfidencePart3c, ConfidenceAss3c, ConfidencePro3c;
	float[] part_multipnz3c= new float[rows+1];
	float[] part_multipz3c = new float[rows+1];
	float[] ass_multipnz3c = new float[rows+1];
	float[] ass_multipz3c = new float[rows+1];
	float[] pro_multipnz3c = new float[rows+1]; 
	float[] pro_multipz3c = new float[rows+1]; 
	float sumpartnz_multip3c, sumpartz_multip3c, sumassnz_multip3c, sumassz_multip3c, sumpronz_multip3c, sumproz_multip3c;
	//PTD
	float iptdsump, ipart3p, iass3p, ipro3p;
	float nzpart3p, nzass3p, nzpro3p, zpart3p, zass3p, zpro3p;
	float nzsumass3p, zsumass3p, nzsumpro3p, zsumpro3p;
	float ConfidencePart3p, ConfidenceAss3p, ConfidencePro3p;
	float[] part_multipnz3p= new float[rows+1];
	float[] part_multipz3p = new float[rows+1];
	float[] ass_multipnz3p = new float[rows+1];
	float[] ass_multipz3p = new float[rows+1];
	float[] pro_multipnz3p = new float[rows+1]; 
	float[] pro_multipz3p = new float[rows+1]; 
	float sumpartnz_multip3p, sumpartz_multip3p, sumassnz_multip3p, sumassz_multip3p, sumpronz_multip3p, sumproz_multip3p;

	//Usage
	float iusasum, ipart4, iass4, ipro4;
	float nzpart4, nzass4, nzpro4, zpart4, zass4, zpro4;
	float nzsumass4, zsumass4, nzsumpro4, zsumpro4;
	float ConfidencePart4, ConfidenceAss4, ConfidencePro4;
	float[] part_multipnz4= new float[rows+1];
	float[] part_multipz4 = new float[rows+1];
	float[] ass_multipnz4 = new float[rows+1];
	float[] ass_multipz4 = new float[rows+1];
	float[] pro_multipnz4 = new float[rows+1]; 
	float[] pro_multipz4 = new float[rows+1]; 
	float sumpartnz_multip4, sumpartz_multip4, sumassnz_multip4, sumassz_multip4, sumpronz_multip4, sumproz_multip4;
	//Usage Cases
	float iusasumc, ipart4c, iass4c, ipro4c;
	float nzpart4c, nzass4c, nzpro4c, zpart4c, zass4c, zpro4c;
	float nzsumass4c, zsumass4c, nzsumpro4c, zsumpro4c;
	float ConfidencePart4c, ConfidenceAss4c, ConfidencePro4c;
	float[] part_multipnz4c= new float[rows+1];
	float[] part_multipz4c = new float[rows+1];
	float[] ass_multipnz4c = new float[rows+1];
	float[] ass_multipz4c = new float[rows+1];
	float[] pro_multipnz4c = new float[rows+1]; 
	float[] pro_multipz4c = new float[rows+1]; 
	float sumpartnz_multip4c, sumpartz_multip4c, sumassnz_multip4c, sumassz_multip4c, sumpronz_multip4c, sumproz_multip4c;
	//UsageParts
	float iusasump, ipart4p, iass4p, ipro4p;
	float nzpart4p, nzass4p, nzpro4p, zpart4p, zass4p, zpro4p;
	float nzsumass4p, zsumass4p, nzsumpro4p, zsumpro4p;
	float ConfidencePart4p, ConfidenceAss4p, ConfidencePro4p;
	float[] part_multipnz4p= new float[rows+1];
	float[] part_multipz4p = new float[rows+1];
	float[] ass_multipnz4p = new float[rows+1];
	float[] ass_multipz4p = new float[rows+1];
	float[] pro_multipnz4p = new float[rows+1]; 
	float[] pro_multipz4p = new float[rows+1]; 
	float sumpartnz_multip4p, sumpartz_multip4p, sumassnz_multip4p, sumassz_multip4p, sumpronz_multip4p, sumproz_multip4p;

	//AfterUsage
	float iafusum, ipart5, iass5, ipro5;
	float nzpart5, nzass5, nzpro5, zpart5, zass5, zpro5;
	float nzsumass5, zsumass5, nzsumpro5, zsumpro5;
	float ConfidencePart5, ConfidenceAss5, ConfidencePro5;
	float[] part_multipnz5= new float[rows+1];
	float[] part_multipz5 = new float[rows+1];
	float[] ass_multipnz5 = new float[rows+1];
	float[] ass_multipz5 = new float[rows+1];
	float[] pro_multipnz5 = new float[rows+1]; 
	float[] pro_multipz5 = new float[rows+1]; 
	float sumpartnz_multip5, sumpartz_multip5, sumassnz_multip5, sumassz_multip5, sumpronz_multip5, sumproz_multip5;
	//AfterUsage Cases
	float iafusumc, ipart5c, iass5c, ipro5c;
	float nzpart5c, nzass5c, nzpro5c, zpart5c, zass5c, zpro5c;
	float nzsumass5c, zsumass5c, nzsumpro5c, zsumpro5c;
	float ConfidencePart5c, ConfidenceAss5c, ConfidencePro5c;
	float[] part_multipnz5c= new float[rows+1];
	float[] part_multipz5c = new float[rows+1];
	float[] ass_multipnz5c = new float[rows+1];
	float[] ass_multipz5c = new float[rows+1];
	float[] pro_multipnz5c = new float[rows+1]; 
	float[] pro_multipz5c = new float[rows+1]; 
	float sumpartnz_multip5c, sumpartz_multip5c, sumassnz_multip5c, sumassz_multip5c, sumpronz_multip5c, sumproz_multip5c;
	//AfterUsage Part
	float iafusump, ipart5p, iass5p, ipro5p;
	float nzpart5p, nzass5p, nzpro5p, zpart5p, zass5p, zpro5p;
	float nzsumass5p, zsumass5p, nzsumpro5p, zsumpro5p;
	float ConfidencePart5p, ConfidenceAss5p, ConfidencePro5p;
	float[] part_multipnz5p= new float[rows+1];
	float[] part_multipz5p = new float[rows+1];
	float[] ass_multipnz5p = new float[rows+1];
	float[] ass_multipz5p = new float[rows+1];
	float[] pro_multipnz5p = new float[rows+1]; 
	float[] pro_multipz5p = new float[rows+1]; 
	float sumpartnz_multip5p, sumpartz_multip5p, sumassnz_multip5p, sumassz_multip5p, sumpronz_multip5p, sumproz_multip5p;

	//Overall
	float iovesum, ipart6, iass6, ipro6;
	float nzpart6, nzass6, nzpro6, zpart6, zass6, zpro6;
	float nzsumass6, zsumass6, nzsumpro6, zsumpro6;
	float ConfidencePart6, ConfidenceAss6, ConfidencePro6;
	float[] part_multipnz6= new float[rows+1];
	float[] part_multipz6 = new float[rows+1];
	float[] ass_multipnz6 = new float[rows+1];
	float[] ass_multipz6 = new float[rows+1];
	float[] pro_multipnz6 = new float[rows+1]; 
	float[] pro_multipz6 = new float[rows+1]; 
	float sumpartnz_multip6, sumpartz_multip6, sumassnz_multip6, sumassz_multip6, sumpronz_multip6, sumproz_multip6;
	//Overall Cases
	float iovesumc, ipart6c, iass6c, ipro6c;
	float nzpart6c, nzass6c, nzpro6c, zpart6c, zass6c, zpro6c;
	float nzsumass6c, zsumass6c, nzsumpro6c, zsumpro6c;
	float ConfidencePart6c, ConfidenceAss6c, ConfidencePro6c;
	float[] part_multipnz6c= new float[rows+1];
	float[] part_multipz6c = new float[rows+1];
	float[] ass_multipnz6c = new float[rows+1];
	float[] ass_multipz6c = new float[rows+1];
	float[] pro_multipnz6c = new float[rows+1]; 
	float[] pro_multipz6c = new float[rows+1]; 
	float sumpartnz_multip6c, sumpartz_multip6c, sumassnz_multip6c, sumassz_multip6c, sumpronz_multip6c, sumproz_multip6c;
	//Overall Part
	float iovesump, ipart6p, iass6p, ipro6p;
	float nzpart6p, nzass6p, nzpro6p, zpart6p, zass6p, zpro6p;
	float nzsumass6p, zsumass6p, nzsumpro6p, zsumpro6p;
	float ConfidencePart6p, ConfidenceAss6p, ConfidencePro6p;
	float[] part_multipnz6p= new float[rows+1];
	float[] part_multipz6p = new float[rows+1];
	float[] ass_multipnz6p = new float[rows+1];
	float[] ass_multipz6p = new float[rows+1];
	float[] pro_multipnz6p = new float[rows+1]; 
	float[] pro_multipz6p = new float[rows+1]; 
	float sumpartnz_multip6p, sumpartz_multip6p, sumassnz_multip6p, sumassz_multip6p, sumpronz_multip6p, sumproz_multip6p;
	Table table4;
	
	public void setup() {
		
	  zoom=(float) 3.25;
	 // size(1280, 644);
	  img = loadImage("Mapp.png");
	  symtruck=loadShape("symtruck.svg");
	  symman=loadShape("symman.svg");
	  symmach=loadShape("symgear.svg");
	  xo = width/2;
	  yo = height/2;
	  //bg = loadImage("Map.jpg"); 

	  Table table = loadTable("C:\\Users\\Nitesh\\Desktop\\boeing 747-8\\Input_original.csv", "header");

	  for (int i = 0; i < cols; i++) {
	    for (int j = 0; j < rows; j++) {
	      TableRow row = table.getRow(j);
	      if (i==0) {
	        loctime[0][j] = row.getFloat("Longitude_start");
	      } else if (i==1)
	      { 
	        loctime[1][j] = row.getFloat("Latitude_start");
	      } else if (i==2) {
	        loctime[2][j] = row.getFloat("Time_y_axis");
	      } else if (i==3) {
	        loctime[3][j] = row.getFloat("Time_duration");
	      } else if (i==4) {
	        loctime[4][j] = row.getFloat("GI");
	      } else if (i==5) {
	        loctime[5][j] = row.getFloat("GO");
	      } else if (i==6) {
	        loctime[6][j] = row.getFloat("LI");
	      } else if (i==7) {
	        loctime[7][j] = row.getFloat("LO");
	      } else if (i==8) {
	        loctime[8][j] = row.getFloat("Process ID");
	      } else if (i==9) {
	        loctime[9][j] = row.getFloat("GI_rec");
	      } else if (i==10) {
	        loctime[10][j] = row.getFloat("GI_imp");
	      } else if (i==11) {
	        loctime[11][j] = row.getFloat("LI_rec");
	      } else if (i==12) {
	        loctime[12][j] = row.getFloat("LI_imp");
	      } else if (i==13) {
	        loctime[13][j] = row.getFloat("GO_emi");
	      } else if (i==14) {
	        loctime[14][j] = row.getFloat("GO_imp");
	      } else if (i==15) {
	        loctime[15][j] = row.getFloat("LO_emi");
	      } else if (i==16) {
	        loctime[16][j] = row.getFloat("LO_imp");
	      } else if (i==17) {
	        loctime[17][j] =  (row.getFloat("Impact"));
	      } else if (i==18) {
	        loctime[18][j] = row.getFloat("GintoGo?");
	      } else if (i==19) {
	        loctime[19][j] = row.getFloat("Man");
	      } else if (i==20) {
	        loctime[20][j] = row.getFloat("Gear");
	      } else if (i==21) {
	        loctime[21][j] = row.getFloat("LCPhase");
	      } else if (i==22) {
	        loctime[22][j] = row.getFloat("Conf");
	      } else if (i==23) {
	        loctime[23][j] = row.getFloat("Class");
	      } else if (i==24) {
	        loctime[24][j] = row.getFloat("IDP");
	      } else if (i==25) {
	        loctime[25][j] = row.getFloat("IDS");
	      } else if (i==26) {
	        loctime[26][j] = row.getFloat("Product_Id");
	      } else if (i==27) {
	        loctime[27][j] = row.getFloat("VariableClass");
	      }
	    }
	  }

	  Table table1 = loadTable("M:\\templates\\new1.csv", "header");
	  for (int i = 0; i < cols1; i++) {
	    for (int j = 0; j < rows1; j++) {
	      TableRow row1 = table1.getRow(j);
	      if (i==0) {
	        //String[] Partname = table1.getStringColumn("Part_assem_name");
	        Partname[0][j] = row1.getString("Part_assem_name");
	        pp[0][j] = row1.getFloat("Part_assem_name");
	      } else if (i==1)
	      { 
	        pp[1][j] = row1.getFloat("StatusPP");
	      } else if (i==2) {
	        pp[2][j] = row1.getFloat("UID");
	      } else if (i==3) {
	        pp[3][j] = row1.getFloat("Impact");
	      } else if (i==4) {
	        pp[4][j] = row1.getFloat("SA");
	      } else if (i==5) {
	        pp[5][j] = row1.getFloat("Part");
	      } 
	      else if (i==6) {
		        pp[6][j] = row1.getFloat("Pr3Sa2Pa1");
		      } 
	      else if (i==7) {
		        pp[6][j] = row1.getFloat("Confidence");
		      } 
	    }
	  }
	  
	    	 
	     
	  // K1; SORTING & ASSIGNING FROM ZERO; in xloctime[] yloctime[]
	  float assign = 20;
	  for (int k1=0; k1<rows; k1++) {
	    xloctime[0][k1]=assign;
	    yloctime[0][k1]=loctime[2][k1];
	    xxloctime[k1]=assign;
	    if (loctime[0][k1]-loctime[0][k1+1]==0) {
	      assign = assign;
	    } else {
	      assign = assign+20;
	    }
	  }

	  // K2; INDEXING ARRAY IS TO BE DONE BASED ON LONGITUDE
	  for (int k2=0; k2<rows; k2++) {
	    if (loctime[0][k2]-loctime[0][k2+1]==0)
	    {
	      xloctime[0][k2+1]=xloctime[0][k2];
	      yloctime[0][k2+1]=loctime[2][k2+1];
	      xxloctime[k2+1]=xxloctime[k2];
	    }
	  }
	 
	  for ( int i = 1 ; i < rows1+1; i++)
	  {
		cell[0][i]= i;
	  System.out.println(cell[0][i]);
	  }
	  /*cell [1][al] = cal_imp(al);
	  System.out.println(cell[1][al] + al);*/
	  for ( int i = 1 ; i< rows1+1; i++)
	  {
		cell[1][i]= cal_imp(i);
	  System.out.println(cell[1][i]);
	  }
	  
	  for ( int i = 1 ; i< rows1+1; i++)
	  {
		cell[2][i]= cal_conf(i);
	//  System.out.println(cell[2][i]);
	  }
	  
	  for (int k=1; k<rows1+1; k++)
	  { 
		  
	    newcell[0][k]=cell[0][k]; //  longitude (input) =longC 
	    newcell[1][k]=cell[1][k];
	    newcell[2][k]=cell[2][k];
	    
	  }
	  
	  table4 = new Table();
	  table4.addColumn("ID");
	  table4.addColumn("Impact");
	  table4.addColumn("Confidence");
	  for (int m=1; m<rows1+1; m++)
	  {
	    TableRow newRow = table4.addRow();
	    newRow.setFloat("ID", newcell[0][m]);
	    newRow.setFloat("Impact", newcell[1][m]);
	    newRow.setFloat("Confidence", newcell[2][m]);
	  }
	  
	  
	  saveTable(table4, "M:\\templates\\product_impact.csv");
	    
	}
	
	void tree_draw(float pp2)
	{
		int r = 50;
		int s = 20;
		int y = 40;
		//int lsum = 0;
		int counter =0;
		//int rown = rows +1;
	
		for (int i = 0; i < rows1; i++){ 
			  //ellipse(s , y , r, r);
				System.out.println(rows);
				//System.out.println(rown);
			 fill(0);
			 strokeWeight(2);
			// lsum = rows*3;
		if(pp[1][i] == pp2)
		  {
			 int loc = (int) (pp2 * 50);
			 counter = counter++;
			 //ellipse(s-50 , y-100 , r, r);
			/* lsum = lsum +100;
			   line(s-50 , lsum , s-50 , lsum + 1000);
			 line(s-50,y, s-50,y+50);*/
			 System.out.println(i);
			 if ((pp[3][i])>=0.3){
				
				   fill(239,62,52);
				   ellipse(s+loc , y, r, r);
				 /*  line(s-50, y , s , y);
				   */
				  /*lsum = lsum +100;
				   line(s-50 , lsum , s-50 , lsum + 1000);*/}
				 else if  (((pp[3][i])>=0.1) && (pp[3][i])<0.3){
				   fill(241,89,40);
				  ellipse(s-50 , y-27 , r, r);}
				  else if  (((pp[3][i])>=0.06) && (pp[3][i])<0.1){
				   fill(241,89,40);
				   ellipse(s-50 , y-27 , r, r);}
				 else if (((pp[3][i])>=0.02) && (pp[3][i])<0.03){
				   fill(251,175,63);
				   ellipse(s-50 , y, r, r);}
				    else if (((pp[3][i])>=0.01) && (pp[3][i])<0.02){
				   fill(247,236,46);
				   ellipse(s-50 , y , r, r);}
				    else if (((pp[3][i])>=0.0004) && (pp[3][i])<0.01){
				   fill(214,223,34);
				   ellipse(s-50 , y , r, r);}
				    else if (((pp[3][i])>=0.0003) && (pp[3][i])<0.0004){
				   fill(140,198,62);
				   ellipse(s-50 , y , r, r);}
				    else if (((pp[3][i])>=0.0002) && (pp[3][i])<0.0003){
				   fill(36,181,114);
				   ellipse(s-50 , y , r, r);}
				    else if ((pp[3][i])<=0.0002){ 
				   fill(0,173,239);
				   ellipse(s-50 , y-25 , r, r);
				   }
			 // ellipse(s-50 , y , r, r);
			 fill(0);
		  text(Partname[0][i], s+25,y-10);
		  text("Impact = " + pp[3][i], s+100 , y-15  );
		  text("Confidence = " + pp[4][i] + "%", s+100 , y+5  ); 
		  y=y+70;
		}
		}
	}
	void ellip(){
		int r = 50;
		int s = 20;
		int y =40;
		int lsum = 0;
		int counter =0;
		int rown = rows +1;
		for (int i = 0; i < columns; i++){ 
		  //ellipse(s , y , r, r);
			System.out.println(rows);
			System.out.println(rown);
		 fill(0);
		 strokeWeight(2);
		 lsum = rows*3;
		 // line(s-50 ,y,s-50 ,lsum  );
		  
		 if(pp[1][i] == 0)
		  {
			 counter = counter++;
			 //ellipse(s-50 , y-100 , r, r);
			/* lsum = lsum +100;
			   line(s-50 , lsum , s-50 , lsum + 1000);
			 line(s-50,y, s-50,y+50);*/
			 System.out.println(i);
			 if ((pp[3][i])>=0.3){
				
				   fill(239,62,52);
				   ellipse(s-50 , y-27, r, r);
				 /*  line(s-50, y , s , y);
				   */
				  /*lsum = lsum +100;
				   line(s-50 , lsum , s-50 , lsum + 1000);*/}
				 else if  (((pp[3][i])>=0.1) && (pp[3][i])<0.3){
				   fill(241,89,40);
				  ellipse(s-50 , y-27 , r, r);}
				  else if  (((pp[3][i])>=0.06) && (pp[3][i])<0.1){
				   fill(241,89,40);
				   ellipse(s-50 , y-27 , r, r);}
				 else if (((pp[3][i])>=0.02) && (pp[3][i])<0.03){
				   fill(251,175,63);
				   ellipse(s-50 , y, r, r);}
				    else if (((pp[3][i])>=0.01) && (pp[3][i])<0.02){
				   fill(247,236,46);
				   ellipse(s-50 , y , r, r);}
				    else if (((pp[3][i])>=0.0004) && (pp[3][i])<0.01){
				   fill(214,223,34);
				   ellipse(s-50 , y , r, r);}
				    else if (((pp[3][i])>=0.0003) && (pp[3][i])<0.0004){
				   fill(140,198,62);
				   ellipse(s-50 , y , r, r);}
				    else if (((pp[3][i])>=0.0002) && (pp[3][i])<0.0003){
				   fill(36,181,114);
				   ellipse(s-50 , y , r, r);}
				    else if ((pp[3][i])<=0.0002){ 
				   fill(0,173,239);
				   ellipse(s-50 , y-25 , r, r);
				   }
			 // ellipse(s-50 , y , r, r);
			 fill(0);
		  text(Partname[0][i], s+25,y-10);
		  text("Impact = " + pp[3][i], s+100 , y-15  );
		  text("Confidence = " + pp[4][i] + "%", s+100 , y+5  ); 
		  y=y+70;
		}if(pp[1][i] == 1)
		  {
			  counter = counter ++;
			  if ((pp[3][i])>=0.3){
				   fill(239,62,52);
				   line(s-50, y , s-10 , y);
				   line(s-50,y , s-50, y - 67);
				   ellipse(s+15, y , r, r);}
				 else if  (((pp[3][i])>=0.1) && (pp[3][i])<0.3){
				   fill(241,89,40);
				  line(s-50, y , s-10 , y);
				   line(s-50,y , s-50, y - 67);
				   ellipse(s+15, y , r, r);}
				  else if  (((pp[3][i])>=0.06) && (pp[3][i])<0.1){
				   fill(241,89,40);
				   line(s-50, y , s-10 , y);
				   line(s-50,y , s-50, y - 67); ellipse(s+15, y , r, r);}
				 else if (((pp[3][i])>=0.02) && (pp[3][i])<0.03){
				   fill(251,175,63);
				   line(s-50, y , s-10 , y);
				   line(s-50,y , s-50, y - 67);
				   ellipse(s+15, y , r, r);}
				    else if (((pp[3][i])>=0.01) && (pp[3][i])<0.02){
				   fill(247,236,46);
				   line(s-50, y , s-10 , y);
				   line(s-50,y , s-50, y - 67);
				   ellipse(s+15, y , r, r);}
				    else if (((pp[3][i])>=0.0004) && (pp[3][i])<0.01){
				   fill(214,223,34);
				  line(s-50, y , s-10 , y);
				   line(s-50,y , s-50, y - 67);
				   ellipse(s+15, y , r, r);}
				    else if (((pp[3][i])>=0.0003) && (pp[3][i])<0.0004){
				   fill(140,198,62);
				   line(s-50, y , s-10 , y);
				   line(s-50,y , s-50, y - 67);
				   ellipse(s+15, y , r, r);}
				    else if (((pp[3][i])>=0.0002) && (pp[3][i])<0.0003){
				   fill(36,181,114);
				   line(s-50, y , s-10 , y);
				   line(s-50,y , s-50, y - 67);
				   ellipse(s+15, y , r, r);}
				    else if ((pp[3][i])<=0.0002){ 
				   fill(0,173,239);
				   line(s-50, y , s-10 , y);
				   line(s-50,y , s-50, y - 67);
				   ellipse(s+15, y , r, r);}
			 // ellipse(s+15 , y , r, r);
			 fill(0);
		  text(Partname[0][i], s+55,y);
		  text("Impact = " + pp[3][i], s+175 , y-5);
		  text("Confidence = " + pp[4][i] + "%",  s+175 , y+15  ); 
		  y=y+70;
		}
		 
		  if (pp[1][i] == 2)
		  {
			  counter = counter ++;
			  if ((pp[3][i])>=0.3){
				   fill(239,62,52);
				   line(s+15, y , s+60 , y);
				   line(s+15, y, s+15 ,y-67);
				   	ellipse(s+85, y , r, r);}
				 else if  (((pp[3][i])>=0.1) && (pp[3][i])<0.3){
				   fill(241,89,40);
				   line(s+15, y , s+60 , y);
				   line(s+15, y, s+15 ,y-67);
				   ellipse(s+85 , y , r, r);}
				  else if  (((pp[3][i])>=0.06) && (pp[3][i])<0.1){
				   fill(241,89,40);
				   line(s+15, y , s+60 , y);
				   line(s+15, y, s+15 ,y-67);
				   ellipse(s+85 , y , r, r);}
				 else if (((pp[3][i])>=0.02) && (pp[3][i])<0.03){
				   fill(251,175,63);
				   line(s+15, y , s+60 , y);
				   line(s+15, y, s+15 ,y-67);
				   ellipse(s+85 , y , r, r);}
				    else if (((pp[3][i])>=0.01) && (pp[3][i])<0.02){
				   fill(247,236,46);
				   line(s+15, y , s+60 , y);
				   line(s+15, y, s+15 ,y-67);
				   ellipse(s+85 , y , r, r);}
				    else if (((pp[3][i])>=0.0004) && (pp[3][i])<0.01){
				   fill(214,223,34);
				   line(s+15, y , s+60 , y);
				   line(s+15, y, s+15 ,y-67);
				   ellipse(s+85 , y , r, r);}
				    else if (((pp[3][i])>=0.0003) && (pp[3][i])<0.0004){
				   fill(140,198,62);
				   line(s+15, y , s+60 , y);
				   line(s+15, y, s+15 ,y-67);
				   ellipse(s+85 , y , r, r);}
				    else if (((pp[3][i])>=0.0002) && (pp[3][i])<0.0003){
				   fill(36,181,114);
				   line(s+15, y , s+60 , y);
				   line(s+15, y, s+15 ,y-67);
				   ellipse(s+85 , y , r, r);}
				    else if ((pp[3][i])<=0.0002){ 
				   fill(0,173,239);
				   //spotLight(255, 0, 0,100,100,400, 0, 0, -1, PI/4, 2);}
				  line(s+15, y , s+60 , y);
				   line(s+15, y, s+15 ,y-67);
				   ellipse(s+85 , y , r, r);}
			  //ellipse(s+85,y,r,r);
			fill(0);
			  text(Partname[0][i], s+122,y);
			  text("Impact = " + pp[3][i], s+300 , y-10 );
			   text("Confidence = " + pp[4][i] + "%",  s+175 , y+15  ); 
			  y=y+70;
		  }
		   if(pp[1][i] == 3)
		  {
			  counter = counter ++;
			  if ((pp[3][i])>=0.3){
				   fill(239,62,52);
				   spotLight(255, 0, 0, width/2, height/2, 400, 0, 0, -1, PI/4, 2);
				   
				   line(s+85, y , s+45 , y);
				   line(s+85,y , s+85, y - 67);
				   ellipse(s+225, y , r, r);}
				 else if  (((pp[3][i])>=0.1) && (pp[3][i])<0.3){
				   fill(241,89,40);
				   spotLight(255, 0, 0, width/2, height/2, 400, 0, 0, -1, PI/4, 2);
				  
				   line(s+85, y , s+45 , y);
				   line(s+85,y , s+85, y - 67);
				   ellipse(s+225 , y , r, r);}
				  else if  (((pp[3][i])>=0.06) && (pp[3][i])<0.1){
				   fill(241,89,40);
				   spotLight(255, 0, 0, width/2, height/2, 400, 0, 0, -1, PI/4, 2);
				   ellipse(s+225 , y , r, r);
				   line(s+85, y , s+45 , y);
				   line(s+85,y , s+85, y - 67);
				   ellipse(s+225 , y , r, r);}
				 else if (((pp[3][i])>=0.02) && (pp[3][i])<0.03){
				   fill(251,175,63);
				   spotLight(255, 0, 0, width/2, height/2, 400, 0, 0, -1, PI/4, 2);
				   ellipse(s+225 , y , r, r);
				   line(s+85, y , s+45 , y);
				   line(s-50,y , s+85, y - 67);
				   line(s+85,y , s+85, y - 67);}
				    else if (((pp[3][i])>=0.01) && (pp[3][i])<0.02){
				   fill(247,236,46);
				   spotLight(255, 0, 0, width/2, height/2, 400, 0, 0, -1, PI/4, 2);
				   ellipse(s+225 , y , r, r);
				   line(s+85, y , s+200 , y);
				   line(s+85,y , s+85, y - 67);}
				    else if (((pp[3][i])>=0.0004) && (pp[3][i])<0.01){
				   fill(214,223,34);
				   spotLight(255, 0, 0, width/2, height/2, 400, 0, 0, -1, PI/4, 2);
				   ellipse(s+225 , y , r, r);
				   line(s+85, y , s+200 , y);
				   line(s+85,y , s+85, y - 67);}
				    else if (((pp[3][i])>=0.0003) && (pp[3][i])<0.0004){
				   fill(140,198,62);
				   spotLight(255, 0, 0, width/2, height/2, 400, 0, 0, -1, PI/4, 2);
				   ellipse(s+225, y , r, r);
				   line(s+85, y , s+200 , y);
				   line(s+85,y , s+85, y - 67);}
				    else if (((pp[3][i])>=0.0002) && (pp[3][i])<0.0003){
				   fill(36,181,114);
				   spotLight(255, 0, 0, width/2, height/2, 400, 0, 0, -1, PI/4, 2);
				   ellipse(s+225 , y , r, r);}
				    else if ((pp[3][i])<=0.0002){ 
				   fill(0,173,239);
				   spotLight(255, 0, 0, width/2, height/2, 400, 0, 0, -1, PI/4, 2);
				   ellipse(s+225 , y , r, r);}
			  //ellipse(s+225 , y , r, r);
			  fill(0);
			  text(Partname[0][i], s+262,y);
			  text("Impact = " + pp[3][i], s+350 , y-10 );
			   text("Confidence = " + pp[4][i] + "%",  s+350 , y+15  ); 
			  y=y+70;  
		  }
		  if(pp[1][i] == 4)
		  {
			  counter = counter ++;
			  if ((pp[3][i])>=0.3){
				   fill(239,62,52);
				   ellipse(s+365, y , r, r);}
				 else if  (((pp[3][i])>=0.1) && (pp[3][i])<0.3){
				   fill(241,89,40);
				   ellipse(s+225 , y , r, r);}
				  else if  (((pp[3][i])>=0.06) && (pp[3][i])<0.1){
				   fill(241,89,40);
				   ellipse(s+365 , y , r, r);}
				 else if (((pp[3][i])>=0.02) && (pp[3][i])<0.03){
				   fill(251,175,63);
				   ellipse(s+365 , y , r, r);}
				    else if (((pp[3][i])>=0.01) && (pp[3][i])<0.02){
				   fill(247,236,46);
				   ellipse(s+365 , y , r, r);}
				    else if (((pp[3][i])>=0.0004) && (pp[3][i])<0.01){
				   fill(214,223,34);
				   ellipse(s+365 , y , r, r);}
				    else if (((pp[3][i])>=0.0003) && (pp[3][i])<0.0004){
				   fill(140,198,62);
				   ellipse(s+365, y , r, r);}
				    else if (((pp[3][i])>=0.0002) && (pp[3][i])<0.0003){
				   fill(36,181,114);
				   ellipse(s+365 , y , r, r);}
				    else if ((pp[3][i])<=0.0002){ 
				   fill(0,173,239);
				   ellipse(s+365 , y , r, r);}
			  //ellipse(s+225 , y , r, r);
			  fill(0);
			  text(Partname[0][i], s+407,y);
			  text("Impact = " + pp[3][i], s+600 , y-10 );
			   text("Confidence = " + pp[4][i] + "%",  s+500 , y+15  ); 
			  y=y+70;  
		  }
		  if(pp[1][i] == 5)
		  {
			  counter = counter ++;
			  if ((pp[3][i])>=0.3){
				   fill(239,62,52);
				   ellipse(s+505, y , r, r);}
				 else if  (((pp[3][i])>=0.1) && (pp[3][i])<0.3){
				   fill(241,89,40);
				   ellipse(s+505 , y , r, r);}
				  else if  (((pp[3][i])>=0.06) && (pp[3][i])<0.1){
				   fill(241,89,40);
				   ellipse(s+505 , y , r, r);}
				 else if (((pp[3][i])>=0.02) && (pp[3][i])<0.03){
				   fill(251,175,63);
				   ellipse(s+505 , y , r, r);}
				    else if (((pp[3][i])>=0.01) && (pp[3][i])<0.02){
				   fill(247,236,46);
				   ellipse(s+505 , y , r, r);}
				    else if (((pp[3][i])>=0.0004) && (pp[3][i])<0.01){
				   fill(214,223,34);
				   ellipse(s+505 , y , r, r);}
				    else if (((pp[3][i])>=0.0003) && (pp[3][i])<0.0004){
				   fill(140,198,62);
				   ellipse(s+505, y , r, r);}
				    else if (((pp[3][i])>=0.0002) && (pp[3][i])<0.0003){
				   fill(36,181,114);
				   ellipse(s+505 , y , r, r);}
				    else if ((pp[3][i])<=0.0002){ 
				   fill(0,173,239);
				   ellipse(s+505 , y , r, r);}
			  //ellipse(s+225 , y , r, r);
			  fill(0);
			  text(Partname[0][i], s+407,y);
			  y=y+70;  
		  }
		}
	}
	private float cal_conf(int part) {
		  for (int i=0; i<rows+1; i++)  
		  {
			  if ( loctime[26][i] == part)
			  {
				 // System.out.println(i);
			  if (loctime[17][i] == 0)
			  {
				  ze++;
				  pro_multiz= pro_multiz + loctime[22][i];
				    }
			  else {
				 nze++; 
				 multiply = loctime[17][i]*loctime[22][i];
				 pro_multinz = pro_multinz + multiply;
			  }
			  tot_imp = tot_imp + loctime[17][i];
			  tot_pro = nze + ze;
			 // System.out.println("______________________________");
			// System.out.println(loctime[22][i]);	
			 /* System.out.println("______________________________");
			System.out.println( pro_multinz[i] +  "   " +  i);*/
			
			  }
			  }
			  
		System.out.println("______________________________");
		System.out.println( pro_multiz +  "  total confidence" );	
		System.out.println( pro_multinz +  " summation of vi * ci" );
		System.out.println( tot_imp +  "  total imp" );	
		System.out.println( tot_pro +  "  total pro" );	
		val_conf= ((nze /tot_pro ) * ( pro_multinz / tot_imp )) + ((ze /tot_pro) * (pro_multiz/ ze));
		
		  System.out.println(nze);
		System.out.println(ze);
		System.out.println(val_conf);
		if (Float.isNaN(val_conf)) {
			val_conf =0;
		}
		return val_conf;
	}

	


public float cal_imp(float pp2)
{
	p_sum_imp = 0;
	for (int k =0 ; k<rows ; k++)
	{
		
		if (loctime[26][k] == pp2)
		{
			if(loctime[23][k] == 2)
			{
			p_sum_imp = p_sum_imp + loctime[17][k];	
			}
		}
	}
	
	
	//System.out.println(p_sum_imp);
	return(p_sum_imp);
			
}

	

	/*public void draw()
	{
		background(255);
		 scale (zoom);
		  strokeWeight((float) 0.1);
			translate(panx,pany);
		 strokeWeight(1);
		  stroke(0);
		  strokeWeight(1);
		 
		  textSize(15);
		  
//textMode(SHAPE);

	fill(0);
	 // text(Partname[0][1], 20,20);
	// GRIDS
		  stroke(0);
		//  strokeWeight((float) 0.1);
		  //line(0, 0, 1000, 0);  //X axis
		//  line(0, 0, 0, 1000);  //Y axis
		  stroke(205);
		
		  for (int gv=0; gv<3000; gv=gv+70) {
		    line(-65, gv, 3000, gv);                //Grid
		  }
		  for (int gh=-65; gh<3000; gh=gh+70) {
		    line(gh, 0, gh, 3000);                //Grid
		  }
		  
		  stroke(0);
		  //strokeWeight((float) 0.1);
		//  line(-50, 0, 1000, 0);  //X axis
		 // line(-50, 0, -50, 1000);  //Y axis
		 // stroke(205);
		  strokeWeight((float) 0.1);
			//ellip();
		  for ( int k =1; k <rows1 ; k++)
		  {
		  tree_draw(pp[1][k]);
		  }
	
	}*/

	public void mousePressed() {
	  if ((mouseX-panx)/zoom > 5 && (mouseX-panx)/zoom < 10 && (mouseY-pany)/zoom > 120 && (mouseY-pany)/zoom < 125 ) {
	    value=20;
	  } else if ((mouseX-panx)/zoom > 5 && (mouseX-panx)/zoom < 10 && (mouseY-pany)/zoom > 125 && (mouseY-pany)/zoom < 130 ) {
	    value=40;
	  } else if ((mouseX-panx)/zoom > 5 && (mouseX-panx)/zoom < 10 && (mouseY-pany)/zoom > 130 && (mouseY-pany)/zoom < 135 ) {
	    value=60;
	  } else if ((mouseX-panx)/zoom > 5 && (mouseX-panx)/zoom < 10 && (mouseY-pany)/zoom > 135 && (mouseY-pany)/zoom < 140 ) {
	    value=80;
	  } else if ((mouseX-panx)/zoom > 5 && (mouseX-panx)/zoom < 10 && (mouseY-pany)/zoom > 140 && (mouseY-pany)/zoom < 145 ) {
	    value=100;
	  } else if ((mouseX-panx)/zoom > 5 && (mouseX-panx)/zoom < 10 && (mouseY-pany)/zoom > 145 && (mouseY-pany)/zoom < 150 ) {
	    value=120;
	  } else if ((mouseX-panx)/zoom > 5 && (mouseX-panx)/zoom < 10 && (mouseY-pany)/zoom > 150 && (mouseY-pany)/zoom < 155 ) {
	    value=140;
	  } else if ((mouseX-panx)/zoom > 5 && (mouseX-panx)/zoom < 10 && (mouseY-pany)/zoom > 155 && (mouseY-pany)/zoom < 160 ) {
	    value=160;
	  } else if ((mouseX-panx)/zoom > 5 && (mouseX-panx)/zoom < 10 && (mouseY-pany)/zoom > 160 && (mouseY-pany)/zoom < 165 ) {
	    value=180;
	  } else if ((mouseX-panx)/zoom > 5 && (mouseX-panx)/zoom < 10 && (mouseY-pany)/zoom > 165 && (mouseY-pany)/zoom < 170 ) {
	    value=200;
	  } else if ((mouseX-panx)/zoom > 5 && (mouseX-panx)/zoom < 10 && (mouseY-pany)/zoom > 170 && (mouseY-pany)/zoom < 175 ) {
	    value=220;
	  } else if ((mouseX-panx)/zoom > 5 && (mouseX-panx)/zoom < 10 && (mouseY-pany)/zoom > 175 && (mouseY-pany)/zoom < 180 ) {
	    value=240;
	  } else if ((mouseX-panx)/zoom > 5 && (mouseX-panx)/zoom < 10 && (mouseY-pany)/zoom > 180 && (mouseY-pany)/zoom < 185 ) {
	    value=260;
	  } else if ((mouseX-panx)/zoom > 5 && (mouseX-panx)/zoom < 10 && (mouseY-pany)/zoom > 185 && (mouseY-pany)/zoom < 190 ) {
	    value=280;
	  } else if ((mouseX-panx)/zoom > 5 && (mouseX-panx)/zoom < 10 && (mouseY-pany)/zoom > 190 && (mouseY-pany)/zoom < 200 ) {
	    value=300;
	  }

	  if ((mouseX-panx)/zoom > 0 && (mouseX-panx)/zoom < 5 && (mouseY-pany)/zoom > 120 && (mouseY-pany)/zoom < 125 ) {
	    UID=0;
	  } else if ((mouseX-panx)/zoom > -15 && (mouseX-panx)/zoom < 0 && (mouseY-pany)/zoom > 125 && (mouseY-pany)/zoom < 130 ) {
	    UID=1;
	  } else if ((mouseX-panx)/zoom > -15 && (mouseX-panx)/zoom < 0 && (mouseY-pany)/zoom > 130 && (mouseY-pany)/zoom < 135 ) {
	   UID=2;
	  } else if ((mouseX-panx)/zoom > -15 && (mouseX-panx)/zoom < 0 && (mouseY-pany)/zoom > 135 && (mouseY-pany)/zoom < 140 ) {
	    UID=3;
	  } else if ((mouseX-panx)/zoom > -15 && (mouseX-panx)/zoom < 0 && (mouseY-pany)/zoom > 140 && (mouseY-pany)/zoom < 145 ) {
	    UID=4;
	  } else if ((mouseX-panx)/zoom > -15 && (mouseX-panx)/zoom < 0 && (mouseY-pany)/zoom > 145 && (mouseY-pany)/zoom < 150 ) {
	    UID=5;
	  } else if ((mouseX-panx)/zoom > -15 && (mouseX-panx)/zoom < 0 && (mouseY-pany)/zoom > 150 && (mouseY-pany)/zoom < 155 ) {
	    UID=6;
	  } else if ((mouseX-panx)/zoom > -15 && (mouseX-panx)/zoom < 0 && (mouseY-pany)/zoom > 155 && (mouseY-pany)/zoom < 160 ) {
	    UID=7;
	  } else if ((mouseX-panx)/zoom > -15 && (mouseX-panx)/zoom < 0 && (mouseY-pany)/zoom > 160 && (mouseY-pany)/zoom < 165 ) {
	    UID=8;
	  } else if ((mouseX-panx)/zoom > -15 && (mouseX-panx)/zoom < 0 && (mouseY-pany)/zoom > 165 && (mouseY-pany)/zoom < 170 ) {
	    UID=9;
	  } else if ((mouseX-panx)/zoom > -15 && (mouseX-panx)/zoom < 0 && (mouseY-pany)/zoom > 170 && (mouseY-pany)/zoom < 175 ) {
	    UID=10;
	  } else if ((mouseX-panx)/zoom > -15 && (mouseX-panx)/zoom < 0 && (mouseY-pany)/zoom > 175 && (mouseY-pany)/zoom < 180 ) {
	    UID=11;
	  } else if ((mouseX-panx)/zoom > -15 && (mouseX-panx)/zoom < 0 && (mouseY-pany)/zoom > 180 && (mouseY-pany)/zoom < 185 ) {
	    UID=12;
	  } else if ((mouseX-panx)/zoom > -15 && (mouseX-panx)/zoom < 0 && (mouseY-pany)/zoom > 185 && (mouseY-pany)/zoom < 190 ) {
	    UID=13;
	  } else if ((mouseX-panx)/zoom > -15 && (mouseX-panx)/zoom < 0 && (mouseY-pany)/zoom > 190 && (mouseY-pany)/zoom < 200 ) {
	    UID=14;
	  }
	}

	public void keyPressed() {
	  if (key == CODED) {
	    if (keyCode == UP) {
	      pany = pany+10;
	    } else if (keyCode == DOWN) {
	      pany = pany-10;
	    } else if (keyCode == LEFT) {
	      panx = panx+10;
	    } else if (keyCode == RIGHT) {
	      panx = panx-10;
	    } else if (keyCode == CONTROL) {
	      zoom += .1;
	    } else if (keyCode == SHIFT) {
	      zoom -= .1;
	    } else if (keyCode == ALT) {
	      angle += .05;
	    } else if (keyCode == TAB) {
	      angle -= .05;
	    }
	  }
	  if (key == 32)
	  {
	    angle = 0; 
	    zoom = 1; 
	    xo = width/2; 
	    yo = height/2;
	  }
	}


}
