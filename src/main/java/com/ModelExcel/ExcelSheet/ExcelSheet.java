package com.ModelExcel.ExcelSheet;

import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.Matrix.ModelMonthlyReport.Row.RowForTable;
import com.ModelExcel.Interface.InterfaceCell;
import com.ModelExcel.Interface.InterfaceColumn;
import com.ModelExcel.Interface.InterfaceExcelSheet;
import com.ModelExcel.Interface.InterfaceRow;
import com.ModelExcel.Row.MyRow;

public abstract class ExcelSheet implements InterfaceExcelSheet {

	XSSFSheet sheet;

	private ArrayList<InterfaceRow> rows = new ArrayList<InterfaceRow>();

	private ArrayList<RowForTable> myRows = new ArrayList<RowForTable>();

	public ExcelSheet(XSSFWorkbook workbook, String nameSheet, MyRow row) {
		this.sheet = workbook.getSheet(nameSheet);
		initMyRow();
	}

	/*
	 * public ExcelSheet(XSSFWorkbook workbook, String nameSheet, InterfaceRow row)
	 * { this.sheet = workbook.getSheet(nameSheet); initializationRow(row);
	 * addRow(row); }
	 */

	public XSSFSheet getSheet() {
		return sheet;
	}

	public void setRows(ArrayList<InterfaceRow> rows) {
		this.rows = rows;
	}

	public ArrayList<InterfaceRow> getRows() {
		return rows;
	}

	public void addRow(InterfaceRow row) {
		this.rows.add(row);
	}

	public ArrayList<RowForTable> getMyRows() {
		return myRows;
	}

	void initMyRow() {
		
		
		
		for (Row row : sheet) {
			
			System.out.println(row.getRowNum());
			System.out.print(row == null);
			RowForTable rowForTable = new RowForTable();

			Cell cell_org = row.getCell(rowForTable.getOrganization().getIndex());
			rowForTable.getOrganization().setCell(cell_org);

			Cell cell_cat_sales = row.getCell(rowForTable.getCategorySales().getIndex());
			rowForTable.getCategorySales().setCell(cell_cat_sales);

			Cell get_type_sales_1 = row.getCell(rowForTable.getTypeSales_1().getIndex());
			rowForTable.getTypeSales_1().setCell(get_type_sales_1);

			Cell get_type_sales_2 = row.getCell(rowForTable.getTypeSales_2().getIndex());
			rowForTable.getTypeSales_2().setCell(get_type_sales_2);

			Cell status_auto = row.getCell(rowForTable.getStatusAuto().getIndex());
			rowForTable.getStatusAuto().setCell(status_auto);

			Cell status_client = row.getCell(rowForTable.getStatusClient().getIndex());
			rowForTable.getStatusClient().setCell(status_client);

			Cell type_client = row.getCell(rowForTable.getTypeClient().getIndex());
			rowForTable.getTypeClient().setCell(type_client);

			Cell surn_ko = row.getCell(rowForTable.getSurname_KO().getIndex());
			rowForTable.getSurname_KO().setCell(surn_ko);

			Cell name_ko = row.getCell(rowForTable.getName_KO().getIndex());
			rowForTable.getName_KO().setCell(name_ko);

			Cell midle_ko = row.getCell(rowForTable.getMiddleName_KO().getIndex());
			rowForTable.getMiddleName_KO().setCell(midle_ko);

			Cell surn_vo = row.getCell(rowForTable.getSurname_VO().getIndex());
			rowForTable.getSurname_VO().setCell(surn_vo);

			Cell name_vo = row.getCell(rowForTable.getName_VO().getIndex());
			rowForTable.getName_VO().setCell(name_vo);

			Cell midle_vo = row.getCell(rowForTable.getMiddleName_VO().getIndex());
			rowForTable.getMiddleName_VO().setCell(midle_vo);
			
			Cell vin = row.getCell(rowForTable.getVin().getIndex());
			rowForTable.getVin().setCell(vin);
			
			Cell comment = row.getCell(rowForTable.getComment().getIndex());
			rowForTable.getComment().setCell(comment);
			
			if(rowForTable.getVin().getValue() != "") {
				myRows.add(rowForTable);
			}
			

		}
	}

	public void searchColumn(InterfaceCell cellRow) {
		for (Row row : sheet) {
			for (Cell cells : row) {
				if (cells != null && cells.getCellType() == CellType.STRING) {
					if (cellRow.getName().equals(cells.getStringCellValue())) {
						cellRow.setIndex(cells.getColumnIndex());
					}

				}
			}
		}
	}

	/// *********
	/// ДОДЕЛАТЬ
	/// *********
	public void initializationRow(InterfaceRow row) {
		for (InterfaceColumn column : row.getColumns()) {

			initializationColumn(column);

			for (Row rows : this.sheet) {

				Cell cell = rows.getCell(column.getIndex());

				column.addCells(column.getCell().getStructure(cell));

			}
		}
	}

	public void initializationColumn(InterfaceColumn column) {
		for (Row row : sheet) {
			for (Cell cell : row) {
				if (cell != null && cell.getCellType() == CellType.STRING) {
					if (column.getName().equals(cell.getStringCellValue())) {
						column.setIndex(cell.getColumnIndex());
					}
				}
			}
		}

	}

}
