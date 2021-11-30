package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableView;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.input.MouseEvent;

public class ManageItemFormController {
    public JFXTextField txtItemCode;
    public JFXTextField txtItemName;
    public JFXTextField txtItemPrice;
    public JFXTextField txtItemQty;
    public JFXTreeTableView tblItem;
    public TreeTableColumn colItemCode;
    public TreeTableColumn colItemName;
    public TreeTableColumn colItemPrice;
    public TreeTableColumn colItemQty;
    public JFXButton btnSave;
    public JFXButton btnUpdate;
    public JFXButton btnDelete;
    public JFXButton btnCancel;

    public void saveItem(MouseEvent mouseEvent) {
    }

    public void updateItem(MouseEvent mouseEvent) {
    }

    public void deleteItem(MouseEvent mouseEvent) {
    }

    public void cancelItemForm(MouseEvent mouseEvent) {
    }
}
