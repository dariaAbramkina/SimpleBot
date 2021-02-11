import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String outputString = inputString.replaceAll("a", "b");
        System.out.print(outputString);
    }
}