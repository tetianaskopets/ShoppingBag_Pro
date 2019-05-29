import java.text.DecimalFormat;
import java.util.*;
import java.io.Console;
import java.lang.InterruptedException;

public class Class_6 {
    public static void main(String[] args) throws InterruptedException {
        String fruit = "banana";
        char letter = fruit.charAt(0);
        System.out.println(letter);
        System.out.println(fruit.length());

        int ind = 0;
        int count = 0;

        while (ind < fruit.length())
        {
            if (fruit.charAt(ind) == 'a')
            count+=1;
            System.out.print(fruit.charAt(ind));
            ind++;
        }
        System.out.println();
        System.out.println("Number of a is "+ count);

        int x = 0;

        do {
            x++;
            System.out.println(x);
        }
        while (x < 5);

        for (int i=1; i<=5; i++)
        {
        //    Thread.sleep(500);
            if ((i)%2 ==0) {
                System.out.println(i + " is even");
            }
            else
            {
                System.out.println(i + " is odd");
            }

        }

        String [] array = new String [] {"Apple", "Banana", "Pear"};

        int y = 2;
        while (y>=0)
        {
            System.out.println(array[y]);
            y--;
        }
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the number of numbers");
        int n = console.nextInt();
        int numArray [] = new int [n];
        List<Integer> numbersList = new ArrayList<>();


        System.out.println("Enter " + n + " int values");
        for (int i = 0; i< n; i++)
        {
            numArray[i] = console.nextInt();
            numbersList.add(numArray[i]);

        }
        Arrays.sort(numArray);
        Collections.sort(numbersList);


        System.out.println((Arrays.toString(numArray)));
        System.out.println(numbersList);


    }
}
