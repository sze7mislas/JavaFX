package javaFXApplication;


import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ViewController implements Initializable {

    @FXML
    private Label label;

    @FXML
    private TableView<?> tabla;

    @FXML
    private TableColumn<?, ?> tablaID;

    @FXML
    private TableColumn<?, ?> tablaVezeteknev;

    @FXML
    private TableColumn<?, ?> tablaKeresztnev;

    @FXML
    private TextField szovegmezoID;

    @FXML
    private TextField szovegmezoKeresztnev;

    @FXML
    private Label szovegmezoVezeteknev;

    @FXML
    void hozzaadGomb(ActionEvent event) {

    }

	@Override
	public void initialize(java.net.URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}    
    
}
