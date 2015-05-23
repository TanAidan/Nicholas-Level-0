import java.io.IOException;


public class Bieber_Fever {

	public static void main(String[] args) throws IOException, InterruptedException {
		for (int i = 1; i <= 4; i++) {
			if ((i == 2) || (i == 4)) {
				Runtime.getRuntime().exec("say baby baby baby no");
			} else {
		Runtime.getRuntime().exec("say baby baby baby oh");
			}
			Thread.sleep(3000);
		
		}
	}
}

