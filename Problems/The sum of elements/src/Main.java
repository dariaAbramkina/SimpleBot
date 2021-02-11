import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        int  number;
        while ((number = scanner.nextInt()) != 0) {
            result += number;
        }
        System.out.println(result);
    }
}