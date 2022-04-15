package it.polito.tdp.Yelp;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.Yelp.model.Business;
import it.polito.tdp.Yelp.model.Model;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class FXMLController {
	
	private Model model ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Business, String> colName;

    @FXML
    private TableColumn<Business, Double> colStars;

    @FXML
    private TableView<Business> tblBusiness;

    @FXML
    void handleLoadData(ActionEvent event) {
    	tblBusiness.setItems(FXCollections.observableArrayList(model.getBusinesses()));
    }
    
    public void setModel(Model m) {
    	this.model = m ;
    }

    @FXML
    void initialize() {
        assert colName != null : "fx:id=\"colName\" was not injected: check your FXML file 'Scene.fxml'.";
        assert colStars != null : "fx:id=\"colStars\" was not injected: check your FXML file 'Scene.fxml'.";
        assert tblBusiness != null : "fx:id=\"tblBusiness\" was not injected: check your FXML file 'Scene.fxml'.";

        colName.setCellValueFactory(new PropertyValueFactory<Business,String>("businessName"));
        colStars.setCellValueFactory(new PropertyValueFactory<Business,Double>("stars"));
    }

}