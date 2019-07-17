package com.Matrix.ModelMonthlyReport.Excel;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.Matrix.ModelMonthlyReport.Row.RowForMonthlyReport;
import com.ModelExcel.ExcelSheet.ExcelSheet;
import com.ModelExcel.Interface.InterfaceRow;
import com.ModelExcel.Row.MyRow;

public class ExcelMothly extends ExcelSheet {

	public ExcelMothly(XSSFWorkbook workbook, String nameSheet, MyRow row) {
		super(workbook, nameSheet, row);
		// TODO Auto-generated constructor stub
	}
		
}
