package view.table;

public class CardTable {
    private String code;
    private String item;
    private double unitPrice;
    private int qty;
    private double total;

    public CardTable() {
    }

    public CardTable(String code, String item, double unitPrice, int qty, double total) {
        this.code = code;
        this.item = item;
        this.unitPrice = unitPrice;
        this.qty = qty;
        this.total = total;
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

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "CardTable{" +
                "code='" + code + '\'' +
                ", item='" + item + '\'' +
                ", unitPrice=" + unitPrice +
                ", qty=" + qty +
                ", total=" + total +
                '}';
    }
}
