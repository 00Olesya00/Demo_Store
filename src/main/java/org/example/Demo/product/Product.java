package org.example.Demo.product;

//@Component
//@Scope("prototype")
public class Product {
private int id;
private String nameProduct;
private double price;

    public Product(Integer id, String nameProduct, double price) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "id:" + id + ","+
                " Наименование: " + nameProduct + "," +
                " Цена: " + price ;
    }
}
