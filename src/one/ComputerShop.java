package one;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComputerShop {
    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<>();
        computers.add(new Computer("Dell", 2500, 1024));
        computers.add(new Computer("HP", 2500, 1024));
        computers.add(new Computer("HP", 2500, 512));
        computers.add(new Computer("HP", 1000, 2048));

        Collections.sort(computers);
        System.out.println(computers);
    }
}
