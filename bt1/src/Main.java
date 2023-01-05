import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập tên:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Xin chảo " + name);
    }
}