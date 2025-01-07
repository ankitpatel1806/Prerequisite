import java.util.Scanner;
public class Celsiustofahrenheit{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the temperature in Celsius: ");
        double c = scanner.nextDouble();
        double f = (c * 9 / 5) + 32;
        System.out.println("In Fahrenheit is: " + f);
        scanner.close();
    }
}
