package org.lastminute.lm.interview;

import org.lastminute.lm.interview.sales.Item;
import org.lastminute.lm.interview.sales.Receipt;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Luca Miceli
 * The Application that print the requested outputs
 * from each input
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Create first item list
        List<Item> items1 = new ArrayList<>();
        items1.add(new Item(12.49D, "book", true, false));
        items1.add(new Item(14.99D, "music CD", false, false));
        items1.add(new Item(0.85D, "chocolate bar", true, false));

        //Create first Receipt
        Receipt receipt1 = new Receipt(items1);
        System.out.println( "Output 1:"  );
        System.out.println( receipt1  );

        //Create second item list
        List<Item> items2 = new ArrayList<>();
        items2.add(new Item(10.00D, "imported box of chocolates", true, true));
        items2.add(new Item(47.50D, "imported bottle of perfume", false, true));

        //Create second Receipt
        Receipt receipt2 = new Receipt(items2);
        System.out.println( "Output 2:"  );
        System.out.println( receipt2  );

        //Create third item list
        List<Item> items3 = new ArrayList<>();
        items3.add(new Item(27.99D, "imported bottle of perfume", false, true));
        items3.add(new Item(18.99D, "bottle of perfume", false, false));
        items3.add(new Item(9.75D, "packet of headache pills", true, false));
        items3.add(new Item(11.25D, "box of imported chocolates", true, true));

        //Create third Receipt
        Receipt receipt3 = new Receipt(items3);
        System.out.println( "Output 3:"  );
        System.out.println( receipt3  );

    }
}
