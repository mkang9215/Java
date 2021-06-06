package com.kang.robot;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Random;

public class RobotMain {
	public static void main(String[] args) throws AWTException, InterruptedException {
		Robot r = new Robot();
		Random rr = new Random();
		
		while (true) {
			r.mouseMove(rr.nextInt(1000), rr.nextInt(1000));
			Thread.sleep(1000);
		}

//		r.mouseMove(0, 0);
//		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		
//		r.keyPress(KeyEvent.VK_ALT);
//		r.keyPress(KeyEvent.VK_F4);
//		r.keyRelease(KeyEvent.VK_ALT);
//		r.keyRelease(KeyEvent.VK_F4);
		
	}

}
