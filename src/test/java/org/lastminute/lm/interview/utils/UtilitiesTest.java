package org.lastminute.lm.interview.utils;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class UtilitiesTest {

    @Test
    public void testRoundUp() throws IOException {
        assertEquals(Utilities.roundUpToNext05(11.05D) , new Double(11.05D));
        assertEquals(Utilities.roundUpToNext05(1.16D) , new Double(1.20D));
        assertEquals(Utilities.roundUpToNext05(110.001D) , new Double(110.05D));
        assertEquals(Utilities.roundUpToNext05(0.235D) , new Double(0.25D));
        assertEquals(Utilities.roundUpToNext05(10.8999D) , new Double(10.90D));
    }
}
