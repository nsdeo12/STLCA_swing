package lca;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;



	import java.applet.Applet;
	import java.awt.Color;
	import java.awt.Graphics;
	 
	public class neelzGraphics extends Applet{
	 
	        public void paint(Graphics g){
	               
	                //set color to red
	                setForeground(Color.red);
	               
	                /*
	                 * to draw a oval in an applet window use,
	                 * void drawOval(int x1,int y1, int width, int height)
	                 * method.
	                 *
	                 * This method draws a oval of specified width and
	                 * height at (x1,y1)
	                 */
	               
	                //this will draw a oval of width 50 & height 100 at (10,10)
	                g.drawOval(10,10,50,100);
	               
	               
	                /*
	                 * To draw a filled oval use
	                 * fillOval(int x1,int y1, int width, int height)
	                 * method of Graphics class.
	                 */
	               
	                //draw filled oval
	                g.fillOval(100,20,50,100);
	                g.drawLine(10,10,50,50);
	               
	        }
	}