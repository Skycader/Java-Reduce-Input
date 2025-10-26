import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> items = new ArrayList<>();
        System.out.println("> Current array list: " + items);
        System.out.println("> Print q to exit finish");
        System.out.print("> Add to list: ");
        while (scanner.hasNextDouble()) {
            items.add(scanner.nextDouble());
            System.out.println("> Current array list: " + items);
            System.out.print("> Add to list: ");
        }

        System.out.println("> The array list sum is " + items.stream().reduce(Double::sum).orElse(0.0));
    }
}