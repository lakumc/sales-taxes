package org.lastminute.lm.interview.sales;

import org.lastminute.lm.interview.utils.Utilities;

import static org.lastminute.lm.interview.utils.Utilities.fixedTwoDecimalRepresentation;

/**
* @Author Luca Miceli
*
*/
public class Item {

    //Net item price (without any tax)
    private Double price;
    private String name;
    //food,medicals and books are 10% tax free
    private boolean exempt;
    private boolean imported;

    public Item(Double price, String name, boolean exempt, boolean imported) {
        this.price = price;
        this.name = name;
        this.exempt = exempt;
        this.imported = imported;
    }

    public Item(Double price, String name) {
        this.price = price;
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isExempt() {
        return exempt;
    }

    public void setExempt(boolean exempt) {
        this.exempt = exempt;
    }

    public boolean isImported() {
        return imported;
    }

    public void setImported(boolean imported) {
        this.imported = imported;
    }

    public Double getTaxes(){
        Double taxes = 0D;

        if(!exempt){
            taxes+=Utilities.roundUpToNext05(price * 0.10D);
        }
        if(imported){
            taxes+=Utilities.roundUpToNext05(price * 0.05D);
        }

        return taxes;
    }

    public Double getPriceTaxIncluded(){
        return getPrice() + getTaxes();
    }

    @Override
    public String toString() {
        return "Item{" +
                "price=" + fixedTwoDecimalRepresentation(price) +
                ", name='" + name + '\'' +
                ", exempt=" + exempt +
                ", imported=" + imported +
                '}';
    }
}
