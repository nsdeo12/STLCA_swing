package lca;
	import processing.core.*;
	import processing.data.Table;
	import processing.data.TableRow;
	public class Proc extends PApplet{
	PApplet parent;

	public Proc(PApplet _parent){
		parent = _parent;
	}

	public Proc(){}

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
		public float zoom = 1;
		float angle = 0;
		float imp1, imp2, imp3, imp4, imp5, imp6, imptotal; 


		int cols = 28;
		int cols1 =104;

		int rows = 55; // Row no 2 to Row no Last... n-1 rows from excel
		//int rowc()
		//{
		//Table table11 = loadTable("Input.csv", "header");
		//int rowc = table11.getRowCount();
		//return rowc;
		//}
		//int rows = rowc();
		int rows1=14;

		float locationassign=1;
		float sameloc=1;

		String[][]Partname = new String[cols1+1][rows1+1];
		//General
		float a, b, c, d;
		int rl10, gl10, bl10, rl12, gl12, bl12, rl14, gl14, bl14, rl16, gl16, bl16, rl17, gl17, bl17;
		String pr, su;
		float[][] loctime = new float[cols+1][rows+1];
		float[][] pp = new float[cols1+1][rows1];
		float[][] xloctime = new float[cols+1][rows+1];
		float[][] yloctime = new float[cols+1][rows+1];
		float[][] zloctime = new float[cols+1][rows+1];
		float[][] latloctime = new float[cols+1][rows+1];
		float[][] lonloctime = new float[cols+1][rows+1];
		float[]xxloctime = new float[rows];
		//Suffix gives phase information. For eg nzpart1 means nzpart of material phase

		//Material
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
		float sumpartnz_multip1, sumpartz_multip1, sumassnz_multip1, sumassz_multip1, sumpronz_multip1, sumproz_multip1;
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

		//Manufacturing
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
		float sumpartnz_multip2, sumpartz_multip2, sumassnz_multip2, sumassz_multip2, sumpronz_multip2, sumproz_multip2;
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

		//PTD
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
		float sumpartnz_multip3, sumpartz_multip3, sumassnz_multip3, sumassz_multip3, sumpronz_multip3, sumproz_multip3;
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
	public static void main(String _args[]){
		PApplet.main(new String[]{ "lca.Proc"});
	}
		 public void setup() {
		 zoom=(float) 3.25;
		  size(1280, 644);
		  //img = loadImage("Mapp.png");
		  //symtruck=loadShape("symtruck.svg");
		 // symtruck.disableStyle();
		 // symman=loadShape("symman.svg");
		  //symman.disableStyle();
		  //symmach=loadShape("symgear.svg");
		 // symmach.disableStyle();
		  xo = width/2;
		  yo = height/2;
		  //bg = loadImage("Map.jpg"); 

		 Table table = loadTable("M:\\templates\\Input.csv", "header");

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
		        loctime[17][j] = (float) (1000.0*row.getFloat("Impact"));
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
		        loctime[24][j] = row.getFloat("ImpactH");
		      } else if (i==25) {
		        loctime[25][j] = row.getFloat("ConfH");
		      } else if (i==26) {
		        loctime[26][j] = row.getFloat("AssignedtocomponentUID");
		      } else if (i==27) {
		        loctime[27][j] = row.getFloat("VariableClass");
		      }
		    }
		  }

		  Table table1 = loadTable("C:\\Users\\Nitesh\\Desktop\\Priyal Files\\Code\\proimpact1\\Partprocess.csv", "header");
		  for (int i = 0; i < cols1; i++) {
		    for (int j = 0; j < rows1; j++) {
		      TableRow row1 = table1.getRow(j);
		      if (i==0) {
		        //String[] Partname = table1.getStringColumn("Part_assem_name");
		        Partname[0][j] = row1.getString("Part_assem_name");
		        pp[0][j] = row1.getFloat("Part_assem_name");
		      } else if (i==1)
		      { 
		        pp[1][j] = row1.getFloat("UID");
		      } else if (i==2) {
		        pp[2][j] = row1.getFloat("StatusPP");
		      } else if (i==3) {
		        pp[3][j] = row1.getFloat("1");
		      } else if (i==4) {
		        pp[4][j] = row1.getFloat("2");
		      } else if (i==5) {
		        pp[5][j] = row1.getFloat("3");
		      } else if (i==6) {
		        pp[6][j] = row1.getFloat("4");
		      } else if (i==7) {
		        pp[7][j] = row1.getFloat("5");
		      } else if (i==8) {
		        pp[8][j] = row1.getFloat("6");
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
		  //xloctime[][] == 20,40 same location
		  //xloctime[][] == 1,2, same location

		  //pp for subassemmbly status //Assuming everything is subassembly
		  for (int k6=0; k6<rows1; k6++) {
		    pp[2][k6]=2;
		  }

		  //pp for assembly status
		  // marking for assembly as well as direct instances of the entire product
		  for (int k4=0; k4<rows1; k4++) {
		    for (int k5=0; k5<cols1; k5++) {
		      { 
		        if (pp[k5][0] == pp[1][k4])
		        {
		          pp[2][k4]=1; //Assembly means status is 1
		        }
		      }
		    }
		  }

		  //pp for part status
		  // marking 3 for those which dont have a subgroup
		  for (int k3=0; k3<rows1; k3++) {
		    if (pp[3][k3]==0) //part doesnt have a subgroup
		    {
		      pp[2][k3]=3; //part means status is 3
		    }
		  }

		  //pp for product
		  for (int k6=0; k6<rows1; k6++) {
		    pp[2][0]=0;
		  }

		  Materialall();
		  Manufacturingall();
		  PTDall();
		  Usageall();
		  Afteruseall();
		  Overallall();
		}

		 public void Materialall()
		{  //Impact Calc  Material Phase
		  for (int i=0; i<10; i++)  //
		  {
		    if (loctime[21][i]==1) // Material Phase Impact Calc- 21 LCA
		    {
		      if (loctime[23][i]==1)// 23 Class
		      { 
		        ipart1=ipart1+loctime[17][i]; //Material Part Impact
		      }
		      if (loctime[23][i]==2)
		      { 
		        iass1=iass1+loctime[17][i]; //Material Sub Assembly Impact
		      }
		      if (loctime[23][i]==3)
		      { 
		        ipro1=ipro1+loctime[17][i]; //Material assembly Impact 
		      }
		      imatsum=ipart1+iass1+ipro1; //Material Sum Impact - of the product (overall impact for material phase )
		    }
		    //Material Phase NonZero and Zero numerals
		    if (loctime[21][i]==1) // Material Knowing Phase Nonzero and Zero Calc (21 is Life Cycle Phase)
		    {
		      if (loctime[23][i]==1) // If its a part
		      { 
		        if (loctime[17][i]!=0) // If Impact is non zero (17 is impact)
		        { 
		          nzpart1=nzpart1+1;
		        } else
		        { 
		          zpart1=zpart1+1;
		        }
		      }
		      if (loctime[23][i]==2) // If its a subassembly
		      {         
		        if (loctime[17][i]!=0) // If Impact is non zero
		        { 
		          nzass1=nzass1+1;
		        } else { 
		          zass1=zass1+1;
		        }
		      }
		      if (loctime[23][i]==3) // If its an assembly
		      { 
		        { 
		          if (loctime[17][i]!=0) 
		          { 
		            nzpro1=nzpro1+1;
		          } else { 
		            zpro1=zpro1+1;
		          }
		        }
		      }
		    }
		  }
		  //Confidence Calculation Material Phase
		  for (int i=0; i<10; i++)  //
		  {
		    if (loctime[21][i]==1)   //Material Phase
		    {       
		      if (pp[2][i]==3) //part
		      { 
		        if (loctime[17][i]!=0) 
		        { 
		          part_multipnz1[i] = loctime[17][i]*loctime[22][i];
		        } else {
		          part_multipz1[i] = loctime[17][i];
		        }
		      }
		      if (pp[2][i]==2) 
		      { 
		        if (loctime[17][i]!=0) 
		        { 
		          ass_multipnz1[i] = loctime[17][i]*loctime[22][i];
		        } else {
		          ass_multipz1[i] = loctime[17][i];
		        }
		      }
		      if (pp[2][i]==3) 
		      { 
		        if (loctime[17][i]!=0) 
		        { 
		          pro_multipnz1[i] = loctime[17][i]*loctime[22][i];
		        } else {
		          pro_multipz1[i] = loctime[17][i];
		        }
		      }
		    }
		  }
		  for (int i=0; i<rows+1; i++) {
		    sumpartnz_multip1 += part_multipnz1[i];
		    sumpartz_multip1 += part_multipz1[i];
		    sumassnz_multip1 += ass_multipnz1[i];
		    sumassz_multip1 += ass_multipz1[i];
		    sumpronz_multip1 += pro_multipnz1[i];
		    sumproz_multip1 += pro_multipz1[i];
		  }

		  nzsumass1=nzass1+nzpart1;
		  zsumass1=zass1+zpart1;
		  nzsumpro1=nzpro1+nzass1+nzpart1;
		  zsumpro1=zpro1+zass1+zpart1;

		  ConfidencePart1 = (((nzpart1/(nzpart1+zpart1))*(sumpartnz_multip1/ipart1)) + (zpart1/(nzpart1+zpart1))*(ipart1/(nzpart1+zpart1)))/100;
		  ConfidenceAss1 = (((nzsumass1/(nzsumass1+zsumass1))*(sumassnz_multip1/iass1)) + (zsumass1/(nzsumass1+zsumass1))*(iass1/(nzsumass1+zsumass1)))/100;
		  ConfidencePro1 = ((nzsumpro1/(nzsumpro1+zsumpro1))/100*((sumpronz_multip1+sumassnz_multip1+sumpartnz_multip1)/(ipro1+iass1+ipart1))) + ((zsumpro1/(nzsumpro1+zsumpro1))/100*(ipro1+iass1+ipart1/(nzsumpro1+zsumpro1)))/100;
		  //println(ConfidencePart1);
		  //println(ConfidenceAss1);
		  //println(ConfidencePro1);
		}


	public	void Manufacturingall()
		{  //Impact Calc  Manufacturing Phase
		  for (int i=0; i<rows; i++)  
		  {
		    if (loctime[21][i]==2) // Manufacturing Phase Impact Calc
		    {
		      if (loctime[23][i]==1)
		      { 
		        ipart2=ipart2+loctime[17][i]; //Manufacturing Part Impact
		      }
		      if (loctime[23][i]==2)
		      { 
		        iass2=iass2+loctime[17][i]; //Manufacturing Assembly Impact
		      }
		      if (loctime[23][i]==3)
		      { 
		        ipro2=ipro2+loctime[17][i]; //Manufacturing Product Impact
		      }
		      imansum=ipart2+iass2+ipro2; //Manufacturing Sum Impact
		    }
		    //Manufacturing Phase NonZero and Zero numerals
		    if (loctime[21][i]==2) // Manufacturing Knowing Phase Nonzero and Zero Calc (21 is Life Cycle Phase)
		    {
		      if (loctime[23][i]==1) // If its a part
		      { 
		        if (loctime[17][i]!=0) // If Impact is non zero (17 is impact)
		        { 
		          nzpart2=nzpart2+1;
		        } else
		        { 
		          zpart2=zpart2+1;
		        }
		      }
		      if (loctime[23][i]==2) // If its an assembly
		      {         
		        if (loctime[17][i]!=0) // If Impact is non zero
		        { 
		          nzass2=nzass2+1;
		        } else { 
		          zass2=zass2+1;
		        }
		      }
		      if (loctime[23][i]==3) // If its a product
		      { 
		        { 
		          if (loctime[17][i]!=0) 
		          { 
		            nzpro2=nzpro2+1;
		          } else { 
		            zpro2=zpro2+1;
		          }
		        }
		      }
		    }
		  }
		  //Confidence Calculation Manufacturing Phase
		  for (int i=0; i<rows; i++)  //
		  {
		    if (loctime[21][i]==2)    // Manufacturing Phase
		    {       
		      if (loctime[23][i]==1) 
		      { 
		        if (loctime[17][i]!=0) 
		        { 
		          part_multipnz2[i] = loctime[17][i]*loctime[22][i];
		        } else {
		          part_multipz2[i] = loctime[17][i];
		        }
		      }
		      if (loctime[23][i]==2) 
		      { 
		        if (loctime[17][i]!=0) 
		        { 
		          ass_multipnz2[i] = loctime[17][i]*loctime[22][i];
		        } else {
		          ass_multipz2[i] = loctime[17][i];
		        }
		      }
		      if (loctime[23][i]==3) 
		      { 
		        if (loctime[17][i]!=0) 
		        { 
		          pro_multipnz2[i] = loctime[17][i]*loctime[22][i];
		        } else {
		          pro_multipz2[i] = loctime[17][i];
		        }
		      }
		    }
		  }
		  for (int i=0; i<rows+1; i++) {
		    sumpartnz_multip2 += part_multipnz2[i];
		    sumpartz_multip2 += part_multipz2[i];
		    sumassnz_multip2 += ass_multipnz2[i];
		    sumassz_multip2 += ass_multipz2[i];
		    sumpronz_multip2 += pro_multipnz2[i];
		    sumproz_multip2 += pro_multipz2[i];
		  }

		  nzsumass2=nzass2+nzpart2;
		  zsumass2=zass2+zpart2;
		  nzsumpro2=nzpro2+nzass2+nzpart2;
		  zsumpro2=zpro2+zass2+zpart2;

		  ConfidencePart2 = (((nzpart2/(nzpart2+zpart2))*(sumpartnz_multip2/ipart2)) + (zpart2/(nzpart2+zpart2))*(ipart2/(nzpart2+zpart2)))/100;
		  ConfidenceAss2 = (((nzsumass2/(nzsumass2+zsumass2))*(sumassnz_multip2/iass2)) + (zsumass2/(nzsumass2+zsumass2))*(iass2/(nzsumass2+zsumass2)))/100;
		  ConfidencePro2 = ((nzsumpro2/(nzsumpro2+zsumpro2))/100*((sumpronz_multip2+sumassnz_multip2+sumpartnz_multip2)/(ipro2+iass2+ipart2))) + ((zsumpro2/(nzsumpro2+zsumpro2))/100*(ipro2+iass2+ipart2/(nzsumpro2+zsumpro2)))/100;
		  //println(ConfidencePart2);
		  //println(ConfidenceAss2);
		  //println(ConfidencePro2);
		}



		 

		public void PTDall()
		{  //Impact Calc  PTD Phase
		  for (int i=0; i<rows; i++)  
		  {
		    if (loctime[21][i]==3) // PTD Phase Impact Calc
		    {
		      if (loctime[23][i]==1)
		      { 
		        ipart3=ipart3+loctime[17][i]; //PTD Part Impact
		      }
		      if (loctime[23][i]==2)
		      { 
		        iass3=iass3+loctime[17][i]; //PTD Assembly Impact
		      }
		      if (loctime[23][i]==3)
		      { 
		        ipro3=ipro3+loctime[17][i]; //PTD Product Impact
		      }
		      iptdsum=ipart3+iass3+ipro3; //PTD Sum Impact
		    }
		    //PTD Phase NonZero and Zero numerals
		    if (loctime[21][i]==3) // PTD Knowing Phase Nonzero and Zero Calc (21 is Life Cycle Phase)
		    {
		      if (loctime[23][i]==1) // If its a part
		      { 
		        if (loctime[17][i]!=0) // If Impact is non zero (17 is impact)
		        { 
		          nzpart3=nzpart3+1;
		        } else
		        { 
		          zpart3=zpart3+1;
		        }
		      }
		      if (loctime[23][i]==2) // If its an assembly
		      {         
		        if (loctime[17][i]!=0) // If Impact is non zero
		        { 
		          nzass3=nzass3+1;
		        } else { 
		          zass3=zass3+1;
		        }
		      }
		      if (loctime[23][i]==3) // If its a product
		      { 
		        { 
		          if (loctime[17][i]!=0) 
		          { 
		            nzpro3=nzpro3+1;
		          } else { 
		            zpro3=zpro3+1;
		          }
		        }
		      }
		    }
		  }
		  //Confidence Calculation PTD Phase
		  for (int i=0; i<rows; i++)  //
		  {
		    if (loctime[21][i]==3)    // PTD Phase
		    {       
		      if (loctime[23][i]==1) 
		      { 
		        if (loctime[17][i]!=0) 
		        { 
		          part_multipnz3[i] = loctime[17][i]*loctime[22][i];
		        } else {
		          part_multipz3[i] = loctime[17][i];
		        }
		      }
		      if (loctime[23][i]==2) 
		      { 
		        if (loctime[17][i]!=0) 
		        { 
		          ass_multipnz3[i] = loctime[17][i]*loctime[22][i];
		        } else {
		          ass_multipz3[i] = loctime[17][i];
		        }
		      }
		      if (loctime[23][i]==3) 
		      { 
		        if (loctime[17][i]!=0) 
		        { 
		          pro_multipnz3[i] = loctime[17][i]*loctime[22][i];
		        } else {
		          pro_multipz3[i] = loctime[17][i];
		        }
		      }
		    }
		  }
		  for (int i=0; i<rows+1; i++) {
		    sumpartnz_multip3 += part_multipnz3[i];
		    sumpartz_multip3 += part_multipz3[i];
		    sumassnz_multip3 += ass_multipnz3[i];
		    sumassz_multip3 += ass_multipz3[i];
		    sumpronz_multip3 += pro_multipnz3[i];
		    sumproz_multip3 += pro_multipz3[i];
		  }

		  nzsumass3=nzass3+nzpart3;
		  zsumass3=zass3+zpart3;
		  nzsumpro3=nzpro3+nzass3+nzpart3;
		  zsumpro3=zpro3+zass3+zpart3;

		  ConfidencePart3 = (((nzpart3/(nzpart3+zpart3))*(sumpartnz_multip3/ipart3)) + (zpart3/(nzpart3+zpart3))*(ipart3/(nzpart3+zpart3)))/100;
		  ConfidenceAss3 = (((nzsumass3/(nzsumass3+zsumass3))*(sumassnz_multip3/iass3)) + (zsumass3/(nzsumass3+zsumass3))*(iass3/(nzsumass3+zsumass3)))/100;
		  ConfidencePro3 = ((nzsumpro3/(nzsumpro3+zsumpro3))/100*((sumpronz_multip3+sumassnz_multip3+sumpartnz_multip3)/(ipro3+iass3+ipart3))) + ((zsumpro3/(nzsumpro3+zsumpro3))/100*(ipro3+iass3+ipart3/(nzsumpro3+zsumpro3)))/100;
		  //println(ConfidencePart3);
		  //println(ConfidenceAss3);
		  //println(ConfidencePro3);
		}



		public void Usageall()
		{  //Impact Calc  USAGE Phase
		  for (int i=0; i<rows; i++)  
		  {
		    if (loctime[21][i]==4) // USAGE Phase Impact Calc
		    {
		      if (loctime[23][i]==1)
		      { 
		        ipart4=ipart4+loctime[17][i]; //USAGE Part Impact
		      }
		      if (loctime[23][i]==2)
		      { 
		        iass4=iass4+loctime[17][i]; //USAGE Assembly Impact
		      }
		      if (loctime[23][i]==3)
		      { 
		        ipro4=ipro4+loctime[17][i]; //USAGE Product Impact
		      }
		      iusasum=ipart4+iass4+ipro4; //USAGE Sum Impact
		    }
		    //USAGE Phase NonZero and Zero numerals
		    if (loctime[21][i]==4) // USAGE Knowing Phase Nonzero and Zero Calc (21 is Life Cycle Phase)
		    {
		      if (loctime[23][i]==1) // If its a part
		      { 
		        if (loctime[17][i]!=0) // If Impact is non zero (17 is impact)
		        { 
		          nzpart4=nzpart4+1;
		        } else
		        { 
		          zpart4=zpart4+1;
		        }
		      }
		      if (loctime[23][i]==2) // If its an assembly
		      {         
		        if (loctime[17][i]!=0) // If Impact is non zero
		        { 
		          nzass4=nzass4+1;
		        } else { 
		          zass4=zass4+1;
		        }
		      }
		      if (loctime[23][i]==3) // If its a product
		      { 
		        { 
		          if (loctime[17][i]!=0) 
		          { 
		            nzpro4=nzpro4+1;
		          } else { 
		            zpro4=zpro4+1;
		          }
		        }
		      }
		    }
		  }
		  //Confidence Calculation USAGE Phase
		  for (int i=0; i<rows; i++)  //
		  {
		    if (loctime[21][i]==4)    // USAGE Phase
		    {       
		      if (loctime[23][i]==1) 
		      { 
		        if (loctime[17][i]!=0) 
		        { 
		          part_multipnz4[i] = loctime[17][i]*loctime[22][i];
		        } else {
		          part_multipz4[i] = loctime[17][i];
		        }
		      }
		      if (loctime[23][i]==2) 
		      { 
		        if (loctime[17][i]!=0) 
		        { 
		          ass_multipnz4[i] = loctime[17][i]*loctime[22][i];
		        } else {
		          ass_multipz4[i] = loctime[17][i];
		        }
		      }
		      if (loctime[23][i]==3) 
		      { 
		        if (loctime[17][i]!=0) 
		        { 
		          pro_multipnz4[i] = loctime[17][i]*loctime[22][i];
		        } else {
		          pro_multipz4[i] = loctime[17][i];
		        }
		      }
		    }
		  }
		  for (int i=0; i<rows+1; i++) {
		    sumpartnz_multip4 += part_multipnz4[i];
		    sumpartz_multip4 += part_multipz4[i];
		    sumassnz_multip4 += ass_multipnz4[i];
		    sumassz_multip4 += ass_multipz4[i];
		    sumpronz_multip4 += pro_multipnz4[i];
		    sumproz_multip4 += pro_multipz4[i];
		  }

		  nzsumass4=nzass4+nzpart4;
		  zsumass4=zass4+zpart4;
		  nzsumpro4=nzpro4+nzass4+nzpart4;
		  zsumpro4=zpro4+zass4+zpart4;

		  ConfidencePart4 = (((nzpart4/(nzpart4+zpart4))*(sumpartnz_multip4/ipart4)) + (zpart4/(nzpart4+zpart4))*(ipart4/(nzpart4+zpart4)))/100;
		  ConfidenceAss4 = (((nzsumass4/(nzsumass4+zsumass4))*(sumassnz_multip4/iass4)) + (zsumass4/(nzsumass4+zsumass4))*(iass4/(nzsumass4+zsumass4)))/100;
		  ConfidencePro4 = ((nzsumpro4/(nzsumpro4+zsumpro4))/100*((sumpronz_multip4+sumassnz_multip4+sumpartnz_multip4)/(ipro4+iass4+ipart4))) + ((zsumpro4/(nzsumpro4+zsumpro4))/100*(ipro4+iass4+ipart4/(nzsumpro4+zsumpro4)))/100;
		  //println(ConfidencePart4);
		  //println(ConfidenceAss4);
		  //println(ConfidencePro4);
		}


		public void Afteruseall()
		{  //Impact Calc  AFTERUSE Phase
		  for (int i=0; i<rows; i++)  
		  {
		    if (loctime[21][i]==5) // AFTERUSE Phase Impact Calc
		    {
		      if (loctime[23][i]==1)
		      { 
		        ipart5=ipart5+loctime[17][i]; //AFTERUSE Part Impact
		      }
		      if (loctime[23][i]==2)
		      { 
		        iass5=iass5+loctime[17][i]; //AFTERUSE Assembly Impact
		      }
		      if (loctime[23][i]==3)
		      { 
		        ipro5=ipro5+loctime[17][i]; //AFTERUSE Product Impact
		      }
		      iafusum=ipart5+iass5+ipro5; //AFTERUSE Sum Impact
		    }
		    //AFTERUSE Phase NonZero and Zero numerals
		    if (loctime[21][i]==5) // AFTERUSE Knowing Phase Nonzero and Zero Calc (21 is Life Cycle Phase)
		    {
		      if (loctime[23][i]==1) // If its a part
		      { 
		        if (loctime[17][i]!=0) // If Impact is non zero (17 is impact)
		        { 
		          nzpart5=nzpart5+1;
		        } else
		        { 
		          zpart5=zpart5+1;
		        }
		      }
		      if (loctime[23][i]==2) // If its an assembly
		      {         
		        if (loctime[17][i]!=0) // If Impact is non zero
		        { 
		          nzass5=nzass5+1;
		        } else { 
		          zass5=zass5+1;
		        }
		      }
		      if (loctime[23][i]==3) // If its a product
		      { 
		        { 
		          if (loctime[17][i]!=0) 
		          { 
		            nzpro5=nzpro5+1;
		          } else { 
		            zpro5=zpro5+1;
		          }
		        }
		      }
		    }
		  }
		  //Confidence Calculation AFTERUSE Phase
		  for (int i=0; i<rows; i++)  //
		  {
		    if (loctime[21][i]==5)    // AFTERUSE Phase
		    {       
		      if (loctime[23][i]==1) 
		      { 
		        if (loctime[17][i]!=0) 
		        { 
		          part_multipnz5[i] = loctime[17][i]*loctime[22][i];
		        } else {
		          part_multipz5[i] = loctime[17][i];
		        }
		      }
		      if (loctime[23][i]==2) 
		      { 
		        if (loctime[17][i]!=0) 
		        { 
		          ass_multipnz5[i] = loctime[17][i]*loctime[22][i];
		        } else {
		          ass_multipz5[i] = loctime[17][i];
		        }
		      }
		      if (loctime[23][i]==3) 
		      { 
		        if (loctime[17][i]!=0) 
		        { 
		          pro_multipnz5[i] = loctime[17][i]*loctime[22][i];
		        } else {
		          pro_multipz5[i] = loctime[17][i];
		        }
		      }
		    }
		  }
		  for (int i=0; i<rows+1; i++) {
		    sumpartnz_multip5 += part_multipnz5[i];
		    sumpartz_multip5 += part_multipz5[i];
		    sumassnz_multip5 += ass_multipnz5[i];
		    sumassz_multip5 += ass_multipz5[i];
		    sumpronz_multip5 += pro_multipnz5[i];
		    sumproz_multip5 += pro_multipz5[i];
		  }

		  nzsumass5=nzass5+nzpart5;
		  zsumass5=zass5+zpart5;
		  nzsumpro5=nzpro5+nzass5+nzpart5;
		  zsumpro5=zpro5+zass5+zpart5;

		  ConfidencePart5 = (((nzpart5/(nzpart5+zpart5))*(sumpartnz_multip5/ipart5)) + (zpart5/(nzpart5+zpart5))*(ipart5/(nzpart5+zpart5)))/100;
		  ConfidenceAss5 = (((nzsumass5/(nzsumass5+zsumass5))*(sumassnz_multip5/iass5)) + (zsumass5/(nzsumass5+zsumass5))*(iass5/(nzsumass5+zsumass5)))/100;
		  ConfidencePro5 = ((nzsumpro5/(nzsumpro5+zsumpro5))/100*((sumpronz_multip5+sumassnz_multip5+sumpartnz_multip5)/(ipro5+iass5+ipart5))) + ((zsumpro5/(nzsumpro5+zsumpro5))/100*(ipro5+iass5+ipart5/(nzsumpro5+zsumpro5)))/100;
		  //println(ConfidencePart5);
		  //println(ConfidenceAss5);
		  //println(ConfidencePro5);
		}

	public	void Afterusecases(int check)
		{ 
		  for (int i=0; i<rows; i++) 
		  {
		    if (check!=0)
		    {
		      if (xloctime[0][i]==check)
		      { 
		        if (loctime[21][i]==5) // AFTERUSE Phase Impact Calc
		        {
		          if (loctime[23][i]==1)
		          { 
		            ipart5c=ipart5c+loctime[17][i]; //AFTERUSE Part Impact
		          }
		          if (loctime[23][i]==2)
		          { 
		            iass5c=iass5c+loctime[17][i]; //AFTERUSE Assembly Impact
		          }
		          if (loctime[23][i]==3)
		          { 
		            ipro5c=ipro5c+loctime[17][i]; //AFTERUSE Product Impact
		          }
		          iafusumc=ipart5c+iass5c+ipro5c; //AFTERUSE Sum Impact
		        }
		        //AFTERUSE Phase NonZero and Zero numerals
		        if (loctime[21][i]==5) // AFTERUSE Knowing Phase Nonzero and Zero Calc (21 is Life Cycle Phase)
		        {
		          if (loctime[23][i]==1) // If its a part
		          { 
		            if (loctime[17][i]!=0) // If Impact is non zero (17 is impact)
		            { 
		              nzpart5c=nzpart5c+1;
		            } else
		            { 
		              zpart5c=zpart5c+1;
		            }
		          }
		          if (loctime[23][i]==2) // If its an assembly
		          {         
		            if (loctime[17][i]!=0) // If Impact is non zero
		            { 
		              nzass5c=nzass5c+1;
		            } else { 
		              zass5c=zass5c+1;
		            }
		          }
		          if (loctime[23][i]==3) // If its a product
		          { 
		            { 
		              if (loctime[17][i]!=0) 
		              { 
		                nzpro5c=nzpro5c+1;
		              } else { 
		                zpro5c=zpro5c+1;
		              }
		            }
		          }
		        }
		      }
		    }
		  }
		  //Confidence Calculation AFTERUSE Phase
		  for (int i=0; i<rows; i++)  //
		  {    
		    if (check!=0) { 
		      if (xloctime[0][i]==check)
		      { 
		        if (loctime[21][i]==5)   // AFTERUSE Phase
		        {       
		          if (loctime[23][i]==1) 
		          { 
		            if (loctime[17][i]!=0) 
		            { 
		              part_multipnz5c[i] = loctime[17][i]*loctime[22][i];
		            } else {
		              part_multipz5c[i] = loctime[17][i];
		            }
		          }
		          if (loctime[23][i]==2) 
		          { 
		            if (loctime[17][i]!=0) 
		            { 
		              ass_multipnz5c[i] = loctime[17][i]*loctime[22][i];
		            } else {
		              ass_multipz5c[i] = loctime[17][i];
		            }
		          }
		          if (loctime[23][i]==3) 
		          { 
		            if (loctime[17][i]!=0) 
		            { 
		              pro_multipnz5c[i] = loctime[17][i]*loctime[22][i];
		            } else {
		              pro_multipz5c[i] = loctime[17][i];
		            }
		          }
		        }
		      }
		    }
		  }
		  for (int i=0; i<rows+1; i++) {
		    if (check!=0)
		      if (xloctime[0][i]==check)
		      { 
		        sumpartnz_multip5c += part_multipnz5c[i];
		        sumpartz_multip5c += part_multipz5c[i];
		        sumassnz_multip5c += ass_multipnz5c[i];
		        sumassz_multip5c += ass_multipz5c[i];
		        sumpronz_multip5c += pro_multipnz5c[i];
		        sumproz_multip5c += pro_multipz5c[i];
		      }
		    nzsumass5c=nzass5c+nzpart5c;
		    zsumass5c=zass5c+zpart5c;
		    nzsumpro5c=nzpro5c+nzass5c+nzpart5c;
		    zsumpro5c=zpro5c+zass5c+zpart5c;
		    ConfidencePart5c = (((nzpart5c/(nzpart5c+zpart5c))*(sumpartnz_multip5c/ipart5c)) + (zpart5c/(nzpart5c+zpart5c))*(ipart5c/(nzpart5c+zpart5c)))/100;
		    ConfidenceAss5c = (((nzsumass5c/(nzsumass5c+zsumass5c))*(sumassnz_multip5c/iass5c)) + (zsumass5c/(nzsumass5c+zsumass5c))*(iass5c/(nzsumass5c+zsumass5c)))/100;
		    ConfidencePro5c = ((nzsumpro5c/(nzsumpro5c+zsumpro5c))/100*((sumpronz_multip5c+sumassnz_multip5c+sumpartnz_multip5c)/(ipro5c+iass5c+ipart5c))) + ((zsumpro5c/(nzsumpro5c+zsumpro5c))/100*(ipro5c+iass5c+ipart5c/(nzsumpro5c+zsumpro5c)))/100;
		    //println(ConfidencePart5c);
		    //println(ConfidenceAss5c);
		    //println(ConfidencePro5c);
		  }
		}



	public	void Overallall()
		{  //Impact Calc  OVERALL Phase
		  for (int i=0; i<rows; i++)  
		  {
		    if (loctime[21][i]!=0) // OVERALL Phase Impact Calc
		    {
		      if (loctime[23][i]==1)
		      { 
		        ipart6=ipart6+loctime[17][i]; //OVERALL Part Impact
		      }
		      if (loctime[23][i]==2)
		      { 
		        iass6=iass6+loctime[17][i]; //OVERALL Assembly Impact
		      }
		      if (loctime[23][i]==3)
		      { 
		        ipro6=ipro6+loctime[17][i]; //OVERALL Product Impact
		      }
		      iovesum=ipart6+iass6+ipro6; //OVERALL Sum Impact
		    }
		    //OVERALL Phase NonZero and Zero numerals
		    if (loctime[21][i]!=0) // OVERALL Knowing Phase Nonzero and Zero Calc (21 is Life Cycle Phase)
		    {
		      if (loctime[23][i]==1) // If its a part
		      { 
		        if (loctime[17][i]!=0) // If Impact is non zero (17 is impact)
		        { 
		          nzpart6=nzpart6+1;
		        } else
		        { 
		          zpart6=zpart6+1;
		        }
		      }
		      if (loctime[23][i]==2) // If its an assembly
		      {         
		        if (loctime[17][i]!=0) // If Impact is non zero
		        { 
		          nzass6=nzass6+1;
		        } else { 
		          zass6=zass6+1;
		        }
		      }
		      if (loctime[23][i]==3) // If its a product
		      { 
		        { 
		          if (loctime[17][i]!=0) 
		          { 
		            nzpro6=nzpro6+1;
		          } else { 
		            zpro6=zpro6+1;
		          }
		        }
		      }
		    }
		  }
		  //Confidence Calculation OVERALL Phase
		  for (int i=0; i<rows; i++)  //
		  {
		    if (loctime[21][i]!=0)    // OVERALL Phase
		    {       
		      if (loctime[23][i]==1) 
		      { 
		        if (loctime[17][i]!=0) 
		        { 
		          part_multipnz6[i] = loctime[17][i]*loctime[22][i];
		        } else {
		          part_multipz6[i] = loctime[17][i];
		        }
		      }
		      if (loctime[23][i]==2) 
		      { 
		        if (loctime[17][i]!=0) 
		        { 
		          ass_multipnz6[i] = loctime[17][i]*loctime[22][i];
		        } else {
		          ass_multipz6[i] = loctime[17][i];
		        }
		      }
		      if (loctime[23][i]==3) 
		      { 
		        if (loctime[17][i]!=0) 
		        { 
		          pro_multipnz6[i] = loctime[17][i]*loctime[22][i];
		        } else {
		          pro_multipz6[i] = loctime[17][i];
		        }
		      }
		    }
		  }
		  for (int i=0; i<rows+1; i++) {
		    sumpartnz_multip6 += part_multipnz6[i];
		    sumpartz_multip6 += part_multipz6[i];
		    sumassnz_multip6 += ass_multipnz6[i];
		    sumassz_multip6 += ass_multipz6[i];
		    sumpronz_multip6 += pro_multipnz6[i];
		    sumproz_multip6 += pro_multipz6[i];
		  }

		  nzsumass6=nzass6+nzpart6;
		  zsumass6=zass6+zpart6;
		  nzsumpro6=nzpro6+nzass6+nzpart6;
		  zsumpro6=zpro6+zass6+zpart6;

		  ConfidencePart6 = (((nzpart6/(nzpart6+zpart6))*(sumpartnz_multip6/ipart6)) + (zpart6/(nzpart6+zpart6))*(ipart6/(nzpart6+zpart6)))/100;
		  ConfidenceAss6 = (((nzsumass6/(nzsumass6+zsumass6))*(sumassnz_multip6/iass6)) + (zsumass6/(nzsumass6+zsumass6))*(iass6/(nzsumass6+zsumass6)))/100;
		  ConfidencePro6 = ((nzsumpro6/(nzsumpro6+zsumpro6))/100*((sumpronz_multip6+sumassnz_multip6+sumpartnz_multip6)/(ipro6+iass6+ipart6))) + ((zsumpro6/(nzsumpro6+zsumpro6))/100*(ipro6+iass6+ipart6/(nzsumpro6+zsumpro6)))/100;
		  //println(ConfidencePart6);
		  //println(ConfidenceAss6);
		  //println(ConfidencePro6);
		}
		public void MaterialallVis()
		{    
		  rectMode(CORNERS);
		  textSize(3);
		  //fill(40);
		 // ellipse(Vis, Vis-(imatsum/100), Vis+20, Vis);
		 // rect(Vis, Vis-(imatsum/100), Vis+20, Vis );
		if ((imatsum/1000) >=0.3){
		   fill(239,62,52);
		 ellipse(100,20, 10,10);}
		 else if  (((imatsum/1000)>=0.1) && (imatsum/1000)<0.3){
		   fill(241,89,40);
		 ellipse(100,20, 10,10);}
		  else if  (((imatsum/1000)>=0.06) && (imatsum/1000)<0.1){
		   fill(241,89,40);
		 ellipse(100,20, 10,10);}
		 else if (((imatsum/1000)>=0.02) && (imatsum/1000)<0.03){
		   fill(251,175,63);
		 ellipse(100,20, 10,10);}
		    else if (((imatsum/1000)>=0.01) && (imatsum/1000)<0.02){
		   fill(247,236,46);
		 ellipse(100,20, 10,10);}
		    else if (((imatsum/1000)>=0.0004) && (imatsum/1000)<0.01){
		   fill(214,223,34);
		 ellipse(100,20, 10,10);}
		    else if (((imatsum/1000)>=0.0003) && (imatsum/1000)<0.0004){
		   fill(140,198,62);
		 ellipse(100,20, 10,10);}
		    else if (((imatsum/1000)>=0.0002) && (imatsum/1000)<0.0003){
		   fill(36,181,114);
		 ellipse(100,20, 10,10);}
		    else if ((imatsum/1000)<=0.0002){ 
		   fill(0,173,239);
		 ellipse(100,20, 10,10);}
		 

		 // arc(Vis+10, Vis+20, 20, 20, 0, ConfidencePro1*6.2831, PIE);
		  fill(0);
		  text("MATERIAL PHASE", 110,20);
		text("Impact = " + imatsum/1000, 55, 20);
		  text("Confidence =" + ConfidencePro1*100 +" %", 55, 25);
		  }

		public void ManufacturingallVis()
		{    
		  rectMode(CORNERS);
		  textSize(3);
		 if ((imansum/1000)>=0.3){
		   fill(239,62,52);
		 ellipse(100,40, 10,10);}
		 else if  (((imansum/1000)>=0.1) && (imansum/1000)<0.3){
		   fill(241,89,40);
		 ellipse(100,40, 10,10);}
		  else if  (((imansum/1000)>=0.06) && (imansum/1000)<0.1){
		   fill(241,89,40);
		 ellipse(100,40, 10,10);}
		 else if (((imansum/1000)>=0.02) && (imansum/1000)<0.03){
		   fill(251,175,63);
		 ellipse(100,40, 10,10);}
		    else if (((imansum/1000)>=0.01) && (imansum/1000)<0.02){
		   fill(247,236,46);
		 ellipse(100,40, 10,10);}
		    else if (((imansum/1000)>=0.0004) && (imansum/1000)<0.01){
		   fill(214,223,34);
		 ellipse(100,40, 10,10);}
		    else if (((imansum/1000)>=0.0003) && (imansum/1000)<0.0004){
		   fill(140,198,62);
		 ellipse(100,40, 10,10);}
		    else if (((imansum/1000)>=0.0002) && (imansum/1000)<0.0003){
		   fill(36,181,114);
		 ellipse(100,40, 10,10);}
		    else if ((imansum/1000)<=0.0002){ 
		   fill(0,173,239);
		 ellipse(100,40, 10,10);}
		 
		 
		 // rect(Vis+50, Vis-(imansum/100), Vis+20+50, Vis );
		 
		  //arc(Vis+10+50, Vis+20, 20, 20, 0, ConfidencePro2*6.2831, PIE);
		  fill(0);
		  text("MANUFACTURING PHASE", Vis+10, 40);
		  text("Impact = " + imansum/1000, 55, 40);
		  text("Confidence = " +ConfidencePro2*100 + " %", 55 , 45);
		  
		}




		public	void PTDallVis()
		{    
		  rectMode(CORNERS);
		  textSize(3);
		  if ((iptdsum/1000)>=0.3){
		   fill(239,62,52);
		 ellipse(100,60, 10,10);}
		 else if  (((iptdsum/1000)>=0.1) && (iptdsum/1000)<0.3){
		   fill(241,89,40);
		ellipse(100,60, 10,10);}
		  else if  (((iptdsum/1000)>=0.06) && (iptdsum/1000)<0.1){
		   fill(241,89,40);
		ellipse(100,60, 10,10);}
		 else if (((iptdsum/1000)>=0.02) && (iptdsum/1000)<0.03){
		   fill(251,175,63);
		ellipse(100,60, 10,10);}
		    else if (((iptdsum/1000)>=0.01) && (iptdsum/1000)<0.02){
		   fill(247,236,46);
		 ellipse(100,60, 10,10);}
		    else if (((iptdsum/1000)>=0.0004) && (iptdsum/1000)<0.01){
		   fill(214,223,34);
		 ellipse(100,60, 10,10);}
		    else if (((iptdsum/1000)>=0.0003) && (iptdsum/1000)<0.0004){
		   fill(140,198,62);
		ellipse(100,60, 10,10);}
		    else if (((iptdsum/1000)>=0.0002) && (iptdsum/1000)<0.0003){
		   fill(36,181,114);
		ellipse(100,60, 10,10);}
		    else if ((iptdsum/1000)<=0.0002){ 
		   fill(0,173,239);
		 ellipse(100,60, 10,10);}
		 // rect(Vis+100, Vis-(iptdsum/100), Vis+20+100, Vis );
		  //arc(Vis+10+100, Vis+20, 20, 20, 0, ConfidencePro3*6.2831, PIE);
		  fill(0);
		  text("PTD PHASE", Vis+10, 60);
		  text("Impact = " +iptdsum/1000, 55,60);
		  text("Confidence = " + ConfidencePro3*100+ " %", 55,65);
		 
		}
		
		




		public	void UsageallVis()
		{    
		  rectMode(CORNERS);
		  textSize(3);
		  if ((iusasum/1000)>=0.3){
		   fill(239,62,52);
		  ellipse(100,80, 10,10);}
		 else if  (((iusasum/1000)>=0.1) && (iusasum/1000)<0.3){
		   fill(241,89,40);
		 ellipse(100,80, 10,10);}
		  else if  (((iusasum/1000)>=0.06) && (iusasum/1000)<0.1){
		   fill(241,89,40);
		 ellipse(100,80, 10,10);}
		 else if (((iusasum/1000)>=0.02) && (iusasum/1000)<0.03){
		   fill(251,175,63);
		 ellipse(100,80, 10,10);}
		    else if (((iusasum/1000)>=0.01) && (iusasum/1000)<0.02){
		   fill(247,236,46);
		 ellipse(100,80, 10,10);}
		    else if (((iusasum/1000)>=0.0004) && (iusasum/1000)<0.01){
		   fill(214,223,34);
		  ellipse(100,80, 10,10);}
		    else if (((iusasum/1000)>=0.0003) && (iusasum/1000)<0.0004){
		   fill(140,198,62);
		 ellipse(100,80, 10,10);}
		    else if (((iusasum/1000)>=0.0002) && (iusasum/1000)<0.0003){
		   fill(36,181,114);
		 ellipse(100,80, 10,10);}
		    else if ((iusasum/1000)<=0.0002){ 
		   fill(0,173,239);
		 ellipse(100,80, 10,10);}
		  //rect(Vis+150, Vis-(iusasum/100), Vis+20+150, Vis );
		 // arc(Vis+10+150, Vis+20, 20, 20, 0, ConfidencePro4*6.2831, PIE);
		  fill(0);
		  text("USAGE PHASE", Vis+10, 80);
		  text("Impact = " +iusasum/1000, 55 , 80);
		  text("Confidence = " + ConfidencePro4*100+ " %", 55 , 85);
		  
		}





		public void AfteruseallVis()
		{    
		  rectMode(CORNERS);
		  textSize(3);
		   if ((iafusum/1000)>=0.3){
		   fill(239,62,52);
		 ellipse(100,100, 10,10);}
		 else if  (((iafusum/1000)>=0.1) && (iafusum/1000)<0.3){
		   fill(241,89,40);
		ellipse(100,100, 10,10);}
		  else if  (((iafusum/1000)>=0.06) && (iafusum/1000)<0.1){
		   fill(241,89,40);
		ellipse(100,100, 10,10);}
		 else if (((iafusum/1000)>=0.02) && (iafusum/1000)<0.03){
		   fill(251,175,63);
		 ellipse(100,100, 10,10);}
		    else if (((iafusum/1000)>=0.01) && (iafusum/1000)<0.02){
		   fill(247,236,46);
		ellipse(100,100, 10,10);}
		    else if (((iafusum/1000)>=0.0004) && (iafusum/1000)<0.01){
		   fill(214,223,34);
		 ellipse(100,100, 10,10);}
		    else if (((iafusum/1000)>=0.0003) && (iafusum/1000)<0.0004){
		   fill(140,198,62);
		 ellipse(100,100, 10,10);}
		    else if (((iafusum/1000)>=0.0002) && (iafusum/1000)<0.0003){
		   fill(36,181,114);
		ellipse(100,100, 10,10);}
		    else if ((iafusum/1000)<=0.0002){ 
		   fill(0,173,239);
		 ellipse(100,100, 10,10);}
		 // rect(Vis+200, Vis-(iafusum/100), Vis+20+200, Vis );
		 // arc(Vis+10+200, Vis+20, 20, 20, 0, ConfidencePro5*6.2831, PIE);
		  fill(0);
		  text("AFTERUSE PHASE", Vis+10, 100);
		  text("Impact = " +iafusum/1000, 55,100);
		  text("Confidence = " +ConfidencePro5*100+ " %", 55,105);
		 
		}




		public	void OverallallVis()
		{    
		  rectMode(CORNERS);
		  textSize(3);
		    if ((iovesum/1000)>=0.3){
		   fill(239,62,52);
		ellipse(160,120, 10,10);}
		 else if  (((iovesum/1000)>=0.1) && (iovesum/1000)<0.3){
		   fill(241,89,40);
		ellipse(160,120, 10,10);}
		  else if  (((iovesum/1000)>=0.06) && (iovesum/1000)<0.1){
		   fill(241,89,40);
		ellipse(160,120, 10,10);}
		 else if (((iovesum/1000)>=0.02) && (iovesum/1000)<0.03){
		   fill(251,175,63);
		ellipse(160,120, 10,10);}
		    else if (((iovesum/1000)>=0.01) && (iovesum/1000)<0.02){
		   fill(247,236,46);
		ellipse(160,120, 10,10);}
		    else if (((iovesum/1000)>=0.0004) && (iovesum/1000)<0.01){
		   fill(214,223,34);
		ellipse(160,120, 10,10);}
		    else if (((iovesum/1000)>=0.0003) && (iovesum/1000)<0.0004){
		   fill(140,198,62);
		 ellipse(160,120, 10,10);}
		    else if (((iovesum/1000)>=0.0002) && (iovesum/1000)<0.0003){
		   fill(36,181,114);
		ellipse(160,120, 10,10);}
		    else if ((iovesum/1000)<=0.0002){ 
		   fill(0,173,239);
		 ellipse(160,120, 10,10);}
		  //rect(Vis+250, Vis-(iovesum/100), Vis+20+250, Vis );
		 // arc(Vis+10+250, Vis+20, 20, 20, 0, ConfidencePro6*6.2831, PIE);
		  fill(0);
		  text("OVERALL", Vis+70, 120);
		  text("Impact = " +iovesum/1000, 115,120);
		  text("Confidence = " +ConfidencePro6*100+ " %", 115,125);
		 
		}





		public	void draw()
		{
		  
		  translate (panx, pany);
		  scale (zoom);
		  background(255);
		  strokeWeight(0);
		 // line(0, 100, 1000, 100);
		//strokeWeight(1);
		  stroke(0);
		  //strokeWeight(1);
		  fill(0);
		 // textSize(6);
		  //text("PRODUCT IMPACT", 32, 90);
		  //text("PRODUCT CONFIDENCE", 25, 120);
		  //textSize(4);
		 // text("IMPACT AT LOCATION LEVEL", 32, 190);
		 // text("CONFIDENCE AT LOCATION LEVEL", 25, 220);
		  rectMode(CORNERS);
		  textSize(2);
		  
		  fill(46,49,146);
		  rect(150,15,160,20 );
		  fill(26,117,188);
		  rect(150,25,160,20 );
		fill(0,173,239);
		rect(150,30,160,25);
		fill(7,167,157);
		rect(150,35,160,30);
		fill(36,181,114);
		rect(150,40,160,35);
		fill(140,198,62);
		rect(150,45,160,40);
		fill(214,223,34);
		rect(150,50,160,45);
		fill(247,236,46);
		rect(150,55,160,50);
		fill(251,175,63);
		rect(150,60,160,55);
		fill(247,146,28);
		rect(150,65,160,60);
		fill(241,89,40);
		rect(150,70,160,65);
		fill(239,62,52);
		rect(150,75,160,70);
		stroke(0);
		textSize(3);

		fill(0);
		text("0.3" , Vis + 62 , 75);
		stroke(0);
		strokeWeight(1);

		line(100,25, 100,35);
		line(100,45, 100,55);
		line(100,65, 100,75);
		line(100,85, 100,95);
		//line(100,105, 100,125);

		 
		strokeWeight(1);
		stroke(0);

		  imatsumc=0;
		  ipart1c=0;
		  iass1c=0;
		  ipro1c=0;
		  nzpart1c=0;
		  nzass1c=0;
		  nzpro1c=0;
		  zpart1c=0;
		  zass1c=0;
		  zpro1c=0;
		  nzsumass1c=0;
		  zsumass1c=0;
		  nzsumpro1c=0;
		  zsumpro1c=0;
		  ConfidencePart1c=0;
		  ConfidenceAss1c=0;
		  ConfidencePro1c=0;
		  sumpartnz_multip1c=0;
		  sumpartz_multip1c=0;
		  sumassnz_multip1c=0;
		  sumassz_multip1c=0;
		  sumpronz_multip1c=0;
		  sumproz_multip1c=0;
		  imansumc=0;
		  ipart2c=0;
		  iass2c=0;
		  ipro2c=0;
		  nzpart2c=0;
		  nzass2c=0;
		  nzpro2c=0;
		  zpart2c=0;
		  zass2c=0;
		  zpro2c=0;
		  nzsumass2c=0;
		  zsumass2c=0;
		  nzsumpro2c=0;
		  zsumpro2c=0;
		  ConfidencePart2c=0;
		  ConfidenceAss2c=0;
		  ConfidencePro2c=0;
		  sumpartnz_multip2c=0;
		  sumpartz_multip2c=0;
		  sumassnz_multip2c=0;
		  sumassz_multip2c=0;
		  sumpronz_multip2c=0;
		  sumproz_multip2c=0;
		  iptdsumc=0;
		  ipart3c=0;
		  iass3c=0;
		  ipro3c=0;
		  nzpart3c=0;
		  nzass3c=0;
		  nzpro3c=0;
		  zpart3c=0;
		  zass3c=0;
		  zpro3c=0;
		  nzsumass3c=0;
		  zsumass3c=0;
		  nzsumpro3c=0;
		  zsumpro3c=0;
		  ConfidencePart3c=0;
		  ConfidenceAss3c=0;
		  ConfidencePro3c=0;
		  sumpartnz_multip3c=0;
		  sumpartz_multip3c=0;
		  sumassnz_multip3c=0;
		  sumassz_multip3c=0;
		  sumpronz_multip3c=0;
		  sumproz_multip3c=0;
		  iusasumc=0;
		  ipart4c=0;
		  iass4c=0;
		  ipro4c=0;
		  nzpart4c=0;
		  nzass4c=0;
		  nzpro4c=0;
		  zpart4c=0;
		  zass4c=0;
		  zpro4c=0;
		  nzsumass4c=0;
		  zsumass4c=0;
		  nzsumpro4c=0;
		  zsumpro4c=0;
		  ConfidencePart4c=0;
		  ConfidenceAss4c=0;
		  ConfidencePro4c=0;
		  sumpartnz_multip4c=0;
		  sumpartz_multip4c=0;
		  sumassnz_multip4c=0;
		  sumassz_multip4c=0;
		  sumpronz_multip4c=0;
		  sumproz_multip4c=0;
		  iafusumc=0;
		  ipart5c=0;
		  iass5c=0;
		  ipro5c=0;
		  nzpart5c=0;
		  nzass5c=0;
		  nzpro5c=0;
		  zpart5c=0;
		  zass5c=0;
		  zpro5c=0;
		  nzsumass5c=0;
		  zsumass5c=0;
		  nzsumpro5c=0;
		  zsumpro5c=0;
		  ConfidencePart5c=0;
		  ConfidenceAss5c=0;
		  ConfidencePro5c=0;
		  sumpartnz_multip5c=0;
		  sumpartz_multip5c=0;
		  sumassnz_multip5c=0;
		  sumassz_multip5c=0;
		  sumpronz_multip5c=0;
		  sumproz_multip5c=0;
		  iovesumc=0;
		  ipart6c=0;
		  iass6c=0;
		  ipro6c=0;
		  nzpart6c=0;
		  nzass6c=0;
		  nzpro6c=0;
		  zpart6c=0;
		  zass6c=0;
		  zpro6c=0;
		  nzsumass6c=0;
		  zsumass6c=0;
		  nzsumpro6c=0;
		  zsumpro6c=0;
		  ConfidencePart6c=0;
		  ConfidenceAss6c=0;
		  ConfidencePro6c=0;
		  sumpartnz_multip6c=0;
		  sumpartz_multip6c=0;
		  sumassnz_multip6c=0;
		  sumassz_multip6c=0;
		  sumpronz_multip6c=0;
		  sumproz_multip6c=0;

		  imatsump=0;
		  ipart1p=0;
		  iass1p=0;
		  ipro1p=0;
		  nzpart1p=0;
		  nzass1p=0;
		  nzpro1p=0;
		  zpart1p=0;
		  zass1p=0;
		  zpro1p=0;
		  nzsumass1p=0;
		  zsumass1p=0;
		  nzsumpro1p=0;
		  zsumpro1p=0;
		  ConfidencePart1p=0;
		  ConfidenceAss1p=0;
		  ConfidencePro1p=0;
		  sumpartnz_multip1p=0;
		  sumpartz_multip1p=0;
		  sumassnz_multip1p=0;
		  sumassz_multip1p=0;
		  sumpronz_multip1p=0;
		  sumproz_multip1p=0;
		  imansump=0;
		  ipart2p=0;
		  iass2p=0;
		  ipro2p=0;
		  nzpart2p=0;
		  nzass2p=0;
		  nzpro2p=0;
		  zpart2p=0;
		  zass2p=0;
		  zpro2p=0;
		  nzsumass2p=0;
		  zsumass2p=0;
		  nzsumpro2p=0;
		  zsumpro2p=0;
		  ConfidencePart2p=0;
		  ConfidenceAss2p=0;
		  ConfidencePro2p=0;
		  sumpartnz_multip2p=0;
		  sumpartz_multip2p=0;
		  sumassnz_multip2p=0;
		  sumassz_multip2p=0;
		  sumpronz_multip2p=0;
		  sumproz_multip2p=0;
		  iptdsump=0;
		  ipart3p=0;
		  iass3p=0;
		  ipro3p=0;
		  nzpart3p=0;
		  nzass3p=0;
		  nzpro3p=0;
		  zpart3p=0;
		  zass3p=0;
		  zpro3p=0;
		  nzsumass3p=0;
		  zsumass3p=0;
		  nzsumpro3p=0;
		  zsumpro3p=0;
		  ConfidencePart3p=0;
		  ConfidenceAss3p=0;
		  ConfidencePro3p=0;
		  sumpartnz_multip3p=0;
		  sumpartz_multip3p=0;
		  sumassnz_multip3p=0;
		  sumassz_multip3p=0;
		  sumpronz_multip3p=0;
		  sumproz_multip3p=0;
		  iusasump=0;
		  ipart4p=0;
		  iass4p=0;
		  ipro4p=0;
		  nzpart4p=0;
		  nzass4p=0;
		  nzpro4p=0;
		  zpart4p=0;
		  zass4p=0;
		  zpro4p=0;
		  nzsumass4p=0;
		  zsumass4p=0;
		  nzsumpro4p=0;
		  zsumpro4p=0;
		  ConfidencePart4p=0;
		  ConfidenceAss4p=0;
		  ConfidencePro4p=0;
		  sumpartnz_multip4p=0;
		  sumpartz_multip4p=0;
		  sumassnz_multip4p=0;
		  sumassz_multip4p=0;
		  sumpronz_multip4p=0;
		  sumproz_multip4p=0;
		  iafusump=0;
		  ipart5p=0;
		  iass5p=0;
		  ipro5p=0;
		  nzpart5p=0;
		  nzass5p=0;
		  nzpro5p=0;
		  zpart5p=0;
		  zass5p=0;
		  zpro5p=0;
		  nzsumass5p=0;
		  zsumass5p=0;
		  nzsumpro5p=0;
		  zsumpro5p=0;
		  ConfidencePart5p=0;
		  ConfidenceAss5p=0;
		  ConfidencePro5p=0;
		  sumpartnz_multip5p=0;
		  sumpartz_multip5p=0;
		  sumassnz_multip5p=0;
		  sumassz_multip5p=0;
		  sumpronz_multip5p=0;
		  sumproz_multip5p=0;
		  iovesump=0;
		  ipart6p=0;
		  iass6p=0;
		  ipro6p=0;
		  nzpart6p=0;
		  nzass6p=0;
		  nzpro6p=0;
		  zpart6p=0;
		  zass6p=0;
		  zpro6p=0;
		  nzsumass6p=0;
		  zsumass6p=0;
		  nzsumpro6p=0;
		  zsumpro6p=0;
		  ConfidencePart6p=0;
		  ConfidenceAss6p=0;
		  ConfidencePro6p=0;
		  sumpartnz_multip6p=0;
		  sumpartz_multip6p=0;
		  sumassnz_multip6p=0;
		  sumassz_multip6p=0;
		  sumpronz_multip6p=0;
		  sumproz_multip6p=0;

		 // Materialcases(value);
		    MaterialallVis();
		  //MaterialcasesVis();
		 // Manufacturingcases(value);
		  ManufacturingallVis();
		  //ManufacturingcasesVis();
		 // PTDcases(value);
		  PTDallVis();
		  //PTDcasesVis();
		  //Usagecases(value);
		  UsageallVis();
		  //UsagecasesVis();
		  //Afterusecases(value);
		  AfteruseallVis();
		 // AfterusecasesVis();
		 // Overallcases(value);
		  OverallallVis();
		  //OverallcasesVis();

		 // Materialallp(UID);
		 // MaterialpartVis();
		 // Manufacturingallp(UID);
		 // ManufacturingpartVis();
		 // PTDallp(UID);
		  //PTDpartVis();
		  //Usageallp(UID);
		 // UsagepartVis();
		 // Afteruseallp(UID);
		 // AfterusepartVis();
		 // Overallallp(UID);
		 // OverallpartVis();
		}

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


