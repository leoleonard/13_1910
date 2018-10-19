package two;

import java.util.*;

public class ChooseSorting {
    public static void main(String[] args) {
        List<Computer2> computers = Arrays.asList(
                new Computer2("Dell", 2600, 8),
                new Computer2("Asus", 2600, 8),
                new Computer2("Dell", 2000, 16),
                new Computer2("Predator", 4000, 16),
                new Computer2("Dell", 2600, 6),
                null
        );

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kryterium sortowania");
        String selection = scanner.nextLine();

        switch (selection) {
            case "name":
                ComparatorComputer comparatorComputer = new ComparatorComputer();
                Collections.sort(computers, comparatorComputer);
                break;
            case "ram":
                //
                break;
                default:
                    System.out.println("Podano złe kryterium sortowania");
        }

        System.out.println(computers);
    }

}
