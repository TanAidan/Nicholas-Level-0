import java.io.IOException;


public class Fibonacci {

	public static void main(String[] args) throws InterruptedException, IOException {
		int num1 = 0;
		int num2 = 1;
		int currentnum = 0;
		int time = 1000;
		for (int i = 1; i < 25; i++) {
			currentnum = num1 + num2;
			System.out.println(currentnum);
			Runtime.getRuntime().exec("say " + currentnum);
			num1 = num2;
			num2 = currentnum;
			Thread.sleep(time);
			time += 100;
		}

	}

}
