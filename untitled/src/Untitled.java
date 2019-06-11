import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.Console;
import com.ubs.wit.codered.Item;

public class Untitled {

    public static double getCoupon(int Qty)
    {
        if (Qty < 10) {
            return 0.0;
        }
        else if ( Qty < 20) {
            return 10.0;
        }
        else
            return 20.0;
    }
    public static int getMaxPrice(Item [] items) {
        double maxPrice = items[0].getPrice();
        int max = 0;
        for (int i = 1; i < items.length; i++) {
            if (items[i].getPrice() > maxPrice) {
                maxPrice = items[i].getPrice();
                max = i;
            }
        }
        return max;
    }
    public static int getMinPrice(Item [] items) {
        double minPrice = items[0].getPrice();
        int min = 0;
        for (int i = 1; i < items.length; i++) {
            if (items[i].getPrice() < minPrice) {
                minPrice = items[i].getPrice();
                min = i;
            }
        }
        return min;
    }
    public static double getTotalCost(double Price, int Qty, double Cpn)
    {
        return Price * Qty -  (Price * Qty* Cpn / 100.0);
    }
    public static double getDiscountByPromoCode(String promoCode)
    {
        if (promoCode.equals("A")) {
            return 5.0;
        }
        else if (promoCode.equals("B")) {
            return 15.0;
        }
        else if (promoCode.equals("C")) {
            return 20.0;
        }
        else return 0.0;
    }
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("##.00");

        System.out.println("Enter the number of items in the shop list");

        int n = console.nextInt();
        Item [] items = new Item[n];

        double totalCost = 0.0;

        for (int i = 0; i<n; i++)
        {
            items[i] = new Item();
            System.out.println("Enter the name of item " + (i+1));
            String name = console.next();
            items[i].setName(name);

           System.out.println("Enter the price of " + (items[i].getName()));
            items[i].setPrice(console.nextDouble());

            System.out.println("Enter the quantity of " + (items[i].getName()));
            items[i].setQuantity(console.nextInt());

            items[i].setCoupon(getCoupon(items[i].getQuantity()));
            System.out.println("The coupon for " + (items[i].getName()) + " is " + f.format(items[i].getCoupon()) + "%");

            System.out.println("Total cost of " + (items[i].getName()) + " with coupon is "
                    + f.format(getTotalCost(items[i].getPrice(),items[i].getQuantity(),items[i].getCoupon())) + "PLN");
            totalCost += getTotalCost(items[i].getPrice(),items[i].getQuantity(),items[i].getCoupon());
        }

        System.out.println("Total cost of the full basket is " + f.format(totalCost) + "PLN");
        System.out.println("***** Costs Statistics *****");
        int max = getMaxPrice(items);
        int min = getMinPrice(items);
        System.out.println("The most expensive item in the basket is " + items[max].getName() + " "
                + items[max].getPrice()+ " PLN");
        System.out.println("The least expensive item in the basket is " + items[min].getName()+ " "
                + items[min].getPrice()+ " PLN");

        System.out.println("Enter the promo code ");
        String promoCode = console.next();

        double additionalDiscount = getDiscountByPromoCode(promoCode);
        if (additionalDiscount > 0.0)
        {
            totalCost = totalCost - totalCost*additionalDiscount/100.0;
            System.out.println("You have additional discount " + additionalDiscount + "%");
            System.out.println("The total costs with additional discount is " + totalCost + "PLN");
        }
        else
            System.out.println("You dont have additional discount :(");


    }
}

