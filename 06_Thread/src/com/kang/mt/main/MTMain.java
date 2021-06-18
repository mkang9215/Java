package com.kang.mt.main;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MTMain {
	public static void main(String[] args) {

		// MyThread (extends Thread)
		MyThread mt = new MyThread();
		mt.start(); 

		// MyThread2 (implements Runnable)
		Thread t2 = new Thread(new MyThread2());
		t2.start();

		// MyThread3 (anonymous inner class)
		Thread t3 = new Thread() {
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
						jta.append("MyThread3\r\n");
						Thread.sleep(800);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		t3.start();

		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("MAIN");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
