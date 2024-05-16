package org.example.stream;

import org.example.stream.data.SampleData;
import org.example.stream.domian.Order;
import org.example.stream.domian.Product;

import java.math.BigDecimal;
import java.util.List;

public class StreamExamples {

    //this method will return the total revenue of orders
    public static BigDecimal totalRevenue(List<Order> orders){

        BigDecimal totalRevenue = orders.stream()
                .map(Order::getTotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        return totalRevenue;
    }

    //this method will return the list of all products that were sold

    public static List<Product> getAllProductsSold(List<Order> orders){

        List<Product> productsSold = orders.stream()
                .flatMap(order -> order.getProducts().stream())
                .distinct()
                .toList();

        return productsSold;

    }
    public static void main(String[] args) {

        List<Order> orders = SampleData.getOrders();

        BigDecimal totalRevenue = totalRevenue(orders);
        System.out.println("Total Revenue: " + totalRevenue);

        List<Product> productsSold = getAllProductsSold(orders);
        System.out.println("Products Sold: " + productsSold);



    }
}
