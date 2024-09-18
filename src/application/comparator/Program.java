package application.comparator;

import entities.comparator.ProductComparator;
import entities.order.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<ProductComparator> list = new ArrayList<>();

        list.add(new ProductComparator("TV", 900.00));
        list.add(new ProductComparator("Notebook", 1200.00));
        list.add(new ProductComparator("Tablet", 450.00));

        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (ProductComparator p : list) {
            System.out.println(p);
        }
    }
}