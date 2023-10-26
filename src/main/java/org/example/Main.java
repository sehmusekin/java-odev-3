package org.example;

import org.example.Category;
import org.example.Order;
import org.example.Product;
import org.example.User;

public class Main {
    public static void main(String[] args) {

        //Kullanıcıları oluştur

        User user1 = new User(1, "Şehmus ", "ekin", "sehmus17@gmil.com");
        User user2 = new User(2, "muhammed ", "kartal", "kartal@gmil.com");
        User user3 = new User(3, "zehra ", "er", "er@gmil.com");
        User user4 = new User(4, "merve ", "kara", "kara@gmil.com");


        //Kategorileri oluştur
        Category category1 = new Category(1, "Telefon ");
        Category category2 = new Category(1, "Telefon ");
        Category category3 = new Category(2, "Bilgisayar ");
        Category category4 = new Category(2, "Bilgisayar ");
        Category category5 = new Category(3, "Tablet ");
        Category category6 = new Category(3, "Tablet ");


        //Ürünleri oluştur
        Product product1 = new Product(1, "Samsung ");
        Product product2 = new Product(1, "Samsung" );
        Product product3 = new Product(2, "Aplle");
        Product product4 = new Product(2, "Aplle");
        Product product5 = new Product(3, "ekin");
        Product product6 = new Product(3, "ekin");


        //Siparişleri oluştur
        Order order1 = new Order(1,  2 );
        Order order2 = new Order(2,  1 );
        Order order3 = new Order(3,  3);
        Order order4 = new Order(3 ,1);


        System.out.println("Kullanıcı: " + user1.getName() + user1.getLastName() +user1.getEmail());
        System.out.println("Kategori: " + category3.getName());
        System.out.println("Ürün: " + product1.getName());
        System.out.println("Sipariş adedi: "  + order4.getQuantity());


    }
}