package lca;

import javax.swing.Spring;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class InputCheckerAR extends PApplet  {
	PApplet parent;
	
	public static void main(String _args[]){
		
		PApplet.main(new String[]{"--present", "lca.InputCheckerAR"});
		main mn = new main();
		String st = mn.getname();
		System.out.print(st);
	}

	int dzoom = 40;
String str_name;
	int cols = 36;
	int cols1=3;
	int cols2=3;

	int rows = 55;
	int rows1 = 44;
	int rows2=45;

	int rowc()
	{
	 Table table1 = loadTable("processingTemplate.csv", "header");
	int rowc = table1.getRowCount();
	return rowc;
	}
	//int rows = rowc();

	int rowc1()
	{
	 Table table2 = loadTable("processImpact.csv", "header");
	int rowc1 = table2.getRowCount();
	return rowc1;
	}
	//int rows1 = rowc1();

	int rowc2()
	{
	Table table3 = loadTable("processLCPhase.csv", "header");
	int rowc2 = table3.getRowCount();
	return rowc2;
	}
	//int rows2 = rowc2();



	float[][] cell = new float[cols+1][rows+1];
	float[][] cellch = new float[cols1+1][rows1+1];
	float[][] cellch1 = new float[cols2+1][rows2+1];
	float[][] newcell = new float[cols+1][rows+1];
	float sum;
	

	public void setup() {
  /* main mn = new main();
    String res = mn.getname();*/
   //String res = mn.getname();
    /*System.out.println(res);*/
		//InputCheckerAR.get
		
	  Table table = loadTable("M:\\templates\\processingTemplateAR.csv", "header");
	  Table table1 = loadTable("M:\\templates\\processImpactAR.csv", "header");
	  Table table2 = loadTable("M:\\templates\\processLCPhaseAR.csv", "header");

	  for (int i = 0; i < cols; i++) {
	    for (int j = 0; j < rows; j++) {
	      TableRow row = table.getRow(j);
	      if (i==0) {
	        cell[0][j] = row.getInt("Check");
	      } else if (i==1)
	      { 
	        cell[1][j] = row.getInt("IDC");
	      } else if (i==2) {
	        cell[2][j] = row.getInt("LongC");
	      } else if (i==3) {
	        cell[3][j] = row.getInt("LatC");
	      } else if (i==4) {
	        cell[4][j] = row.getInt("TimeyC");
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
	        cell[12][j] = row.getInt("LongP");
	      } else if (i==13) {
	        cell[13][j] = row.getInt("LatP");
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
	        cell[22][j] = row.getInt("LongS");
	      } else if (i==23) {
	        cell[23][j] = row.getInt("LatS");
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
	        cell[34][j] = row.getInt("ImpactH");
	      } else if (i==35) {
	        cell[35][j] = row.getInt("ConfH");
	      } else if (i==36) {
	        cell[36][j] = row.getInt("Group");
	      }
	    }
	  }
	  //sum=cell[5][0];

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

	  for (int i = 0; i < cols1; i++) {
	    for (int j = 0; j < rows1; j++) {
	      TableRow row1 = table2.getRow(j);
	      if (i==0) {
	        cellch1[0][j] = row1.getFloat("process_id");
	      } else if (i==1)
	      { 
	        cellch1[2][j] = row1.getFloat("Phase");
	      }
	    }
	  }


	  // println(cell[1]);
	  //println(cellch[0]);
	  for (int j = 0; j < rows1; j++) {
	    for (int i = 0; i < rows; i++) { 
	      if (cellch[0][j] == cell[1][i])
	      {
	        cell[6][i]=cellch[1][j];
	      }
	    }
	  }
	  //println(cell[31]);

	  // println(cell[1]);
	  //println(cellch[0]);
	  for (int j = 0; j < rows2; j++) {
	    for (int i = 0; i < rows; i++) { 
	      if (cellch1[0][j] == cell[1][i])
	      {
	        cell[31][i]=cellch1[2][j];
	      }
	    }
	  }
	  //println(cell[31]);



	  for (int k=0; k<rows; k++)
	  {
	    if (cell[2][k] == cell[12][k] && cell[3][k] == cell[13][k] && cell[2][k] == cell[22][k] && cell[3][k] == cell[23][k] && cell[9][k]!=1 )
	    {
	      cell[10][k]=5; // Straight Process
	    } else if ((cell[2][k] != cell[12][k] || cell[3][k] != cell[13][k]) && cell[2][k] == cell[22][k] && cell[3][k] == cell[23][k] && cell[9][k]!=1 && cell[12][k]!=0 && cell[13][k]!=0)
	    {
	      cell[10][k]=5; // Straight Process
	    } else if ((cell[2][k] != cell[22][k] || cell[3][k] != cell[23][k]) && cell[12][k] == 0 && cell[13][k] == 0 )
	    {
	      cell[10][k]=1; // GI
	    } else if (cell[2][k] == cell[22][k] && cell[3][k] == cell[23][k] && cell[12][k] == 0 && cell[13][k] == 0 && cell[9][k]==0 )
	    {
	      cell[10][k]=2; // LI
	    } else if (cell[2][k] == cell[12][k] && cell[3][k] == cell[13][k] && cell[22][k] == 0 && cell[23][k] == 0 && cell[9][k]!=1 )
	    {
	      cell[10][k]=4; // LO
	      //} else if ((cell[2][k] != cell[12][k] || cell[3][k] != cell[13][k]) && cell[9][k]==1)
	    } else if (cell[9][k]==1 && cell[21][k]==0)
	    {
	      cell[10][k]=3; // GO
	    }
	  }

	  for (int i=0; i<rows; i++)
	  {
	    for (int j=0; j<rows; j++)
	    {
	      if (cell[1][i] == cell[11][j])
	      {
	        cell[20][j]=cell[10][i];
	        cell[16][j]=cell[6][i];
	        cell[19][j]=cell[9][i];
	      }
	    }
	  }

	  for (int i=0; i<rows; i++)
	  {
	    for (int j=0; j<rows; j++)
	    {
	      if (cell[1][i] == cell[21][j])
	      {
	        cell[30][j]=cell[10][i];
	        cell[26][j]=cell[6][i];
	        cell[29][j]=cell[9][i];
	      }
	    }
	  }

	  for (int k=0; k<rows; k++)
	  { 
	    newcell[0][k]=cell[2][k];
	    newcell[1][k]=cell[3][k];
	    newcell[3][k]=cell[5][k];

	    if (cell[10][k]==1) {
	      newcell[4][k]=1;
	    }
	    if (cell[10][k]==3) {
	      newcell[5][k]=1;
	    }
	    if (cell[10][k]==2) {
	      newcell[6][k]=1;
	    }
	    if (cell[10][k]==4) {
	      newcell[7][k]=1;
	    }
	    newcell[8][k]=cell[1][k];

	    if (cell[20][k]==1) {
	      newcell[9][k]=1;
	      newcell[10][k]=cell[16][k];
	    }

	    if (cell[20][k]==2) {
	      newcell[11][k]=1;
	      newcell[12][k]=cell[16][k];
	    }

	    if (cell[30][k]==3) {
	      newcell[13][k]=1;
	      newcell[14][k]=cell[26][k];
	    }

	    if (cell[30][k]==4) {
	      newcell[15][k]=1;
	      newcell[16][k]=cell[26][k];
	    }

	    newcell[17][k]=cell[6][k];
	    newcell[21][k]=cell[31][k];
	    newcell[22][k]=cell[32][k];
	    newcell[23][k]=cell[33][k];
	    newcell[24][k]=cell[34][k];
	    newcell[25][k]=cell[35][k];
	    newcell[26][k]=cell[36][k];

	    if (cell[9][k]==1)
	    {            
	      newcell[18][k]=1;
	    } else {
	      newcell[18][k]=0;
	    }

	    newcell[19][k]=cell[7][k];
	    newcell[20][k]=cell[8][k];
	  }

	  for (int k1=0; k1<rows; k1++)
	  {
	    if (cell[1][k1]!=cell[1][k1+1] && cell[11][k1]!=0)
	    {
	      sum = sum+ cell[15][k1]+cell[15][0];
	      newcell[2][k1] = sum;
	      //println(sum);
	    }
	  }

	  for (int k2=0; k2<rows; k2++)
	  {
	    for (int k3=0; k3<rows; k3++)
	    {
	      if (cell[21][k2]==cell[1][k3])
	      { 
	        cell[24][k2]=newcell[2][k3];
	      }
	    }
	  }
	  println(cell[24]);

	  for (int k1=0; k1<rows; k1++)
	  {
	    if (cell[11][k1]==0)
	    {
	      newcell[2][k1]=cell[24][k1]-cell[5][k1];
	    }
	  }

	  for (int k1=0; k1<rows; k1++) {
	    for (int k2=0; k2<rows; k2++)
	    { 
	      if (newcell[8][k1]==newcell[8][k2]) {
	        if (newcell[2][k1]-newcell[2][k2]!=0)
	        {

	          newcell[2][k1]=abs(newcell[2][k1]-newcell[2][k2]);
	        }
	      }
	    }
	  }

	  table = new Table();
	  table.addColumn("Longitude_start");
	  table.addColumn("Latitude_start");
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
	  table.addColumn("ImpactH");
	  table.addColumn("ConfH");
	  table.addColumn("Group");

	  for (int m=0; m<rows; m++)
	  {
	    TableRow newRow = table.addRow();
	    newRow.setFloat("Longitude_start", newcell[0][m]);
	    newRow.setFloat("Latitude_start", newcell[1][m]);
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
	    newRow.setFloat("ImpactH", newcell[24][m]);
	    newRow.setFloat("ConfH", newcell[25][m]);
	    newRow.setFloat("Group", newcell[26][m]);
	  }
	  
     
	  saveTable(table,  "M:\\templates\\InputAR.csv");

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

	/*public void setname(String response) {
		str_name=response;
			}*/
	public String getname(String response)
	{
		str_name = response;
		System.out.println(str_name);
		return str_name;
	}

}
