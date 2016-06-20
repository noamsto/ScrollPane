import java.awt.Adjustable;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JPanel;
import javax.swing.JScrollBar;

public class MyScrollerPane extends JPanel implements AdjustmentListener, ComponentListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//all the necessary components.
	
	JPanel inner;	//view window, will hold the received window .
	JScrollBar hS;	//Horizontal scrollbar.
	JScrollBar vS;	//vertical scrollbar.
	Component window;	//the actual display window.

	
	public MyScrollerPane(Component c) {
		
		this.addComponentListener(this); //this will make sure resizing window updating scroll bars maximum value.

		window= c;	//get the display window.
		
		inner = new JPanel();	//will be used as a 'viewing window', window will be moved in relation to this component.
		inner.setLayout(null);	//disable layout manager.
		inner.add(window);		//add the window component.

		//setting scroll bars.
		hS= new JScrollBar(Adjustable.HORIZONTAL);	
		vS= new JScrollBar(Adjustable.VERTICAL);
		//create the adjustment listenrs, the main abilty.
		hS.addAdjustmentListener(this); 
		vS.addAdjustmentListener(this);
		//
		
		//added all the components.
		this.setLayout(new BorderLayout());	//set border layout.
		this.add(inner, BorderLayout.CENTER);
		this.add(hS, BorderLayout.SOUTH);
		this.add(vS, BorderLayout.WEST);
	
	}

	
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		
		//if a horizontal movment was made, update the location.
		if (e.getSource().equals(hS))
			window.setLocation( -e.getValue(), window.getY());
		
		//if a vertical movment was made, update the location.
		if (e.getSource().equals(vS))
			window.setLocation(window.getX(),-e.getValue());
		
	}

	
	@Override
	public void componentResized(ComponentEvent e) {
		//make sure the scroll bars maximum makes sense, comparing to actual viewed window.
		//also if windows resized, maximum of scrollbars is updated.
		if (window.getWidth()> this.getWidth())
			hS.setMaximum(window.getWidth()-this.getWidth());
		else
			hS.setMaximum(0);
		
		if (window.getHeight()> this.getHeight())
			vS.setMaximum(window.getHeight()-this.getHeight());
		else
			vS.setMaximum(0);			
	}


	@Override
	public void componentMoved(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void componentHidden(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}
}

