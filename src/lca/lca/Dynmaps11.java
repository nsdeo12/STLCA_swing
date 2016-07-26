package lca;

import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PShape;
import processing.data.Table;
import processing.data.TableRow;

public class Dynmaps11 extends PApplet {
	public static void main(String _args[]){
		PApplet.main(new String[]{"lca.Dynmaps11"});
	}
int xmap; 
float resetxfloat = (float) 1000.000;
boolean abutton = false;
boolean bbutton = false;
boolean buttonmach = false;
boolean buttonman = false;
int dzoom = 40;
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
int cols = 37;

//int rowc()
//{
//Table table1 = loadTable("Input.csv", "header");
//int rowc = table1.getRowCount();
//return rowc;
//}
//int rows = rowc();
int rows = 55; //(from 45)// Row no 2 to Row no Last... n-1 rows from excel

float[][] loctime = new float[cols+1][rows+1];
float[][] xloctime = new float[cols+1][rows+1];
float[][] yloctime = new float[cols+1][rows+1];
float[][] zloctime = new float[cols+1][rows+1];
float[][] latloctime = new float[cols+1][rows+1];
float[][] lonloctime = new float[cols+1][rows+1];
float[][] newlonloctime = new float[cols+1][rows+1];

//Overall and Location Impacts
float ipart6, ipart6c;

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
  Table table = loadTable("C:\\Users\\Nitesh\\Desktop\\Priyal Files\\Code\\dynmaps11\\Input.csv", "header");
  //String[] Process = table.getStringColumn("Process Name");
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
        loctime[10][j] = 10000*row.getFloat("GI_imp");
      } else if (i==11) {
        loctime[11][j] = row.getFloat("LI_rec");
      } else if (i==12) {
        loctime[12][j] =10000* row.getFloat("LI_imp");
      } else if (i==13) {
        loctime[13][j] = row.getFloat("GO_emi");
      } else if (i==14) {
        loctime[14][j] =10000* row.getFloat("GO_imp");
      } else if (i==15) {
        loctime[15][j] = row.getFloat("LO_emi");
      } else if (i==16) {
        loctime[16][j] =10000* row.getFloat("LO_imp");
      } else if (i==17) {
        loctime[17][j] =10000* row.getFloat("Impact");
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
      } /*else if (i==25) {
        loctime[25][j] = row.getFloat("ConfH");
      } else if (i==26) {
        loctime[26][j] = row.getFloat("Group");
      } else if (i==27) {
        loctime[27][j] = row.getFloat("cat1");
      } else if (i==28) {
        loctime[28][j] = row.getFloat("cat2");
      } else if (i==29) {
        loctime[29][j] = row.getFloat("cat3");
      } else if (i==30) {
        loctime[30][j] = row.getFloat("cat4");
      } else if (i==31) {
        loctime[31][j] = row.getFloat("cat5");
      } else if (i==32) {
        loctime[32][j] = row.getFloat("cat6");
      } else if (i==33) {
        loctime[33][j] = row.getFloat("cat7");
      } else if (i==34) {
        loctime[34][j] = row.getFloat("cat8");
      } else if (i==35) {
        loctime[35][j] = row.getFloat("cat9");
      } else if (i==36) {
        loctime[36][j] = row.getFloat("cat10");
      }*/
    }
  }
  smooth();
  boolean sorted=false;
  do {
    sorted=true;
    for (int index=0; index<rows-1; index++) { 
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
        float case27 = loctime[27][index];
        float case28 = loctime[28][index];
        float case29 = loctime[29][index];
        float case30 = loctime[30][index];
        float case31 = loctime[31][index];
        float case32 = loctime[32][index];
        float case33 = loctime[33][index];
        float case34 = loctime[34][index];
        float case35 = loctime[35][index];
        float case36 = loctime[36][index];
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
        loctime[20][index+1]=case20;
        loctime[21][index+1]=case21;
        loctime[22][index+1]=case22;
        loctime[23][index+1]=case23;
        loctime[24][index+1]=case24;
        loctime[25][index+1]=case25;
        loctime[26][index+1]=case26;
        loctime[27][index+1]=case27;
        loctime[28][index+1]=case28;
        loctime[29][index+1]=case29;
        loctime[30][index+1]=case30;
        loctime[31][index+1]=case31;
        loctime[32][index+1]=case32;
        loctime[33][index+1]=case33;
        loctime[34][index+1]=case34;
        loctime[35][index+1]=case35;
        loctime[36][index+1]=case36;
        sorted=false;
      }
    }
  }

  // K1; SORTING & ASSIGNING FROM ZERO; in xloctime[] yloctime[]
  while (sorted==false);
  int assign = 20;
  for (int k1=0; k1<rows; k1++) {
    xloctime[0][k1]=assign;
    yloctime[0][k1]=loctime[2][k1];
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
    }
  }
  Overallall();
}

public void draw() {
  translate (panx, pany);
  scale (zoom);
  rotate (angle);
  fill(value);
  //background(bg);
  background(255);

  image(img, xmap, -600);
  image(imgright, 1000+xmap, -600);
  image(imgleft, -1000+xmap, -600);
  image(imgempty, -1000, -600);  
  image(imgempty, 1000, -600);

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
  text("S1", 20, -5);
  text("S2", 40, -5);
  text("S3", 60, -5);
  text("S4", 80, -5);
  text("S5", 100, -5);
  text("S6", 120, -5);
  text("S7", 140, -5);
  text("S8", 160, -5);
  text("S9", 180, -5);
  text("S10", 200, -5);
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
  line(0, 0, 1000, 0);  //X axis
  line(0, 0, 0, 1000);  //Y axis
  stroke(205);
  strokeWeight((float) 0.1);
  for (int gv=0; gv<1000; gv=gv+10) {
    line(0, gv, 1000, gv);                //Grid
  }
  for (int gh=0; gh<1000; gh=gh+10) {
    line(gh, 0, gh, 1000);                //Grid
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

    strokeWeight(2);
    point(newlonloctime[0][km], latloctime[0][km]);
    strokeWeight(1);
    stroke(100);  
    line(newlonloctime[0][km], latloctime[0][km], newlonloctime[0][km], (xloctime[0][km]/5)-50);
    //Vertical map line from map (This was for above code)
    line(xloctime[0][km], 0, xloctime[0][km], (xloctime[0][km]/5)-50);                          
    //Vertical map line from chart
    line(xloctime[0][km], (xloctime[0][km]/5)-50, newlonloctime[0][km], (xloctime[0][km]/5)-50);    
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
      line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]-15, yloctime[0][k3]-15); 
      strokeWeight((float) 0.1); 
      line(xloctime[0][k3]-15, yloctime[0][k3]-15, 0, yloctime[0][k3]-15); //Horizontalline
    } else if (loctime[9][k3]==0 && loctime[11][k3]==0 && loctime[13][k3]==1 && loctime[15][k3]==0) //GO
    {
      strokeWeight((float) 1.5); 
      stroke(rl14, gl14, bl14);
      line(xloctime[0][k3], yloctime[0][k3]+20, xloctime[0][k3]+15, yloctime[0][k3]+35);
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
      line(xloctime[0][k3], yloctime[0][k3]+20, xloctime[0][k3]-10, yloctime[0][k3]+30);
      stroke(0);
    } else if (loctime[9][k3]==1 && loctime[11][k3]==0 && loctime[13][k3]==1 && loctime[15][k3]==0)//GI & GO
    {  
      shape(symtruck, xloctime[0][k3]-20, yloctime[0][k3]-10, 20, 10);
      strokeWeight((float) 0.1); 
      line(xloctime[0][k3]-15, yloctime[0][k3]-15, 0, yloctime[0][k3]-15); //Horizontalline    
      strokeWeight((float) 1.5); 
      stroke(rl10, gl10, bl10);
      line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]-15, yloctime[0][k3]-15);
      stroke(rl14, gl14, bl14);
      line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]+20, yloctime[0][k3]+20);
      stroke(0);
    } else if (loctime[9][k3]==1 && loctime[11][k3]==1 && loctime[13][k3]==0 && loctime[15][k3]==0)//GI & LI
    {
      shape(symtruck, xloctime[0][k3]-20, yloctime[0][k3]-10, 20, 10);
      strokeWeight((float) 0.1); 
      line(xloctime[0][k3]-15, yloctime[0][k3]-15, 0, yloctime[0][k3]-15); //Horizontalline   
      strokeWeight((float) 1.5); 
      stroke(rl10, gl10, bl10);
      line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]-15, yloctime[0][k3]-15);
      stroke(rl12, gl12, bl12);
      line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]+10, yloctime[0][k3]-10);
      stroke(0);
    } else if (loctime[9][k3]==1 && loctime[11][k3]==0 && loctime[13][k3]==0 && loctime[15][k3]==1)//GI & LO
    {
      shape(symtruck, xloctime[0][k3]-20, yloctime[0][k3]-10, 20, 10);
      strokeWeight((float) 0.1); 
      line(xloctime[0][k3]-15, yloctime[0][k3]-15, 0, yloctime[0][k3]-15); //Horizontalline   
      strokeWeight((float) 1.5); 
      stroke(rl10, gl10, bl10);
      line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]-15, yloctime[0][k3]-15);
      stroke(rl16, gl16, bl16);
      line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]-10, yloctime[0][k3]+10);
      stroke(0);
    } else if (loctime[9][k3]==0 && loctime[11][k3]==1 && loctime[13][k3]==1 && loctime[15][k3]==0)//LI & GO
    {      
      strokeWeight((float) 1.5); 
      stroke(rl12, gl12, bl12);
      line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]+10, yloctime[0][k3]+10);
      stroke(rl14, gl14, bl14);
      line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]+20, yloctime[0][k3]-20);
      stroke(0);
    } else if (loctime[9][k3]==0 && loctime[11][k3]==0 && loctime[13][k3]==1 && loctime[15][k3]==1)//GO & LO
    {      
      strokeWeight((float) 1.5);
      stroke(rl14, gl14, bl14);
      line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]+20, yloctime[0][k3]+20); 
      stroke(rl16, gl16, bl16);
      line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]-10, yloctime[0][k3]+10);
      stroke(0);
    } else if (loctime[9][k3]==0 && loctime[11][k3]==1 && loctime[13][k3]==0 && loctime[15][k3]==1)//LI & LO
    {      
      strokeWeight((float) 1.5); 
      stroke(rl12, gl12, bl12);
      line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]+10, yloctime[0][k3]-10);
      stroke(rl16, gl16, bl16);
      line(xloctime[0][k3], yloctime[0][k3]+20, xloctime[0][k3]-10, yloctime[0][k3]+30);
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
      line((float) (xloctime[0][k4]-0.5), yloctime[0][k4]+5, 0, yloctime[0][k4]+5);
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
      line((float) (xloctime[0][k4]+14.5), yloctime[0][k4]+10, 0, yloctime[0][k4]+10); 
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
      //shape(symtruck, xloctime[0][k3]-20, yloctime[0][k3]-10, 20, 10);
      strokeWeight((float) 1.5); 
      stroke(rl10, gl10, bl10);
      line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]-15, yloctime[0][k3]-15); 
      strokeWeight((float) 0.1); 
      //line(xloctime[0][k3]-15, yloctime[0][k3]-15, 0, yloctime[0][k3]-15); //Horizontalline
    } else if (loctime[9][k3]==0 && loctime[11][k3]==0 && loctime[13][k3]==1 && loctime[15][k3]==0) //GO
    {
      strokeWeight((float) 1.5); 
      stroke(rl14, gl14, bl14);
      line(xloctime[0][k3], yloctime[0][k3]+20, xloctime[0][k3]+15, yloctime[0][k3]+35);
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
      line(xloctime[0][k3], yloctime[0][k3]+20, xloctime[0][k3]-10, yloctime[0][k3]+30);
      stroke(0);
    } else if (loctime[9][k3]==1 && loctime[11][k3]==0 && loctime[13][k3]==1 && loctime[15][k3]==0)//GI & GO
    {  
      shape(symtruck, xloctime[0][k3]-20, yloctime[0][k3]-10, 20, 10);
      strokeWeight((float) 0.1); 
      line(xloctime[0][k3]-15, yloctime[0][k3]-15, 0, yloctime[0][k3]-15); //Horizontalline    
      strokeWeight((float) 1.5); 
      stroke(rl10, gl10, bl10);
      line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]-15, yloctime[0][k3]-15);
      stroke(rl14, gl14, bl14);
      line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]+20, yloctime[0][k3]+20);
      stroke(0);
    } else if (loctime[9][k3]==1 && loctime[11][k3]==1 && loctime[13][k3]==0 && loctime[15][k3]==0)//GI & LI
    {
      shape(symtruck, xloctime[0][k3]-20, yloctime[0][k3]-10, 20, 10);
      strokeWeight((float) 0.1); 
      strokeWeight((float) 1.5); 
      stroke(rl10, gl10, bl10);
      line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]-15, yloctime[0][k3]-15);
      stroke(rl12, gl12, bl12);
      line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]+10, yloctime[0][k3]-10);
      stroke(0);
    } else if (loctime[9][k3]==1 && loctime[11][k3]==0 && loctime[13][k3]==0 && loctime[15][k3]==1)//GI & LO
    {
      shape(symtruck, xloctime[0][k3]-20, yloctime[0][k3]-10, 20, 10);
      strokeWeight((float) 0.1); 
      strokeWeight((float) 1.5); 
      stroke(rl10, gl10, bl10);
      line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]-15, yloctime[0][k3]-15);
      stroke(rl16, gl16, bl16);
      line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]-10, yloctime[0][k3]+10);
      stroke(0);
    } else if (loctime[9][k3]==0 && loctime[11][k3]==1 && loctime[13][k3]==1 && loctime[15][k3]==0)//LI & GO
    {      
      strokeWeight((float) 1.5); 
      stroke(rl12, gl12, bl12);
      line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]+10, yloctime[0][k3]+10);
      stroke(rl14, gl14, bl14);
      line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]+20, yloctime[0][k3]-20);
      stroke(0);
    } else if (loctime[9][k3]==0 && loctime[11][k3]==0 && loctime[13][k3]==1 && loctime[15][k3]==1)//GO & LO
    {      
      strokeWeight((float) 1.5);
      stroke(rl14, gl14, bl14);
      line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]+20, yloctime[0][k3]+20); 
      stroke(rl16, gl16, bl16);
      line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]-10, yloctime[0][k3]+10);
      stroke(0);
    } else if (loctime[9][k3]==0 && loctime[11][k3]==1 && loctime[13][k3]==0 && loctime[15][k3]==1)//LI & LO
    {      
      strokeWeight((float) 1.5); 
      stroke(rl12, gl12, bl12);
      line(xloctime[0][k3], yloctime[0][k3], xloctime[0][k3]+10, yloctime[0][k3]-10);
      stroke(rl16, gl16, bl16);
      line(xloctime[0][k3], yloctime[0][k3]+20, xloctime[0][k3]-10, yloctime[0][k3]+30);
      //stroke(0);
    }
  }

  // K5; VERTICAL LINES ON DESIRED
  // BASED ON GI GO LI LO  
  strokeWeight((float) 0.1);
  for (int k5=0; k5<rows; k5++)      // For positioning location exactly on the 
    //longitude where they belong,followed by VERTICAL LINES
  { 
    if (loctime[4][k5]==1 && loctime[18][k5]==0) //GI
    {  
      line(xloctime[0][k5], yloctime[0][k5]+5, xloctime[0][k5], 0);
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
      stroke(rl17, gl17, bl17);
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
  }


  // K6; GOGIN ERASE VERTICAL
  for (int k6=0; k6<rows; k6++) {             // For erasing Gogin Vertical line 
    if (loctime[5][k6]==1) //GO
    {
      stroke(255);
      strokeWeight(1);
      line(xloctime[0][k6]+15, yloctime[0][k6]+15, xloctime[0][k6]+15, 0);
      strokeWeight((float) 0.1);
      stroke(0);
    }
  }

  // K7; COLORING
  // BASED ON EMITTING AND RECEIVING  
  for (int k7=0; k7<rows; k7++)     // For Circle Coloring at the translated points
  {  
    fill(255, 165, 0); 
    if (loctime[9][k7]==1 && loctime[11][k7]==0 && loctime[13][k7]==0 && loctime[15][k7]==0) //GI 
    {  
      fill(0, 0, 0); //Black
      ellipse(xloctime[0][k7]-15, yloctime[0][k7]-15, 6, 6); //Circle @ Translated points
      ellipse(xloctime[0][k7], yloctime[0][k7], 6, 6);
      fill(255, 0, 0); //Red
      ellipse(xloctime[0][k7]-15, yloctime[0][k7]-15, 5, 5); //Circle @ Translated points
      fill(255, 165, 0); 
      ellipse(xloctime[0][k7], yloctime[0][k7], 5, 5);
    } else
      if (loctime[9][k7]==0 && loctime[11][k7]==0 && loctime[13][k7]==1 && loctime[15][k7]==0) //GO
    {
      fill(0, 0, 0); //Red
      ellipse(xloctime[0][k7]+15, yloctime[0][k7]+35, 4, 4); 
      fill(255, 0, 0); //Red
      ellipse(xloctime[0][k7]+15, yloctime[0][k7]+35, 3, 3); 
      fill(0, 0, 0); 
      ellipse(xloctime[0][k7], yloctime[0][k7], 6, 6); 
      ellipse(xloctime[0][k7], yloctime[0][k7]+20, 6, 6);
      fill(255, 165, 0); 
      ellipse(xloctime[0][k7], yloctime[0][k7], 5, 5); 
      ellipse(xloctime[0][k7], yloctime[0][k7]+20, 5, 5);
    } else
      if (loctime[9][k7]==0 && loctime[11][k7]==1 && loctime[13][k7]==0 && loctime[15][k7]==0) //LI 
    {      
      fill(0, 0, 0); 
      ellipse(xloctime[0][k7]+10, yloctime[0][k7]-10, 6, 6); 
      ellipse(xloctime[0][k7], yloctime[0][k7], 6, 6);

      fill(255, 165, 0); 
      ellipse(xloctime[0][k7]+10, yloctime[0][k7]-10, 5, 5); 
      ellipse(xloctime[0][k7], yloctime[0][k7], 5, 5);
    } else  
      if (loctime[9][k7]==0 && loctime[11][k7]==0 && loctime[13][k7]==0 && loctime[15][k7]==1) //LO 
    {                    
      fill(0, 0, 0); 
      ellipse(xloctime[0][k7]-10, yloctime[0][k7]+30, 6, 6); 
      ellipse(xloctime[0][k7], yloctime[0][k7], 6, 6);

      fill(255, 165, 0); 
      ellipse(xloctime[0][k7]-10, yloctime[0][k7]+30, 5, 5); 
      ellipse(xloctime[0][k7], yloctime[0][k7], 5, 5);
    } else if (loctime[9][k7]==1 && loctime[11][k7]==0 && loctime[13][k7]==1 && loctime[15][k7]==0)//GI & GO
    {      
      fill(0, 0, 0); //Red
      ellipse(xloctime[0][k7]-15, yloctime[0][k7]-15, 6, 6); 
      ellipse(xloctime[0][k7]+20, yloctime[0][k7]+40, 6, 6); 
      ellipse(xloctime[0][k7], yloctime[0][k7], 6, 6);         
      fill(255, 0, 0); //Red
      ellipse(xloctime[0][k7]-15, yloctime[0][k7]-15, 5, 5); 
      ellipse(xloctime[0][k7]+20, yloctime[0][k7]+40, 5, 5); 
      ellipse(xloctime[0][k7], yloctime[0][k7], 5, 5);
    } else if (loctime[9][k7]==1 && loctime[11][k7]==1 && loctime[13][k7]==0 && loctime[15][k7]==0)//GI & LI
    {
      fill(0, 0, 0); //Red
      ellipse(xloctime[0][k7]-15, yloctime[0][k7]-15, 6, 6); 
      ellipse(xloctime[0][k7]+10, yloctime[0][k7]-10, 6, 6); 
      fill(255, 0, 0); //Red
      ellipse(xloctime[0][k7]-15, yloctime[0][k7]-15, 5, 5); 
      fill(255, 165, 0); 
      ellipse(xloctime[0][k7]+10, yloctime[0][k7]-10, 5, 5); 
      ellipse(xloctime[0][k7], yloctime[0][k7], 5, 5);
    } else if (loctime[9][k7]==1 && loctime[11][k7]==0 && loctime[13][k7]==0 && loctime[15][k7]==1)//GI & LO
    {
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
    {      
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
    {      
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
    {      
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
    {
      fill(0, 0, 0); //Blue
      ellipse(xloctime[0][k7], yloctime[0][k7], 6, 6);
      fill(255, 165, 0); //Blue
      ellipse(xloctime[0][k7], yloctime[0][k7], 5, 5);
    }
  }   

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
          text(loctime[8][k8], xloctime[0][k8]-5, yloctime[0][k8]);
          text("Time", xloctime[0][k8]-20, yloctime[0][k8]+10);
          text(loctime[2][k8], xloctime[0][k8]-5, yloctime[0][k8]+10);
          text("Longitude", xloctime[0][k8]-20, yloctime[0][k8]+20);
          text(loctime[0][k8], xloctime[0][k8]-5, yloctime[0][k8]+20);
        } else   if (loctime[4][k8]==0 && loctime[5][k8]==1 && loctime[6][k8]==0 && loctime[7][k8]==0)  //GO
        {
          fill(0, 0, 0);
          textSize(3);
          text("GO", xloctime[0][k8]+25, yloctime[0][k8]+20);
          text(loctime[8][k8], xloctime[0][k8]+35, yloctime[0][k8]+20);
          text("Time", xloctime[0][k8]+25, yloctime[0][k8]+30);
          text(loctime[2][k8], xloctime[0][k8]+35, yloctime[0][k8]+30);
          text("Longitude", xloctime[0][k8]+25, yloctime[0][k8]+40);
          text(loctime[0][k8], xloctime[0][k8]+35, yloctime[0][k8]+40);
        } else   if (loctime[4][k8]==0 && loctime[5][k8]==0 && loctime[6][k8]==1 && loctime[7][k8]==0)  //LI
        {
          fill(0, 0, 0);
          textSize(3);
          text("LI", xloctime[0][k8]+10, yloctime[0][8]+15);
          text(loctime[8][k8], xloctime[0][k8]+20, yloctime[0][k8]+15);
          text("Time", xloctime[0][k8]+10, yloctime[0][k8]+25);
          text(loctime[2][k8], xloctime[0][k8]+20, yloctime[0][k8]+25);
          text("Longitude", xloctime[0][k8]+10, yloctime[0][k8]+35);
          text(loctime[0][k8], xloctime[0][k8]+20, yloctime[0][k8]+35);
        } else   if (loctime[4][k8]==0 && loctime[5][k8]==0 && loctime[6][k8]==0 && loctime[7][k8]==1)  //LO
        {
          fill(0, 0, 0);
          textSize(3);
          text("LO", xloctime[0][k8]-20, yloctime[0][k8]);
          text(loctime[8][k8], xloctime[0][k8]-10, yloctime[0][k8]);
          text("Time", xloctime[0][k8]-20, yloctime[0][k8]+10);
          text(loctime[2][k8], xloctime[0][k8]-10, yloctime[0][k8]+10);
          text("Longitude", xloctime[0][k8]-20, yloctime[0][k8]+20);
          text(loctime[0][k8], xloctime[0][k8]-10, yloctime[0][k8]+20);
        }
      }
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
        text(loctime[8][k8], xloctime[0][k8]-5, yloctime[0][k8]);
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
        text(loctime[8][k8], xloctime[0][k8]-5, yloctime[0][k8]);
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
        text(loctime[8][k8], xloctime[0][k8]+20, yloctime[0][k8]);
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
        text(loctime[8][k8], xloctime[0][k8]-10, yloctime[0][k8]);
        text("Time", xloctime[0][k8]-25, yloctime[0][k8]+10);
        text(loctime[2][k8], xloctime[0][k8]-10, yloctime[0][k8]+10);
        text("Longitude", xloctime[0][k8]-25, yloctime[0][k8]+20);
        text(loctime[0][k8], xloctime[0][k8]-10, yloctime[0][k8]+20);
      }
    }
  }

  // COLOR SPECTRUM AND LAYER LABELLING
  fill(0, 0, 0);
  textSize(20);
  // LEFT LABEL
 /* text ("IMPACT SPECTRUM", -150, 30);
  textSize(8);
  text ("            0.0001 to 0.0004", -100, 60);
  text ("        0.0004 to 0.02", -100, 80);
  text ("    0.02 to 0.04", -100, 100);
  text ("    0.04 to 0.06", -100, 120);
  text ("  0.06 to 0.1", -100, 140);
  text ("0.1 to 0.3", -100, 160);
  rectMode(CENTER);*/
  // LAYER LABEL
  fill(0, 0, 0);
  textSize(4);
  text("MACHINES", -180, -85);
  text("PEOPLE INVOLVED", -140, -85);
  text("LAYER 3", -100, -85);
  text("LAYER 4", -60, -85);
  fill(255);
  rect(-180, -70, 40, 20, 5);
  shape(symmach, -180, -73, 40, 20);
  fill(255);
  rect(-140, -70, 40, 20, 5);
  shape(symman, -145, -73, 40, 20);
  fill(150);
  rect(-100, -70, 40, 20, 5);
  fill(200);
  rect(-60, -70, 40, 20, 5);
  fill(0);
  // CHART LABEL
 /* fill(46, 48, 146);
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
  rect(-165, 155, 60, 20, 5);  
  fill(50);*/
  //IMPACT CATEGORIES
  textSize(6);
  /*text("CAT1", -170, 252);
  text("CAT2", -170, 267);
  text("CAT3", -170, 282);
  text("CAT4", -170, 297);
  text("CAT5", -170, 312);
  text("CAT6", -170, 327);
  text("CAT7", -170, 342);
  text("CAT8", -170, 357);
  text("CAT9", -170, 372);
  text("CAT10", -170, 387);
  rect(-150, 250, 10, 10, (float) 2.5);
  rect(-150, 265, 10, 10, (float) 2.5);
  rect(-150, 280, 10, 10, (float) 2.5);
  rect(-150, 295, 10, 10, (float) 2.5);
  rect(-150, 310, 10, 10, (float) 2.5);
  rect(-150, 325, 10, 10, (float) 2.5);
  rect(-150, 340, 10, 10, (float) 2.5);
  rect(-150, 355, 10, 10, (float) 2.5);
  rect(-150, 370, 10, 10, (float) 2.5);
  rect(-150, 385, 10, 10, (float) 2.5);  */


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

  Overallall();
  Overallcases(20);
  Overallcases(40);
  Overallcases(60);
  Overallcases(80);
  Overallcases(100);
  Overallcases(120);
  Overallcases(140);
  Overallcases(160);
  Overallcases(180);
  Overallcases(200);
}

void Overallall()
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
 /* text("TOTAL IMPACT", -95, 0);
  text(ipart6, -35, 0);
  ipart6=0;*/
  textSize(5);
}

void Overallcases(int check)
{ 
  for (int i=0; i<rows; i++) 
  {
    if (check!=0)
    {
      if (xloctime[0][i]==check)
      { 
        if (loctime[21][i]!=0) // OVERALL Phase Impact Calc
        {
          ipart6c=ipart6c+(loctime[17][i]/10000); //Case Impact
        }
      }
    }
  }
  fill(0);
  text(ipart6c, check, 7);
  ipart6c=0;
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
