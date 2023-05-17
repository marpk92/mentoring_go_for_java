package pl.gfjg;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        var lenovo = new Product("Lenovo2", 2000L);
        var hp = new Product("HP2", 3000L);

        var notebooks = List.of(lenovo, hp);

        for (var notebook : notebooks) {
            System.out.println(notebook.price);
        }
    }

}

class Product {
    public final String name;
    public final Long price;

    Product(String name, Long price) {
        this.name = name;
        this.price = price;
    }
}