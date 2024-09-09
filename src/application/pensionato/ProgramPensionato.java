package application.pensionato;

import entities.pensionato.Room;

import java.util.Locale;
import java.util.Scanner;

public class ProgramPensionato {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        Room[] vect = new Room[10];

        for (int i=0; i<n; i++) {
            System.out.println("Rent #" + (i + 1));
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();

            vect[room] = new Room(name, email, room);
        }

        System.out.println("Busy rooms: ");
        for (int i=0; i<vect.length; i++) {

            if (vect[i] != null) {
                System.out.println((i + 1) + ". " + vect[i].getName() + ", " + vect[i].getEmail());
            }
        }
        sc.close();
    }
}
