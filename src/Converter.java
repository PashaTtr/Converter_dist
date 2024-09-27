import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("jst type miles: ");
        double miles = scanner.nextDouble();
        System.out.println(miles + " miles = " + (miles * 1.60934) + " kilometers");

        System.out.print("and kilometers? : ");
        double kilometers = scanner.nextDouble();
        System.out.println(kilometers + " kilometers = " + (kilometers / 1.60934) + " miles");

        System.out.println("ver_1.001 release");
        scanner.close();
    }
}