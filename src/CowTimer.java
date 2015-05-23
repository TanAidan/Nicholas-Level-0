import java.applet.AudioClip;
import java.io.IOException;

import javax.swing.JApplet;

public class CowTimer {
	/*
	 * This is an advanced recipe. There may be more than one line of code for
	 * each instruction.
	 */

	public static void main(String[] args) throws InterruptedException, IOException {
		CowTimer timer = new CowTimer();
		timer.setTime(0);
		timer.start();

	}

	private int minutes;

	public void setTime(int minutes) {
		this.minutes = minutes;
		System.out.println("Cow set to " + minutes + " minutes.");
	}

	public void start() throws InterruptedException, IOException {
		for (int i)
		Thread.sleep(60);
		System.out.println(minutes + " minutes left." );
		minutes -= 1;

		/*
		 * 3. When the timer is finished, use the playSound method to play a moo
		 * sound. You can download one from freesound.org, then drag it into
		 * your default package. Tell the students (by speaking) it's time to walk.
		 */
		if (minutes == 0) {
		playSound("moo");
		Thread.sleep(2000);
		Runtime.getRuntime().exec("Go Do Something!");
		}

	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet
				.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

private void speak(String stuffToSay) {
		try {
			Runtime.getRuntime().exec("say " + stuffToSay);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}

