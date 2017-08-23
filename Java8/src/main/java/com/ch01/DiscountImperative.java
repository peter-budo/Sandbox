package com.ch01;

import java.math.BigDecimal;

public class DiscountImperative {

    public static void main(String[] args) {
        BigDecimal totalOfDiscountedPrices = BigDecimal.ZERO;

        for(BigDecimal price : BigDecimalList.getPrices()) {
            if(price.compareTo(BigDecimal.valueOf(20)) > 0) {
                totalOfDiscountedPrices = totalOfDiscountedPrices.add(price.multiply(BigDecimal.valueOf(0.9)));
            }
        }
        System.out.println("Total of discounted prices: " + totalOfDiscountedPrices);
    }
}
