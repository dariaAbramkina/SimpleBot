import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();
        System.out.print(firstLine.trim().replaceAll(" ", "").equals(secondLine.trim().replaceAll(" ", "")));
    }
}