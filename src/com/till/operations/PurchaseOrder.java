package com.till.operations;

import com.till.stock.Product;
import java.math.BigDecimal;

/**
 * Created by Константин Кабанов on 16.12.2016.
 */
public class PurchaseOrder extends Order {

    public PurchaseOrder(Product product, BigDecimal price) {    // конструктор
        this.product = product;
        this.price = price;

    }
    @Override
    public void execute(){
        product.setPurchasePrice(price);
    }
}
