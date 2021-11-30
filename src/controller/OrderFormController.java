package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableView;
import javafx.scene.control.Label;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.input.MouseEvent;

public class OrderFormController {
    public Label lblTime;
    public Label lblDate;
    public Label lblOrderId;
    public Label lblTotal;
    public JFXComboBox comCustomerId;
    public JFXTextField txtCustomerId;
    public JFXTextField txtCustomerName;
    public JFXTextField txtCustomerAddress;
    public JFXTextField txtCustomerNumber;
    public JFXComboBox comItemCode;
    public JFXTextField txtItemCode;
    public JFXTextField txtItemName;
    public JFXTextField txtItemPrice;
    public JFXTextField txtItemQty;
    public JFXTextField txtEnterQty;
    public JFXTreeTableView tblCard;
    public TreeTableColumn colCode;
    public TreeTableColumn colItem;
    public TreeTableColumn colUnitPrice;
    public TreeTableColumn colQty;
    public TreeTableColumn coiTotal;
    public JFXButton btnAdd;
    public JFXButton btnDelete;
    public JFXButton btnPlace;
    public JFXButton btnCancel;

    public void addToTable(MouseEvent mouseEvent) {
    }

    public void deleteTableRow(MouseEvent mouseEvent) {
    }

    public void placeOrder(MouseEvent mouseEvent) {
    }

    public void cancelOrderForm(MouseEvent mouseEvent) {
    }
}
