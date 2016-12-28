package com.till.operations;

import com.till.stock.Product;

/**
 * Created by Костя on 16.12.2016.
 */
public abstract class PurchaseOrder extends Order {

    public Product purchasePrice;
    public void execute(String Product)

    {
        price = purchasePrice;
        purchasePrice = new Product("x");
    }

    PurchaseOrder(String Product) {

    }
}
