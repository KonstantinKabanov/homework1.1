package com.till.operations;

import com.till.stock.Product;

/**
 * Created by Костя on 16.12.2016.
 */
public abstract class Order {
    Product price;
    String product;
    abstract void execute(Product ProductName);
}
