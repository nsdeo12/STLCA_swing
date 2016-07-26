package lca;
import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PShape;
import processing.data.Table;
import processing.data.TableRow;

public class Dynmaps10 extends PApplet{
PApplet parent;
	
	public static void main(String _args[]){
		
		PApplet.main(new String[]{"--present", "lca.Dynmaps10"});
		/*main mn = new main();
		String st = mn.getname();
		System.out.print(st);*/
	}
int xmap; 
float resetxfloat = (float) 1000.000;
boolean abutton = false;
boolean bbutton = false;
boolean buttonmach = false;
boolean buttonman = false;
int dzoom = 40;
int space = 0;
PShape symtruck;
PShape symman;
PShape symmach;
float newxloc = 0;
float newyloc = 0;
PImage bg;
PImage img, imgleft, imgright, imgempty;
int value = 0;
float xo;
float yo;
int panx;
int pany;
float zoom = 1;
float angle = 0;
float a, b, c, d;
int rl10, gl10, bl10, rl12, gl12, bl12, rl14, gl14, bl14, rl16, gl16, bl16, rl17, gl17, bl17;
String pr, su;
int cols = 29;
int id ;
float last_duration;
float ipart6, ipart6c;
float iovesum, iass6, ipro6;
float nzpart6, nzass6, nzpro6, zpart6, zass6, zpro6;
float nzsumass6, zsumass6, nzsumpro6, zsumpro6;
float ConfidencePart6, ConfidenceAss6, ConfidencePro6 = 0;
float iovesumc, iass6c, ipro6c;
float nzpart6c, nzass6c, nzpro6c, zpart6c, zass6c, zpro6c;
float nzsumass6c, zsumass6c, nzsumpro6c, zsumpro6c;
float ConfidencePart6c, ConfidenceAss6c, ConfidencePro6c;


float val_conf, imp , pro_multiz = 0 , multiply = 0, pro_multinz = 0 , tot_imp = 0 ;
float nz = 0 , z = 0 , tot_pro =0;
float val_conf_sp;

float sumpartnz_multip6c, sumpartz_multip6c, sumassnz_multip6c, sumassz_multip6c, sumpronz_multip6c, sumproz_multip6c;


int rowc()
{
Table table1 = loadTable("C:\\Users\\Nitesh\\Desktop\\boeing 747-8\\Input_original.csv", "header");
	//Table table1 = loadTable("M:\\templates\\Input.csv", "header");
int rowc = table1.getRowCount();
return rowc;
}
int rows = rowc();
//int rows = 55; //(from 45)// Row no 2 to Row no Last... n-1 rows from excel
float[] part_multipnz6c= new float[rows+1];
float[] part_multipz6c = new float[rows+1];
float[] ass_multipnz6c = new float[rows+1];
float[] ass_multipz6c = new float[rows+1];
float[] pro_multipnz6c = new float[rows+1]; 
float[] pro_multipz6c = new float[rows+1]; 

float[] part_multipnz6= new float[rows+1];
float[] part_multipz6 = new float[rows+1];
float[] ass_multipnz6 = new float[rows+1];
float[] ass_multipz6 = new float[rows+1];
float[] pro_multipnz6 = new float[rows+1]; 
float[] pro_multipz6 = new float[rows+1]; 
float sumpartnz_multip6, sumpartz_multip6, sumassnz_multip6, sumassz_multip6, sumpronz_multip6, sumproz_multip6;

float[][] loctime = new float[cols+1][rows+1];
float[][] xloctime = new float[cols+1][rows+1];
float[][] yloctime = new float[cols+1][rows+1];
float[][] zloctime = new float[cols+1][rows+1];
float[][] latloctime = new float[cols+1][rows+1];
float[][] lonloctime = new float[cols+1][rows+1];
float[][] newlonloctime = new float[cols+1][rows+1];

String [][] pro = new String[1][rows+1];
//Overall and Location Impacts
//float[] pro_multinz = new float[rows+1]; 
//float[] pro_multiz = new float[rows+1];

public void setup() {

  size(1280, 644);
  img = loadImage("Mapp.png");
  imgleft = loadImage("Mappleft.png");
  imgright = loadImage("Mappright.png");
  imgempty = loadImage("Mappempty.png");
  symtruck=loadShape("symtruck.svg");
  symman=loadShape("symman.svg");
  symmach=loadShape("symgear.svg");
  xo = width/2;
  yo = height/2;
  //bg = loadImage("Map.jpg"); 
Table table = loadTable("C:\\Users\\Nitesh\\Desktop\\boeing 747-8\\Input_original.csv", "header");
 //Table table = loadTable("M:\\templates\\Input.csv", "header");
  //String[] Process = table.getStringColumn("Process Name");
  for (int i = 0; i < cols; i++) {
    for (int j = 0; j < rows; j++) {
      TableRow row = table.getRow(j);
      if (i==0) {
        loctime[0][j] = row.getFloat("Longitude_start");
      } else if (i==1) { 
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
        loctime[10][j] =row.getFloat("GI_imp");
      } else if (i==11) {
        loctime[11][j] = row.getFloat("LI_rec");
      } else if (i==12) {
        loctime[12][j] =row.getFloat("LI_imp");
      } else if (i==13) {
        loctime[13][j] = row.getFloat("GO_emi");
      } else if (i==14) {
        loctime[14][j] = row.getFloat("GO_imp");
      } else if (i==15) {
        loctime[15][j] = row.getFloat("LO_emi");
      } else if (i==16) {
        loctime[16][j] = row.getFloat("LO_imp");
      } else if (i==17) {
        loctime[17][j] = row.getFloat("Impact");
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
      }
      else if (i==28) {
          pro[0][j] = row.getString("Process_name");
        }
    }
  }
  smooth();
/*  boolean sorted=false;
  do {
    sorted=true;
    for (int index=1; index<rows; index++) { 
      // SORTING ARRAY
      if (loctime[0][index]>loctime[0][index+1]) {  
        float case0 = loctime[0][index];
        float case1 = loctime[1][index];
        float case2 = loctime[2][index];
        float case3 = loctime[3][index];
        float case4 = loctime[4][index];
        float case5 = loctime[5][index]; 
        float case6 = loctime[6][index]; 
        float case7 = loctime[7][index]; 
        float case8 = loctime[8][index]; 
        float case9 = loctime[9][index]; 
        float case10 = loctime[10][index]; 
        float case11 = loctime[11][index]; 
        float case12 = loctime[12][index]; 
        float case13 = loctime[13][index]; 
        float case14 = loctime[14][index]; 
        float case15 = loctime[15][index]; 
        float case16 = loctime[16][index]; 
        float case17 = loctime[17][index]; 
        float case18 = loctime[18][index]; 
        float case19 = loctime[19][index]; 
        float case20 = loctime[20][index];
        float case21 = loctime[21][index];
        float case22 = loctime[22][index];
        float case23 = loctime[23][index];
        float case24 = loctime[24][index];
        float case25 = loctime[25][index];
        float case26 = loctime[26][index];
        for (int i=0; i<cols; i++) {
          loctime[i][index]=loctime[i][index+1];
        }
        loctime[0][index+1]=case0;
        loctime[1][index+1]=case1;
        loctime[2][index+1]=case2;
        loctime[3][index+1]=case3;
        loctime[4][index+1]=case4;
        loctime[5][index+1]=case5;
        loctime[6][index+1]=case6;
        loctime[7][index+1]=case7;
        loctime[8][index+1]=case8;
        loctime[9][index+1]=case9;
        loctime[10][index+1]=case10;
        loctime[11][index+1]=case11;
        loctime[12][index+1]=case12;
        loctime[13][index+1]=case13;
        loctime[14][index+1]=case14;
        loctime[15][index+1]=case15;
        loctime[16][index+1]=case16;
        loctime[17][index+1]=case17;
        loctime[18][index+1]=case18;
        loctime[19][index+1]=case19;
        loctime[21][index+1]=case21;
        loctime[22][index+1]=case22;
        loctime[23][index+1]=case23;
        loctime[24][index+1]=case24;
        loctime[25][index+1]=case25;
        loctime[26][index+1]=case26;
        sorted=false;
      }
    }
  
  }
  // K1; SORTING & ASSIGNING FROM ZERO; in xloctime[] yloctime[]
  while (sorted==false);*/
  int assign = 30;
  
  for (int k1=0; k1<rows; k1++) {
	 
    xloctime[0][k1]=assign;
    yloctime[0][k1]=loctime[2][k1];
	 
    /*if (loctime[0][k1]-loctime[0][k1+1]==0 ) { //If next space not equal to the current then x-coordiante + 20 
        assign = assign;
      }
      	
      	assign = assign+20;
      	
        space++;
      	
      }*/
    
    if (loctime[0][k1] != loctime[0][k1+1] || loctime[1][k1]!=loctime[1][k1+1] && loctime[0][k1] !=0 && loctime[1][k1] !=0 ) {
    	
    	assign = assign+30;
    	
      space++;
    	
    }
    /*else if (loctime[1][k1] == loctime[1][k1+1] && loctime[0][k1]!=loctime[0][k1+1])
    {
    	assign = assign+30;
    	System.out.println("Here");
    }*/
    /*else if (loctime[1][k1]-loctime[1][k1+1] !=0  ) {
    	assign = assign+30;
    	
        space++;
    }*/
/*else if (loctime[1][k1]!=loctime[1][k1+1] ) {
    	
    	assign = assign+30;
    	
      space++;
    	
    }*/
  }
  System.out.println(" number of rows: " + rows);
  System.out.println(" number of space locations : " + space);
  for (int k1=0; k1<rows; k1++) {
	  System.out.println(loctime[0][k1] +"     " + k1);
	  System.out.println(loctime[1][k1] +"     " + k1);
	  System.out.println(loctime[2][k1] +"     " + k1);
  }
  // K2; INDEXING ARRAY IS TO BE DONE BASED ON LONGITUDE
  for (int k2=0; k2<rows; k2++) {
    if (loctime[1][k2] == loctime[1][k2+1] && loctime[0][k2]!=loctime[0][k2+1] /*loctime[1][k2]-loctime[1][k2+1]==0*/)// if space same
    {
      xloctime[0][k2+1]=xloctime[0][k2];
      yloctime[0][k2+1]=loctime[2][k2+1];
    }
  }
  
   last_duration = findlargest();
  System.out.println("Last duration ........................................................" + last_duration);
  Overallall();
  confidence();
 
  /*for ( int i =1; i< space ; i++)
  {
	  int l = 30 * i;
	  if (xloctime[0][i]==l)
	  {
		  c++;
	  }
	  if(c>2)
	  {
		  Overallcases(l);  
	  }
  //Overallcases(l);
  //Overallcases(30);
  //Overallcases(l+60);
	  }
  }*/
}


     

    public float findlargest() {
        float largest = Integer.MIN_VALUE;
        for(int i =0;i<rows;i++) {
           if(loctime[2][i]> largest) {
                largest = loctime[2][i];
            }
        }
       System.out.println("Largest number in array is : " +largest);
		return largest;
    }



public void draw() {
  translate (panx, pany);
  scale (zoom);
  rotate (angle);
  fill(value);
  //background(bg);
  background(255);

  image(img, xmap, -600);
  /*image(imgright, 1000+xmap, -600);
  image(imgleft, -1000+xmap, -600);
  image(imgempty, -1000, -600);  
  image(imgempty, 1000, -600);*/

  ellipse(-10, -10, 10, 10);
  fill(255);
  ellipse(-10, -10, 5, 5);  
  strokeWeight(2);
  fill(0);
  textSize(25);
  text ("SPACE ---> ", 100, -70);
  textAlign( LEFT) ;
  rotate(-HALF_PI);
  text (" <--- TIME ", -250, -30);
  rotate(HALF_PI);
  textSize(7);
  textAlign( CENTER) ;
  strokeWeight((float) 0.1); 
  stroke(0); 
  // LABEL
 /* text("S1", 20, -5);
  text("S2", 40, -5);
  text("S3", 60, -5);
  text("S4", 80, -5);
  text("S5", 100, -5);
  text("S6", 120, -5);
  text("S7", 140, -5);
  text("S8", 160, -5);
  text("S9", 180, -5);
  text("S10", 200, -5);*/
  for (int sp = 1 ; sp<space +1 ; sp ++)
  {
	  text("S" + sp  , sp * 30 , -5);  
	  //text( loctime [0][sp] +"    " + loctime [1][sp] , sp * 50 , 5);  
  }
  text("T1", -12, 22);
  text("T2", -12, 42);
  text("T3", -12, 62);
  text("T4", -12, 82);
  text("T5", -12, 102);
  text("T6", -12, 122);
  text("T7", -12, 142);
  text("T8", -12, 162);
  text("T9", -12, 182);
  text("T10", -12, 202);
  text("T11", -12, 222);
  text("T12", -12, 242);
  text("T13", -12, 262);
  text("T14", -12, 282);
  text("T15", -12, 302);
  text("T16", -12, 322);
  text("T17", -12, 342);
  text("T18", -12, 362);
  text("T19", -12, 382);
  text("T20", -12, 402);
  text("T21", -12, 422);
  text("T22", -12, 442);
  text("T23", -12, 462);
  text("T24", -12, 482);
  text("T25", -12, 502);
  text("T26", -12, 522);
  text("T27", -12, 542);
  text("T28", -12, 562);
  text("T29", -12, 582);
  text("T30", -12, 602);
  text("T31", -12, 622);
  text("T32", -12, 642);
  text("T33", -12, 662);
  text("T34", -12, 682);
  text("T35", -12, 702);
  textSize(10);
  stroke(0);
  strokeWeight(2);
  // LON LAT TIMEY TIMEDUR GI GO LI LO PROCESS REC EMIT GINGO?
  // 00  10  20    30      40 50 60 70 80      90  100  110
  // 01
  // 02
  // 03

  // GRIDS
  stroke(0);
  strokeWeight(2);
  line(0, 0, ((space*100)-500), 0);  //X axis
  line(0, 0, 0, ((space*100)+300));  //Y axis
  stroke(205);
  strokeWeight((float) 0.1);
  for (int gv=0; gv<((space*100) + 300); gv=gv+10) {
    line(0, gv, ((space*100)-500), gv);                //Grid Where 1000 there  a variable with duration summation
  }
  for (int gh=0; gh<((space*100)-500); gh=gh+10) {
    line(gh, 0, gh,((space*100)+300));                //Grid
  }

  for (int km=0; km<rows; km++)  
  {
    if (loctime[0][km]<0) {
      lonloctime[0][km]=(float) (xmap+ 500+(2.777777*loctime[0][km]));
    } else {
      lonloctime[0][km]=(float) (-xmap + 500+(2.777777*loctime[0][km]));
    }
    if (loctime[1][km]<0) {
      latloctime[0][km]= (float) (-350-(2.777777*loctime[1][km]));
    } else {
      latloctime[0][km]= (float) (-350-(2.777777*loctime[1][km]));
    }

    // Adding or subracting for dynamic maps
    if (lonloctime[0][km]>resetxfloat)
    { 
      newlonloctime[0][km]=(float) (-1000.0+ lonloctime[0][km]);
    } else if (lonloctime[0][km]<0)
    { 
      newlonloctime[0][km]=(float) (1000.0+ lonloctime[0][km]);
    } else
    { 
      newlonloctime[0][km] = lonloctime[0][km];
    }

    strokeWeight(6);
    //point(newlonloctime[0][km], latloctime[0][km]);
    point(lonloctime[0][km], latloctime[0][km]);
    strokeWeight(1);
    stroke(100);  
    line(newlonloctime[0][km], latloctime[0][km], newlonloctime[0][km], (xloctime[0][km]/5)-100);
    //Vertical map line from map (This was for above code)
    line(xloctime[0][km], 0, xloctime[0][km], (xloctime[0][km]/5)-100);                          
    //Vertical map line from chart
    line(xloctime[0][km], (xloctime[0][km]/5)-100, newlonloctime[0][km], (xloctime[0][km]/5)-100);    
    //Horizontal map line
    //text(loctime[8][km]+5, lonloctime[0][km]-10, latloctime[0][km]);
    
  }

  // K3; TRANLATING LOCATION SLANT LINE TO DESIRED; HORIZONTAL LINES FULL TILL X0
  // COLORING THE PROCESS LINES BASED ON IMPACT VALUES
  // BASED ON RECEIVING AND EMITTING 
  for (int k3=0; k3<rows; k3++)     // For translating location from k3 to the PROJECTED 
    //PARTS (REQUIRED, DESIRED) followed by HORIZONTAL LINES
  {  
    {
      // COLORING 
      if ( loctime[10][k3]>=1 && loctime[10][k3]<4)
      {
        rl10=46;        
        gl10=48;        
        bl10=146;
      } else if ( loctime[10][k3]>=4 && loctime[10][k3]<200)
      {
        gl10=117;        
        rl10=27;        
        bl10=187;
      } else if ( loctime[10][k3]>=200 && loctime[10][k3]<400)
      {
        rl10=140;        
        gl10=198;        
        bl10=62;
      } else if ( loctime[10][k3]>=400 && loctime[10][k3]<600)
      {
        rl10=248;        
        gl10=237;        
        bl10=49;
      } else if ( loctime[10][k3]>=600 && loctime[10][k3]<1000)
      {
        rl10=240;        
        gl10=90;        
        bl10=40;
      } else if ( loctime[10][k3]>=1000 && loctime[10][k3]<3000)
      {
        rl10=239;        
        gl10=64;        
        bl10=54;
      }
      if ( loctime[12][k3]>=1 && loctime[12][k3]<4)
      {
        rl12=46;        
        gl12=48;        
        bl12=146;
      } else if ( loctime[12][k3]>=4 && loctime[12][k3]<200)
      {
        rl12=27;        
        gl12=117;        
        bl12=187;
      } else if ( loctime[12][k3]>=200 && loctime[12][k3]<400)
      {
        rl12=140;        
        gl12=198;        
        bl12=62;
      } else if ( loctime[12][k3]>=400 && loctime[12][k3]<600)
      {
        rl12=248;        
        gl12=237;        
        bl12=49;
      } else if ( loctime[12][k3]>=600 && loctime[12][k3]<1000)
      {
        rl12=240;        
        gl12=90;        
        bl12=40;
      } else if ( loctime[12][k3]>=1000 && loctime[12][k3]<3000)
      {
        rl12=239;        
        gl12=64;        
        bl12=54;
      }
      if ( loctime[14][k3]>=1 && loctime[14][k3]<4)
      {
        rl14=46;        
        gl14=48;        
        bl14=146;
      } else if ( loctime[14][k3]>=4 && loctime[14][k3]<200)
      {
        rl14=27;        
        gl14=117;        
        bl14=187;
      } else if ( loctime[14][k3]>=200 && loctime[14][k3]<400)
      {
        rl14=140;        
        gl14=198;        
        bl14=62;
      } else if ( loctime[14][k3]>=400 && loctime[14][k3]<600)
      {
        rl14=248;        
        gl14=237;        
        bl14=49;
      } else if ( loctime[14][k3]>=600 && loctime[14][k3]<1000)
      {
        rl14=240;        
        gl14=90;        
        bl14=40;
      } else if ( loctime[14][k3]>=1000 && loctime[14][k3]<3000)
      {
        rl14=239;        
        gl14=64;        
        bl14=54;
      }
      if ( loctime[16][k3]>=1 && loctime[16][k3]<4)
      {
        rl16=46;        
        gl16=48;        
        bl16=146;
      } else if ( loctime[16][k3]>=4 && loctime[16][k3]<200)
      {
        rl16=27;        
        gl16=117;        
        bl16=187;
      } else if ( loctime[16][k3]>=200 && loctime[16][k3]<400)
      {
        rl16=140;        
        gl16=198;        
        bl16=62;
      } else if ( loctime[16][k3]>=400 && loctime[16][k3]<600)
      {
        rl16=248;        
        gl16=237;        
        bl16=49;
      } else if ( loctime[16][k3]>=600 && loctime[16][k3]<1000)
      {
        rl16=240;        
        gl16=90;        
        bl16=40;
      } else if ( loctime[16][k3]>=1000 && loctime[16][k3]<3000)
      {
        rl16=239;        
        gl16=64;        
        bl16=54;
      }
    } 
    // NOW THE TRANSLATION OCCURS
    if (loctime[9][k3]==1 && loctime[11][k3]==0 && loctime[13][k3]==0 && loctime[15][k3]==0) //GI 
    {  
      shape(symtruck, xloctime[0][k3]-20, yloctime[0][k3]-10, 20, 10);
      strokeWeight((float) 1.5); 
      stroke(rl10, gl10, bl10);
    // line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]-15, yloctime[0][k3]-15); 
      strokeWeight((float) 0.1); 
      //line(xloctime[0][k3]-15, yloctime[0][k3]-15, 0, yloctime[0][k3]-15); //Horizontalline
    } else if (loctime[9][k3]==0 && loctime[11][k3]==0 && loctime[13][k3]==1 && loctime[15][k3]==0) //GO
    {
      strokeWeight((float) 1.5); 
      stroke(rl14, gl14, bl14);
    //  line(xloctime[0][k3], yloctime[0][k3]+20, xloctime[0][k3]+15, yloctime[0][k3]+35);
      stroke(0);
    } else if (loctime[9][k3]==0 && loctime[11][k3]==1 && loctime[13][k3]==0 && loctime[15][k3]==0) //LI
    {
      strokeWeight((float) 1.5); 
      stroke(rl12, gl12, bl12);
     // line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]+10, yloctime[0][k3]-10);
      stroke(0);
    } else if (loctime[9][k3]==0 && loctime[11][k3]==0 && loctime[13][k3]==0 && loctime[15][k3]==1) //LO
    {
      strokeWeight((float) 1.5); 
      stroke(rl16, gl16, bl16);
    //  line(xloctime[0][k3], yloctime[0][k3]+20, xloctime[0][k3]-10, yloctime[0][k3]+30);
      stroke(0);
    } else if (loctime[9][k3]==1 && loctime[11][k3]==0 && loctime[13][k3]==1 && loctime[15][k3]==0)//GI & GO
    {  
      shape(symtruck, xloctime[0][k3]-20, yloctime[0][k3]-10, 20, 10);
      strokeWeight((float) 0.1); 
      //line(xloctime[0][k3]-15, yloctime[0][k3]-15, 0, yloctime[0][k3]-15); //Horizontalline    
      strokeWeight((float) 1.5); 
      stroke(rl10, gl10, bl10);
      //line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]-15, yloctime[0][k3]-15);
      stroke(rl14, gl14, bl14);
     // line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]+20, yloctime[0][k3]+20);
      stroke(0);
    } else if (loctime[9][k3]==1 && loctime[11][k3]==1 && loctime[13][k3]==0 && loctime[15][k3]==0)//GI & LI
    {
      shape(symtruck, xloctime[0][k3]-20, yloctime[0][k3]-10, 20, 10);
      strokeWeight((float) 0.1); 
      //line(xloctime[0][k3]-15, yloctime[0][k3]-15, 0, yloctime[0][k3]-15); //Horizontalline   
      strokeWeight((float) 1.5); 
      stroke(rl10, gl10, bl10);
      //line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]-15, yloctime[0][k3]-15);
      stroke(rl12, gl12, bl12);
     // line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]+10, yloctime[0][k3]-10);
      stroke(0);
    } else if (loctime[9][k3]==1 && loctime[11][k3]==0 && loctime[13][k3]==0 && loctime[15][k3]==1)//GI & LO
    {
      shape(symtruck, xloctime[0][k3]-20, yloctime[0][k3]-10, 20, 10);
      strokeWeight((float) 0.1); 
     // line(xloctime[0][k3]-15, yloctime[0][k3]-15, 0, yloctime[0][k3]-15); //Horizontalline   
      strokeWeight((float) 1.5); 
      stroke(rl10, gl10, bl10);
     // line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]-15, yloctime[0][k3]-15);
      stroke(rl16, gl16, bl16);
      //line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]-10, yloctime[0][k3]+10);
      stroke(0);
    } else if (loctime[9][k3]==0 && loctime[11][k3]==1 && loctime[13][k3]==1 && loctime[15][k3]==0)//LI & GO
    {      
      strokeWeight((float) 1.5); 
      stroke(rl12, gl12, bl12);
     // line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]+10, yloctime[0][k3]+10);
      stroke(rl14, gl14, bl14);
     // line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]+20, yloctime[0][k3]-20);
      stroke(0);
    } else if (loctime[9][k3]==0 && loctime[11][k3]==0 && loctime[13][k3]==1 && loctime[15][k3]==1)//GO & LO
    {      
      strokeWeight((float) 1.5);
      stroke(rl14, gl14, bl14);
      //line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]+20, yloctime[0][k3]+20); 
      stroke(rl16, gl16, bl16);
      //line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]-10, yloctime[0][k3]+10);
      stroke(0);
    } else if (loctime[9][k3]==0 && loctime[11][k3]==1 && loctime[13][k3]==0 && loctime[15][k3]==1)//LI & LO
    {      
      strokeWeight((float) 1.5); 
      stroke(rl12, gl12, bl12);
     // line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]+10, yloctime[0][k3]-10);
      stroke(rl16, gl16, bl16);
     // line(xloctime[0][k3], yloctime[0][k3]+20, xloctime[0][k3]-10, yloctime[0][k3]+30);
      stroke(0);
    }
  }

  // K4; ERASING HORIZONTAL LINES
  // BASED ON GI GO LI LO
  for (int k4=0; k4<rows; k4++)  //Horizontal line in white for erasing HORIZONTALLINES
  {  
    if (loctime[4][k4]==1 || loctime[5][k4]==1 && loctime[18][k4]==0)  //GI or LI
    {  
      strokeWeight(1); 
      stroke(255); 
  //    line((float) (xloctime[0][k4]-0.5), yloctime[0][k4]+5, 0, yloctime[0][k4]+5);
      //textSize(5);
      //text("Process", xloctime[0][k4]-25, yloctime[0][k4]);
      //text(loctime[8][k4], xloctime[0][k4]-10, yloctime[0][k4]);
      strokeWeight((float) 0.1); 
      stroke(0);
    }
    if (loctime[18][k4]==1) //erasing horizontal line from vertical point end
    {
      strokeWeight(1); 
      stroke(255); 
    //  line((float) (xloctime[0][k4]+14.5), yloctime[0][k4]+10, 0, yloctime[0][k4]+10); 
      strokeWeight((float) 0.1); 
      stroke(0);
    }
  }
  strokeWeight((float) 0.1);

  // K3; TRANLATING LOCATION SLANT LINE TO DESIRED; HORIZONTAL LINES FULL TILL X0
  // Almost the same as the previous k3, but written after k4 once again so that White breaks 
  // due to horizontal lines in k4 are replaced. Ideally this new k3 should not be there
  // COLORING THE PROCESS LINES BASED ON IMPACT VALUES
  // BASED ON RECEIVING AND EMITTING 
  for (int k3=0; k3<rows; k3++)     // For translating location from k3 to the PROJECTED 
    //PARTS (REQUIRED, DESIRED) followed by HORIZONTAL LINES
  {  
	  {
      // COLORING 
      if ( loctime[10][k3]>=1 && loctime[10][k3]<4)
      {
        rl10=46;        
        gl10=48;        
        bl10=146;
      } else if ( loctime[10][k3]>=4 && loctime[10][k3]<200)
      {
        rl10=27;        
        gl10=117;        
        bl10=187;
      } else if ( loctime[10][k3]>=200 && loctime[10][k3]<400)
      {
        rl10=140;        
        gl10=198;        
        bl10=62;
      } else if ( loctime[10][k3]>=400 && loctime[10][k3]<600)
      {
        rl10=248;        
        gl10=237;        
        bl10=49;
      } else if ( loctime[10][k3]>=600 && loctime[10][k3]<1000)
      {
        rl10=240;        
        gl10=90;        
        bl10=40;
      } else if ( loctime[10][k3]>=1000 && loctime[10][k3]<3000)
      {
        rl10=239;        
        gl10=64;        
        bl10=54;
      }
      if ( loctime[12][k3]>=1 && loctime[12][k3]<4)
      {
        rl12=46;        
        gl12=48;        
        bl12=146;
      } else if ( loctime[12][k3]>=4 && loctime[12][k3]<200)
      {
        rl12=27;        
        gl12=117;        
        bl12=187;
      } else if ( loctime[12][k3]>=200 && loctime[12][k3]<400)
      {
        rl12=140;        
        gl12=198;        
        bl12=62;
      } else if ( loctime[12][k3]>=400 && loctime[12][k3]<600)
      {
        rl12=248;        
        gl12=237;        
        bl12=49;
      } else if ( loctime[12][k3]>=600 && loctime[12][k3]<1000)
      {
        rl12=240;        
        gl12=90;        
        bl12=40;
      } else if ( loctime[12][k3]>=1000 && loctime[12][k3]<3000)
      {
        rl12=239;        
        gl12=64;        
        bl12=54;
      }
      if ( loctime[14][k3]>=1 && loctime[14][k3]<4)
      {
        rl14=46;        
        gl14=48;        
        bl14=146;
      } else if ( loctime[14][k3]>=4 && loctime[14][k3]<200)
      {
        rl14=27;        
        gl14=117;        
        bl14=187;
      } else if ( loctime[14][k3]>=200 && loctime[14][k3]<400)
      {
        rl14=140;        
        gl14=198;        
        bl14=62;
      } else if ( loctime[14][k3]>=400 && loctime[14][k3]<600)
      {
        rl14=248;        
        gl14=237;        
        bl14=49;
      } else if ( loctime[14][k3]>=600 && loctime[14][k3]<1000)
      {
        rl14=240;        
        gl14=90;        
        bl14=40;
      } else if ( loctime[14][k3]>=1000 && loctime[14][k3]<3000)
      {
        rl14=239;        
        gl14=64;        
        bl14=54;
      }
      if ( loctime[16][k3]>=0.02 && loctime[16][k3]<0.0007)
      {
        rl16=46;        
        gl16=48;        
        bl16=146;
      } else if ( loctime[16][k3]>=4 && loctime[16][k3]<200)
      {
        rl16=27;        
        gl16=117;        
        bl16=187;
      } else if ( loctime[16][k3]>=200 && loctime[16][k3]<400)
      {
        rl16=140;        
        gl16=198;        
        bl16=62;
      } else if ( loctime[16][k3]>=400 && loctime[16][k3]<600)
      {
        rl16=248;        
        gl16=237;        
        bl16=49;
      } else if ( loctime[16][k3]>=600 && loctime[16][k3]<1000)
      {
        rl16=240;        
        gl16=90;        
        bl16=40;
      } else if ( loctime[16][k3]>=1000 && loctime[16][k3]<3000)
      {
        rl16=239;        
        gl16=64;        
        bl16=54;
      }
    } 
    // NOW THE TRANSLATION OCCURS
    if (loctime[9][k3]==1 && loctime[11][k3]==0 && loctime[13][k3]==0 && loctime[15][k3]==0) //GI 
    {  
      //shape(symtruck, xloctime[0][k3]-20, yloctime[0][k3]-10, 20, 10);
      strokeWeight((float) 1.5); 
      stroke(rl10, gl10, bl10);
    //  line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]-15, yloctime[0][k3]-15); 
      strokeWeight((float) 0.1); 
      //line(xloctime[0][k3]-15, yloctime[0][k3]-15, 0, yloctime[0][k3]-15); //Horizontalline
    } else if (loctime[9][k3]==0 && loctime[11][k3]==0 && loctime[13][k3]==1 && loctime[15][k3]==0) //GO
    {
      strokeWeight((float) 1.5); 
      stroke(rl14, gl14, bl14);
     // line(xloctime[0][k3], yloctime[0][k3]+20, xloctime[0][k3]+15, yloctime[0][k3]+35);
      stroke(0);
    } else if (loctime[9][k3]==0 && loctime[11][k3]==1 && loctime[13][k3]==0 && loctime[15][k3]==0) //LI
    {
      strokeWeight((float) 1.5); 
      stroke(rl12, gl12, bl12);
      line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]+10, yloctime[0][k3]-10);
      stroke(0);
    } else if (loctime[9][k3]==0 && loctime[11][k3]==0 && loctime[13][k3]==0 && loctime[15][k3]==1) //LO
    {
      strokeWeight((float) 1.5); 
      stroke(rl16, gl16, bl16);
     // line(xloctime[0][k3], yloctime[0][k3]+20, xloctime[0][k3]-10, yloctime[0][k3]+30);
      stroke(0);
    } else if (loctime[9][k3]==1 && loctime[11][k3]==0 && loctime[13][k3]==1 && loctime[15][k3]==0)//GI & GO
    {  
      shape(symtruck, xloctime[0][k3]-20, yloctime[0][k3]-10, 20, 10);
      strokeWeight((float) 0.1); 
    //  line(xloctime[0][k3]-15, yloctime[0][k3]-15, 0, yloctime[0][k3]-15); //Horizontalline    
      strokeWeight((float) 1.5); 
      stroke(rl10, gl10, bl10);
     // line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]-15, yloctime[0][k3]-15);//gin slant
      stroke(rl14, gl14, bl14);
      //line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]+20, yloctime[0][k3]+20);//Gout slant line
      stroke(0);
    } else if (loctime[9][k3]==1 && loctime[11][k3]==1 && loctime[13][k3]==0 && loctime[15][k3]==0)//GI & LI
    {
      shape(symtruck, xloctime[0][k3]-20, yloctime[0][k3]-10, 20, 10);
      strokeWeight((float) 0.1); 
      strokeWeight((float) 1.5); 
      stroke(rl10, gl10, bl10);
     // line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]-15, yloctime[0][k3]-15);
      stroke(rl12, gl12, bl12);
     // line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]+10, yloctime[0][k3]-10);
      stroke(0);
    } else if (loctime[9][k3]==1 && loctime[11][k3]==0 && loctime[13][k3]==0 && loctime[15][k3]==1)//GI & LO
    {
      shape(symtruck, xloctime[0][k3]-20, yloctime[0][k3]-10, 20, 10);
      strokeWeight((float) 0.1); 
      strokeWeight((float) 1.5); 
      stroke(rl10, gl10, bl10);
    //  line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]-15, yloctime[0][k3]-15);
      stroke(rl16, gl16, bl16);
   //   line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]-10, yloctime[0][k3]+10);
      fill(0, 0, 0); //Red
      ellipse(xloctime[0][k3]-10, yloctime[0][k3]+10, 4, 4); 
      fill(255, 0, 0); //Red
      ellipse(xloctime[0][k3]-10, yloctime[0][k3]+10, 3, 3); 
      stroke(0);
    } else if (loctime[9][k3]==0 && loctime[11][k3]==1 && loctime[13][k3]==1 && loctime[15][k3]==0)//LI & GO
    {      
      strokeWeight((float) 1.5); 
      stroke(rl12, gl12, bl12);
     // line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]+10, yloctime[0][k3]+10);
      stroke(rl14, gl14, bl14);
    //  line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]+20, yloctime[0][k3]-20);
      stroke(0);
    } else if (loctime[9][k3]==0 && loctime[11][k3]==0 && loctime[13][k3]==1 && loctime[15][k3]==1)//GO & LO
    {      
      strokeWeight((float) 1.5);
      stroke(rl14, gl14, bl14);
      //line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]+20, yloctime[0][k3]+20); 
      stroke(rl16, gl16, bl16);
    //  line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]-10, yloctime[0][k3]+10);
      stroke(0);
    } else if (loctime[9][k3]==0 && loctime[11][k3]==1 && loctime[13][k3]==0 && loctime[15][k3]==1)//LI & LO
    {      
      strokeWeight((float) 1.5); 
      stroke(rl12, gl12, bl12);
      //line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]+10, yloctime[0][k3]-10);
      stroke(rl16, gl16, bl16);
      //line(xloctime[0][k3], yloctime[0][k3]+20, xloctime[0][k3]-10, yloctime[0][k3]+30);
      //stroke(0);
    }
  }

  // K5; VERTICAL LINES ON DESIRED
  // BASED ON GI GO LI LO  
  strokeWeight((float) 0.6);
/*  for (int k5=0; k5<rows; k5++)      // For positioning location exactly on the 
    //longitude where they belong,followed by VERTICAL LINES
  {  //stroke(0,255,0);
	// line(xloctime[0][k5], yloctime[0][k5], xloctime[0][k5], yloctime[0][k5]+20); 
	  
	  if (loctime[4][k5]==1 && loctime[18][k5]==1) //GI
    { text(loctime[8][k5], xloctime[0][k5]-5, yloctime[0][k5]);
   // stroke(0,0,255);
     // line(xloctime[0][k5]-20, yloctime[0][k5], xloctime[0][k5]-20, 0);
    } else if (loctime[5][k5]==1) //GO
    {
      stroke(0);      
      strokeWeight((float) 0.1);
    } else if (loctime[6][k5]==1) //LI
    {
    } else if (loctime[7][k5]==1) //LO
    {
    } else if (loctime[18][k5]==1) //GoGinCombo
    {  
      line(xloctime[0][k5]+15, yloctime[0][k5]+10, xloctime[0][k5]+15, 0);         
      //Vertical from top to gingo combo
    } else
    {
      strokeWeight((float) 1.5);  
      stroke(0); 

      if ( loctime[17][k5]>=1 && loctime[17][k5]<4)
      {
        rl17=46;        
        gl17=48;        
        bl17=146;
      } else if ( loctime[17][k5]>=4 && loctime[17][k5]<200)
      {
        rl17=27;        
        gl17=117;        
        bl17=187;
      } else if ( loctime[17][k5]>=200 && loctime[17][k5]<400)
      {
        rl17=140;        
        gl17=198;        
        bl17=62;
      } else if ( loctime[17][k5]>=400 && loctime[17][k5]<600)
      {
        rl17=248;        
        gl17=237;        
        bl17=49;
      } else if ( loctime[17][k5]>=600 && loctime[17][k5]<1000)
      {
        rl17=240;        
        gl17=90;        
        bl17=40;
      } else if ( loctime[17][k5]>=1000 && loctime[17][k5]<3000)
      {
        rl17=239;        
        gl17=64;        
        bl17=54;
      }
     // stroke(rl17, gl17, bl17);
     // stroke(255,0,0);
     line(xloctime[0][k5], yloctime[0][k5], xloctime[0][k5], yloctime[0][k5]+20); 

      if (buttonmach)
      {
        textSize(3);
        text("+", xloctime[0][k5]+7, yloctime[0][k5]+15);
        text("-", xloctime[0][k5]+7, yloctime[0][k5]+18);
        //stroke(0); 
        strokeWeight((float) 0.1);
        if (loctime[20][k5]==1) //Image
        { 
          shape(symmach, xloctime[0][k5]+2, yloctime[0][k5]+5, 15, 7);
        }
        if (loctime[20][k5]==2) //Image
        { 
          shape(symmach, xloctime[0][k5]+2, yloctime[0][k5]+5, 15, 7);
          shape(symmach, xloctime[0][k5]+7, yloctime[0][k5]+5, 15, 7);
        }
        if (loctime[20][k5]==3) //Image
        { 
          shape(symmach, xloctime[0][k5]+2, yloctime[0][k5]+5, 15, 7);
          shape(symmach, xloctime[0][k5]+7, yloctime[0][k5]+5, 15, 7);
          shape(symmach, xloctime[0][k5]+12, yloctime[0][k5]+5, 15, 7);
        }
      }
      if (buttonman)
      {
        if (loctime[19][k5]==1) //Image
        { 
          shape(symman, xloctime[0][k5]+2, yloctime[0][k5]+10, 15, 7);
        }
        if (loctime[19][k5]==2) //Image
        { 
          shape(symman, xloctime[0][k5]+2, yloctime[0][k5]+10, 15, 7);
          shape(symman, xloctime[0][k5]+7, yloctime[0][k5]+10, 15, 7);
        }
        if (loctime[19][k5]==3) //Image
        { 
          shape(symman, xloctime[0][k5]+2, yloctime[0][k5]+10, 15, 7);
          shape(symman, xloctime[0][k5]+7, yloctime[0][k5]+10, 15, 7);
          shape(symman, xloctime[0][k5]+12, yloctime[0][k5]+10, 15, 7);
        }
      }
    }
  }*/


  // K6; GOGIN ERASE VERTICAL
/*  for (int k6=0; k6<rows; k6++) {             // For erasing Gogin Vertical line 
    if (loctime[5][k6]==1) //GO
    {
    	
     stroke(255, 40,25);
      strokeWeight(1);
      line(xloctime[0][k6]+20, yloctime[0][k6]+15, xloctime[0][k6]+15, 0);
      strokeWeight((float) 0.1);
      stroke(0);
    }
  }*/
  for (int g = 0 ; g<rows ; g++)
  {
	 /* if (loctime[5][g] == 1) //GI
	  {	*/	 
		  if (loctime[24][g] == 0)
		  {
			  int temp_ids = (int) loctime[25][g];
			  for ( int l=0; l <rows; l++ )
			  {
				  if (loctime [8][l] == temp_ids)
				  {
					 // int dur = (int) loctime[3][l];
					  strokeWeight((float) 0.1);
					  stroke(0,0,255);
					  line(xloctime[0][g], yloctime[0][l]-10, xloctime[0][g], 0);
					  line( xloctime[0][l]-10, yloctime[0][l]-10, xloctime[0][g], yloctime[0][l]-10);
				  }
			  }
		  }
			  }
	  
  
  for (int k61=0; k61<rows; k61++) {             // For erasing Gogin Vertical line 
	    if (loctime[9][k61]==1) //GI
	    {
	    	id = (int) loctime [8][k61];
	    	 
	    	for (int j=0; j<rows ; j++)
	    	{
	    		if ( loctime[8][j] == id )
	    		{
	    			  int temp_idp = (int) loctime[24][j];
	    			  
	    		// System.out.println("Id " + id + "IDP  "+ temp_idp );
	    		 for ( int f = 0 ; f<rows; f++)
	    		    {
	    		    	if ( loctime[8][f] == temp_idp && loctime [5][f] == 1 )
	    		    	{
	    		    		//line(xloctime[0][k61]-10, yloctime[0][k61]-10, xloctime[0][k61]-10, 0);
	    		    		int temp_ids = (int) loctime [25][f];
	    		    		//int idp_gin = (int) loctime [24][f];
	    		    		for (int s = 0 ; s<rows ;s++)
	    		    		{
	    		    			if (loctime[8][s] == temp_ids)
	    		    			{
	    		    				int temp_dur = (int) loctime[3][s]; 
	    		    				//line(xloctime[0][f]+ 15, yloctime[0][f] + 15, xloctime[0][s]-15, yloctime[0][s]-15);
	    		    				stroke(255,0,0);
	    		    				strokeWeight((float) 0.1);
	    		    				line (xloctime[0][f]+ 10 , yloctime[0][f] + 10 , xloctime[0][f] + 10  , yloctime[0][s] -10  ); // vertical line from gout to x of gin
	    		    				line (xloctime[0][s] -10, yloctime[0][s] - 10 , xloctime[0][f]+ 10 ,  yloctime[0][s] - 10   );
	    		    			}
	    		    			/*if (idp_gin == 0)
	    		    			{
	    		    				strokeWeight((float) 0.1);
	    		    				stroke(0, 255,0 );
	    		    				line (xloctime[0][s] -10, yloctime[0][s] - 10 , xloctime[0][f]+ 10 ,  0   );
	    		    			}*/
	    		    		}
	    		    		/*if (loctime [5][f] == 1 )
	    		    		{
	    		    			stroke(255, 40,25);
	    		    		
	    		    		System.out.println(" IDS of IDP " + temp_ids);
	    		    		line(xloctime[0][k61]-15, yloctime[0][k61]-15, xloctime[0][k61]-15, 0);
	    		    		}
	    		    		else if(loctime [5][f] != 1 )
	    		    		{
	    		    			stroke(0, 40,255);
	    		    			line(xloctime[0][k61]-15, yloctime[0][k61]-15, xloctime[0][k61]-15, 0);
	    		    		}*/
	    		    	
	    		    	}
	    		    	
	    		    	}
	    		    }
	    	}
	  
	    	}
	   
	     /*stroke(255, 40,25);
	      strokeWeight(1);
	      line(xloctime[0][k61]+20, yloctime[0][k61]+15, xloctime[0][k61]+15, 0);
	      strokeWeight((float) 0.1);
	      stroke(0);*/
	   
	  }
  for (int k63=0; k63<rows; k63++) {             // For erasing Gogin Vertical line 
	    if (loctime[11][k63]==1) //GI
	    {
	    	id = (int) loctime [8][k63];
	    	 
	    	for (int j=0; j<rows ; j++)
	    	{
	    		if ( loctime[8][j] == id )
	    		{
	    			  int temp_idp = (int) loctime[24][j];
	    			  
	    		// System.out.println("Id " + id + "IDP  "+ temp_idp );
	    		 for ( int f = 0 ; f<rows; f++)
	    		    {
	    		    	if ( loctime[8][f] == temp_idp && loctime [7][f] == 1 )
	    		    	{
	    		    		//line(xloctime[0][k61]-10, yloctime[0][k61]-10, xloctime[0][k61]-10, 0);
	    		    		int temp_ids = (int) loctime [25][f];
	    		    		//int idp_gin = (int) loctime [24][f];
	    		    		for (int s = 0 ; s<rows ;s++)
	    		    		{
	    		    			if (loctime[8][s] == temp_ids)
	    		    			{
	    		    				int temp_dur = (int) loctime[3][s]; 
	    		    				//line(xloctime[0][f]+ 15, yloctime[0][f] + 15, xloctime[0][s]-15, yloctime[0][s]-15);
	    		    				stroke(0,255,0);
	    		    				strokeWeight((float) 0.1);
	    		    				line (xloctime[0][f]+ 10 , yloctime[0][f] + 10 , xloctime[0][f] + 10  , yloctime[0][s] -10  ); // vertical line from gout to x of gin
	    		    				line (xloctime[0][s] -10, yloctime[0][s] - 10 , xloctime[0][f]+ 10 ,  yloctime[0][s] - 10   );
	    		    			}
	    		    			/*if (idp_gin == 0)
	    		    			{
	    		    				strokeWeight((float) 0.1);
	    		    				stroke(0, 255,0 );
	    		    				line (xloctime[0][s] -10, yloctime[0][s] - 10 , xloctime[0][f]+ 10 ,  0   );
	    		    			}*/
	    		    		}
	    		    		/*if (loctime [5][f] == 1 )
	    		    		{
	    		    			stroke(255, 40,25);
	    		    		
	    		    		System.out.println(" IDS of IDP " + temp_ids);
	    		    		line(xloctime[0][k61]-15, yloctime[0][k61]-15, xloctime[0][k61]-15, 0);
	    		    		}
	    		    		else if(loctime [5][f] != 1 )
	    		    		{
	    		    			stroke(0, 40,255);
	    		    			line(xloctime[0][k61]-15, yloctime[0][k61]-15, xloctime[0][k61]-15, 0);
	    		    		}*/
	    		    	
	    		    	}
	    		    	
	    		    	}
	    		    }
	    	}
	  
	    	}
	   
	     /*stroke(255, 40,25);
	      strokeWeight(1);
	      line(xloctime[0][k61]+20, yloctime[0][k61]+15, xloctime[0][k61]+15, 0);
	      strokeWeight((float) 0.1);
	      stroke(0);*/
	   
	  }

  for (int k75=0; k75<rows; k75++)     // For Circle Coloring at the translated points
  {
	  fill(255, 165, 0); 
	    if (loctime[9][k75]==1 ) //GI 
	    {   
	    	//text(pro[0][k75], xloctime[0][k75]-5, yloctime[0][k75]);
	    	stroke(239,0,0);
	    strokeWeight((float) 1.5); 
	    stroke(0);
	    
	    line(xloctime[0][k75], yloctime[0][k75], xloctime[0][k75]-10, yloctime[0][k75]-10); //slant line for GIN
	    strokeWeight(1); 
	      fill(0, 0, 0); //Black
	      
	      //ellipse(xloctime[0][k75]-15, yloctime[0][k75]-15, 6, 6); //Circle @ Translated points
	    //  ellipse(xloctime[0][k75], yloctime[0][k75], 6, 6);
	      stroke (0);
	      fill(255, 0, 0); //Red
	      ellipse(xloctime[0][k75]-10, yloctime[0][k75]-10, 5, 5); //Circle @ Translated points
	      fill(255, 165, 0); 
	      line(xloctime[0][k75], yloctime[0][k75], xloctime[0][k75], yloctime[0][k75]+loctime[3][k75]);
	     ellipse(xloctime[0][k75], yloctime[0][k75], 5, 5);
	     ellipse(xloctime[0][k75], yloctime[0][k75]+ loctime[3][k75], 5, 5);
	     // text("Here", xloctime[0][k7]-5, yloctime[0][k7]+loctime[3][k7]);
	    
	    /* ellipse(xloctime[0][k7], yloctime[0][k7]+loctime[3][k7] , 5, 5);
	      ellipse(xloctime[0][k7], yloctime[0][k7]+loctime[3][7], 5, 5);*/
	     //line(xloctime[0][k7]-20, yloctime[0][k7], xloctime[0][k7]-20, 0);
	    }
  }
  for (int k74=0; k74<rows; k74++)     // For Circle Coloring at the translated points
  {
  if (loctime[4][k74]==0 && loctime[5][k74]==0 && loctime[6][k74]==0 && 
	      loctime[7][k74]==0)
{
  fill(0, 0, 255); //Blue
  ellipse(xloctime[0][k74], yloctime[0][k74], 6, 6);
  fill(255, 165, 0); //Blue
 ellipse(xloctime[0][k74], yloctime[0][k74], 5, 5);
  stroke (rl10,gl10,bl10);
  strokeWeight(1);
  stroke(rl10,gl10,bl10);
  line(xloctime[0][k74], yloctime[0][k74], xloctime[0][k74], yloctime[0][k74]+loctime[3][k74]); //new line for process duration
  fill(0);
  textSize(8);
 // text(pro[0][k74], xloctime[0][k74]+8, yloctime[0][k74] + 5);
 ellipse(xloctime[0][k74], yloctime[0][k74]+loctime[3][k74], 5, 5);
  ellipse(xloctime[0][k74], yloctime[0][k74]+loctime[3][k74], 6, 6);
  stroke(0);
  
  
     }
  }
  for (int k71=0; k71<rows; k71++)     // For Circle Coloring at the translated points
  {  
  if ( loctime[13][k71]==1 ) //GO
  { 
	  strokeWeight(1); 
  	// line(xloctime[0][k7], yloctime[0][k71]+ loctime [3][k7], xloctime[0][k71]+20, yloctime[0][k7]+ loctime [3][k71]+ 12);//gout
  //text(pro[0][k71], xloctime[0][k71]-5, yloctime[0][k71]);
   fill(0, 0, 0); 
   line(xloctime[0][k71], yloctime[0][k71], xloctime[0][k71], yloctime[0][k71]+loctime[3][k71]);//straight line for process
//  line(xloctime[0][k7], yloctime[0][k7]+loctime [3][k7], xloctime[0][k7]+15, yloctime[0][k7]+15 + loctime [3][k7]);
  line(xloctime[0][k71], yloctime[0][k71]+ loctime [3][k71], xloctime[0][k71]+10, yloctime[0][k71]+ loctime [3][k71]+ 10);
   fill(255, 0, 0); //Red
    ellipse(xloctime[0][k71]+10, yloctime[0][k71]+10+loctime[3][k71], 5, 5); //slant line for GO
    fill(255, 165, 0); 
    ellipse(xloctime[0][k71], yloctime[0][k71], 5, 5); 
     ellipse(xloctime[0][k71], yloctime[0][k71]+loctime[3][k71], 5, 5);
  }
  }
  
  for (int k72=0; k72<rows; k72++)     // For Circle Coloring at the translated points
  {  
	  if (loctime[11][k72]==1 ) //LI 
	    {  
		  line(xloctime[0][k72], yloctime[0][k72], xloctime[0][k72]+10, yloctime[0][k72]-10); 
	    	//text(pro[0][k72], xloctime[0][k72]-5, yloctime[0][k72]);   
	      fill(0, 0, 0); 
	      ellipse(xloctime[0][k72]+10, yloctime[0][k72]-10, 6, 6); 
	      ellipse(xloctime[0][k72], yloctime[0][k72], 6, 6);

	      fill(255, 165, 0); 
	      ellipse(xloctime[0][k72]+10, yloctime[0][k72]-10, 5, 5); 
	      ellipse(xloctime[0][k72], yloctime[0][k72], 5, 5);
	    }
  }
  
  for (int k73=0; k73<rows; k73++)     // For Circle Coloring at the translated points
  {  
	  if (loctime[9][k73]==0 && loctime[11][k73]==0 && loctime[13][k73]==0 && loctime[15][k73]==1) //LO 
	    {  
	    	  text(pro[0][k73], xloctime[0][k73]-5, yloctime[0][k73]);
	    	  fill(0, 0, 0); //Red
	    	  fill(255, 165, 0); 
	         ellipse(xloctime[0][k73], yloctime[0][k73], 5, 5); 
	          fill(255, 0, 0); //Red
	         ellipse(xloctime[0][k73], yloctime[0][k73]+loctime[3][k73], 5, 5);
	          line(xloctime[0][k73], yloctime[0][k73], xloctime[0][k73], yloctime[0][k73]+loctime[3][k73]);
	    	 line(xloctime[0][k73], yloctime[0][k73]+loctime[3][k73], xloctime[0][k73]-10, yloctime[0][k73]+loctime[3][k73]+10);
	      fill(0, 0, 0); 
	     fill(255,0,0);
	      ellipse(xloctime[0][k73]-10, yloctime[0][k73]+loctime[3][k73]+10, 6, 6); 
	      ellipse(xloctime[0][k73]-10, yloctime[0][k73]+loctime[3][k73]+10, 5, 5);

	      fill(255, 165, 0); 
	     /* fill(0,0,255);
	      ellipse(xloctime[0][k7]-40, yloctime[0][k7]+30, 8, 8); 
	      ellipse(xloctime[0][k7], yloctime[0][k7], 5, 5);*/
	    }
  }
  // K7; COLORING
  // BASED ON EMITTING AND RECEIVING  
 /* for (int k7=0; k7<rows; k7++)     // For Circle Coloring at the translated points
  {  
    fill(255, 165, 0); 
    if (loctime[9][k7]==1 ) //GI 
    {   
    	text(loctime[8][k7], xloctime[0][k7]-5, yloctime[0][k7]);
    	stroke(239,0,0);
    strokeWeight((float) 1.5); 
    stroke(rl10, gl10, bl10);
    line(xloctime[0][k7], yloctime[0][k7], xloctime[0][k7]-15, yloctime[0][k7]-15); //slant line for GIN
    strokeWeight(1); 
      fill(0, 0, 0); //Black
      
      //ellipse(xloctime[0][k7]-15, yloctime[0][k7]-15, 6, 6); //Circle @ Translated points
    //  ellipse(xloctime[0][k7], yloctime[0][k7], 6, 6);
      fill(255, 0, 0); //Red
      ellipse(xloctime[0][k7]-15, yloctime[0][k7]-15, 5, 5); //Circle @ Translated points
      fill(255, 165, 0); 
      line(xloctime[0][k7], yloctime[0][k7], xloctime[0][k7], yloctime[0][k7]+loctime[3][k7]);
     ellipse(xloctime[0][k7], yloctime[0][k7], 5, 5);
     ellipse(xloctime[0][k7], yloctime[0][k7]+ loctime[3][k7], 5, 5);
     // text("Here", xloctime[0][k7]-5, yloctime[0][k7]+loctime[3][k7]);
    
     ellipse(xloctime[0][k7], yloctime[0][k7]+loctime[3][k7] , 5, 5);
      ellipse(xloctime[0][k7], yloctime[0][k7]+loctime[3][7], 5, 5);
     //line(xloctime[0][k7]-20, yloctime[0][k7], xloctime[0][k7]-20, 0);
    } else if ( loctime[13][k7]==1 ) //GO
    { 
    	// line(xloctime[0][k7], yloctime[0][k7]+ loctime [3][k7], xloctime[0][k7]+20, yloctime[0][k7]+ loctime [3][k7]+ 12);//gout
    text(loctime[8][k7], xloctime[0][k7]-5, yloctime[0][k7]);
     fill(0, 0, 0); 
     line(xloctime[0][k7], yloctime[0][k7], xloctime[0][k7], yloctime[0][k7]+loctime[3][k7]);//straight line for process
  //  line(xloctime[0][k7], yloctime[0][k7]+loctime [3][k7], xloctime[0][k7]+15, yloctime[0][k7]+15 + loctime [3][k7]);
    line(xloctime[0][k7], yloctime[0][k7]+ loctime [3][k7], xloctime[0][k7]+20, yloctime[0][k7]+ loctime [3][k7]+ 12);
     fill(255, 0, 0); //Red
      ellipse(xloctime[0][k7]+20, yloctime[0][k7]+12+loctime[3][k7], 5, 5); //slant line for GO
      fill(255, 165, 0); 
      ellipse(xloctime[0][k7], yloctime[0][k7], 5, 5); 
       ellipse(xloctime[0][k7], yloctime[0][k7]+loctime[3][k7], 5, 5);
    } else if (loctime[11][k7]==1 ) //LI 
    {   line(xloctime[0][k7], yloctime[0][k7], xloctime[0][k7]+20, yloctime[0][k7]-15); 
    	text(loctime[8][k7], xloctime[0][k7]-5, yloctime[0][k7]);   
      fill(0, 0, 0); 
      ellipse(xloctime[0][k7]+10, yloctime[0][k7]-10, 6, 6); 
      ellipse(xloctime[0][k7], yloctime[0][k7], 6, 6);

      fill(255, 165, 0); 
      ellipse(xloctime[0][k7]+10, yloctime[0][k7]-10, 5, 5); 
      ellipse(xloctime[0][k7], yloctime[0][k7], 5, 5);
    } else  
      if (loctime[9][k7]==0 && loctime[11][k7]==0 && loctime[13][k7]==0 && loctime[15][k7]==1) //LO 
    {  
    	  text(loctime[8][k7], xloctime[0][k7]-5, yloctime[0][k7]);
    	  fill(0, 0, 0); //Red
    	  fill(255, 165, 0); 
         ellipse(xloctime[0][k7], yloctime[0][k7], 5, 5); 
          fill(255, 0, 0); //Red
         ellipse(xloctime[0][k7], yloctime[0][k7]+loctime[3][k7], 5, 5);
          line(xloctime[0][k7], yloctime[0][k7], xloctime[0][k7], yloctime[0][k7]+loctime[3][k7]);
    	 line(xloctime[0][k7], yloctime[0][k7]+loctime[3][k7], xloctime[0][k7]-10, yloctime[0][k7]+loctime[3][k7]+15);
      fill(0, 0, 0); 
     fill(255,0,0);
      ellipse(xloctime[0][k7]-13, yloctime[0][k7]+loctime[3][k7]+15, 6, 6); 
      ellipse(xloctime[0][k7]-13, yloctime[0][k7]+loctime[3][k7]+15, 5, 5);

      fill(255, 165, 0); 
      fill(0,0,255);
      ellipse(xloctime[0][k7]-40, yloctime[0][k7]+30, 8, 8); 
      ellipse(xloctime[0][k7], yloctime[0][k7], 5, 5);
    } else if (loctime[9][k7]==1 && loctime[11][k7]==0 && loctime[13][k7]==1 && loctime[15][k7]==0)//GI & GO
    {   text(loctime[8][k7], xloctime[0][k7]-5, yloctime[0][k7]);  
    line(xloctime[0][k7], yloctime[0][k7], xloctime[0][k7], yloctime[0][k7]+ loctime[3][k7]);
    line(xloctime[0][k7], yloctime[0][k7], xloctime[0][k7]-15, yloctime[0][k7]-15);//gin
    line(xloctime[0][k7], yloctime[0][k7]+ loctime [3][k7], xloctime[0][k7]+20, yloctime[0][k7]+ loctime [3][k7]+ 12);//gout
      fill(0, 0, 0); //Red
     ellipse(xloctime[0][k7]-15, yloctime[0][k7]-15, 6, 6); 
   
     ellipse(xloctime[0][k7], yloctime[0][k7], 6, 6);         
      fill(255, 0, 0); //Red
    ellipse(xloctime[0][k7]-15, yloctime[0][k7]-15, 5, 5); //gout
      ellipse(xloctime[0][k7]+20, yloctime[0][k7]+ loctime [3][k7]+12, 5, 5); 
      fill(255, 165, 0);
      ellipse(xloctime[0][k7], yloctime[0][k7], 5, 5);
      ellipse(xloctime[0][k7], yloctime[0][k7]+ loctime [3][k7], 5, 5);
      
    } else if (loctime[9][k7]==1 && loctime[11][k7]==1 && loctime[13][k7]==0 && loctime[15][k7]==0)//GI & LI
    { text(loctime[8][k7], xloctime[0][k7]-5, yloctime[0][k7]);
      fill(0, 0, 0); //Red
      ellipse(xloctime[0][k7]-15, yloctime[0][k7]-15, 6, 6); 
      ellipse(xloctime[0][k7]+10, yloctime[0][k7]-10, 6, 6); 
      fill(255, 0, 0); //Red
      ellipse(xloctime[0][k7]-15, yloctime[0][k7]-15, 5, 5); 
      fill(255, 165, 0); 
      ellipse(xloctime[0][k7]+10, yloctime[0][k7]-10, 5, 5); 
      ellipse(xloctime[0][k7], yloctime[0][k7], 5, 5);
    } else if (loctime[9][k7]==1 && loctime[11][k7]==0 && loctime[13][k7]==0 && loctime[15][k7]==1)//GI & LO
    { text(loctime[8][k7], xloctime[0][k7]-5, yloctime[0][k7]);
    	 fill(0, 0, 0); //Red
         ellipse(xloctime[0][k7]-20, yloctime[0][k7]-15, 4, 4); 
         fill(255, 0, 0); //Red
         ellipse(xloctime[0][k7]-20, yloctime[0][k7]-15, 3, 3); 
      fill(0, 0, 0); //Black
      ellipse(xloctime[0][k7]-15, yloctime[0][k7]-15, 6, 6); 
      ellipse(xloctime[0][k7]-10, yloctime[0][k7]+30, 6, 6); 
      ellipse(xloctime[0][k7], yloctime[0][k7], 6, 6);
      fill(255, 0, 0); //Red
      ellipse(xloctime[0][k7]-15, yloctime[0][k7]-15, 5, 5); 
      fill(255, 165, 0); 
      ellipse(xloctime[0][k7]-10, yloctime[0][k7]+30, 5, 5); 
      ellipse(xloctime[0][k7], yloctime[0][k7], 5, 5);
    } else if (loctime[9][k7]==0 && loctime[11][k7]==1 && loctime[13][k7]==1 && loctime[15][k7]==0)//LI & GO
    {    text(loctime[8][k7], xloctime[0][k7]-5, yloctime[0][k7]);   
      fill(0, 0, 0); 
      ellipse(xloctime[0][k7]+10, yloctime[0][k7]-10, 6, 6); 
      ellipse(xloctime[0][k7]+20, yloctime[0][k7]+40, 6, 6); 
      ellipse(xloctime[0][k7], yloctime[0][k7], 6, 6);
      fill(255, 165, 0); 
      ellipse(xloctime[0][k7]+10, yloctime[0][k7]-10, 5, 5); 
      fill(255, 0, 0); 
      ellipse(xloctime[0][k7]+20, yloctime[0][k7]+40, 5, 5); 
      ellipse(xloctime[0][k7], yloctime[0][k7], 5, 5);
    } else if (loctime[9][k7]==0 && loctime[11][k7]==0 && loctime[13][k7]==1 && loctime[15][k7]==1)//L0 & GO
    {  text(loctime[8][k7], xloctime[0][k7]-5, yloctime[0][k7]); 
    	line(xloctime[0][k7]+20, yloctime[0][k7]+20, xloctime[0][k7]-10, yloctime[0][k7]+30);
      fill(0, 0, 0); //Black
      ellipse(xloctime[0][k7]+20, yloctime[0][k7]+40, 6, 6); 
      ellipse(xloctime[0][k7]-10, yloctime[0][k7]+30, 6, 6); 
      ellipse(xloctime[0][k7], yloctime[0][k7], 6, 6);
      fill(255, 0, 0); //Red
      ellipse(xloctime[0][k7]+20, yloctime[0][k7]+40, 5, 5); 
      fill(255, 165, 0); 
      ellipse(xloctime[0][k7]-10, yloctime[0][k7]+30, 5, 5); 
      ellipse(xloctime[0][k7], yloctime[0][k7], 5, 5);
    } else if (loctime[9][k7]==0 && loctime[11][k7]==1 && loctime[13][k7]==0 && loctime[15][k7]==1)//LI & LO
    {    line(xloctime[0][k7], yloctime[0][k7], xloctime[0][k7]+17, yloctime[0][k7]-15);
    	 text(loctime[8][k7], xloctime[0][k7]-5, yloctime[0][k7]);   
         fill(0, 0, 0); 
        // ellipse(xloctime[0][k7]+10, yloctime[0][k7]-10, 6, 6); 
         ellipse(xloctime[0][k7], yloctime[0][k7], 6, 6);

         fill(255, 165, 0); 
         ellipse(xloctime[0][k7]+15, yloctime[0][k7]-15, 5, 5); 
         ellipse(xloctime[0][k7], yloctime[0][k7], 5, 5);
    	text(loctime[8][k7], xloctime[0][k7]-5, yloctime[0][k7]);
  	  fill(0, 0, 0); //Red
  	  fill(255, 165, 0); 
       ellipse(xloctime[0][k7], yloctime[0][k7], 5, 5); 
        fill(255, 0, 0); //Red
       ellipse(xloctime[0][k7], yloctime[0][k7]+loctime[3][k7], 5, 5);
        line(xloctime[0][k7], yloctime[0][k7], xloctime[0][k7], yloctime[0][k7]+loctime[3][k7]);
  	 line(xloctime[0][k7], yloctime[0][k7]+loctime[3][k7], xloctime[0][k7]-10, yloctime[0][k7]+loctime[3][k7]+15);
    fill(0, 0, 0); 
   fill(255,0,0);
    ellipse(xloctime[0][k7]-13, yloctime[0][k7]+loctime[3][k7]+15, 6, 6); 
    ellipse(xloctime[0][k7]-13, yloctime[0][k7]+loctime[3][k7]+15, 5, 5);

    fill(255, 165, 0); 
    	 line(xloctime[0][k7], yloctime[0][k7], xloctime[0][k7]+15, yloctime[0][k7]-15);//lin
    	    line(xloctime[0][k7], yloctime[0][k7]+ loctime [3][k7], xloctime[0][k7], yloctime[0][k7]+ loctime [3][k7]- 12);//lout
    	 text(loctime[8][k7], xloctime[0][k7]-5, yloctime[0][k7]);
      fill(0, 0, 0); 
      ellipse(xloctime[0][k7]+10, yloctime[0][k7]-10, 6, 6); 
      ellipse(xloctime[0][k7]-10, yloctime[0][k7]+30, 6, 6); 
      ellipse(xloctime[0][k7], yloctime[0][k7], 6, 6);
      fill(255, 165, 0); 
      ellipse(xloctime[0][k7]+10, yloctime[0][k7]-10, 5, 5); 
      ellipse(xloctime[0][k7]-10, yloctime[0][k7]+30, 5, 5); 
      ellipse(xloctime[0][k7], yloctime[0][k7], 5, 5);
    } else if (loctime[4][k7]==0 && loctime[5][k7]==0 && loctime[6][k7]==0 && 
      loctime[7][k7]==0&& loctime[9][k7]==0&& loctime[11][k7]==0&& loctime[13][k7]==0&& loctime[15][k7]==0)
    else  if (loctime[4][k7]==0 && loctime[5][k7]==0 && loctime[6][k7]==0 && 
    	      loctime[7][k7]==0)
    {
      fill(0, 0, 255); //Blue
      ellipse(xloctime[0][k7], yloctime[0][k7], 6, 6);
      fill(255, 165, 0); //Blue
     ellipse(xloctime[0][k7], yloctime[0][k7], 5, 5);
      stroke (0,244,0);
      strokeWeight(1);
      line(xloctime[0][k7], yloctime[0][k7], xloctime[0][k7], yloctime[0][k7]+loctime[3][k7]); //new line for process duration
      text(loctime[8][k7], xloctime[0][k7]-5, yloctime[0][k7]);
     ellipse(xloctime[0][k7], yloctime[0][k7]+loctime[3][k7], 5, 5);
      ellipse(xloctime[0][k7], yloctime[0][k7]+loctime[3][k7], 6, 6);
      stroke(0);
         }
  }  */ 

  // K8; ALTERNATE COLORING INFORMATION LABEL
  // BASED ON GI GO LI LO
  if (value==0) {
    for (int k8=0; k8<rows; k8++)  //Text Label
    {       
      if (mouseX/zoom == (panx/zoom)+(abs(xloctime[0][k8]))) {
        if (loctime[4][k8]==1 && loctime[5][k8]==0 && loctime[6][k8]==0 && loctime[7][k8]==0)  //GI
        {
          fill(0, 0, 0);
          textSize(3);
          text("GI", xloctime[0][k8]-15, yloctime[0][k8]);
          text(pro[0][k8], xloctime[0][k8]-5, yloctime[0][k8]);
          text("Time", xloctime[0][k8]-20, yloctime[0][k8]+10);
          text(loctime[2][k8], xloctime[0][k8]-5, yloctime[0][k8]+10);
          text("Longitude", xloctime[0][k8]-20, yloctime[0][k8]+20);
          text(loctime[0][k8], xloctime[0][k8]-5, yloctime[0][k8]+20);
        } else   if (loctime[4][k8]==0 && loctime[5][k8]==1 && loctime[6][k8]==0 && loctime[7][k8]==0)  //GO
        {
          fill(0, 0, 0);
          textSize(3);
          stroke(0);
          text("GO", xloctime[0][k8]+25, yloctime[0][k8]+20);
          text(pro[0][k8], xloctime[0][k8]+35, yloctime[0][k8]+20);
          text("Time", xloctime[0][k8]+25, yloctime[0][k8]+30);
          text(loctime[2][k8], xloctime[0][k8]+35, yloctime[0][k8]+30);
          text("Longitude", xloctime[0][k8]+25, yloctime[0][k8]+40);
          text(loctime[0][k8], xloctime[0][k8]+35, yloctime[0][k8]+40);
        } else   if (loctime[4][k8]==0 && loctime[5][k8]==0 && loctime[6][k8]==1 && loctime[7][k8]==0)  //LI
        {
          fill(0, 0, 0);
          textSize(3);
          text("LI", xloctime[0][k8]+10, yloctime[0][8]+15);
          text(pro[0][k8], xloctime[0][k8]+20, yloctime[0][k8]+15);
          text("Time", xloctime[0][k8]+10, yloctime[0][k8]+25);
          text(loctime[2][k8], xloctime[0][k8]+20, yloctime[0][k8]+25);
          text("Longitude", xloctime[0][k8]+10, yloctime[0][k8]+35);
          text(loctime[0][k8], xloctime[0][k8]+20, yloctime[0][k8]+35);
        } else   if (loctime[4][k8]==0 && loctime[5][k8]==0 && loctime[6][k8]==0 && loctime[7][k8]==1)  //LO
        {
          fill(0, 0, 0);
          textSize(3);
          text("LO", xloctime[0][k8]-20, yloctime[0][k8]);
          text(pro[0][k8], xloctime[0][k8]-10, yloctime[0][k8]);
          text("Time", xloctime[0][k8]-20, yloctime[0][k8]+10);
          text(loctime[2][k8], xloctime[0][k8]-10, yloctime[0][k8]+10);
          text("Longitude", xloctime[0][k8]-20, yloctime[0][k8]+20);
          text(loctime[0][k8], xloctime[0][k8]-10, yloctime[0][k8]+20);
        }
      }
    }
  }
  if (value == 7)
  {
	  for (int k74=0; k74<rows; k74++)     // For Circle Coloring at the translated points
	  {
	  if (loctime[4][k74]==0 && loctime[5][k74]==0 && loctime[6][k74]==0 && 
		      loctime[7][k74]==0)
	{
	  /*fill(0, 0, 255); //Blue
	  ellipse(xloctime[0][k74], yloctime[0][k74], 6, 6);
	  fill(255, 165, 0); //Blue
	 ellipse(xloctime[0][k74], yloctime[0][k74], 5, 5);
	  stroke (rl10,gl10,bl10);
	  strokeWeight(1);
	  stroke(rl10,gl10,bl10);
	  line(xloctime[0][k74], yloctime[0][k74], xloctime[0][k74], yloctime[0][k74]+loctime[3][k74]); //new line for process duration
	  fill(0);*/
	  textSize(8);
	  fill(0);
	  text(pro[0][k74], xloctime[0][k74]+25, yloctime[0][k74] + 15 );
	/* ellipse(xloctime[0][k74], yloctime[0][k74]+loctime[3][k74], 5, 5);
	  ellipse(xloctime[0][k74], yloctime[0][k74]+loctime[3][k74], 6, 6);
	  stroke(0);*/
	  
	  
	     }
	  /*fill(0,255,0);
	  rect(10, 10 ,60,60 , 5);
	  text("GLOBAL IN", 5, -20);*/
  }
  }
  if (value==50) {
    text("GLOBAL IN", 5, -20);
    for (int k8=0; k8<rows; k8++)  //Text Label
    {       
      if (loctime[4][k8]==1 && loctime[5][k8]==0 && loctime[6][k8]==0 && loctime[7][k8]==0)  //GI
      {
        fill(0, 0, 0);
        textSize(3);
        //text("GI", xloctime[0][k8]-15, yloctime[0][k8]);
        text(pro[0][k8], xloctime[0][k8]-5, yloctime[0][k8]);
        text("Time", xloctime[0][k8]-20, yloctime[0][k8]+10);
        text(loctime[2][k8], xloctime[0][k8]-5, yloctime[0][k8]+10);
        text("Longitude", xloctime[0][k8]-20, yloctime[0][k8]+20);
        text(loctime[0][k8], xloctime[0][k8]-5, yloctime[0][k8]+20);
      }
    }
  }
  if (value==100) {
    text("GLOBAL OUT", 5, -20);
    for (int k8=0; k8<rows; k8++)  //Text Label
    {       
      if (loctime[4][k8]==0 && loctime[5][k8]==1 && loctime[6][k8]==0 && loctime[7][k8]==0)  //G0
      {
        fill(0, 0, 0);
        textSize(3);
        //text("GO", xloctime[0][k8]-15, yloctime[0][k8]);
        text(pro[0][k8], xloctime[0][k8]-5, yloctime[0][k8]);
        text("Time", xloctime[0][k8]-20, yloctime[0][k8]+10);
        text(loctime[2][k8], xloctime[0][k8]-5, yloctime[0][k8]+10);
        text("Longitude", xloctime[0][k8]-20, yloctime[0][k8]+20);
        text(loctime[0][k8], xloctime[0][k8]-5, yloctime[0][k8]+20);
      }
    }
  }
  if (value==150) {
    text("LOCAL IN", 5, -20);
    for (int k8=0; k8<rows; k8++)  //Text Label
    {       
      if (loctime[4][k8]==0 && loctime[5][k8]==0 && loctime[6][k8]==1 && loctime[7][k8]==0)  //LI
      {
        fill(0, 0, 0);
        textSize(3);
        // text("LI", xloctime[0][k8]+10, yloctime[0][k8]);
        text(pro[0][k8], xloctime[0][k8]+20, yloctime[0][k8]);
        text("Time", xloctime[0][k8]+10, yloctime[0][k8]+10);
        text(loctime[2][k8], xloctime[0][k8]+20, yloctime[0][k8]+10);
        text("Longitude", xloctime[0][k8]+5, yloctime[0][k8]+20);
        text(loctime[0][k8], xloctime[0][k8]+20, yloctime[0][k8]+20);
      }
    }
  }
  if (value==200) {
    text("LOCAL OUT", 5, -20);
    for (int k8=0; k8<rows; k8++)  //Text Label
    {       
      if (loctime[4][k8]==0 && loctime[5][k8]==0 && loctime[6][k8]==0 && loctime[7][k8]==1)  //LO
      {
        fill(0, 0, 0);
        textSize(3);
        //text("LO", xloctime[0][k8]-15, yloctime[0][k8]);
        text(pro[0][k8], xloctime[0][k8]-10, yloctime[0][k8]);
        text("Time", xloctime[0][k8]-25, yloctime[0][k8]+10);
        text(loctime[2][k8], xloctime[0][k8]-10, yloctime[0][k8]+10);
        text("Longitude", xloctime[0][k8]-25, yloctime[0][k8]+20);
        text(loctime[0][k8], xloctime[0][k8]-10, yloctime[0][k8]+20);
      }
    }
  }
  fill(46,49,146);
  rect((space*100)-400,30,40,15);
  fill(26,117,188);
  rect((space*100)-400,45,40,15);
fill(0,173,239);
rect((space*100)-400,60,40,15);
fill(7,167,157);
rect((space*100)-400,75,40,15);
fill(36,181,114);
rect((space*100)-400,90,40,15);
fill(140,198,62);
rect((space*100)-400,105,40,15);
fill(214,223,34);
rect((space*100)-400,120,40,15);
fill(247,236,46);
rect((space*100)-400,135,40,15);
fill(251,175,63);
rect((space*100)-400,150,40,15);
fill(241,89,40);
rect((space*100)-400,165,40,15);
fill(239,62,52);
rect((space*100)-400,180,40,15);
stroke(0);
textSize(3);
  // COLOR SPECTRUM AND LAYER LABELLING
  fill(0, 0, 0);
  textSize(20);
  // LEFT LABEL
  text ("IMPACT SPECTRUM", (space*100)-350, 10);
  textSize(8);
  text ("            0.0006 to 0.0008", (space*100)-350, 32);
  text ("            0.0004 to 0.0006", (space*100)-350, 47);
  text ("            0.0001 to 0.0004", (space*100)-350, 62);
  text ("        0.0004 to 0.02", (space*100)-350, 77);
  text ("    0.02 to 0.04", (space*100)-350, 92);
  text ("    0.04 to 0.06",(space*100)-350, 107);
  text ("  0.06 to 0.1", (space*100)-350, 122);
  text ("0.1 to 0.3", (space*100)-350, 137);
  text ("0.3 to 0.5",(space*100)-350, 152);
  text ("0.5 to 0.3", (space*100)-350, 167);
  text("0.5", (space*100)-363, 182);
  
  rectMode(CENTER);
  // LAYER LABEL
  fill(0, 0, 0);
  textSize(4);
  text("MACHINES", -180, -85);
  text("PEOPLE INVOLVED", -140, -85);
  textSize(4);
  text("Process Names", -100, -85);
  text("LAYER 4", -60, -85);
 /* textSize(6);
  text("Process Names", -100, -40);*/
 /* fill(255);
  rect(-60, -40, 20, 20, 5);
  */
  fill(255);
  rect(-180, -70, 40, 20, 5);
  shape(symmach, -200, -80, 40, 20);
  fill(255);
  rect(-140, -70, 40, 20, 5);
  shape(symman, -160, -80, 40, 20);
  fill(150);
  rect(-100, -70, 40, 20, 5);
  fill(200);
  rect(-60, -70, 40, 20, 5);
  fill(0);
  /*// CHART LABEL
  fill(46, 48, 146);
  rect(-165, 55, 60, 20, 5);
  fill(27, 117, 187);
  rect(-165, 75, 60, 20, 5);
  fill(140, 198, 62);
  rect(-165, 95, 60, 20, 5);
  fill(248, 237, 49);
  rect(-165, 115, 60, 20, 5);
  fill(240, 90, 40);
  rect(-165, 135, 60, 20, 5);
  fill(239, 64, 54);
  rect(-165, 155, 60, 20, 5);  */

  // GRIDS
  stroke(0);
  strokeWeight(2);
  line(0, 0, 1000, 0);  //X axis
  line(0, 0, 0, 1000);  //Y axis
  stroke(205);
  strokeWeight((float) 0.1);

  if (abutton) {
    fill(50);
    text("One", 15, 7);
    fill(52);
  }

  if (bbutton) {
    fill(53);
    //delay(5000);
    shape(symmach, newxloc, newyloc, 15, 7);
  }
 

 
  //Overallcases(30);
 // Overallcases(60);
  ////Overallcases(80);
  //Overallcases(100);
 // Overallcases(120);
 // Overallcases(140);
 //// Overallcases(160);
 // Overallcases(180);
  //Overallcases(200);
  /*for ( int i =1; i< space ; i++)
  {
	  int l = 30 * i;
 // OverallcasesV(l);
  Overallcases(30);
  Overallcases(l+60);
  }
  OverallallVis();*/
 // OverallcasesVis(check);
  //confidencecases(20);
  OverallallVis();
  //Overallcases();
 // OverallcasesVis();
}

/*void Overallall()
{  //Impact Calc  OVERALL Phase
  for (int i=0; i<rows; i++)  
  {
    if (loctime[21][i]!=0) // OVERALL Phase Impact Calc
    {      
      ipart6=(ipart6+loctime[17][i]/10000); //OVERALL Part Impact
    }
  }
  fill(0);
  textSize(10);
  text("TOTAL IMPACT", 1180,250);

	  text("                 " +ipart6/1000, 1150 ,265);
	 // text("Confidence = " +ConfidencePro6*100+ " %", Vis-10,380);
	  textSize(3);
	 
  text(ipart6, -35, 0);
  ipart6=0;
  textSize(5);
}*/
public float confidencecases(int check)
{
	  for (int i=0; i<rows; i++)  
	  {	  
		      if (xloctime[0][i]==check)
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
	if (z!=0)
	{
	val_conf_sp= ((nz /tot_pro ) * ( pro_multinz / tot_imp )) + ((z /tot_pro) * (pro_multiz / z));
	}
	else
	{
		val_conf_sp= ((nz /tot_pro ) * ( pro_multinz / tot_imp ));
		}
	  System.out.println(nz);
	System.out.println(z);
	System.out.println(val_conf_sp*100);
	return val_conf_sp;
	
}


public float confidence()
{
	  for (int i=0; i<rows; i++)  
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
	  
	System.out.println("______________________________");
	System.out.println( pro_multiz +  "  total confidence" );	
	System.out.println( pro_multinz +  " summation of vi * ci" );
	System.out.println( tot_imp +  "  total imp" );	
	System.out.println( tot_pro +  "  total pro" );	
	//val_conf= ((nz /tot_pro ) * ( pro_multinz / tot_imp )) + ((z /tot_pro) * (pro_multiz / z));
	
	val_conf= ((nz /tot_pro ) * ( pro_multinz / tot_imp )) + ((z /tot_pro) * (pro_multiz / z));
	/*}
	else
	{
		val_conf= ((nz /tot_pro ) * ( pro_multinz / tot_imp ));
		}*/
	  System.out.println(nz);
	System.out.println(z);
	System.out.println(val_conf*100);
	return val_conf;
	
}
public	void OverallallVis()
{    
  //rectMode(CORNERS);
  textSize(3);
  if ((iovesum/1000)>=0.3){
	  
	   fill(239,62,52);
	ellipse(1070,320, 30,30);}
	 else if  (((iovesum/1000)>=0.1) && (iovesum/1000)<0.3){
	   fill(241,89,40);
	ellipse(1070,320, 30,30);}
	  else if  (((iovesum/1000)>=0.06) && (iovesum/1000)<0.1){
	   fill(241,89,40);
	ellipse(1070,320, 30,30);}
	 else if (((iovesum/1000)>=0.02) && (iovesum/1000)<0.03){
	   fill(251,175,63);
	ellipse(1070,320, 30,30);}
	    else if (((iovesum/1000)>=0.01) && (iovesum/1000)<0.02){
	   fill(247,236,46);
	ellipse(1070,320, 30,30);}
	    else if (((iovesum/1000)>=0.0004) && (iovesum/1000)<0.01){
	   fill(214,223,34);
	ellipse(1070,320, 30,30);}
	    else if (((iovesum/1000)>=0.0003) && (iovesum/1000)<0.0004){
	   fill(140,198,62);
	 ellipse(1070,320,30,30);}
	    else if (((iovesum/1000)>=0.0002) && (iovesum/1000)<0.0003){
	   fill(36,181,114);
	ellipse(1070,320, 30,30);}
	    else if ((iovesum/1000)<=0.0002){ 
	   fill(0,173,239);
	 ellipse(1070,320, 30,30);}
  fill(116,76,39);
  //arc(1070, 400, 30, 30, 0, (float)(360 - (ConfidencePro6*6.2831)) , PIE);
     ellipse(1070,400,30,30);
	    fill(0);
	    fill(194,153,106);
    arc(1070, 400, 30, 30, 0, (float) (ConfidencePro6*6.2831) , PIE);
      /* fill(116,76,39);
    //arc(1070, 400, 30, 30, 0, (float)(360 - (ConfidencePro6*6.2831)) , PIE);
       ellipse(1070,400,30,3);*/
    /*(ConfidencePro6*6.2831)*/
  //rect(Vis+250, Vis-(iovesum/100), Vis+20+250, Vis );
 // arc(1150,360, 20, 20, 0, (float) (ConfidencePro6*6.2831), PIE);
  fill(0);
  textSize(14);
 // text("OVERALL", Vis+20, 340);
  text("Impact = " +   iovesum,  1150,300);
 
  text("Confidence = " +ConfidencePro6+ " %", 1150,380);
  textSize(3);
 
}
public	void OverallcasesVis()
{
int check = 0;
  for (int i =1; i<space+1;i++)
{
	check = 30 *i;

Overallcases(check);

	if (ipart6c > 0)
	  {
		  
		    if ((ipart6c/1000)>=0.3){
			     fill(239,62,52);
			ellipse(check,last_duration+325, 10,10);}
			//text(ipart6c, check, 1010);}
			 else if  (((ipart6c/1000)>=0.1) && (ipart6c/1000)<0.3){
			   fill(241,89,40);
			ellipse(check,last_duration+325, 30,30);}
			  else if  (((ipart6c/1000)>=0.06) && (ipart6c/1000)<0.1){
			   fill(241,89,40);
			ellipse(check,1025, 30,30);}
			 else if (((ipart6c/1000)>=0.02) && (ipart6c/1000)<0.03){
			   fill(251,175,63);
			ellipse(check,1025, 30,30);}
			    else if (((ipart6c/1000)>=0.01) && (ipart6c/1000)<0.02){
			   fill(247,236,46);
			ellipse(check,1025, 30,30);}
			    else if (((ipart6c/1000)>=0.0004) && (ipart6c/1000)<0.01){
			   fill(214,223,34);
			ellipse(check,1025, 30,30);}
			    else if (((ipart6c/1000)>=0.0003) && (ipart6c/1000)<0.0004){
			   fill(140,198,62);
			 ellipse(check,1025,15,15);}
			    else if (((ipart6c/1000)>=0.0002) && (ipart6c/1000)<0.0003){
			   fill(36,181,114);
			ellipse(check,1025, 15,15);}
			    else if ((ipart6c/1000)<=0.0002){ 
			   fill(0,173,239);
			 ellipse(check,1025, 15,15);}
	  
	  }
	  
	  fill(0);
	  textSize(12);
	  text(ipart6c, check, 1040);
	  text ( "Impact = " +ipart6c , check, last_duration+300 );
	  System.out.println(ipart6c   +    "check  " + check );
	  fill(194,153,106);
	  arc(check, last_duration+340, 30, 30, 0, (float) (ConfidencePro6c*6.2831) , PIE);
	  fill(0);
	 // ConfidencePro6c = confidencecases(80);
	  text(" Confidence = "+ ConfidencePro6c  + "%" , check, last_duration+320);
	  fill(194,153,106);
	//  arc(160, last_duration+300 , 30, 30, 0, (float) (ConfidencePro6c*6.2831) , PIE);
	  fill(0);
	  //text(""+ 0.3246 * 100 + "%" , 160, 1070);
	 /* fill(116,76,39);
	  arc(check, 1070, 30, 30, 0, (float)(360 - (ConfidencePro6c*6.2831)) , PIE);*/
	 // check = check +20;
	 // ipart6c=0;
  //rectMode(CORNERS);
  /*textSize(3);
  if ((iovesum/1000)>=0.3){
	  
	   fill(239,62,52);
	ellipse(1070,320, 30,30);}
	 else if  (((iovesum/1000)>=0.1) && (iovesum/1000)<0.3){
	   fill(241,89,40);
	ellipse(1070,320, 30,30);}
	  else if  (((iovesum/1000)>=0.06) && (iovesum/1000)<0.1){
	   fill(241,89,40);
	ellipse(1070,320, 30,30);}
	 else if (((iovesum/1000)>=0.02) && (iovesum/1000)<0.03){
	   fill(251,175,63);
	ellipse(1070,320, 30,30);}
	    else if (((iovesum/1000)>=0.01) && (iovesum/1000)<0.02){
	   fill(247,236,46);
	ellipse(1070,320, 30,30);}
	    else if (((iovesum/1000)>=0.0004) && (iovesum/1000)<0.01){
	   fill(214,223,34);
	ellipse(1070,320, 30,30);}
	    else if (((iovesum/1000)>=0.0003) && (iovesum/1000)<0.0004){
	   fill(140,198,62);
	 ellipse(1070,320,30,30);}
	    else if (((iovesum/1000)>=0.0002) && (iovesum/1000)<0.0003){
	   fill(36,181,114);
	ellipse(1070,320, 30,30);}
	    else if ((iovesum/1000)<=0.0002){ 
	   fill(0,173,239);
	 ellipse(1070,320, 30,30);}
  fill(116,76,39);
  //arc(1070, 400, 30, 30, 0, (float)(360 - (ConfidencePro6*6.2831)) , PIE);
     ellipse(1070,400,30,30);
	    fill(0);
	    fill(194,153,106);
    arc(1070, 400, 30, 30, 0, (float) (ConfidencePro6*6.2831) , PIE);
       fill(116,76,39);
    //arc(1070, 400, 30, 30, 0, (float)(360 - (ConfidencePro6*6.2831)) , PIE);
       ellipse(1070,400,30,3);
    (ConfidencePro6*6.2831)
  //rect(Vis+250, Vis-(iovesum/100), Vis+20+250, Vis );
 // arc(1150,360, 20, 20, 0, (float) (ConfidencePro6*6.2831), PIE);
  fill(0);
  textSize(14);
 // text("OVERALL", Vis+20, 340);
  text("Impact = " +   iovesum,  40,1070);
 
  text("Confidence = " +ConfidencePro6c+ " %", 80,1070);
  textSize(3);*/
}
}




public int space_loc(int i)
{
	int l = 0 ;

	 l = 30*i;

	return l;
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
    // iovesum=(ipart6+iass6+ipro6); //OVERALL Sum Impact
      iovesum = iovesum + loctime[17][i];
      System.out.print(iovesum);
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
 // ConfidencePro6 = ((nzsumpro6/(nzsumpro6+zsumpro6))/100*((sumpronz_multip6+sumassnz_multip6+sumpartnz_multip6)/(ipro6+iass6+ipart6))) + ((zsumpro6/(nzsumpro6+zsumpro6))/100*(ipro6+iass6+ipart6/(nzsumpro6+zsumpro6)))/100;
  //println(ConfidencePart6);
  //println(ConfidenceAss6);
  //println(ConfidencePro6);
  
  ConfidencePro6 = confidence();
 
}
void Overallcases(int check)
{ 
	/*int check = 0;
	{  for (int i =0; i<space+1;i++)
	{
		check = space_loc(i);
	}*/
  for (int i=0; i<rows; i++) 
  {
    if (check!=0)
    {
      if (xloctime[0][i]==check)
      { 
        
          ipart6c=ipart6c+(loctime[17][i]); //Case Impact
        
      }
    }
    
  }  
 /* for (int i=0; i<rows; i++)  //
  {    
    if (check!=0) { 
      if (xloctime[0][i]==check)
      { 
        if (loctime[21][i]!=0)   // OVERALL Phase
        {       
          if (loctime[23][i]==1) 
          { 
            if (loctime[17][i]!=0) 
            { 
              part_multipnz6c[i] = loctime[17][i]*loctime[22][i];
            } else {
              part_multipz6c[i] = loctime[17][i];
            }
          }
          if (loctime[23][i]==2) 
          { 
            if (loctime[17][i]!=0) 
            { 
              ass_multipnz6c[i] = loctime[17][i]*loctime[22][i];
            } else {
              ass_multipz6c[i] = loctime[17][i];
            }
          }
          if (loctime[23][i]==3) 
          { 
            if (loctime[17][i]!=0) 
            { 
              pro_multipnz6c[i] = loctime[17][i]*loctime[22][i];
            } else {
              pro_multipz6c[i] = loctime[17][i];
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
        sumpartnz_multip6c += part_multipnz6c[i];
        sumpartz_multip6c += part_multipz6c[i];
        sumassnz_multip6c += ass_multipnz6c[i];
        sumassz_multip6c += ass_multipz6c[i];
        sumpronz_multip6c += pro_multipnz6c[i];
        sumproz_multip6c += pro_multipz6c[i];
      }
    nzsumass6c=nzass6c+nzpart6c;
    zsumass6c=zass6c+zpart6c;
    nzsumpro6c=nzpro6c+nzass6c+nzpart6c;
    zsumpro6c=zpro6c+zass6c+zpart6c;
    ConfidencePart6c = (((nzpart6c/(nzpart6c+zpart6c))*(sumpartnz_multip6c/ipart6c)) + (zpart6c/(nzpart6c+zpart6c))*(ipart6c/(nzpart6c+zpart6c)))/100;
    ConfidenceAss6c = (((nzsumass6c/(nzsumass6c+zsumass6c))*(sumassnz_multip6c/iass6c)) + (zsumass6c/(nzsumass6c+zsumass6c))*(iass6c/(nzsumass6c+zsumass6c)))/100;
    ConfidencePro6c = ((nzsumpro6c/(nzsumpro6c+zsumpro6c))/100*((sumpronz_multip6c+sumassnz_multip6c+sumpartnz_multip6c)/(ipro6c+iass6c+ipart6c))) + ((zsumpro6c/(nzsumpro6c+zsumpro6c))/100*(ipro6c+iass6c+ipart6c/(nzsumpro6c+zsumpro6c)))/100;
   // println(ConfidencePart6c);
    //println(ConfidenceAss6c);
    //println(ConfidencePro6c);
     * 
*/  
  
  ConfidencePro6c = confidencecases(check);
//OverallcasesVis();
 
  fill(0);
  textSize(15);
  
	
  
  
}



public void mousePressed() {
  if ((mouseX-panx)/zoom > -12 && (mouseX-panx)/zoom < -8 && (mouseY-pany)/zoom > -12 && (mouseY-pany)/zoom < -8 && value == 0) {
    value = 50;
  } else if ((mouseX-panx)/zoom > -12 && (mouseX-panx)/zoom < -8 && (mouseY-pany)/zoom > -12 && (mouseY-pany)/zoom < -8 && value == 50) {
    value = 100;
  } else if ((mouseX-panx)/zoom > -12 && (mouseX-panx)/zoom < -8 && (mouseY-pany)/zoom > -12 && (mouseY-pany)/zoom < -8 && value == 100) {
    value = 150;
  } else if ((mouseX-panx)/zoom > -12 && (mouseX-panx)/zoom < -8 && (mouseY-pany)/zoom > -12 && (mouseY-pany)/zoom < -8 && value == 150) {
    value = 200;
  } else {
    value = 0;
  }
  if ((mouseX-panx)/zoom>10 && (mouseY-pany)/zoom>10 && (mouseX-panx)/zoom<20 && (mouseY-pany)/zoom<20) {
    abutton = !abutton;
    fill(50);
  }
   /*if ((mouseX-panx)/zoom>-60 && (mouseY-pany)/zoom>-40 && (mouseX-panx)/zoom<-40 && (mouseY-pany)/zoom<-20){
	    value = 7;
	  }*/
  for (int k5=0; k5<rows; k5++) {  
    if (loctime[4][k5]!=1 && loctime[18][k5]!=1 && loctime[5][k5]!=1 && loctime[6][k5]!=1 && loctime[7][k5]!=1) //Process straight
    {
      if ((mouseX-panx)/zoom > (xloctime[0][k5]+6) && (mouseY-pany)/zoom > (yloctime[0][k5]+13) && (mouseX-panx)/zoom < (xloctime[0][k5]+8) && (mouseY-pany)/zoom < (yloctime[0][k5]+16)) {
        bbutton = !bbutton;
        fill(100);
        if (bbutton) {
          fill(53);
          if (loctime[4][k5]!=1 && loctime[18][k5]!=1 && loctime[5][k5]!=1 && loctime[6][k5]!=1 && loctime[7][k5]!=1) //Process straight
          {
            fill(55);  
            newxloc =   xloctime[0][k5]+7;
            newyloc =   yloctime[0][k5]+5 ; 
            redraw();
          }
        }
      }
    }
  }
  if ((mouseX-panx)/zoom>-200 && (mouseY-pany)/zoom>-80 && (mouseX-panx)/zoom<-160 && (mouseY-pany)/zoom<-60) {
    buttonmach= !buttonmach;
    fill(50);
  }
  if ((mouseX-panx)/zoom>-160 && (mouseY-pany)/zoom>-80 && (mouseX-panx)/zoom<-120 && (mouseY-pany)/zoom<-60) {
    buttonman= !buttonman;
    fill(50);
  }
  if ((mouseX-panx)/zoom>-120 && (mouseY-pany)/zoom>-80 && (mouseX-panx)/zoom<-90 && (mouseY-pany)/zoom<-60) {
	    value =7;
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
  if (key == '+' ) {
    xmap+=2;
  }
  if (key == '-' ) {
    xmap-=2;
  }
}
}


