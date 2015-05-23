import org.teachingextensions.logo.Tortoise;

public class Starz {

	public static void main(String[] args) {

		// 1. Set the X position of the Tortoise so that it starts on the left. You also need to show the Tortoise to see the result of this line.
		Tortoise.setX(50);
		Tortoise.setY(50);
		Tortoise.show();
		Tortoise.setSpeed(10);

		// 2. Make the Tortoise draw a star shape. Hint: 144.
		for (int v = 0; v < 15; v++) {
		for (int f = 0; f < 15; f++) {
		for(int i = 0; i < 5; i++) {
			Tortoise.move(30);
			Tortoise.turn(144);
		}
		Tortoise.penUp();
		Tortoise.turn(90);
		Tortoise.move(50);
		Tortoise.turn(-90);
		Tortoise.penDown();
		}
		Tortoise.penUp();
		Tortoise.setX(50);
		Tortoise.setY(Tortoise.getY() + 50);
		Tortoise.setAngle(0);
		Tortoise.penDown();
	}

		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the Tortoise draw a line of stars like this:
		 * http://postimg.org/image/40rsesa8h/
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
