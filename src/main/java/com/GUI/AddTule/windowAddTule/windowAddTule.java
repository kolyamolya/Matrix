package com.GUI.AddTule.windowAddTule;

import java.net.URL;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.ResourceBundle;

import com.GUI.AddTule.AddTule;
import com.Matrix.ModelMonthlyReport.Row.RowCheck;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.Window;

public class windowAddTule {

	@FXML
	private ChoiceBox<String> surname_ko_choiceBox;

	ObservableList<String> surname_ko_Array = FXCollections.observableArrayList("Заполнено", "");

	@FXML
	private ChoiceBox<String> statusClient_choiceBox;

	ObservableList<String> statusClient_choiceBox_Array = FXCollections.observableArrayList("Владелец", "Водитель", "");

	@FXML
	private ChoiceBox<String> surname_vo_choiceBox;

	ObservableList<String> surname_vo_Array = FXCollections.observableArrayList("Заполнено", "");

	@FXML
	private ChoiceBox<String> status_auto_choiceBox;

	ObservableList<String> status_auto_Array = FXCollections.observableArrayList("Новый", "Продажа предрапорта", "С пробегом");

	@FXML
	private ChoiceBox<String> typeSales_1_choiceBox;

	ObservableList<String> typeSales_1_Array = FXCollections.observableArrayList("Предрапорт", "Демо", "Подменный", "Флит", "Лизинг", "");

	@FXML
	private ChoiceBox<String> typeSales_2_choiceBox;

	ObservableList<String> typeSales_2_Array = FXCollections.observableArrayList("Флит", "Лизинг", "");

	@FXML
	private ChoiceBox<String> categorySales_choiceBox;

	ObservableList<String> categorySales_Array = FXCollections.observableArrayList("A", "A1", "A2", "B", "C", "D", "E", "F", "G", "P", "V", "");

	@FXML
	private ChoiceBox<String> type_client_choiceBox;

	ObservableList<String> type_client_Array = FXCollections.observableArrayList("Лизингодатель", "Лизингополучатель", "");

	@FXML
	private ChoiceBox<String> typeOrganizationChoiceBox;

	ObservableList<String> typeOrganizationArray = FXCollections.observableArrayList("Дилер", "Организация", "Лизинг", "");

	@FXML
	private Button buttonAddRecord;

	@FXML
	private VBox panelAddTule;

	RowCheck rowCheck;

	@FXML
	void initialize() {

		typeOrganizationChoiceBox.setItems(typeOrganizationArray);
		surname_ko_choiceBox.setItems(surname_ko_Array);
		statusClient_choiceBox.setItems(statusClient_choiceBox_Array);
		surname_vo_choiceBox.setItems(surname_vo_Array);
		status_auto_choiceBox.setItems(status_auto_Array);
		typeSales_1_choiceBox.setItems(typeSales_1_Array);
		typeSales_2_choiceBox.setItems(typeSales_2_Array);
		categorySales_choiceBox.setItems(categorySales_Array);
		type_client_choiceBox.setItems(type_client_Array);

	}

	public void setRowCheck(RowCheck rowCheck) {

		if (rowCheck == null) {
			return;
		}
		this.rowCheck = rowCheck;

	}

	@FXML
	void addRecord(ActionEvent event) {

		rowCheck.getOrganization().setStatusOrganization(typeOrganizationChoiceBox.getValue());
		rowCheck.getSurname_KO().setValue(surname_ko_choiceBox.getValue());
		rowCheck.getStatusClient().setValue(statusClient_choiceBox.getValue());
		rowCheck.getSurname_VO().setValue(surname_vo_choiceBox.getValue());
		rowCheck.getStatusAuto().setValue(status_auto_choiceBox.getValue());
		rowCheck.getTypeSales_1().setValue(typeSales_1_choiceBox.getValue());
		rowCheck.getTypeSales_2().setValue(typeSales_2_choiceBox.getValue());
		rowCheck.getCategorySales().setValue(categorySales_choiceBox.getValue());
		rowCheck.getTypeClient().setValue(type_client_choiceBox.getValue());

		close(event);
	}

	void close(ActionEvent event) {
		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.close();

	}

	public RowCheck getRowCheck() {
		return rowCheck;
	}

}
