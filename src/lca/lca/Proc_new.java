package lca;
import processing.core.*;
import processing.data.Table;
import processing.data.TableRow;
public class Proc_new extends PApplet{
PApplet parent;

/*public Proc_new(PApplet _parent){
	parent = _parent;
}*/

public Proc_new(){}

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
	int pany=-100;
	int sum;
	public float zoom = 1;
	float angle = 0;
	float imp1, imp2, imp3, imp4, imp5, imp6,imp7,imp8, imptotal; 
	float val_conf, imp , pro_multiz = 0 , multiply = 0, pro_multinz = 0 , tot_imp = 0 ;
	float nz = 0 , z = 0 , tot_pro = 0;
	int lcp;
	float mat_conf =0 , man_conf =0, assem_conf =0 , pack_conf =0 , trans_conf =0 , use_conf =0 , after_conf =0 , over_conf =0;


	int cols = 28;
	int cols1 =104;

	//int rows = 55; // Row no 2 to Row no Last... n-1 rows from excel
	int rowc()
	{
	Table table11 = loadTable("C:\\Users\\Nitesh\\Desktop\\boeing 747-8\\Input_original.csv", "header");
	int rowc = table11.getRowCount();
	return rowc;
	}
	int rows = rowc();
	int rowc1()
	{
	Table table11 = loadTable("M:\\templates\\new1.csv", "header");
	int rowc1 = table11.getRowCount();
	return rowc1;
	}
	int rows1 = rowc1();
	

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

/////////////Material Declaration//////////////
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

///////////Manufacturing Declaration//////////////
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
///////////Assembly Declaration//////////////
	//Assembly
	float iassemsum, ipart3, iass3, ipro3;
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
	//Assembly Cases
	float iassemsumc, ipart3c, iass3c, ipro3c;
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
	//Assembly Part
	float iassemsump, ipart3p, iass3p, ipro3p;
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
	
///////////Package Declaration//////////////
	//Package
			float ipacksum, ipart4, iass4, ipro4;
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
			//Package Cases
			float ipacksumc, ipart4c, iass4c, ipro4c;
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
			//Package Parts
			float ipacksump, ipart4p, iass4p, ipro4p;
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

///////////Transport Declaration//////////////
			//Transport
			
			float itranssum, ipart5, iass5, ipro5;
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
			//Transport Cases
			float itranssumc, ipart5c, iass5c, ipro5c;
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
			//Transport Part
			float itranssump, ipart5p, iass5p, ipro5p;
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

///////////Usage Declaration//////////////
			//Usage
			float iusesum, ipart6, iass6, ipro6;
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
			//Usage Cases
			float iusesumc, ipart6c, iass6c, ipro6c;
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
			//Usage Part
			float iusesump, ipart6p, iass6p, ipro6p;
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
///////////AfterUsage Declaration//////////////
			//AfterUsage	
	float iafterusesum, ipart7, iass7, ipro7;
	float nzpart7, nzass7, nzpro7, zpart7, zass7, zpro7;
	float nzsumass7, zsumass7, nzsumpro7, zsumpro7;
	float ConfidencePart7, ConfidenceAss7, ConfidencePro7;
	float[] part_multipnz7= new float[rows+1];
	float[] part_multipz7 = new float[rows+1];
	float[] ass_multipnz7 = new float[rows+1];
	float[] ass_multipz7 = new float[rows+1];
	float[] pro_multipnz7 = new float[rows+1]; 
	float[] pro_multipz7 = new float[rows+1]; 
	float sumpartnz_multip7, sumpartz_multip7, sumassnz_multip7, sumassz_multip7, sumpronz_multip7, sumproz_multip7;
	//AfterUsage Cases
	float iafterusesumc, ipart7c, iass7c, ipro7c;
	float nzpart7c, nzass7c, nzpro7c, zpart7c, zass7c, zpro7c;
	float nzsumass7c, zsumass7c, nzsumpro7c, zsumpro7c;
	float ConfidencePart7c, ConfidenceAss7c, ConfidencePro7c;
	float[] part_multipnz7c= new float[rows+1];
	float[] part_multipz7c = new float[rows+1];
	float[] ass_multipnz7c = new float[rows+1];
	float[] ass_multipz7c = new float[rows+1];
	float[] pro_multipnz7c = new float[rows+1]; 
	float[] pro_multipz7c = new float[rows+1]; 
	float sumpartnz_multip7c, sumpartz_multip7c, sumassnz_multip7c, sumassz_multip7c, sumpronz_multip7c, sumproz_multip7c;
	//AfterUsage Parts
	float iafterusesump, ipart7p, iass7p, ipro7p;
	float nzpart7p, nzass7p, nzpro7p, zpart7p, zass7p, zpro7p;
	float nzsumass7p, zsumass7p, nzsumpro7p, zsumpro7p;
	float ConfidencePart7p, ConfidenceAss7p, ConfidencePro7p;
	float[] part_multipnz7p= new float[rows+1];
	float[] part_multipz7p = new float[rows+1];
	float[] ass_multipnz7p = new float[rows+1];
	float[] ass_multipz7p = new float[rows+1];
	float[] pro_multipnz7p = new float[rows+1]; 
	float[] pro_multipz7p = new float[rows+1]; 
	float sumpartnz_multip7p, sumpartz_multip7p, sumassnz_multip7p, sumassz_multip7p, sumpronz_multip7p, sumproz_multip7p;
	
///////////Overall Declaration//////////////
	//Overall
	float ioversum, ipart8, iass8, ipro8;
	float nzpart8, nzass8, nzpro8, zpart8, zass8, zpro8;
	float nzsumass8, zsumass8, nzsumpro8, zsumpro8;
	float ConfidencePart8, ConfidenceAss8, ConfidencePro8;
	float[] part_multipnz8= new float[rows+1];
	float[] part_multipz8 = new float[rows+1];
	float[] ass_multipnz8 = new float[rows+1];
	float[] ass_multipz8 = new float[rows+1];
	float[] pro_multipnz8 = new float[rows+1]; 
	float[] pro_multipz8 = new float[rows+1]; 
	float sumpartnz_multip8, sumpartz_multip8, sumassnz_multip8, sumassz_multip8, sumpronz_multip8, sumproz_multip8;
	//Overall Cases
	float ioversumc, ipart8c, iass8c, ipro8c;
	float nzpart8c, nzass8c, nzpro8c, zpart8c, zass8c, zpro8c;
	float nzsumass8c, zsumass8c, nzsumpro8c, zsumpro8c;
	float ConfidencePart8c, ConfidenceAss8c, ConfidencePro8c;
	float[] part_multipnz8c= new float[rows+1];
	float[] part_multipz8c = new float[rows+1];
	float[] ass_multipnz8c = new float[rows+1];
	float[] ass_multipz8c = new float[rows+1];
	float[] pro_multipnz8c = new float[rows+1]; 
	float[] pro_multipz8c = new float[rows+1]; 
	float sumpartnz_multip8c, sumpartz_multip8c, sumassnz_multip8c, sumassz_multip8c, sumpronz_multip8c, sumproz_multip8c;
	//Overall
	float ioversump, ipart8p, iass8p, ipro8p;
	float nzpart8p, nzass8p, nzpro8p, zpart8p, zass8p, zpro8p;
	float nzsumass8p, zsumass8p, nzsumpro8p, zsumpro8p;
	float ConfidencePart8p, ConfidenceAss8p, ConfidencePro8p;
	float[] part_multipnz8p= new float[rows+1];
	float[] part_multipz8p = new float[rows+1];
	float[] ass_multipnz8p = new float[rows+1];
	float[] ass_multipz8p = new float[rows+1];
	float[] pro_multipnz8p = new float[rows+1]; 
	float[] pro_multipz8p = new float[rows+1]; 
	float sumpartnz_multip8p, sumpartz_multip8p, sumassnz_multip8p, sumassz_multip8p, sumpronz_multip8p, sumproz_multip8p;
	
		

	
	
	public static void main(String _args[]){
		PApplet.main(new String[]{"lca.Proc_new"});
	}
/*public void settings() {
	  size(1280, 644);
}*/
	 public void setup() {
		
	  size(1400,900);
	 zoom=(float) 3.25;
	  //size(1280, 644);
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
	        loctime[17][j] = (row.getFloat("Impact"));
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
	 //Table table1 = loadTable("C:\\Users\\Nitesh\\Desktop\\Priyal Files\\Code\\proimpact1\\Partprocess.csv", "header");
	  for (int i = 0; i < cols1; i++) {
	    for (int j = 0; j < rows1; j++) {
	      TableRow row1 = table1.getRow(j);
	      if (i==0) {
	        //String[] Partname = table1.getStringColumn("Part_assem_name");
	        Partname[0][j] = row1.getString("Part_assem_name");
	      } else if (i==1)
	      { 
	        pp[1][j] = row1.getFloat("UID");
	      } else if (i==2) {
	        pp[2][j] = row1.getFloat("StatusPP");
	      } /*else if (i==3) {
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
	      }*/
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
	  
	  lcphase();
	}


public void lcphase()
{ 
	mat_conf = confidence(1);
	man_conf = confidence(2);
	assem_conf = confidence(3);
	pack_conf =  confidence(4);
	trans_conf =  confidence(5);
	use_conf =  confidence(6);
	after_conf = confidence(7);
	over_conf = confidence(0);
	//System.out.println(mat_conf);
	 for (int i=0; i<rows; i++)  
	  {
		 if (loctime [21][i] == 1)
		 {
			 imatsum = imatsum + loctime [17][i];
		 }
		 if (loctime [21][i] == 2)
		 {
			 imansum = imansum + loctime [17][i];
		 }
		 if (loctime [21][i] == 3)
		 {
		     iassemsum = iassemsum + loctime [17][i];
		 }
		 if (loctime [21][i] == 4)
		 {   ipacksum = ipacksum + loctime [17][i];}
		 if (loctime [21][i] == 5)
		 {  itranssum = itranssum + loctime [17][i];}
		 if (loctime [21][i] == 6)
		 { iusesum = iusesum + loctime [17][i];}
		 if (loctime [21][i] == 7)
		 {  iafterusesum = iafterusesum + loctime [17][i];}
		 if (loctime [21][i] != 0)
		 { ioversum = ioversum + loctime [17][i];
		 }
		 }
	 //System.out.println(ioversum);
}

	public void MaterialallVis()
	{    
	  rectMode(CORNERS);
	  textSize(3);
	  //fill(40);
	 // ellipse(Vis, Vis-(imatsum/100), Vis+20, Vis);
	 // rect(Vis, Vis-(imatsum/100), Vis+20, Vis );
	  
	if ((imatsum) >=0.3){
	   fill(239,62,52);
	 ellipse(100,20, 10,10);}
	 else if  (((imatsum)>=0.1) && (imatsum)<0.3){
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
	    else if (imatsum == 0)
	    {
	    	stroke(0);
	    	noFill();
	   	 ellipse(100,20, 10,10);
	    }
	    else if ((imatsum/1000)<=0.0002){ 
	   fill(0,173,239);
	 ellipse(100,20, 10,10);}
	 
print(imatsum);
	 // arc(Vis+10, Vis+20, 20, 20, 0, ConfidencePro1*6.2831, PIE);
	  fill(0);
	  text("MATERIAL PHASE", 110,20);
	text("Impact = " + imatsum, 55, 20);
	  text("Confidence =" + mat_conf +" %", 55, 25);
	  }

	public void ManufacturingallVis()
	{    
	  rectMode(CORNERS);
	  textSize(3);
	 if ((imansum)>=0.3){
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
	    else if (imansum == 0)
	    {
	    	stroke(0);
	    	noFill();
	   	 ellipse(100,40, 10,10);
	    }
	    else if ((imansum/1000)<=0.0002){ 
	   fill(0,173,239);
	 ellipse(100,40, 10,10);}
	 
	 
	 // rect(Vis+50, Vis-(imansum/100), Vis+20+50, Vis );
	 
	  //arc(Vis+10+50, Vis+20, 20, 20, 0, ConfidencePro2*6.2831, PIE);
	  fill(0);
	  text("MANUFACTURING PHASE", Vis+10, 40);
	  text("Impact = " + imansum, 55, 40);
	  text("Confidence = " +man_conf + " %", 55 , 45);
	  
	}




	public	void AssemballVis()
	{    
	  rectMode(CORNERS);
	  textSize(3);
	  if ((iassemsum/1000)>=0.3){
	   fill(239,62,52);
	 ellipse(100,60, 10,10);}
	 else if  (((iassemsum/1000)>=0.1) && (iassemsum/1000)<0.3){
	   fill(241,89,40);
	ellipse(100,60, 10,10);}
	  else if  (((iassemsum/1000)>=0.06) && (iassemsum/1000)<0.1){
	   fill(241,89,40);
	ellipse(100,60, 10,10);}
	 else if (((iassemsum/1000)>=0.02) && (iassemsum/1000)<0.03){
	   fill(251,175,63);
	ellipse(100,60, 10,10);}
	    else if (((iassemsum/1000)>=0.01) && (iassemsum/1000)<0.02){
	   fill(247,236,46);
	 ellipse(100,60, 10,10);}
	    else if (((iassemsum/1000)>=0.0004) && (iassemsum/1000)<0.01){
	   fill(214,223,34);
	 ellipse(100,60, 10,10);}
	    else if (((iassemsum/1000)>=0.0003) && (iassemsum/1000)<0.0004){
	   fill(140,198,62);
	ellipse(100,60, 10,10);}
	    else if (((iassemsum/1000)>=0.0002) && (iassemsum/1000)<0.0003){
	   fill(36,181,114);
	ellipse(100,60, 10,10);}
	    else if  (iassemsum == 0){
	 	  stroke(0);	
	 	  noFill();
	 	ellipse(100,60, 10,10);}
	    else if ((iassemsum/1000)<=0.0002){ 
	   fill(0,173,239);
	 ellipse(100,60, 10,10);}
	 // rect(Vis+100, Vis-(iptdsum/100), Vis+20+100, Vis );
	  //arc(Vis+10+100, Vis+20, 20, 20, 0, ConfidencePro3*6.2831, PIE);
	  fill(0);
	  text("ASSEMBLY PHASE", Vis+10, 60);
	  text("Impact = " +iassemsum, 55,60);
	  text("Confidence = " + assem_conf+ " %", 55,65);
	 
	}
	//////////changes Nilakantha //////////////
	public	void PackallVis()
	{    
		rectMode(CORNERS);
		  textSize(3);
		  if ((ipacksum/1000)>=0.3){
		   fill(239,62,52);
		 ellipse(100,80, 10,10);}
		 else if  (((ipacksum/1000)>=0.1) && (ipacksum/1000)<0.3){
		   fill(241,89,40);
		ellipse(100,80, 10,10);}
		  else if  (((ipacksum/1000)>=0.06) && (ipacksum/1000)<0.1){
		   fill(241,89,40);
		ellipse(100,80, 10,10);}
		 else if (((ipacksum/1000)>=0.02) && (ipacksum/1000)<0.03){
		   fill(251,175,63);
		ellipse(100,80, 10,10);}
		    else if (((ipacksum/1000)>=0.01) && (ipacksum/1000)<0.02){
		   fill(247,236,46);
		 ellipse(100,80, 10,10);}
		    else if (((ipacksum/1000)>=0.0004) && (ipacksum/1000)<0.01){
		   fill(214,223,34);
		 ellipse(100,80, 10,10);}
		    else if (((ipacksum/1000)>=0.0003) && (ipacksum/1000)<0.0004){
		   fill(140,198,62);
		ellipse(100,80, 10,10);}
		    else if (((ipacksum/1000)>=0.0002) && (ipacksum/1000)<0.0003){
		   fill(36,181,114);
		ellipse(100,80, 10,10);}
		    else if (ipacksum ==0)
		    {
		    	stroke(0);
		    	noFill();
		    	ellipse(100,80, 10,10);
		    }
		    else if ((ipacksum/1000)<=0.0002){ 
		   fill(0,173,239);
		 ellipse(100,80, 10,10);}
		 // rect(Vis+100, Vis-(ipacksum/100), Vis+20+100, Vis );
		  //arc(Vis+10+100, Vis+20, 20, 20, 0, ConfidencePro3*6.2831, PIE);
		  fill(0);
		  text("PACKAGE PHASE", Vis+10, 80);
		  text("Impact = " +ipacksum/1000, 55,80);
		  text("Confidence = " + pack_conf+ " %", 55,85);
		 
	
		}
	public	void TransallVis()
	{    
		 rectMode(CORNERS);
		  textSize(3);
		  if ((itranssum/1000)>=0.3){
		   fill(239,62,52);
		 ellipse(100,100, 10,10);}
		 else if  (((itranssum/1000)>=0.1) && (itranssum/1000)<0.3){
		   fill(241,89,40);
		ellipse(100,100, 10,10);}
		  else if  (((itranssum/1000)>=0.06) && (itranssum/1000)<0.1){
		   fill(241,89,40);
		ellipse(100,100, 10,10);}
		 else if (((itranssum/1000)>=0.02) && (itranssum/1000)<0.03){
		   fill(251,175,63);
		ellipse(100,100, 10,10);}
		    else if (((itranssum/1000)>=0.01) && (itranssum/1000)<0.02){
		   fill(247,236,46);
		 ellipse(100,100, 10,10);}
		    else if (((itranssum/1000)>=0.0004) && (itranssum/1000)<0.01){
		   fill(214,223,34);
		 ellipse(100,100, 10,10);}
		    else if (((itranssum/1000)>=0.0003) && (itranssum/1000)<0.0004){
		   fill(140,198,62);
		ellipse(100,100, 10,10);}
		    else if (((itranssum/1000)>=0.0002) && (itranssum/1000)<0.0003){
		   fill(36,181,114);
		ellipse(100,100, 10,10);}
		    else if (itranssum ==0)
		    {
		    	stroke(0);
		    	noFill();
		    	ellipse(100,100, 10,10);
		    }
		    else if ((itranssum/1000)<=0.0002){ 
		   fill(0,173,239);
		 ellipse(100,100, 10,10);}
		 // rect(Vis+100, Vis-(idistsum/100), Vis+20+100, Vis );
		  //arc(Vis+10+100, Vis+20, 20, 20, 0, ConfidencePro3*6.2831, PIE);
		  fill(0);
		  text("TRANSPORTATION PHASE", Vis+10, 100);
		  text("Impact = " +itranssum/1000, 55,100);
		  text("Confidence = " + trans_conf+ " %", 55,105);
		 
	}
	
	//////changes Nilakantha eof //////////////
	




	public	void UsageallVis()
	{    
		rectMode(CORNERS);
		  textSize(3);
		  if ((iusesum/1000)>=0.3){
		   fill(239,62,52);
		  ellipse(100,120, 10,10);}
		 else if  (((iusesum/1000)>=0.1) && (iusesum/1000)<0.3){
		   fill(241,89,40);
		 ellipse(100,120, 10,10);}
		  else if  (((iusesum/1000)>=0.06) && (iusesum/1000)<0.1){
		   fill(241,89,40);
		 ellipse(100,120, 10,10);}
		 else if (((iusesum/1000)>=0.02) && (iusesum/1000)<0.03){
		   fill(251,175,63);
		 ellipse(100,120, 10,10);}
		    else if (((iusesum/1000)>=0.01) && (iusesum/1000)<0.02){
		   fill(247,236,46);
		 ellipse(100,120, 10,10);}
		    else if (((iusesum/1000)>=0.0004) && (iusesum/1000)<0.01){
		   fill(214,223,34);
		  ellipse(100,120, 10,10);}
		    else if (((iusesum/1000)>=0.0003) && (iusesum/1000)<0.0004){
		   fill(140,198,62);
		 ellipse(100,120, 10,10);}
		    else if (((iusesum/1000)>=0.0002) && (iusesum/1000)<0.0003){
		   fill(36,181,114);
		 ellipse(100,120, 10,10);}
		    else if (iusesum ==0)
		    {
		    	stroke(0);
		    	noFill();
		    	ellipse(100,120, 10,10);
		    }
		    else if ((iusesum/1000)<=0.0002){ 
		   fill(0,173,239);
		 ellipse(100,120, 10,10);}
		  //rect(Vis+150, Vis-(iusesum/100), Vis+20+150, Vis );
		 // arc(Vis+10+150, Vis+20, 20, 20, 0, ConfidencePro4*6.2831, PIE);
		  fill(0);
		  text("USAGE PHASE", Vis+10, 120);
		  text("Impact = " +iusesum/1000, 55 , 120);
		  text("Confidence = " + use_conf+ " %", 55 , 125);
	  
	}





	public void AfteruseallVis()
	{    
	  rectMode(CORNERS);
	  textSize(3);
	   if ((iafterusesum/1000)>=0.3){
	   fill(239,62,52);
	 ellipse(100,140, 10,10);}
	 else if  (((iafterusesum/1000)>=0.1) && (iafterusesum/1000)<0.3){
	   fill(241,89,40);
	   ellipse(100,140, 10,10);}
	  else if  (((iafterusesum/1000)>=0.06) && (iafterusesum/1000)<0.1){
	   fill(241,89,40);
	   ellipse(100,140, 10,10);}
	 else if (((iafterusesum/1000)>=0.02) && (iafterusesum/1000)<0.03){
	   fill(251,175,63);
	   ellipse(100,140, 10,10);}
	    else if (((iafterusesum/1000)>=0.01) && (iafterusesum/1000)<0.02){
	   fill(247,236,46);
	   ellipse(100,140, 10,10);}
	    else if (((iafterusesum/1000)>=0.0004) && (iafterusesum/1000)<0.01){
	   fill(214,223,34);
	   ellipse(100,140, 10,10);}
	    else if (((iafterusesum/1000)>=0.0003) && (iafterusesum/1000)<0.0004){
	   fill(140,198,62);
	   ellipse(100,140, 10,10);}
	    else if (((iafterusesum/1000)>=0.0002) && (iafterusesum/1000)<0.0003){
	   fill(36,181,114);
	   ellipse(100,140, 10,10);}
	    else if (iafterusesum == 0){
	 	  noFill();
	 	  stroke(0);
	 	   ellipse(100,140, 10,10);}
	    else if ((iafterusesum/1000)<=0.0002){ 
	   fill(0,173,239);
	   ellipse(100,140, 10,10);}
	 // rect(Vis+200, Vis-(iafusum/100), Vis+20+200, Vis );
	 // arc(Vis+10+200, Vis+20, 20, 20, 0, ConfidencePro5*6.2831, PIE);
	  fill(0);
	  text("AFTERUSE PHASE", Vis+10, 140);
	  text("Impact = " +iafterusesum/1000, 55,140);
	  text("Confidence = " +after_conf+ " %", 55,145);
	  
	 
	}


	public	void OverallVis()
	{    
		rectMode(CORNERS);
		  textSize(3);
		  if ((ioversum)>=0.3){
		    	 fill(239,62,52);
		    	 ellipse(205,100, 10,10);}
			 else if  (((ioversum/1000)>=0.1) && (ioversum/1000)<0.3){
			   fill(241,89,40);
			ellipse(205,100, 10,10);} 
			  else if  (((ioversum/1000)>=0.06) && (ioversum/1000)<0.1){
			   fill(241,89,40);
			ellipse(205,100, 10,10);}
			 else if (((ioversum/1000)>=0.02) && (ioversum/1000)<0.03){
			   fill(251,175,63);
			ellipse(205,100, 10,10);}
			    else if (((ioversum/1000)>=0.01) && (ioversum/1000)<0.02){
			   fill(247,236,46);
			ellipse(205,100, 10,10);}
			    else if (((ioversum/1000)>=0.0004) && (ioversum/1000)<0.01){
			   fill(214,223,34);
			ellipse(205,100, 10,10);}
			    else if (((ioversum/1000)>=0.0003) && (ioversum/1000)<0.0004){
			   fill(140,198,62);
			 ellipse(205,100, 10,10);}
			    else if (((ioversum/1000)>=0.0002) && (ioversum/1000)<0.0003){
			   fill(36,181,114);
			ellipse(205,100, 10,10);}
			    else if ((ioversum/1000)<=0.0002){ 
			   fill(0,173,239);
			 ellipse(205,100, 10,10);}
			  //rect(Vis+250, Vis-(ioversum/100), Vis+20+250, Vis );
			 // arc(Vis+10+250, Vis+20, 20, 20, 0, ConfidencePro6*6.2831, PIE);
			  fill(0);
			  text("OVERALL", 211, 97);
			  text("Impact = " +ioversum, 213,102);
			  text("Confidence = " +over_conf+ " %", 211,107);
		 
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
	  stroke((float)1.5);
	  strokeWeight((float)0.5);
	 rectMode(CORNERS);
	  textSize(2);
	  
	  fill(46,49,146);
	  rect(200,15,210,20 );
	  
	  fill(26,117,188);
	  rect(200,25,210,20 );
	  
	fill(0,173,239);
	rect(200,30,210,25);
	
	fill(7,167,157);
	rect(200,35,210,30);
	
	fill(36,181,114);
	rect(200,40,210,35);
	
	fill(140,198,62);
	rect(200,45,210,40);
	
	fill(214,223,34);
	rect(200,50,210,45);
	
	fill(247,236,46);
	rect(200,55,210,50);
	
	fill(251,175,63);
	rect(200,60,210,55);
	
	fill(247,146,28);
	rect(200,65,210,60);
	
	fill(241,89,40);
	rect(200,70,210,65);
	
	fill(239,62,52);
	rect(200,75,210,70);
	
	

	stroke(0);
	textSize(3);

	fill(0);
//	text("0.3" , Vis + 92 , 75);
	
	text ("0.0008 ", Vis + 115, 20);
	text ("0.0006 to 0.0008", Vis + 115, 25);
	  text ("0.0004 to 0.0006",Vis + 115, 30);
	  text ("0.0001 to 0.0004",Vis + 115, 35);
	  text ("0.0004 to 0.02", Vis + 115, 40);
	  text ("0.02 to 0.04", Vis + 115, 45);
	  text ("0.04 to 0.06", Vis + 115, 50);
	  text ("0.06 to 0.1", Vis + 115, 55);
	  text ("0.1 to 0.3", Vis + 115, 60);
	  text ("0.3 to 0.5", Vis + 115, 65);
	  text ("0.5 to 0.3", Vis + 115, 70);
	  text("0.5",  Vis + 115 , 75);
	stroke(0);
	strokeWeight(1);

	line(100,25, 100,35);
	line(100,45, 100,55);
	line(100,65, 100,75);
	line(100,85, 100,95);
	line(100,105, 100,115);
	line(100,125, 100,135);
	//line(100,145, 100,165);

	 
	strokeWeight(1);
	stroke(0);
	////material case
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
	 
	  ////manufacturing case
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
	  
	  ////Assembly case
	  iassemsumc=0;
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
	  
	  ////Package case
	  ipacksumc=0;
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
	  ////Transport case
	  itranssumc=0;
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
	  ////Usage case
	  iusesumc=0;
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
	  //AfterUseall case
	  iafterusesumc=0;
	  ipart7c=0;
	  iass7c=0;
	  ipro7c=0;
	  nzpart7c=0;
	  nzass7c=0;
	  nzpro7c=0;
	  zpart7c=0;
	  zass7c=0;
	  zpro7c=0;
	  nzsumass7c=0;
	  zsumass7c=0;
	  nzsumpro7c=0;
	  zsumpro7c=0;
	  ConfidencePart7c=0;
	  ConfidenceAss7c=0;
	  ConfidencePro7c=0;
	  sumpartnz_multip7c=0;
	  sumpartz_multip7c=0;
	  sumassnz_multip7c=0;
	  sumassz_multip7c=0;
	  sumpronz_multip7c=0;
	  sumproz_multip7c=0;
	  
	  ////Overall case
	  ioversumc=0;
	  ipart8c=0;
	  iass8c=0;
	  ipro8c=0;
	  nzpart8c=0;
	  nzass8c=0;
	  nzpro8c=0;
	  zpart8c=0;
	  zass8c=0;
	  zpro8c=0;
	  nzsumass8c=0;
	  zsumass8c=0;
	  nzsumpro8c=0;
	  zsumpro8c=0;
	  ConfidencePart8c=0;
	  ConfidenceAss8c=0;
	  ConfidencePro8c=0;
	  sumpartnz_multip8c=0;
	  sumpartz_multip8c=0;
	  sumassnz_multip8c=0;
	  sumassz_multip8c=0;
	  sumpronz_multip8c=0;
	  sumproz_multip8c=0;

	  ////Material Parts
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
	  
	  ////Manufacturing Parts
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
	  
	  ////Assembly Parts
	  iassemsump=0;
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
	//Package Parts
	  ipacksump=0;
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
	//Transport Parts
	  itranssump=0;
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
	  ////Usage Parts
	  iusesump=0;
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
	  
	  ////AfterUse Parts
	  iafterusesump=0;
	  ipart7p=0;
	  iass7p=0;
	  ipro7p=0;
	  nzpart7p=0;
	  nzass7p=0;
	  nzpro7p=0;
	  zpart7p=0;
	  zass7p=0;
	  zpro7p=0;
	  nzsumass7p=0;
	  zsumass7p=0;
	  nzsumpro7p=0;
	  zsumpro7p=0;
	  ConfidencePart7p=0;
	  ConfidenceAss7p=0;
	  ConfidencePro7p=0;
	  sumpartnz_multip7p=0;
	  sumpartz_multip7p=0;
	  sumassnz_multip7p=0;
	  sumassz_multip7p=0;
	  sumpronz_multip7p=0;
	  sumproz_multip7p=0;
	  
	  ////Overall Parts
	  ioversump=0;
	  ipart8p=0;
	  iass8p=0;
	  ipro8p=0;
	  nzpart8p=0;
	  nzass8p=0;
	  nzpro8p=0;
	  zpart8p=0;
	  zass8p=0;
	  zpro8p=0;
	  nzsumass8p=0;
	  zsumass8p=0;
	  nzsumpro8p=0;
	  zsumpro8p=0;
	  ConfidencePart8p=0;
	  ConfidenceAss8p=0;
	  ConfidencePro8p=0;
	  sumpartnz_multip8p=0;
	  sumpartz_multip8p=0;
	  sumassnz_multip8p=0;
	  sumassz_multip8p=0;
	  sumpronz_multip8p=0;
	  sumproz_multip8p=0;

	  MaterialallVis();
	  ManufacturingallVis();
	  AssemballVis();
	  PackallVis();
	  TransallVis();
	  UsageallVis();
	  AfteruseallVis();
	  OverallVis();
	}
	public float confidence(int lcp)
	{
		
		  for (int i=0; i<rows; i++)  
		  {
			  if ( loctime[21][i] == lcp)
			  {
			  if (loctime[17][i] == 0)
			  {
				  z++;
				  pro_multiz= pro_multiz + loctime[22][i];
				    }
			  else {
				 nz++; 
				 multiply = loctime[17][i]*loctime[22][i];
				 pro_multinz = pro_multinz + multiply;
			  }
			  tot_imp = tot_imp + loctime[17][i];
			  tot_pro = nz + z;
			 // System.out.println("______________________________");
			 System.out.println(loctime[22][i]);	
			 /* System.out.println("______________________________");
			System.out.println( pro_multinz[i] +  "   " +  i);*/
			
			  }
			  }
			  
		System.out.println("______________________________");
		System.out.println( pro_multiz +  "  total confidence" );	
		System.out.println( pro_multinz +  " summation of vi * ci" );
		System.out.println( tot_imp +  "  total imp" );	
		System.out.println( tot_pro +  "  total pro" );	
		//val_conf= ((nz /tot_pro ) * ( pro_multinz / tot_imp )) + ((z /tot_pro) * (pro_multiz/ z));
		if (z!=0)
		val_conf= ((nz /tot_pro ) * ( pro_multinz / tot_imp )) + ((z /tot_pro) * (pro_multiz/ z));
		else
			val_conf= ((nz /tot_pro ) * ( pro_multinz / tot_imp ));
		
		  System.out.println(nz);
		System.out.println(z);
		System.out.println(val_conf);
		if (Float.isNaN(val_conf)) {
			val_conf = 0;
		}
		return val_conf;
		
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


