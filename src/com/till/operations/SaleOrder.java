package com.till.operations;

import com.till.stock.Product;
import java.math.BigDecimal;


/**
 * Created by Константин Кабанов on 16.12.2016.
 */
public class SaleOrder extends Order {

    public SaleOrder(Product product, BigDecimal price){
        this.product = product;
        this.price = price;
        }

    @Override
    public void execute(){
        product.setSalePrice(price);
    }
}