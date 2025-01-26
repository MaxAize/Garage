package Main;
import Classes.*;
import DB.DB;
import java.util.Scanner;

public class MainScreen  {
    private final Scanner scanner = new Scanner(System.in);
    private final DB manager = new DB();

    private static Protocol_Garage protocolGarage = new Protocol_Garage() {
        @Override
        public void fixed(Vehicle v) {
            v.fixed();
        }
    };

    public  void start() {
     int i;
        while (true) {
            System.out.println("Please choose the type of vehicle:");
            System.out.println("1 - Car\n2 - Truck\n3 - Motorcycle\n-1 - Exit");
            System.out.print("Your choice: ");
           i=scanner.nextInt();

            if (i == -1) {
                System.out.println("Exiting... Thank you!");
                break;
            }

            System.out.print("Enter the vehicle name: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            switch (i) {
                case 1 : manager.addToData(new Car(name));
                break;
                case 2 : manager.addToData(new Truck(name));
                break;
                case 3 : manager.addToData(new Motorcycle(name));
                break;
                default: System.out.println("Invalid vehicle type! Please try again.");
            }
        }

        Garage g = new Garage(protocolGarage,manager.getData());
        System.out.println("starting to fix vehicles \n");

        g.start();
    }

    private int getUserInputAsInt() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid number.");
            return -2;
        }
    }




    }
