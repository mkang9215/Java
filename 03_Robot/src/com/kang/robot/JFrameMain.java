package com.kang.robot;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JFrameMain {
	public static void main(String[] args) {
		// Android Application
		JFrame f = new JFrame("New Frame");
		
//		JTextField t = new JTextField();
//		f.add(t);
		
//		JFileChooser c = new JFileChooser();
//		f.add(c);
		
		JButton b = new JButton("Click!");
		f.add(b);		

		Click ck = new Click();		
		b.addActionListener(ck);
		
		f.setSize(500, 400);
		f.setVisible(true);
	}

}
