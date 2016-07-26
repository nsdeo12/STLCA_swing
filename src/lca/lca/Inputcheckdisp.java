package lca;

import javax.swing.JFrame;

public class Inputcheckdisp extends JFrame {

	    public Inputcheckdisp(){
	    	System.setProperty("java.awt.headless", "true");

	        this.setSize(600, 600); //The window Dimensions
	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        javax.swing.JPanel panel = new javax.swing.JPanel();
	        panel.setBounds(20, 20, 600, 600);
	        processing.core.PApplet sketch = new InputChecker4();
	        panel.add(sketch);
	        this.add(panel);
	        sketch.init(); //this is the function used to start the execution of the sketch
	        this.setVisible(true);
	       
	    }
	}
