package com.till.stock;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Created by Константин Кабанов on 16.12.2016.
 */
public class Product {

    private BigDecimal purchasePrice; // исправил поля
    private BigDecimal salePrice;
    public double percent;
    private String name;

    public Product( String name){
        purchasePrice = BigDecimal.valueOf(0);
        salePrice = BigDecimal.valueOf(0);
        this.name = name;
    }

    public void setPurchasePrice (BigDecimal purchasePrice){
        this.purchasePrice = purchasePrice;
    }

    public void setSalePrice ( BigDecimal salePrice){
        this.salePrice = salePrice;
        recountingPercent();
    }

    private void recountingPercent (){
        percent = salePrice
                .divide(purchasePrice, MathContext.DECIMAL64) // salePrice / purchasePrice
                .multiply(BigDecimal.valueOf(100)) // * 100%
                .subtract(BigDecimal.valueOf(100)) // - 100%
                .doubleValue(); // приведение к даблу
    }
}