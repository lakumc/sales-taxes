package org.lastminute.lm.interview.utils;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * @Author Luca Miceli
 *
 */
public class Utilities {

    public static Double roundUpToNext05(Double toRoundUP){
        Double scarto = toRoundUP % 0.05D;
        Double division = toRoundUP / 0.05D;
        Double result = toRoundUP;
        if(scarto!=0){
            result = twoDecimalRound(Math.ceil(division) * 0.05D);
        }
        return result;
    }

    public static Double twoDecimalRound(Double num){
        return Math.round(num * 100.0D) / 100.0D;
    }

    public static String fixedTwoDecimalRepresentation(Double num){
        //This is to get dot as decimal separator
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
        DecimalFormat df = (DecimalFormat)numberFormat;
        df.setMinimumFractionDigits(2);
        df.setMaximumFractionDigits(2);
        return df.format(num);
    }
}
