package com.ch01;

import java.math.BigDecimal;
import java.util.List;

public class DiscountFunctional {

    public static void main(String[] args) {
        List<BigDecimal> prices = BigDecimalList.getPrices();
        final BigDecimal totalOfDiscountedPrices = prices.stream()
                .filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0)
                .map(price -> price.multiply(BigDecimal.valueOf(0.9)))
                .reduce(BigDecimal.ZERO, BigDecimal ::add);

        System.out.println("Total of discounted prices: " + totalOfDiscountedPrices);
    }
}
