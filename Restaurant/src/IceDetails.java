import java.util.*;

public class IceDetails {
    Scanner scanner = new Scanner(System.in);

    int totalCost = 0;

    public void IceMenuDetails() {
        while (true) {
            System.out.println("==============================================");
            System.out.println("=                1) Vanilla ($4)             =");
            System.out.println("=                2) Chocolate ($5)           =");
            System.out.println("=                3) Caramel ($6)             =");
            System.out.println("=                4) Go Back                  =");
            System.out.println("==============================================");
            System.out.print("What kind of ice cream would you like? Select the number: ");
            int choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1: 
                    getVanillaPrice();
                    break;
                
                case 2:
                    getChocolatePrice();
                    break;

                case 3:
                    getCaramelPrice();
                    break;

                case 4:
                    RestaurantClient.main(null);
                    break;

                default:
                    System.out.println("~~~Choose a number between 1 to 4!~~~~");
                    System.out.println();

            }
        }
    }

    public void getVanillaPrice() {
        int price = 4;

        System.out.print("How many would you like? ");
        int plateAmt = scanner.nextInt();

        int totalPrice = plateAmt * price;
        Bill.priceVariable += totalPrice;
        System.out.println("For " + plateAmt + " vanilla ice cream(s), it will be $" + totalPrice);
        System.out.println();
        System.out.println("Anything else you'd like?: ");
    }

    public void getChocolatePrice() {
        int price = 5;

        System.out.print("How many plates would you like? ");
        int plateAmt = scanner.nextInt();

        int totalPrice = plateAmt * price;
        Bill.priceVariable += totalPrice;
        System.out.println("For " + plateAmt + " chocolate ice cream(s), it will be $" + totalPrice);
        System.out.println();
        System.out.println("Anything else you'd like?: ");
    }

    public void getCaramelPrice() {
        int price = 6;

        System.out.print("How many plates would you like? ");
        int plateAmt = scanner.nextInt();

        int totalPrice = plateAmt * price;
        Bill.priceVariable += totalPrice;
        System.out.println("For " + plateAmt + " caramel ice cream(s), it will be $" + totalPrice);
        System.out.println();
        System.out.println("Anything else you'd like?: ");
    }

    public void closeScanner() {
        scanner.close();
    }
}
