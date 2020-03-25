package academy.learnprogramming;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		System.out.println(Doctor.intro());
		var UserInput = "";

		while (!UserInput.equalsIgnoreCase("quit")) {
			UserInput = scanner.nextLine();
			String response = Doctor.response(UserInput);
			System.out.println(response);
		}
		scanner.close();
	}
}
