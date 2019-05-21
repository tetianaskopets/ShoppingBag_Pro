import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.Console;

public class Untitled {

    public static double getCoupon(int Qty)
    {
        if (Qty < 10) {
            return 0.0;
        }
        else if (Qty >= 10 && Qty < 20) {
            return 10.0;
        }
        else
            return 20.0;
    }
    public static int getMaxPrice(double [] price) {
        double maxPrice = price[0];
        int max = 0;
        for (int i = 1; i < price.length; i++) {
            if (price[i] > maxPrice) {
                maxPrice = price[i];
                max = i;
            }
        }
        return max;
    }
    public static int getMinPrice(double [] price) {
        double minPrice = price[0];
        int min = 0;
        for (int i = 1; i < price.length; i++) {
            if (price[i] < minPrice) {
                minPrice = price[i];
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
        String [] itemName = new String[n];
        double [] itemPrice = new double[n];
        int [] itemQty = new int [n];
        double [] itemCpn = new double[n];
        double totalCost = 0.0;

        for (int i = 0; i<n; i++)
        {
            System.out.println("Enter the name of item " + (i+1));
            itemName[i]=console.next();
            System.out.println("Enter the price of " + (itemName[i]));
            itemPrice[i]=console.nextDouble();
            System.out.println("Enter the quantity of " + (itemName[i]));
            itemQty[i]=console.nextInt();
            itemCpn[i] = getCoupon(itemQty[i]);
            System.out.println("The discount for " + (itemName[i]) + " is " + f.format(itemCpn[i]) + "%");
            System.out.println("Total cost of " + (itemName[i]) + " is "
                    + f.format(getTotalCost(itemPrice[i],itemQty[i],itemCpn[i])) + "PLN");
            totalCost += getTotalCost(itemPrice[i],itemQty[i],itemCpn[i]);
        }
        System.out.println("Total cost of the full basket is " + f.format(totalCost) + "PLN");
        System.out.println("The most expensive item in the basket is " + itemName[getMaxPrice(itemPrice)]);
        System.out.println("The least expensive item in the basket is " + itemName[getMinPrice(itemPrice)]);

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

