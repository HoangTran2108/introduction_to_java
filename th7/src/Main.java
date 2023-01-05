import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;

        System.out.println("Nhập vào cân nặng:");
        weight = scanner.nextDouble();

        System.out.println("Nhập vào Chiều cao:");
        height = scanner.nextDouble();

        bmi = weight/(height*height);

        if (bmi < 18) {
            System.out.println("bmi là :" + bmi + ", Bạn thiếu cân");
        } else if (bmi < 25) {
            System.out.println("bmi là :" + bmi + ", Bạn bình thường");
        } else if (bmi < 30) {
            System.out.println("bmi là :" + bmi + ", Bạn thừa cân");
        } else {
            System.out.println("bmi là :" + bmi + ", Bạn béo phì");
        }
    }
}