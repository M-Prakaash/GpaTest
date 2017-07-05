/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpatable;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Preethi
 */
public class FirstSemesterController implements Initializable {
    @FXML
    private AnchorPane anchor;
    @FXML
    private JFXButton firstbut;
        @FXML
    private JFXTextField txtField;
       @FXML
    private TableView<sqldetailsfirst> tableview;

    @FXML
    private TableColumn<sqldetailsfirst, String> colreg;

    @FXML
    private TableColumn<sqldetailsfirst, String> colname;

    @FXML
    private TableColumn<sqldetailsfirst, String> subone;

    @FXML
    private TableColumn<sqldetailsfirst, String> subject2;

    @FXML
    private TableColumn<sqldetailsfirst, String> subjectthree;
    
    private ObservableList<sqldetailsfirst> data;
    private DbConnect dc;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
          dc = new DbConnect();
    }
    private void initFilter() {
      
        txtField.textProperty().addListener(new InvalidationListener() {

            @Override
            public void invalidated(Observable o) {
                if(txtField.textProperty().get().isEmpty()) {
                    tableview.setItems(data);
                    return;
                }
                ObservableList<sqldetailsfirst> tableItems = FXCollections.observableArrayList();
                ObservableList<TableColumn<sqldetailsfirst, ?>> cols = tableview.getColumns();
                for(int i=0; i<data.size(); i++) {
                    
                    for(int j=0; j<cols.size(); j++) {
                        TableColumn col = cols.get(j);
                        String cellValue = col.getCellData(data.get(i)).toString();
                        cellValue = cellValue.toLowerCase();
                        if(cellValue.contains(txtField.textProperty().get().toLowerCase())) {
                            tableItems.add(data.get(i));
                            break;
                        }                        
                    }

                }
                tableview.setItems(tableItems);
            }
        });
    }
    @FXML
    private void loaddetails(ActionEvent event) {
        try {
            Connection conn = (Connection) dc.Connect();
            data = FXCollections.observableArrayList();
            // Execute query and store result in a resultset
            ResultSet rs = (ResultSet) conn.createStatement().executeQuery("SELECT * FROM decompose.sampletest;");
            while (rs.next()) {
                //get string from db,whichever way
                data.add(new sqldetailsfirst(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
            }

        } catch (SQLException ex) {
            System.err.println("Error" + ex);
        }
        colreg.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getReg()));
        colname.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getOne()));
        subone.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getTwo()));
        subject2.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getThree()));
        subjectthree.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getFour()));
        tableview.setItems(null);
        tableview.setItems(data);

    }
    
}
