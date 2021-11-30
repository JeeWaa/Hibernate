package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Order {
    @Id
    private String orderId;
    private String customerId;
    private String time;
    private String date;
    private double total;

    @OneToMany
    private List<OrderDetail> item = new ArrayList<>();

    public Order() {
    }

    public Order(String orderId, String customerId, String time, String date, double total, List<OrderDetail> item) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.time = time;
        this.date = date;
        this.total = total;
        this.item = item;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<OrderDetail> getItem() {
        return item;
    }

    public void setItem(List<OrderDetail> item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", time='" + time + '\'' +
                ", date='" + date + '\'' +
                ", total=" + total +
                ", item=" + item +
                '}';
    }
}
