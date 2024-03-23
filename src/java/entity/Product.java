/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class Product {

    private int product_id;
    private int category_id;
    private String name;
    private String color;
    private int quantity;
    private double price;
    private int total_sales;
    private String description;

    public Product() {
    }

    public Product(int product_id, int category_id, String name, String color, int quantity, double price, int total_sales, String description) {
        this.product_id = product_id;
        this.category_id = category_id;
        this.name = name;
        this.color = color;
        this.quantity = quantity;
        this.price = price;
        this.total_sales = total_sales;
        this.description = description;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTotal_sales() {
        return total_sales;
    }

    public void setTotal_sales(int total_sales) {
        this.total_sales = total_sales;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" + "product_id=" + product_id + ", category_id=" + category_id + ", name=" + name + ", color=" + color + ", quantity=" + quantity + ", price=" + price + ", total_sales=" + total_sales + ", description=" + description + '}';
    }

}
