import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean isLeapYear;

        isLeapYear = year % 4 == 0;

        isLeapYear = isLeapYear && (year % 100 != 0 || year % 400 == 0);

        if (isLeapYear){
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }
    }
}