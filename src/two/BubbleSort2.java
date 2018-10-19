package two;

import two.Computer2;

import javax.security.sasl.SaslClient;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BubbleSort2 {

    public static void main(String[] args) {

        Computer2[] computers = new Computer2[]{
                new Computer2("Dell", 2600, 8),
                new Computer2("Asus", 2600, 8),
                new Computer2("Dell", 2000, 16),
                new Computer2("Predator", 4000, 16),
                new Computer2("Dell", 2600, 6)
        };


        boolean whereChanges;

        do {
            whereChanges = false;
            for (int i = 0; i < computers.length - 1; i++) {
                Computer2 c1 = computers[i];
                Computer2 c2 = computers[i + 1];

                int compareResult = compareTo(c1, c2);

                if (compareResult > 0) {
                    swapElements(computers, i);
                    whereChanges = true;
                }

            }
        } while (whereChanges);


        String arrayAsString = Arrays.toString(computers);
        System.out.println(arrayAsString);

    }

    private static int compareTo(Computer2 c1, Computer2 c2) {
        if(c1.getCpuMhz() > c2.getCpuMhz()) {
            return 1;
        } else if(c1.getCpuMhz() == c2.getCpuMhz()) {

            if(c1.getRam() > c2.getRam()) {
                return 1;
            } else if(c1.getRam() == c2.getRam()) {
                return c1.getName().compareTo(c2.getName());
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }

    private static void swapElements(Computer2[] computers, int i) {
        Computer2 temp = computers[i];
        computers[i] = computers[i + 1];
        computers[i + 1] = temp;
    }
}