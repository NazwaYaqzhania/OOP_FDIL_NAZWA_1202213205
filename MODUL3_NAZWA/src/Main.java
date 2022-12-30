import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculation h = new Calculation();
        Thread thread = new Thread(h);
        Scanner sc = new Scanner(System.in);
        boolean repeat = true;
        do {
            System.out.println("\n==Menu Program==");
            System.out.println("1. Square");
            System.out.println("2. Circle");
            System.out.println("3. Trapezoid");
            System.out.print("Select menu : ");
            try {
                int menu = sc.nextInt();
                System.out.println();
                switch (menu) {
                    case 1:
                        System.out.print("Enter the length of the side of the square : ");
                        double sisi = sc.nextDouble();
                        h.setSquare(sisi);

                       
                        thread.start();
                        thread.join();

                        System.out.println("\nThe calculation result: " + h.getSquare());
                        break;
                    case 2:
                        System.out.print("Enter the radius of the circle : ");
                        double jari = sc.nextDouble();
                        h.setCircle(jari);

                        thread.start();
                        thread.join();

                        System.out.println("\nThe calculation result: " + h.getCircle());
                        break;
                    case 3:
                        System.out.print("Insert the side of the base of the trapezoid : ");
                        double alas = sc.nextDouble();
                        System.out.print("Enter the upper side of the trapezoid : ");
                        double atas = sc.nextDouble();
                        System.out.print("Enter the height of the trapezoid : ");
                        double tinggi = sc.nextDouble();
                        h.setTrapezoid(alas, atas, tinggi);

                        thread.start();
                        thread.join();

                        System.out.println("\nThe calculation result: " + h.getTrapezoid());
                        break;
                    case 0:
                        System.out.println("The program is finished");
                    default:
                        System.out.println("\nOptions not available\n");

                        continue;
                }
                repeat = false;

            } catch (InputMismatchException e) {
                System.out.println("\n====Error: Input must be a number====\n");
                sc.next();
            } catch (IllegalArgumentException e) {
                System.out.println();
                System.out.println(e);
                System.out.println();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        } while (repeat);
        sc.close();
    }
}
