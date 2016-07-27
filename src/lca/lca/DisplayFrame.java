package lca;

import javax.swing.JFrame;
<<<<<<< HEAD
import javax.swing.JButton;
=======
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544

public class DisplayFrame extends JFrame {

	    public DisplayFrame(){
	        this.setSize(600, 600); //The window Dimensions
	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        javax.swing.JPanel panel = new javax.swing.JPanel();
	        panel.setBounds(20, 20, 600, 600);
<<<<<<< HEAD
	        
	        JButton btnNewButton = new JButton("New button");
	        panel.add(btnNewButton);
	        processing.core.PApplet sketch = new Dynmaps10();
	        panel.add(sketch);
	        getContentPane().add(panel);
=======
	        processing.core.PApplet sketch = new Dynmaps10();
	        panel.add(sketch);
	        this.add(panel);
>>>>>>> 052e90c55c11f16722fa35cb2ef19c090c5b1544
	        sketch.init(); //this is the function used to start the execution of the sketch
	        this.setVisible(true);
	    }
	}


