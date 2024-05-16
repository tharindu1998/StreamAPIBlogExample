package org.example.stream.data;

import org.example.stream.domian.Customer;
import org.example.stream.domian.Order;
import org.example.stream.domian.Product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class SampleData {
    public static List<Order> getOrders() {
        Customer customer1 = new Customer(1L, "Alice Smith", "alice@example.com");
        Customer customer2 = new Customer(2L, "Bob Johnson", "bob@example.com");

        Product product1 = new Product(1L, "Laptop", new BigDecimal("1200.00"));
        Product product2 = new Product(2L, "Smartphone", new BigDecimal("800.00"));
        Product product3 = new Product(3L, "Tablet", new BigDecimal("600.00"));

        Order order1 = new Order(1L, LocalDate.now().minusDays(2), customer1, Arrays.asList(product1, product3), new BigDecimal("1800.00"));
        Order order2 = new Order(2L, LocalDate.now().minusDays(1), customer2, Arrays.asList(product2), new BigDecimal("800.00"));
        Order order3 = new Order(3L, LocalDate.now(), customer1, Arrays.asList(product1, product2, product3), new BigDecimal("2600.00"));

        return Arrays.asList(order1, order2, order3);
    }
}

