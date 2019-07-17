package com.GUI.Windows;

import java.awt.Window.Type;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

import java.util.ResourceBundle;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.GUI.AddTule.AddTule;
import com.Matrix.ModelMonthlyReport.Cell.StatusAuto;
import com.Matrix.ModelMonthlyReport.Cell.TypeClient;
import com.Matrix.ModelMonthlyReport.Cell.TypeSales;
import com.Matrix.ModelMonthlyReport.CollectionRowCheck.CollectionRowCheck;
import com.Matrix.ModelMonthlyReport.Excel.ExcelMothly;
import com.Matrix.ModelMonthlyReport.LogicCheck.Logic;
import com.Matrix.ModelMonthlyReport.Row.RowCheck;
import com.Matrix.ModelMonthlyReport.Row.RowForTable;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainWindowController {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private Button exportResult;

	@FXML
	private Button startCheck;

	@FXML
	private TableView<RowForTable> tableCell;

	@FXML
	private TableColumn<RowForTable, String> statusCheck;

	@FXML
	private TableColumn<RowForTable, String> typeOrganization;

	@FXML
	private TableColumn<RowForTable, String> valueOrganization;

	@FXML
	private TableColumn<RowForTable, String> surname_KO;

	@FXML
	private TableColumn<RowForTable, String> name_KO;

	@FXML
	private TableColumn<RowForTable, String> middleName_KO;

	@FXML
	private TableColumn<RowForTable, String> statucClient;

	@FXML
	private TableColumn<RowForTable, String> surname_VO;

	@FXML
	private TableColumn<RowForTable, String> name_VO;

	@FXML
	private TableColumn<RowForTable, String> middleName_VO;

	@FXML
	private TableColumn<RowForTable, String> statuAuto;

	@FXML
	private TableColumn<RowForTable, String> typeSales_1;

	@FXML
	private TableColumn<RowForTable, String> typeSales_2;

	@FXML
	private TableColumn<RowForTable, String> categorySales;

	@FXML
	private TableColumn<RowForTable, String> typeClient;

	@FXML
	private TableColumn<RowForTable, String> explanation;

	@FXML
	private MenuItem fileChosser;

	@FXML
	private MenuItem buttonNewRule;

	CollectionRowCheck collectionRowCheck;
	XSSFWorkbook workbook;
	ExcelMothly excel;

	File fileSelecred;

	ObservableList<RowForTable> myRows;
	FXMLLoader loader = new FXMLLoader();
	public Stage stageWindow;
	public AddTule addTule;
	public Parent parent;

	@FXML
	void initialize() {
		try {
			initAddTule();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		tableCell.setEditable(true);

		typeOrganization.setCellFactory(TextFieldTableCell.<RowForTable>forTableColumn());
		typeOrganization.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<RowForTable, String>>() {

			@Override
			public void handle(CellEditEvent<RowForTable, String> event) {

				RowForTable rowForTabel = myRows.get(event.getTablePosition().getRow());
				rowForTabel.getOrganization().setStatusOrganization(event.getNewValue());

			}
		});

	}

	public void getFile(ActionEvent event) {

		FileChooser fielChooser = new FileChooser();

		FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Excel файл (*.xlsx)", "*.xlsx");

		fielChooser.setTitle("Выберите ЕОП");

		fielChooser.getExtensionFilters().add(extFilter);

		fileSelecred = fielChooser.showOpenDialog(null);

		FileInputStream fos = null;
		try {
			fos = new FileInputStream(fileSelecred);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			workbook = new XSSFWorkbook(fos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		RowForTable rowMonthlyReport = new RowForTable();

		excel = new ExcelMothly(workbook, "Корпоративные продажи", rowMonthlyReport);

		myRows = FXCollections.observableArrayList(excel.getMyRows());

		countVin();
		addData();

	}

	@FXML
	public void onEditTypeOrganization(CellEditEvent<RowForTable, String> event) {
		event.getTableView().getItems().get(event.getTablePosition().getRow()).getOrganization().setStatusOrganization(event.getNewValue());
	}

	public void closeProgramme(ActionEvent event) {
		System.exit(0);
	}

	public void openNewRule(ActionEvent event) throws Exception {
		showAddTule();
	}

	@FXML
	void startCheckMethod(ActionEvent event) {
		collectionRowCheck = addTule.getCollectionRowCheck();
		System.out.println(collectionRowCheck.getRowCheckList().size());

		Logic logic = new Logic();

		for (RowCheck check : collectionRowCheck.getRowCheckList()) {

			for (RowForTable value : myRows) {

				if (logic.checkMatrix(value, check)) {
					value.getStatusConformity().setValue("Соответствует");
				}

				logic.checkCount(value);
			}
		}

		statusCheck.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getStatusConformity().getValue()));
		addData();
	}

	private void showAddTule() {
		if (stageWindow == null) {
			stageWindow = new Stage();
			stageWindow.setScene(new Scene(parent));
			stageWindow.initModality(Modality.APPLICATION_MODAL);
		}
		stageWindow.showAndWait();
	}

	private void initAddTule() throws IOException {

		loader.setLocation(getClass().getResource("/com/GUI/AddTule/AddTule.fxml"));

		loader.load();

		parent = loader.getRoot();
		addTule = loader.getController();
	}

	private void addData() {
		typeOrganization.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getOrganization().getStatusOrganization()));
		valueOrganization.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getOrganization().getValue()));
		categorySales.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCategorySales().getValue()));
		typeSales_1.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTypeSales_1().getValue()));
		typeSales_2.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTypeSales_2().getValue()));
		statuAuto.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getStatusAuto().getValue()));
		statucClient.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getStatusClient().getValue()));
		typeClient.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTypeClient().getValue()));
		surname_KO.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getSurname_KO().getValue()));
		name_KO.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getName_KO().getValue()));
		middleName_KO.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMiddleName_KO().getValue()));
		surname_VO.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getSurname_VO().getValue()));
		name_VO.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getName_VO().getValue()));
		middleName_VO.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMiddleName_VO().getValue()));

		tableCell.setItems(myRows);
	}

	@FXML
	void exportResultMethod(ActionEvent event) throws IOException {
		
		int lastRow = excel.getSheet().getRow(3).getLastCellNum();

		for (RowForTable value : myRows) {
			for (Row row : excel.getSheet()) {
				Cell cell = row.getCell(value.getVin().getIndex());

				if (cell != null) {
					if (cell.getStringCellValue().equals(value.getVin().getValue())) {
						Cell cellValue = row.createCell(lastRow);
						cellValue.setCellValue(value.getStatusConformity().getValue());
					}
				}

			}
		}

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					FileOutputStream fos = new FileOutputStream(fileSelecred);
					workbook.write(fos);
					workbook.close();
					fos.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		thread.start();

	}

	private void countVin() {
		for (RowForTable row : excel.getMyRows()) {
			String VIN = row.getVin().getValue();
			int count = 0;

			if (row.getStatusAuto().getStructure() instanceof StatusAuto.New && row.getTypeSales_1().getStructure() instanceof TypeSales.Leasing) {
				for (RowForTable row2 : excel.getMyRows()) {
					if (VIN.equals(row2.getVin().getValue())) {
						count++;
					}
				}
				row.getCountVin().setCount(count);
			}

		}
		for (RowForTable row : excel.getMyRows()) {
			String VIN = row.getVin().getValue();
			int count = 0;

			if (row.getStatusAuto().getStructure() instanceof StatusAuto.SalesOfPredorport && row.getTypeSales_2().getStructure() instanceof TypeSales.Leasing && row.getTypeClient().getStructure() instanceof TypeClient.Lessor) {
				for (RowForTable row2 : excel.getMyRows()) {
					if (VIN.equals(row2.getVin().getValue())) {
						count++;
					}
				}
				row.getCountVin().setCount(count);
			}

		}

		for (RowForTable row : excel.getMyRows()) {
			String VIN = row.getVin().getValue();
			int count = 0;

			if (row.getStatusAuto().getStructure() instanceof StatusAuto.UsedCar && row.getTypeSales_2().getStructure() instanceof TypeSales.Leasing && row.getTypeClient().getStructure() instanceof TypeClient.Lessor) {
				for (RowForTable row2 : excel.getMyRows()) {
					if (VIN.equals(row2.getVin().getValue())) {
						count++;
					}
				}
				row.getCountVin().setCount(count);
			}
		}

	}

}
