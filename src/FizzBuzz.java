
public class FizzBuzz {

	public static void main(String[] args) {
		for(float i = 1; i <= 20; i++) {
			System.out.print(i);
			if (i % 3 == 0) {
				System.out.print(" Fizz");
			}
			if (i % 5 == 0) {
				System.out.print(" Buzz");
			}
			System.out.println("");
		}

	}

}
