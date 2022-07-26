package Main;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SmartWatch smartWatch = new SmartWatch("Samsung", 120);
        System.out.println("Watch successfully created");
        while (true) {
            System.out.println("Choose action\n1 - Set new time\n2 - Change prise\n3 - Change manufacture\n4 - Show information about watch" +
                    "\n5 - Escape\n");
            int choise = scanner.nextInt();
            switch (choise) {
                case 1 -> {
                    smartWatch.setTime(LocalTime.now());
                    System.out.println("Time successfully updated");
                }
                case 2->{
                    double prise;
                    System.out.println("Enter new prise");
                    prise = scanner.nextDouble();
                    smartWatch.setPrise(prise);
                    System.out.println("Prise successfully changed");}
                case 3->{String manufacture;
                    System.out.println("Enter new manufacture");
                    manufacture = scanner.next();
                    smartWatch.setProductName(manufacture);
                    System.out.println("Manufacture successfully changed");}
                case 4->System.out.println(smartWatch.toString());
                case 5->System.exit(0);


            }

        }
    }
}
