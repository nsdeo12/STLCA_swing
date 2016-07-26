package lca;


import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class tree_impa extends PApplet {
	PApplet parent;

	/*public tree_imp(PApplet _parent){
		parent = _parent;
	}*/
	public static void main(String _args[]){
		PApplet.main(new String[]{"--present", "lca.tree_impa"});
	}
	
	int cols = 28;
	int panx;
	int pany=100;
	int z ;
	int x ;
	float angle = 0;
	float zoom = 1;
	float xo;
	float yo;
	int rowc()
	{
	//Table table1 = loadTable("C:\\Users\\Nitesh\\Desktop\\Priyal Files\\new.csv", "header");
		Table table1 = loadTable("C:\\Users\\Nitesh\\Desktop\\Priyal Files\\new.csv", "header");
	int rowc = table1.getRowCount();
	return rowc;
	}
	int cols()
	{
		//Table table1 = loadTable("C:\\Users\\Nitesh\\Desktop\\Priyal Files\\new.csv", "header");
		Table table1 = loadTable("C:\\Users\\Nitesh\\Desktop\\Priyal Files\\new.csv", "header");
		int colc = table1.getRowCount();
		return colc;
	}
    int rows = rowc();
    int columns = cols();
	String[][]Partname =new String[columns+1][rows+1]; ;
	Float[][] pp = new Float[columns+1][rows+1];
	public tree_impa()
	{
		
	}
	public void setup()
	{
		zoom=(float)1;
	
		size(1280, 644);
		xo = width/2; 
	    yo = height/2;
	    
		 // Table table1 = loadTable("C:\\Users\\Nitesh\\Desktop\\Priyal Files\\new.csv", "header");
	    Table table1 = loadTable("M:\\templates\\new1.csv", "header");
		  int x = table1.getRowCount();
		  for (int i = 0; i < columns; i++) {
		    for (int j = 0; j < rows; j++) {
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
		      } /*else if (i==3) {
		        pp[3][j] = row1.getFloat("Impact");
		      } else if (i==4) {
		        pp[4][j] = row1.getFloat("Confidence");
		      } else if (i==5) {
		        pp[5][j] = row1.getFloat("1");
		      } else if (i==6) {
		        pp[6][j] = row1.getFloat("2");
		      } else if (i==7) {
		        pp[7][j] = row1.getFloat("3");
		      } else if (i==8) {
		        pp[8][j] = row1.getFloat("4");
		      }*/
		    }
		  }
	
;		  for ( int i=0;i<x;i++)
		  {
			//text (Partname[0][i], -10, 123);
		  }
		  print();
		 /* int y =0;
		  int z = x-1;
		while( y != z)
		{
		  println(Partname [0][y]);
		}*/
		  /*Table table1 = loadTable("C:\\Users\\Nitesh\\Desktop\\Priyal Files\\Code\\proimpact1\\Partprocess.csv", "header");
		  z = table1.getRowCount();
	    	 x= table1.getColumnCount();
	    	System.out.println(z);
	    	System.out.println(x);
	    	 Partname = new String[x+1][z];
	    	tr = new Float[x+1][z];
	    	
	    	for (int i = 0; i < x+1; i++) {
		    for (int j =0 ; j < z+1; j++) {
		    	 
		    	 
		      TableRow row1 = table1.getRow(1);
		 
		      if (i==0) {
		    	//String[] Partname = table1.getStringColumn("Part_assem_name");
		        Partname[0][0] = row1.getString("Part_assem_name");
		        tr[0][0] = row1.getFloat("Part_assem_name");
		      } else if (i==1)
		      { 
		        tr[1][j] = row1.getFloat("UID");
		      } else if (i==2) {
		        tr[2][j] = row1.getFloat("StatusPP");
		      } else if (i==3) {
		        tr[3][j] = row1.getFloat("1");
		      } else if (i==4) {
		        tr[4][j] = row1.getFloat("2");
		      } else if (i==5) {
		        tr[5][j] = row1.getFloat("3");
		      } else if (i==6) {
		        tr[6][j] = row1.getFloat("4");
		      } else if (i==7) {
		        tr[7][j] = row1.getFloat("5");
		      } else if (i==8) {
		        tr[8][j] = row1.getFloat("6");
		      }
		    }
		  }*/
		// print();
	/*
		String lines[] = loadStrings("C:\\Users\\Nitesh\\Desktop\\Priyal Files\\Code\\proimpact1\\Partprocess.csv");
		String [][] csv;
		int csvWidth=0;

		//calculate max width of csv file
		for (int i=0; i < lines.length; i++) {
		  String [] chars=split(lines[i],',');
		  if (chars.length>csvWidth){
		    csvWidth=chars.length;
		  }
		}

		//create csv array based on # of rows and columns in csv file
		csv = new String [lines.length][csvWidth];

		//parse values into 2d array
		for (int i=0; i < lines.length; i++) {
		  String [] temp = new String [lines.length];
		  temp= split(lines[i], ',');
		  for (int j=0; j < temp.length; j++){
		   csv[i][j]=temp[j];
		  }
		}

		//test
		for ( int i =0; i< lines.length ; i++)
		{
			for ( int j= 0;j<csvWidth ; j++)
			{
				println(csv [i] [j]);
			}
		}
		println(csv [ 1] [1]);
		println(csv[2][3]);
		println(csv[2][2]);
		 */
		 // ellip();
		  //lines();
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
	}
	  if (pp[1][i] == 2)
	  {
		  counter = counter ++;
		  if ((pp[3][i])>=0.3){
			   fill(239,62,52);
			   ellipse(s+85, y , r, r);
			   line(s+15, y , s+60 , y);
			   line(s+15, y, s+15 ,y-67);}
			 else if  (((pp[3][i])>=0.1) && (pp[3][i])<0.3){
			   fill(241,89,40);
			   ellipse(s+85 , y , r, r);
			   line(s+15, y , s+60 , y);
			   line(s+15, y, s+15 ,y-67);}
			  else if  (((pp[3][i])>=0.06) && (pp[3][i])<0.1){
			   fill(241,89,40);
			   ellipse(s+85 , y , r, r);
			   line(s+15, y , s+60 , y);
			   line(s+15, y, s+15 ,y-67);}
			 else if (((pp[3][i])>=0.02) && (pp[3][i])<0.03){
			   fill(251,175,63);
			   ellipse(s+85 , y , r, r);
			   line(s+15, y , s+60 , y);
			   line(s+15, y, s+15 ,y-67);}
			    else if (((pp[3][i])>=0.01) && (pp[3][i])<0.02){
			   fill(247,236,46);
			   ellipse(s+85 , y , r, r);
			   line(s+15, y , s+60 , y);
			   line(s+15, y, s+15 ,y-67);}
			    else if (((pp[3][i])>=0.0004) && (pp[3][i])<0.01){
			   fill(214,223,34);
			   ellipse(s+85 , y , r, r);
			   line(s+15, y , s+60 , y);
			   line(s+15, y, s+15 ,y-67);}
			    else if (((pp[3][i])>=0.0003) && (pp[3][i])<0.0004){
			   fill(140,198,62);
			   ellipse(s+85, y , r, r);
			   line(s+15, y , s+60 , y);
			   line(s+15, y, s+15 ,y-67);}
			    else if (((pp[3][i])>=0.0002) && (pp[3][i])<0.0003){
			   fill(36,181,114);
			   ellipse(s+85 , y , r, r);
			   line(s+15, y , s+60 , y);
			   line(s+15, y, s+15 ,y-67);}
			    else if ((pp[3][i])<=0.0002){ 
			   fill(0,173,239);
			   //spotLight(255, 0, 0,100,100,400, 0, 0, -1, PI/4, 2);}
			   ellipse(s+85 , y , r, r);
			   line(s+15, y , s+60 , y);
			   line(s+15, y, s+15 ,y-67);}
		  //ellipse(s+85,y,r,r);
		fill(0);
		  text(Partname[0][i], s+122,y);
		  text("Impact = " + pp[3][i], s+200 , y-10 );
		   text("Confidence = " + pp[4][i] + "%",  s+175 , y+15  ); 
		  y=y+70;
	  }
	  if(pp[1][i] == 1)
	  {
		  counter = counter ++;
		  if ((pp[3][i])>=0.3){
			   fill(239,62,52);
			   ellipse(s+15, y , r, r);
			   line(s-50, y , s-10 , y);
			   line(s-50,y , s-50, y - 67);}
			 else if  (((pp[3][i])>=0.1) && (pp[3][i])<0.3){
			   fill(241,89,40);
			   ellipse(s+15 , y , r, r);
			   line(s-50, y , s-10 , y);
			   line(s-50,y , s-50, y - 67);}
			  else if  (((pp[3][i])>=0.06) && (pp[3][i])<0.1){
			   fill(241,89,40);
			   ellipse(s+15 , y , r, r);
			   line(s-50, y , s-10 , y);
			   line(s-50,y , s-50, y - 67);}
			 else if (((pp[3][i])>=0.02) && (pp[3][i])<0.03){
			   fill(251,175,63);
			   ellipse(s+15 , y , r, r);
			   line(s-50, y , s-10 , y);
			   line(s-50,y , s-50, y - 67);}
			    else if (((pp[3][i])>=0.01) && (pp[3][i])<0.02){
			   fill(247,236,46);
			   ellipse(s+15 , y , r, r);
			   line(s-50, y , s-10 , y);
			   line(s-50,y , s-50, y - 67);}
			    else if (((pp[3][i])>=0.0004) && (pp[3][i])<0.01){
			   fill(214,223,34);
			   ellipse(s+15 , y , r, r);
			   line(s-50, y , s-10 , y);
			   line(s-50,y , s-50, y - 67);}
			    else if (((pp[3][i])>=0.0003) && (pp[3][i])<0.0004){
			   fill(140,198,62);
			   ellipse(s+15, y , r, r);
			   line(s-50, y , s-10 , y);
			   line(s-50,y , s-50, y - 67);}
			    else if (((pp[3][i])>=0.0002) && (pp[3][i])<0.0003){
			   fill(36,181,114);
			   ellipse(s+15 , y , r, r);
			   line(s-50, y , s-10 , y);
			   line(s-50,y , s-50, y - 67);}
			    else if ((pp[3][i])<=0.0002){ 
			   fill(0,173,239);
			  /* spotLight(255, 0, 0,100,100,400, 0, 0, -1, PI/4, 2);
			   lights();
			   translate(58, 48, 0);
			   sphere(28);
			    }*/
			   ellipse(s+15 , y , r, r);
			   line(s-50, y , s-10 , y);
			   line(s-50,y , s-50, y - 67);}
		 // ellipse(s+15 , y , r, r);
		 fill(0);
	  text(Partname[0][i], s+55,y);
	  text("Impact = " + pp[3][i], s+175 , y-5);
	  text("Confidence = " + pp[4][i] + "%",  s+175 , y+15  ); 
	  y=y+70;
	}
	  if(pp[1][i] == 3)
	  {
		  counter = counter ++;
		  if ((pp[3][i])>=0.3){
			   fill(239,62,52);
			   spotLight(255, 0, 0, width/2, height/2, 400, 0, 0, -1, PI/4, 2);
			   ellipse(s+225, y , r, r);
			   line(s+85, y , s+45 , y);
			   line(s+85,y , s+85, y - 67);}
			 else if  (((pp[3][i])>=0.1) && (pp[3][i])<0.3){
			   fill(241,89,40);
			   spotLight(255, 0, 0, width/2, height/2, 400, 0, 0, -1, PI/4, 2);
			   ellipse(s+225 , y , r, r);
			   line(s+85, y , s+45 , y);
			   line(s+85,y , s+85, y - 67);}
			  else if  (((pp[3][i])>=0.06) && (pp[3][i])<0.1){
			   fill(241,89,40);
			   spotLight(255, 0, 0, width/2, height/2, 400, 0, 0, -1, PI/4, 2);
			   ellipse(s+225 , y , r, r);
			   line(s+85, y , s+45 , y);
			   line(s+85,y , s+85, y - 67);}
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
		  y=y+70;  
	  }
	  if(pp[1][i] == 5)
	  {
		  counter = counter ++;
		  if ((pp[3][i])>=0.3){
			   fill(239,62,52);
			   ellipse(s+365, y , r, r);}
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
	
	 /*while((pp[1][i] - pp[1][i-1]) == 0 ) //level 2-1 ! = 0 
	 {
		 y=40;
		if(pp[1][i] == 2)
		{
			line(s+15 , y , s+15 , y+50   );
		}
		y=y+40;
	 }*/
	  
	  
	/*  int b =0;
	for ( int j = 0 ; j < rows-1 ; j++)
	  {
		  int f = j+1;
		 
			  if(pp [1][j] == pp[1][f])
		  {
				  System.out.println(pp[1][1]);
				  System.out.println(pp[1][2]);
		
			  line(s-75 , b , s-75, b+50);
		  }
			  b=b+40;
		 f=0;
		  }*/
	  }
	  
	
	

	void lines()
	{
		 int y = 40;
		 int s = 20;
		for ( int i = 0 ; i<rows ; i++)
		{
			
			if( pp [1][i] == 1 )
			{
				while(pp[1][i+1] == 1)
				{
					line(s+15 , y , s+15, y+50 );
				}
				
			}
			y = y+40;
		}
	}
	public void draw()
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
			ellip();
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

