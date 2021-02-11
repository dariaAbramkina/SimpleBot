import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int outputCount = 0;
        String result  = "";
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= i; j++) {
                if (outputCount == count) {
                    break;
                }
                result += i + " ";
                outputCount++;
            }
        }
        System.out.print(result.trim());
    }
}