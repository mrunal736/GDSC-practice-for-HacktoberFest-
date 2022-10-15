import java.util.Scanner;
public class Sample{
  public static void main(String args[]){
    System.out.println("it's a sample java program");
    double kilometers;
System.out.println("Please enter the kilometers");
Scanner in = new Scanner(System.in);
kilometers = in.nextDouble();
double miles = kilometers / 1.609;
System.out.println(miles + " miles");
in.close();
  }
}
