
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.Console;

public class ShoppingBag {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the new name of item1:");
        String item_1_name = input.next();

        System.out.println("Enter the new name of item2:");
        String item_2_name = input.next();

        double item_1_price = 14.5;
        System.out.println("Enter the new price for " + item_1_name);
        item_1_price = input.nextDouble();

        double item_2_price = 30.35;
        System.out.println("Enter the new price for " + item_2_name);
        item_2_price = input.nextDouble();

        int item_1_qty = 2;
        System.out.println("Enter the Qty of " + item_1_name);
        item_1_qty = input.nextInt();

        int item_2_qty = 3;
        System.out.println("Enter the Qty of " + item_2_name);
        item_2_qty = input.nextInt();

        DecimalFormat f = new DecimalFormat("##.00");
        double total_cost_1 = item_1_price*item_1_qty;
        double total_cost_2 = item_2_price*item_2_qty;

        System.out.println("Total cost of " +item_1_name + " is " + f.format(total_cost_1));
        System.out.println("Total cost of " +item_2_name + " is " + f.format(total_cost_2));

        double item_1_cpn = 0.1;
        System.out.println("Enter the Coupon for "+item_1_name+ " in %");
        item_1_cpn = input.nextDouble();

        double item_2_cpn = 0.25;
        System.out.println("Enter the Coupon for "+ item_2_name +" in %");
        item_2_cpn = input.nextDouble();

        double final_cost_1 = total_cost_1 - (total_cost_1*item_1_cpn/100);
        double final_cost_2 = total_cost_2 - (total_cost_2*item_2_cpn/100);

        System.out.println("Total cost of " +item_1_name + " with discount is " + f.format(final_cost_1));
        System.out.println("Total cost of " +item_2_name + " with discount is " + f.format(final_cost_2));
    }
}
