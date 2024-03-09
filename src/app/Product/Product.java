package app.Product;

import java.util.Objects;

public class Product {

    String name;
    int amounts;
    int prices;

    public Product(String name, int amounts, int prices) {
        this.name = name;
        this.amounts = amounts;
        this.prices = prices;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(amounts, product.amounts) &&
                Objects.equals(prices, product.prices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amounts, prices);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", amount='" + amounts + '\'' +
                ", price='" + prices + '\'' +
                '}';
    }
}
