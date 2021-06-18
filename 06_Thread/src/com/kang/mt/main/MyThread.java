package com.kang.mt.main;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyThread extends Thread {
	@Override
	public void run() {
		super.run();
		JFrame jf = new JFrame("mt");
		JTextArea jta = new JTextArea();
		jf.add(jta);
		jf.setSize(300, 300);
		jf.setVisible(true);
		
		for (int i = 0; i < 10; i++) {
			try {
				jta.append("MyThread1\r\n");
				Thread.sleep(800);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
