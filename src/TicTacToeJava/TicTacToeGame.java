package TicTacToeJava;
import java.util.Scanner;
public class TicTacToeGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Tic Tac Toe Game");
		board();
		ChooseMark();
	}

	public static void board() // creating a method
	{
		int i;
		char[] element;
		element = new char[10];
		for (i = 1; i < element.length; i++) {
			element[i] = '-';
		}

	}
	public static void ChooseMark()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Select your mark O or X : ");
		char usermark = sc.next().charAt(0);
		sc.close();
		char computermark;
		
		if (usermark == 'X') {
			computermark = 'O' ;
			System.out.println("Your mark is : "+usermark);
			System.out.println("Computer mark is : "+computermark);
		}
		else {
			computermark='X';
			System.out.println("Your mark is : "+usermark);
			System.out.println("Computer mark is : "+computermark);
		}
		
	}
}

