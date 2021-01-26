import javax.swing.JFrame;
import javax.swing.JTextArea;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditor extends JFrame implements ActionListener{
	JTextArea codeplacev;
	
	TextEditor(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("SpaceEditor.JAVA 0.1");
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		codeplacev = new JTextArea();
		this.add(codeplacev);
		
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		
	}
}
