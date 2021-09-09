package com.kang.ss.main;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTextArea;

// Server
public class SocketServer {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(2713);
			System.out.println("Waiting");
			Socket s = ss.accept();
			System.out.println("Client connected");

			InputStream is = s.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);

			OutputStream os = s.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os, "utf-8");
			BufferedWriter bw = new BufferedWriter(osw);

			Scanner k = new Scanner(System.in);

			JFrame jf = new JFrame("mt");
			JTextArea jta = new JTextArea();
			jf.add(jta);
			jf.setSize(300, 300);
			jf.setVisible(true);
			
			// Receive
			new Thread() {
				public void run() {
					while (true) {
						try {
							jta.append(br.readLine() + "\r\n");
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				};
			}.start();

			// Send
			while (true) {
				System.out.print("What to send : ");
				String cmt = k.next();
				bw.write("Me)" + cmt + "\r\n");
				bw.flush();
			}
		} catch (Exception e) {
		}
	}
}
