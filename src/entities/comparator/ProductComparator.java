package entities.comparator;

import entities.order.Product;

import java.util.Objects;

public class ProductComparator implements Comparable<ProductComparator> {

    private String name;
    private Double price;

    public ProductComparator(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }

    @Override
    public int compareTo(ProductComparator o) {
        return 0;
    }
}