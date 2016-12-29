package com.till.operations;

import com.till.stock.Product;
import java.math.BigDecimal;

/**
 * Created by Константин Кабанов on 16.12.2016.
 */
public abstract class Order {
    protected BigDecimal price;
    protected Product product;

    public abstract void execute();
}
