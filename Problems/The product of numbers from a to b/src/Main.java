import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        long  result = 1;
        for (int i = numberOne; i < numberTwo; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}