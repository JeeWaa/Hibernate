package controller;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class DashBoardFormController {
    public JFXButton btnCustomerId;
    public JFXButton btnItemId;
    public JFXButton btnOrderId;

    public void mouseClick(MouseEvent mouseEvent) throws IOException {
        if(mouseEvent.getSource() instanceof JFXButton){
            JFXButton jfxButton = (JFXButton) mouseEvent.getSource();

            Parent root = null;

            switch (jfxButton.getId()){
                case "btnCustomerId":
                    root = FXMLLoader.load(this.getClass().getResource("../view/ManageCustomerForm.fxml"));
                    break;
                case "btnItemId":
                    root = FXMLLoader.load(this.getClass().getResource("../view/ManageItemForm.fxml"));
                    break;
                case "btnOrderId":
                    root = FXMLLoader.load(this.getClass().getResource("../view/OrderForm.fxml"));
                    break;
            }

            if(root != null){
                Parent load = root;
                Scene scene = new Scene(load);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
            }
        }
    }
}
