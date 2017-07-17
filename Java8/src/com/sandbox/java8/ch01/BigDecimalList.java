package com.sandbox.java8.ch01;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class BigDecimalList {
    private static  final List<BigDecimal> prices = Arrays.asList(
            new BigDecimal("10"), new BigDecimal("30"), new BigDecimal("17"),
            new BigDecimal("20"), new BigDecimal("15"), new BigDecimal("18"),
            new BigDecimal("45"), new BigDecimal("12")
    );

    public static List<BigDecimal> getPrices() {
        return prices;
    }
}
