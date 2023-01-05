import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số USD:");
        double usd = scanner.nextDouble();
        double vnd = usd*23000;
        System.out.println("giá trị vnd là: " + vnd + "đ");
    }
}