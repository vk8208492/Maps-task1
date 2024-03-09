package app.Output;

import app.Product.Product;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class OutPut {

    public void getOutput(Map<Integer, Product> map){
        System.out.println("\nALL PRODUCTS: ");
        AtomicInteger count = new AtomicInteger(0);
        map.forEach((id, products) ->
                System.out.println(count.incrementAndGet() +
                        ") id " + id + ", " + products));
    }
    public void getOutput(String output){
        System.out.println("\n>>" + output);
    }
}
