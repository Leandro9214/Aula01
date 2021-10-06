import java.util.Scanner;

public class LendoDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome!");
		System.out.println("Please, what is your name? ");
		
		Scanner input = new Scanner(System.in);
		
		String nome = input.next();
		
		System.out.println("Pleased to meet you " + nome);
		
		input.close();
		
	}

}
