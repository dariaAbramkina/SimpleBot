import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentsInFirstClass = scanner.nextInt();
        int studentsInSecondClass = scanner.nextInt();
        int studentsInThirdClass = scanner.nextInt();
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        result1 = studentsInFirstClass % 2 == 0 ? studentsInFirstClass / 2 : studentsInFirstClass / 2 + 1;
        result2 = studentsInSecondClass % 2 == 0 ? studentsInSecondClass / 2 : studentsInSecondClass / 2 + 1;
        result3 = studentsInThirdClass % 2 == 0 ? studentsInThirdClass / 2 : studentsInThirdClass / 2 + 1;
        System.out.println(result1 + result2 + result3);
        }
    }
