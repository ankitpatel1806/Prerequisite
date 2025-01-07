import java.util.Scanner;
public class Addtwonumber{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two number for addition :-");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = a+b;
		System.out.println("Answer : " + c);
		scanner.close();

	}
}