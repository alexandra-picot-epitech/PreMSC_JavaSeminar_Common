package Factory;

import Observer.Customer;
import Observer.Order;

public class Test {
    public static void main ( String [] args ) {
        Factory f = new Factory();
        Elf li = new Elf(f);
        li.pack();
        li.pickPapers(3);
        li.pack();
        li.pickToy("gamboy");
        li.pack();
        li.pickToy("gameboy");
        li.pack();
        li.pack();
        li.pickToy("teddy");
        li.pack();
        li.pickToy("teddy");
        li.pack();
        li.pickToy("teddy");
        li.pickToy("teddy");
        li.pack();

        System.out.println();
        li.pickPapers(1);
        li.pack();

        System.out.println();
        li.pickPapers(0);
        li.pickToy("gameboy");
        li.pack();

    }
}
