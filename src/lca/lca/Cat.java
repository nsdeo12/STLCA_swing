package lca;
import java.io.*; 

public class Cat{ 
  public  static Process run(String path)
  { 
    Runtime r= Runtime.getRuntime(); 
    Process pro=null; 
    try 
    { 
     // String s="C:\\Program Files\\Dassault Systemes\\B24\\win_b64\\code\\bin\\CATSTART.exe" ; 
      pro=r.exec(path); 
      return pro;
    } 
    catch(Exception e){ 
      System.out.println("error==="+e.getMessage()); 
      e.printStackTrace(); 
      return null; 
    }
	
  } 
}



