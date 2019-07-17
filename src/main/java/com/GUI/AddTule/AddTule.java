package com.GUI.AddTule;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.GUI.AddTule.windowAddTule.windowAddTule;
import com.Matrix.ModelMonthlyReport.CollectionRowCheck.CollectionRowCheck;
import com.Matrix.ModelMonthlyReport.Row.RowCheck;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ListChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AddTule {

	CollectionRowCheck collectionRowCheck = new CollectionRowCheck();

	@FXML
	public TableView<RowCheck> tableRule;

	@FXML
	private TableColumn<RowCheck, String> typeOrganization_column;

	@FXML
	private TableColumn<RowCheck, String> surname_ko_column;

	@FXML
	private TableColumn<RowCheck, String> status_clienta_column;

	@FXML
	private TableColumn<RowCheck, String> surname_vo_column;

	@FXML
	private TableColumn<RowCheck, String> status_auto_column;

	@FXML
	private TableColumn<RowCheck, String> type_sales_1_column;

	@FXML
	private TableColumn<RowCheck, String> type_sales_2_column;

	@FXML
	private TableColumn<RowCheck, String> category_sales_column;

	@FXML
	private TableColumn<RowCheck, String> type_client_column;

	public Stage stageWindow;
	windowAddTule windoadd;
	public Parent parent;

	public CollectionRowCheck getCollectionRowCheck() {
		return collectionRowCheck;
	}

	public void setCollectionRowCheck(CollectionRowCheck collectionRowCheck) {
		this.collectionRowCheck = collectionRowCheck;
	}

	@FXML
	void initialize() {

		typeOrganization_column.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getOrganization().getStatusOrganization()));
		surname_ko_column.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getSurname_KO().getValue()));
		status_clienta_column.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getStatusClient().getValue()));
		surname_vo_column.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getSurname_VO().getValue()));
		status_auto_column.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getStatusAuto().getValue()));
		type_sales_1_column.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTypeSales_1().getValue()));
		type_sales_2_column.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTypeSales_2().getValue()));
		category_sales_column.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCategorySales().getValue()));
		type_client_column.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTypeClient().getValue()));
		tableRule.setItems(collectionRowCheck.getRowCheckList());
		initL();
	}

	public void ActionAddRule(ActionEvent event) {
		Object source = event.getSource();

		// если нажата не кнопка - выходим из метода
		if (!(source instanceof Button)) {
			return;
		}

		Button clickedButton = (Button) source;

		switch (clickedButton.getId()) {
		case "addRule":
			windoadd.setRowCheck(new RowCheck());
			showDialog();
			collectionRowCheck.add(windoadd.getRowCheck());
			break;
		case "deleteRule":
			collectionRowCheck.delete(tableRule.getSelectionModel().getSelectedItem());
			break;
		case "exportRule":
			saveTable();
			break;
		case "importRule":
			importRule();
			break;
		}
	}

	private void initL() {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/com/GUI/AddTule/windowAddTule/windowAddTule.fxml"));

		try {
			loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}

		parent = loader.getRoot();

		windoadd = loader.getController();
	}

	private void showDialog() {
		if (stageWindow == null) {
			stageWindow = new Stage();
			stageWindow.setScene(new Scene(parent));
			stageWindow.initModality(Modality.APPLICATION_MODAL);
		}
		stageWindow.showAndWait();
	}

	private void saveTable() {
		FileChooser fileChooser = new FileChooser();
		// Set extension filter for text files
		FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Table files (*.trc)", "*.trc");
		fileChooser.getExtensionFilters().add(extFilter);

		File file = fileChooser.showSaveDialog(stageWindow);
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(new ArrayList<>(collectionRowCheck.getRowCheckList()));
			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void importRule() {
		FileChooser fileChooser = new FileChooser();
		// Set extension filter for text files
		FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Table files (*.trc)", "*.trc");
		fileChooser.getExtensionFilters().add(extFilter);
		
		File file = fileChooser.showOpenDialog(stageWindow);
		if(file != null) {
			try {
				FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis);
				collectionRowCheck.setRowCheckList((ArrayList<RowCheck>) ois.readObject());
				initialize();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void initListeners() {

		collectionRowCheck.getRowCheckList().addListener(new ListChangeListener<RowCheck>() {
			@Override
			public void onChanged(Change<? extends RowCheck> c) {

			}
		});
	}

}
