import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        int i = 0;
        long factorial = 0;
        do {
            if (i == 0) {
                factorial = 1;
            } else {
                factorial += factorial * i;
            }
            i++;
        } while (factorial <= number);
        System.out.println(i);
    }
}