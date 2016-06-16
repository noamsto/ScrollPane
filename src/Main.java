import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {


		JFrame app = new JFrame();	//the containing app.
		
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close operation.
		app.setPreferredSize(new Dimension(800, 600));		//set a size for the genral window.
		
		JLabel myPic = new JLabel();	//prepare a picture label.
		ImageIcon img = new ImageIcon("cat.jpg");	//open image with image icon.
		myPic.setIcon(img);	//set the label to hold the picture.
		myPic.setSize(new Dimension(img.getIconWidth(), img.getIconHeight()));	//set the size of the label to the picture size.

		MyScrollerPane msp= new MyScrollerPane(myPic);	//create the scroll panel, added the picture to it.
		
		app.add(msp);	//add this app the scroll panel.
		app.pack();		//pack it and show.
		app.setVisible(true);
		
	}

}
