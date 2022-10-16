import java.util.*;
public class Add {
	static double sum(double n1,double n2)
	{return n1+n2;}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("For addition: \nEnter first number.");
		double n1=sc.nextDouble();
		System.out.println("Enter second number.");
		double n2=sc.nextDouble();
		System.out.println("n1+n2 = "+sum(n1,n2));
	}
}
