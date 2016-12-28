package com.till.stock;

import java.math.BigDecimal;

import static java.math.BigDecimal.*;
import static java.math.BigDecimal.valueOf;

/**
 * Created by Костя on 16.12.2016.
 */
public class Product {
    BigDecimal purchasePrice;
    BigDecimal salePrice;
    double percent;
    public Product( int x, int y){
        BigDecimal purchasePrice = BigDecimal.valueOf(valueOf(x));
        BigDecimal salePrice = BigDecimal.valueOf(valueOf(y));
    }

    public Product(String x) {

    }

    double percent() {
        return (valueOf("y")) / valueOf("x") * 100 % -100;
    }

    private int valueOf(Object y) {
        return 0;
    }
}