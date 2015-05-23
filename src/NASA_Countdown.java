import java.io.IOException;

public class NASA_Countdown {
	public static void main(String[] args) throws IOException, InterruptedException {
		for (int i = 999999; i >= 0; i--) {
			if (i > 0) {
				System.out.println(i);
				Runtime.getRuntime().exec("say " + i);
			} else {
				System.out.println("Blast Off!");
				Runtime.getRuntime().exec("say Blast Off");
			}
		Thread.sleep(5000);
		}
	}
}
