package dto;

public class OrderDTO {
    private String orderID;
    private String orderCustomerId;
    private String orderTime;
    private String orderDate;
    private double orderTotal;

    public OrderDTO() {
    }

    public OrderDTO(String orderID, String orderCustomerId, String orderTime, String orderDate, double orderTotal) {
        this.orderID = orderID;
        this.orderCustomerId = orderCustomerId;
        this.orderTime = orderTime;
        this.orderDate = orderDate;
        this.orderTotal = orderTotal;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getOrderCustomerId() {
        return orderCustomerId;
    }

    public void setOrderCustomerId(String orderCustomerId) {
        this.orderCustomerId = orderCustomerId;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "orderID='" + orderID + '\'' +
                ", orderCustomerId='" + orderCustomerId + '\'' +
                ", orderTime='" + orderTime + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", orderTotal=" + orderTotal +
                '}';
    }
}
