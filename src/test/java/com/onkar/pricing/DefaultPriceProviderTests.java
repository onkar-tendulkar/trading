package com.onkar.pricing;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class DefaultPriceProviderTests {


    @Test
    protected void getPrice() {
        DefaultPriceProvider provider = new DefaultPriceProvider();
        Assert.assertEquals(0,provider.getPrice(),0);
    }
}
