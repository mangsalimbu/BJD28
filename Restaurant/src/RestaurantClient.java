import java.util.*;

public class RestaurantClient {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("===========================================");
                System.out.println("=                1) Biryani               =");
                System.out.println("=                2) Drinks                =");
                System.out.println("=                3) Ice-Cream             =");
                System.out.println("=                4) Bill                  =");
                System.out.println("=                5) Exit                  =");
                System.out.println("===========================================");
                System.out.print("Enter your choice (number): ");
                int choice = scanner.nextInt();
                System.out.println();

                switch (choice) {
                    case 1:
                        BiryaniDetails b = new BiryaniDetails();
                        b.biryaniMenuDetails();
                        break;

                    case 2:
                        DrinksDetails d = new DrinksDetails();
                        d.DrinksMenuDetails();
                        break;

                    case 3:
                        IceDetails i = new IceDetails();
                        i.IceMenuDetails();
                        break;

                    case 4:
                        Bill bill = new Bill();
                        bill.finalBill();
                        break;

                    case 5:
                        System.out.println("Thank you for coming!");
                        System.exit(0);
                    
                    default:
                        System.out.println("~~~Choose a number between 1 to 5!~~~~");
                        System.out.println();
                }
            }
        }
    }
}