import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số đại diện loại tiền muốn quy đổi (0: USD -> VND; 1: VND -> USD");
        double type = scanner.nextDouble();
        if (type == 0) {
            System.out.println("Nhập vào số USD:");
            double usd = scanner.nextDouble();
            double vnd = usd*23000;
            System.out.println("giá trị vnd là: " + vnd + "đ");
        } else if (type == 1) {
            System.out.println("Nhập vào số VND:");
            double vnd = scanner.nextDouble();
            double usd = vnd/23000;
            System.out.println("giá trị USD là: " + usd + "đ");
        }
    }
}