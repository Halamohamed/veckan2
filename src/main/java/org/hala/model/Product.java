package org.hala.model;

import java.util.Objects;

public class Product {
    private int productId;
    private String productName;
    private String description;
    private double price;

    /**
     *
     * @param productId unique id
     * @param productName non null please
     * @param description nullable
     * @param price greater than 0
     * @throws IllegalArgumentException when productName is null or price is equal or lower than 0
     */
    public Product(int productId, String productName, String description, double price) throws IllegalArgumentException{
        this.productId = productId;
        setProductName(productName);
        setDescription(description);
        setPrice(price);
    }

    public int getProductId(){
        return productId;
    }

    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName) throws IllegalArgumentException{
        if(productName == null) throw new IllegalArgumentException("Invalid productName: " + null);
       this.productName = productName;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        if(price <= 0){
            throw new IllegalArgumentException("Invalid price, need to be above 0 was: " + price);
        }
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId &&
                Double.compare(product.price, price) == 0 &&
                productName.equals(product.productName) &&
                Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, description, price);
    }
}
