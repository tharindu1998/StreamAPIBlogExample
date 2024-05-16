package org.example.stream.domian;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Order {
    private Long id;
    private LocalDate date;
    private Customer customer;
    private List<Product> products;
    private BigDecimal total;

    public Order(Long id, LocalDate date, Customer customer, List<Product> products, BigDecimal total) {
        this.id = id;
        this.date = date;
        this.customer = customer;
        this.products = products;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + date +
                ", customer=" + customer +
                ", products=" + products +
                ", total=" + total +
                '}';
    }
}