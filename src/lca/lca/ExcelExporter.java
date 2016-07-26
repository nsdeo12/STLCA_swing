package lca;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ExcelExporter {
          ExcelExporter(){}
	
	public void exportTable(DefaultTableModel model,File file) throws IOException {
		
		FileWriter out=new FileWriter(file);
		@SuppressWarnings("resource")
		BufferedWriter bw=new BufferedWriter(out);
		for(int i=0;i<model.getColumnCount();i++)
		{
			bw.write(model.getColumnName(i)+"\t");
		}
		bw.write("\n");
		for(int i=0;i<model.getColumnCount();i++)
		{
			for(int j=0;j<model.getColumnCount();j++)
			{
			bw.write(model.getValueAt(i,j).toString()+"\t");
			}
			bw.write("\n");
		}
		bw.close();
		System.out.print("file written to"+file);
		
		
		
	}

	
		
		
	
}
