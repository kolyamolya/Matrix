package com.ModelExcel.Converter;

import java.util.ArrayList;

import com.Matrix.ModelMonthlyReport.Row.RowForTable;
import com.ModelExcel.Cell.AbstractStringCell;
import com.ModelExcel.ExcelSheet.ExcelSheet;
import com.ModelExcel.Interface.InterfaceConvert;

public class Converter implements InterfaceConvert {

	public void convert(ExcelSheet excelSheet) {

		/*
		 * ArrayList<RowForTable> arrayRowForTables;
		 * 
		 * RowForMonthlyReport rowForMonthlyReport = (RowForMonthlyReport)
		 * excelSheet.getRows().get(0); Column nameOrg =
		 * rowForMonthlyReport.getColumns().get(0); ArrayList<AbstractStringCell> column
		 * = nameOrg.getCells();
		 */

	}

	private ArrayList<RowForTable> createRowForTable(ArrayList<AbstractStringCell> column) {

		ArrayList<RowForTable> array = new ArrayList<RowForTable>();

		for (AbstractStringCell cell : column) {

			RowForTable row = new RowForTable();

			array.add(row);

		}

		return null;
	}

}
