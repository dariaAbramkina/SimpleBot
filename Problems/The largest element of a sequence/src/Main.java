import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int  number;
        while ((number = scanner.nextInt()) != 0) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println(max);
    }
}