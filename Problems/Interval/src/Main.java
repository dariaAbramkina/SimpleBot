import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String trueValue = "True";
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > -15 && number <= 12) {
            System.out.println(trueValue);
        } else {
            if (number > 14 && number < 17) {
                System.out.println(trueValue);
            } else {
                if (number >= 19) {
                    System.out.println(trueValue);
                } else {
                    System.out.println("False");
                }
            }
        }
    }
}
