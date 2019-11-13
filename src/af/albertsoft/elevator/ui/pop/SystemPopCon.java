/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package af.albertsoft.elevator.ui.pop;

import af.albertsoft.elevator.ui.UIFaceContain;
import static af.albertsoft.elevator.ui.pop.ElevatorPopCon.CON_NAME;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class SystemPopCon implements Initializable {

    public static final String CON_NAME="SystemPop_";
    public static final String OPERATE_NEW="New";
    public static final String OPERATE_OPEN="Open";
    public static final String OPERATE_SAVE="Save";
    
    @FXML
    private ChoiceBox<String> operateChoice;
    @FXML
    private TextField NameField;
    @FXML
    private TextField pathField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        UIFaceContain contain = UIFaceContain.getInstance();
        contain.addUI(CON_NAME+"operateChoice",operateChoice);
        contain.addUI(CON_NAME+"NameField",NameField);
        contain.addUI(CON_NAME+"pathField",pathField);
        
        operateChoice.getItems().add(OPERATE_NEW);
        operateChoice.getItems().add(OPERATE_OPEN);
        operateChoice.getItems().add(OPERATE_SAVE);
    }    

    @FXML
    private void Find(ActionEvent event) {
    }

    @FXML
    private void Submit(ActionEvent event) {
    }
    
}