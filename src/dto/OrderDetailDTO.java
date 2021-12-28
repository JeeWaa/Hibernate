package dto;

public class OrderDetailDTO {
    private String orderDetailCode;
    private String orderDetailItem;
    private int orderDetailQty;
    private double orderDetailUnitPrice;

    public OrderDetailDTO() {
    }

    public OrderDetailDTO(String orderDetailCode, String orderDetailItem, int orderDetailQty, double orderDetailUnitPrice) {
        this.orderDetailCode = orderDetailCode;
        this.orderDetailItem = orderDetailItem;
        this.orderDetailQty = orderDetailQty;
        this.orderDetailUnitPrice = orderDetailUnitPrice;
    }

    public String getOrderDetailCode() {
        return orderDetailCode;
    }

    public void setOrderDetailCode(String orderDetailCode) {
        this.orderDetailCode = orderDetailCode;
    }

    public String getOrderDetailItem() {
        return orderDetailItem;
    }

    public void setOrderDetailItem(String orderDetailItem) {
        this.orderDetailItem = orderDetailItem;
    }

    public int getOrderDetailQty() {
        return orderDetailQty;
    }

    public void setOrderDetailQty(int orderDetailQty) {
        this.orderDetailQty = orderDetailQty;
    }

    public double getOrderDetailUnitPrice() {
        return orderDetailUnitPrice;
    }

    public void setOrderDetailUnitPrice(double orderDetailUnitPrice) {
        this.orderDetailUnitPrice = orderDetailUnitPrice;
    }

    @Override
    public String toString() {
        return "OrderDetailDTO{" +
                "orderDetailCode='" + orderDetailCode + '\'' +
                ", orderDetailItem='" + orderDetailItem + '\'' +
                ", orderDetailQty=" + orderDetailQty +
                ", orderDetailUnitPrice=" + orderDetailUnitPrice +
                '}';
    }
}
