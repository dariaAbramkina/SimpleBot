import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int heightOfVerticalPole = scanner.nextInt();
        int feetUpPerDay = scanner.nextInt();
        int feetDownPerNight = scanner.nextInt();
        int result = 0;
        int daysCount = 0;
        while (result <= heightOfVerticalPole) {
            result += feetUpPerDay;
            daysCount++;
            if (result < heightOfVerticalPole) {
                result -= feetDownPerNight;
            } else {
                break;
            }
        }
        System.out.println(daysCount);
    }
}
