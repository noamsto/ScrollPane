import java.awt.LayoutManager;

import javax.swing.JPanel;
import javax.swing.JScrollBar;

public class MyScrollerPane extends JPanel {

	JPanel inner;
	JScrollBar hS;
	JScrollBar vS;
	

	
	
	
	public MyScrollerPane() {
		// TODO Auto-generated constructor stub
	}

	public MyScrollerPane(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public MyScrollerPane(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public MyScrollerPane(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

}
