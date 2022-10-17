
import java.util.Scanner;
public class ConvertDistance {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			int km=sc.nextInt();
			System.out.format("The distance in Miles: %.3f", (km*0.621371));
		}
		catch (Exception e){
			System.out.print("Enter an interger value:");
		}
		sc.close();
	}
}
