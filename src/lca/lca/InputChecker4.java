package lca;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class InputChecker4 extends PApplet {
	PApplet parent;
<<<<<<< HEAD

=======
	
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
	public static void main(String _args[]){
		
		PApplet.main(new String[]{"--present", "lca.InputChecker4"});
		/*main mn = new main();
		String st = mn.getname();
		System.out.print(st);*/
	}
	int dzoom = 40;
int temp_p;
	int cols = 36;
	int cols1=3;
	int cols2=3;
	 int cols3 = 4;
	 int cols_new = 37;
	 float p_sum_imp;
	 int first_pro;
	/*int rows = 55;
	int rows1 = 44;
	int rows2=45;*/

	int rowc()
	{
<<<<<<< HEAD
		System.out.print(main.startDir.toString()+"\\templates\\processingTemplate.csv\n");
	 Table table1 = loadTable(main.startDir.toString()+"\\templates\\processingTemplate.csv", "header");
	
=======
	 Table table1 = loadTable("M:\\templates\\processingTemplate.csv", "header");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
	int rowc = table1.getRowCount();
	return rowc;
	}

	int rows = rowc();
	int rowc1()
	{
<<<<<<< HEAD
	 Table table2 = loadTable(main.startDir.toString()+"\\templates\\processImpact.csv", "header");
=======
	 Table table2 = loadTable("M:\\templates\\processImpact.csv", "header");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
	int rowc1 = table2.getRowCount();
	return rowc1;
	}
	int rows1 = rowc1();

int rowc2()
	{
<<<<<<< HEAD
	 Table table3 = loadTable(main.startDir.toString()+"\\templates\\processLCPhase.csv", "header");
=======
	 Table table3 = loadTable("M:\\templates\\processLCPhase.csv", "header");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
	int rowc2 = table3.getRowCount();
	return rowc2;
	}
	int rows2 = rowc2();

	int rowc3()
	{
<<<<<<< HEAD
	 Table table4= loadTable(main.startDir.toString()+"\\templates\\processConf.csv", "header");
=======
	 Table table4= loadTable("M:\\templates\\processConf.csv", "header");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
	int rowc3 = table4.getRowCount();
	return rowc3;
	}
	int rows3 = rowc3();
	int rowc_pr()
	{
<<<<<<< HEAD
	Table table11 = loadTable(main.startDir.toString()+"\\templates\\new1.csv", "header");
=======
	Table table11 = loadTable("M:\\templates\\new1.csv", "header");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
	int rowc_pr = table11.getRowCount();
	return rowc_pr;
	}
	int rows_pr = rowc_pr();
	int cols_pr =104;
	float[][] cell = new float[cols+1][rows+1];
	float[][] cellch = new float[cols1+1][rows1+1];
	float[][] cellch1 = new float[cols2+1][rows2+1];
	float[][] cellch2=new float[cols3+1][rows3+1];//process confidence cell
	float[][] newcell = new float[cols_new+1][rows+1];
	float[][] pro_imp = new float[cols_pr+1][rows_pr+1];
	String[][] pro_name = new String[2][rows+1];
	Table table4;
	public void setup() {

<<<<<<< HEAD
	  Table table = loadTable(main.startDir.toString()+"\\templates\\processingTemplate.csv", "header");
	  Table table1 = loadTable(main.startDir.toString()+"\\templates\\processImpact.csv", "header");
	  Table table2 = loadTable(main.startDir.toString()+"\\templates\\processLCPhase.csv", "header");
  Table table3=loadTable(main.startDir.toString()+"\\templates\\processConf.csv","header");
=======
	  Table table = loadTable("M:\\templates\\processingTemplate.csv", "header");
	  Table table1 = loadTable("M:\\templates\\processImpact.csv", "header");
	  Table table2 = loadTable("M:\\templates\\processLCPhase.csv", "header");
  Table table3=loadTable("M:\\templates\\processConf.csv","header");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544

	  for (int i = 0; i < cols; i++) {
	    for (int j = 0; j < rows; j++) {
	      TableRow row = table.getRow(j);
	      if (i==0) {
	        cell[0][j] = row.getFloat("Check");
	      } else if (i==1)
	      { 
	        cell[1][j] = row.getInt("IDC");
	      } else if (i==2) {
	        cell[2][j] = row.getFloat("LongC");
	      } else if (i==3) {
	        cell[3][j] = row.getFloat("LatC");
	      } else if (i==4) {
	        cell[4][j] = row.getInt("TimeyC");
	        cell[4][first_pro] =20;
	        System.out.print(" First Process" + first_pro );
	      } else if (i==5) {
	        cell[5][j] = row.getInt("DuraC");
	      } else if (i==6) {
	        cell[6][j] = row.getFloat("ImpC");
	      } else if (i==7) {
	        cell[7][j] = row.getInt("MenC");
	      } else if (i==8) {
	        cell[8][j] = row.getInt("MachC");
	      } else if (i==9) {
	        cell[9][j] = row.getInt("TransC");
	      } else if (i==10) {
	        cell[10][j] = row.getInt("StatusC");
	      } else if (i==11) {
	        cell[11][j] = row.getInt("IDP");
	      } else if (i==12) {
	        cell[12][j] = row.getFloat("LongP");
	      } else if (i==13) {
	        cell[13][j] = row.getFloat("LatP");
	      } else if (i==14) {
	        cell[14][j] = row.getInt("TimeyP");
	      } else if (i==15) {
	        cell[15][j] = row.getInt("DuraP");
	      } else if (i==16) {
	        cell[16][j] = row.getInt("ImpP");
	      } else if (i==17) {
	        cell[17][j] = row.getInt("MenP");
	      } else if (i==18) {
	        cell[18][j] = row.getInt("MachP");
	      } else if (i==19) {
	        cell[19][j] = row.getInt("TransP");
	      } else if (i==20) {
	        cell[20][j] = row.getInt("StatusP");
	      } else if (i==21) {
	        cell[21][j] = row.getInt("IDS");
	      } else if (i==22) {
	        cell[22][j] = row.getFloat("LongS");
	      } else if (i==23) {
	        cell[23][j] = row.getFloat("LatS");
	      } else if (i==24) {
	        cell[24][j] = row.getInt("TimeyS");
	      } else if (i==25) {
	        cell[25][j] = row.getInt("DuraS");
	      } else if (i==26) {
	        cell[26][j] = row.getInt("ImpS");
	      } else if (i==27) {
	        cell[27][j] = row.getInt("MenS");
	      } else if (i==28) {
	        cell[28][j] = row.getInt("MachS");
	      } else if (i==29) {
	        cell[29][j] = row.getInt("TransS");
	      } else if (i==30) {
	        cell[30][j] = row.getInt("StatusS");
	      } else if (i==31) {
	        cell[31][j] = row.getFloat("LCPhase");
	      } else if (i==32) {
	        cell[32][j] = row.getInt("Conf");
	      } else if (i==33) {
	        cell[33][j] = row.getInt("Class");
	      } else if (i==34) {
	        cell[34][j] = row.getFloat("ImpactH");
	      } else if (i==35) {
	        cell[35][j] = row.getInt("ConfH");
	      } else if (i==36) {
	        cell[36][j] = row.getInt("Product_type");
	      }
	      
	    }
	  }

	  for (int i = 0; i < cols1; i++) {
	    for (int j = 0; j < rows1; j++) {
	      TableRow row1 = table1.getRow(j);
	      if (i==0) {
	        cellch[0][j] = row1.getFloat("Id");
	      } else if (i==1)
	      { 
	        cellch[1][j] = row1.getFloat("Imp");
	      }
	    }
	  }

	  for (int i = 0; i < cols2; i++) {
	    for (int j = 0; j < rows2; j++) {
	      TableRow row1 = table2.getRow(j);
	      if (i==0) {
	        cellch1[0][j] = row1.getFloat("process_id");
	      } else if (i==1)
	      { 
	        cellch1[2][j] = row1.getFloat("Phase");
	      }
	    }
	  }

for (int i = 0; i < cols3; i++) {
    for (int j = 0; j < rows3; j++) {
      TableRow row1 = table3.getRow(j);
      if (i==0) {
        cellch2[0][j] = row1.getFloat("Id");
      } else if (i==1)
      { 
        cellch2[1][j] = row1.getFloat("Conf");
      }
      else if (i==2)
      { 
        cellch2[2][j] = row1.getFloat("Product_type");
      }
      else if (i==3)
      { 
        cellch2[3][j] = row1.getFloat("Class");
      }
      else if (i==4)
      { 
        pro_name[1][j] = row1.getString("Process_Name");
      }
      
    }
  }

for (int j = 0; j < rows3; j++) {
    for (int i = 0; i < rows; i++) { 
	TableRow row1 = table3.getRow(j);
	 if (cellch2[0][j] == cell[1][i])
     {
	String nm = row1.getString("Process_Name");
	 pro_name[1][i] = nm;
     }
}}
	  // println(cell[1]);
	  //println(cellch[0]);
/*for (int j = 0; j < rows; j++) {
	System.out.println("pro_name " + j + pro_name[1][j]);
}*/


	  for (int j = 0; j < rows1; j++) {
	    for (int i = 0; i < rows; i++) { 
	      if (cellch[0][j] == cell[1][i])// if id (proImpact) == IDC (proTemp)
	      {
	        cell[6][i]=cellch[1][j]; // Imp value append = Impact value  (proImp)
	      }
	    }
	  }
	  println(cell[31]);
	  /*for (int j = 0; j < rows1; j++) {
		    for (int i = 0; i < rows; i++) { 
		      if (cellch2[0][j] == cell[1][i])// if id (proConf) == IDC (proTemp)
		      {
		        pro_name[1][i]=cellch[1][j]; // Imp value append = Impact value  (proImp)
		      }
		    }
		  }*/
	  // println(cell[1]);
	  //println(cellch[0]);
	  for (int j = 0; j < rows2; j++) {
	    for (int i = 0; i < rows; i++) { 
	      if (cellch1[0][j] == cell[1][i]) 
	      {
	        cell[31][i]=cellch1[2][j]; // LCPhase value append = LCPhase value (exported)
	      }
	    }
	  }
	  println(cell[31]);
//confidence append to input.csv    nilakantha
 for (int j = 0; j < rows3; j++) {
    for (int i = 0; i < rows; i++) { 
      if (cellch2[0][j] == cell[1][i])
      {
        cell[32][i]=cellch2[1][j];
        cell[33][i]= cellch2[3][j];//class
        cell[36][i]= cellch2[2][j];
       // cell[0][i]= cellch2[4][j];
      }
    }
  }
  println("confidence values are as follows:");
  println(cell[32]);
   
  /*for (int j = 0; j < rows3; j++) {
	    for (int i = 0; i < rows; i++) { 
	      if (cellch2[0][j] == cell[1][i])// if id (proImpact) == IDC (proTemp)
	      {
	        cell[36][i]=cellch2[2][j]; // Imp value append = Impact value  (proImp)
	      }
	    }
	  }*/

	  for (int k=0; k<rows; k++)
	  {
		  if (cell[2][k] == cell[12][k] && cell[3][k] == cell[13][k] && cell[2][k] == cell[22][k] && cell[3][k] == cell[23][k] && cell[9][k]!=1 )
	    {
	      cell[10][k]=5; // Straight Process   Status = 5 (why 5 ?) 
	      //     longc != longp or LatC ! = latP                               longC = longS                  latC = latS                   Trans != 1      longP !=0           latP !=0
	    } else if ((cell[2][k] != cell[12][k] || cell[3][k] != cell[13][k]) && cell[2][k] == cell[22][k] && cell[3][k] == cell[23][k] && cell[9][k]!=1 && cell[12][k]!=0 && cell[13][k]!=0)
	    {
	      cell[10][k]=5; // Straight Process
	      
	    } else if ((cell[2][k] != cell[12][k] && cell[3][k] != cell[13][k]) && cell[9][k] == 1 /*|| cell[12][k] == 0 || cell[13][k] == 0*/  )
	    {
	      cell[10][k]=1; // GI   Status = 1
	   
	    }   else if ((cell[2][k] != cell[22][k] && cell[3][k] != cell[23][k]) && cell[9][k] == 1 || cell[22][k] == 0 || cell[23][k] == 0 )
	    {
		      cell[10][k]=3; // Go   Status = 3
		      //longC = longS                     latC = latS                   longP =0           latP =0               Trans = 0 
		    } 
	    else if ( cell[9][k]==3 )
	    {
	    	System.out.println("LOUT                   ");
	      cell[10][k]=4; // Lo  status = 4
	      //longC = longP                          latC = latP                          Trans = 0
	    }/* else if (cell[2][k] == cell[12][k] && cell[3][k] == cell[13][k] || cell[12][k] == 0 || cell[13][k] == 0 && cell[9][k]!=1 )
	    {
	      cell[10][k]=2; // LI  status = 2 
	      //}
	    }*/
	    else if ( cell[9][k]==2 )
	    {
	      cell[10][k]=2; // LI  status = 2
	      //longC = longP                          latC = latP                  longS =0           latS =0            Trans = 0
	    }
		  
		  
		  
		  
		  
		  
		  //longC = longP              latC = latP                    longC = longS                  latC = latS               Trans != 1
	    /* HARI if (cell[2][k] == cell[12][k] && cell[3][k] == cell[13][k] && cell[2][k] == cell[22][k] && cell[3][k] == cell[23][k] && cell[9][k]!=1 )
	    {
	      cell[10][k]=5; // Straight Process   Status = 5 (why 5 ?) 
	      //     longc != longp or LatC ! = latP                               longC = longS                  latC = latS                   Trans != 1      longP !=0           latP !=0
	    } else if ((cell[2][k] != cell[12][k] || cell[3][k] != cell[13][k]) && cell[2][k] == cell[22][k] && cell[3][k] == cell[23][k] && cell[9][k]!=1 && cell[12][k]!=0 && cell[13][k]!=0)
	    {
	      cell[10][k]=5; // Straight Process
	      //         longc != longp               LatC ! = latP               longP =0           latP =0   
	    } else if ((cell[2][k] != cell[22][k] || cell[3][k] != cell[23][k]) && cell[12][k] == 0 && cell[13][k] == 0 )
	    {
	      cell[10][k]=1; // GI   Status = 1
	      //longC = longS                     latC = latS                   longP =0           latP =0               Trans = 0 
	    } else if (cell[2][k] == cell[22][k] && cell[3][k] == cell[23][k] && cell[12][k] == 0 && cell[13][k] == 0 && cell[9][k]==0 )
	    {
	      cell[10][k]=2; // LI  status = 2
	      //longC = longP                          latC = latP                  longS =0           latS =0            Trans = 0
	    } else if (cell[2][k] == cell[12][k] && cell[3][k] == cell[13][k] && cell[22][k] == 0 && cell[23][k] == 0 && cell[9][k]!=1 )
	    {
	      cell[10][k]=4; // LO   status = 4 
	      //} else if ((cell[2][k] != cell[12][k] || cell[3][k] != cell[13][k]) && cell[9][k]==1)
	      // Trans = 1                 IDS =0 (no succeeding)
	    } else if (cell[9][k]==1 && cell[21][k]==0)
	    {
	      cell[10][k]=3; // GO    status = 3 
	    }*/
		  
		  /*if (cell[2][k] == cell[12][k] && cell[3][k] == cell[13][k] && cell[2][k] == cell[22][k] && cell[3][k] == cell[23][k] && cell[9][k]!=1 )
		    {
		      cell[10][k]=5; // Straight Process   Status = 5 (why 5 ?) 
		      //     longc != longp or LatC ! = latP                               longC = longS                  latC = latS                   Trans != 1      longP !=0           latP !=0
		    } else if ((cell[2][k] != cell[12][k] || cell[3][k] != cell[13][k]) && cell[2][k] == cell[22][k] && cell[3][k] == cell[23][k] && cell[9][k]!=1 && cell[12][k]!=0 && cell[13][k]!=0)
		    {
		      cell[10][k]=5;
		    }
		    else if ((cell[2][k] != cell[22][k] && cell[3][k] != cell[23][k]) && cell[9][k]==1  || cell[22][k]==0 || cell[23][k]==0)
		    {
		    	cell[10][k]=3; // GO    status = 3 
		    }
		    else if ((cell[2][k] != cell[12][k] && cell[3][k] != cell[13][k]) && cell[9][k]==1  || cell[12][k]==0 || cell[13][k]==0)
		    {
		    	cell[10][k]=1; // GI    status = 1
		    }
		    else if (cell[2][k] == cell[22][k] && cell[3][k] == cell[23][k] && cell[12][k] == 0 && cell[13][k] == 0 && cell[9][k]==0 )
		    {
		      cell[10][k]=2; // LI  status = 2
		      //longC = longP                          latC = latP                  longS =0           latS =0            Trans = 0
		    } else if (cell[2][k] == cell[12][k] && cell[3][k] == cell[13][k] && cell[22][k] == 0 && cell[23][k] == 0 && cell[9][k]!=1 )
		    {
		      cell[10][k]=4; // LO   status = 4 
		      }*/
	  }

	  for (int i=0; i<rows; i++)
	  {
	    for (int j=0; j<rows; j++)
	    { // idc = idp
	      if (cell[1][i] == cell[11][j])
	      {
	        cell[20][j]=cell[10][i]; // statusP = statusC
	        cell[16][j]=cell[6][i]; //ImpP = ImpC
	        cell[19][j]=cell[9][i]; // TransP = TransC
	      }
	    }
	  }

	  for (int i=0; i<rows; i++)
	  {
	    for (int j=0; j<rows; j++)
	    { // IDC = IDS
	      if (cell[1][i] == cell[21][j])
	      {
	        cell[30][j]=cell[10][i]; // statusS = statusC 
	        cell[26][j]=cell[6][i]; //ImpS = ImpC 
	        cell[29][j]=cell[9][i];  // TransS  = TransC
	      }
	    }
	  }
for ( int c =0; c<rows; c++)
{
	int temp =0;
    if (cell[10][c]==1 )  {// statusP = 1 ( status C = 1 ) (on checking conditions ; GI)
    	//temp = (int) cell[1][c];
    	System.out.println("Value of k where gin = 1 " + c);
    temp = (int) cell[21][c];
    System.out.println("Succeeding " + temp);
    	for ( int j=0; j <rows ; j++)
    	{
    		if (cell[1][j] == temp)
    		{
    			System.out.println("    " + j);
    			newcell[9][j] = 1;
    			
    		      newcell[10][j]=cell[6][c]; 
    		}
    	}
}
}
for ( int c =0; c<rows; c++)
{
	int temp =0;
	int temp_ids = 0;
    if (cell[10][c]==3 )  {
    	System.out.println("Value of k where gout = 1 " + c);
    temp = (int) cell[11][c];
    temp_ids = (int ) cell[21][c];
    System.out.println("Preceeding " + temp);
    	for ( int j=0; j <rows ; j++)
    	{
    		if (cell[1][j] == temp )
    		{
    			System.out.println("    " + j);
    			newcell[13][j] = 1;//gout emit at preceeding of current
    			
    			newcell[14][j]=cell[6][c];  
    		}
    		 if (cell [1][j] == temp_ids)
    		 {
    			 newcell[9][j] = 1 ; // add a Gin rec also for ids of the id where it is cell [10] = 3
    		 }
    	}
}
}


for (int c =0; c<rows; c++)
{
	int temp_dura = (int) cell[5][c];
	int temp_time = (int) cell[4][c];
	int temp_ids =  (int) cell[21][c];
	System.out.println("cell = " + c);
	for (int j=0;j<rows ; j++)
	{
		
	if( cell[1][j] == temp_ids)
	{
		System.out.println("cell = " + j);
		System.out.println("Duration = " + temp_dura);
		System.out.println("time = " + temp_time);
	cell[4][j] =	temp_dura + temp_time;
	System.out.println(cell[4][j]);
	temp_dura = (int) cell[5][j];
	 temp_time = (int) cell[4][j];
	 temp_ids =  (int) cell[21][j];
	}
	}
}



for ( int c =0; c<rows; c++)
{
	int temp =0;
    if (cell[9][c]==2)  {//LIN
    	newcell[6][c] = 1;
    	System.out.println("Value of k where Lin = 1 " + c);
    temp = (int) cell[21][c];
    System.out.println("Succeeding " + temp);
    	for ( int j=0; j <rows ; j++)
    	{
    		if (cell[1][j] == temp)
    		{
    			System.out.println("    " + j);
    			newcell[11][j] = 1;
    			newcell[12][j]=cell[6][c]; 
    		}
    	}
}
}
for ( int c =0; c<rows; c++)
{
	int temp =0;
	int temp_ids = -0;
    if (cell[9][c]==3 )  {//lout  // find IDS and add li rec = 1 for ids id 
    	newcell[7][c] = 1;
    	
    	System.out.println("Value of k where Lout = 1 " + c);
    temp = (int) cell[11][c];
    temp_ids = (int) cell[21][c];
    System.out.println("Preceeding " + temp);
    	for ( int j=0; j <rows ; j++)
    	{
    		if (cell[1][j] == temp  )
    		{
    			System.out.println("    " + j);
    			newcell[15][j] = 1;
    			
    		      newcell[16][j]=cell[6][c]; 
    		}
    		if ( cell[1][j] == temp_ids)
    		{
    			newcell[11][j] = 1;
    		}
    	}
}
}
/*for ( int i =1 ; i< rows_pr+1; i++)
{
	pro_imp[1][i]= cal_imp(i);
System.out.println(pro_imp[1][i]);
}

for (int k=0; k<rows1; k++)
{ 
	  
  newcell[0][k]=pro_imp[0][k]; //  longitude (input) =longC 
  newcell[1][k]=pro_imp[1][k];
}

table4 = new Table();
table4.addColumn("ID");
table4.addColumn("Impact");
for (int m=0; m<rows; m++)
{
  TableRow newRow = table4.addRow();
  newRow.setFloat("ID", pro_imp[0][m]);
  newRow.setFloat("Impact", pro_imp[1][m]);
}

saveTable(table4, "M:\\templates\\krishna.csv");*/

	  for (int k=0; k<rows; k++)
	  { 
		  
	     newcell[28][k] = cell[0][k];
	    newcell[0][k]=cell[2][k]; //  longitude (input) =longC 
	    newcell[1][k]=cell[3][k];//   latitude (input) = latC
	    newcell[2][k]=cell[4][k];// timeY = timeYC
	    
	    newcell[3][k]=cell[5][k]; // duration = current duration

	    if (cell[10][k]==1) { // GI
	      newcell[4][k]=1; //GI = 1 
	    }
	    if (cell[10][k]==3) { //GO 
	    	
	      newcell[5][k]=1; //GO
	    }
	    if (cell[10][k]==2) { //LI
	      newcell[6][k]=1; //LI
	    }
	    if (cell[10][k]==4) { //LO
	      newcell[7][k]=1; //LO
	    }
	    newcell[8][k]=cell[1][k]; // process_id = IDC
	    
	    /*if (cellch2[0][k] == newcell[8][k])
	      {
	    	newcell[28][k]=cellch2[4][k];
	      }*/
		  
/*int temp =0;
	    if (cell[10][k]==1 )  {// statusP = 1 ( status C = 1 ) (on checking conditions ; GI)
	    	temp = (int) cell[8][k];
	    }
	    	for ( int j=0; j <rows ; j++)
	    	{
	    		if (cell[21][j] == temp)
	    		{
	    			newcell[9][j] = 1;
	    			
	    		      newcell[10][j]=cell[16][j]; // GI _imp = ImpP
	    		}
	    	}*/
	     /* newcell[9][k]=1;  // GI _rec
	      newcell[10][k]=cell[16][k]; // GI _imp = ImpP
*/	    
        
	    if (cell[20][k]==2) { // StatusP = 2 (LI)
	      newcell[11][k]=1; // LI_rec 
	      newcell[12][k]=cell[16][k]; // LI_imp = ImpP
	    }

	    if (cell[30][k]==3) { // StatusP = 3
	      newcell[13][k]=1; // GO_emi
	      newcell[14][k]=cell[26][k]; //GO_imp = ImpS 
	    }

	    if (cell[30][k]==4) {
	      newcell[15][k]=1;
	      newcell[16][k]=cell[26][k]; //LO_imp = ImpS
	    }

	    newcell[17][k]=cell[6][k]; // Impact = ImpC
	    newcell[21][k]=cell[31][k]; // LCPHASE = lcphase
	    newcell[22][k]=cell[32][k]; // conf
	    newcell[23][k]=cell[33][k]; //class
	    newcell[24][k]=cell[11][k]; //IDP
	    newcell[25][k]=cell[21][k]; //IDS
	    newcell[26][k]=cell[36][k]; //Group
	    newcell[18][k] = cell[9][k];//Status for Global and local 
	   
	   /* if (cell[9][k]==1)   //Transport = 1 
	    {            
	      newcell[18][k]=1; //Gin to Go = 1 
	    } else {
	      newcell[18][k]=0; //gin to go = 0 
	    }*/

	    newcell[19][k]=cell[7][k]; //man 
	    newcell[20][k]=cell[8][k]; //gear = mach
	    
	  }


	  table = new Table();
	  table.addColumn("Latitude_start");
	  table.addColumn("Longitude_start");
	  table.addColumn("Time_y_axis");
	  table.addColumn("Time_duration");
	  table.addColumn("GI");
	  table.addColumn("GO");
	  table.addColumn("LI");
	  table.addColumn("LO");
	  table.addColumn("Process ID");
	  table.addColumn("GI_rec");
	  table.addColumn("GI_imp");
	  table.addColumn("LI_rec");
	  table.addColumn("LI_imp");
	  table.addColumn("GO_emi");
	  table.addColumn("GO_imp");
	  table.addColumn("LO_emi");
	  table.addColumn("LO_imp");
	  table.addColumn("Impact");
	  table.addColumn("GintoGo?");
	  table.addColumn("Man");
	  table.addColumn("Gear");
	  table.addColumn("LCPhase");
	  table.addColumn("Conf");
	  table.addColumn("Class");
	  table.addColumn("IDP");
	  table.addColumn("IDS");
	  table.addColumn("Product_Id");
	  table.addColumn("VariableClass");
	  table.addColumn("Process_name");

	  for (int m=0; m<rows; m++)
	  {
	    TableRow newRow = table.addRow();
	    newRow.setFloat("Latitude_start", newcell[0][m]);
	    newRow.setFloat("Longitude_start", newcell[1][m]);
	    newRow.setFloat("Time_y_axis", newcell[2][m]);
	    newRow.setFloat("Time_duration", newcell[3][m]);
	    newRow.setFloat("GI", newcell[4][m]);
	    newRow.setFloat("GO", newcell[5][m]);
	    newRow.setFloat("LI", newcell[6][m]);
	    newRow.setFloat("LO", newcell[7][m]);
	    newRow.setFloat("Process ID", newcell[8][m]);
	    newRow.setFloat("GI_rec", newcell[9][m]);
	    newRow.setFloat("GI_imp", newcell[10][m]);
	    newRow.setFloat("LI_rec", newcell[11][m]);
	    newRow.setFloat("LI_imp", newcell[12][m]);
	    newRow.setFloat("GO_emi", newcell[13][m]);
	    newRow.setFloat("GO_imp", newcell[14][m]);
	    newRow.setFloat("LO_emi", newcell[15][m]);
	    newRow.setFloat("LO_imp", newcell[16][m]);
	    newRow.setFloat("Impact", newcell[17][m]);
	    newRow.setFloat("GintoGo?", newcell[18][m]);
	    newRow.setFloat("Man", newcell[19][m]);
	    newRow.setFloat("Gear", newcell[20][m]);
	    newRow.setFloat("LCPhase", newcell[21][m]);
	    newRow.setFloat("Conf", newcell[22][m]);
	    newRow.setFloat("Class", newcell[23][m]);
	    newRow.setFloat("IDP", newcell[24][m]);
	    newRow.setFloat("IDS", newcell[25][m]);
	    newRow.setFloat("Product_Id", newcell[26][m]);
	    newRow.setFloat("VariableClass", newcell[27][m]);
	  newRow.setString("Process_name", pro_name[1][m]);
	  }

	  //saveTable(table, "M:\\templates\\Input.csv");
<<<<<<< HEAD
	  saveTable(table, main.startDir.toString()+"\\templates\\Input_original.csv");
=======
	  saveTable(table, "C:\\Users\\Nitesh\\Desktop\\boeing 747-8\\Input_original.csv");
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
	  //println(cell[20][0]);
	  //println(cell[20][1]);
	  //println(cell[20][2]);
	  //println(cell[20][3]);
	  //println(cell[20][4]);

	  //println(cell[30][0]);
	  //println(cell[30][1]);
	  //println(cell[30][2]);
	  //println(cell[30][3]);
	  //println(cell[30][4]);

	  // println(cell[10][0]);
	  // println(cell[10][1]);
	  // println(cell[10][2]);
	  // println(cell[10][3]);
	  // println(cell[10][4]);
	  //println("Opening Process_4");
	  //open("/sm16/sm16.exe");
	  //open("rundll32 SHELL32.DLL,ShellExec_RunDLL " + "/sm16/sm16.exe");
	}
	public void postData()
	{
	System.out.println("Hello");
	}
	public float cal_imp(float pp2)
	{
		p_sum_imp = 0;
		for (int k =0 ; k<rows ; k++)
		{
			
			if (cell[36][k] == pp2)
			{
				if(cell[33][k] == 2)
				{
				p_sum_imp = p_sum_imp + cell[6][k];	
				}
			}
		}
		System.out.println(p_sum_imp);
		
		//System.out.println(p_sum_imp);
		return(p_sum_imp);
				
	}
}