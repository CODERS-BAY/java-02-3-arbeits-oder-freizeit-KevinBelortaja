import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Aktuelle Uhrzeit eingeben:");
        int number = scan.nextInt();

        if (number == 12) {
            System.out.println("Mittagspause!");
        }

        else if (number >= 8 && number <= 16) {
            System.out.println("Die Stunde liegt in der Arbeitszeit");
        } else {
            System.out.println("Die Stunde liegt nicht in der Arbeitszeit");
        }


    }
}