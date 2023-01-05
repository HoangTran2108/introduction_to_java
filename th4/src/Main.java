import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc nhất");
        System.out.println("cho pt bậc nhất 'a*x + b = c' nhập vào tham số:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = scanner.nextDouble();
        System.out.println("b: ");
        double b = scanner.nextDouble();
        System.out.println("c: ");
        double c = scanner.nextDouble();
        if (a!=0) {
            double x = (c - b) / a;
            System.out.println("PT có nghiệm x = " + x);
        }
        else {
            if (b==c) {
                System.out.println("PT vô số nghiệm");
            }
            else {
                System.out.println("PT vô nghiệm");
            }
            }
        }
    }