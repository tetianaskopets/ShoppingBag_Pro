
import java.text.DecimalFormat;

public class ShoppingBag {
    public static void main(String[] args) {
        String item_1_name = "Cereals";
        String item_2_name =  "Cheese";
        double item_1_price = 14.5;
        double item_2_price = 30.35;
        int item_1_qty = 2;
        int item_2_qty = 3;
        DecimalFormat f = new DecimalFormat("##.00");
        double total_cost_1 = item_1_price*item_1_qty;
        double total_cost_2 = item_2_price*item_2_qty;

        System.out.println("Total cost of " +item_1_name + " is " + f.format(total_cost_1));
        System.out.println("Total cost of " +item_2_name + " is " + f.format(total_cost_2));

        double item_1_cpn = 0.1;
        double item_2_cpn = 0.25;

        double final_cost_1 = total_cost_1 - total_cost_1*item_1_cpn;
        double final_cost_2 = total_cost_2 - total_cost_2*item_2_cpn;

        System.out.println("Total cost of " +item_1_name + " with discount is " + f.format(final_cost_1));
        System.out.println("Total cost of " +item_2_name + " with discount is " + f.format(final_cost_2));
    }
}
