package main.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BookStoreMain {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        List<Integer> books = Arrays.asList(1, 1, 2, 2, 3, 4);
        System.out.println(bookStore.calculateBasketCost(books));
    }
}
