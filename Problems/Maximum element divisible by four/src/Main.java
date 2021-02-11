import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfLines = scanner.nextInt();
        int maxElement = 0;
        for (int i = 0; i < countOfLines; i++) {
            int number = scanner.nextInt();
            if (number % 4 == 0 && number > maxElement) {
                maxElement = number;
            }
        }
        System.out.println(maxElement);
    }
}