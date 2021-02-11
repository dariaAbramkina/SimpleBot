import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        int buffer = scanner.nextInt();
        int numberNext;
        int marker1 = 0;
        int marker2 = 0;
        int i = 0;
        while ((numberNext = scanner.nextInt()) != 0) {
            if (numberNext >= buffer) {
                buffer = numberNext;
                marker1++;
            } else {
                if (numberNext <= buffer) {
                    buffer = numberNext;
                    marker2++;
                }
            }
            i++;
        }
        if (marker1 == i || marker2 == i) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }
    }
}