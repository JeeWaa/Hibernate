package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class OrderDetail {
    @Id
    private String code;
    private String item;
    private int qty;
    private double unitPrice;

    @ManyToOne
    private Order order;

    public OrderDetail() {
    }

    public OrderDetail(String code, String item, int qty, double unitPrice, Order order) {
        this.code = code;
        this.item = item;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.order = order;
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

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "code='" + code + '\'' +
                ", item='" + item + '\'' +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                ", order=" + order +
                '}';
    }
}
