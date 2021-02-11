import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();
        if (numberOne >= numberTwo && numberOne <= numberThree ||
                numberOne <= numberTwo && numberOne >= numberThree) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}