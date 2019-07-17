package com.ModelExcel.Interface;


import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;

public interface InterfaceExcelSheet {
	
	public XSSFSheet getSheet();
	
	public ArrayList<InterfaceRow> getRows();
	public void setRows(ArrayList<InterfaceRow> rows);
	
	public void initializationRow(InterfaceRow row);
	
	public void initializationColumn(InterfaceColumn column);
	
	public void addRow(InterfaceRow row);
	
	public void searchColumn(InterfaceCell cell);
	
}
