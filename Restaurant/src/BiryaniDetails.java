import java.util.*;

public class BiryaniDetails {
    Scanner scanner = new Scanner(System.in);

    int totalCost = 0;

    public void biryaniMenuDetails() {
        while (true) {
            System.out.println("==============================================");
            System.out.println("=                1) Chicken ($10)            =");
            System.out.println("=                2) Veg ($9)                 =");
            System.out.println("=                3) Mutton ($11)             =");
            System.out.println("=                4) Go Back                  =");
            System.out.println("==============================================");
            System.out.print("What kind of biryani would you like? Select the number: ");
            int choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1: 
                    getChickenPrice();
                    break;
                
                case 2:
                    getVegPrice();
                    break;

                case 3:
                    getMuttonPrice();
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

    public void getChickenPrice() {
        int price = 10;

        System.out.print("How many plates would you like? ");
        int plateAmt = scanner.nextInt();

        int totalPrice = plateAmt * price;
        Bill.priceVariable += totalPrice;
        System.out.println("For " + plateAmt + " of chicken biryani, it will be $" + totalPrice);
        System.out.println();
        System.out.println("Anything else you'd like?: ");
    }

    public void getVegPrice() {
        int price = 9;

        System.out.print("How many plates would you like? ");
        int plateAmt = scanner.nextInt();

        int totalPrice = plateAmt * price;
        Bill.priceVariable += totalPrice;
        System.out.println("For " + plateAmt + " of veg biryani, it will be $" + totalPrice);
        System.out.println();
        System.out.println("Anything else you'd like?: ");
    }

    public void getMuttonPrice() {
        int price = 11;

        System.out.print("How many plates would you like? ");
        int plateAmt = scanner.nextInt();

        int totalPrice = plateAmt * price;
        Bill.priceVariable += totalPrice;
        System.out.println("For " + plateAmt + " of mutton biryani, it will be $" + totalPrice);
        System.out.println();
        System.out.println("Anything else you'd like?: ");
    }

    public void closeScanner() {
        scanner.close();
    }
}
