package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
    @Id
    private String code;
    private String item;
    private double price;
    private int qty;

    public Item() {
    }

    public Item(String code, String item, double price, int qty) {
        this.code = code;
        this.item = item;
        this.price = price;
        this.qty = qty;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Item{" +
                "code='" + code + '\'' +
                ", item='" + item + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
