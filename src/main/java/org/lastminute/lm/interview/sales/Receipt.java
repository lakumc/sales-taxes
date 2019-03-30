package org.lastminute.lm.interview.sales;

import java.util.List;

import static org.lastminute.lm.interview.utils.Utilities.fixedTwoDecimalRepresentation;
/**
 * @Author Luca Miceli
 *
 */
public class Receipt {

    private List<Item> items;

    public Receipt(List<Item> items) {
        this.items = items;
    }

    public Double getTotalSalesTaxes(){
        return items.stream().mapToDouble(Item::getTaxes).sum();
    }

    public Double getTotalCost(){
        return items.stream().mapToDouble(Item::getPriceTaxIncluded).sum();
    }

    @Override
    public String toString() {
        String stringRepresentation = new String();

        for(Item item:items){
            stringRepresentation+= "1 " + item.getName() + ": " + fixedTwoDecimalRepresentation(item.getPriceTaxIncluded()) + "\n";
        }
        stringRepresentation+= "Sales Taxes: " + fixedTwoDecimalRepresentation(getTotalSalesTaxes()) + "\n";
        stringRepresentation+= "Total: " + fixedTwoDecimalRepresentation(getTotalCost()) + "\n";

        return stringRepresentation;

    }
}
