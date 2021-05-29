import java.util.Scanner;

public class newDome{
	public static void main(String arg[]){
		int foot;
		int inch;
		Scanner io = new Scanner(System.in);
		foot = io.nextInt();
		inch = io.nextInt();
		System.out.println((foot + inch / 12.0) * 0.3048);
	}
}
