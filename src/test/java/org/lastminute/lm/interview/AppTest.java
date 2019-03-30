package org.lastminute.lm.interview;

import org.junit.Test;
import org.lastminute.lm.interview.sales.Item;
import org.lastminute.lm.interview.sales.Receipt;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.lastminute.lm.interview.utils.Utilities.fixedTwoDecimalRepresentation;


/**
 * Unit test for simple App.
 */
public class AppTest
{


    @Test
    public void testApp()
    {
        //Create first item list
        List<Item> items1 = new ArrayList<>();
        items1.add(new Item(12.49D, "book", true, false));
        items1.add(new Item(14.99D, "music CD", false, false));
        items1.add(new Item(0.85D, "chocolate bar", true, false));

        System.out.println("Input 1: ");
        printItems(items1);
        System.out.println("");

        assertEquals( items1.size(), 3 );


        //Create second item list
        List<Item> items2 = new ArrayList<>();
        items2.add(new Item(10.00D, "imported box of chocolates", true, true));
        items2.add(new Item(47.50D, "imported bottle of perfume", false, true));

        System.out.println("Input 2: ");
        printItems(items2);
        System.out.println("");

        assertEquals( items2.size(), 2 );

        //Create third item list
        List<Item> items3 = new ArrayList<>();
        items3.add(new Item(27.99D, "imported bottle of perfume", false, true));
        items3.add(new Item(18.99D, "bottle of perfume", false, false));
        items3.add(new Item(9.75D, "packet of headache pills", true, false));
        items3.add(new Item(11.25D, "box of imported chocolates", true, true));

        System.out.println("Input 3: ");
        printItems(items3);
        System.out.println("");

        assertEquals( items3.size(), 4 );


        //Create first Receipt
        Receipt receipt1 = new Receipt(items1);
        System.out.println( "Output 1:"  );
        System.out.println( receipt1  );

        assertEquals(fixedTwoDecimalRepresentation(receipt1.getTotalSalesTaxes()), "1.50");
        assertEquals(fixedTwoDecimalRepresentation(receipt1.getTotalCost()), "29.83");


        //Create second Receipt
        Receipt receipt2 = new Receipt(items2);
        System.out.println( "Output 2:"  );
        System.out.println( receipt2  );
        assertEquals(fixedTwoDecimalRepresentation(receipt2.getTotalSalesTaxes()), "7.65");
        assertEquals(fixedTwoDecimalRepresentation(receipt2.getTotalCost()), "65.15");


        //Create third Receipt
        Receipt receipt3 = new Receipt(items3);
        System.out.println( "Output 3:"  );
        System.out.println( receipt3  );
        assertEquals(fixedTwoDecimalRepresentation(receipt3.getTotalSalesTaxes()), "6.70");
        assertEquals(fixedTwoDecimalRepresentation(receipt3.getTotalCost()), "74.68");



    }

    private void printItems(List<Item> items) {
        for (Item item : items) {
            System.out.println("1 " + item.getName() + " at " + fixedTwoDecimalRepresentation(item.getPrice()));
        }
    }
}
