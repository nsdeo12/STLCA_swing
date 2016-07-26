package lca;


	import java.awt.Desktop;
	import java.net.URI;
	public class Read {

	    public static void main(String[] args) throws Exception {
	        String url = "C:\\Save\\3DXML\\Product_2015.12.21_14.58.32.3dxml";

	        if (Desktop.isDesktopSupported()) {
	            // Windows
	            Desktop.getDesktop().browse(new URI(url));
	        } else {
	            // Ubuntu
	            Runtime runtime = Runtime.getRuntime();
	            runtime.exec("/usr/bin/firefox -new-window " + url);
	        }
	    }
	}
	


