package two;

import java.util.Comparator;
import java.util.Scanner;

public class ComparatorComputer implements Comparator<Computer2> {

    @Override
    public int compare(Computer2 p1, Computer2 p2) {
        if(p1 == null && p2 == null)
            return 0;
        if(p1 == null && p2 != null)
            return -1;
        if(p1 != null && p2 == null)
            return 1;

         if (p1.getName() != null && p2.getName() != null)
            return p1.getName().compareTo(p2.getName());
        else if (p1.getName() != null && p2.getName() == null)
            return 1;
        else if (p1.getName() == null && p2.getName() != null)
            return -1;
        else
            return p1.getName().compareTo(p2.getName());
    }
}
