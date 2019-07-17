package com.ModelExcel.Interface;

import java.util.ArrayList;

public interface InterfaceRow {
	
	
	public ArrayList<InterfaceColumn> getColumns();
	
	public void addColumn(InterfaceColumn column);
	
	public InterfaceColumn getColumn(InterfaceColumn nameColumn);
	public InterfaceColumn getColumn(int index);
	
	
}
