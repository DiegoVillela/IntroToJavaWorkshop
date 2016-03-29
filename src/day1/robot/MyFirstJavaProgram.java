package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {

		// START HERE
		Robot Hi = new Robot();
		for (int i = 0; i < 100; i++) {
			Hi.setPenColor(Color.cyan);
			Hi.penDown();
			Hi.setSpeed(100);
			Hi.move(50);
			Hi.turn(45);
			Hi.setPenColor(Color.GREEN);
			Hi.hide();
			Hi.show();
		}

	}
}
