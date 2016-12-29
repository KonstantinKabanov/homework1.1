package com.till;

import com.till.operations.PurchaseOrder;
import com.till.operations.SaleOrder;
import com.till.stock.Product;
import java.math.BigDecimal;

/**
 * Created by Константин Кабанов on 16.12.2016.
 */
public class Start {
    public static void main (String []args){

        Product enamel = new Product ("эмаль");
        Product pencil = new Product ("карандаш");
        Product varnish = new Product("лак");

        PurchaseOrder PurchaseEnamel =
                new PurchaseOrder(enamel, new BigDecimal(50.25));
        PurchaseOrder PurchasePencil =
                new PurchaseOrder(pencil, new BigDecimal(12.04));
        PurchaseOrder PurchaseVarnish =
                new PurchaseOrder(varnish, new BigDecimal(25.02));

        PurchaseEnamel.execute();
        PurchasePencil.execute();
        PurchaseVarnish.execute();

        SaleOrder SalePencil =
                new SaleOrder(pencil, new BigDecimal(15.04));
        SaleOrder SaleVarnish =
                new SaleOrder(varnish, new BigDecimal(35.02));

        SalePencil.execute();
        SaleVarnish.execute();

        System.out.println(enamel.percent);
        System.out.println(pencil.percent);
        System.out.println(varnish.percent);

    }
}