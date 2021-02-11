import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int durationDays = scanner.nextInt();
        int foodPerDayCoast = scanner.nextInt();
        int oneWayFlightTicket = scanner.nextInt();
        int costOneNight = scanner.nextInt();
        System.out.println(2 * oneWayFlightTicket + durationDays * foodPerDayCoast
                + (durationDays - 1) * costOneNight);
    }
}