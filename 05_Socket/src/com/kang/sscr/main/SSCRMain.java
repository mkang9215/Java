package com.kang.sscr.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class SSCRMain {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(2713);
			ArrayList<Socket> sockets = new ArrayList<Socket>();

			while (true) {
				Socket s = ss.accept();
				sockets.add(s); 

				InputStream is = s.getInputStream();
				InputStreamReader isr = new InputStreamReader(is, "utf-8");
				BufferedReader br = new BufferedReader(isr);

				new Thread() {
					public void run() {
						try {
							String msg = br.readLine();

							for (Socket socket : sockets) {
								OutputStream os = socket.getOutputStream();
								OutputStreamWriter osw = new OutputStreamWriter(os, "utf-8");
								BufferedWriter bw = new BufferedWriter(osw);

								bw.write(msg + "\r\n");
								bw.flush();
							}
						} catch (IOException e) {
							e.printStackTrace();
						}
					};
				}.start();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
