import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

	public static void main(String[] args) {
		Robot h = new Robot();
		// 3. ask the user what color they would like the Robot to draw
		String color = JOptionPane.showInputDialog("What color do you want your square to be?");
		// 4. use an if/else statement to set the pen color that the user
		// requested (minimum of 2 colors)
		if (color.equalsIgnoreCase("Red")) {
			h.setPenColor(255, 0, 0);
		} else if (color.equals("Blue")) {
			h.setPenColor(0, 0, 255);
		}
		// 2. set the pen width to 10
		h.penDown();
		h.setPenWidth(10);
		h.setSpeed(10);
		// 1. make the Robot draw a shape
		for (int i = 0; i < 4; i++) {
			h.move(100);
			h.turn(90);
		}
	}

}
