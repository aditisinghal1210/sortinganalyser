import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame {
	
	private static final long serialVersionUID =1L;
	
	private SortingPanel  panel = new SortingPanel();
	
	public Frame() {
		this.setTitle("Sorting Visualiser");
		this.getContentPane().setPreferredSize(new Dimension(1200,600));
		this.getContentPane().add(panel);
		this.pack();
		//this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	//private SortingPanel  panel = new SortingPanel();
	public SortingPanel getPanel() {
		return this.panel;
		
	}

}
