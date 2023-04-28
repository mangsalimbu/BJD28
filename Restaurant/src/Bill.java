public class Bill {

    public static int priceVariable = 0;
    
    public void finalBill() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("The total price is: $" + priceVariable);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        priceVariable = 0;
    }
}
