import java.util.*;

public class DrinksDetails {
    Scanner scanner = new Scanner(System.in);

    int totalCost = 0;

    public void DrinksMenuDetails() {
        while (true) {
            System.out.println("==============================================");
            System.out.println("=                1) Coca-Cola ($3)           =");
            System.out.println("=                2) Fanta ($2)               =");
            System.out.println("=                3) Water ($1)               =");
            System.out.println("=                4) Go Back                  =");
            System.out.println("==============================================");
            System.out.print("What kind of drink would you like? Select the number: ");
            int choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1: 
                    getCokePrice();
                    break;
                
                case 2:
                    getFantaPrice();
                    break;

                case 3:
                    getWaterPrice();
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

    public void getCokePrice() {
        int price = 3;

        System.out.print("How many would you like? ");
        int plateAmt = scanner.nextInt();

        int totalPrice = plateAmt * price;
        Bill.priceVariable += totalPrice;
        System.out.println("For " + plateAmt + " coke(s), it will be $" + totalPrice);
        System.out.println();
        System.out.println("Anything else you'd like?: ");
    }

    public void getFantaPrice() {
        int price = 2;

        System.out.print("How many plates would you like? ");
        int plateAmt = scanner.nextInt();

        int totalPrice = plateAmt * price;
        Bill.priceVariable += totalPrice;
        System.out.println("For " + plateAmt + " fanta(s), it will be $" + totalPrice);
        System.out.println();
        System.out.println("Anything else you'd like?: ");
    }

    public void getWaterPrice() {
        int price = 1;

        System.out.print("How many plates would you like? ");
        int plateAmt = scanner.nextInt();

        int totalPrice = plateAmt * price;
        Bill.priceVariable += totalPrice;
        System.out.println("For " + plateAmt + " water(s), it will be $" + totalPrice);
        System.out.println();
        System.out.println("Anything else you'd like?: ");
    }
}
