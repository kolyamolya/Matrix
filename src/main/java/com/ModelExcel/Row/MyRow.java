package com.ModelExcel.Row;

import java.util.ArrayList;

import com.ModelExcel.Interface.InterfaceColumn;
import com.ModelExcel.Interface.InterfaceRow;

public abstract class MyRow implements InterfaceRow {
	
	
	private ArrayList<InterfaceColumn> columns = new ArrayList<InterfaceColumn>();
	
		
	public void addColumn(InterfaceColumn column) {
		this.columns.add(column);
	}

	public ArrayList<InterfaceColumn> getColumns() {
		return columns;
	}

	public void setColumns(ArrayList<InterfaceColumn> columns) {
		this.columns = columns;
	}
	
	public InterfaceColumn getColumn(InterfaceColumn nameColumn) {
		return columns.get(columns.indexOf(nameColumn));
	}
		
	public InterfaceColumn getColumn(int index) {
		return columns.get(index);
	}
	
	
	
	
}
